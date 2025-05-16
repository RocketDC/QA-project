# CitiusTech Web Automation Project

This project contains automated test scripts for the CitiusTech website, focusing on the Contact Us page and homepage functionality.

## Project Overview

This is a Selenium-based web automation project that automates the following:
1. Landing on the CitiusTech homepage
2. Navigation to the Contact Us page
3. Various interactions and validations on both pages

## Project Structure

```
src/test/java/
├── web_automation/
│   ├── citiusTech/
│   │   ├── base/           # Base test classes
│   │   ├── pages/          # Page Object Model implementations
│   │   └── tests/          # Test cases
│   └── commons/            # Common utilities and base classes
├── config/                 # Configuration files
└── reports/               # Test execution reports
```

## Prerequisites

- Java JDK 8 or higher
- Maven 3.6 or higher
- Chrome browser
- ChromeDriver (automatically managed via WebDriverManager)

## Setup Instructions

1. Clone the repository
2. Install dependencies:
   ```bash
   mvn clean install
   ```
3. Run tests:
   ```bash
   mvn test
   ```

## Features

- Page Object Model (POM) design pattern
- ExtentReports for detailed test reporting
- Self-healing capabilities using Healium
- Comprehensive logging system
- Chrome browser automation
- Test data management

## Key Components

### Base Classes
- `TestBase`: Core test base class with setup and teardown
- `CommonTestBase`: Common utilities and methods

### Pages
- `HomePage`: Handles homepage interactions
- `ContactUsPage`: Handles contact us page interactions

### Test Cases
- Homepage navigation
- Contact form validation
- UI element verification
- Form submission testing

## Reports

Test execution reports are generated in the `reports` directory. The reports include:
- Detailed test execution status
- Screenshots of failures
- Performance metrics
- Browser logs

## Configuration

The project uses configuration files located in the `config` directory:
- `QA.properties`: Contains environment-specific configurations

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.
