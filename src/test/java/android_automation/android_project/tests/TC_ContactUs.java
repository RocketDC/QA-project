package android_automation.android_project.tests;

import android_automation.android_project.base.TestBase;
import android_automation.android_project.utils.CitiusTechDataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import android_automation.android_project.pages.ContactUs;

public class TC_ContactUs extends TestBase {
public final String moduleName = "Contact Us";
    //Opening Contact Us page
    @Test(priority = 1,dataProvider = "citiusTechData",dataProviderClass = CitiusTechDataProvider.class)
    public void testContactUs(String url, String path) {
        ExtentTest test = extent.createTest("TC" + getClass() + "testContactUs", "Opening Contact Us page").assignCategory(moduleName);
        setExtentTest(test);
        ContactUs contactUs = new ContactUs(getDriver());
        getDriver().get(url);
        test.log(Status.INFO, "Navigated to " + url);
        logger.info("Navigated to " + url);



        //Validating cookies
        // acceptCookies();//Commenting for now

        //Validating the page title
        String expectedTitle = "CitiusTech: Digital Healthcare Technology Solutions & Service Provider in US";
        String actualTitle = getDriver().getTitle();
        if (expectedTitle.equals(actualTitle)) {
            test.log(Status.PASS, "Page title is correct");
            logger.info("Page title is correct");
        } else {
            test.log(Status.FAIL, "Page title is incorrect");
            logger.info("Page title is incorrect");
        }
// Validating the presence of What We Do nav test
        if( contactUs.whatWeDoNavIsDisplayed()) {
            test.log(Status.PASS, "What We Do nav is displayed");
            logger.info("What We Do nav is displayed");
            contactUs.hoverWhatWeDoNav();
            if( contactUs.setWhatWeDoNavHeadingIsDisplayed()) {
                test.log(Status.PASS, "What We Do nav text is displayed");
                logger.info("What We Do nav text is displayed");
                contactUs.validateTextOfWhatWeDoNav("What We Do");
            } else {
                test.log(Status.FAIL, "What We Do nav text is not displayed");
                logger.info("What We Do nav text is not displayed");
            }

        } else {
            test.log(Status.FAIL, "What We Do nav is not displayed");
            logger.info("What We Do nav is not displayed");
        }
    
        if (contactUs.citiusTechLogoIsDisplayed()) {
            test.log(Status.PASS, "Citius Tech logo is displayed");
            logger.info("Citius Tech logo is displayed");
            contactUs.clickCitiusTechLogo();
            logger.info("Citius Tech logo clicked");
            test.log(Status.PASS, "Citius Tech logo clicked");


        } else {
            test.log(Status.FAIL, "Citius Tech logo is not displayed");
            logger.info("Citius Tech logo is not displayed");
        }
        // Navigating to Contact Us page
        getDriver().navigate().to(url + path);
        test.log(Status.INFO, "Navigated to Contact Us page: " + url + path);
        logger.info("Navigated to Contact Us page: " + url + path);
        
    }

}
