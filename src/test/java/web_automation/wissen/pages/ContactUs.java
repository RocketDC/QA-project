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

    // Write to us Page

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
    @FindBy(xpath = "//label[normalize-space()='Last name']")
    private WebElement surnameLabel;

    // Surname input
    @FindBy(xpath = "//*[@id='form-surname']")
    private WebElement surnameInput;

    // Position label
    @FindBy(xpath = "//label[normalize-space()='Position']")
    private WebElement positionLabel;

    // Position input
    @FindBy(xpath = "//input[@id='Position']")
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
    @FindBy(xpath = "//label[normalize-space()='Phone']")
    private WebElement phoneLabel;

    // Phone input
    @FindBy(xpath = "//input[@id='Phone-Number']")
    private WebElement phoneInput;

    // Reason of contact label
    @FindBy(xpath = "//*[@for='Reason-for-contact']")
    private WebElement reasonOfContactLabel;

    // Reason of contact input
    @FindBy(xpath = "//*[@id='Reason-for-contact']")
    private WebElement reasonOfContactInput;

    // Message label
    @FindBy(xpath = "//label[normalize-space()='Message']")
    private WebElement messageLabel;

    // Message input
    @FindBy(xpath = "//*[@id='form-message']")
    private WebElement messageInput;

    // I agree checkbox
    @FindBy(xpath = "//*[@id='checkbox-2']/../div")
    private WebElement iAgreeCheckbox;

    // I agree label
    @FindBy(xpath = "//*[@id='checkbox-2']/../span")
    private WebElement iAgreeLabel;

    // Submit button
    @FindBy(xpath = "//*[@value='Submit']")
    private WebElement submitButton;

    // Success page heading
    @FindBy(xpath = "//h2[@class='section-heading']")
    private WebElement successPageHeading;

    // Success page sub heading
    @FindBy(xpath = "//h2[@class='section-heading']/../div/p")
    private WebElement successPageSubHeading;

    // Success page message
    @FindBy(xpath = "//div[@aria-label='Contact Form success']/div")
    private WebElement successPageMessage;

    // Location page

    // Location Heading
    @FindBy(xpath = "//*[@id='w-node-e5212db2-4c1c-3948-a459-45cd0f210255-492ca23d']/h1")
    private WebElement locationHeading;

    // Location Sub Heading
    @FindBy(xpath = "//*[@id='w-node-e5212db2-4c1c-3948-a459-45cd0f210255-492ca23d']/p")
    private WebElement locationSubHeading;

    // wissen GA
    @FindBy(xpath = "//div[@id='w-node-_7b634107-65bf-c264-fda8-269e60b60dd5-492ca23d']/div/h5")
    private WebElement wissenGA;
    // wissen GA Address
    @FindBy(xpath = "//div[@id='w-node-_7b634107-65bf-c264-fda8-269e60b60dd5-492ca23d']/div/p")
    private WebElement wissenGAAddress;
    // wissen WI
    @FindBy(xpath = "//div[@id='w-node-_30e98ea8-b9d8-1cf5-332c-8edfabf9a240-492ca23d']/div/h5")
    private WebElement wissenWI;
    // wissen WI Address
    @FindBy(xpath = "//div[@id='w-node-_30e98ea8-b9d8-1cf5-332c-8edfabf9a240-492ca23d']/div/p")
    private WebElement wissenWIAddress;
    // wissen NY
    @FindBy(xpath = "//div[@id='w-node-_30e98ea8-b9d8-1cf5-332c-8edfabf9a246-492ca23d']/div/h5")
    private WebElement wissenNY;
    // wissen NY Address
    @FindBy(xpath = "//div[@id='w-node-_30e98ea8-b9d8-1cf5-332c-8edfabf9a246-492ca23d']/div/p")
    private WebElement wissenNYAddress;
    // wissen Tx
    @FindBy(xpath = "//div[@id='w-node-_043bdfe1-6faf-ed84-fa96-a9391af18d7f-492ca23d']/div/h5")
    private WebElement wissenTx;
    // wissen Tx Address
    @FindBy(xpath = "//div[@id='w-node-_043bdfe1-6faf-ed84-fa96-a9391af18d7f-492ca23d']/div/p")
    private WebElement wissenTxAddress;

    // wissen delhi
    @FindBy(xpath = "//div[@id='w-node-_0df0b627-a1a7-8ff5-e9d1-f777e388e2fc-492ca23d']/div/h5")
    private WebElement wissenDelhi;
    // wissen delhi Address
    @FindBy(xpath = "//div[@id='w-node-_0df0b627-a1a7-8ff5-e9d1-f777e388e2fc-492ca23d']/div/p")
    private WebElement wissenDelhiAddress;
    // wissen bangalore
    @FindBy(xpath = "//div[@id='w-node-_27a4de1d-ea0a-4e4a-30e8-79c9bc2f0692-492ca23d']/div/h5")
    private WebElement wissenBangalore;
    // wissen bangalore Address
    @FindBy(xpath = "//div[@id='w-node-_27a4de1d-ea0a-4e4a-30e8-79c9bc2f0692-492ca23d']/div/p")
    private WebElement wissenBangaloreAddress;

    // wissen bangalore 2
    @FindBy(xpath = "//a[@href='https://www.wissen.com.tr/']")
    private WebElement wissenBangalore2;
    // wissen bangalore 2 Address
    @FindBy(xpath = "//a[@href='https://www.wissen.com.tr/']")
    private WebElement wissenBangalore2Address;
    
    // wissen mumbai
    @FindBy(xpath = "//div[@id='w-node-_27a4de1d-ea0a-4e4a-30e8-79c9bc2f0692-492ca23d']/../div/h5")
    private WebElement wissenMumbai;
    // wissen mumbai Address
    @FindBy(xpath = "//div[@id='w-node-_27a4de1d-ea0a-4e4a-30e8-79c9bc2f0692-492ca23d']/../div/p")
    private WebElement wissenMumbaiAddress;
    
    // wissen pune
    @FindBy(xpath = "//div[@id='w-node-ca7b19d5-0228-97f3-3481-d36509b4a420-492ca23d']/div/h5")
    private WebElement wissenPune;
    // wissen pune Address
    @FindBy(xpath = "//div[@id='w-node-ca7b19d5-0228-97f3-3481-d36509b4a420-492ca23d']/div/p")
    private WebElement wissenPuneAddress;
    
    // wissen hyderabad
    @FindBy(xpath = "//div[@id='w-node-_1e50299d-5927-9369-93d3-95cf6ab4f055-492ca23d']/div/h5")
    private WebElement wissenHyderabad;
    // wissen hyderabad Address
    @FindBy(xpath = "//div[@id='w-node-_1e50299d-5927-9369-93d3-95cf6ab4f055-492ca23d']/div/p")
    private WebElement wissenHyderabadAddress;
    
    // wissen Chennai
    @FindBy(xpath = "//div[@id='w-node-c1fd3166-7018-9bd9-934c-f931cb82c559-492ca23d']/div/h5")
    private WebElement wissenChennai;
    // wissen Chennai Address
    @FindBy(xpath = "//div[@id='w-node-c1fd3166-7018-9bd9-934c-f931cb82c559-492ca23d']/div/p")
    private WebElement wissenChennaiAddress;

    // wissen canada
    @FindBy(xpath = "//div[@id='w-node-_86ea8b41-29f1-703d-4706-02fd3298be46-492ca23d']/div/h5")
    private WebElement wissenCanada;
    // wissen canada Address
    @FindBy(xpath = "//div[@id='w-node-_86ea8b41-29f1-703d-4706-02fd3298be46-492ca23d']/div/p")
    private WebElement wissenCanadaAddress;

    // wissen mexico
    @FindBy(xpath = "//div[@id='w-node-_86ea8b41-29f1-703d-4706-02fd3298be46-492ca23d']/../div/h5")
    private WebElement wissenMexico;
    // wissen mexico Address
    @FindBy(xpath = "//div[@id='w-node-_86ea8b41-29f1-703d-4706-02fd3298be46-492ca23d']/../div/p")
    private WebElement wissenMexicoAddress;

    // wissen uk
    @FindBy(xpath = "//div[@id='w-node-_86ea8b41-29f1-703d-4706-02fd3298be46-492ca23d']/../div/h5")
    private WebElement wissenUK;
    // wissen uk Address
    @FindBy(xpath = "//div[@id='w-node-_86ea8b41-29f1-703d-4706-02fd3298be46-492ca23d']/../div/p")
    private WebElement wissenUKAddress;

    // wissen australia
    @FindBy(xpath = "//div[@id='w-node-_030c5ac0-af14-2d33-ec7f-4c0c101c07f2-492ca23d']/div/h5")
    private WebElement wissenAustralia;
    // wissen australia Address
    @FindBy(xpath = "//div[@id='w-node-_030c5ac0-af14-2d33-ec7f-4c0c101c07f2-492ca23d']/div/p")
    private WebElement wissenAustraliaAddress;

    // wissen vietnam
    @FindBy(xpath = "//div[@id='w-node-ea54ffff-bf46-5d48-6803-7b7d2295f794-492ca23d']/div/h5")
    private WebElement wissenVietnam;
    // wissen vietnam Address
    @FindBy(xpath = "//div[@id='w-node-ea54ffff-bf46-5d48-6803-7b7d2295f794-492ca23d']/div/p")
    private WebElement wissenVietnamAddress;


    // ========= Actions =========
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

    // Alert box for submit button
    public boolean isAlertBoxDisplayed() {
        return isAlertPresent();
    }
    public void acceptAlertBox() {
        acceptAlert();
    }
    public void dismissAlertBox() {
        dismissAlert();
    }
    public void validateAlertBoxText(String text) {
        softAssert(getAlertText(), text);
    }

    public boolean isSuccessPageHeadingDisplayed() {
        scrollIntoView(successPageHeading);
        return isDisplayed(successPageHeading);
    }

    public void validateTextOfSuccessPageHeading(String text) {
        softAssert(successPageHeading, text);
    }

    public boolean isSuccessPageSubHeadingDisplayed() {
        scrollIntoView(successPageSubHeading);
        return isDisplayed(successPageSubHeading);
    }

    public void validateTextOfSuccessPageSubHeading(String text) {
        softAssert(successPageSubHeading, text);
    }

    public boolean isSuccessPageMessageDisplayed() {
        scrollIntoView(successPageMessage);
        return isDisplayed(successPageMessage);
    }

    public void validateTextOfSuccessPageMessage(String text) {
        softAssert(successPageMessage, text);
    }



    // Location Methods

    public boolean isLocationHeadingDisplayed() {
        scrollIntoView(locationHeading);
        return isDisplayed(locationHeading);
    }

    public void validateTextOfLocationHeading(String text) {
        softAssert(locationHeading, text);
    }

    public boolean isLocationSubHeadingDisplayed() {
        scrollIntoView(locationSubHeading);
        return isDisplayed(locationSubHeading);
    }

    public void validateTextOfLocationSubHeading(String text) {
        softAssert(locationSubHeading, text);
    }

    public boolean isWissenGADisplayed() {
        scrollIntoView(wissenGA);
        return isDisplayed(wissenGA);
    }

    public void validateTextOfWissenGA(String text) {
        softAssert(wissenGA, text);
    }

    public boolean isWissenGAAddressDisplayed() {
        scrollIntoView(wissenGAAddress);
        return isDisplayed(wissenGAAddress);
    }

    public void validateTextOfWissenGAAddress(String text) {
        softAssert(wissenGAAddress, text);
    }

    public boolean isWissenWIDisplayed() {
        scrollIntoView(wissenWI);
        return isDisplayed(wissenWI);
    }

    public void validateTextOfWissenWI(String text) {
        softAssert(wissenWI, text);
    }

    public boolean isWissenWIAddressDisplayed() {
        scrollIntoView(wissenWIAddress);
        return isDisplayed(wissenWIAddress);
    }

    public void validateTextOfWissenWIAddress(String text) {
        softAssert(wissenWIAddress, text);
    }
    
    public boolean isWissenNYDisplayed() {
        scrollIntoView(wissenNY);
        return isDisplayed(wissenNY);
    }

    public void validateTextOfWissenNY(String text) {
        softAssert(wissenNY, text);
    }

    public boolean isWissenNYAddressDisplayed() {
        scrollIntoView(wissenNYAddress);
        return isDisplayed(wissenNYAddress);
    }

    public void validateTextOfWissenNYAddress(String text) {
        softAssert(wissenNYAddress, text);
    }

    public boolean isWissenTxDisplayed() {
        scrollIntoView(wissenTx);
        return isDisplayed(wissenTx);
    }

    public void validateTextOfWissenTx(String text) {
        softAssert(wissenTx, text);
    }

    public boolean isWissenTxAddressDisplayed() {
        scrollIntoView(wissenTxAddress);
        return isDisplayed(wissenTxAddress);
    }

    public void validateTextOfWissenTxAddress(String text) {
        softAssert(wissenTxAddress, text);
    }

    public boolean isWissenDelhiDisplayed() {
        scrollIntoView(wissenDelhi);
        return isDisplayed(wissenDelhi);
    }

    public void validateTextOfWissenDelhi(String text) {
        softAssert(wissenDelhi, text);
    }

    public boolean isWissenDelhiAddressDisplayed() {
        scrollIntoView(wissenDelhiAddress);
        return isDisplayed(wissenDelhiAddress);
    }

    public void validateTextOfWissenDelhiAddress(String text) {
        softAssert(wissenDelhiAddress, text);
    }

    public boolean isWissenBangaloreDisplayed() {
        scrollIntoView(wissenBangalore);
        return isDisplayed(wissenBangalore);
    }

    public void validateTextOfWissenBangalore(String text) {
        softAssert(wissenBangalore, text);
    }

    public boolean isWissenBangaloreAddressDisplayed() {
        scrollIntoView(wissenBangaloreAddress);
        return isDisplayed(wissenBangaloreAddress);
    }

    public void validateTextOfWissenBangaloreAddress(String text) {
        softAssert(wissenBangaloreAddress, text);
    }
    public boolean isWissenMumbaiDisplayed() {
        scrollIntoView(wissenMumbai);
        return isDisplayed(wissenMumbai);
    }

    public void validateTextOfWissenMumbai(String text) {
        softAssert(wissenMumbai, text);
    }

    public boolean isWissenMumbaiAddressDisplayed() {
        scrollIntoView(wissenMumbaiAddress);
        return isDisplayed(wissenMumbaiAddress);
    }

    public void validateTextOfWissenMumbaiAddress(String text) {
        softAssert(wissenMumbaiAddress, text);
    }
    public boolean isWissenPuneDisplayed() {
        scrollIntoView(wissenPune);
        return isDisplayed(wissenPune);
    }

    public void validateTextOfWissenPune(String text) {
        softAssert(wissenPune, text);
    }

    public boolean isWissenPuneAddressDisplayed() {
        scrollIntoView(wissenPuneAddress);
        return isDisplayed(wissenPuneAddress);
    }

    public void validateTextOfWissenPuneAddress(String text) {
        softAssert(wissenPuneAddress, text);
    }

    public boolean isWissenHyderabadDisplayed() {
        scrollIntoView(wissenHyderabad);
        return isDisplayed(wissenHyderabad);
    }

    public void validateTextOfWissenHyderabad(String text) {
        softAssert(wissenHyderabad, text);
    }

    public boolean isWissenHyderabadAddressDisplayed() {
        scrollIntoView(wissenHyderabadAddress);
        return isDisplayed(wissenHyderabadAddress);
    }

    public void validateTextOfWissenHyderabadAddress(String text) {
        softAssert(wissenHyderabadAddress, text);
    }

    public boolean isWissenChennaiDisplayed() {
        scrollIntoView(wissenChennai);
        return isDisplayed(wissenChennai);
    }

    public void validateTextOfWissenChennai(String text) {
        softAssert(wissenChennai, text);
    }

    public boolean isWissenChennaiAddressDisplayed() {
        scrollIntoView(wissenChennaiAddress);
        return isDisplayed(wissenChennaiAddress);
    }

    public void validateTextOfWissenChennaiAddress(String text) {
        softAssert(wissenChennaiAddress, text);
    }

    public boolean isWissenCanadaDisplayed() {
        scrollIntoView(wissenCanada);
        return isDisplayed(wissenCanada);
    }

    public void validateTextOfWissenCanada(String text) {
        softAssert(wissenCanada, text);
    }

    public boolean isWissenCanadaAddressDisplayed() {
        scrollIntoView(wissenCanadaAddress);
        return isDisplayed(wissenCanadaAddress);
    }

    public void validateTextOfWissenCanadaAddress(String text) {
        softAssert(wissenCanadaAddress, text);
    }

    public boolean isWissenUKDisplayed() {
        scrollIntoView(wissenUK);
        return isDisplayed(wissenUK);
    }

    public void validateTextOfWissenUK(String text) {
        softAssert(wissenUK, text);
    }

    public boolean isWissenUKAddressDisplayed() {
        scrollIntoView(wissenUKAddress);
        return isDisplayed(wissenUKAddress);
    }

    public void validateTextOfWissenUKAddress(String text) {
        softAssert(wissenUKAddress, text);
    }


    public boolean isWissenAUDisplayed() {
        scrollIntoView(wissenAustralia);
        return isDisplayed(wissenAustralia);
    }

    public void validateTextOfWissenAU(String text) {
        softAssert(wissenAustralia, text);
    }

    public boolean isWissenAUAddressDisplayed() {
        scrollIntoView(wissenAustraliaAddress);
        return isDisplayed(wissenAustraliaAddress);
    }

    public void validateTextOfWissenAUAddress(String text) {
        softAssert(wissenAustraliaAddress, text);
    }

    public boolean isWissenVIDisplayed() {
        scrollIntoView(wissenVietnam);
        return isDisplayed(wissenVietnam);
    }

    public void validateTextOfWissenVI(String text) {
        softAssert(wissenVietnam, text);
    }

    public boolean isWissenVIAddressDisplayed() {
        scrollIntoView(wissenVietnamAddress);
        return isDisplayed(wissenVietnamAddress);
    }

    public void validateTextOfWissenVIAddress(String text) {
        softAssert(wissenVietnamAddress, text);
    }


}
