package web_automation.wissen.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import web_automation.wissen.base.TestBase;

public class HomePage extends TestBase {
    WebDriver driver;

    // ========== Constructor ==========
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ========== Locators ==========
    //Wissen Logo
    @FindBy(xpath = "//*[@class='nav-logo-2']")
    private WebElement wissenLogo;

    //Contact Us Link
    @FindBy(xpath = "//*[@id='w-dropdown-toggle-5']")
    private WebElement contactUsLink;

    //Write to Us
    @FindBy(xpath = "//p[text()='Write to Us']")
    private WebElement writeToUsLink;
    
    // Location navigation link
    @FindBy(xpath = "//a[@href='/contact/location']")
    private WebElement locationLink;
    
    // ========== Actions ==========

    public boolean isWissenLogoDisplayed() {
        scrollIntoView(wissenLogo);
        return isDisplayed(wissenLogo);
    }

    public boolean isContactUsLinkDisplayed() {
        scrollIntoView(contactUsLink);
        return isDisplayed(contactUsLink);
    }
    public void validateTextOfContactUsLink(String text) {
        softAssert(contactUsLink, text);
    }
    public void hoverContactUs() {
        scrollIntoView(contactUsLink);
        hover(contactUsLink, "Contact Us Link");
    }

    public boolean isWriteToUsLinkDisplayed() {
        scrollIntoView(writeToUsLink);
        return isDisplayed(writeToUsLink);
    }
    
    public void validateTextOfWriteToUsLink(String text) {
        softAssert(writeToUsLink, text);
    }
    public void clickWriteToUs() {
        scrollIntoView(writeToUsLink);
        click(writeToUsLink, "Write To Us Link");
    }
    
    
    public boolean isLocationLinkDisplayed() {
        scrollIntoView(locationLink);
        return isDisplayed(locationLink);
    }
    public void clickLocationLink() {
        scrollIntoView(locationLink);
        click(locationLink, "LocationLink");
    }
}
