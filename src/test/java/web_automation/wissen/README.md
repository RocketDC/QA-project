# Wissen Web Automation Framework

This project contains automated test cases for the Wissen website's Contact Us module using Selenium WebDriver, TestNG, and Java.

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 17 or higher installed
- Maven or Gradle build tool
- IDE (Eclipse or IntelliJ IDEA)
- Chrome browser (latest version)
- Git installed on your machine

### Installation

1. Clone the repository:
   ```bash
   git clone git@github.com:RocketDC/QA-project.git
   cd <folder-name>
   ```

2. Set up your development environment:
   - Import the project into your IDE
   - Configure Maven/Gradle build tool
   - Ensure Java 17 is set as the project JDK

3. Install dependencies:
   ```bash
   mvn clean install
   # or
   gradle build
   ```

### Running the Tests

You can run the tests in several ways:

1. Using Maven:
   ```bash
   mvn test
   ```

2. Using Gradle:
   ```bash
   gradle test
   ```

3. Using IDE:
   - Right-click on test classes
   - Select "Run as TestNG Test"

### Test Reports

After execution, test reports will be generated in the `reports` directory:
- HTML reports: `reports/extent.html`
- Log files: `logs/web_automation_execution.log`

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

## Tech Stack

| Layer / Concern   | Tool                    | Purpose                                                      |
| ----------------- | ----------------------- | ------------------------------------------------------------ |
| Language          | **Java 17**             | Core test logic & utilities                                  |
| Test Runner       | **TestNG 7**            | Parallel execution, data providers, retry logic              |
| Web UI Automation | **Selenium 4**          | Cross‑browser interaction (CSS/JS support, CDP APIs)         |
| Driver Mgmt       | **WebDriverManager**    | Downloads & caches the matching ChromeDriver binary          |
| Logging           | **Log4j 2**             | Structured log output to `logs/web_automation_execution.log` |
| Reports           | **Extent Spark Report** | Interactive HTML results (pass/fail charts, screenshots)     |

## Contributing

Please follow the existing code structure and patterns when contributing new test cases or modifying existing ones.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
