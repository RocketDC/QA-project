package web_automation.analytics_vidhya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import web_automation.analytics_vidhya.base.TestBase;

public class HomePage extends TestBase {
    WebDriver driver;

    //17 Screen are there in the home page
    // ========== Constructor ==========
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ========== Locators ==========

    private By analyticVidhyaIcon = By.xpath("//*[@id=\"genai\"]/header/div/a/svg");
    private By enrollNowButton = By.xpath("//button[text()=\"Enroll Now\"]");
    private By acceptCookies = By.xpath("(//button[text()=\"Accept all cookies\"])[1]");
    private By useNecessaryCookies = By.xpath("//button[text()=\"Register\"]");
    private By initialPopUpHeading = By.xpath("//h2[text()=\"Transform into a GenAI and Agentic AI Pro: Take the First Step\"]");
    private By enrollNowWindowHeading = By.xpath("//h2[text()=\"Step Into the AI-Powered Future\"]");
    private By enrollNowWindowCrossButton = By.xpath("//button[@aria-label=\"Close\"]");
    private By fullNameLabel = By.xpath("(//label[text()=\"Full Name\"])[1]");
    private By fullName = By.xpath("//*[@id='leadFullName']");
    private By phoneNumberLabel = By.xpath("(//label[text()=\"Phone Number\"])[1]");
    private By phoneNumberTextBox = By.xpath("//*[@id='leadPhoneNumber']");
    private By emailLabel = By.xpath("(//label[text()=\"Email Id\"])[1]");
    private By emailTextBox = By.xpath("//*[@id='leadEmail']");
    private By downloadProjectButton = By.xpath("//button[text()=\"Download Projects\"]");
    private By skipButton = By.xpath("//button[text()=\"Skip\"]");
    private By skipButton2 = By.xpath("//*[@id=\"pinnaclePlusLeadModal\"]/div/div/div[1]/button");
    @FindBy(xpath = "//button[@class='btn background-dark-secondary p-2 rounded-circle close']//*[name()='svg']")
    WebElement closeButtonInPopUp;
//    private By cbTnC = By.xpath("//*[@id=\"termAndConditionLoginModal\"]");
//    private By TncLabel = By.xpath("//label[@for=\"termAndConditionLoginModal\"]");
//    private By cbSendWhatsApp = By.xpath("//input[@type=\"checkbox\" and @id=\"isWhatsappLoginModal\"]");
//    private By enrollNowButtonInWindow = By.xpath("//button[text()=\"Enroll Now\"]");
//    private By sendWhatsAppLabel = By.xpath("//label[@for=\"isWhatsappLoginModal\"]");
//    private By downloadBrochureButton = By.xpath("//button[text()=\"Download Brochure\"]");
//    private By requestCallbackButton = By.xpath("//button[text()=\"Request Callback\"]");
//    private By getPersonalizedRoadmapButton = By.xpath("//button[text()=\"Get Personalized Roadmap\"]");
//    private By viewAllProjectsButton = By.xpath("//button[text()=\"View All Projects\"]");
//    private By downloadInstructionProfileButton = By.xpath("//button[text()=\"Download Instruction Profile\"]");
//    private By getWorkshopsDetailsButton = By.xpath("//button[text()=\"Get Workshops Details\"]");
//    private By upskillReskillThriveSection = By.xpath("//h2[text()=\"Upskill, Reskill, Thrive.\"]");
//
//    private By cbTnCurt = By.xpath("//input[@type=\"checkbox\"]");
//    private By tnCurt = By.xpath("//a[text()=\"Terms and Conditions\"]");
//    private By cbSendWhatsAppCurt = By.xpath("//input[@type=\"checkbox\"]");
//    private By sendWhatsAppCurt = By.xpath("//a[text()=\"Send WhatsApp\"]");
//
//    private By cbNotARobot = By.xpath("//input[@type=\"checkbox\"]");
//    private By joinTheProgramButton = By.xpath("//button[text()=\"Join the Program\"]");
//    private By aiSupportIcon = By.xpath("//img[@alt=\"AI Support\"]");
//    private By contactUsTodayHeading = By.xpath("//h2[text()=\"Contact Us Today!\"]");
//    private By contactUsTodaySubHeading = By.xpath("//h3[text()=\"Take the first step towards a future of innovation & excellence with Analytics Vidhya\"]");
//    private By getExpertGuidanceHeading = By.xpath("//h2[text()=\"Get Expert Guidance\"]");
//    private By getExpertGuidanceSubHeading = By.xpath("//h3[text()=\"Need support? We've got your back anytime!\"]");
//    private By imagePhone = By.xpath("//img[@alt=\"blackbelt/icons/phone_number.svg\"]");
//    private By supportPhoneNumber = By.xpath("//a[text()=\"+91-9354711240\"]");
//    private By supportPhoneNumberSubHeading = By.xpath("//h3[text()=\"10AM - 7PM (IST) Mon-Sun\"]");
//    private By imageEmail = By.xpath("//img[@alt=\"blackbelt/icons/email.svg\"]");
//    private By supportEmail = By.xpath("//a[text()=\"customersupport@analyticsvidhya.com\"]");
//    private By supportEmailSubHeading = By.xpath("//h3[text()=\"You'll hear back from us in 24 hours.\"]");


    // ========== top-nav ==========
    @FindBy(xpath = "//a[@class='navbar-brand me-5']//*[name()='svg']")
    WebElement analyticsVidhyaIconTopNav;

    @FindBy(xpath = "//a[normalize-space()='What to Expect']")
    WebElement whatToExpectTopNav;

    @FindBy(xpath = "//a[normalize-space()='Curriculum']")
    WebElement curriculumTopNav;
    @FindBy(xpath = "//a[normalize-space()='Instructors']")
    WebElement instructorsTopNav;

    @FindBy(xpath = "//a[normalize-space()='Fees']")
    WebElement feesTopNav;

    @FindBy(xpath = "//a[normalize-space()='Testimonials']")
    WebElement testimonialsTopNav;

    @FindBy(xpath = "//button[@class='btn btn-dark btn-dark-primary btn-dark-primary-gradient-outline fw-semibold rounded-3 z-3 fs-16 close-mobile-sidebar']")
    WebElement enrollNowButtonTopNav;

    // ========== Page First View ==========

    @FindBy(xpath = "//h1[@class='fs-56 text-gradient mb-3 fw-semibold text-center']")
    WebElement siteTitle;
    @FindBy(xpath = "//h2[contains(text(),'Industry-Focused Learning : Master GenAI and Agent')]")
    WebElement siteSubTitle;

    @FindBy(xpath = "//h3[normalize-space()='300+']")
    public WebElement projects;
    @FindBy(xpath = "//p[normalize-space()='Hours of Immersive Learning']")
    public WebElement hoursOfImmersiveLearning;
    @FindBy(xpath = "//p[normalize-space()='Placement Assistance']")
    public WebElement placementAssistance;
    @FindBy(xpath = "//h3[normalize-space()='100%']")
    public WebElement placementRate;
    @FindBy(xpath = "//p[normalize-space()='Hours of Live Workshops Quarterly']")
    public WebElement hoursOfLiveWorkshops;
    @FindBy(xpath = "//h3[normalize-space()='30+']")
    public WebElement liveWorkshops;
    @FindBy(xpath = "//p[normalize-space()='1:1 Expert-Led Mentorships']")
    public WebElement expertLedMentorships;
    @FindBy(xpath = "//h3[normalize-space()='75+']")
    public WebElement mentorships;


// ========== Page First View pop up ==========

    @FindBy(xpath = "//h4[normalize-space()='Become a GenAI and Agentic AI Expert : Start Now']")
    WebElement popUpTitle;
    @FindBy(xpath = "//input[@id='bbName']")
    public WebElement fullNamePopUp;
    @FindBy(xpath = "//input[@id='genaiPlusNumber']")
    public WebElement phoneNumberPopUp;
    @FindBy(xpath = "//div[@class='col-12 col-xl mb-3 mb-xl-0']//div[@title='India: +91']//div[@class='iti__flag iti__in']")
    public WebElement countryFlag;
    @FindBy(xpath = "//input[@id='genaiEmail']")
    public WebElement emailPopUp;
    @FindBy(xpath = "//label[@for='inlineCheckbox1']")
    public WebElement tncText;
    @FindBy(xpath = "//label[@for='inlineCheckbox2']")
    public WebElement sendWhatsAppText;
    @FindBy(xpath = "//button[normalize-space()='Download Brochure']")
    public WebElement downloadBrochureButtonPopUp;

    // ========== Contact Us ==========

    @FindBy(xpath = "//a[normalize-space()='GenAI Savings Offer']")
    WebElement genAiSavingsOffer;

    @FindBy(xpath = "//div[@class='d-flex align-items-center justify-content-center rounded-circle bg-my-gradient cursor-pointer floating-icons']")
    WebElement aiSupportIcon;

    @FindBy(xpath = "//div[@class='d-flex align-items-center justify-content-center rounded-circle background-dark-tertiary text-center mt-3 cursor-pointer floating-icons']")
    WebElement supportCrossIcon;

    @FindBy(xpath = "//div[@class='d-flex align-items-center justify-content-center rounded-circle background-dark-tertiary mt-3 cursor-pointer floating-icons']")
    WebElement supportWhatsAppIcon;

    @FindBy(xpath = "//*[name()='path' and contains(@d,'M10.5654 2')]")
    WebElement supportPhoneIcon;


    // ========== second Section ==========
    @FindBy(xpath = "//h2[normalize-space()='How does the GenAI Pinnacle Plus Program Help You?']")
    WebElement howDoesTheGenAiPinnaclePlusProgramHelpYou;

    @FindBy(xpath = "//div[@class='col-xl-4 col-lg-4 col-md-12 col-sm-12 mb-4 mb-lg-0 px-3']//h3[@class='fs-24 fw-semibold mb-4'][normalize-space()='300+ Hours of Immersive Learning']")
    WebElement hoursOfImmersiveLearning2;
    @FindBy(xpath = "//ul[@class='mb-4 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Full-spectrum GenAI and Agentic AI learning with 1')]")
    WebElement fullSpectrumGenAiAndAgenticAiLearning;
    @FindBy(xpath = "//ul[@class='mb-4 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Master cutting-edge GenAI and Agentic AI framework')]")
    WebElement masterCuttingEdgeGenAi;
    @FindBy(xpath = "//div[@class='col-xl-4 col-lg-4 col-md-12 col-sm-12 mb-4 mb-lg-0 px-3']//h3[@class='fs-24 fw-semibold mb-4'][normalize-space()='50+ Industry-Aligned Projects']")
    WebElement industryAlignedProjects;
    @FindBy(xpath = "//ul[@class='mb-4 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Acquire real-world experience through projects tha')]")
    WebElement acquireRealWorldExperience;
    @FindBy(xpath = "//ul[@class='mb-4 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Diverse projects designed to transform knowledge i')]")
    WebElement diverseProjects;
    @FindBy(xpath = "//div[@class='col-xl-4 col-lg-4 col-md-12 col-sm-12 mb-4 mb-lg-0 px-3']//h3[@class='fs-24 fw-semibold mb-4'][normalize-space()='1:1 Expert Mentorship']")
    WebElement expertMentorship;
    @FindBy(xpath = "//ul[@class='mb-4 mb-md-0 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][normalize-space()='Get expert insights from seasoned professionals']")
    WebElement expertInsights;
    @FindBy(xpath = "//ul[@class='mb-4 mb-md-0 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Accelerate your learning with a personalized roadm')]")
    WebElement personalizedRoadmap;


    // ========== Curriculum Statistics section ==========

    @FindBy(xpath = "//h2[normalize-space()='Curriculum Statistics']")
    WebElement curriculumStatistics;
    @FindBy(xpath = "//h4[normalize-space()='50+ Projects']")
    WebElement projects2;
    @FindBy(xpath = "//p[contains(text(),'Hands-on learning with industry-relevant challenge')]")
    WebElement handsOnLearning;

    @FindBy(xpath = "//h4[normalize-space()='300+ Hours']")
    WebElement hoursOfImmersiveLearning2_2;
    @FindBy(xpath = "//p[contains(text(),'In-depth GenAI and Agentic AI learning to transfor')]")
    WebElement inDepthLearning;
    @FindBy(xpath = "//h4[normalize-space()='40+ Libraries']")
    WebElement libraries;
    @FindBy(xpath = "//p[contains(text(),'Develop expertise in 40+ essential industry tools,')]")
    WebElement developExpertise;
    @FindBy(xpath = "//h4[normalize-space()='30+ Assignments']")
    WebElement assignments;
    @FindBy(xpath = "//p[normalize-space()='To turn knowledge into action']")
    WebElement turnKnowledgeIntoAction;
    @FindBy(xpath = "//h4[normalize-space()='75+ Mentorship Sessions']")
    WebElement mentorshipSessions;
    @FindBy(xpath = "//p[contains(text(),'1:1 live mentorship session from GenAI and Agentic')]")
    WebElement liveMentorshipSession;

    // ========== Personalized Roadmap section ==========

    @FindBy(xpath = "//h2[normalize-space()='Personalized Roadmap']")
    WebElement personalizedRoadmapSection;
    @FindBy(xpath = "//p[contains(text(),'Your ambition + our expertise = your custom path t')]")
    WebElement yourAmbition;

    @FindBy(xpath = "//div[@class='d-flex flex-wrap justify-content-center align-items-center']//a[@class='btn btn-dark btn-dark-primary rounded-3 mb-2 mb-md-0 btn-dark-primary-gradient-outline fw-semibold'][normalize-space()='Request Callback']")
    WebElement requestCallbackButton;
    @FindBy(xpath = "//button[@id='roadmapBtn']")
    WebElement getPersonalizedRoadmapButton;

    // ========== Curriculum section ==========
    @FindBy(xpath = "//h2[normalize-space()='Curriculum']")
    WebElement curriculum;
    @FindBy(xpath = "//p[contains(text(),'From Python foundations to GenAI and Agentic AI : ')]")
    WebElement fromPythonFoundations;
    @FindBy(xpath = "//div[contains(text(),'50+ Projects')]")
    WebElement projects3;
    @FindBy(xpath = "//div[contains(text(),'300+ Hours')]")
    WebElement hoursOfImmersiveLearning3;
    @FindBy(xpath = "//div[normalize-space()='40+ Tools']")
    WebElement tools;
    @FindBy(xpath = "//div[contains(text(),'30+ Assignments')]")
    WebElement assignments2;
    private By curriculamSection = By.xpath("//div[@class='accordion-item border-0']");

    @FindBy(xpath = "//img[@alt='Choose What to Learn Image']")
    WebElement chooseWhatToLearnImage;
    @FindBy(xpath = "//button[normalize-space()='Download Free Curriculum']")
    WebElement downloadFreeCurriculumButton;

    // ========== Libraries & Frameworks section ==========
    @FindBy(xpath = "//h2[normalize-space()='Libraries & Frameworks']")
    WebElement librariesAndFrameworks;

    @FindBy(xpath = "//p[contains(text(),'Master 40+ GenAI and Agentic AI tools, libraries a')]")
    WebElement master40Libraries;
    private By librariesAndFrameworksSection = By.xpath("//div[@class=\"d-inline-block w-auto mb-3\"]");
    @FindBy(xpath = "//button[normalize-space()='Download Tools Pack']")
    WebElement downloadToolsPackButton;

    // ========== Build Your Portfolio section ==========
    @FindBy(xpath = "//h2[contains(text(),'Build Your Portfolio with')]")
    WebElement buildYourPortfolio;
    @FindBy(xpath = "//p[contains(text(),'Accelerate your industry readiness with projects d')]")
    WebElement accelerateYourIndustryReadiness;
    @FindBy(xpath = "//div[@class='mx-1']//a[@class='btn btn-dark btn-dark-primary rounded-3 mb-2 mb-md-0 btn-dark-primary-gradient-outline fw-semibold'][normalize-space()='Request Callback']")
    WebElement requestCallbackButton2;
    @FindBy(xpath = "//button[normalize-space()='View All Projects']")
    WebElement viewAllProjectsButton;

    // ========== Real Experience, Real Insights section ==========

    @FindBy(xpath = "//h2[contains(text(),'Real Experience, Real Insights: Your Expert Mentor')]")
    WebElement realExperienceRealInsights;
    @FindBy(xpath = "//p[normalize-space()='Tap into decades of combined industry experience']")
    WebElement tapIntoDecades;
    @FindBy(xpath = "//div[@class='d-flex flex-wrap w-100 justify-content-center align-items-center']//div[@class='text-center mx-1']//a[@class='btn btn-dark btn-dark-primary rounded-3 mb-2 mb-md-0 btn-dark-primary-gradient-outline fw-semibold'][normalize-space()='Request Callback']")
    WebElement requestCallbackButton3;
    @FindBy(xpath = "//button[@class='btn btn-dark btn-dark-primary btn-dark-primary-gradient rounded-3 mx-1 fw-semibold'][normalize-space()='Download Instructors Profile']")
    WebElement downloadInstructorsProfileButton;

    // ========== Instructor-Led section ==========

    @FindBy(xpath = "//h2[normalize-space()='Instructor-Led Live Workshops']")
    WebElement instructorLedLiveWorkshops;
    @FindBy(xpath = "//p[@class='fs-18 fw-normal']")
    WebElement instructorLedLiveWorkshopsSubHeading;
    @FindBy(xpath = "//button[normalize-space()='Get Workshops Detail']")
    WebElement getWorkshopsDetailsButton;

    // ========== Assisted Placements section ==========

    @FindBy(xpath = "//h2[normalize-space()='AV Assisted Placements']")
    WebElement avAssistedPlacements;
    @FindBy(xpath = "//p[contains(text(),'Our alumni universe: 1200+ professionals making th')]")
    WebElement ourAlumniUniverse;

    // ========== Industry-Recognized Certification section ==========
    @FindBy(xpath = "//h2[normalize-space()='Industry-Recognized Certification']")
    WebElement industryRecognizedCertification;
    @FindBy(xpath = "//p[contains(text(),'Get certified in GenAI and Agentic AI from Analyti')]")
    WebElement getCertified;
    @FindBy(xpath = "//button[normalize-space()='Earn Certificates']")
    WebElement earnCertificatesButton;

    // ========== Our Advisors section ==========

    @FindBy(xpath = "//h2[normalize-space()='Our Advisors']")
    WebElement ourAdvisors;
    @FindBy(xpath = "//p[contains(text(),'Our advisors ensure our programs are innovative, i')]")
    WebElement ourAdvisorsSubHeading;

    // ========== AV Learners section ==========
    @FindBy(xpath = "//h2[normalize-space()='AV Learners Spotlight']")
    WebElement avLearnersSpotlight;

    @FindBy(xpath = "//a[normalize-space()='View More']")
    WebElement viewMoreButton;


// ========== Money Back section ==========

    @FindBy(xpath = "//h2[normalize-space()='Money Back Guarantee!']")
    WebElement moneyBackGuarantee;
    @FindBy(xpath = "//p[contains(text(),'GenAI Pinnacle Plus Program comes with 7 days no q')]")
    WebElement noQuestionAsked;
    @FindBy(xpath = "//div[@class='col-xl-4 col-lg-4 col-md-4 col-7 order-1 order-md-2 mx-auto']//img[@class='img-fluid']")
    WebElement moneyBackGuaranteeImage;

// ========== Invest in Your Future section ==========

    @FindBy(xpath = "//h2[normalize-space()='Invest in Your Future Today']")
    WebElement investInYourFutureToday;
    @FindBy(xpath = "//span[contains(text(),'Exclusive access to AI tools builds expertise with')]")
    WebElement exclusiveAccessToAiTools;
    @FindBy(xpath = "//span[contains(text(),'Boost your career, fast-track your growth with per')]")
    WebElement boostYourCareer;
    @FindBy(xpath = "//span[contains(text(),'Enroll now and start your journey to becoming a Ge')]")
    WebElement enrollNowAndStartYourJourney;
    @FindBy(xpath = "//h3[@id='oneTimeToggleLabel']")
    WebElement oneTimeToggleLabel;
    @FindBy(xpath = "//label[@id='emiToggleLabel']")
    WebElement emiToggleLabel;
    @FindBy(xpath = "//input[@id='priceCheck']")
    WebElement priceToggle;
    @FindBy(xpath = "//h4[normalize-space()='One Time']")
    WebElement oneTime;
    @FindBy(xpath = "//h4[normalize-space()='EMI']")
    WebElement emi;
    @FindBy(xpath = "//h4[normalize-space()='One Time']/../h5[@class='fs-40 fw-bold mb-2']")
    WebElement price;
    @FindBy(xpath = "//h5[contains(text(),'₹9,499')]")
    WebElement emiPrice;
    @FindBy(xpath = "//div[@id='toggleCard1']//h6[@class='text-dark-secondary mt-3 mb-5'][normalize-space()='(Inclusive of all taxes)']")
    WebElement oneTimePriceInclusiveOfAllTaxes;
    @FindBy(xpath = "//div[@id='toggleCard1']//p[@class='text-dark-secondary'][normalize-space()='Level Up Your Professional Journey']")
    WebElement levelUpYourProfessionalJourney;
    @FindBy(xpath = "//div[@id='toggleCard1']//button[@class='btn btn-dark btn-dark-primary btn-dark-primary-gradient rounded-3 w-100 mt-3 fw-semibold'][normalize-space()='Enroll Now']")
    WebElement enrollNowButtonOneTime;

// ========== Contact Us Today section ==========

    @FindBy(xpath = "//h2[normalize-space()='Contact Us Today']")
    WebElement contactUsToday;
    @FindBy(xpath = "//p[contains(text(),'Take the first step towards a future of innovation')]")
    WebElement takeTheFirstStep;
    @FindBy(xpath = "//h2[normalize-space()='Upskill, Reskill, Thrive']")
    WebElement upskillReskill;
    @FindBy(xpath = "//label[@for='contactFullName']")
    WebElement contactFullNameLabel;
    @FindBy(xpath = "//input[@id='contactFullName']")
    WebElement contactFullName;
    @FindBy(xpath = "//label[@for='contactEmail']")
    WebElement contactEmailLabel;
    @FindBy(xpath = "//input[@id='contactEmail']")
    WebElement contactEmail;
    @FindBy(xpath = "//label[@for='contactPhoneNumber']")
    WebElement contactPhoneNumberLabel;
    @FindBy(xpath = "//input[@id='contactPhoneNumber']")
    WebElement contactPhoneNumber;
    @FindBy(xpath = "//div[@class='col-xl col-md-12 col-12 mb-3']//div[@title='India: +91']//div[@class='iti__flag iti__in']")
    WebElement countryFlagContactUs;
    @FindBy(xpath = "//div[@class='col-xl col-md-12 col-12 mb-3']//div[@class='iti__arrow']")
    WebElement countryFlagArrowContactUs;
    @FindBy(xpath = "//label[normalize-space()='Experience :']")
    WebElement experienceLabel;
    @FindBy(xpath = "(//label[normalize-space()='0-3yrs'])[1]")
    WebElement experience0_3;
    @FindBy(xpath = "//label[normalize-space()='3-8yrs']")
    WebElement experience3_8;
    @FindBy(xpath = "//label[normalize-space()='8-12yrs']")
    WebElement experience8_12;
    @FindBy(xpath = "//label[normalize-space()='12yrs+']")
    WebElement experience12;
    @FindBy(xpath = "//div[@class='mt-3 mb-2 d-flex flex-wrap']//label[@for='termAndConditionLoginModal']")
    WebElement termsAndConditionsLabel;
    @FindBy(xpath = "//label[@for='isWhatsappContactModal']")
    WebElement sendWhatsAppLabel;
    @FindBy(xpath = "//input[@id='isWhatsappContactModal']")
    WebElement sendWhatsAppCheckbox;
    //Recapta is not implemented
    @FindBy(xpath = "//button[normalize-space()='Join the program now!!']")
    WebElement joinTheProgramButton;

    @FindBy(xpath = "//h3[normalize-space()='Get Expert Guidance']")
    WebElement getExpertGuidance;
    @FindBy(xpath = "//p[@class='text-dark-tertiary mt-4 fs-20 fw-light mb-5']")
    WebElement needSupport;
    @FindBy(xpath = "//div[@class='col-lg-5 col-md-12 col-sm-12 mb-3 ps-lg-5']//li[1]//div[1]//div[1]")
    WebElement imagePhone;
    @FindBy(xpath = "//a[normalize-space()='+91-9354711240']")
    WebElement supportPhoneNumber;
    @FindBy(xpath = "//h3[normalize-space()='10AM - 7PM (IST) Mon-Sun']")
    WebElement supportPhoneNumberSubHeading;
    @FindBy(xpath = "//div[@class='col-lg-5 col-md-12 col-sm-12 mb-3 ps-lg-5']//li[2]//div[1]//div[1]")
    WebElement imageEmail;
    @FindBy(xpath = "//p[normalize-space()='customersupport@analyticsvidhya.com']")
    WebElement supportEmail;
    @FindBy(xpath = "//h3[normalize-space()='You’ll hear back from us in 24 hours.']")
    WebElement supportEmailSubHeading;

// ========== Frequently Asked Questions section ==========

    @FindBy(xpath = "//h2[normalize-space()='Frequently Asked Questions']")
    WebElement frequentlyAskedQuestions;
    @FindBy(xpath = "//p[normalize-space()='Looking for answers to other questions?']")
    WebElement lookingForAnswers;
    @FindBy(xpath = "//button[contains(text(),'What makes the GenAI Pinnacle Plus Program differe')]")
    WebElement whatMakesTheGenAiPinnaclePlusProgramDifferent;
    @FindBy(xpath = "//button[contains(text(),'How is the GenAI Pinnacle Plus Program different f')]")
    WebElement howIsTheGenAiPinnaclePlusProgramDifferent;
    @FindBy(xpath = "//button[normalize-space()='Who is the ideal candidate for this program?']")
    WebElement whoIsTheIdealCandidate;
    @FindBy(xpath = "//button[normalize-space()='View More']")
    WebElement viewMore;

// ========== Flagship Programs section ==========

    @FindBy(xpath = "//h2[normalize-space()='Flagship Programs']")
    WebElement flagshipPrograms;
    @FindBy(xpath = "//a[normalize-space()='GenAI Pinnacle Program']")
    WebElement genAiPinnacleProgram;


    // ========== Actions ==========
    public boolean ifAnalyticsVidyaIconIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(driver -> driver.findElement(analyticVidhyaIcon).isDisplayed());

    }

    public boolean ifInitialPopUpHeadingIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(driver -> driver.findElement(initialPopUpHeading).isDisplayed());
    }

    public String getInitialPopUpHeadingText() {
        return driver.findElement(initialPopUpHeading).getText();
    }

    public String getfullNameLabelText() {
        return driver.findElement(fullNameLabel).getText();
    }

    public void enterFullName(String fullName) {
        driver.findElement(this.fullName).sendKeys(fullName);
    }


    public void clickEnrollNowButton() {
        driver.findElement(enrollNowButton).click();
    }

    public void clickAcceptCookies() {
        driver.findElement(acceptCookies).click();
    }

    public void clickUseNecessaryCookies() {
        driver.findElement(useNecessaryCookies).click();
    }


    public String getPhoneNumberLabelText() {
        return driver.findElement(phoneNumberLabel).getText();
    }

    public String getEmailLabelText() {
        return driver.findElement(emailLabel).getText();
    }

    public void enterPhoneNumber(String phone) {
        driver.findElement(phoneNumberTextBox).sendKeys(phone);
    }

    public void enterEmail(String email) {
        driver.findElement(emailTextBox).sendKeys(email);
    }

    public String getDownloadProjectButtonText() {
        return driver.findElement(downloadProjectButton).getText();
    }

    public void downloadProjectButton() {
        driver.findElement(downloadProjectButton).click();
    }

    public void clickCrossButton() {
        driver.findElement(enrollNowWindowCrossButton).click();
    }

    public void clickSkipButton() {
        driver.findElement(skipButton2).click();
    }


    // ========== top-nav functions==========
    public boolean analyticsVidhyaIconTopNavIsDisplayed() {
        scrollIntoView(analyticsVidhyaIconTopNav);
        return analyticsVidhyaIconTopNav.isDisplayed();
    }

    public void clickAnalyticsVidhyaIconTopNav() {
        scrollIntoView(analyticsVidhyaIconTopNav);
        click(analyticsVidhyaIconTopNav, "Analytics Vidhya icon in top nav");
    }

    public boolean whatToExpectTopNavIsDisplayed() {
        scrollIntoView(whatToExpectTopNav);
        return whatToExpectTopNav.isDisplayed();
    }

    public void clickWhatToExpectTopNav() {
        scrollIntoView(whatToExpectTopNav);
        click(whatToExpectTopNav, "What to Expect in top nav");
    }

    public void validateTextOfWhatToExpectTopNav(String text) {
        softAssert(whatToExpectTopNav, text);
    }

    public boolean curriculumTopNavIsDisplayed() {
        scrollIntoView(curriculumTopNav);
        return curriculumTopNav.isDisplayed();
    }

    public void clickCurriculumTopNav() {
        scrollIntoView(curriculumTopNav);
        click(curriculumTopNav, "Curriculum in top nav");
    }

    public void validateTextOfCurriculumTopNav(String text) {
        softAssert(curriculumTopNav, text);
    }

    public boolean instructorsTopNavIsDisplayed() {
        scrollIntoView(instructorsTopNav);
        return instructorsTopNav.isDisplayed();
    }

    public void clickInstructorsTopNav() {
        scrollIntoView(instructorsTopNav);
        click(instructorsTopNav, "Instructors in top nav");
    }

    public void validateTextOfInstructorsTopNav(String text) {
        softAssert(instructorsTopNav, text);
    }

    public boolean feesTopNavIsDisplayed() {
        scrollIntoView(feesTopNav);
        return feesTopNav.isDisplayed();
    }

    public void clickFeesTopNav() {
        scrollIntoView(feesTopNav);
        click(feesTopNav, "Fees in top nav");
    }

    public void validateTextOfFeesTopNav(String text) {
        softAssert(feesTopNav, text);
    }

    public boolean testimonialsTopNavIsDisplayed() {
        scrollIntoView(testimonialsTopNav);
        return testimonialsTopNav.isDisplayed();
    }

    public void clickTestimonialsTopNav() {
        scrollIntoView(testimonialsTopNav);
        click(testimonialsTopNav, "Testimonials in top nav");
    }

    public void validateTextOfTestimonialsTopNav(String text) {
        softAssert(testimonialsTopNav, text);
    }

    public boolean enrollNowButtonTopNavIsDisplayed() {
        scrollIntoView(enrollNowButtonTopNav);
        return enrollNowButtonTopNav.isDisplayed();
    }

    public void clickEnrollNowButtonTopNav() {
        scrollIntoView(enrollNowButtonTopNav);
        click(enrollNowButtonTopNav, "Enroll Now in top nav");
    }

    public void validateTextOfEnrollNowButtonTopNav(String text) {
        softAssert(enrollNowButtonTopNav, text);
    }

    public void clickOnCloseButtonInPopUp() {
//        hardWait(5);
        click(closeButtonInPopUp, "Close button in pop up");

    }

    // ========== Page First View ==========
    public boolean ifSiteTitleIsDisplayed() {
        scrollIntoView(siteTitle);
        return siteTitle.isDisplayed();
    }

    public void validateTextOfSiteTitle(String text) {
        softAssert(siteTitle, text);
    }

    public boolean ifSiteSubTitleIsDisplayed() {
        scrollIntoView(siteSubTitle);
        return siteSubTitle.isDisplayed();
    }

    public void validateTextOfSiteSubTitle(String text) {
        softAssert(siteSubTitle, text);
    }

    public boolean ifProjectsIsDisplayed() {
        scrollIntoView(projects);
        return projects.isDisplayed();
    }

    public void validateTextOfProjects(String text) {
        softAssert(projects, text);
    }

    public boolean ifHoursOfImmersiveLearningIsDisplayed() {
        scrollIntoView(hoursOfImmersiveLearning);
        return hoursOfImmersiveLearning.isDisplayed();
    }

    public void validateTextOfHoursOfImmersiveLearning(String text) {
        softAssert(hoursOfImmersiveLearning, text);
    }

    public boolean ifPlacementAssistanceIsDisplayed() {
        scrollIntoView(placementAssistance);
        return placementAssistance.isDisplayed();
    }

    public void validateTextOfPlacementAssistance(String text) {
        softAssert(placementAssistance, text);
    }

    public boolean ifPlacementRateIsDisplayed() {
        scrollIntoView(placementRate);
        return placementRate.isDisplayed();
    }

    public void validateTextOfPlacementRate(String text) {
        softAssert(placementRate, text);
    }

    public boolean ifHoursOfLiveWorkshopsIsDisplayed() {
        scrollIntoView(hoursOfLiveWorkshops);
        return hoursOfLiveWorkshops.isDisplayed();
    }

    public void validateTextOfHoursOfLiveWorkshops(String text) {
        softAssert(hoursOfLiveWorkshops, text);
    }

    public boolean ifLiveWorkshopsIsDisplayed() {
        scrollIntoView(liveWorkshops);
        return liveWorkshops.isDisplayed();
    }

    public void validateTextOfLiveWorkshops(String text) {
        softAssert(liveWorkshops, text);
    }

    public boolean ifExpertLedMentorshipsIsDisplayed() {
        scrollIntoView(expertLedMentorships);
        return expertLedMentorships.isDisplayed();
    }

    public void validateTextOfExpertLedMentorships(String text) {
        softAssert(expertLedMentorships, text);
    }

    public boolean ifMentorshipsIsDisplayed() {
        scrollIntoView(mentorships);
        return mentorships.isDisplayed();
    }

    public void validateTextOfMentorships(String text) {
        softAssert(mentorships, text);
    }

    // ========== Page First View pop up ==========

    public boolean ifPopUpTitleIsDisplayed() {
        scrollIntoView(popUpTitle);
        return popUpTitle.isDisplayed();
    }

    public void validateTextOfPopUpTitle(String text) {
        softAssert(popUpTitle, text);
    }

    public boolean ifFullNamePopUpIsDisplayed() {
        scrollIntoView(fullNamePopUp);
        return fullNamePopUp.isDisplayed();
    }

    public void validatePlaceholderTextOfFullName(String text) {
        validatePlaceholderText(fullNamePopUp, text);

    }

    public void enterFullNamePopUp(String fullName) {
        sendKeys(fullNamePopUp, fullName);
    }

    public boolean ifPhoneNumberPopUpIsDisplayed() {
        scrollIntoView(phoneNumberPopUp);
        return phoneNumberPopUp.isDisplayed();
    }

    public void validatePlaceholderTextOfPhoneNumber(String text) {
        validatePlaceholderText(phoneNumberPopUp, text);
    }

    public void enterPhoneNumberPopUp(String phone) {
        sendKeys(phoneNumberPopUp, phone);
    }

    public boolean ifCountryFlagIsDisplayed() {
        scrollIntoView(countryFlag);
        return countryFlag.isDisplayed();
    }

    public void clickCountryFlag() {
        click(countryFlag, "Country Flag");
    }

    public boolean ifEmailPopUpIsDisplayed() {
        scrollIntoView(emailPopUp);
        return emailPopUp.isDisplayed();
    }

    public void validatePlaceholderTextOfEmail(String text) {
        validatePlaceholderText(emailPopUp, text);
    }

    public void enterEmailPopUp(String email) {
        sendKeys(emailPopUp, email);
    }

    public boolean ifTncTextIsDisplayed() {
        scrollIntoView(tncText);
        return tncText.isDisplayed();
    }

    public void validateTextTncText(String text) {
        softAssert(tncText, text);
    }

    public boolean ifSendWhatsAppTextIsDisplayed() {
        scrollIntoView(sendWhatsAppText);
        return sendWhatsAppText.isDisplayed();
    }

    public void validateTextSendWhatsAppText(String text) {
        softAssert(sendWhatsAppText, text);
    }

    public boolean ifDownloadBrochureButtonIsDisplayed() {
        scrollIntoView(downloadBrochureButtonPopUp);
        return downloadBrochureButtonPopUp.isDisplayed();
    }

    public void validateTextDownloadBrochureButton(String text) {
        softAssert(downloadBrochureButtonPopUp, text);
    }

    public void clickDownloadBrochureButton() {
        click(downloadBrochureButtonPopUp, "Download Brochure button in pop up");
    }

    // ========== second Section ==========
    public boolean ifHowDoesTheGenAiPinnaclePlusProgramHelpYouIsDisplayed() {
        scrollIntoView(howDoesTheGenAiPinnaclePlusProgramHelpYou);
        return howDoesTheGenAiPinnaclePlusProgramHelpYou.isDisplayed();
    }

    public void validateTextOfHowDoesTheGenAiPinnaclePlusProgramHelpYou(String text) {
        softAssert(howDoesTheGenAiPinnaclePlusProgramHelpYou, text);
    }

    public boolean ifHoursOfImmersiveLearning2IsDisplayed() {
        scrollIntoView(hoursOfImmersiveLearning2);
        return hoursOfImmersiveLearning2.isDisplayed();
    }

    public void validateTextOfHoursOfImmersiveLearning2(String text) {
        softAssert(hoursOfImmersiveLearning2, text);
    }

    public boolean ifFullSpectrumGenAiAndAgenticAiLearningIsDisplayed() {
        scrollIntoView(fullSpectrumGenAiAndAgenticAiLearning);
        return fullSpectrumGenAiAndAgenticAiLearning.isDisplayed();
    }

    public void validateTextOfFullSpectrumGenAiAndAgenticAiLearning(String text) {
        softAssert(fullSpectrumGenAiAndAgenticAiLearning, text);
    }

    public boolean ifMasterCuttingEdgeGenAiIsDisplayed() {
        scrollIntoView(masterCuttingEdgeGenAi);
        return masterCuttingEdgeGenAi.isDisplayed();
    }

    public void validateTextOfMasterCuttingEdgeGenAi(String text) {
        softAssert(masterCuttingEdgeGenAi, text);
    }

    public boolean ifIndustryAlignedProjectsIsDisplayed() {
        scrollIntoView(industryAlignedProjects);
        return industryAlignedProjects.isDisplayed();
    }

    public void validateTextOfIndustryAlignedProjects(String text) {
        softAssert(industryAlignedProjects, text);
    }

    public boolean ifAcquireRealWorldExperienceIsDisplayed() {
        scrollIntoView(acquireRealWorldExperience);
        return acquireRealWorldExperience.isDisplayed();
    }

    public void validateTextOfAcquireRealWorldExperience(String text) {
        softAssert(acquireRealWorldExperience, text);
    }

    public boolean ifDiverseProjectsIsDisplayed() {
        scrollIntoView(diverseProjects);
        return diverseProjects.isDisplayed();
    }

    public void validateTextOfDiverseProjects(String text) {
        softAssert(diverseProjects, text);
    }

    public boolean ifExpertMentorshipIsDisplayed() {
        scrollIntoView(expertMentorship);
        return expertMentorship.isDisplayed();
    }

    public void validateTextOfExpertMentorship(String text) {
        softAssert(expertMentorship, text);
    }

    public boolean ifExpertInsightsIsDisplayed() {
        scrollIntoView(expertInsights);
        return expertInsights.isDisplayed();
    }

    public void validateTextOfExpertInsights(String text) {
        softAssert(expertInsights, text);
    }

    public boolean ifPersonalizedRoadmapIsDisplayed() {
        scrollIntoView(personalizedRoadmap);
        return personalizedRoadmap.isDisplayed();
    }

    public void validateTextOfPersonalizedRoadmap(String text) {
        softAssert(personalizedRoadmap, text);
    }

    // ========== Curriculum Statistics section ==========

    public boolean ifCurriculumStatisticsIsDisplayed() {
        scrollIntoView(curriculumStatistics);
        return curriculumStatistics.isDisplayed();
    }

    public void validateTextOfCurriculumStatistics(String text) {
        softAssert(curriculumStatistics, text);
    }

    public boolean ifProjects2IsDisplayed() {
        scrollIntoView(projects2);
        return projects2.isDisplayed();
    }

    public void validateTextOfProjects2(String text) {
        softAssert(projects2, text);
    }

    public boolean ifHandsOnLearningIsDisplayed() {
        scrollIntoView(handsOnLearning);
        return handsOnLearning.isDisplayed();
    }

    public void validateTextOfHandsOnLearning(String text) {
        softAssert(handsOnLearning, text);
    }

    public boolean ifHoursOfImmersiveLearning2_2IsDisplayed() {
        scrollIntoView(hoursOfImmersiveLearning2_2);
        return hoursOfImmersiveLearning2_2.isDisplayed();
    }

    public void validateTextOfHoursOfImmersiveLearning2_2(String text) {
        softAssert(hoursOfImmersiveLearning2_2, text);
    }

    public boolean ifInDepthLearningIsDisplayed() {
        scrollIntoView(inDepthLearning);
        return inDepthLearning.isDisplayed();
    }

    public void validateTextOfInDepthLearning(String text) {
        softAssert(inDepthLearning, text);
    }

    public boolean ifLibrariesIsDisplayed() {
        scrollIntoView(libraries);
        return libraries.isDisplayed();
    }

    public void validateTextOfLibraries(String text) {
        softAssert(libraries, text);
    }

    public boolean ifDevelopExpertiseIsDisplayed() {
        scrollIntoView(developExpertise);
        return developExpertise.isDisplayed();
    }

    public void validateTextOfDevelopExpertise(String text) {
        softAssert(developExpertise, text);
    }

    public boolean ifAssignmentsIsDisplayed() {
        scrollIntoView(assignments);
        return assignments.isDisplayed();
    }

    public void validateTextOfAssignments(String text) {
        softAssert(assignments, text);
    }

    public boolean ifTurnKnowledgeIntoActionIsDisplayed() {
        scrollIntoView(turnKnowledgeIntoAction);
        return turnKnowledgeIntoAction.isDisplayed();
    }

    public void validateTextOfTurnKnowledgeIntoAction(String text) {
        softAssert(turnKnowledgeIntoAction, text);
    }

    public boolean ifMentorshipSessionsIsDisplayed() {
        scrollIntoView(mentorshipSessions);
        return mentorshipSessions.isDisplayed();
    }

    public void validateTextOfMentorshipSessions(String text) {
        softAssert(mentorshipSessions, text);
    }

    public boolean ifLiveMentorshipSessionIsDisplayed() {
        scrollIntoView(liveMentorshipSession);
        return liveMentorshipSession.isDisplayed();
    }

    public void validateTextOfLiveMentorshipSession(String text) {
        softAssert(liveMentorshipSession, text);
    }


    // ========== Personalized Roadmap section ==========

    public boolean ifPersonalizedRoadmapSectionIsDisplayed() {
        scrollIntoView(personalizedRoadmapSection);
        return personalizedRoadmapSection.isDisplayed();
    }

    public void validateTextOfPersonalizedRoadmapSection(String text) {
        softAssert(personalizedRoadmapSection, text);
    }

    public boolean ifYourAmbitionIsDisplayed() {
        scrollIntoView(yourAmbition);
        return yourAmbition.isDisplayed();
    }

    public void validateTextOfYourAmbition(String text) {
        softAssert(yourAmbition, text);
    }

    public boolean ifRequestCallbackButtonIsDisplayed() {
        scrollIntoView(requestCallbackButton);
        return requestCallbackButton.isDisplayed();
    }

    public void validateTextOfRequestCallbackButton(String text) {
        softAssert(requestCallbackButton, text);
    }

    public void clickRequestCallbackButton() {
        click(requestCallbackButton, "Request Callback button");
    }

    public boolean ifGetPersonalizedRoadmapButtonIsDisplayed() {
        scrollIntoView(getPersonalizedRoadmapButton);
        return getPersonalizedRoadmapButton.isDisplayed();
    }

    public void validateTextOfGetPersonalizedRoadmapButton(String text) {
        softAssert(getPersonalizedRoadmapButton, text);
    }

    public void clickGetPersonalizedRoadmapButton() {
        click(getPersonalizedRoadmapButton, "Get Personalized Roadmap button");
    }

    // ========== Curriculum section ==========
    public boolean ifCurriculumIsDisplayed() {
        scrollIntoView(curriculum);
        return curriculum.isDisplayed();
    }

    public void validateTextOfCurriculum(String text) {
        softAssert(curriculum, text);
    }

    public boolean ifFromPythonFoundationsIsDisplayed() {
        scrollIntoView(fromPythonFoundations);
        return fromPythonFoundations.isDisplayed();
    }

    public void validateTextOfFromPythonFoundations(String text) {
        softAssert(fromPythonFoundations, text);
    }

    public boolean ifProjects3IsDisplayed() {
        scrollIntoView(projects3);
        return projects3.isDisplayed();
    }

    public void validateTextOfProjects3(String text) {
        softAssert(projects3, text);
    }

    public boolean ifHoursOfImmersiveLearning3IsDisplayed() {
        scrollIntoView(hoursOfImmersiveLearning3);
        return hoursOfImmersiveLearning3.isDisplayed();
    }

    public void validateTextOfHoursOfImmersiveLearning3(String text) {
        softAssert(hoursOfImmersiveLearning3, text);
    }

    public boolean ifToolsIsDisplayed() {
        scrollIntoView(tools);
        return tools.isDisplayed();
    }

    public void validateTextOfTools(String text) {
        softAssert(tools, text);
    }

    public boolean ifAssignments2IsDisplayed() {
        scrollIntoView(assignments2);
        return assignments2.isDisplayed();
    }

    public void validateTextOfAssignments2(String text) {
        softAssert(assignments2, text);
    }

    public boolean ifChooseWhatToLearnImageIsDisplayed() {
        scrollIntoView(chooseWhatToLearnImage);
        return chooseWhatToLearnImage.isDisplayed();
    }

    public void validateTextOfChooseWhatToLearnImage(String text) {
        softAssert(chooseWhatToLearnImage, text);
    }

    public boolean ifDownloadFreeCurriculumButtonIsDisplayed() {
        scrollIntoView(downloadFreeCurriculumButton);
        return downloadFreeCurriculumButton.isDisplayed();
    }

    public void validateTextOfDownloadFreeCurriculumButton(String text) {
        softAssert(downloadFreeCurriculumButton, text);
    }

    public void clickDownloadFreeCurriculumButton() {
        click(downloadFreeCurriculumButton, "Download Free Curriculum button");
    }

    // ========== Libraries & Frameworks section ==========
    public boolean ifLibrariesAndFrameworksIsDisplayed() {
        scrollIntoView(librariesAndFrameworks);
        return librariesAndFrameworks.isDisplayed();
    }

    public void validateTextOfLibrariesAndFrameworks(String text) {
        softAssert(librariesAndFrameworks, text);
    }

    public boolean ifMaster40LibrariesIsDisplayed() {
        scrollIntoView(master40Libraries);
        return master40Libraries.isDisplayed();
    }

    public void validateTextOfMaster40Libraries(String text) {
        softAssert(master40Libraries, text);
    }

    public boolean ifDownloadToolsPackButtonIsDisplayed() {
        scrollIntoView(downloadToolsPackButton);
        return downloadToolsPackButton.isDisplayed();
    }

    public void validateTextOfDownloadToolsPackButton(String text) {
        softAssert(downloadToolsPackButton, text);
    }

    public void clickDownloadToolsPackButton() {
        click(downloadToolsPackButton, "Download Tools Pack button");
    }

    // ========== Build Your Portfolio section ==========
    public boolean ifBuildYourPortfolioIsDisplayed() {
        scrollIntoView(buildYourPortfolio);
        return buildYourPortfolio.isDisplayed();
    }

    public void validateTextOfBuildYourPortfolio(String text) {
        softAssert(buildYourPortfolio, text);
    }

    public boolean ifAccelerateYourIndustryReadinessIsDisplayed() {
        scrollIntoView(accelerateYourIndustryReadiness);
        return accelerateYourIndustryReadiness.isDisplayed();
    }

    public void validateTextOfAccelerateYourIndustryReadiness(String text) {
        softAssert(accelerateYourIndustryReadiness, text);
    }

    public boolean ifRequestCallbackButton2IsDisplayed() {
        scrollIntoView(requestCallbackButton2);
        return requestCallbackButton2.isDisplayed();
    }

    public void validateTextOfRequestCallbackButton2(String text) {
        softAssert(requestCallbackButton2, text);
    }

    public void clickRequestCallbackButton2() {
        click(requestCallbackButton2, "Request Callback button");
    }

    public boolean ifViewAllProjectsButtonIsDisplayed() {
        scrollIntoView(viewAllProjectsButton);
        return viewAllProjectsButton.isDisplayed();
    }

    public void validateTextOfViewAllProjectsButton(String text) {
        softAssert(viewAllProjectsButton, text);
    }

    public void clickViewAllProjectsButton() {
        click(viewAllProjectsButton, "View All Projects button");
    }

    // ========== Real Experience, Real Insights section ==========

    public boolean ifRealExperienceRealInsightsIsDisplayed() {
        scrollIntoView(realExperienceRealInsights);
        return realExperienceRealInsights.isDisplayed();
    }

    public void validateTextOfRealExperienceRealInsights(String text) {
        softAssert(realExperienceRealInsights, text);
    }

    public boolean ifTapIntoDecadesIsDisplayed() {
        scrollIntoView(tapIntoDecades);
        return tapIntoDecades.isDisplayed();
    }

    public void validateTextOfTapIntoDecades(String text) {
        softAssert(tapIntoDecades, text);
    }

    public boolean ifRequestCallbackButton3IsDisplayed() {
        scrollIntoView(requestCallbackButton3);
        return requestCallbackButton3.isDisplayed();
    }

    public void validateTextOfRequestCallbackButton3(String text) {
        softAssert(requestCallbackButton3, text);
    }

    public void clickRequestCallbackButton3() {
        click(requestCallbackButton3, "Request Callback button");
    }

    public boolean ifDownloadInstructorsProfileButtonIsDisplayed() {
        scrollIntoView(downloadInstructorsProfileButton);
        return downloadInstructorsProfileButton.isDisplayed();
    }

    public void validateTextOfDownloadInstructorsProfileButton(String text) {
        softAssert(downloadInstructorsProfileButton, text);
    }

    public void clickDownloadInstructorsProfileButton() {
        click(downloadInstructorsProfileButton, "Download Instructors Profile button");
    }


    // ========== Instructor-Led section ==========

    public boolean ifInstructorLedLiveWorkshopsIsDisplayed() {
        scrollIntoView(instructorLedLiveWorkshops);
        return instructorLedLiveWorkshops.isDisplayed();
    }

    public void validateTextOfInstructorLedLiveWorkshops(String text) {
        softAssert(instructorLedLiveWorkshops, text);
    }

    public boolean ifInstructorLedLiveWorkshopsSubHeadingIsDisplayed() {
        scrollIntoView(instructorLedLiveWorkshopsSubHeading);
        return instructorLedLiveWorkshopsSubHeading.isDisplayed();
    }

    public void validateTextOfInstructorLedLiveWorkshopsSubHeading(String text) {
        softAssert(instructorLedLiveWorkshopsSubHeading, text);
    }

    public boolean ifGetWorkshopsDetailsButtonIsDisplayed() {
        scrollIntoView(getWorkshopsDetailsButton);
        return getWorkshopsDetailsButton.isDisplayed();
    }

    public void validateTextOfGetWorkshopsDetailsButton(String text) {
        softAssert(getWorkshopsDetailsButton, text);
    }

    public void clickGetWorkshopsDetailsButton() {
        click(getWorkshopsDetailsButton, "Get Workshops Detail button");
    }


    // ========== Assisted Placements section ==========

    public boolean ifAvAssistedPlacementsIsDisplayed() {
        scrollIntoView(avAssistedPlacements);
        return avAssistedPlacements.isDisplayed();
    }

    public void validateTextOfAvAssistedPlacements(String text) {
        softAssert(avAssistedPlacements, text);
    }

    public boolean ifOurAlumniUniverseIsDisplayed() {
        scrollIntoView(ourAlumniUniverse);
        return ourAlumniUniverse.isDisplayed();
    }

    public void validateTextOfOurAlumniUniverse(String text) {
        softAssert(ourAlumniUniverse, text);
    }


    // ========== Industry-Recognized Certification section ==========

    public boolean ifIndustryRecognizedCertificationIsDisplayed() {
        scrollIntoView(industryRecognizedCertification);
        return industryRecognizedCertification.isDisplayed();
    }

    public void validateTextOfIndustryRecognizedCertification(String text) {
        softAssert(industryRecognizedCertification, text);
    }

    public boolean ifGetCertifiedIsDisplayed() {
        scrollIntoView(getCertified);
        return getCertified.isDisplayed();
    }

    public void validateTextOfGetCertified(String text) {
        softAssert(getCertified, text);
    }

    public boolean ifEarnCertificatesButtonIsDisplayed() {
        scrollIntoView(earnCertificatesButton);
        return earnCertificatesButton.isDisplayed();
    }

    public void validateTextOfEarnCertificatesButton(String text) {
        softAssert(earnCertificatesButton, text);
    }

    public void clickEarnCertificatesButton() {
        click(earnCertificatesButton, "Earn Certificates button");
    }

    // ========== Our Advisors section ==========
    public boolean ifOurAdvisorsIsDisplayed() {
        scrollIntoView(ourAdvisors);
        return ourAdvisors.isDisplayed();
    }

    public void validateTextOfOurAdvisors(String text) {
        softAssert(ourAdvisors, text);
    }

    public boolean ifOurAdvisorsSubHeadingIsDisplayed() {
        scrollIntoView(ourAdvisorsSubHeading);
        return ourAdvisorsSubHeading.isDisplayed();
    }

    public void validateTextOfOurAdvisorsSubHeading(String text) {
        softAssert(ourAdvisorsSubHeading, text);
    }

    // ========== AV Learners section ==========
    public boolean ifAvLearnersSpotlightIsDisplayed() {
        scrollIntoView(avLearnersSpotlight);
        return avLearnersSpotlight.isDisplayed();
    }

    public void validateTextOfAvLearnersSpotlight(String text) {
        softAssert(avLearnersSpotlight, text);
    }

    public boolean ifViewMoreButtonIsDisplayed() {
        scrollIntoView(viewMoreButton);
        return viewMoreButton.isDisplayed();
    }

    public void validateTextOfViewMoreButton(String text) {
        softAssert(viewMoreButton, text);
    }

    public void clickViewMoreButton() {
        click(viewMoreButton, "View More button");
    }

    // ========== Money Back section ==========
    public boolean ifMoneyBackGuaranteeIsDisplayed() {
        scrollIntoView(moneyBackGuarantee);
        return moneyBackGuarantee.isDisplayed();
    }

    public void validateTextOfMoneyBackGuarantee(String text) {
        softAssert(moneyBackGuarantee, text);
    }

    public boolean ifNoQuestionAskedIsDisplayed() {
        scrollIntoView(noQuestionAsked);
        return noQuestionAsked.isDisplayed();
    }

    public void validateTextOfNoQuestionAsked(String text) {
        softAssert(noQuestionAsked, text);
    }

    public boolean ifMoneyBackGuaranteeImageIsDisplayed() {
        scrollIntoView(moneyBackGuaranteeImage);
        return moneyBackGuaranteeImage.isDisplayed();
    }

    public void validateTextOfMoneyBackGuaranteeImage(String text) {
        softAssert(moneyBackGuaranteeImage, text);
    }

    // ========== Invest in Your Future section ==========

    public boolean ifInvestInYourFutureTodayIsDisplayed() {
        scrollIntoView(investInYourFutureToday);
        return investInYourFutureToday.isDisplayed();
    }

    public void validateTextOfInvestInYourFutureToday(String text) {
        softAssert(investInYourFutureToday, text);
    }

    public boolean ifExclusiveAccessToAiToolsIsDisplayed() {
        scrollIntoView(exclusiveAccessToAiTools);
        return exclusiveAccessToAiTools.isDisplayed();
    }

    public void validateTextOfExclusiveAccessToAiTools(String text) {
        softAssert(exclusiveAccessToAiTools, text);
    }

    public boolean ifBoostYourCareerIsDisplayed() {
        scrollIntoView(boostYourCareer);
        return boostYourCareer.isDisplayed();
    }

    public void validateTextOfBoostYourCareer(String text) {
        softAssert(boostYourCareer, text);
    }

    public boolean ifEnrollNowTextIsDisplayed() {
        scrollIntoView(enrollNowAndStartYourJourney);
        return enrollNowAndStartYourJourney.isDisplayed();
    }

    public void validateTextOfEnrollNowText(String text) {
        softAssert(enrollNowAndStartYourJourney, text);
    }

    public boolean ifOneTimeToggleLabelIsDisplayed() {
        scrollIntoView(oneTimeToggleLabel);
        return oneTimeToggleLabel.isDisplayed();
    }

    public void validateTextOfOneTimeToggleLabel(String text) {
        softAssert(oneTimeToggleLabel, text);
    }

    public boolean ifEmiToggleLabelIsDisplayed() {
        scrollIntoView(emiToggleLabel);
        return emiToggleLabel.isDisplayed();
    }

    public void validateTextOfEmiToggleLabel(String text) {
        softAssert(emiToggleLabel, text);
    }

    public boolean ifPriceToggleIsDisplayed() {
        scrollIntoView(priceToggle);
        return priceToggle.isDisplayed();
    }

    public void clickPriceToggle() {
        scrollIntoView(priceToggle);
        click(priceToggle, "Price Toggle");
    }

    public boolean ifOneTimeTextIsDisplayed() {
        scrollIntoView(oneTime);
        return oneTime.isDisplayed();
    }

    public void validateTextOfOneTimeText(String text) {
        softAssert(oneTime, text);
    }

    public boolean ifemiTextIsDisplayed() {
        scrollIntoView(emi);
        return emi.isDisplayed();
    }

    public void validateTextOfEmiText(String text) {
        softAssert(emi, text);
    }


    public boolean priceIsDisplayed() {
        scrollIntoView(price);
        return price.isDisplayed();
    }

    public void validateTextOfPrice(String text) {
        softAssert(price, text);
    }

    public boolean emiPriceIsDisplayed() {
        scrollIntoView(emiPrice);
        return emiPrice.isDisplayed();
    }

    public void validateTextOfEmiPrice(String text) {
        softAssert(emiPrice, text);
    }

    public boolean oneTimePriceInclusiveOfAllTaxesIsDisplayed() {
        scrollIntoView(oneTimePriceInclusiveOfAllTaxes);
        return oneTimePriceInclusiveOfAllTaxes.isDisplayed();
    }

    public void validateTextOfOneTimePriceInclusiveOfAllTaxes(String text) {
        softAssert(oneTimePriceInclusiveOfAllTaxes, text);
    }

    public boolean levelUpYourProfessionalJourneyIsDisplayed() {
        scrollIntoView(levelUpYourProfessionalJourney);
        return levelUpYourProfessionalJourney.isDisplayed();
    }

    public void validateTextOfLevelUpYourProfessionalJourney(String text) {
        softAssert(levelUpYourProfessionalJourney, text);
    }

    public boolean enrollNowButtonOneTimeIsDisplayed() {
        scrollIntoView(enrollNowButtonOneTime);
        return enrollNowButtonOneTime.isDisplayed();
    }

    public void validateTextOfEnrollNowButtonOneTime(String text) {
        softAssert(enrollNowButtonOneTime, text);
    }

    public void clickEnrollNowButtonOneTime() {
        click(enrollNowButtonOneTime, "Enroll Now button One Time");
    }

    // ========== Contact Us Today section ==========
    public boolean ifContactUsTodayIsDisplayed() {
        scrollIntoView(contactUsToday);
        return contactUsToday.isDisplayed();
    }

    public void validateTextOfContactUsToday(String text) {
        softAssert(contactUsToday, text);
    }

    public boolean takeTheFirstStepIsDisplayed() {
        scrollIntoView(takeTheFirstStep);
        return takeTheFirstStep.isDisplayed();
    }

    public void validateTextOfTakeTheFirstStep(String text) {
        softAssert(takeTheFirstStep, text);
    }

    public boolean upskillReskillIsDisplayed() {
        scrollIntoView(upskillReskill);
        return upskillReskill.isDisplayed();
    }

    public void validateTextOfUpskillReskill(String text) {
        softAssert(upskillReskill, text);
    }

    public boolean contactFullNameLabelIsDisplayed() {
        scrollIntoView(contactFullNameLabel);
        return contactFullNameLabel.isDisplayed();
    }

    public void validateTextOfContactFullNameLabel(String text) {
        softAssert(contactFullNameLabel, text);
    }

    public boolean contactFullNameIsDisplayed() {
        scrollIntoView(contactFullName);
        return contactFullName.isDisplayed();
    }

    public void validatePlaceholderTextOfContactFullName(String text) {
        validatePlaceholderText(contactFullName, text);
    }

    public void enterTextInContactFullName(String fullName) {
        sendKeys(contactFullName, fullName);
    }

    public boolean contactPhoneNumberLabelIsDisplayed() {
        scrollIntoView(contactPhoneNumberLabel);
        return contactPhoneNumberLabel.isDisplayed();
    }

    public void validateTextOfContactPhoneNumberLabel(String text) {
        softAssert(contactPhoneNumberLabel, text);
    }

    public void validatePlaceholderTextOfContactPhoneNumber(String text) {
        validatePlaceholderText(contactPhoneNumber, text);
    }

    public boolean contactPhoneNumberIsDisplayed() {
        scrollIntoView(contactPhoneNumber);
        return contactPhoneNumber.isDisplayed();
    }

    public void enterTextInContactPhoneNumber(String phone) {
        sendKeys(contactPhoneNumber, phone);
    }

    public boolean contactEmailLabelIsDisplayed() {
        scrollIntoView(contactEmailLabel);
        return contactEmailLabel.isDisplayed();
    }

    public void validateTextOfContactEmailLabel(String text) {
        softAssert(contactEmailLabel, text);
    }

    public void validatePlaceholderTextOfContactEmail(String text) {
        validatePlaceholderText(contactEmail, text);
    }

    public boolean contactEmailIsDisplayed() {
        scrollIntoView(contactEmail);
        return contactEmail.isDisplayed();
    }

    public void enterTextInContactEmail(String email) {
        sendKeys(contactEmail, email);
    }

    public boolean countryFlagContactUsIsDisplayed() {
        scrollIntoView(countryFlagContactUs);
        return countryFlagContactUs.isDisplayed();
    }

    public void clickCountryFlagContactUs() {
        click(countryFlagContactUs, "Country Flag in Contact Us");
    }

    public boolean countryFlagArrowContactUsIsDisplayed() {
        scrollIntoView(countryFlagArrowContactUs);
        return countryFlagArrowContactUs.isDisplayed();
    }

    public void clickCountryFlagArrowContactUs() {
        click(countryFlagArrowContactUs, "Country Flag Arrow in Contact Us");
    }

    public boolean experienceLabelIsDisplayed() {
        scrollIntoView(experienceLabel);
        return experienceLabel.isDisplayed();
    }

    public void validateTextOfExperienceLabel(String text) {
        softAssert(experienceLabel, text);
    }

    public boolean experience0_3IsDisplayed() {
        scrollIntoView(experience0_3);
        return experience0_3.isDisplayed();
    }

    public void validateTextOfExperience0_3(String text) {
        softAssert(experience0_3, text);
    }

    public boolean experience3_8IsDisplayed() {
        scrollIntoView(experience3_8);
        return experience3_8.isDisplayed();
    }

    public void validateTextOfExperience3_8(String text) {
        softAssert(experience3_8, text);
    }

    public boolean experience8_12IsDisplayed() {
        scrollIntoView(experience8_12);
        return experience8_12.isDisplayed();
    }

    public void validateTextOfExperience8_12(String text) {
        softAssert(experience8_12, text);
    }

    public boolean experience12IsDisplayed() {
        scrollIntoView(experience12);
        return experience12.isDisplayed();
    }

    public void validateTextOfExperience12(String text) {
        softAssert(experience12, text);
    }

    public boolean termsAndConditionsLabelIsDisplayed() {
        scrollIntoView(termsAndConditionsLabel);
        return termsAndConditionsLabel.isDisplayed();
    }

    public void validateTextOfTermsAndConditionsLabel(String text) {
        softAssert(termsAndConditionsLabel, text);
    }

    public boolean sendWhatsAppLabelIsDisplayed() {
        scrollIntoView(sendWhatsAppLabel);
        return sendWhatsAppLabel.isDisplayed();
    }

    public void validateTextOfSendWhatsAppLabel(String text) {
        softAssert(sendWhatsAppLabel, text);
    }

    public boolean sendWhatsAppCheckboxIsDisplayed() {
        scrollIntoView(sendWhatsAppCheckbox);
        return sendWhatsAppCheckbox.isDisplayed();

    }

    public void clickSendWhatsAppCheckbox() {
        click(sendWhatsAppCheckbox, "Send WhatsApp Checkbox");
    }

    public boolean joinTheProgramButtonIsDisplayed() {
        scrollIntoView(joinTheProgramButton);
        return joinTheProgramButton.isDisplayed();
    }

    public void validateTextOfJoinTheProgramButton(String text) {
        softAssert(joinTheProgramButton, text);
    }

    public void clickJoinTheProgramButton() {
        click(joinTheProgramButton, "Join The Program button");
    }

    public boolean getExpertGuidanceIsDisplayed() {
        scrollIntoView(getExpertGuidance);
        return getExpertGuidance.isDisplayed();
    }

    public void validateTextOfGetExpertGuidance(String text) {
        softAssert(getExpertGuidance, text);
    }

    public boolean needSupportIsDisplayed() {
        scrollIntoView(needSupport);
        return needSupport.isDisplayed();
    }

    public void validateTextOfNeedSupport(String text) {
        softAssert(needSupport, text);
    }

    public boolean imagePhoneIsDisplayed() {
        scrollIntoView(imagePhone);
        return imagePhone.isDisplayed();
    }

    public boolean supportPhoneNumberIsDisplayed() {
        scrollIntoView(supportPhoneNumber);
        return supportPhoneNumber.isDisplayed();
    }

    public void validateTextOfSupportPhoneNumber(String text) {
        softAssert(supportPhoneNumber, text);
    }

    public boolean supportPhoneNumberSubHeadingIsDisplayed() {
        scrollIntoView(supportPhoneNumberSubHeading);
        return supportPhoneNumberSubHeading.isDisplayed();
    }

    public void validateTextOfSupportPhoneNumberSubHeading(String text) {
        softAssert(supportPhoneNumberSubHeading, text);
    }

    public boolean imageEmailIsDisplayed() {
        scrollIntoView(imageEmail);
        return imageEmail.isDisplayed();
    }

    public boolean supportEmailIsDisplayed() {
        scrollIntoView(supportEmail);
        return supportEmail.isDisplayed();
    }

    public void validateTextOfSupportEmail(String text) {
        softAssert(supportEmail, text);
    }

    public boolean supportEmailSubHeadingIsDisplayed() {
        scrollIntoView(supportEmailSubHeading);
        return supportEmailSubHeading.isDisplayed();
    }

    public void validateTextOfSupportEmailSubHeading(String text) {
        softAssert(supportEmailSubHeading, text);
    }

    // ========== Frequently Asked Questions section ==========
    public boolean ifFrequentlyAskedQuestionsIsDisplayed() {
        scrollIntoView(frequentlyAskedQuestions);
        return frequentlyAskedQuestions.isDisplayed();
    }

    public void validateTextOfFrequentlyAskedQuestions(String text) {
        softAssert(frequentlyAskedQuestions, text);
    }

    public boolean lookingForAnswersIsDisplayed() {
        scrollIntoView(lookingForAnswers);
        return lookingForAnswers.isDisplayed();
    }

    public void validateTextOfLookingForAnswers(String text) {
        softAssert(lookingForAnswers, text);
    }

    public boolean whatMakesTheGenAiPinnaclePlusProgramDifferentIsDisplayed() {
        scrollIntoView(whatMakesTheGenAiPinnaclePlusProgramDifferent);
        return whatMakesTheGenAiPinnaclePlusProgramDifferent.isDisplayed();
    }

    public void validateTextOfWhatMakesTheGenAiPinnaclePlusProgramDifferent(String text) {
        softAssert(whatMakesTheGenAiPinnaclePlusProgramDifferent, text);
    }

    public boolean howIsTheGenAiPinnaclePlusProgramDifferentIsDisplayed() {
        scrollIntoView(howIsTheGenAiPinnaclePlusProgramDifferent);
        return howIsTheGenAiPinnaclePlusProgramDifferent.isDisplayed();
    }

    public void validateTextOfhowIsTheGenAiPinnaclePlusProgramDifferent(String text) {
        softAssert(howIsTheGenAiPinnaclePlusProgramDifferent, text);
    }

    public boolean whoIsTheIdealCandidateIsDisplayed() {
        scrollIntoView(whoIsTheIdealCandidate);
        return whoIsTheIdealCandidate.isDisplayed();
    }

    public void validateTextOfWhoIsTheIdealCandidate(String text) {
        softAssert(whoIsTheIdealCandidate, text);
    }

    public boolean viewMoreButton2IsDisplayed() {
        scrollIntoView(viewMoreButton);
        return viewMoreButton.isDisplayed();
    }

    public void validateTextOfViewMoreButton2(String text) {
        softAssert(viewMoreButton, text);
    }

    public void clickViewMoreButton2() {
        click(viewMoreButton, "View More button");
    }

    // ========== Flagship Programs section ==========

    public boolean ifFlagshipProgramsIsDisplayed() {
        scrollIntoView(flagshipPrograms);
        return flagshipPrograms.isDisplayed();
    }

    public void validateTextOfFlagshipPrograms(String text) {
        softAssert(flagshipPrograms, text);
    }

    public boolean ifGenAiPinnacleProgramIsDisplayed() {
        scrollIntoView(genAiPinnacleProgram);
        return genAiPinnacleProgram.isDisplayed();
    }

    public void validateTextOfGenAiPinnacleProgram(String text) {
        softAssert(genAiPinnacleProgram, text);
    }

    public void clickGenAiPinnacleProgram() {
        click(genAiPinnacleProgram, "Gen Ai Pinnacle Program");
    }
}
