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
    @FindBy (xpath = "//ul[@class='mb-4 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Full-spectrum GenAI and Agentic AI learning with 1')]")
    WebElement fullSpectrumGenAiAndAgenticAiLearning2;
    @FindBy (xpath = "//div[@class='col-xl-4 col-lg-4 col-md-12 col-sm-12 mb-4 mb-lg-0 px-3']//h3[@class='fs-24 fw-semibold mb-4'][normalize-space()='50+ Industry-Aligned Projects']")
    WebElement industryAlignedProjects;
    @FindBy (xpath = "//ul[@class='mb-4 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Acquire real-world experience through projects tha')]")
    WebElement acquireRealWorldExperience;
    @FindBy (xpath = "//ul[@class='mb-4 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Diverse projects designed to transform knowledge i')]")
    WebElement diverseProjects;
    @FindBy (xpath = "//div[@class='col-xl-4 col-lg-4 col-md-12 col-sm-12 mb-4 mb-lg-0 px-3']//h3[@class='fs-24 fw-semibold mb-4'][normalize-space()='1:1 Expert Mentorship']")
    WebElement expertMentorship;
    @FindBy (xpath = "//ul[@class='mb-4 mb-md-0 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][normalize-space()='Get expert insights from seasoned professionals']")
    WebElement expertInsights;
    @FindBy (xpath = "//ul[@class='mb-4 mb-md-0 ps-3']//li[@class='mb-4 fs-16 text-dark-secondary'][contains(text(),'Accelerate your learning with a personalized roadm')]")
    WebElement personalizedRoadmap;


    // ========== Third section ==========

    @FindBy (xpath = "//h2[normalize-space()='Curriculum Statistics']")
    WebElement curriculumStatistics;
    @FindBy (xpath = "//h4[normalize-space()='50+ Projects']")
    WebElement projects2;
    @FindBy (xpath = "//p[contains(text(),'Hands-on learning with industry-relevant challenge')]")
    WebElement handsOnLearning;

    @FindBy (xpath = "//h4[normalize-space()='300+ Hours']")
    WebElement hoursOfImmersiveLearning2_2;
    @FindBy (xpath = "//p[contains(text(),'In-depth GenAI and Agentic AI learning to transfor')]")
    WebElement inDepthLearning;
    @FindBy (xpath = "//h4[normalize-space()='40+ Libraries']")
    WebElement libraries;
    @FindBy (xpath = "//p[contains(text(),'Develop expertise in 40+ essential industry tools,')]")
    WebElement developExpertise;
    @FindBy (xpath = "//h4[normalize-space()='30+ Assignments']")
    WebElement assignments;
    @FindBy (xpath = "//p[normalize-space()='To turn knowledge into action']")
    WebElement turnKnowledgeIntoAction;
    @FindBy (xpath = "//h4[normalize-space()='75+ Mentorship Sessions']")
    WebElement mentorshipSessions;
    @FindBy (xpath = "//p[contains(text(),'1:1 live mentorship session from GenAI and Agentic')]")
    WebElement liveMentorshipSession;


// ========== Fifth section ==========
    @FindBy (xpath = "//h2[normalize-space()='Curriculum']")
    WebElement curriculum;
    @FindBy (xpath = "//p[contains(text(),'From Python foundations to GenAI and Agentic AI : ')]")
    WebElement fromPythonFoundations;
    @FindBy (xpath = "//div[contains(text(),'50+ Projects')]")
    WebElement projects3;
    @FindBy (xpath = "//div[contains(text(),'300+ Hours')]")
    WebElement hoursOfImmersiveLearning3;
    @FindBy (xpath = "//div[normalize-space()='40+ Tools']")
    WebElement tools;
    @FindBy (xpath = "//div[contains(text(),'30+ Assignments')]")
    WebElement assignments2;
    By curriculamSection = By.xpath( "//div[@class='accordion-item border-0']");

    @FindBy (xpath = "//img[@alt='Choose What to Learn Image']")
    WebElement chooseWhatToLearnImage;
    @FindBy (xpath = "//button[normalize-space()='Download Free Curriculum']")
    WebElement downloadFreeCurriculumButton;

// ========== Sixth section ==========
    @FindBy (xpath = "//h2[normalize-space()='Libraries & Frameworks']")
    WebElement librariesAndFrameworks;

    @FindBy(xpath = "//p[contains(text(),'Master 40+ GenAI and Agentic AI tools, libraries a')]")
    WebElement master40Libraries;
    By librariesAndFrameworksSection = By.xpath("//div[@class=\"d-inline-block w-auto mb-3\"]");
    @FindBy (xpath = "//button[normalize-space()='Download Tools Pack']")
    WebElement downloadToolsPackButton;






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


}
