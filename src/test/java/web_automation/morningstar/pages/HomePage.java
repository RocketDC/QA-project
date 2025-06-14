package web_automation.morningstar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import web_automation.morningstar.base.TestBase;

public class HomePage extends TestBase{
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Landing page Advertisement
    // Advertisement image
    @FindBy(id = "sasia-fcid-217003")
    private WebElement advertisementImage;

    public boolean isAdvertisementImageDisplayed() {
        return isDisplayed(advertisementImage);
    }

    public void clickOnAdvertisementImage() {
        click(advertisementImage, "Advertisement Image");
    }
    
    // Morningstar logo
    @FindBy(xpath = "//img[@alt='Morningstar India']")
    private WebElement morningstarLogo;

    public boolean isMorningstarLogoDisplayed() {
        return isDisplayed(morningstarLogo);
    }

    public void clickOnMorningstarLogo() {
        click(morningstarLogo, "Morningstar Logo");
    }

    // Direct to morningstar india clickable text
    @FindBy(xpath = "//*[@class='skipAd']")
    private WebElement morningstarIndiaClickableText;

    public boolean isMorningstarIndiaClickableTextDisplayed() {
        return isDisplayed(morningstarIndiaClickableText);
    }

    public void clickOnMorningstarIndiaClickableText() {
        click(morningstarIndiaClickableText, "Morningstar India Clickable Text");
    }

    public void validateTextDirectToMorningstarIndia(String expectedText) {
        softAssert(morningstarIndiaClickableText, expectedText);
    }

    //Skip Adv text
    @FindBy(id = "lnkSkipAd")
    private WebElement skipAdvText;

    public boolean isSkipAdvTextDisplayed() {
        return isDisplayed(skipAdvText);
    }

    public void clickOnSkipAdvText() {
        click(skipAdvText, "Skip Adv Text");
    }

    public void validateTextSkipAdv(String expectedText) {
        softAssert(skipAdvText, expectedText);
    }
}
