package web_automation.analytics_vidhya.tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.asserts.SoftAssert;
import web_automation.analytics_vidhya.base.TestBase;
import org.testng.annotations.Test;
import web_automation.analytics_vidhya.pages.HomePage;
import web_automation.analytics_vidhya.utils.AnalyticsVidhyaDataProvider;

public class Login extends TestBase {

    private final String moduleName = "analyticsVidhyaLoginPage";


    @Test(priority = 1, dataProvider = "analyticVidhyaData", dataProviderClass = AnalyticsVidhyaDataProvider.class)
    public void validatingHomepagePopUp(String url, String path, String name, String phone, String email) {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingHomepagePopUp", "Validating if homepage pop up").assignCategory(moduleName);
        setExtentTest(test);
        // Set up WebDriver
        getDriver().get(url + path);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickAcceptCookies();
        hardWait(10);
        if (homePage.ifInitialPopUpHeadingIsDisplayed()) {
            test.log(Status.PASS, "Initial pop up is displayed");
            logger.info("Initial pop up is displayed");
            SoftAssert softAssert1 = new SoftAssert();
            softAssert1.assertEquals(homePage.getInitialPopUpHeadingText(), "Transform into a GenAI and Agentic AI Pro: Take the First Step");
            logger.info("Initial pop up heading is displayed");
            softAssert1.assertEquals(homePage.getfullNameLabelText(), "Full Name");
            logger.info("Full name label is displayed");
            softAssert1.assertEquals(homePage.getPhoneNumberLabelText(), "Phone Number");
            logger.info("Phone number label is displayed");
            softAssert1.assertEquals(homePage.getEmailLabelText(), "Email Id");
            logger.info("Email label is displayed");
            homePage.enterFullName(name);
            logger.info("Full name is entered");
            homePage.enterPhoneNumber(phone);
            logger.info("Phone number is entered");
            homePage.enterEmail(email);
            logger.info("Email is entered");
            softAssert1.assertEquals(homePage.getDownloadProjectButtonText(), "Download Projects");
            logger.info("Download project button is displayed");
            softAssert1.assertAll();
            homePage.downloadProjectButton();
            hardWait(5);
            homePage.clickSkipButton();
            test.log(Status.PASS, "Initial pop up all the fields are validated");
            logger.info("Initial pop up all the fields are validated");

//            if (homePage.ifAnalyticsVidyaIconIsDisplayed()) {
//                test.log(Status.PASS, "Analytics Vidhya icon is displayed");
//                logger.info("Analytics Vidhya icon is displayed");
//
//            } else {
//                test.log(Status.FAIL, "Analytics Vidhya icon is not displayed");
//                logger.info("Analytics Vidhya icon is not displayed");
//            }
        } else {
            test.log(Status.FAIL, "Initial pop up is not displayed");
            logger.info("Initial pop up is not displayed");
        }


        test.log(Status.PASS, "Navigated to Analytics Vidhya pinnacle plus page");
        logger.info("Navigated to Analytics Vidhya");

    }
}
