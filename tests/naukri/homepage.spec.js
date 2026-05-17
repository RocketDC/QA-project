const { test, expect } = require('@playwright/test');

test.describe('Naukri.com Homepage Tests', () => {
  
  test('should load homepage successfully', async ({ page }) => {
    // Navigate to Naukri homepage
    await page.goto('/');
    
    // Verify page title contains "Naukri"
    await expect(page).toHaveTitle(/Naukri/);
    
    // Verify logo is visible
    const logo = page.locator('.nI-gNb-logo').first();
    await expect(logo).toBeVisible();
    
    console.log('✅ Homepage loaded successfully!');
  });

  test('should display search inputs', async ({ page }) => {
    await page.goto('/');
    
    // Check for designation/skills input
    const skillsInput = page.locator('input[placeholder*="designation"], input[placeholder*="Skills"]').first();
    await expect(skillsInput).toBeVisible();
    
    // Check for location input
    const locationInput = page.locator('input[placeholder*="location"]').first();
    await expect(locationInput).toBeVisible();
    
    console.log('✅ Search inputs are visible!');
  });

  test('should search for Software Engineer jobs', async ({ page }) => {
    await page.goto('/');
    
    // Fill search inputs
    const skillsInput = page.locator('input[placeholder*="designation"], input[placeholder*="Skills"]').first();
    await skillsInput.fill('Software Engineer');
    
    const locationInput = page.locator('input[placeholder*="location"]').first();
    await locationInput.fill('Bangalore');
    
    // Click search button
    const searchButton = page.locator('button[type="submit"]').first();
    await searchButton.click();
    
    // Wait for navigation
    await page.waitForLoadState('networkidle');
    
    // Verify we're on search results page
    await expect(page).toHaveURL(/software.*engineer|search/i);
    
    console.log('✅ Job search completed successfully!');
  });

  test('should navigate to Jobs section', async ({ page }) => {
    await page.goto('/');
    
    // Click on Jobs link (adjust selector based on actual page structure)
    const jobsLink = page.locator('text=Jobs').first();
    
    if (await jobsLink.isVisible()) {
      await jobsLink.click();
      await page.waitForLoadState('networkidle');
      console.log('✅ Navigated to Jobs section!');
    } else {
      console.log('⚠️ Jobs link not found - page structure may have changed');
    }
  });

});
