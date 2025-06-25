# CitiusTech Web Automation Project

This is a Selenium-based web automation project that tests the CitiusTech website, specifically focusing on the navigation from the homepage to the contact us page and validating all fields on the contact form.

## Project Overview

The automation framework is designed to:
1. Navigate from the CitiusTech homepage (https://www.citiustech.com/)
2. Navigate to the Contact Us page (https://www.citiustech.com/contact-us)
3. Validate all form fields on the contact page
4. Perform comprehensive testing of the contact form functionality

## Project Structure

```
src/test/java/web_automation/citiusTech/
├── base/           # Contains base test classes and configurations
├── pages/          # Page Object Model classes
├── tests/          # Test case classes
└── utils/          # Utility classes and helper methods
```

## Key Features

- TestNG framework for test management and execution
- Page Object Model (POM) design pattern implementation
- Selenium WebDriver for browser automation
- Comprehensive test coverage of contact form fields
- Reusable utility methods for common operations
- Configurable test environment
- Detailed test reports

## Contact Form Fields to be Validated

The automation will validate the following fields on the contact form:
- Name
- Email
- Phone
- Company Name
- Message
- Country selection
- Submit functionality

## Prerequisites

- Java Development Kit (JDK)
- Maven (for dependency management)
- Selenium WebDriver
- Web browser (Chrome/Firefox)
- TestNG (for test execution)

## Getting Started

1. Clone the repository
2. Install required dependencies using Maven
3. Configure browser drivers
4. Run tests using TestNG

## Running Tests

The tests can be executed using:
```
mvn test
```

## Test Reports

The project uses Spark Reports for comprehensive test reporting. After test execution, you can find the following details in the generated Spark Report:
- Detailed test execution status with pass/fail indicators
- Screenshots of failed test cases
- Test execution timeline
- Environment details
- Test metadata and descriptions
- Step-by-step execution details
- Attachments and logs

The Spark Report will be generated in the `reports` directory after test execution.

## Contributing

Please follow the standard Java/Selenium best practices when contributing to this project:
1. Follow the Page Object Model pattern
2. Write clear and maintainable code
3. Add proper test documentation
4. Follow consistent naming conventions

## License

This project is for educational and demonstration purposes only.
