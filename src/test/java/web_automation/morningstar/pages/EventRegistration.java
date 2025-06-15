package web_automation.morningstar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web_automation.morningstar.base.TestBase;

public class EventRegistration extends TestBase {
    WebDriver driver;

    public EventRegistration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Initial Registration Page
    //Initial Registration text
    @FindBy(xpath = "//*[@class='WebsiteNavigator__selectedPage___hIMBf']")
    private WebElement initialRegistrationText;

    public boolean isInitialRegistrationTextDisplayed() {
        return isDisplayed(initialRegistrationText);
    }

    public void validateTextInitialRegistrationText(String expectedText) {
        softAssert(initialRegistrationText, expectedText);
    }

    //Personal Information header
    @FindBy(xpath = "//h2[@class='css-87ndg2']")
    private WebElement personalInformationHeader;

    public boolean isPersonalInformationHeaderDisplayed() {
        return isDisplayed(personalInformationHeader);
    }

    public void validateTextPersonalInformationHeader(String expectedText) {
        softAssert(personalInformationHeader, expectedText);
    }

    //Personal Information sub-header
    @FindBy(xpath = "//div[@class='css-87ndg2' and @data-cvent-id='IdentityConfirmation-instructionalText']")
    private WebElement personalInformationSubHeader;

    public boolean isPersonalInformationSubHeaderDisplayed() {
        return isDisplayed(personalInformationSubHeader);
    }

    public void validateTextPersonalInformationSubHeader(String expectedText) {
        softAssert(personalInformationSubHeader, expectedText);
    }

    //First Name label
    @FindBy(xpath = "(//span[@role='heading'])[1]")
    private WebElement firstName;

    public boolean isFirstNameDisplayed() {
        return isDisplayed(firstName);
    }

    public void validateTextFirstName(String expectedText) {
        softAssert(firstName, expectedText);
    }

    //First Name textbox
    @FindBy(xpath = "//input[@aria-label='First name']")
    private WebElement firstNameTextbox;

    public boolean isFirstNameTextboxDisplayed() {
        return isDisplayed(firstNameTextbox);
    }

    public void validatePlaceholderTextFirstNameTextbox(String expectedText) {
        validatePlaceholderText(firstNameTextbox, expectedText);
    }

    public void enterFirstName(String expectedText) {
        sendKeys(firstNameTextbox, expectedText);
    }

    //Last Name label
    @FindBy(xpath = "(//span[@role='heading'])[2]")
    private WebElement lastName;

    public boolean isLastNameDisplayed() {
        return isDisplayed(lastName);
    }

    public void validateTextLastName(String expectedText) {
        softAssert(lastName, expectedText);
    }

    //Last Name textbox
    @FindBy(xpath = "//input[@aria-label='Last name']")
    private WebElement lastNameTextbox;

    public boolean isLastNameTextboxDisplayed() {
        return isDisplayed(lastNameTextbox);
    }

    public void validatePlaceholderTextLastNameTextbox(String expectedText) {
        validatePlaceholderText(lastNameTextbox, expectedText);
    }

    public void enterLastName(String expectedText) {
        sendKeys(lastNameTextbox, expectedText);
    }

    //Email label
    @FindBy(xpath = "(//span[@role='heading'])[3]")
    private WebElement email;

    public boolean isEmailDisplayed() {
        return isDisplayed(email);
    }

    public void validateTextEmail(String expectedText) {
        softAssert(email, expectedText);
    }

    //Email textbox
    @FindBy(xpath = "//input[@aria-label='Email address']")
    private WebElement emailTextbox;

    public boolean isEmailTextboxDisplayed() {
        return isDisplayed(emailTextbox);
    }

    public void validatePlaceholderTextEmailTextbox(String expectedText) {
        validatePlaceholderText(emailTextbox, expectedText);
    }

    public void enterEmail(String expectedText) {
        sendKeys(emailTextbox, expectedText);
    }

    // Mobile label
    @FindBy(xpath = "(//span[@role='heading'])[4]")
    private WebElement mobile;

    public boolean isMobileDisplayed() {
        return isDisplayed(mobile);
    }

    public void validateTextMobile(String expectedText) {
        softAssert(mobile, expectedText);
    }

    // Mobile textbox
    @FindBy(xpath = "//input[@aria-label='Mobile phone number']")
    private WebElement mobileTextbox;

    public boolean isMobileTextboxDisplayed() {
        return isDisplayed(mobileTextbox);
    }

    public void validatePlaceholderTextMobileTextbox(String expectedText) {
        validatePlaceholderText(mobileTextbox, expectedText);
    }

    public void enterMobile(String expectedText) {
        sendKeys(mobileTextbox, expectedText);
    }

    // Mobile format label
    @FindBy(xpath = "//div[@id='032e80c1-f29f-44e6-af13-a89e53906422']")
    private WebElement mobileFormat;

    public boolean isMobileFormatDisplayed() {
        return isDisplayed(mobileFormat);
    }

    public void validateTextMobileFormat(String expectedText) {
        softAssert(mobileFormat, expectedText);
    }

    //I'm registering on behalf of this person text
    @FindBy(xpath = "//*[@id='adminRegSelected_0']/../label/div")
    private WebElement imRegisteringOnBehalfOfThisPerson;

    public boolean isImRegisteringOnBehalfOfThisPersonDisplayed() {
        return isDisplayed(imRegisteringOnBehalfOfThisPerson);
    }

    public void validateTextImRegisteringOnBehalfOfThisPerson(String expectedText) {
        softAssert(imRegisteringOnBehalfOfThisPerson, expectedText);
    }

    //I'm registering on behalf of this person checkbox
    @FindBy(id = "adminRegSelected_0")
    private WebElement imRegisteringOnBehalfOfThisPersonCheckbox;

    public boolean isImRegisteringOnBehalfOfThisPersonCheckboxDisplayed() {
        return isDisplayed(imRegisteringOnBehalfOfThisPersonCheckbox);
    }

    public void clickOnImRegisteringOnBehalfOfThisPersonCheckbox() {
        click(imRegisteringOnBehalfOfThisPersonCheckbox, "I'm registering on behalf of this person");
    }

    // Cancel Button
    @FindBy(id = "exit")
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

    // Next Button
    @FindBy(id = "forward")
    private WebElement nextButton;

    public boolean isNextButton1Displayed() {
        return isDisplayed(nextButton);
    }

    public void validateTextNextButton1Button(String expectedText) {
        softAssert(nextButton, expectedText);
    }

    public void clickNextButton1() {
        click(nextButton, "Next Button");
    }

    // Registration Page

    // Personal Information Section
    @FindBy(id = "PersonalInformationSection")
    private WebElement personalInformationSection;

    public boolean isPersonalInformationSectionDisplayed() {
        return isDisplayed(personalInformationSection);
    }

    public void validateTextPersonalInformationSection(String expectedText) {
        softAssert(personalInformationSection, expectedText);
    }

    //CC Email Address label
    @FindBy(id = "CCEmailAddress")
    private WebElement ccEmailAddress;

    public boolean isCcEmailAddressDisplayed() {
        return isDisplayed(ccEmailAddress);
    }

    public void validateTextCcEmailAddress(String expectedText) {
        softAssert(ccEmailAddress, expectedText);
    }

    //CC Email Address textbox
    @FindBy(id = "CCEmailAddress")
    private WebElement ccEmailAddressTextbox;

    public boolean isCcEmailAddressTextboxDisplayed() {
        return isDisplayed(ccEmailAddressTextbox);
    }

    public void validatePlaceholderTextCcEmailAddressTextbox(String expectedText) {
        validatePlaceholderText(ccEmailAddressTextbox, expectedText);
    }

    public void enterCcEmailAddress(String expectedText) {
        sendKeys(ccEmailAddressTextbox, expectedText);
    }

    //Company lable
    @FindBy(id = "Company")
    private WebElement company;

    public boolean isCompanyDisplayed() {
        return isDisplayed(company);
    }

    public void validateTextCompany(String expectedText) {
        softAssert(company, expectedText);
    }

    //Company textbox
    @FindBy(id = "Company")
    private WebElement companyTextbox;

    public boolean isCompanyTextboxDisplayed() {
        return isDisplayed(companyTextbox);
    }

    public void validatePlaceholderTextCompanyTextbox(String expectedText) {
        validatePlaceholderText(companyTextbox, expectedText);
    }

    public void enterCompany(String expectedText) {
        sendKeys(companyTextbox, expectedText);
    }

    //Designation
    @FindBy(id = "Designation")
    private WebElement designation;

    public boolean isDesignationDisplayed() {
        return isDisplayed(designation);
    }

    public void validateTextDesignation(String expectedText) {
        softAssert(designation, expectedText);
    }

    //Designation textbox
    @FindBy(id = "Designation")
    private WebElement designationTextbox;

    public boolean isDesignationTextboxDisplayed() {
        return isDisplayed(designationTextbox);
    }

    public void validatePlaceholderTextDesignationTextbox(String expectedText) {
        validatePlaceholderText(designationTextbox, expectedText);
    }

    public void enterDesignation(String expectedText) {
        sendKeys(designationTextbox, expectedText);
    }


    // Office Address Section
    // Office Address label
    @FindBy(id = "OfficeAddress")
    private WebElement officeAddress;

    public boolean isOfficeAddressDisplayed() {
        return isDisplayed(officeAddress);
    }

    public void validateTextOfficeAddress(String expectedText) {
        softAssert(officeAddress, expectedText);
    }

    // Address 1 label
    @FindBy(id = "Address1")
    private WebElement address1;

    public boolean isAddress1Displayed() {
        return isDisplayed(address1);
    }

    public void validateTextAddress1(String expectedText) {
        softAssert(address1, expectedText);
    }

    // Address 1 textbox
    @FindBy(id = "Address1")
    private WebElement address1Textbox;

    public boolean isAddress1TextboxDisplayed() {
        return isDisplayed(address1Textbox);
    }

    public void validatePlaceholderTextAddress1Textbox(String expectedText) {
        validatePlaceholderText(address1Textbox, expectedText);
    }

    public void enterAddress1(String expectedText) {
        sendKeys(address1Textbox, expectedText);
    }

    // Address 2 label
    @FindBy(id = "Address2")
    private WebElement address2;

    public boolean isAddress2Displayed() {
        return isDisplayed(address2);
    }

    public void validateTextAddress2(String expectedText) {
        softAssert(address2, expectedText);
    }

    // Address 2 textbox
    @FindBy(id = "Address2")
    private WebElement address2Textbox;

    public boolean isAddress2TextboxDisplayed() {
        return isDisplayed(address2Textbox);
    }

    public void validatePlaceholderTextAddress2Textbox(String expectedText) {
        validatePlaceholderText(address2Textbox, expectedText);
    }

    public void enterAddress2(String expectedText) {
        sendKeys(address2Textbox, expectedText);
    }

    //Country label
    @FindBy(id = "Country")
    private WebElement country;

    public boolean isCountryDisplayed() {
        return isDisplayed(country);
    }

    public void validateTextCountry(String expectedText) {
        softAssert(country, expectedText);
    }

    //Country dropdown
    @FindBy(id = "Country")
    private WebElement countryDropdown;

    public boolean isCountryDropdownDisplayed() {
        return isDisplayed(countryDropdown);
    }

    public void validateTextCountryDropdown(String expectedText) {
        softAssert(countryDropdown, expectedText);
    }

    public void selectCountry(String expectedText) {
        selectDropdown(countryDropdown, expectedText);
    }

    // State label
    @FindBy(id = "State")
    private WebElement state;

    public boolean isStateDisplayed() {
        return isDisplayed(state);
    }

    public void validateTextState(String expectedText) {
        softAssert(state, expectedText);
    }

    // State dropdown
    @FindBy(id = "State")
    private WebElement stateDropdown;

    public boolean isStateDropdownDisplayed() {
        return isDisplayed(stateDropdown);
    }

    public void validateTextStateDropdown(String expectedText) {
        softAssert(stateDropdown, expectedText);
    }

    public void selectState(String expectedText) {
        selectDropdown(stateDropdown, expectedText);
    }

    // City label
    @FindBy(id = "City")
    private WebElement city;

    public boolean isCityDisplayed() {
        return isDisplayed(city);
    }

    public void validateTextCity(String expectedText) {
        softAssert(city, expectedText);
    }

    // City textbox
    @FindBy(id = "City")
    private WebElement cityTextbox;

    public boolean isCityTextboxDisplayed() {
        return isDisplayed(cityTextbox);
    }

    public void validatePlaceholderTextCityTextbox(String expectedText) {
        validatePlaceholderText(cityTextbox, expectedText);
    }

    public void enterCity(String expectedText) {
        sendKeys(cityTextbox, expectedText);
    }

    // Pincode label
    @FindBy(id = "Pincode")
    private WebElement pincode;

    public boolean isPincodeDisplayed() {
        return isDisplayed(pincode);
    }

    public void validateTextPincode(String expectedText) {
        softAssert(pincode, expectedText);
    }

    // Pincode textbox
    @FindBy(id = "Pincode")
    private WebElement pincodeTextbox;

    public boolean isPincodeTextboxDisplayed() {
        return isDisplayed(pincodeTextbox);
    }

    public void validatePlaceholderTextPincodeTextbox(String expectedText) {
        validatePlaceholderText(pincodeTextbox, expectedText);
    }

    public void enterPincode(String expectedText) {
        sendKeys(pincodeTextbox, expectedText);
    }


    // Additional Information Section

    // Additional Information Heading
    @FindBy(id = "AdditionalInformation")
    private WebElement additionalInformation;

    public boolean isAdditionalInformationDisplayed() {
        return isDisplayed(additionalInformation);
    }

    public void validateTextAdditionalInformation(String expectedText) {
        softAssert(additionalInformation, expectedText);
    }

    //  Which category best describes your organization? question label
    @FindBy(id = "WhichCategoryBestDescribesYourOrganization")
    private WebElement whichCategoryBestDescribesYourOrganization;

    public boolean isWhichCategoryBestDescribesYourOrganizationDisplayed() {
        return isDisplayed(whichCategoryBestDescribesYourOrganization);
    }

    public void validateTextWhichCategoryBestDescribesYourOrganization(String expectedText) {
        softAssert(whichCategoryBestDescribesYourOrganization, expectedText);
    }

    //  Which category best describes your organization? dropdown
    @FindBy(id = "WhichCategoryBestDescribesYourOrganization")
    private WebElement whichCategoryBestDescribesYourOrganizationDropdown;

    public boolean isWhichCategoryBestDescribesYourOrganizationDropdownDisplayed() {
        return isDisplayed(whichCategoryBestDescribesYourOrganizationDropdown);
    }

    public void validateTextWhichCategoryBestDescribesYourOrganizationDropdown(String expectedText) {
        softAssert(whichCategoryBestDescribesYourOrganizationDropdown, expectedText);
    }

    public void selectWhichCategoryBestDescribesYourOrganizationDropdown(String expectedText) {
        selectDropdown(whichCategoryBestDescribesYourOrganizationDropdown, expectedText);
    }

    // Which category best describes your role? question label
    @FindBy(id = "WhichCategoryBestDescribesYourRole")
    private WebElement whichCategoryBestDescribesYourRole;

    public boolean isWhichCategoryBestDescribesYourRoleDisplayed() {
        return isDisplayed(whichCategoryBestDescribesYourRole);
    }

    public void validateTextWhichCategoryBestDescribesYourRole(String expectedText) {
        softAssert(whichCategoryBestDescribesYourRole, expectedText);
    }

    // Which category best describes your role? dropdown
    @FindBy(id = "WhichCategoryBestDescribesYourRole")
    private WebElement whichCategoryBestDescribesYourRoleDropdown;

    public boolean isWhichCategoryBestDescribesYourRoleDropdownDisplayed() {
        return isDisplayed(whichCategoryBestDescribesYourRoleDropdown);
    }

    public void validateTextWhichCategoryBestDescribesYourRoleDropdown(String expectedText) {
        softAssert(whichCategoryBestDescribesYourRoleDropdown, expectedText);
    }

    public void selectWhichCategoryBestDescribesYourRoleDropdown(String expectedText) {
        selectDropdown(whichCategoryBestDescribesYourRoleDropdown, expectedText);
    }

    // Do you have the GST number? question label
    @FindBy(id = "DoYouHaveTheGSTNumber")
    private WebElement doYouHaveTheGSTNumber;

    public boolean isDoYouHaveTheGSTNumberDisplayed() {
        return isDisplayed(doYouHaveTheGSTNumber);
    }

    public void validateTextDoYouHaveTheGSTNumber(String expectedText) {
        softAssert(doYouHaveTheGSTNumber, expectedText);
    }

    // Do you have the GST number? Yes label
    @FindBy(id = "DoYouHaveTheGSTNumberYes")
    private WebElement doYouHaveTheGSTNumberYes;

    public boolean isDoYouHaveTheGSTNumberYesDisplayed() {
        return isDisplayed(doYouHaveTheGSTNumberYes);
    }

    public void validateTextDoYouHaveTheGSTNumberYes(String expectedText) {
        softAssert(doYouHaveTheGSTNumberYes, expectedText);
    }

    // Do you have the GST number? Yes radio button
    @FindBy(id = "DoYouHaveTheGSTNumberYes")
    private WebElement doYouHaveTheGSTNumberYesRadio;

    public boolean isDoYouHaveTheGSTNumberYesRadioDisplayed() {
        return isDisplayed(doYouHaveTheGSTNumberYesRadio);
    }

    public void selectDoYouHaveTheGSTNumberYesRadio() {
        click(doYouHaveTheGSTNumberYesRadio, "Do You Have The GST Number Yes Radio button");

    }

    // Do you have the GST number? No label
    @FindBy(id = "DoYouHaveTheGSTNumberNo")
    private WebElement doYouHaveTheGSTNumberNo;

    public boolean isDoYouHaveTheGSTNumberNoDisplayed() {
        return isDisplayed(doYouHaveTheGSTNumberNo);
    }

    public void validateTextDoYouHaveTheGSTNumberNo(String expectedText) {
        softAssert(doYouHaveTheGSTNumberNo, expectedText);
    }

    // Do you have the GST number? No radio button
    @FindBy(id = "DoYouHaveTheGSTNumberNo")
    private WebElement doYouHaveTheGSTNumberNoRadio;

    public boolean isDoYouHaveTheGSTNumberNoRadioDisplayed() {
        return isDisplayed(doYouHaveTheGSTNumberNoRadio);
    }

    public void selectDoYouHaveTheGSTNumberNoRadio() {
        click(doYouHaveTheGSTNumberNoRadio, "Do You Have The GST Number No Radio button");
    }


    // Do you need CFA continuing education points? question label
    @FindBy(id = "DoYouNeedCFAContinuingEducationPoints")
    private WebElement doYouNeedCFAContinuingEducationPoints;

    public boolean isDoYouNeedCFAContinuingEducationPointsDisplayed() {
        return isDisplayed(doYouNeedCFAContinuingEducationPoints);
    }

    public void validateTextDoYouNeedCFAContinuingEducationPoints(String expectedText) {
        softAssert(doYouNeedCFAContinuingEducationPoints, expectedText);
    }

    // Do you need CFA continuing education points? Yes label
    @FindBy(id = "DoYouNeedCFAContinuingEducationPointsYes")
    private WebElement doYouNeedCFAContinuingEducationPointsYes;

    public boolean isDoYouNeedCFAContinuingEducationPointsYesDisplayed() {
        return isDisplayed(doYouNeedCFAContinuingEducationPointsYes);
    }

    public void validateTextDoYouNeedCFAContinuingEducationPointsYes(String expectedText) {
        softAssert(doYouNeedCFAContinuingEducationPointsYes, expectedText);
    }

    // Do you need CFA continuing education points? Yes radio button
    @FindBy(id = "DoYouNeedCFAContinuingEducationPointsYes")
    private WebElement doYouNeedCFAContinuingEducationPointsYesRadio;

    public boolean isDoYouNeedCFAContinuingEducationPointsYesRadioDisplayed() {
        return isDisplayed(doYouNeedCFAContinuingEducationPointsYesRadio);
    }

    public void selectDoYouNeedCFAContinuingEducationPointsYesRadio() {
        click(doYouNeedCFAContinuingEducationPointsYesRadio, "Do You Need CFA Continuing Education Points Yes Radio button");
    }

    // Do you need CFA continuing education points? No label
    @FindBy(id = "DoYouNeedCFAContinuingEducationPointsNo")
    private WebElement doYouNeedCFAContinuingEducationPointsNo;

    public boolean isDoYouNeedCFAContinuingEducationPointsNoDisplayed() {
        return isDisplayed(doYouNeedCFAContinuingEducationPointsNo);
    }

    public void validateTextDoYouNeedCFAContinuingEducationPointsNo(String expectedText) {
        softAssert(doYouNeedCFAContinuingEducationPointsNo, expectedText);
    }

    // Do you need CFA continuing education points? No radio button
    @FindBy(id = "DoYouNeedCFAContinuingEducationPointsNo")
    private WebElement doYouNeedCFAContinuingEducationPointsNoRadio;

    public boolean isDoYouNeedCFAContinuingEducationPointsNoRadioDisplayed() {
        return isDisplayed(doYouNeedCFAContinuingEducationPointsNoRadio);
    }

    public void selectDoYouNeedCFAContinuingEducationPointsNoRadio() {
        click(doYouNeedCFAContinuingEducationPointsNoRadio, "Do You Need CFA Continuing Education Points No Radio button");
    }
    


    //Do you need CFP continuing education points? question label
    @FindBy(id = "DoYouNeedCFPContinuingEducationPoints")
    private WebElement doYouNeedCFPContinuingEducationPoints;

    public boolean isDoYouNeedCFPContinuingEducationPointsDisplayed() {
        return isDisplayed(doYouNeedCFPContinuingEducationPoints);
    }

    public void validateTextDoYouNeedCFPContinuingEducationPoints(String expectedText) {
        softAssert(doYouNeedCFPContinuingEducationPoints, expectedText);
    }

    //Do you need CFP continuing education points? Yes label
    @FindBy(id = "DoYouNeedCFPContinuingEducationPointsYes")
    private WebElement doYouNeedCFPContinuingEducationPointsYes;

    public boolean isDoYouNeedCFPContinuingEducationPointsYesDisplayed() {
        return isDisplayed(doYouNeedCFPContinuingEducationPointsYes);
    }

    public void validateTextDoYouNeedCFPContinuingEducationPointsYes(String expectedText) {
        softAssert(doYouNeedCFPContinuingEducationPointsYes, expectedText);
    }

    //Do you need CFP continuing education points? Yes radio button
    @FindBy(id = "DoYouNeedCFPContinuingEducationPointsYes")
    private WebElement doYouNeedCFPContinuingEducationPointsYesRadio;

    public boolean isDoYouNeedCFPContinuingEducationPointsYesRadioDisplayed() {
        return isDisplayed(doYouNeedCFPContinuingEducationPointsYesRadio);
    }

    public void selectDoYouNeedCFPContinuingEducationPointsYesRadio() {
        click(doYouNeedCFPContinuingEducationPointsYesRadio, "Do You Need CFP Continuing Education Points Yes Radio button");
    }

    //Do you need CFP continuing education points? No label
    @FindBy(id = "DoYouNeedCFPContinuingEducationPointsNo")
    private WebElement doYouNeedCFPContinuingEducationPointsNo;

    public boolean isDoYouNeedCFPContinuingEducationPointsNoDisplayed() {
        return isDisplayed(doYouNeedCFPContinuingEducationPointsNo);
    }

    public void validateTextDoYouNeedCFPContinuingEducationPointsNo(String expectedText) {
        softAssert(doYouNeedCFPContinuingEducationPointsNo, expectedText);
    }

    //Do you need CFP continuing education points? No radio button
    @FindBy(id = "DoYouNeedCFPContinuingEducationPointsNo")
    private WebElement doYouNeedCFPContinuingEducationPointsNoRadio;

    public boolean isDoYouNeedCFPContinuingEducationPointsNoRadioDisplayed() {
        return isDisplayed(doYouNeedCFPContinuingEducationPointsNoRadio);
    }

    public void selectDoYouNeedCFPContinuingEducationPointsNoRadio() {
        click(doYouNeedCFPContinuingEducationPointsNoRadio,
                "Do You Need CFP Continuing Education Points No Radio button");
    }
    
    // Previous Button
    @FindBy(id = "PreviousButton")
    private WebElement previousButton;

    public boolean isPreviousButtonDisplayed() {
        return isDisplayed(previousButton);
    }

    public void clickPreviousButton() {
        click(previousButton, "Previous Button");
    }

    public void validateTextPreviousButton(String expectedText) {
        softAssert(previousButton, expectedText);
    }

    //Next Button
    @FindBy(id = "NextButton")
    private WebElement nextButton2;

    public boolean isNextButtonDisplayed() {
        return isDisplayed(nextButton2);
    }

    public void clickNextButton() {
        click(nextButton2, "Next Button");
    }

    public void validateTextNextButton(String expectedText) {
        softAssert(nextButton2, expectedText);
    }

    // Cancel Button2
    @FindBy(id = "CancelButton2")
    private WebElement cancelButton2;

    public boolean isCancelButton2Displayed() {
        return isDisplayed(cancelButton2);
    }

    public void clickCancelButton2() {
        click(cancelButton2, "Cancel Button");
    }

    public void validateTextCancelButton2(String expectedText) {
        softAssert(cancelButton2, expectedText);
    }




}