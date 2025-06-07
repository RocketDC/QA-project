package web_automation.citiusTech.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import web_automation.citiusTech.base.TestBase;


public class ContactUs extends TestBase {
    WebDriver driver;

    public ContactUs(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // This class is used to store all the locators and methods for the Contact Us page
    //@FindBy is used to store the locators

    //Citius Tech logo locator
    @FindBy(xpath = "(//img[@title='CitiusTech'])[1]")
    public WebElement citiusTechLogo;
    // Contact Us Nav locator
    @FindBy(xpath = "(//div[@class='citius-contact-button'])[1]")
    public WebElement contactUsNav;
    // Search Icon Nav locator
    @FindBy(xpath = "//a[@class='button'][normalize-space()='Search']")
    public WebElement searchIconNav;
    public boolean citiusTechLogoIsDisplayed() {
        scrollIntoView(citiusTechLogo);
        return isDisplayed(citiusTechLogo);
    }

    public void clickCitiusTechLogo() {
        scrollIntoView(citiusTechLogo);
        click(citiusTechLogo, "Citius Tech logo");
    }
    public boolean contactUsNavIsDisplayed() {
        scrollIntoView(contactUsNav);
        return isDisplayed(contactUsNav);
    }

    public void clickContactUsNav() {
        scrollIntoView(contactUsNav);
        click(contactUsNav, "Contact Us Nav");
    }

    public void validateTextOfContactUsNav(String text) {
        softAssert(contactUsNav, text);
    }

    // ===========================(Cover Photo section)===========================

    // Location of the page contact us
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement coverPhoto;
    //Who we are label
    @FindBy(xpath = "//h2[normalize-space()='WHO WE ARE']")
    public WebElement whoWeAreLabel;
    //Contact us heading 
    @FindBy(xpath = "//h1[normalize-space()='Contact us for Healthcare IT Services & Solutions']")
    public WebElement contactUsHeading;
    //Contact us subheading
    @FindBy(xpath = "//h4[contains(text(),'Learn about our products and services, send a medi')]")
    public WebElement contactUsSubheading;


    // ======================(Get in Touch section)====================
    // Get in touch heading
    @FindBy(xpath = "//h2[normalize-space()='Get in touch']")
    public WebElement getInTouchHeading;
    //Get in touch subheading
    @FindBy(xpath = "//p[contains(text(),'For any queries feel free to contact us and our ex')]")
    public WebElement getInTouchSubheading;
    //Write to us label
    @FindBy(xpath = "//h3[normalize-space()='Write to us']")
    public WebElement writeToUsLabel;
    // General informantion label
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement generalInformationLabel;
    // General informantion email
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement generalInformationEmail;
    // Sales query label
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement salesQueryLabel;
    // Sales query email
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement salesQueryEmail;


    //==================================(Request for proposal box)==================================

    //Request for proposal button
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement requestForProposalButton;

    //Request for proposal heading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement requestForProposalHeading;

    //Request for proposal subheading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement requestForProposalSubheading;

    //first name label
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement firstNameLabel;

    //first name input
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement firstNameInput;

    //last name label
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement lastNameLabel;

    //last name input
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement lastNameInput;

    //Company name label
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement companyNameLabel;

    //Company name input
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement companyNameInput;

    //email label
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement emailLabel;

    //email input
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement emailInput;

    //phone number label
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement phoneNumberLabel;

    //phone number input
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement phoneNumberInput;

    //additional information label
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement additionalInformationLabel;

    //additional information input
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement additionalInformationInput;

    //privacy policy checkbox
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement privacyPolicyCheckbox;

    //privacy policy text
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement privacyPolicyText;

    //privacy policy link
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement privacyPolicyLink;

    //request a proposal button
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement requestAProposalButton;

//================================(Consult our experts section)================================

    //Consult our experts heading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement consultOurExpertsHeading;

    //Consult our experts subheading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement consultOurExpertsSubheading;

    //Submit button
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement submitButton;

//================================(For Partners opportunities section)================================

    //For partners opportunities heading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement forPartnersOpportunitiesHeading;

    //For partners opportunities subheading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement forPartnersOpportunitiesSubheading;

    //How can we help you label
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement howCanWeHelpYouLabel;

    //How can we help input box
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement howCanWeHelpInput;

    //Contact us button
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement contactUsButton;

//===============================(For media and press section)==============================

    //For media and press heading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement forMediaAndPressHeading;

    //For media and press subheading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement forMediaAndPressSubheading;

    //Contact us button
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement contactUsButton2;

//================================(Career opportunities section)================================

    //Career opportunities heading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement careerOpportunitiesHeading;

    //Career opportunities subheading
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement careerOpportunitiesSubheading;

    //Contact us button
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement contactUsButton3;




    // ===========================(Cover Photo section)===========================

    public boolean coverPhotoIsDisplayed() {
        scrollIntoView(coverPhoto);
        return isDisplayed(coverPhoto);
    }

    public void clickCoverPhoto() {
        scrollIntoView(coverPhoto);
        click(coverPhoto, "Cover Photo");
    }

    public void validateTextOfCoverPhoto(String text) {
        softAssert(coverPhoto, text);
    }

    public boolean whoWeAreLabelIsDisplayed() {
        scrollIntoView(whoWeAreLabel);
        return isDisplayed(whoWeAreLabel);
    }

    public void clickWhoWeAreLabel() {
        scrollIntoView(whoWeAreLabel);
        click(whoWeAreLabel, "Who We Are Label");
    }

    public void validateTextOfWhoWeAreLabel(String text) {
        softAssert(whoWeAreLabel, text);
    }

    public boolean contactUsHeadingIsDisplayed() {
        scrollIntoView(contactUsHeading);
        return isDisplayed(contactUsHeading);
    }

    public void clickContactUsHeading() {
        scrollIntoView(contactUsHeading);
        click(contactUsHeading, "Contact Us Heading");
    }

    public void validateTextOfContactUsHeading(String text) {
        softAssert(contactUsHeading, text);
    }

    public boolean contactUsSubheadingIsDisplayed() {
        scrollIntoView(contactUsSubheading);
        return isDisplayed(contactUsSubheading);
    }

    public void clickContactUsSubheading() {
        scrollIntoView(contactUsSubheading);
        click(contactUsSubheading, "Contact Us Subheading");
    }

    public void validateTextOfContactUsSubheading(String text) {
        softAssert(contactUsSubheading, text);
    }


    // ======================(Get in Touch section)====================

    public boolean getInTouchHeadingIsDisplayed() {
        scrollIntoView(getInTouchHeading);
        return isDisplayed(getInTouchHeading);
    }

    public void clickGetInTouchHeading() {
        scrollIntoView(getInTouchHeading);
        click(getInTouchHeading, "Get in Touch Heading");
    }

    public void validateTextOfGetInTouchHeading(String text) {
        softAssert(getInTouchHeading, text);
    }

    public boolean getInTouchSubheadingIsDisplayed() {
        scrollIntoView(getInTouchSubheading);
        return isDisplayed(getInTouchSubheading);
    }

    public void clickGetInTouchSubheading() {
        scrollIntoView(getInTouchSubheading);
        click(getInTouchSubheading, "Get in Touch Subheading");
    }

    public void validateTextOfGetInTouchSubheading(String text) {
        softAssert(getInTouchSubheading, text);
    }

    public boolean writeToUsLabelIsDisplayed() {
        scrollIntoView(writeToUsLabel);
        return isDisplayed(writeToUsLabel);
    }


    public void validateTextOfWriteToUsLabel(String text) {
        softAssert(writeToUsLabel, text);
    }

    public boolean generalInformationLabelIsDisplayed() {
        scrollIntoView(generalInformationLabel);
        return isDisplayed(generalInformationLabel);
    }

    public void validateTextOfGeneralInformationLabel(String text) {
        softAssert(generalInformationLabel, text);
    }

    public boolean generalInformationEmailIsDisplayed() {
        scrollIntoView(generalInformationEmail);
        return isDisplayed(generalInformationEmail);
    }

    public void validateTextOfGeneralInformationEmail(String text) {
        softAssert(generalInformationEmail, text);
    }

    public boolean salesQueryLabelIsDisplayed() {
        scrollIntoView(salesQueryLabel);
        return isDisplayed(salesQueryLabel);
    }

    public void validateTextOfSalesQueryLabel(String text) {
        softAssert(salesQueryLabel, text);
    }

    public boolean salesQueryEmailIsDisplayed() {
        scrollIntoView(salesQueryEmail);
        return isDisplayed(salesQueryEmail);
    }

    public void validateTextOfSalesQueryEmail(String text) {
        softAssert(salesQueryEmail, text);
    }


    //==================================(Request for proposal box)==================================

    public boolean requestForProposalButtonIsDisplayed() {
        scrollIntoView(requestForProposalButton);
        return isDisplayed(requestForProposalButton);
    }

    public void validateTextOfRequestForProposalButton(String text) {
        softAssert(requestForProposalButton, text);
    }

    public void clickRequestForProposalButton() {
        scrollIntoView(requestForProposalButton);
        click(requestForProposalButton, "Request for Proposal Button");
    }


    //================================(Consult our experts section)================================

    public boolean consultOurExpertsHeadingIsDisplayed() {
        scrollIntoView(consultOurExpertsHeading);
        return isDisplayed(consultOurExpertsHeading);
    }

    public void validateTextOfConsultOurExpertsHeading(String text) {
        softAssert(consultOurExpertsHeading, text);
    }

    public boolean consultOurExpertsSubheadingIsDisplayed() {
        scrollIntoView(consultOurExpertsSubheading);
        return isDisplayed(consultOurExpertsSubheading);
    }

    public void validateTextOfConsultOurExpertsSubheading(String text) {
        softAssert(consultOurExpertsSubheading, text);
    }

}
