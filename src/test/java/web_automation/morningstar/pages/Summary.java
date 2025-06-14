package web_automation.morningstar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web_automation.morningstar.base.TestBase;

public class Summary extends TestBase {
    WebDriver driver;

    public Summary(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Summary Title
    @FindBy(id = "SummaryTitle")
    private WebElement summaryTitle;

    public boolean isSummaryTitleDisplayed() {
        return isDisplayed(summaryTitle);
    }

    public void validateTextSummaryTitle(String expectedText) {
        softAssert(summaryTitle, expectedText);
    }

    // Summary heading
    @FindBy(id = "SummaryHeading")
    private WebElement summaryHeading;

    public boolean isSummaryHeadingDisplayed() {
        return isDisplayed(summaryHeading);
    }

    public void validateTextSummaryHeading(String expectedText) {
        softAssert(summaryHeading, expectedText);
    }

    // Summary sub-heading
    @FindBy(id = "SummarySubHeading")
    private WebElement summarySubHeading;

    public boolean isSummarySubHeadingDisplayed() {
        return isDisplayed(summarySubHeading);
    }

    public void validateTextSummarySubHeading(String expectedText) {
        softAssert(summarySubHeading, expectedText);
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
