package web_automation.chase.tests;

import org.testng.annotations.Test;
import web_automation.chase.base.TestBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import web_automation.chase.pages.HomePage;
import web_automation.chase.utils.ChaseDataProvide;

public class TC01_HomePage extends TestBase {
    public final String moduleName = "Get A Demo";

    // Test case 1: Verify that the Chase page is displayed
    @Test(priority = 1, description = "Verify that the Chase page is displayed", dataProvider = "chaseUrls", dataProviderClass = ChaseDataProvide.class)
    public void verifyChasePageIsDisplayed(String url, String endpoint) {
        ExtentTest test = extent
                .createTest("TC" + getClass() + "_verifyChasePageIsDisplayed",
                        "Verify that the Chase page is displayed")
                .assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToChaseUrl(url);

        //Validating the title of the page
        homePage.validateChaseTitle("Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com");

        if (homePage.isPersonalCTADisplayed()) {
            test.log(Status.PASS, "Personal CTA is displayed");
            logger.info("Personal CTA is displayed");

            homePage.validatePersonalCTAText("Personal");
            test.log(Status.PASS, "Personal CTA text validated");
            logger.info("Personal CTA text validated");
        } else {
            test.log(Status.FAIL, "Personal CTA is not displayed");
            logger.error("Personal CTA is not displayed");
        }

        if (homePage.isBusinessCTADisplayed()) {
            test.log(Status.PASS, "Business CTA is displayed");
            logger.info("Business CTA is displayed");

            homePage.validateBusinessCTAText("Business");
            test.log(Status.PASS, "Business CTA text validated");
            logger.info("Business CTA text validated");
        } else {
            test.log(Status.FAIL, "Business CTA is not displayed");
            logger.error("Business CTA is not displayed");
        }

        //Validating Commercial CTA
        if (homePage.isCommercialCTADisplayed()) {
            test.log(Status.PASS, "Commercial CTA is displayed");
            logger.info("Commercial CTA is displayed");

            homePage.validateCommercialCTAText("Commercial");
            test.log(Status.PASS, "Commercial CTA text validated");
            logger.info("Commercial CTA text validated");
        } else {
            test.log(Status.FAIL, "Commercial CTA is not displayed");
            logger.error("Commercial CTA is not displayed");
        }

        //Validating chase logo
        if (homePage.isChaseLogoDisplayed()) {
            test.log(Status.PASS, "Chase logo is displayed");
            logger.info("Chase logo is displayed");
        } else {
            test.log(Status.FAIL, "Chase logo is not displayed");
            logger.error("Chase logo is not displayed");
        }

        //Validating Checking CTA    
        if (homePage.isCheckingCTADisplayed()) {
            test.log(Status.PASS, "Checking CTA is displayed");
            logger.info("Checking CTA is displayed");

            homePage.validateCheckingCTAText("Checking");
            test.log(Status.PASS, "Checking CTA text validated");
            logger.info("Checking CTA text validated");
        } else {
            test.log(Status.FAIL, "Checking CTA is not displayed");
            logger.error("Checking CTA is not displayed");
        }

        //Validating Savings CTA    
        if (homePage.isSavingsCTADisplayed()) {
            test.log(Status.PASS, "Savings CTA is displayed");
            logger.info("Savings CTA is displayed");

            homePage.validateSavingsCTAText("Savings");
            test.log(Status.PASS, "Savings CTA text validated");
            logger.info("Savings CTA text validated");
        } else {
            test.log(Status.FAIL, "Savings CTA is not displayed");
            logger.error("Savings CTA is not displayed");
        }

        //Validating Credit CTA    
        if (homePage.isCreditCTADisplayed()) {
            test.log(Status.PASS, "Credit CTA is displayed");
            logger.info("Credit CTA is displayed");

            homePage.validateCreditCTAText("Credit");
            test.log(Status.PASS, "Credit CTA text validated");
            logger.info("Credit CTA text validated");
        } else {
            test.log(Status.FAIL, "Credit CTA is not displayed");
            logger.error("Credit CTA is not displayed");
        }

        //Validating Home Loans CTA Text   
        if (homePage.isHomeLoansCTADisplayed()) {
            test.log(Status.PASS, "Home Loan CTA is displayed");
            logger.info("Home Loan CTA is displayed");

            homePage.validateHomeLoansCTAText("Home Loan");
            test.log(Status.PASS, "Home Loan CTA text validated");
            logger.info("Home Loan CTA text validated");
        } else {
            test.log(Status.FAIL, "Home Loan CTA is not displayed");
            logger.error("Home Loan CTA is not displayed");
        }

        //Validating Auto Loans CTA Text   
        if (homePage.isAutoLoansCTADisplayed()) {
            test.log(Status.PASS, "Auto Loan CTA is displayed");
            logger.info("Auto Loan CTA is displayed");

            homePage.validateAutoLoansCTAText("Auto Loan");
            test.log(Status.PASS, "Auto Loan CTA text validated");
            logger.info("Auto Loan CTA text validated");
        } else {
            test.log(Status.FAIL, "Auto Loan CTA is not displayed");
            logger.error("Auto Loan CTA is not displayed");
        }

        //Validating Investing By JP Morgan Text   
        if (homePage.isInvestingByJP_MorganDisplayed()) {
            test.log(Status.PASS, "Investing By JP Morgan is displayed");
            logger.info("Investing By JP Morgan is displayed");

            homePage.validateInvestingByJP_Morgan("Investing By JP Morgan");
            test.log(Status.PASS, "Investing By JP Morgan text validated");
            logger.info("Investing By JP Morgan text validated");
        } else {
            test.log(Status.FAIL, "Investing By JP Morgan is not displayed");
            logger.error("Investing By JP Morgan is not displayed");
        }

        //Validating Education CTA Text   
        if (homePage.isEducationCTADisplayed()) {
            test.log(Status.PASS, "Education CTA is displayed");
            logger.info("Education CTA is displayed");

            homePage.validateEducationCTAText("Education");
            test.log(Status.PASS, "Education CTA text validated");
            logger.info("Education CTA text validated");
        } else {
            test.log(Status.FAIL, "Education CTA is not displayed");
            logger.error("Education CTA is not displayed");
        }

        //Validating Travel CTA
        if (homePage.isTravelCTADisplayed()) {
            test.log(Status.PASS, "Travel CTA is displayed");
            logger.info("Travel CTA is displayed");

            homePage.validateTravelCTAText("Travel");
            test.log(Status.PASS, "Travel CTA text validated");
            logger.info("Travel CTA text validated");
        } else {
            test.log(Status.FAIL, "Travel CTA is not displayed");
            logger.error("Travel CTA is not displayed");
        }

        //





        

    }

}