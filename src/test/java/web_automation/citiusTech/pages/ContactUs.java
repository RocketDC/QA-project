package web_automation.citiusTech.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class ContactUs {

    //This class is used to store all the locators and methods for the Contact Us page
    //@FindBy is used to store the locators

    // ===========================(NAV Buttons section)===========================

    //Citius Tech logo locator
    @FindBy(xpath = "//img[@alt='Citius Tech']") 
    public WebElement citiusTechLogo;
    //What we do Nav locator
    @FindBy(xpath = "//a[normalize-space()='What we do']") 
    public WebElement whatWeDoNav;
    // Who we are Nav locator
    @FindBy(xpath = "//a[normalize-space()='Who we are']") 
    public WebElement whoWeAreNav;
    // what we think Nav locator
    @FindBy(xpath = "//a[normalize-space()='What we think']") 
    public WebElement whatWeThinkNav;
    // Partners Nav locator
    @FindBy(xpath = "//a[normalize-space()='Partners']") 
    public WebElement partnersNav;
    // Careers Nav locator
    @FindBy(xpath = "//a[normalize-space()='Careers']") 
    public WebElement careersNav;
    // Contact Us Nav locator
    @FindBy(xpath = "//a[normalize-space()='Contact Us']") 
    public WebElement contactUsNav;
    // Search Icon Nav locator
    @FindBy(xpath = "//a[@class='button'][normalize-space()='Search']") 
    public WebElement searchIconNav;


    // ===========================(Cover Photo section)===========================

    // Location of the page contact us
    @FindBy(xpath = "//div[@class='cover-photo']") 
    public WebElement coverPhoto;
    //Who we are label
    @FindBy(xpath = "//div[@class='cover-photo']") 
    public WebElement whoWeAreLabel;
    //Contact us heading 
    @FindBy(xpath = "//div[@class='cover-photo']") 
    public WebElement contactUsHeading;
    //Contact us subheading
    @FindBy(xpath = "//div[@class='cover-photo']") 
    public WebElement contactUsSubheading;




    // ======================(Get in Touch section)====================
    // Get in touch heading
    @FindBy(xpath = "//div[@class='cover-photo']") 
    public WebElement getInTouchHeading;
    //Get in touch subheading
    @FindBy(xpath = "//div[@class='cover-photo']") 
    public WebElement getInTouchSubheading;
    //Write to us label
    @FindBy(xpath = "//div[@class='cover-photo']") 
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




    
}
