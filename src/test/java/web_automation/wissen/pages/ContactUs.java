package web_automation.wissen.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import web_automation.wissen.base.TestBase;

public class ContactUs extends TestBase {
    WebDriver driver;

    // ========== Constructor ==========
    public ContactUs(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ========== Locators ==========

    // Contact Us heading
    @FindBy(xpath = "//*[@id='w-node-b0888793-7278-d7ca-af05-1da907e7b088-2c2ca2ab']/h2")
    private WebElement contactUsHeading;

    // Contact Us Sub heading
    @FindBy(xpath = "//*[@id='w-node-b0888793-7278-d7ca-af05-1da907e7b088-2c2ca2ab']/div/p")
    private WebElement contactUsSubHeading;

    // Name label
    @FindBy(xpath = "//*[@for='form-name']")
    private WebElement nameLabel;

    // Name input
    @FindBy(xpath = "//*[@id='form-name']")
    private WebElement nameInput;

    // Surname label
    @FindBy(xpath = "//*[@for='form-surname-2']")
    private WebElement surnameLabel;

    // Surname input
    @FindBy(xpath = "//*[@id='form-surname']")
    private WebElement surnameInput;

    // Position label
    @FindBy(xpath = "//*[@for='form-position-2']")
    private WebElement positionLabel;

    // Position input
    @FindBy(xpath = "//*[@id='form-position']")
    private WebElement positionInput;

    // Company label
    @FindBy(xpath = "//*[@for='form-company']")
    private WebElement companyLabel;

    // Company input
    @FindBy(xpath = "//*[@id='form-company']")
    private WebElement companyInput;

    // Email label
    @FindBy(xpath = "//*[@for='form-email']")
    private WebElement emailLabel;

    // Email input
    @FindBy(xpath = "//*[@id='form-email']")
    private WebElement emailInput;

    // Phone label
    @FindBy(xpath = "//*[@for='form-email-2']")
    private WebElement phoneLabel;

    // Phone input
    @FindBy(xpath = "//*[@for='form-email-2']/../input")
    private WebElement phoneInput;

    // Reason of contact label
    @FindBy(xpath = "//*[@for='Reason-for-contact']")
    private WebElement reasonOfContactLabel;

    // Reason of contact input
    @FindBy(xpath = "//*[@id='Reason-for-contact']")
    private WebElement reasonOfContactInput;

    // Message label
    @FindBy(xpath = "//*[@for='form-message-2']")
    private WebElement messageLabel;

    // Message input
    @FindBy(xpath = "//*[@id='form-message']")
    private WebElement messageInput;

    // I agree checkbox
    @FindBy(xpath = "//*[@id='checkbox-2']")
    private WebElement iAgreeCheckbox;

    // I agree label
    @FindBy(xpath = "//*[@id='checkbox-2']/../span")
    private WebElement iAgreeLabel;

    // Submit button
    @FindBy(xpath = "//*[@value='Submit']")
    private WebElement submitButton;

    // Success message
    @FindBy(xpath = "//*[@class='alert alert-success']")
    private WebElement successMessage;

    // ========== Actions ==========
    public boolean isContactUsHeadingDisplayed() {
        scrollIntoView(contactUsHeading);
        return isDisplayed(contactUsHeading);
    }

    public void validateTextOfContactUsHeading(String text) {
        softAssert(contactUsHeading, text);
    }

    public void clickContactUsHeading() {
        scrollIntoView(contactUsHeading);
        click(contactUsHeading, "Contact Us Heading");
    }

    public boolean isContactUsSubHeadingDisplayed() {
        scrollIntoView(contactUsSubHeading);
        return isDisplayed(contactUsSubHeading);
    }

    public void validateTextOfContactUsSubHeading(String text) {
        softAssert(contactUsSubHeading, text);
    }

    public void clickContactUsSubHeading() {
        scrollIntoView(contactUsSubHeading);
        click(contactUsSubHeading, "Contact Us SubHeading");
    }

    public boolean isNameLabelDisplayed() {
        scrollIntoView(nameLabel);
        return isDisplayed(nameLabel);
    }

    public void validateTextOfNameLabel(String text) {
        softAssert(nameLabel, text);
    }

    public boolean isNameInputDisplayed() {
        scrollIntoView(nameInput);
        return isDisplayed(nameInput);
    }

    public void validatePlaceholderTextOfNameInput(String text) {
        validatePlaceholderText(nameInput, text);
    }

    public void enterName(String name) {
        scrollIntoView(nameInput);
        sendKeys(nameInput, name);
    }

    public boolean isSurnameLabelDisplayed() {
        scrollIntoView(surnameLabel);
        return isDisplayed(surnameLabel);
    }

    public void validateTextOfSurnameLabel(String text) {
        softAssert(surnameLabel, text);
    }

    public boolean isSurnameInputDisplayed() {
        scrollIntoView(surnameInput);
        return isDisplayed(surnameInput);
    }

    public void validatePlaceholderTextOfSurnameInput(String text) {
        validatePlaceholderText(surnameInput, text);
    }

    public void enterSurname(String surname) {
        scrollIntoView(surnameInput);
        sendKeys(surnameInput, surname);
    }

    public boolean isPositionLabelDisplayed() {
        scrollIntoView(positionLabel);
        return isDisplayed(positionLabel);
    }

    public void validateTextOfPositionLabel(String text) {
        softAssert(positionLabel, text);
    }

    public boolean isPositionInputDisplayed() {
        scrollIntoView(positionInput);
        return isDisplayed(positionInput);
    }

    public void validatePlaceholderTextOfPositionInput(String text) {
        validatePlaceholderText(positionInput, text);
    }

    public void enterPosition(String position) {
        scrollIntoView(positionInput);
        sendKeys(positionInput, position);
    }

    public boolean isCompanyLabelDisplayed() {
        scrollIntoView(companyLabel);
        return isDisplayed(companyLabel);
    }

    public void validateTextOfCompanyLabel(String text) {
        softAssert(companyLabel, text);
    }

    public boolean isCompanyInputDisplayed() {
        scrollIntoView(companyInput);
        return isDisplayed(companyInput);
    }

    public void validatePlaceholderTextOfCompanyInput(String text) {
        validatePlaceholderText(companyInput, text);
    }

    public void enterCompany(String company) {
        scrollIntoView(companyInput);
        sendKeys(companyInput, company);
    }

    public boolean isEmailLabelDisplayed() {
        scrollIntoView(emailLabel);
        return isDisplayed(emailLabel);
    }

    public void validateTextOfEmailLabel(String text) {
        softAssert(emailLabel, text);
    }

    public boolean isEmailInputDisplayed() {
        scrollIntoView(emailInput);
        return isDisplayed(emailInput);
    }

    public void validatePlaceholderTextOfEmailInput(String text) {
        validatePlaceholderText(emailInput, text);
    }

    public void enterEmail(String email) {
        scrollIntoView(emailInput);
        sendKeys(emailInput, email);
    }

    public boolean isPhoneLabelDisplayed() {
        scrollIntoView(phoneLabel);
        return isDisplayed(phoneLabel);
    }

    public void validateTextOfPhoneLabel(String text) {
        softAssert(phoneLabel, text);
    }

    public boolean isPhoneInputDisplayed() {
        scrollIntoView(phoneInput);
        return isDisplayed(phoneInput);
    }

    public void validatePlaceholderTextOfPhoneInput(String text) {
        validatePlaceholderText(phoneInput, text);
    }

    public void enterPhone(String phone) {
        scrollIntoView(phoneInput);
        sendKeys(phoneInput, phone);
    }

    public boolean isReasonOfContactLabelDisplayed() {
        scrollIntoView(reasonOfContactLabel);
        return isDisplayed(reasonOfContactLabel);
    }

    public void validateTextOfReasonOfContactLabel(String text) {
        softAssert(reasonOfContactLabel, text);
    }

    public boolean isReasonOfContactInputDisplayed() {
        scrollIntoView(reasonOfContactInput);
        return isDisplayed(reasonOfContactInput);
    }

    public void validatePlaceholderTextOfReasonOfContactInput(String text) {
        validatePlaceholderText(reasonOfContactInput, text);
    }

    public void enterReasonOfContact(String reasonOfContact) {
        scrollIntoView(reasonOfContactInput);
        sendKeys(reasonOfContactInput, reasonOfContact);
    }

    public boolean isMessageLabelDisplayed() {
        scrollIntoView(messageLabel);
        return isDisplayed(messageLabel);
    }

    public void validateTextOfMessageLabel(String text) {
        softAssert(messageLabel, text);
    }

    public boolean isMessageInputDisplayed() {
        scrollIntoView(messageInput);
        return isDisplayed(messageInput);
    }

    public void validatePlaceholderTextOfMessageInput(String text) {
        validatePlaceholderText(messageInput, text);
    }

    public void enterMessage(String message) {
        scrollIntoView(messageInput);
        sendKeys(messageInput, message);
    }

    public boolean isIAgreeCheckboxDisplayed() {
        scrollIntoView(iAgreeCheckbox);
        return isDisplayed(iAgreeCheckbox);
    }

    public void clickIAgreeCheckbox() {
        scrollIntoView(iAgreeCheckbox);
        click(iAgreeCheckbox, "IAgreeCheckbox");
    }

    public boolean isIAgreeLabelDisplayed() {
        scrollIntoView(iAgreeLabel);
        return isDisplayed(iAgreeLabel);
    }

    public void validateTextOfIAgreeLabel(String text) {
        softAssert(iAgreeLabel, text);
    }

    public boolean isSubmitButtonDisplayed() {
        scrollIntoView(submitButton);
        return isDisplayed(submitButton);
    }   

    public void validateTextOfSubmitButton(String text) {
        softAssert(submitButton, text);
    }
    public void clickSubmitButton() {
        scrollIntoView(submitButton);
        click(submitButton, "SubmitButton");
    }

    public boolean isSuccessMessageDisplayed() {
        scrollIntoView(successMessage);
        return isDisplayed(successMessage);
    }

    public void validateTextOfSuccessMessage(String text) {
        softAssert(successMessage, text);
    }

}
