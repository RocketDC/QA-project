# Wissen Web Automation Framework

This project contains automated test cases for the Wissen website's Contact Us page using Selenium WebDriver, TestNG, and Java.

## Project Structure

```
wissen/
├── base/           # Base classes and configurations
├── pages/          # Page Object Model classes
├── tests/          # Test case classes
└── utils/          # Utility classes
```

## Features

- Page Object Model (POM) pattern implementation
- TestNG for test execution and reporting
- Selenium WebDriver for browser automation
- Java-based automation framework

## Pages Automated

1. Home Page
   - Navigation elements
   - Contact Us link verification

2. Contact Us Page
   - Form elements
   - Form submission functionality
   - Success message verification

## Dependencies

- Selenium WebDriver
- TestNG
- Java
- WebDriver Manager (for browser management)

## Setup Instructions

1. Clone the repository
2. Import project into your IDE (Eclipse/IntelliJ)
3. Add required dependencies to your build configuration
4. Configure TestNG runner
5. Run tests using TestNG

## Running Tests

The tests can be executed using TestNG:
1. Right-click on test classes and select "Run as TestNG Test"
2. Or run the TestNG suite file

## Test Reports

TestNG generates detailed HTML reports that can be found in the test-output directory after execution.

## Contributing

Please follow the existing code structure and patterns when contributing new test cases or modifying existing ones.
