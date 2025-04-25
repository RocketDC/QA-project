package web_automation.analytics_vidhya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import web_automation.analytics_vidhya.base.TestBase;

public class HomePage extends TestBase {
    WebDriver driver;

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
    private By cbTnC = By.xpath("//*[@id=\"termAndConditionLoginModal\"]");
    private By TncLabel = By.xpath("//label[@for=\"termAndConditionLoginModal\"]");
    private By cbSendWhatsApp = By.xpath("//input[@type=\"checkbox\" and @id=\"isWhatsappLoginModal\"]");
    private By enrollNowButtonInWindow = By.xpath("//button[text()=\"Enroll Now\"]");
    private By sendWhatsAppLabel = By.xpath("//label[@for=\"isWhatsappLoginModal\"]");
    private By downloadBrochureButton = By.xpath("//button[text()=\"Download Brochure\"]");
    private By requestCallbackButton = By.xpath("//button[text()=\"Request Callback\"]");
    private By getPersonalizedRoadmapButton = By.xpath("//button[text()=\"Get Personalized Roadmap\"]");
    private By viewAllProjectsButton = By.xpath("//button[text()=\"View All Projects\"]");
    private By downloadInstructionProfileButton = By.xpath("//button[text()=\"Download Instruction Profile\"]");
    private By getWorkshopsDetailsButton = By.xpath("//button[text()=\"Get Workshops Details\"]");
    private By upskillReskillThriveSection = By.xpath("//h2[text()=\"Upskill, Reskill, Thrive.\"]");

    private By cbTnCurt = By.xpath("//input[@type=\"checkbox\"]");
    private By tnCurt = By.xpath("//a[text()=\"Terms and Conditions\"]");
    private By cbSendWhatsAppCurt = By.xpath("//input[@type=\"checkbox\"]");
    private By sendWhatsAppCurt = By.xpath("//a[text()=\"Send WhatsApp\"]");

    private By cbNotARobot = By.xpath("//input[@type=\"checkbox\"]");
    private By joinTheProgramButton = By.xpath("//button[text()=\"Join the Program\"]");
    private By aiSupportIcon = By.xpath("//img[@alt=\"AI Support\"]");
    private By contactUsTodayHeading = By.xpath("//h2[text()=\"Contact Us Today!\"]");
    private By contactUsTodaySubHeading = By.xpath("//h3[text()=\"Take the first step towards a future of innovation & excellence with Analytics Vidhya\"]");
    private By getExpertGuidanceHeading = By.xpath("//h2[text()=\"Get Expert Guidance\"]");
    private By getExpertGuidanceSubHeading = By.xpath("//h3[text()=\"Need support? We've got your back anytime!\"]");
    private By imagePhone = By.xpath("//img[@alt=\"blackbelt/icons/phone_number.svg\"]");
    private By supportPhoneNumber = By.xpath("//a[text()=\"+91-9354711240\"]");
    private By supportPhoneNumberSubHeading = By.xpath("//h3[text()=\"10AM - 7PM (IST) Mon-Sun\"]");
    private By imageEmail = By.xpath("//img[@alt=\"blackbelt/icons/email.svg\"]");
    private By supportEmail = By.xpath("//a[text()=\"customersupport@analyticsvidhya.com\"]");
    private By supportEmailSubHeading = By.xpath("//h3[text()=\"You'll hear back from us in 24 hours.\"]");

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
