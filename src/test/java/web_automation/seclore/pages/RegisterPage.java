package web_automation.seclore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import web_automation.seclore.base.TestBase;

public class RegisterPage extends TestBase{
    // This class is currently empty, but can be expanded with methods and elements related to the registration page.
    // For example, you might want to add fields for username, password, email, and methods to submit the registration form.
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Seclore Partner logo
    @FindBy(xpath = "(//img[@alt='Seclore Partner Center Logo'])[2]")
    private WebElement logoSeclorePartner;

    //Click seclore logo
    public void clickSecloreLogo() {
        scrollIntoView(logoSeclorePartner);
        click(logoSeclorePartner, "Seclore Partner Logo");
    }

    //Validate seclore logo is displayed
    public boolean isSecloreLogoDisplayed() {
        scrollIntoView(logoSeclorePartner);
        return isDisplayed(logoSeclorePartner);
    }
    
    //Login button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    //Click on Login Button
    public void clickLoginButton() {
        scrollIntoView(loginButton);
        click(loginButton, "Login Button");
    }

    //Validate Login button is displayed
    public boolean isLoginButtonDisplayed() {
        scrollIntoView(loginButton);
        return isDisplayed(loginButton);
    }
    //Validate text of Login button
    public void validateTextOfLoginButton(String text) {
        scrollIntoView(loginButton);
        softAssert(loginButton, text);
    }

    //Register button
    @FindBy(xpath = "//a[@href='/register']")
    private WebElement registerButton;

    //Click on Register Button
    public void clickRegisterButton() {
        scrollIntoView(registerButton);
        click(registerButton, "Register Button");
    }
    //Validate Register button is displayed
    public boolean isRegisterButtonDisplayed() {
        scrollIntoView(registerButton);
        return isDisplayed(registerButton);
    }
    //Validate text of Register button
    public void validateTextOfRegisterButton(String text) {
        scrollIntoView(registerButton);
        softAssert(registerButton, text);
    }


    //Register now to access your portal. text heading and sub-heading
    @FindBy(xpath = "//h1[contains(text(),'Register now to access your portal.')]")
    private WebElement registerHeading;

    //Validate Register heading is displayed
    public boolean isRegisterHeadingDisplayed() {
        scrollIntoView(registerHeading);
        return isDisplayed(registerHeading);
    }

    //Validate text of Register heading
    public void validateTextOfRegisterHeading(String text) {
        scrollIntoView(registerHeading);
        softAssert(registerHeading, text);
    }

    @FindBy(xpath = "//p[contains(text(),'Already have an account?')]")
    private WebElement alreadyHaveAccountText;

    //Validate Already have an account? text is displayed
    public boolean isAlreadyHaveAccountTextDisplayed() {
        scrollIntoView(alreadyHaveAccountText);
        return isDisplayed(alreadyHaveAccountText);
    }

    //Validate text of Already have an account? text
    public void validateTextOfAlreadyHaveAccountText(String text) {
        scrollIntoView(alreadyHaveAccountText);
        softAssert(alreadyHaveAccountText, text);
    }

    //Company name label and input field
    @FindBy(xpath = "//label[contains(text(),'Company Name')]")
    private WebElement companyNameLabel;

    //Validate Company Name label is displayed
    public boolean isCompanyNameLabelDisplayed() {
        scrollIntoView(companyNameLabel);
        return isDisplayed(companyNameLabel);
    }


    //Validate text of Company Name label
    public void validateTextOfCompanyNameLabel(String text) {
        scrollIntoView(companyNameLabel);
        softAssert(companyNameLabel, text);
    }
    @FindBy(xpath = "//input[@id='company_name']")
    private WebElement companyNameInput;

    //Validate Company Name input field is displayed
    public boolean isCompanyNameInputDisplayed() {
        scrollIntoView(companyNameInput);
        return isDisplayed(companyNameInput);
    }

    //Validate text of Company Name input field
    public void validatePlaceholderTextOfCompanyNameInput(String text) {
        scrollIntoView(companyNameInput);
        validatePlaceholderText(companyNameInput, text);
    }

    //Enter Company Name
    public void enterCompanyName(String companyName) {
        scrollIntoView(companyNameInput);
        sendKeys(companyNameInput, companyName);
    }
    
    //Email label and input field
    @FindBy(xpath = "//label[contains(text(),'Email')]")
    private WebElement emailLabel;

    //Validate Email label is displayed
    public boolean isEmailLabelDisplayed() {
        scrollIntoView(emailLabel);
        return isDisplayed(emailLabel);
    }

    //Validate text of Email label
    public void validateTextOfEmailLabel(String text) {
        scrollIntoView(emailLabel);
        softAssert(emailLabel, text);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    //Validate Email input field is displayed
    public boolean isEmailInputDisplayed() {
        scrollIntoView(emailInput);
        return isDisplayed(emailInput);
    }

    //Validate text of Email input field
    public void validatePlaceholderTextOfEmailInput(String text) {
        scrollIntoView(emailInput);
        validatePlaceholderText(emailInput, text);
    }

    //Enter Email
    public void enterEmail(String email) {
        scrollIntoView(emailInput);
        sendKeys(emailInput, email);
    }


    //First name label and input field
    @FindBy(xpath = "//label[contains(text(),'First Name')]")
    private WebElement firstNameLabel;
    //Validate First Name label is displayed
    public boolean isFirstNameLabelDisplayed() {
        scrollIntoView(firstNameLabel);
        return isDisplayed(firstNameLabel);
    }

    //Validate text of First Name label
    public void validateTextOfFirstNameLabel(String text) {
        scrollIntoView(firstNameLabel);
        softAssert(firstNameLabel, text);
    }

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstNameInput;
    //Validate First Name input field is displayed
    public boolean isFirstNameInputDisplayed() {
        scrollIntoView(firstNameInput);
        return isDisplayed(firstNameInput);
    }
    //Validate text of First Name input field
    public void validatePlaceholderTextOfFirstNameInput(String text) {
        scrollIntoView(firstNameInput);
        validatePlaceholderText(firstNameInput, text);
    }
    //Enter First Name
    public void enterFirstName(String firstName) {
        scrollIntoView(firstNameInput);
        sendKeys(firstNameInput, firstName);
    }

    //Last name label and input field
    @FindBy(xpath = "//label[contains(text(),'Last Name')]")
    private WebElement lastNameLabel;

    //Validate Last Name label is displayed
    public boolean isLastNameLabelDisplayed() {
        scrollIntoView(lastNameLabel);
        return isDisplayed(lastNameLabel);
    }

    //Validate text of Last Name label
    public void validateTextOfLastNameLabel(String text) {
        scrollIntoView(lastNameLabel);
        softAssert(lastNameLabel, text);
    }

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastNameInput;

    //Validate Last Name input field is displayed

    public boolean isLastNameInputDisplayed() {
        scrollIntoView(lastNameInput);
        return isDisplayed(lastNameInput);
    }

    //Validate text of Last Name input field
    public void validatePlaceholderTextOfLastNameInput(String text) {
        scrollIntoView(lastNameInput);
        validatePlaceholderText(lastNameInput, text);
    }

    //Enter Last Name
    public void enterLastName(String lastName) {
        scrollIntoView(lastNameInput);
        sendKeys(lastNameInput, lastName);
    }

    //Country label and input field(Dropdown)
    @FindBy(xpath = "//label[contains(text(),'Country')]")
    private WebElement countryLabel;

    //Validate Country label is displayed
    public boolean isCountryLabelDisplayed() {
        scrollIntoView(countryLabel);
        return isDisplayed(countryLabel);
    }

    //Validate text of Country label
    public void validateTextOfCountryLabel(String text) {
        scrollIntoView(countryLabel);
        softAssert(countryLabel, text);
    }

    @FindBy(xpath = "//select[@id='country']")
    private WebElement countryDropdown;

    //Validate Country dropdown is displayed
    public boolean isCountryDropdownDisplayed() {
        scrollIntoView(countryDropdown);
        return isDisplayed(countryDropdown);
    }

    //Validate select option text of Country dropdown
    public void selectCountryFromDropdown(String text) {
        scrollIntoView(countryDropdown);
        selectFromDropdown(countryDropdown, text, "Selected Country: " + text);
    }

//Phone number label and input field
    @FindBy(xpath = "//label[contains(text(),'Phone Number')]")
    private WebElement phoneNumberLabel;

    //Validate Phone Number label is displayed
    public boolean isPhoneNumberLabelDisplayed() {
        scrollIntoView(phoneNumberLabel);
        return isDisplayed(phoneNumberLabel);
    }

    //Validate text of Phone Number label
    public void validateTextOfPhoneNumberLabel(String text) {
        scrollIntoView(phoneNumberLabel);
        softAssert(phoneNumberLabel, text);
    }

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phoneNumberInput;

    //Validate Phone Number input field is displayed
    public boolean isPhoneNumberInputDisplayed() {
        scrollIntoView(phoneNumberInput);
        return isDisplayed(phoneNumberInput);
    }

    //Validate text of Phone Number input field
    public void validatePlaceholderTextOfPhoneNumberInput(String text) {
        scrollIntoView(phoneNumberInput);
        validatePlaceholderText(phoneNumberInput, text);
    }

    //Enter Phone Number
    public void enterPhoneNumber(String phoneNumber) {
        scrollIntoView(phoneNumberInput);
        sendKeys(phoneNumberInput, phoneNumber);
    }

    //Type of partner label and input field(Dropdown)
    @FindBy(xpath = "//label[contains(text(),'Type of Partner')]")
    private WebElement typeOfPartnerLabel;

    //Validate Type of Partner label is displayed
    public boolean isTypeOfPartnerLabelDisplayed() {
        scrollIntoView(typeOfPartnerLabel);
        return isDisplayed(typeOfPartnerLabel);
    }
    //Validate text of Type of Partner label
    public void validateTextOfTypeOfPartnerLabel(String text) {
        scrollIntoView(typeOfPartnerLabel);
        softAssert(typeOfPartnerLabel, text);
    }
    @FindBy(xpath = "//select[@id='type_of_partner']")
    private WebElement typeOfPartnerDropdown;

    //Validate Type of Partner dropdown is displayed
    public boolean isTypeOfPartnerDropdownDisplayed() {
        scrollIntoView(typeOfPartnerDropdown);
        return isDisplayed(typeOfPartnerDropdown);
    }

    //Validate select option text of Type of Partner dropdown
    public void selectTypeOfPartnerFromDropdown(String text) {
        scrollIntoView(typeOfPartnerDropdown);
        selectFromDropdown(typeOfPartnerDropdown, text, "Selected Type of Partner: " + text);
    }

    // Partner Size label, input field and footer text
    @FindBy(xpath = "//label[contains(text(),'Partner Size')]")
    private WebElement partnerSizeLabel;

    //Validate Partner Size label is displayed
    public boolean isPartnerSizeLabelDisplayed() {
        scrollIntoView(partnerSizeLabel);
        return isDisplayed(partnerSizeLabel);
    }

    //Validate text of Partner Size label
    public void validateTextOfPartnerSizeLabel(String text) {
        scrollIntoView(partnerSizeLabel);
        softAssert(partnerSizeLabel, text);
    }

    @FindBy(xpath = "//input[@id='partner_size']")
    private WebElement partnerSizeInput;

    //Validate Partner Size input field is displayed
    public boolean isPartnerSizeInputDisplayed() {
        scrollIntoView(partnerSizeInput);
        return isDisplayed(partnerSizeInput);
    }

    //Validate text of Partner Size input field
    public void validatePlaceholderTextOfPartnerSizeInput(String text) {
        scrollIntoView(partnerSizeInput);
        validatePlaceholderText(partnerSizeInput, text);
    }

    //Enter Partner Size
    public void enterPartnerSize(String partnerSize) {
        scrollIntoView(partnerSizeInput);
        sendKeys(partnerSizeInput, partnerSize);
    }

    //Validate footer text
    @FindBy(xpath = "//p[contains(text(),'By clicking Register, you agree to our Terms of Service and Privacy Policy.')]")
    private WebElement footerText;

    //Validate footer text is displayed
    public boolean isFooterTextDisplayed() {
        scrollIntoView(footerText);
        return isDisplayed(footerText);
    }

    //Validate text of footer
    public void validateTextOfFooter(String text) {
        scrollIntoView(footerText);
        softAssert(footerText, text);
    }


    //Submit button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    //Submit button is displayed
    public boolean isSubmitButtonDisplayed() {
        scrollIntoView(submitButton);
        return isDisplayed(submitButton);
    }

    //Click on Submit Button
    public void clickSubmitButton() {
        scrollIntoView(submitButton);
        click(submitButton, "Submit Button");
    }

    //Validate text of Submit button
    public void validateTextOfSubmitButton(String text) {
        scrollIntoView(submitButton);
        softAssert(submitButton, text);
    }

    


}
