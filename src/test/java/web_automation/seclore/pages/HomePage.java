package web_automation.seclore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import web_automation.seclore.base.TestBase;

public class HomePage extends TestBase{
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    /* ---------- Brand logo ---------- */
    @FindBy(xpath = "//a[contains(@class,'navbar-brand')][contains(.,'SECLORE')]")
    public WebElement logoSeclore;

    public boolean logoSecloreIsDisplayed() {
        scrollIntoView(logoSeclore);
        return isDisplayed(logoSeclore);
    }

    public void clickLogoSeclore() {
        scrollIntoView(logoSeclore);
        click(logoSeclore, "Seclore Logo");
    }

    /* ---------- Primary navigation ---------- */
    @FindBy(xpath = "//nav//a[normalize-space()='Platform']")
    public WebElement navPlatform;

    public boolean navPlatformIsDisplayed() {
        scrollIntoView(navPlatform);
        return isDisplayed(navPlatform);
    }

    public void clickNavPlatform() {
        scrollIntoView(navPlatform);
        click(navPlatform, "Platform");
    }
    //Validate text
    public void validateTextOfNavPlatform(String text) {
        softAssert(navPlatform, text);
    }

    @FindBy(xpath = "//nav//a[normalize-space()='Solutions']")
    public WebElement navSolutions;
    // Solutions isDispayed
    public boolean navSolutionsIsDisplayed() {
        scrollIntoView(navSolutions);
        return isDisplayed(navSolutions);
    }

    public void clickNavSolutions() {
        scrollIntoView(navSolutions);
        click(navSolutions, "Solutions");
    }
    //Validate text
    public void validateTextOfNavSolutions(String text) {
        softAssert(navSolutions, text);
    }

    @FindBy(xpath = "//nav//a[normalize-space()='Pricing']")
    public WebElement navPricing;
    //Pricing isDispayed
    public boolean navPricingIsDisplayed() {
        scrollIntoView(navPricing);
        return isDisplayed(navPricing);
    }

    public void clickNavPricing() {
        scrollIntoView(navPricing);
        click(navPricing, "Pricing");
    }
    //Validate text
    public void validateTextOfNavPricing(String text) {
        softAssert(navPricing, text);
    }

    @FindBy(xpath = "//nav//a[normalize-space()='Resources']")
    public WebElement navResources;
    //Resources isDispayed
    public boolean navResourcesIsDisplayed() {
        scrollIntoView(navResources);
        return isDisplayed(navResources);
    }

    public void clickNavResources() {
        scrollIntoView(navResources);
        click(navResources, "Resources");
    }
    //Validate text
    public void validateTextOfNavResources(String text) {
        softAssert(navResources, text);
    }

    @FindBy(xpath = "//nav//a[normalize-space()='Partners']")
    public WebElement navPartners;
    //Partners isDispayed
    public boolean navPartnersIsDisplayed() {
        scrollIntoView(navPartners);
        return isDisplayed(navPartners);
    }

    public void clickNavPartners() {
        scrollIntoView(navPartners);
        click(navPartners, "Partners");
    }
    //Validate text
    public void validateTextOfNavPartners(String text) {
        softAssert(navPartners, text);
    }

    @FindBy(xpath = "//nav//a[normalize-space()='About']")
    public WebElement navAbout;
    //About isDispayed
    public boolean navAboutIsDisplayed() {
        scrollIntoView(navAbout);
        return isDisplayed(navAbout);
    }

    public void clickNavAbout() {
        scrollIntoView(navAbout);
        click(navAbout, "About");
    }
    //Validate text
    public void validateTextOfNavAbout(String text) {
        softAssert(navAbout, text);
    }

    @FindBy(xpath = "//nav//a[normalize-space()='Support']")
    public WebElement navSupport;
    //Support isDispayed
    public boolean navSupportIsDisplayed() {
        scrollIntoView(navSupport);
        return isDisplayed(navSupport);
    }

    public void clickNavSupport() {
        scrollIntoView(navSupport);
        click(navSupport, "Support");
    }
    //Validate text
    public void validateTextOfNavSupport(String text) {
        softAssert(navSupport, text);
    }

    /* ---------- Utility links / icons ---------- */
    @FindBy(xpath = "//a[normalize-space()='HOW TO OPEN A SECLORE FILE']")
    public WebElement linkHowToOpenFile;
    //How to open a seclore file isDispayed
    public boolean linkHowToOpenFileIsDisplayed() {
        scrollIntoView(linkHowToOpenFile);
        return isDisplayed(linkHowToOpenFile);
    }

    public void clickLinkHowToOpenFile() {
        scrollIntoView(linkHowToOpenFile);
        click(linkHowToOpenFile, "How to open a seclore file");
    }

    @FindBy(xpath = "//button[@aria-label='Search'] | //a[@aria-label='Search']")
    public WebElement iconSearch;
    //Search isDispayed
    public boolean iconSearchIsDisplayed() {
        scrollIntoView(iconSearch);
        return isDisplayed(iconSearch);
    }

    public void clickIconSearch() {
        scrollIntoView(iconSearch);
        click(iconSearch, "Search");
    }

    @FindBy(xpath = "//button[@aria-label='Language'] | //a[@aria-label='Language']")
    public WebElement iconLanguage;
    //Language isDispayed
    public boolean iconLanguageIsDisplayed() {
        scrollIntoView(iconLanguage);
        return isDisplayed(iconLanguage);
    }

    public void clickIconLanguage() {
        scrollIntoView(iconLanguage);
        click(iconLanguage, "Language");
    }

    /* ---------- Call-to-action button ---------- */
    @FindBy(xpath = "//a[normalize-space()='Get a demo']")
    public WebElement btnGetADemo;
    //Get a demo isDispayed
    public boolean btnGetADemoIsDisplayed() {
        scrollIntoView(btnGetADemo);
        return isDisplayed(btnGetADemo);
    }

    public void clickBtnGetADemo() {
        scrollIntoView(btnGetADemo);
        click(btnGetADemo, "Get a demo");
    }
    //Validate text
    public void validateTextOfBtnGetADemo(String text) {
        softAssert(btnGetADemo, text);
    }
}
