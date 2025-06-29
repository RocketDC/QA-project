package web_automation.seclore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import web_automation.seclore.base.TestBase;
import org.openqa.selenium.WebElement;

public class GetADemoPage extends TestBase{
    WebDriver driver;

    public GetADemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //This class is used to store all the locators and methods for the Get a Demo page
    //@FindBy is used to store the locators

    //Seclore logo locator
    @FindBy(xpath = "//a[@class='site-logo lazyloaded']")
    private WebElement secloreLogo;

    public boolean secloreLogoIsDisplayed() {
        scrollIntoView(secloreLogo);
        return isDisplayed(secloreLogo);
    }

    public void clickSecloreLogo() {
        scrollIntoView(secloreLogo);
        click(secloreLogo, "Seclore Logo");
    }

    @FindBy(xpath = "//h1[@class='wp-block-heading']")
    private WebElement headerShareDataFearlessly;

    public boolean headerShareDataFearlesslyIsDisplayed() {
        scrollIntoView(headerShareDataFearlessly);
        return isDisplayed(headerShareDataFearlessly);
    }

    public void validateTextOfHeaderShareDataFearlessly(String text) {
        softAssert(headerShareDataFearlessly, text);
    }
    

    @FindBy(xpath = "//h2[contains(text(),'Protect & control your digital assets wherever the')]")
    private WebElement subHeaderProtectControl;

    public boolean subHeaderProtectControlIsDisplayed() {
        scrollIntoView(subHeaderProtectControl);
        return isDisplayed(subHeaderProtectControl);
    }

    public void validateTextOfSubHeaderProtectControl(String text) {
        softAssert(subHeaderProtectControl, text);
    }

    @FindBy(xpath = "//li[contains(text(),'Digital asset security for every user, device, app')]")
    private WebElement listDigitalAssetSecurity;

    public boolean listDigitalAssetSecurityIsDisplayed() {
        scrollIntoView(listDigitalAssetSecurity);
        return isDisplayed(listDigitalAssetSecurity);
    }

    public void validateTextOfListDigitalAssetSecurity(String text) {
        softAssert(listDigitalAssetSecurity, text);
    }

    @FindBy(xpath = "//li[@class='lazyloaded']")
    private WebElement listGranularAccess;

    public boolean listGranularAccessIsDisplayed() {
        scrollIntoView(listGranularAccess);
        return isDisplayed(listGranularAccess);
    }

    public void validateTextOfListGranularAccess(String text) {
        softAssert(listGranularAccess, text);
    }

    @FindBy(xpath = "//li[contains(text(),'Never lose control or visibility of your digital a')]")
    private WebElement listNeverLoseControl;

    public boolean listNeverLoseControlIsDisplayed() {
        scrollIntoView(listNeverLoseControl);
        return isDisplayed(listNeverLoseControl);
    }

    public void validateTextOfListNeverLoseControl(String text) {
        softAssert(listNeverLoseControl, text);
    }

    @FindBy(xpath = "//h2[contains(text(),'See Seclore’s data-centric security in action.')]")
    private WebElement linkSeeDataCentricSecurity;

    public boolean linkSeeDataCentricSecurityIsDisplayed() {
        scrollIntoView(linkSeeDataCentricSecurity);
        return isDisplayed(linkSeeDataCentricSecurity);
    }

    public void validateTextOfLinkSeeDataCentricSecurity(String text) {
        softAssert(linkSeeDataCentricSecurity, text);
    }

    @FindBy(xpath = "//h3[normalize-space()='Request a personalized demo']")
    private WebElement headerRequestDemo;

    public boolean headerRequestDemoIsDisplayed() {
        scrollIntoView(headerRequestDemo);
        return isDisplayed(headerRequestDemo);
    }

    public void validateTextOfHeaderRequestDemo(String text) {
        softAssert(headerRequestDemo, text);
    }
    //Label Business Email
    @FindBy(xpath = "//span[normalize-space()='Business Email']")
    private WebElement labelBusinessEmail;

    public boolean labelBusinessEmailIsDisplayed() {
        scrollIntoView(labelBusinessEmail);
        return isDisplayed(labelBusinessEmail);
    }

    public void validateTextOfLabelBusinessEmail(String text) {
        softAssert(labelBusinessEmail, text);
    }

    //Input Business Email
    @FindBy(xpath = "//input[@id='email-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement inputBusinessEmail;

    public boolean inputBusinessEmailIsDisplayed() {
        scrollIntoView(inputBusinessEmail);
        return isDisplayed(inputBusinessEmail);
    }

    // Need to enter input in email
    public void enterInputInEmail(String email) {
        scrollIntoView(inputBusinessEmail);
        sendKeys(inputBusinessEmail, email);
    }
    //Need to validate placeholder text
    public void validatePlaceholderTextOfInputBusinessEmail(String text) {
        validatePlaceholderText(inputBusinessEmail, text);
    }

    //Label First Name
    @FindBy(xpath = "//span[normalize-space()='First Name']")
    private WebElement labelFirstName;

    public boolean labelFirstNameIsDisplayed() {
        scrollIntoView(labelFirstName);
        return isDisplayed(labelFirstName);
    }

    public void validateTextOfLabelFirstName(String text) {
        softAssert(labelFirstName, text);
    }

    //Input First Name
    @FindBy(xpath = "//input[@id='firstname-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement inputFirstName;
    

    public boolean inputFirstNameIsDisplayed() {
        scrollIntoView(inputFirstName);
        return isDisplayed(inputFirstName);
    }
// Need to enter input in first name
public void enterInputInFirstName(String firstName) {
    scrollIntoView(inputFirstName);
    sendKeys(inputFirstName, firstName);
}
//Need to validate placeholder text
public void validatePlaceholderTextOfInputFirstName(String text) {
    validatePlaceholderText(inputFirstName, text);
}
//Label Last Name

    @FindBy(xpath = "//label[@id='label-lastname-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement labelLastName;

    public boolean labelLastNameIsDisplayed() {
        scrollIntoView(labelLastName);
        return isDisplayed(labelLastName);
    }

    public void validateTextOfLabelLastName(String text) {
        softAssert(labelLastName, text);
    }

//Input Last Name
    @FindBy(xpath = "//input[@id='lastname-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement inputLastName;

    public boolean inputLastNameIsDisplayed() {
        scrollIntoView(inputLastName);
        return isDisplayed(inputLastName);
    }
    // Need to enter input in last name
    public void enterInputInLastName(String lastName) {
        scrollIntoView(inputLastName);
        sendKeys(inputLastName, lastName);
    }
    //Need to validate placeholder text
    public void validatePlaceholderTextOfInputLastName(String text) {
        validatePlaceholderText(inputLastName, text);
    }

    //Label Company Name
    @FindBy(xpath = "//label[@id='label-company-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement labelCompanyName;

    public boolean labelCompanyNameIsDisplayed() {
        scrollIntoView(labelCompanyName);
        return isDisplayed(labelCompanyName);
    }

    public void validateTextOfLabelCompanyName(String text) {
        softAssert(labelCompanyName, text);
    }

    //Input Company Name
    @FindBy(xpath = "//input[@id='company-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement inputCompanyName;

    public boolean inputCompanyNameIsDisplayed() {
        scrollIntoView(inputCompanyName);
        return isDisplayed(inputCompanyName);
    }
    // Need to enter input in company name
    public void enterInputInCompanyName(String companyName) {
        scrollIntoView(inputCompanyName);
        sendKeys(inputCompanyName, companyName);
    }
    //Need to validate placeholder text
    public void validatePlaceholderTextOfInputCompanyName(String text) {
        validatePlaceholderText(inputCompanyName, text);
    }
    //Label Job Title
    @FindBy(xpath = "//span[normalize-space()='Job title']")
    private WebElement labelJobTitle;

    public boolean labelJobTitleIsDisplayed() {
        scrollIntoView(labelJobTitle);
        return isDisplayed(labelJobTitle);
    }

    public void validateTextOfLabelJobTitle(String text) {
        softAssert(labelJobTitle, text);
    }
//Input Job Title
    @FindBy(xpath = "//input[@id='jobtitle-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement inputJobTitle;

    public boolean inputJobTitleIsDisplayed() {
        scrollIntoView(inputJobTitle);
        return isDisplayed(inputJobTitle);
    }
    // Need to enter input in job title
    public void enterInputInJobTitle(String jobTitle) {
        scrollIntoView(inputJobTitle);
        sendKeys(inputJobTitle, jobTitle);
    }
    //Need to validate placeholder text
    public void validatePlaceholderTextOfInputJobTitle(String text) {
        validatePlaceholderText(inputJobTitle, text);
    }
    //Label Phone Number
    @FindBy(xpath = "//span[normalize-space()='Phone number']")
    private WebElement labelPhoneNumber;

    public boolean labelPhoneNumberIsDisplayed() {
        scrollIntoView(labelPhoneNumber);
        return isDisplayed(labelPhoneNumber);
    }

    public void validateTextOfLabelPhoneNumber(String text) {
        softAssert(labelPhoneNumber, text);
    }   
    //Input Phone Number
    @FindBy(xpath = "//input[@id='phone-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement inputPhoneNumber;

    public boolean inputPhoneNumberIsDisplayed() {
        scrollIntoView(inputPhoneNumber);
        return isDisplayed(inputPhoneNumber);
    }
    // Need to enter input in phone number
    public void enterInputInPhoneNumber(String phoneNumber) {
        scrollIntoView(inputPhoneNumber);
        sendKeys(inputPhoneNumber, phoneNumber);
    }
    //Need to validate placeholder text
    public void validatePlaceholderTextOfInputPhoneNumber(String text) {
        validatePlaceholderText(inputPhoneNumber, text);
    }

    //Label Country 
    @FindBy(xpath = "//span[normalize-space()='Country']")
    private WebElement labelCountry;

    public boolean labelCountryIsDisplayed() {
        scrollIntoView(labelCountry);
        return isDisplayed(labelCountry);
    }

    public void validateTextOfLabelCountry(String text) {
        softAssert(labelCountry, text);
    }    
    //Input Country
    @FindBy(xpath = "//select[@id='country-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement inputCountry;

    public boolean inputCountryIsDisplayed() {
        scrollIntoView(inputCountry);
        return isDisplayed(inputCountry);
    }
    // Need to enter input in country
    public void selectIndiaFromDropdown(String country) {
        scrollIntoView(inputCountry);
        selectFromDropdown(inputCountry, country, "Selecting "+ country);
    }
    //Need to validate placeholder text
    public void validatePlaceholderTextOfInputCountry(String text) {
        validatePlaceholderText(inputCountry, text);
    }

    //Label State
    @FindBy(xpath = "//label[@id='label-india_states-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement labelState;

    public boolean labelStateIsDisplayed() {
        scrollIntoView(labelState);
        return isDisplayed(labelState);
    }
    public void validateTextOfLabelState(String text) {
        softAssert(labelState, text);
    }
    //Input State
    @FindBy(xpath = "//select[@id='india_states-b43dfbf4-98dd-4008-ab59-8a347a8b5456']")
    private WebElement inputState;

    public boolean inputStateIsDisplayed() {
        scrollIntoView(inputState);
        return isDisplayed(inputState);
    }
    // Need to enter input in state
    public void selectStateFromDropdown(String state) {
        scrollIntoView(inputState);
        selectFromDropdown(inputState, state, "Selecting " + state);
    }
    //Submit Button
    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitButton;

    public boolean submitButtonIsDisplayed() {
        scrollIntoView(submitButton);
        return isDisplayed(submitButton);
    }
    // Need to click on submit button
    public void clickOnSubmitButton() {
        scrollIntoView(submitButton);
        click(submitButton, "Submit");
    }
    //Validate text on submit button
    public void validateTextOfSubmitButton(String text) {
        softAssert(submitButton, text);
    }
    //Link Back to Home
    @FindBy(xpath = "//a[normalize-space()='Back to Home']")
    private WebElement linkBackToHome;

    public boolean linkBackToHomeIsDisplayed() {
        scrollIntoView(linkBackToHome);
        return isDisplayed(linkBackToHome);
    }
    // Need to click on back to home
    public void clickOnLinkBackToHome() {
        scrollIntoView(linkBackToHome);
        click(linkBackToHome, "Back to Home");
    }

    //iframe with id hs-form-iframe-0
    @FindBy(xpath = "//iframe[@id='hs-form-iframe-0']")
    private WebElement iframe;

    public boolean ifPesonalisedDemoIframeIsDisplayed() {
        scrollIntoView(iframe);
        return isDisplayed(iframe);
    }

    public void switchToPesonalisedDemoIframe() {
        switchToFrame(iframe);
    }
    public void switchToDefaultSecloreContent() {
        switchToDefaultContent();
    }


    
}


