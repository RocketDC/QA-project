package web_automation.citiusTech.tests;

import org.testng.annotations.Test;
import web_automation.citiusTech.base.TestBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import web_automation.citiusTech.pages.ContactUs;
import web_automation.citiusTech.utils.CitiusTechDataProvider;

public class TC_ContactUs extends TestBase{
public final String moduleName = "Contact Us";
    //Opening Contact Us page
    @Test(priority = 1,dataProvider = "citiusTechData",dataProviderClass = CitiusTechDataProvider.class)
    public void testContactUs(String url, String path) {
        ExtentTest test = extent.createTest("TC" + getClass() + "testContactUs", "Opening Contact Us page").assignCategory(moduleName);
        setExtentTest(test);
        ContactUs contactUs = new ContactUs(getDriver());
        getDriver().get(url);

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
    
        
    }

}
