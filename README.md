# 🎭 Playwright Automation Testing Project

> A modern automation testing framework using Playwright with plans for AI-powered test generation using Ollama and MCP servers.

## 📋 Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Sample Tests](#sample-tests)
- [Running Tests](#running-tests)
- [Future Roadmap](#future-roadmap)
- [Contributing](#contributing)

---

## 🎯 Overview

This project is a Playwright-based automation testing framework designed to test **naukri.com** (India's leading job portal). The framework is built with scalability and AI integration in mind.

**Current Features:**
- ✅ Playwright test automation
- ✅ TypeScript/JavaScript support
- ✅ Cross-browser testing (Chromium, Firefox, WebKit)
- ✅ Built-in test reporting

**Planned Features:**
- 🔮 Ollama integration for AI-powered test generation
- 🔮 MCP (Model Context Protocol) servers for enhanced automation
- 🔮 Self-healing tests using LLMs
- 🔮 Intelligent test data generation

---

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

- **Node.js** (v18 or higher) - [Download](https://nodejs.org/)
- **npm** or **yarn** package manager
- **Git** for version control
- A code editor (VS Code recommended)

### Verify Installation

```bash
node --version   # Should show v18+ 
npm --version    # Should show 8+
git --version    # Any recent version
```

---

## 🚀 Installation

### Step 1: Clone or Initialize Repository

```bash
# If starting fresh
cd ~/Documents/learning/playwright-automation
git init
```

### Step 2: Initialize npm Project

```bash
npm init -y
```

### Step 3: Install Playwright

```bash
# Install Playwright with browsers
npm init playwright@latest

# Or install manually
npm install -D @playwright/test
npx playwright install
```

### Step 4: Install TypeScript (Optional but Recommended)

```bash
npm install -D typescript
npx tsc --init
```

### Step 5: Install Additional Dependencies

```bash
# For better assertions and utilities
npm install -D @types/node

# For environment variables
npm install dotenv
```

---

## 📁 Project Structure

```
playwright-automation/
├── tests/
│   ├── naukri/
│   │   ├── search.spec.ts
│   │   ├── login.spec.ts
│   │   └── jobApplication.spec.ts
│   └── fixtures/
│       └── naukriFixture.ts
├── pages/
│   ├── HomePage.ts
│   ├── SearchPage.ts
│   └── LoginPage.ts
├── utils/
│   ├── helpers.ts
│   └── constants.ts
├── test-data/
│   ├── users.json
│   └── searchQueries.json
├── playwright.config.ts
├── package.json
├── tsconfig.json
├── .gitignore
└── README.md
```

**Directory Breakdown:**

- `tests/` - All test files organized by feature
- `pages/` - Page Object Model (POM) classes
- `utils/` - Helper functions and constants
- `test-data/` - Test data files (JSON, CSV)
- `playwright.config.ts` - Playwright configuration

---

## 🏁 Getting Started

### 1. Configure Playwright

Edit `playwright.config.ts`:

```typescript
import { defineConfig, devices } from '@playwright/test';

export default defineConfig({
  testDir: './tests',
  timeout: 30 * 1000,
  retries: 1,
  workers: 3,
  
  use: {
    baseURL: 'https://www.naukri.com',
    screenshot: 'only-on-failure',
    video: 'retain-on-failure',
    trace: 'on-first-retry',
  },

  projects: [
    {
      name: 'chromium',
      use: { ...devices['Desktop Chrome'] },
    },
    {
      name: 'firefox',
      use: { ...devices['Desktop Firefox'] },
    },
    {
      name: 'webkit',
      use: { ...devices['Desktop Safari'] },
    },
  ],
});
```

### 2. Create .gitignore

```bash
cat > .gitignore << 'EOF'
node_modules/
test-results/
playwright-report/
playwright/.cache/
.env
*.log
.DS_Store
EOF
```

### 3. Initialize Git Repository

```bash
git add .
git commit -m "Initial commit: Playwright automation framework setup"
```

---

## 🧪 Sample Tests

### Example 1: Basic Navigation Test

Create `tests/naukri/navigation.spec.ts`:

```typescript
import { test, expect } from '@playwright/test';

test.describe('Naukri.com Navigation Tests', () => {
  test('should load homepage successfully', async ({ page }) => {
    await page.goto('https://www.naukri.com');
    
    // Verify page title
    await expect(page).toHaveTitle(/Naukri/);
    
    // Verify logo is visible
    const logo = page.locator('.nI-gNb-logo');
    await expect(logo).toBeVisible();
  });

  test('should navigate to Jobs page', async ({ page }) => {
    await page.goto('https://www.naukri.com');
    
    // Click on Jobs link
    await page.click('text=Jobs');
    
    // Verify URL changed
    await expect(page).toHaveURL(/jobs/);
  });
});
```

### Example 2: Job Search Test

Create `tests/naukri/search.spec.ts`:

```typescript
import { test, expect } from '@playwright/test';

test.describe('Job Search Functionality', () => {
  test('should search for Software Engineer jobs', async ({ page }) => {
    await page.goto('https://www.naukri.com');
    
    // Fill search inputs
    await page.fill('[placeholder*="designation"]', 'Software Engineer');
    await page.fill('[placeholder*="location"]', 'Bangalore');
    
    // Click search button
    await page.click('button[type="submit"]');
    
    // Wait for results
    await page.waitForLoadState('networkidle');
    
    // Verify results are displayed
    const jobCards = page.locator('.jobTuple');
    await expect(jobCards.first()).toBeVisible();
    
    // Verify search query in URL
    await expect(page).toHaveURL(/Software.*Engineer/);
  });

  test('should filter jobs by experience', async ({ page }) => {
    await page.goto('https://www.naukri.com/software-engineer-jobs');
    
    // Click on experience filter
    await page.click('text=Experience');
    await page.click('text=2-5 years');
    
    // Wait for filtered results
    await page.waitForTimeout(2000);
    
    // Verify filter applied
    const experienceTag = page.locator('text=2-5 years');
    await expect(experienceTag).toBeVisible();
  });
});
```

### Example 3: Page Object Model

Create `pages/HomePage.ts`:

```typescript
import { Page, Locator } from '@playwright/test';

export class HomePage {
  readonly page: Page;
  readonly searchInput: Locator;
  readonly locationInput: Locator;
  readonly searchButton: Locator;
  readonly logo: Locator;

  constructor(page: Page) {
    this.page = page;
    this.searchInput = page.locator('[placeholder*="designation"]');
    this.locationInput = page.locator('[placeholder*="location"]');
    this.searchButton = page.locator('button[type="submit"]');
    this.logo = page.locator('.nI-gNb-logo');
  }

  async goto() {
    await this.page.goto('https://www.naukri.com');
  }

  async searchJob(role: string, location: string) {
    await this.searchInput.fill(role);
    await this.locationInput.fill(location);
    await this.searchButton.click();
  }

  async isLogoVisible() {
    return await this.logo.isVisible();
  }
}
```

---

## ▶️ Running Tests

### Run All Tests

```bash
npx playwright test
```

### Run Specific Test File

```bash
npx playwright test tests/naukri/search.spec.ts
```

### Run Tests in Headed Mode (See Browser)

```bash
npx playwright test --headed
```

### Run Tests in Debug Mode

```bash
npx playwright test --debug
```

### Run Tests in Specific Browser

```bash
npx playwright test --project=chromium
npx playwright test --project=firefox
npx playwright test --project=webkit
```

### View Test Report

```bash
npx playwright show-report
```

---

## 🔮 Future Roadmap

### Phase 1: Ollama Integration

**Goal:** Integrate Ollama (local LLM) for AI-powered test generation and maintenance.

**Planned Features:**
- 🤖 Generate test cases from natural language descriptions
- 🔄 Self-healing tests using LLM-based selector recovery
- 📝 Automatic test documentation generation
- 🧠 Intelligent test data creation

**Implementation Plan:**
```bash
# Install Ollama
# macOS: brew install ollama

# Pull a model
ollama pull codellama

# Create integration module
# - ollama/testGenerator.ts
# - ollama/selectorHealer.ts
# - ollama/dataGenerator.ts
```

**Example Usage (Planned):**
```typescript
import { generateTest } from './ollama/testGenerator';

// Natural language to test
const testSpec = await generateTest(
  "Test that user can search for remote jobs in Bangalore"
);
```

### Phase 2: MCP Server Integration

**Goal:** Integrate Model Context Protocol servers for enhanced AI-powered automation.

**What is MCP?**
MCP (Model Context Protocol) allows AI models to interact with external tools and services in a standardized way.

**Planned Features:**
- 🌐 Browser automation context for AI models
- 📊 Test result analysis and insights
- 🔍 Intelligent debugging assistance
- 📈 Performance monitoring and optimization

**Potential MCP Servers:**
```bash
# Browser automation MCP
@modelcontextprotocol/server-playwright

# Database MCP (for test data)
@modelcontextprotocol/server-postgres

# File system MCP (for test artifacts)
@modelcontextprotocol/server-filesystem
```

### Phase 3: Advanced Features

- ✨ Visual regression testing with AI diff analysis
- 🎯 Predictive test failure detection
- 🔧 Automated test maintenance
- 📊 AI-powered test coverage analysis
- 🚀 Parallel test optimization

---

## 🛠️ Troubleshooting

### Common Issues

**Issue:** Browsers not installed
```bash
npx playwright install
```

**Issue:** Tests timing out
- Increase timeout in `playwright.config.ts`
- Use `page.waitForLoadState('networkidle')`

**Issue:** Selectors not found
- Use Playwright Inspector: `npx playwright test --debug`
- Use more robust selectors (data-testid, role-based)

---

## 📚 Resources

- [Playwright Documentation](https://playwright.dev)
- [Ollama Documentation](https://ollama.ai)
- [MCP Documentation](https://modelcontextprotocol.io)
- [Naukri.com](https://www.naukri.com)

---

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

---

## 📝 License

This project is licensed under the MIT License.

---

## 👤 Author

**Anand**
- Automation Testing Engineer
- Learning AI integration with test automation
- Boxing enthusiast 🥊

---

## 🙏 Acknowledgments

- Playwright team for the amazing testing framework
- Ollama community for local LLM capabilities
- Anthropic for MCP protocol standardization

---

**Happy Testing! 🎭✨**
