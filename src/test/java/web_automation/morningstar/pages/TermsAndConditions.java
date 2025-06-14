package web_automation.morningstar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web_automation.morningstar.base.TestBase;

public class TermsAndConditions extends TestBase {
    WebDriver driver;

    public TermsAndConditions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Terms and Conditions Title
    @FindBy(id = "TermsAndConditionsTitle")
    private WebElement termsAndConditionsTitle;

    public boolean isTermsAndConditionsTitleDisplayed() {
        return isDisplayed(termsAndConditionsTitle);
    }

    public void validateTextTermsAndConditionsTitle(String expectedText) {
        softAssert(termsAndConditionsTitle, expectedText);
    }

    //Terms and Conditions heading
    @FindBy(id = "TermsAndConditionsHeading")
    private WebElement termsAndConditionsHeading;

    public boolean isTermsAndConditionsHeadingDisplayed() {
        return isDisplayed(termsAndConditionsHeading);
    }

    public void validateTextTermsAndConditionsHeading(String expectedText) {
        softAssert(termsAndConditionsHeading, expectedText);
    }

    //Terms and Conditions sub-heading
    @FindBy(id = "TermsAndConditionsSubHeading")
    private WebElement termsAndConditionsSubHeading;

    public boolean isTermsAndConditionsSubHeadingDisplayed() {
        return isDisplayed(termsAndConditionsSubHeading);
    }

    public void validateTextTermsAndConditionsSubHeading(String expectedText) {
        softAssert(termsAndConditionsSubHeading, expectedText);
    }

    //Morningstar Investment Conference 2025 – India text in iframe
    @FindBy(id = "MorningstarInvestmentConference2025India")
    private WebElement morningstarInvestmentConference2025India;

    public boolean isMorningstarInvestmentConference2025IndiaDisplayed() {
        return isDisplayed(morningstarInvestmentConference2025India);
    }

    public void validateTextMorningstarInvestmentConference2025India(String expectedText) {
        softAssert(morningstarInvestmentConference2025India, expectedText);
    }

    // I agree to the terms and conditions. text
    @FindBy(id = "IAgreeToTheTermsAndConditions")
    private WebElement iAgreeToTheTermsAndConditions;

    public boolean isIAgreeToTheTermsAndConditionsDisplayed() {
        return isDisplayed(iAgreeToTheTermsAndConditions);
    }

    public void validateTextIAgreeToTheTermsAndConditions(String expectedText) {
        softAssert(iAgreeToTheTermsAndConditions, expectedText);
    }

    //I agree to the terms and conditions. checkbox
    @FindBy(id = "IAgreeToTheTermsAndConditions")
    private WebElement iAgreeToTheTermsAndConditionsCheckbox;

    public boolean isIAgreeToTheTermsAndConditionsCheckboxDisplayed() {
        return isDisplayed(iAgreeToTheTermsAndConditionsCheckbox);
    }

    public void validateTextIAgreeToTheTermsAndConditionsCheckbox(String expectedText) {
        softAssert(iAgreeToTheTermsAndConditionsCheckbox, expectedText);
    }

    // Previous Button
    @FindBy(id = "Previous")
    private WebElement previousButton;

    public boolean isPreviousButtonDisplayed() {
        return isDisplayed(previousButton);
    }

    public void validateTextPreviousButton(String expectedText) {
        softAssert(previousButton, expectedText);
    }

    public void clickPreviousButton() {
        click(previousButton, "Previous");
    }

    // Next Button
    @FindBy(id = "Next")
    private WebElement nextButton;

    public boolean isNextButtonDisplayed() {
        return isDisplayed(nextButton);
    }

    public void validateTextNextButton(String expectedText) {
        softAssert(nextButton, expectedText);
    }

    public void clickNextButton() {
        click(nextButton, "Next");
    }

    // Cancel Button
    @FindBy(id = "Cancel")
    private WebElement cancelButton;

    public boolean isCancelButtonDisplayed() {
        return isDisplayed(cancelButton);
    }

    public void validateTextCancelButton(String expectedText) {
        softAssert(cancelButton, expectedText);
    }

    public void clickCancelButton() {
        click(cancelButton, "Cancel");
    }
}
