# Morningstar.in Automation Framework

This is a Selenium WebDriver-based test automation framework for validating the Morningstar.in website, specifically focusing on the Investment Conference registration flow. The framework is built using Java, TestNG, and follows the Page Object Model (POM) design pattern.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Test Cases](#test-cases)
- [Reporting](#reporting)
- [Framework Design](#framework-design)
- [Best Practices](#best-practices)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

## Features

- **End-to-End Testing**: Validates the complete user journey from homepage to successful registration
- **Modular Design**: Follows Page Object Model (POM) pattern for better maintainability
- **Data-Driven Testing**: Supports parameterized tests using TestNG DataProvider
- **Extensive Logging**: Detailed logging for better test debugging
- **Cross-Browser Support**: Configurable to run on different browsers
- **Extent Reports**: Comprehensive HTML reports with screenshots for failed tests

## Prerequisites

- Java JDK 11 or higher
- Maven 3.6.0 or higher
- Chrome/Firefox browser (latest version)
- ChromeDriver/GeckoDriver (compatible with your browser version)
- TestNG
- Selenium WebDriver 4.0.0 or higher

## Project Structure

```
src/test/java/web_automation/morningstar/
├── base/                 # Base test classes and configurations
│   └── TestBase.java     # Common test setup and teardown
├── pages/                # Page Object Model classes
│   ├── HomePage.java
│   ├── EventRegistration.java
│   ├── TermsAndConditions.java
│   ├── Summary.java
│   └── AdvertisementPage.java
├── tests/                # Test case classes
│   └── TC_InvestmentConferenceRegister.java
├── utils/                # Utility classes
│   └── MorningstarDataProvider.java
└── resources/            # Test data and configurations
    ├── config.properties
    └── testdata/
```

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd qa_project
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Configure browser drivers**
   - Download ChromeDriver/GeckoDriver
   - Add the driver location to your system PATH or specify the path in `config.properties`

4. **Update configuration**
   - Edit `src/test/resources/config.properties` to set:
     - Browser type (chrome/firefox)
     - Application URL
     - Timeout values
     - Test data paths

## Running Tests

### Run all tests
```bash
mvn clean test
```

### Run specific test suite
```bash
mvn test -DsuiteXmlFile=testng.xml
```

### Run with specific browser
```bash
mvn test -Dbrowser=firefox
```

## Test Cases

The framework includes the following test scenarios:

1. **Home Page Validation**
   - Verify page title
   - Verify main navigation elements
   - Verify advertisement banners

2. **Event Registration Flow**
   - Navigate to registration page
   - Fill personal information
   - Accept terms and conditions
   - Complete registration
   - Verify registration confirmation

## Reporting

Test execution generates detailed HTML reports in the `test-output/` directory:
- `ExtentReport.html`: Comprehensive test report with screenshots
- `testng-results.xml`: TestNG execution report

## Framework Design

### Page Object Model (POM)
- Each page has its own class containing web elements and methods
- Page classes extend `TestBase` for common functionality
- PageFactory is used for element initialization

### Test Base Class
- Handles WebDriver initialization and cleanup
- Provides common utility methods
- Manages test configuration

### Utilities
- `MorningstarDataProvider`: Supplies test data to test methods
- `CommonTestBase`: Contains reusable test methods and assertions

## Best Practices

1. **Page Object Model**: Follows POM design pattern
2. **Separation of Concerns**: Test logic separated from page objects
3. **Reusable Methods**: Common actions wrapped in utility methods
4. **Meaningful Logging**: Detailed logging for debugging
5. **Exception Handling**: Robust error handling and reporting

## Troubleshooting

Common issues and solutions:

1. **Element Not Found**
   - Verify element locators in page classes
   - Add explicit waits for dynamic elements

2. **Browser Compatibility**
   - Ensure browser and WebDriver versions are compatible
   - Update browser to latest version

3. **Test Failures**
   - Check test data validity
   - Verify application state before test execution

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Write tests for your changes
5. Submit a pull request

## License

This project is for educational and demonstration purposes only.
