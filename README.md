# 🔍 Seclore Web Automation Project

[![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)

This project contains automated test scripts for the Seclore website, focusing on the login, register, and demo page functionality. 🚀

## 📋 Project Overview

This is a Selenium-based web automation project that automates the following flow:

1. 🏠 Landing on the Seclore homepage
2. 📝 Navigation to the Get a Demo page and validation
3. 🔙 Return to the Homepage and validation
4. 🔑 Navigation to the Login page and validation
5. 📝 Navigation to the Register page and validation

## 🗂️ Project Structure

```
src/test/java/
├── web_automation/
│   ├── seclore/
│   │   ├── base/           # Base test classes
│   │   ├── pages/          # Page Object Model implementations
│   │   ├── tests/          # Test cases
│   │   └── utils/          # Utility classes and helpers
│   └── commons/            # Common utilities and base classes
├── config/                 # Configuration files
└── reports/               # Test execution reports
```

## ⚙️ Prerequisites

- ☕ Java JDK 8 or higher
- 🏗️ Maven 3.6 or higher
- 🌐 Chrome browser
- 🚦 ChromeDriver (automatically managed via WebDriverManager)

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

## ✨ Features

- 🏗️ Page Object Model (POM) design pattern
- 📊 ExtentReports for detailed test reporting
- 📝 Comprehensive logging system
- 🌐 Chrome browser automation
- 💾 Test data management
- ✅ Automated page validations

## 🧩 Key Components

### 🔧 Base Classes
- `TestBase`: Core test base class with setup and teardown
- `CommonTestBase`: Common utilities and methods

### 🛠️ Utilities
- `SecloreDataProvider`: Provides test data for Seclore test cases

### 📄 Pages
- `HomePage`: 🏠 Handles homepage interactions and validations
- `GetADemoPage`: 📋 Handles Get a Demo page interactions and validations
- `LoginPage`: 🔑 Handles login page interactions and validations
- `RegisterPage`: 📝 Handles registration page interactions and validations

### 🧪 Test Cases
- 🏠 Homepage navigation and validation
- 📝 Get a Demo page navigation and validation
- 🔑 Login page navigation and validation
- ✏️ Register page navigation and validation

## 📊 Reports

Test execution reports are generated in the `reports` directory. The reports include:
- Detailed test execution status
- Screenshots of failures
- Performance metrics
- Browser logs

## ⚙️ Configuration

The project uses configuration files located in the `config` directory:
- `QA.properties`: Contains environment-specific configurations

## 👥 Contributing

1. 🍴 Fork the repository
2. 🌿 Create a feature branch
3. 💾 Commit your changes
4. 🔄 Push to the branch
5. 🔄 Create a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

<div align="center">
  Made with ❤️ using Selenium WebDriver
</div>
