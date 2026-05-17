# 📝 Project Notes

---

## 🤖 About Gemini CLI

You have **Gemini CLI** (v0.42.0) installed at `/opt/homebrew/bin/gemini`.

### What is Gemini CLI?

Gemini CLI is an AI assistant similar to OpenClaw/Claude that runs in your terminal. It can help with:
- Code generation
- File creation and editing
- Project scaffolding
- MCP server management (perfect for your future plans!)

### Setup Required

Gemini CLI needs authentication before you can use it. You have two options:

#### Option 1: Google Gemini API (Free tier available)

1. Get an API key from [Google AI Studio](https://makersuite.google.com/app/apikey)
2. Add to your Gemini settings:
   ```bash
   # Edit settings file
   code ~/.gemini/settings.json
   
   # Add:
   {
     "apiKey": "YOUR_API_KEY_HERE"
   }
   ```

#### Option 2: Environment Variable

```bash
# Add to ~/.zshrc
export GEMINI_API_KEY="your-api-key-here"

# Reload shell
source ~/.zshrc
```

### Using Gemini CLI

```bash
# Interactive mode
gemini

# Non-interactive (headless)
gemini -p "Create a README file"

# With MCP servers (future)
gemini mcp list
gemini mcp install @modelcontextprotocol/server-playwright
```

### Why This Matters for Your Project

Gemini CLI has **built-in MCP support**, which aligns perfectly with your future integration plans! You can use it to:
- Manage MCP servers
- Test MCP integrations
- Generate AI-powered test code

---

## 🎯 Project Status

**Created:** May 17, 2026  
**Status:** ✅ Initial setup complete  
**Next Step:** Complete Playwright course

### What's Been Done

- ✅ Project structure created
- ✅ README.md with comprehensive setup instructions
- ✅ QUICKSTART.md for quick setup
- ✅ FUTURE_INTEGRATIONS.md with Ollama & MCP plans
- ✅ Sample test for naukri.com homepage
- ✅ Playwright config with cross-browser support
- ✅ Git repository initialized (2 commits)
- ✅ Directory structure for pages, utils, test-data

### What's Next

1. **Complete your Playwright course** (current focus)
2. **Install Playwright dependencies:**
   ```bash
   cd ~/Documents/learning/playwright-automation
   npm install @playwright/test
   npx playwright install
   ```
3. **Run the sample test:**
   ```bash
   npm test
   ```
4. **Write more tests** for naukri.com
5. **Push to GitHub**
6. **Explore Ollama** (after mastering Playwright)
7. **Integrate MCP servers**

---

## 📚 Learning Path

### Phase 1: Playwright Fundamentals (Current)
- [ ] Complete Playwright course
- [ ] Build 5-10 manual tests for naukri.com
- [ ] Master selectors, assertions, page objects
- [ ] Understand test hooks and fixtures

### Phase 2: Advanced Playwright
- [ ] Parallel execution
- [ ] Custom fixtures
- [ ] API testing with Playwright
- [ ] Visual regression testing

### Phase 3: AI Integration
- [ ] Install and experiment with Ollama
- [ ] Test prompt engineering for code generation
- [ ] Build basic test generator
- [ ] Implement self-healing selectors

### Phase 4: MCP Integration
- [ ] Set up Gemini CLI with MCP
- [ ] Install MCP servers
- [ ] Connect AI to Playwright via MCP
- [ ] Build end-to-end AI testing pipeline

---

## 🛠️ Tools in Your Arsenal

| Tool | Purpose | Status |
|------|---------|--------|
| **Playwright** | Test automation framework | ⏳ To install |
| **Node.js** | JavaScript runtime | ✅ v25.2.1 |
| **Git** | Version control | ✅ 2.50.1 |
| **VS Code** | Code editor | ✅ Installed |
| **Gemini CLI** | AI assistant | ⚠️ Needs auth |
| **Ollama** | Local LLM | ⏳ Future |
| **MCP** | AI-tool protocol | ⏳ Future |

---

## 💡 Ideas & Experiments

### Test Scenarios for Naukri.com

1. **Job Search Flow**
   - Search by keyword and location
   - Apply filters (experience, salary, company)
   - Verify results count
   - Check sorting options

2. **Job Application Flow**
   - Click on job listing
   - Read job description
   - Click "Apply" button
   - Verify application form

3. **Resume Upload**
   - Navigate to profile
   - Upload resume
   - Verify upload success
   - Download resume

4. **Job Alerts**
   - Create job alert
   - Verify email/notification
   - Edit alert
   - Delete alert

5. **Company Search**
   - Search for companies
   - View company profile
   - Check reviews
   - Follow company

### AI Integration Ideas

1. **Smart Test Generator**
   - Input: "Test job search for Python jobs in Pune"
   - Output: Complete Playwright test

2. **Bug Predictor**
   - Analyze test failures
   - Predict potential bugs
   - Suggest fixes

3. **Test Optimizer**
   - Analyze test suite
   - Identify redundant tests
   - Suggest consolidation

4. **Natural Language Debugging**
   - "Why did this test fail?"
   - AI analyzes logs and screenshots
   - Provides human-readable explanation

---

## 🐛 Common Issues & Solutions

### Issue: Tests are slow
**Solution:** Use `page.waitForLoadState('networkidle')` sparingly. Prefer specific element waits.

### Issue: Selectors keep breaking
**Solution:** Use data-testid attributes or more stable selectors. Consider implementing self-healing.

### Issue: Tests pass locally but fail in CI
**Solution:** Ensure same browser versions, add longer timeouts, check for race conditions.

---

## 🎓 Resources Bookmarked

- [Playwright Best Practices](https://playwright.dev/docs/best-practices)
- [Ollama Documentation](https://ollama.ai/docs)
- [MCP Protocol Spec](https://modelcontextprotocol.io/docs)
- [AI Testing Strategies](https://martinfowler.com/articles/practical-test-pyramid.html)

---

## 📊 Metrics to Track

Once you start testing:

- **Test count:** Aim for 50+ tests
- **Coverage:** Core user flows covered
- **Execution time:** Keep under 5 minutes
- **Flakiness:** < 2% failure rate
- **Maintenance:** < 1 hour/week on test fixes

---

## 🤝 Collaboration

This project could become:
- **GitHub repo** for portfolio
- **Blog series** on AI + testing
- **YouTube tutorials**
- **Open-source tool** for community

---

## 🌱 Personal Notes

Remember:
- Start simple, iterate fast
- Document everything
- Break when frustrated (boxing time! 🥊)
- AI is a tool, not a replacement for understanding
- Tests should be readable by humans first

---

**You've got this! One test at a time. 🎭✨**

---

## 📞 Questions? Need Help?

Ask Asha! I'm here to help you through:
- Playwright debugging
- Test design
- AI integration
- Git workflows
- Anything else!

Just ping me on Telegram. 🌱
