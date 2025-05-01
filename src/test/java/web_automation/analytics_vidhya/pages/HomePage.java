package web_automation.analytics_vidhya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import web_automation.analytics_vidhya.base.TestBase;

public class HomePage extends TestBase {
    WebDriver driver;

    //17 Screen are there in the home page
    // ========== Constructor ==========
    public HomePage(WebDriver driver) {
        this.driver = driver;
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
    @FindBy(xpath = "//p[normalize-space()='Hours of Live Workshops']")
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

    // ========== AI ChatBot ==========

    @FindBy(xpath = "//a[normalize-space()='GenAI Savings Offer']")
    WebElement genAiSavingsOffer;

    @FindBy(xpath = "//div[@class='d-flex align-items-center justify-content-center rounded-circle bg-my-gradient cursor-pointer floating-icons']")
    WebElement aiSupportIcon;

    // ========== second Section ==========
    @FindBy(xpath = "//h2[normalize-space()='How does the GenAI Pinnacle Plus Program Help You?']")
    WebElement howDoesTheGenAiPinnaclePlusProgramHelpYou;

    @FindBy(xpath = "//div[@class='col-xl-4 col-lg-4 col-md-12 col-sm-12 mb-4 mb-lg-0 px-3']//h3[@class='fs-24 fw-semibold mb-4'][normalize-space()='300+ Hours of Immersive Learning']")
    WebElement hoursOfImmersiveLearning2;
    @FindBy(xpath = "//ul[@class='mb-4 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Full-spectrum GenAI and Agentic AI learning with 1')]")
    WebElement fullSpectrumGenAiAndAgenticAiLearning;
    @FindBy(xpath = "//ul[@class='mb-4 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Full-spectrum GenAI and Agentic AI learning with 1')]")
    WebElement fullSpectrumGenAiAndAgenticAiLearning2;
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


    // ========== Third section ==========

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


    // ========== Fifth section ==========
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
    By curriculamSection = By.xpath("//div[@class='accordion-item border-0']");

    @FindBy(xpath = "//img[@alt='Choose What to Learn Image']")
    WebElement chooseWhatToLearnImage;
    @FindBy(xpath = "//button[normalize-space()='Download Free Curriculum']")
    WebElement downloadFreeCurriculumButton;

    // ========== Sixth section ==========
    @FindBy(xpath = "//h2[normalize-space()='Libraries & Frameworks']")
    WebElement librariesAndFrameworks;

    @FindBy(xpath = "//p[contains(text(),'Master 40+ GenAI and Agentic AI tools, libraries a')]")
    WebElement master40Libraries;
    By librariesAndFrameworksSection = By.xpath("//div[@class=\"d-inline-block w-auto mb-3\"]");
    @FindBy(xpath = "//button[normalize-space()='Download Tools Pack']")
    WebElement downloadToolsPackButton;

// ========== Fourteenth section ==========

    @FindBy(xpath = "//h2[normalize-space()='Money Back Guarantee!']")
    WebElement moneyBackGuarantee;
    @FindBy(xpath = "//p[contains(text(),'GenAI Pinnacle Plus Program comes with 7 days no q')]")
    WebElement noQuestionAsked;
    @FindBy(xpath = "//div[@class='col-xl-4 col-lg-4 col-md-4 col-7 order-1 order-md-2 mx-auto']//img[@class='img-fluid']")
    WebElement moneyBackGuaranteeImage;

// ========== Fifteenth section ==========

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
    @FindBy(xpath = "//h4[normalize-space()='One Time']/../h5[@class='fs-40 fw-bold mb-2']")
    WebElement oneTimePrice;
    @FindBy(xpath = "//div[@id='toggleCard1']//h6[@class='text-dark-secondary mt-3 mb-5'][normalize-space()='(Inclusive of all taxes)']")
    WebElement oneTimePriceInclusiveOfAllTaxes;
    @FindBy(xpath = "//div[@id='toggleCard1']//p[@class='text-dark-secondary'][normalize-space()='Level Up Your Professional Journey']")
    WebElement levelUpYourProfessionalJourney;
    @FindBy(xpath = "//div[@id='toggleCard1']//button[@class='btn btn-dark btn-dark-primary btn-dark-primary-gradient rounded-3 w-100 mt-3 fw-semibold'][normalize-space()='Enroll Now']")
    WebElement enrollNowButtonOneTime;

// ========== Sixteenth section ==========

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

// ========== Seventeenth section ==========

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

// ========== Eighteenth section ==========

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
    public void analyticsVidhyaIconTopNavIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> analyticsVidhyaIconTopNav.isDisplayed());
    }

    public void whatToExpectTopNavIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> whatToExpectTopNav.isDisplayed());
    }

    public void curriculumTopNavIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> curriculumTopNav.isDisplayed());
    }

    public void feesTopNavIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> feesTopNav.isDisplayed());
    }

    public void testimonialsTopNavIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> testimonialsTopNav.isDisplayed());
    }

    public void enrollNowButtonTopNavIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> enrollNowButtonTopNav.isDisplayed());
    }

    public String getWhatToExpectText() {
        return whatToExpectTopNav.getText();
    }

    public String getCurriculumText() {
        return curriculumTopNav.getText();
    }

    public String getFeesText() {
        return feesTopNav.getText();
    }

    public String getTestimonialsText() {
        return testimonialsTopNav.getText();
    }

    public String getEnrollNowButtonText() {
        return enrollNowButtonTopNav.getText();
    }

    public void clickWhatToExpect() {
        whatToExpectTopNav.click();
    }
    public void clickCurriculum() {
        curriculumTopNav.click();
    }
    public void clickFees() {
        feesTopNav.click();
    }
    public void clickTestimonials() {
        testimonialsTopNav.click();
    }
    public void clickEnrollNowButtonTopNav() {
        enrollNowButtonTopNav.click();
    }

    // ========== Page First View ==========

    public void siteTitleIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> siteTitle.isDisplayed());
    }
    public void siteSubTitleIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> siteSubTitle.isDisplayed());
    }
    public String getSiteTitleText() {
        return siteTitle.getText();
    }
    public String getSiteSubTitleText() {
        return siteSubTitle.getText();
    }
    public void projectsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> projects.isDisplayed());
    }
    public String getProjectsText() {
        return projects.getText();
    }
    public void hoursOfImmersiveLearningIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> hoursOfImmersiveLearning.isDisplayed());
    }
    public String getHoursOfImmersiveLearningText() {
        return hoursOfImmersiveLearning.getText();
    }
    public void placementAssistanceIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> placementAssistance.isDisplayed());
    }
    public String getPlacementAssistanceText() {
        return placementAssistance.getText();
    }
    public void placementRateIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> placementRate.isDisplayed());
    }
    public String getPlacementRateText() {
        return placementRate.getText();
    }
    public void hoursOfLiveWorkshopsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> hoursOfLiveWorkshops.isDisplayed());
    }
    public String getHoursOfLiveWorkshopsText() {
        return hoursOfLiveWorkshops.getText();
    }
    public void liveWorkshopsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> liveWorkshops.isDisplayed());
    }
    public String getLiveWorkshopsText() {
        return liveWorkshops.getText();
    }
    public void expertLedMentorshipsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> expertLedMentorships.isDisplayed());
    }
    public String getExpertLedMentorshipsText() {
        return expertLedMentorships.getText();
    }
    public void mentorshipsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> mentorships.isDisplayed());
    }
    public String getMentorshipsText() {
        return mentorships.getText();
    }
    // ========== Page First View pop up ==========

    public void popUpTitleIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> popUpTitle.isDisplayed());
    }
    public String getPopUpTitleText() {
        return popUpTitle.getText();
    }
    public void fullNamePopUpIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> fullNamePopUp.isDisplayed());
    }
    public String getFullNamePopUpText() {
        return fullNamePopUp.getAttribute("placeholder");
    }
    public void enterFullNamePopUp(String fullName) {
        fullNamePopUp.sendKeys(fullName);
    }
    public void phoneNumberPopUpIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> phoneNumberPopUp.isDisplayed());
    }
    public String getPhoneNumberPopUpText() {
        return phoneNumberPopUp.getAttribute("placeholder");
    }
    public void enterPhoneNumberPopUp(String phone) {
        phoneNumberPopUp.sendKeys(phone);
    }
    public void countryFlagIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> countryFlag.isDisplayed());
    }
    public String getCountryFlagText() {
        return countryFlag.getAttribute("title");
    }
    public void countryFlagArrowIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> countryFlagArrowContactUs.isDisplayed());
    }
    public String getCountryFlagArrowText() {
        return countryFlagArrowContactUs.getAttribute("title");
    }
    public void emailPopUpIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> emailPopUp.isDisplayed());
    }
    public String getEmailPopUpText() {
        return emailPopUp.getAttribute("placeholder");
    }
    public void enterEmailPopUp(String email) {
        emailPopUp.sendKeys(email);
    }
    public void tncTextIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> tncText.isDisplayed());
    }
    public String getTncText() {
        return tncText.getText();
    }
    public void tncTextClick() {
        tncText.click();
    }
    public void sendWhatsAppTextIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> sendWhatsAppText.isDisplayed());
    }
    public String getSendWhatsAppText() {
        return sendWhatsAppText.getText();
    }
    public void sendWhatsAppTextClick() {
        sendWhatsAppText.click();
    }
    public void downloadBrochureButtonIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> downloadBrochureButtonPopUp.isDisplayed());
    }
    public String getDownloadBrochureButtonText() {
        return downloadBrochureButtonPopUp.getText();
    }
    public void downloadBrochureButtonClick() {
        downloadBrochureButtonPopUp.click();
    }

    // ========== AI ChatBot ==========

    public void genAiSavingsOfferIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> genAiSavingsOffer.isDisplayed());
    }
    public String getGenAiSavingsOfferText() {
        return genAiSavingsOffer.getText();
    }
    public void genAiSavingsOfferClick() {
        genAiSavingsOffer.click();
    }
    public void aiSupportIconIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> aiSupportIcon.isDisplayed());
    }
    public String getAiSupportIconText() {
        return aiSupportIcon.getAttribute("alt");
    }
    public void aiSupportIconClick() {
        aiSupportIcon.click();
    }

    // ========== second Section ==========
    public void howDoesTheGenAiPinnaclePlusProgramHelpYouIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> howDoesTheGenAiPinnaclePlusProgramHelpYou.isDisplayed());
    }
    public String getHowDoesTheGenAiPinnaclePlusProgramHelpYouText() {
        return howDoesTheGenAiPinnaclePlusProgramHelpYou.getText();
    }
    public void hoursOfImmersiveLearning2IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> hoursOfImmersiveLearning2.isDisplayed());
    }
    public String getHoursOfImmersiveLearning2Text() {
        return hoursOfImmersiveLearning2.getText();
    }
    public void fullSpectrumGenAiAndAgenticAiLearningIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> fullSpectrumGenAiAndAgenticAiLearning.isDisplayed());
    }
    public String getFullSpectrumGenAiAndAgenticAiLearningText() {
        return fullSpectrumGenAiAndAgenticAiLearning.getText();
    }
    public void fullSpectrumGenAiAndAgenticAiLearning2IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> fullSpectrumGenAiAndAgenticAiLearning2.isDisplayed());
    }
    public String getFullSpectrumGenAiAndAgenticAiLearning2Text() {
        return fullSpectrumGenAiAndAgenticAiLearning2.getText();
    }
    public void industryAlignedProjectsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> industryAlignedProjects.isDisplayed());
    }
    public String getIndustryAlignedProjectsText() {
        return industryAlignedProjects.getText();
    }
    public void acquireRealWorldExperienceIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> acquireRealWorldExperience.isDisplayed());
    }
    public String getAcquireRealWorldExperienceText() {
        return acquireRealWorldExperience.getText();
    }
    public void diverseProjectsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> diverseProjects.isDisplayed());
    }
    public String getDiverseProjectsText() {
        return diverseProjects.getText();
    }
    public void expertMentorshipIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> expertMentorship.isDisplayed());
    }
    public String getExpertMentorshipText() {
        return expertMentorship.getText();
    }
    public void expertInsightsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> expertInsights.isDisplayed());
    }
    public String getExpertInsightsText() {
        return expertInsights.getText();
    }
    public void personalizedRoadmapIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> personalizedRoadmap.isDisplayed());
    }
    public String getPersonalizedRoadmapText() {
        return personalizedRoadmap.getText();
    }
    // ========== Third section ==========

    public void curriculumStatisticsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> curriculumStatistics.isDisplayed());
    }
    public String getCurriculumStatisticsText() {
        return curriculumStatistics.getText();
    }
    public void projects2IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> projects2.isDisplayed());
    }
    public String getProjects2Text() {
        return projects2.getText();
    }
    public void handsOnLearningIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> handsOnLearning.isDisplayed());
    }
    public String getHandsOnLearningText() {
        return handsOnLearning.getText();
    }
    public void hoursOfImmersiveLearning2_2IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> hoursOfImmersiveLearning2_2.isDisplayed());
    }
    public String getHoursOfImmersiveLearning2_2Text() {
        return hoursOfImmersiveLearning2_2.getText();
    }
    public void inDepthLearningIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> inDepthLearning.isDisplayed());
    }
    public String getInDepthLearningText() {
        return inDepthLearning.getText();
    }
    public void librariesIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> libraries.isDisplayed());
    }
    public String getLibrariesText() {
        return libraries.getText();
    }
    public void developExpertiseIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> developExpertise.isDisplayed());
    }
    public String getDevelopExpertiseText() {
        return developExpertise.getText();
    }
    public void assignmentsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> assignments.isDisplayed());
    }
    public String getAssignmentsText() {
        return assignments.getText();
    }
    public void turnKnowledgeIntoActionIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> turnKnowledgeIntoAction.isDisplayed());
    }
    public String getTurnKnowledgeIntoActionText() {
        return turnKnowledgeIntoAction.getText();
    }
    public void mentorshipSessionsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> mentorshipSessions.isDisplayed());
    }
    public String getMentorshipSessionsText() {
        return mentorshipSessions.getText();
    }
    public void liveMentorshipSessionIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> liveMentorshipSession.isDisplayed());
    }
    public String getLiveMentorshipSessionText() {
        return liveMentorshipSession.getText();
    }
    // ========== Fifth section ==========

    public void curriculumIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> curriculum.isDisplayed());
    }
    public String getCurriculumTextFifthSection() {
        return curriculum.getText();
    }
    public void fromPythonFoundationsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> fromPythonFoundations.isDisplayed());
    }
    public String getFromPythonFoundationsText() {
        return fromPythonFoundations.getText();
    }

    public void projects3IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> projects3.isDisplayed());
    }
    public String getProjects3Text() {
        return projects3.getText();
    }
    public void hoursOfImmersiveLearning3IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> hoursOfImmersiveLearning3.isDisplayed());
    }
    public String getHoursOfImmersiveLearning3Text() {
        return hoursOfImmersiveLearning3.getText();
    }
    public void toolsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> tools.isDisplayed());
    }
    public String getToolsText() {
        return tools.getText();
    }
    public void assignments2IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> assignments2.isDisplayed());
    }
    public String getAssignments2Text() {
        return assignments2.getText();
    }
    public void chooseWhatToLearnImageIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> chooseWhatToLearnImage.isDisplayed());
    }
    public String getChooseWhatToLearnImageText() {
        return chooseWhatToLearnImage.getAttribute("alt");
    }
    public void downloadFreeCurriculumButtonIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> downloadFreeCurriculumButton.isDisplayed());
    }
    public String getDownloadFreeCurriculumButtonText() {
        return downloadFreeCurriculumButton.getText();
    }
    public void downloadFreeCurriculumButtonClick() {
        downloadFreeCurriculumButton.click();
    }

    // ========== Sixth section ==========

    public void librariesAndFrameworksIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> librariesAndFrameworks.isDisplayed());
    }
    public String getLibrariesAndFrameworksText() {
        return librariesAndFrameworks.getText();
    }
    public void master40LibrariesIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> master40Libraries.isDisplayed());
    }
    public String getMaster40LibrariesText() {
        return master40Libraries.getText();
    }
    public void librariesAndFrameworksSectionIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> getDriver().findElement(librariesAndFrameworksSection).isDisplayed());
    }
    public String getLibrariesAndFrameworksSectionText() {
        return getDriver().findElement(librariesAndFrameworksSection).getText();
    }
    public void downloadToolsPackButtonIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> downloadToolsPackButton.isDisplayed());
    }
    public String getDownloadToolsPackButtonText() {
        return downloadToolsPackButton.getText();
    }
    public void downloadToolsPackButtonClick() {
        downloadToolsPackButton.click();
    }
    // ========== Fourteenth section ==========

    public void moneyBackGuaranteeIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> moneyBackGuarantee.isDisplayed());
    }

    public String getMoneyBackGuaranteeText() {
        return moneyBackGuarantee.getText();
    }
    public void noQuestionAskedIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> noQuestionAsked.isDisplayed());
    }
    public String getNoQuestionAskedText() {
        return noQuestionAsked.getText();
    }
    public void moneyBackGuaranteeImageIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> moneyBackGuaranteeImage.isDisplayed());
    }
    public String getMoneyBackGuaranteeImageText() {
        return moneyBackGuaranteeImage.getAttribute("alt");
    }
    public void moneyBackGuaranteeImageClick() {
        moneyBackGuaranteeImage.click();
    }
    // ========== Fifteenth section ==========
    public void investInYourFutureTodayIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> investInYourFutureToday.isDisplayed());
    }
    public String getInvestInYourFutureTodayText() {
        return investInYourFutureToday.getText();
    }
    public void exclusiveAccessToAiToolsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> exclusiveAccessToAiTools.isDisplayed());
    }
    public String getExclusiveAccessToAiToolsText() {
        return exclusiveAccessToAiTools.getText();
    }
    public void boostYourCareerIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> boostYourCareer.isDisplayed());
    }
    public String getBoostYourCareerText() {
        return boostYourCareer.getText();
    }
    public void enrollNowAndStartYourJourneyIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> enrollNowAndStartYourJourney.isDisplayed());
    }
    public String getEnrollNowAndStartYourJourneyText() {
        return enrollNowAndStartYourJourney.getText();
    }
    public void oneTimeToggleLabelIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> oneTimeToggleLabel.isDisplayed());
    }
    public String getOneTimeToggleLabelText() {
        return oneTimeToggleLabel.getText();
    }
    public void emiToggleLabelIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> emiToggleLabel.isDisplayed());
    }
    public String getEmiToggleLabelText() {
        return emiToggleLabel.getText();
    }
    public void priceToggleIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> priceToggle.isDisplayed());
    }
    public String getPriceToggleText() {
        return priceToggle.getAttribute("aria-checked");
    }
    public void oneTimeIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> oneTime.isDisplayed());
    }
    public String getOneTimeText() {
        return oneTime.getText();
    }
    public void oneTimePriceIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> oneTimePrice.isDisplayed());
    }
    public String getOneTimePriceText() {
        return oneTimePrice.getText();
    }
    public void oneTimePriceInclusiveOfAllTaxesIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> oneTimePriceInclusiveOfAllTaxes.isDisplayed());
    }
    public String getOneTimePriceInclusiveOfAllTaxesText() {
        return oneTimePriceInclusiveOfAllTaxes.getText();
    }
    public void levelUpYourProfessionalJourneyIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> levelUpYourProfessionalJourney.isDisplayed());
    }
    public String getLevelUpYourProfessionalJourneyText() {
        return levelUpYourProfessionalJourney.getText();
    }
    public void enrollNowButtonOneTimeIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> enrollNowButtonOneTime.isDisplayed());
    }
    public String getEnrollNowButtonOneTimeText() {
        return enrollNowButtonOneTime.getText();
    }
    public void enrollNowButtonOneTimeClick() {
        enrollNowButtonOneTime.click();
    }
    // ========== Sixteenth section ==========
    public void contactUsTodayIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> contactUsToday.isDisplayed());
    }
    public String getContactUsTodayText() {
        return contactUsToday.getText();
    }
    public void takeTheFirstStepIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> takeTheFirstStep.isDisplayed());
    }
    public String getTakeTheFirstStepText() {
        return takeTheFirstStep.getText();
    }
    public void upskillReskillIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> upskillReskill.isDisplayed());
    }
    public String getUpskillReskillText() {
        return upskillReskill.getText();
    }
    public void contactFullNameLabelIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> contactFullNameLabel.isDisplayed());
    }
    public String getContactFullNameLabelText() {
        return contactFullNameLabel.getText();
    }
    public void enterContactFullName(String fullName) {
        contactFullName.sendKeys(fullName);
    }
    public void contactEmailLabelIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> contactEmailLabel.isDisplayed());
    }
    public String getContactEmailLabelText() {
        return contactEmailLabel.getText();
    }
    public void enterContactEmail(String email) {
        contactEmail.sendKeys(email);
    }
    public void contactPhoneNumberLabelIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> contactPhoneNumberLabel.isDisplayed());
    }
    public String getContactPhoneNumberLabelText() {
        return contactPhoneNumberLabel.getText();
    }
    public void enterContactPhoneNumber(String phone) {
        contactPhoneNumber.sendKeys(phone);
    }
    public void countryFlagContactUsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> countryFlagContactUs.isDisplayed());
    }
    public String getCountryFlagContactUsText() {
        return countryFlagContactUs.getAttribute("title");
    }
    public void countryFlagArrowContactUsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> countryFlagArrowContactUs.isDisplayed());
    }
    public String getCountryFlagArrowContactUsText() {
        return countryFlagArrowContactUs.getAttribute("title");
    }
    public void experienceLabelIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> experienceLabel.isDisplayed());
    }
    public String getExperienceLabelText() {
        return experienceLabel.getText();
    }
    public void experience0_3IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> experience0_3.isDisplayed());
    }
    public String getExperience0_3Text() {
        return experience0_3.getText();
    }
    public void experience3_8IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> experience3_8.isDisplayed());
    }
    public String getExperience3_8Text() {
        return experience3_8.getText();
    }
    public void experience8_12IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> experience8_12.isDisplayed());
    }
    public String getExperience8_12Text() {
        return experience8_12.getText();
    }
    public void experience12IsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> experience12.isDisplayed());
    }
    public String getExperience12Text() {
        return experience12.getText();
    }
    public void termsAndConditionsLabelIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> termsAndConditionsLabel.isDisplayed());
    }
    public String getTermsAndConditionsLabelText() {
        return termsAndConditionsLabel.getText();
    }
    public void termsAndConditionsLabelClick() {
        termsAndConditionsLabel.click();
    }
    public void sendWhatsAppLabelIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> sendWhatsAppLabel.isDisplayed());
    }
    public String getSendWhatsAppLabelText() {
        return sendWhatsAppLabel.getText();
    }
    public void sendWhatsAppLabelClick() {
        sendWhatsAppLabel.click();
    }
    public void sendWhatsAppCheckboxIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> sendWhatsAppCheckbox.isDisplayed());
    }
    public String getSendWhatsAppCheckboxText() {
        return sendWhatsAppCheckbox.getAttribute("aria-checked");
    }
    public void sendWhatsAppCheckboxClick() {
        sendWhatsAppCheckbox.click();
    }
    public void joinTheProgramButtonIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> joinTheProgramButton.isDisplayed());
    }
    public String getJoinTheProgramButtonText() {
        return joinTheProgramButton.getText();
    }
    public void joinTheProgramButtonClick() {
        joinTheProgramButton.click();
    }
    public void getExpertGuidanceIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> getExpertGuidance.isDisplayed());
    }
    public String getGetExpertGuidanceText() {
        return getExpertGuidance.getText();
    }
    public void needSupportIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> needSupport.isDisplayed());
    }
    public String getNeedSupportText() {
        return needSupport.getText();
    }
    public void imagePhoneIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> imagePhone.isDisplayed());
    }
    public String getImagePhoneText() {
        return imagePhone.getAttribute("alt");
    }
    public void supportPhoneIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> supportPhoneNumber.isDisplayed());
    }
    public String getSupportPhoneText() {
        return supportPhoneNumber.getText();
    }
    public void supportPhoneNumberSubHeadingIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> supportPhoneNumberSubHeading.isDisplayed());
    }
    public String getSupportPhoneNumberSubHeadingText() {
        return supportPhoneNumberSubHeading.getText();
    }
    public void imageEmailIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> imageEmail.isDisplayed());
    }
    public String getImageEmailText() {
        return imageEmail.getAttribute("alt");
    }
    public void supportEmailIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> supportEmail.isDisplayed());
    }
    public String getSupportEmailText() {
        return supportEmail.getText();
    }
    public void supportEmailSubHeadingIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> supportEmailSubHeading.isDisplayed());
    }
    public String getSupportEmailSubHeadingText() {
        return supportEmailSubHeading.getText();
    }
    // ========== Seventeenth section ==========
    public void frequentlyAskedQuestionsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> frequentlyAskedQuestions.isDisplayed());
    }
    public String getFrequentlyAskedQuestionsText() {
        return frequentlyAskedQuestions.getText();
    }
    public void lookingForAnswersIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> lookingForAnswers.isDisplayed());
    }
    public String getLookingForAnswersText() {
        return lookingForAnswers.getText();
    }
    public void whatMakesTheGenAiPinnaclePlusProgramDifferentIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> whatMakesTheGenAiPinnaclePlusProgramDifferent.isDisplayed());
    }
    public String getWhatMakesTheGenAiPinnaclePlusProgramDifferentText() {
        return whatMakesTheGenAiPinnaclePlusProgramDifferent.getText();
    }
    public void whatMakesTheGenAiPinnaclePlusProgramDifferentClick() {
        whatMakesTheGenAiPinnaclePlusProgramDifferent.click();
    }
    public void howIsTheGenAiPinnaclePlusProgramDifferentIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> howIsTheGenAiPinnaclePlusProgramDifferent.isDisplayed());
    }
    public String getHowIsTheGenAiPinnaclePlusProgramDifferentText() {
        return howIsTheGenAiPinnaclePlusProgramDifferent.getText();
    }
    public void howIsTheGenAiPinnaclePlusProgramDifferentClick() {
        howIsTheGenAiPinnaclePlusProgramDifferent.click();
    }
    public void whoIsTheIdealCandidateIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> whoIsTheIdealCandidate.isDisplayed());
    }
    public String getWhoIsTheIdealCandidateText() {
        return whoIsTheIdealCandidate.getText();
    }
    public void whoIsTheIdealCandidateClick() {
        whoIsTheIdealCandidate.click();
    }
    public void viewMoreIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> viewMore.isDisplayed());
    }
    public String getViewMoreText() {
        return viewMore.getText();
    }
    public void viewMoreClick() {
        viewMore.click();
    }
    // ========== Eighteenth section ==========
    public void flagshipProgramsIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> flagshipPrograms.isDisplayed());
    }
    public String getFlagshipProgramsText() {
        return flagshipPrograms.getText();
    }
    public void genAiPinnacleProgramIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> genAiPinnacleProgram.isDisplayed());
    }
    public String getGenAiPinnacleProgramText() {
        return genAiPinnacleProgram.getText();
    }
    public void genAiPinnacleProgramClick() {
        genAiPinnacleProgram.click();
    }
    public void clickOnGenAiPinnacleProgram() {
        genAiPinnacleProgram.click();
    }

}
