# Automation Test Framework for **Analytics Vidhya – GenAI Pinnacle Plus**

## Overview

This repository contains a lightweight, self‑healing **UI automation** framework built with **Java 17**, **Selenium 4**, and **TestNG**.  The current test suite exercises the public **Analytics Vidhya – GenAI Pinnacle Plus** landing page ([https://www.analyticsvidhya.com/genaipinnacle/](https://www.analyticsvidhya.com/genaipinnacle/)) from the cookie banner all the way down to the FAQs, validating every CTA, form field, and pop‑up end‑to‑end.

Just clone, install dependencies, and run `mvn test` to watch the suite drive the site and produce a rich HTML report.

---

## Tech Stack

| Layer / Concern   | Tool                    | Purpose                                                      |
| ----------------- | ----------------------- | ------------------------------------------------------------ |
| Language          | **Java 17**             | Core test logic & utilities                                  |
| Test Runner       | **TestNG 7**            | Parallel execution, data providers, retry logic              |
| Web UI Automation | **Selenium 4**          | Cross‑browser interaction (CSS/JS support, CDP APIs)         |
| Self‑Healing      | **Healenium**           | Replaces broken locators automatically to cut flaky failures |
| Driver Mgmt       | **WebDriverManager**    | Downloads & caches the matching ChromeDriver binary          |
| Logging           | **Log4j 2**             | Structured log output to `logs/test‑execution.log`           |
| Reports           | **Extent Spark Report** | Interactive HTML results (pass/fail charts, screenshots)     |

---

## Application Under Test

| Feature                                                 | Why it’s Covered                                  |
| ------------------------------------------------------- | ------------------------------------------------- |
| Landing‑page hero & sub‑title                           | Ensures first‑paint content is correct            |
| Navigation CTAs (Curriculum, Fees, etc.)                | Verifies smooth scroll & click behaviour          |
| Dynamic pop‑ups (Enroll Now, Download Curriculum, etc.) | Checks modal titles, form validation & submission |
| Section counters & statistics                           | Confirms numbers and labels render as expected    |

---

## Getting Started

```bash
# 1  Clone the repo
git clone git@github.com:RocketDC/QA-project.git
cd <repo‑folder>

# 2  Install dependencies & compile
mvn clean install

# 3  Run the test suite
mvn test
```

> **Tip:** First run auto‑downloads ChromeDriver; subsequent runs use the cached binary.

---

## Folder Structure

```
│  pom.xml                 # Maven coordinates
├─ src
│  ├─ main/java
│  │   └─ framework        # Base, driver factory, utils
│  └─ test/java
│      ├─ pages            # Page Object classes
│      └─ tests            # TestNG classes (e.g., TC_HomePage.java)
├─ logs/
│  └─ test‑execution.log   # Rotated/cleared each run
└─ reports/
    └─ spark‑index.html    # Extent Spark output
```

---

## Sample Test Case

*`TC_HomePage.java`* (included in this repo) demonstrates a **page‑object + data‑provider** approach that walks through >20 visual sections, multiple windows, and form submissions.  Use it as a blueprint for new scenarios.

---

## Logging & Reports

* **Log4j 2** writes a fresh `logs/web_automation_execution.log` on every execution.  Verbosity is controlled via `log4j2.xml`.
* Open `reports/spark‑index.html` after a run to explore pass/fail charts, screenshots, and system info.

---

## Continuous Integration

A sample GitHub Actions workflow (`.github/workflows/ci.yml`) shows how to:

1. Set up JDK 17
2. Cache the Maven repo
3. Execute tests headless on a Linux runner
4. Upload Spark report as an artifact

---

## Contributing

Pull requests are welcome!  Please open an issue first to discuss proposed changes.

## License

MIT License — see `LICENSE` for full text.
