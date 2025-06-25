package web_automation.seclore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import web_automation.seclore.base.TestBase;
import org.openqa.selenium.WebElement;

public class GetADemo extends TestBase{
    WebDriver driver;

    public GetADemo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //This class is used to store all the locators and methods for the Get a Demo page
    //@FindBy is used to store the locators

    //Seclore logo locator
    @FindBy(xpath = "//img[@alt='Seclore']")
    public WebElement secloreLogo;

    public boolean secloreLogoIsDisplayed() {
        scrollIntoView(secloreLogo);
        return isDisplayed(secloreLogo);
    }

    public void clickSecloreLogo() {
        scrollIntoView(secloreLogo);
        click(secloreLogo, "Seclore Logo");
    }

    @FindBy(xpath = "//h1[contains(text(),'Share Data Fearlessly')]")
    public WebElement headerShareDataFearlessly;

    public boolean headerShareDataFearlesslyIsDisplayed() {
        scrollIntoView(headerShareDataFearlessly);
        return isDisplayed(headerShareDataFearlessly);
    }

    public void validateTextOfHeaderShareDataFearlessly(String text) {
        softAssert(headerShareDataFearlessly, text);
    }
    

    @FindBy(xpath = "//h2[contains(text(),'Protect & control your digital assets wherever they go')]")
    public WebElement subHeaderProtectControl;

    public boolean subHeaderProtectControlIsDisplayed() {
        scrollIntoView(subHeaderProtectControl);
        return isDisplayed(subHeaderProtectControl);
    }

    public void validateTextOfSubHeaderProtectControl(String text) {
        softAssert(subHeaderProtectControl, text);
    }

    @FindBy(xpath = "//li[contains(text(),'Digital asset security')]")
    public WebElement listDigitalAssetSecurity;

    public boolean listDigitalAssetSecurityIsDisplayed() {
        scrollIntoView(listDigitalAssetSecurity);
        return isDisplayed(listDigitalAssetSecurity);
    }

    public void validateTextOfListDigitalAssetSecurity(String text) {
        softAssert(listDigitalAssetSecurity, text);
    }

    @FindBy(xpath = "//li[contains(text(),'Granular access and privacy controls')]")
    public WebElement listGranularAccess;

    public boolean listGranularAccessIsDisplayed() {
        scrollIntoView(listGranularAccess);
        return isDisplayed(listGranularAccess);
    }

    public void validateTextOfListGranularAccess(String text) {
        softAssert(listGranularAccess, text);
    }

    @FindBy(xpath = "//li[contains(text(),'Never lose control or visibility')]")
    public WebElement listNeverLoseControl;

    public boolean listNeverLoseControlIsDisplayed() {
        scrollIntoView(listNeverLoseControl);
        return isDisplayed(listNeverLoseControl);
    }

    public void validateTextOfListNeverLoseControl(String text) {
        softAssert(listNeverLoseControl, text);
    }

    @FindBy(xpath = "//a[contains(text(),\"See Seclore’s data-centric security in action\")]")
    public WebElement linkSeeDataCentricSecurity;

    public boolean linkSeeDataCentricSecurityIsDisplayed() {
        scrollIntoView(linkSeeDataCentricSecurity);
        return isDisplayed(linkSeeDataCentricSecurity);
    }

    public void validateTextOfLinkSeeDataCentricSecurity(String text) {
        softAssert(linkSeeDataCentricSecurity, text);
    }

    @FindBy(xpath = "//h1[contains(text(),'Request a personalized demo')]")
    public WebElement headerRequestDemo;

    public boolean headerRequestDemoIsDisplayed() {
        scrollIntoView(headerRequestDemo);
        return isDisplayed(headerRequestDemo);
    }

    public void validateTextOfHeaderRequestDemo(String text) {
        softAssert(headerRequestDemo, text);
    }
    //Label Business Email
    @FindBy(xpath = "//label[contains(text(),'Business Email')]")
    public WebElement labelBusinessEmail;

    public boolean labelBusinessEmailIsDisplayed() {
        scrollIntoView(labelBusinessEmail);
        return isDisplayed(labelBusinessEmail);
    }

    public void validateTextOfLabelBusinessEmail(String text) {
        softAssert(labelBusinessEmail, text);
    }

    //Input Business Email
    @FindBy(xpath = "//label[contains(text(),'Business Email')]/following-sibling::input")
    public WebElement inputBusinessEmail;

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
    @FindBy(xpath = "//label[contains(text(),'First Name')]")
    public WebElement labelFirstName;

    public boolean labelFirstNameIsDisplayed() {
        scrollIntoView(labelFirstName);
        return isDisplayed(labelFirstName);
    }

    public void validateTextOfLabelFirstName(String text) {
        softAssert(labelFirstName, text);
    }

    //Input First Name
    @FindBy(xpath = "//label[contains(text(),'First Name')]/following-sibling::input")
    public WebElement inputFirstName;
    

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

    @FindBy(xpath = "//label[contains(text(),'Last Name')]")
    public WebElement labelLastName;

    public boolean labelLastNameIsDisplayed() {
        scrollIntoView(labelLastName);
        return isDisplayed(labelLastName);
    }

    public void validateTextOfLabelLastName(String text) {
        softAssert(labelLastName, text);
    }

//Input Last Name
    @FindBy(xpath = "//label[contains(text(),'Last Name')]/following-sibling::input")
    public WebElement inputLastName;

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
    @FindBy(xpath = "//label[contains(text(),'Company name')]")
    public WebElement labelCompanyName;

    public boolean labelCompanyNameIsDisplayed() {
        scrollIntoView(labelCompanyName);
        return isDisplayed(labelCompanyName);
    }

    public void validateTextOfLabelCompanyName(String text) {
        softAssert(labelCompanyName, text);
    }

    //Input Company Name
    @FindBy(xpath = "//label[contains(text(),'Company name')]/following-sibling::input")
    public WebElement inputCompanyName;

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
    @FindBy(xpath = "//label[contains(text(),'Job title')]")
    public WebElement labelJobTitle;

    public boolean labelJobTitleIsDisplayed() {
        scrollIntoView(labelJobTitle);
        return isDisplayed(labelJobTitle);
    }

    public void validateTextOfLabelJobTitle(String text) {
        softAssert(labelJobTitle, text);
    }
//Input Job Title
    @FindBy(xpath = "//label[contains(text(),'Job title')]/following-sibling::input")
    public WebElement inputJobTitle;

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
    @FindBy(xpath = "//label[contains(text(),'Phone number')]")
    public WebElement labelPhoneNumber;

    public boolean labelPhoneNumberIsDisplayed() {
        scrollIntoView(labelPhoneNumber);
        return isDisplayed(labelPhoneNumber);
    }

    public void validateTextOfLabelPhoneNumber(String text) {
        softAssert(labelPhoneNumber, text);
    }   
    //Input Phone Number
    @FindBy(xpath = "//label[contains(text(),'Phone number')]/following-sibling::input")
    public WebElement inputPhoneNumber;

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
    @FindBy(xpath = "//label[contains(text(),'Country')]")
    public WebElement labelCountry;

    public boolean labelCountryIsDisplayed() {
        scrollIntoView(labelCountry);
        return isDisplayed(labelCountry);
    }

    public void validateTextOfLabelCountry(String text) {
        softAssert(labelCountry, text);
    }    
    //Input Country
    @FindBy(xpath = "//label[contains(text(),'Country')]/following-sibling::input")
    public WebElement inputCountry;

    public boolean inputCountryIsDisplayed() {
        scrollIntoView(inputCountry);
        return isDisplayed(inputCountry);
    }
    // Need to enter input in country
    public void enterInputInCountry(String country) {
        scrollIntoView(inputCountry);
        sendKeys(inputCountry, country);
    }
    //Need to validate placeholder text
    public void validatePlaceholderTextOfInputCountry(String text) {
        validatePlaceholderText(inputCountry, text);
    }
    
    //Submit Button
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButton;

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
    @FindBy(xpath = "//a[contains(text(),'Back to Home')]")
    public WebElement linkBackToHome;

    public boolean linkBackToHomeIsDisplayed() {
        scrollIntoView(linkBackToHome);
        return isDisplayed(linkBackToHome);
    }
    // Need to click on back to home
    public void clickOnLinkBackToHome() {
        scrollIntoView(linkBackToHome);
        click(linkBackToHome, "Back to Home");
    }
    
    
}


