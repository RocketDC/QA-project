package web_automation.citiusTech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import web_automation.citiusTech.base.TestBase;

public class HomePage extends TestBase{
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //This class is used to store all the locators and methods for the Homepage
    //@FindBy is used to store the locators

    // ===========================(NAV Buttons section)===========================
//Cookie Banner locator
    @FindBy(xpath = "//div[@id='hs-eu-cookie-confirmation-inner']")
    public WebElement cookieBanner;
    //Cookie Banner Accept Button locator
    @FindBy(xpath = "//button[@aria-label='Accept']")
    public WebElement cookieBannerAcceptButton;
    //Citius Tech logo locator
    @FindBy(xpath = "(//img[@title='CitiusTech'])[1]")
    public WebElement citiusTechLogo;
    //What we do Nav locator
    @FindBy(xpath = "//a[normalize-space()='What we do']")
    public WebElement whatWeDoNav;
    // What we do Nav Heading locator
    @FindBy(xpath = "//p[@class='citius-glb-heading-p' and text()='What we do']")
    public WebElement whatWeDoNavHeading;

    // Who we are Nav locator
    @FindBy(xpath = "//a[normalize-space()='Who we are']")
    public WebElement whoWeAreNav;
    // Who we are Nav Heading locator
    @FindBy(xpath = "//p[@class='citius-glb-heading-p' and text()='Who we are']")
    public WebElement whoWeAreNavHeading;

    // what we think Nav locator
    @FindBy(xpath = "//a[normalize-space()='What we think']")
    public WebElement whatWeThinkNav;

    // What we think Nav Heading locator
    @FindBy(xpath = "//p[@class='citius-glb-heading-p' and text()='What we think']")
    public WebElement whatWeThinkNavHeading;
    // Partners Nav locator
    @FindBy(xpath = "//a[normalize-space()='Partners']")
    public WebElement partnersNav;

    // Partners Nav Heading locator
    @FindBy(xpath = "//p[@class='citius-glb-heading-p' and text()='Partners']")
    public WebElement partnersNavHeading;
    // Careers Nav locator
    @FindBy(xpath = "//a[normalize-space()='Careers']")
    public WebElement careersNav;
    // Hiring Scam Alert Box locator
    @FindBy(xpath = "//div[@class='row-fluid']")
    public WebElement hiringScamAlertBox;
    // Hiring Scam Alert Box cross icon locator
    @FindBy(xpath = "//div[@class='row-fluid']//a[@class='close']")
    public WebElement hiringScamAlertBoxCrossIcon;

    // Contact Us Nav locator
    @FindBy(xpath = "(//div[@class='citius-contact-button'])[1]")
    public WebElement contactUsNav;
    // Search Icon Nav locator
    @FindBy(xpath = "//a[@class='button'][normalize-space()='Search']")
    public WebElement searchIconNav;


// ===========================(NAV Buttons section)===========================

    public boolean citiusTechLogoIsDisplayed() {
        scrollIntoView(citiusTechLogo);
        return isDisplayed(citiusTechLogo);
    }

    public void clickCitiusTechLogo() {
        scrollIntoView(citiusTechLogo);
        click(citiusTechLogo, "Citius Tech logo");
    }


    public boolean whatWeDoNavIsDisplayed() {
        scrollIntoView(whatWeDoNav);
        return isDisplayed(whatWeDoNav);
    }

    public void hoverWhatWeDoNav() {
        hover(whatWeDoNav, "What We Do Nav");
    }

    public boolean setWhatWeDoNavHeadingIsDisplayed() {
        scrollIntoView(whatWeDoNavHeading);
        return isDisplayed(whatWeDoNavHeading);
    }

    public void validateTextOfWhatWeDoNavHeading(String text) {
        softAssert(whatWeDoNavHeading, text);
    }

    public void validateTextOfWhatWeDoNav(String text) {
        softAssert(whatWeDoNav, text);
    }

    public boolean whoWeAreNavIsDisplayed() {
        scrollIntoView(whoWeAreNav);
        return isDisplayed(whoWeAreNav);
    }

    public void clickWhoWeAreNav() {
        scrollIntoView(whoWeAreNav);
        click(whoWeAreNav, "Who we are Nav");
    }

    public void validateTextOfWhoWeAreNav(String text) {
        softAssert(whoWeAreNav, text);
    }

    public boolean whoWeAreNavHeadingIsDisplayed() {
        scrollIntoView(whoWeAreNavHeading);
        return isDisplayed(whoWeAreNavHeading);
    }
    //hovering the Who We Are Nav to display the heading
    public void hoverWhoWeAreNav() {
        hover(whoWeAreNav, "Who We Are Nav");
    }

    public void validateTextOfWhoWeAreNavHeading(String text) {
        softAssert(whoWeAreNavHeading, text);
    }

    public boolean whatWeThinkNavIsDisplayed() {
        scrollIntoView(whatWeThinkNav);
        return isDisplayed(whatWeThinkNav);
    }

    public void hoverWhatWeThinkNav() {
        hover(whatWeThinkNav, "What We Think Nav");
    }
    public boolean whatWeThinkNavHeadingIsDisplayed() {
        scrollIntoView(whatWeThinkNavHeading);
        return isDisplayed(whatWeThinkNavHeading);
    }
    public void validateTextOfWhatWeThinkNavHeading(String text) {
        softAssert(whatWeThinkNavHeading, text);
    }


    public void clickWhatWeThinkNav() {
        scrollIntoView(whatWeThinkNav);
        click(whatWeThinkNav, "What we think Nav");
    }

    public void validateTextOfWhatWeThinkNav(String text) {
        softAssert(whatWeThinkNav, text);
    }



    public boolean partnersNavIsDisplayed() {
        scrollIntoView(partnersNav);
        return isDisplayed(partnersNav);
    }

    public void clickPartnersNav() {
        scrollIntoView(partnersNav);
        click(partnersNav, "Partners Nav");
    }

    public void validateTextOfPartnersNav(String text) {
        softAssert(partnersNav, text);
    }

    public boolean partnersNavHeadingIsDisplayed() {
        scrollIntoView(partnersNavHeading);
        return isDisplayed(partnersNavHeading);
    }
    public void hoverPartnersNav() {
        hover(partnersNav, "Partners Nav");
    }
    public void validateTextOfPartnersNavHeading(String text) {
        softAssert(partnersNavHeading, text);
    }

    public boolean careersNavIsDisplayed() {
        scrollIntoView(careersNav);
        return isDisplayed(careersNav);
    }

    public boolean hiringScamAlertBoxIsDisplayed() {
        scrollIntoView(hiringScamAlertBox);
        return isDisplayed(hiringScamAlertBox);
    }
    public void clickCareersNav() {
        scrollIntoView(careersNav);
        click(careersNav, "Careers Nav");
    }

    public void validateTextOfCareersNav(String text) {
        softAssert(careersNav, text);
    }

    public boolean contactUsNavIsDisplayed() {
        scrollIntoView(contactUsNav);
        return isDisplayed(contactUsNav);
    }

    public void clickContactUsNav() {
        scrollIntoView(contactUsNav);
        click(contactUsNav, "Contact Us Nav");
    }

    public void validateTextOfContactUsNav(String text) {
        softAssert(contactUsNav, text);
    }

    public boolean searchIconNavIsDisplayed() {
        scrollIntoView(searchIconNav);
        return isDisplayed(searchIconNav);
    }

    public void clickSearchIconNav() {
        scrollIntoView(searchIconNav);
        click(searchIconNav, "Search Icon Nav");
    }
    // Cookie Banner methods
    public boolean cookieBannerIsDisplayed() {
        return isDisplayed(cookieBanner);
    }

    public  boolean cookieBannerAcceptButtonIsDisplayed() {
        scrollIntoView(cookieBannerAcceptButton);
        return isDisplayed(cookieBannerAcceptButton);
    }
    public void clickCookieBannerAcceptButton() {
        scrollIntoView(cookieBannerAcceptButton);
        click(cookieBannerAcceptButton, "Cookie Banner Accept Button");
    }
}
