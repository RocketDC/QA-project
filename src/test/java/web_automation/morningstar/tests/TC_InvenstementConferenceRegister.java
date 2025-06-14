package web_automation.morningstar.tests;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import web_automation.morningstar.base.TestBase;
import web_automation.morningstar.pages.HomePage;
import web_automation.morningstar.utils.MorningstarDataProvider;

public class TC_InvenstementConferenceRegister extends TestBase {
    public final String moduleName = "Investment Conference";

    //Open Investment conference page
    @Test(priority = 1, dataProvider = "morningstarUrlsAndEndpoints", dataProviderClass = MorningstarDataProvider.class)
    public void validateHomepageAdvertisement(String url, String endpoint) {
        ExtentTest test = extent.createTest("Validate Homepage Advertisement");
        setExtentTest(test);

        getDriver().get(url);
        HomePage homePage = new HomePage(getDriver());

        if (homePage.isMorningstarLogoDisplayed()) {
            test.log(Status.PASS, "Morningstar Logo is displayed");
            logger.info("Morningstar Logo is displayed");
        } else {
            test.log(Status.FAIL, "Morningstar Logo is not displayed");
            logger.error("Morningstar Logo is not displayed");
        }

        if (homePage.isSkipAdvTextDisplayed()) {
            test.log(Status.PASS, "Skip Adv Text is displayed");
            logger.info("Skip Adv Text is displayed");
        } else {
            test.log(Status.FAIL, "Skip Adv Text is not displayed");
            logger.error("Skip Adv Text is not displayed");
        }
        if (homePage.isMorningstarIndiaClickableTextDisplayed()) {
            test.log(Status.PASS, "Morningstar India Clickable Text is displayed");
            logger.info("Morningstar India Clickable Text is displayed");
        } else {
            test.log(Status.FAIL, "Morningstar India Clickable Text is not displayed");
            logger.error("Morningstar India Clickable Text is not displayed");
        }

        if (homePage.isAdvertisementImageDisplayed()) {
            test.log(Status.PASS, "Advertisement Image is displayed");
            logger.info("Advertisement Image is displayed");
            homePage.clickOnAdvertisementImage();
        } else {
            test.log(Status.FAIL, "Advertisement Image is not displayed");
            logger.error("Advertisement Image is not displayed");
        }

    }

    //Validating registering for Investment Conference
    @Test(priority = 2,dependsOnMethods = "validateHomepageAdvertisement", dataProvider = "morningstarFormData", dataProviderClass = MorningstarDataProvider.class)
    public void validateRegisterForInvestmentConference(String name, String email) {
        ExtentTest test = extent.createTest("Validate Register for Investment Conference");
        setExtentTest(test);

        

    }
}