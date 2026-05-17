# ⚡ Quick Start Guide

Get up and running with Playwright automation in 5 minutes!

---

## 🚀 Step 1: Install Playwright

```bash
cd ~/Documents/learning/playwright-automation

# Install Playwright and browsers
npm install @playwright/test
npx playwright install
```

---

## 🧪 Step 2: Run Your First Test

```bash
# Run all tests
npm test

# Or run in headed mode (see the browser)
npm run test:headed
```

---

## 📊 Step 3: View Test Results

```bash
# Open HTML report
npm run report
```

---

## 🎯 What's Included

- ✅ Playwright framework configured
- ✅ Sample test for naukri.com homepage
- ✅ Cross-browser support (Chrome, Firefox, Safari)
- ✅ Screenshots & videos on failure
- ✅ Git repository initialized

---

## 📁 Project Structure

```
playwright-automation/
├── README.md                  ← Full documentation
├── FUTURE_INTEGRATIONS.md     ← Ollama & MCP plans
├── QUICKSTART.md             ← This file
├── playwright.config.js       ← Configuration
├── tests/                     ← Your tests
│   └── naukri/
│       └── homepage.spec.js   ← Sample test
├── pages/                     ← Page objects (empty)
├── utils/                     ← Helpers (empty)
└── test-data/                 ← Test data (empty)
```

---

## 🎬 Next Steps

### 1. Explore the Sample Test

```bash
cat tests/naukri/homepage.spec.js
```

### 2. Run Specific Tests

```bash
# Run only homepage tests
npx playwright test tests/naukri/homepage.spec.js

# Run in debug mode (step through)
npm run test:debug
```

### 3. Write Your Own Test

Create `tests/naukri/search.spec.js`:

```javascript
const { test, expect } = require('@playwright/test');

test('search for QA Engineer jobs', async ({ page }) => {
  await page.goto('/');
  
  // Fill search form
  await page.fill('input[placeholder*="Skills"]', 'QA Engineer');
  await page.fill('input[placeholder*="location"]', 'Bangalore');
  
  // Click search
  await page.click('button[type="submit"]');
  
  // Verify results
  await page.waitForLoadState('networkidle');
  await expect(page).toHaveURL(/qa.*engineer/i);
});
```

### 4. Push to GitHub

```bash
# Create a new repository on GitHub first, then:
git remote add origin https://github.com/YOUR_USERNAME/playwright-automation.git
git push -u origin main
```

---

## 🐛 Troubleshooting

### Browsers Not Installing?

```bash
npx playwright install --with-deps
```

### Tests Failing?

```bash
# Run in headed mode to see what's happening
npm run test:headed

# Or use debug mode
npm run test:debug
```

### Need to Update Selectors?

Naukri.com might change their page structure. Use Playwright Inspector:

```bash
npx playwright test --debug
```

Click the "Pick locator" button and click on elements to get their selectors.

---

## 📚 Learn More

- **Full README:** [README.md](./README.md)
- **Future Plans:** [FUTURE_INTEGRATIONS.md](./FUTURE_INTEGRATIONS.md)
- **Playwright Docs:** https://playwright.dev

---

## ✅ Checklist

- [ ] Installed Playwright (`npm install @playwright/test`)
- [ ] Installed browsers (`npx playwright install`)
- [ ] Ran sample test (`npm test`)
- [ ] Viewed report (`npm run report`)
- [ ] Read README.md
- [ ] Pushed to GitHub

---

**You're all set! Start writing tests and have fun! 🎭✨**
