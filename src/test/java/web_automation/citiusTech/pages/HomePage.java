package web_automation.citiusTech.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import web_automation.citiusTech.base.TestBase;

public class HomePage extends TestBase{
    //This class is used to store all the locators and methods for the Homepage
    //@FindBy is used to store the locators

    //Contact Us button locator
    @FindBy(xpath = "//a[@class='button'][normalize-space()='Contact']") 
    public WebElement contactUsButton;

    //Method to check if Contact Us button is displayed
    public boolean contactUsButtonIsDisplayed() {
        scrollIntoView(contactUsButton);
        return isDisplayed(contactUsButton);
    }

    //Method to click on the Contact Us button
    public void clickContactUsButton() {
        scrollIntoView(contactUsButton);
        click(contactUsButton, "Contact Us button");
    }

    //Method to validate the text of the Contact Us button
    public void validateTextOfContactUsButton(String text) {
        softAssert(contactUsButton, text);
    }

    
}
