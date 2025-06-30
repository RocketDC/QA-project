package web_automation.seclore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import web_automation.seclore.base.TestBase;

public class HomePage extends TestBase {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* ---------- Brand logo ---------- */
    @FindBy(xpath = "(//*[@alt='Seclore'])[1]")
    private WebElement logoSeclore;

    public boolean logoSecloreIsDisplayed() {
        scrollIntoView(logoSeclore);
        return isDisplayed(logoSeclore);
    }

    public void clickLogoSeclore() {
        scrollIntoView(logoSeclore);
        click(logoSeclore, "Seclore Logo");
    }

    /* ---------- Primary navigation ---------- */
    @FindBy(xpath = "//*[@id='menu-item-10557']/a")
    private WebElement navPlatform;

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

    //hover navPlatform
    public void hoverNavPlatform() {
        scrollIntoView(navPlatform);
        hover(navPlatform, "Platform");
    }

    @FindBy(xpath = "//*[@id='menu-item-10587']/a")
    private WebElement navSolutions;

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

    //hover navSolutions
    public void hoverNavSolutions() {
        scrollIntoView(navSolutions);
        hover(navSolutions, "Solutions");
    }

    @FindBy(xpath = "//*[@id='menu-item-10603']/a")
    private WebElement navPricing;

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

    //hover navPricing
    public void hoverNavPricing() {
        scrollIntoView(navPricing);
        hover(navPricing, "Pricing");
    }

    @FindBy(xpath = "//*[@id='menu-item-10607']/a")
    private WebElement navResources;

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

    //hover navResources
    public void hoverNavResources() {
        scrollIntoView(navResources);
        hover(navResources, "Resources");
    }

    @FindBy(xpath = "//*[@id='menu-item-10644']/a")
    private WebElement navPartners;

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

    //hover navPartners
    public void hoverNavPartners() {
        scrollIntoView(navPartners);
        hover(navPartners, "Partners");
    }

    @FindBy(xpath = "//*[@id='menu-item-10667']/a")
    private WebElement navAbout;

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

    //hover navAbout
    public void hoverNavAbout() {
        scrollIntoView(navAbout);
        hover(navAbout, "About");
    }

    @FindBy(xpath = "//*[@id='menu-item-16549']/a")
    private WebElement navSupport;

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

    //hover navSupport
    public void hoverNavSupport() {
        scrollIntoView(navSupport);
        hover(navSupport, "Support");
    }

    /* ---------- Utility links / icons ---------- */
    @FindBy(xpath = "//*[@id='menu-item-12172']/a")
    private WebElement linkHowToOpenFile;

    //How to open a seclore file isDispayed
    public boolean linkHowToOpenFileIsDisplayed() {
        scrollIntoView(linkHowToOpenFile);
        return isDisplayed(linkHowToOpenFile);
    }

    public void clickLinkHowToOpenFile() {
        scrollIntoView(linkHowToOpenFile);
        click(linkHowToOpenFile, "How to open a seclore file");
    }

    @FindBy(xpath = "menu-item-5371")
    private WebElement iconSearch;

    //Search isDispayed
    public boolean iconSearchIsDisplayed() {
        scrollIntoView(iconSearch);
        return isDisplayed(iconSearch);
    }

    public void clickIconSearch() {
        scrollIntoView(iconSearch);
        click(iconSearch, "Search");
    }

    @FindBy(xpath = "//*[@id='menu-item-5372']/a")
    private WebElement iconLanguage;

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
    @FindBy(xpath = "(//*[text() = 'Get a demo'])[2]")
    private WebElement btnGetADemo;

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

    //hover btnGetADemo
    public void hoverBtnGetADemo() {
        scrollIntoView(btnGetADemo);
        hover(btnGetADemo, "Get a demo");
    }
}
