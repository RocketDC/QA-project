package web_automation.seclore.tests;

import org.testng.annotations.Test;
import web_automation.seclore.base.TestBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import web_automation.seclore.pages.LoginPage;
import web_automation.seclore.utils.SecloreDataProvider;

public class TC02_Login extends TestBase {
    public final String moduleName = "Login";

    @Test(priority = 1, description = "Verify login page elements", dataProvider = "secloreUrls", dataProviderClass = SecloreDataProvider.class)
    public void verifyLoginPage(String url, String endpoint) {
        ExtentTest test = extent
                .createTest("TC" + getClass() + "_verifyLoginPage",
                        "Verify login page elements")
                .assignCategory(moduleName);
        setExtentTest(test);
        // Validate if browser is open else open browser
        if (getDriver() == null) {
            test.log(Status.INFO, "Browser is not open");
            logger.info("Browser is not open");

        } else {
            getDriver().navigate().to("https://partners.seclore.com/#/page/login");
        }

        LoginPage loginPage = new LoginPage(getDriver());
        if (loginPage.isSecloreLogoDisplayed()) {
            test.log(Status.PASS, "Seclore logo is displayed");
            logger.info("Seclore logo is displayed");
        } else {
            test.log(Status.FAIL, "Seclore logo is not displayed");
            logger.error("Seclore logo is not displayed");
        }

        // Validate login text button is displayed
        if (loginPage.isLoginButtonDisplayed()) {
            test.log(Status.PASS, "Login button is displayed");
            logger.info("Login button is displayed");
            loginPage.validateTextOfLoginButton("Login");
            test.log(Status.PASS, "Login button text is correct");
            logger.info("Login button text is correct");
            loginPage.clickLoginButton();
            test.log(Status.PASS, "Login button is clicked");
            logger.info("Login button is clicked");

        } else {
            test.log(Status.FAIL, "Login button is not displayed");
            logger.error("Login button is not displayed");
        }
        // Validate register text button is displayed
        if (loginPage.isRegisterButtonDisplayed()) {
            test.log(Status.PASS, "Register button is displayed");
            logger.info("Register button is displayed");
            loginPage.validateTextOfRegisterButton("Register");
            test.log(Status.PASS, "Register button text is correct");
            logger.info("Register button text is correct");
            loginPage.clickRegisterButton();
            getDriver().navigate().back();
            test.log(Status.PASS, "Register button is clicked");
            logger.info("Register button is clicked");

        } else {
            test.log(Status.FAIL, "Register button is not displayed");
            logger.error("Register button is not displayed");
        }

        // Validate login heading is displayed
        if (loginPage.isLoginHeadingDisplayed()) {
            test.log(Status.PASS, "Login heading is displayed");
            logger.info("Login heading is displayed");
            loginPage.validateTextOfLoginHeading("Login");
            test.log(Status.PASS, "Login heading text is correct");
            logger.info("Login heading text is correct");

        } else {
            test.log(Status.FAIL, "Login heading is not displayed");
            logger.error("Login heading is not displayed");
        }

        // Validate email label field is displayed
        if (loginPage.isEmailLabelFieldDisplayed()) {
            test.log(Status.PASS, "Email label field is displayed");
            logger.info("Email label field is displayed");
            loginPage.validateTextOfEmailLabelField("Email Address");
            test.log(Status.PASS, "Email label field text is correct");
            logger.info("Email label field text is correct");

        } else {
            test.log(Status.FAIL, "Email label field is not displayed");
            logger.error("Email label field is not displayed");
        }

        // Validate email input field is displayed
        if (loginPage.isEmailInputFieldDisplayed()) {
            test.log(Status.PASS, "Email input field is displayed");
            logger.info("Email input field is displayed");
            loginPage.validatePlaceholderTextOfEmailInputField("Email Address");
            test.log(Status.PASS, "Email input field placeholder text is correct");
            logger.info("Email input field placeholder text is correct");
            loginPage.enterTextInEmailInputField("Email Address");
            test.log(Status.PASS, "Email input field text is entered");
            logger.info("Email input field text is entered");
            loginPage.clearTextInEmailInputField();
            test.log(Status.PASS, "Email input field text is cleared");
            logger.info("Email input field text is cleared");


        } else {
            test.log(Status.FAIL, "Email input field is not displayed");
            logger.error("Email input field is not displayed");
        }

        // Validate password label field is displayed
        if (loginPage.passwordLabelIsDisplayed()) {
            test.log(Status.PASS, "Password label field is displayed");
            logger.info("Password label field is displayed");
            loginPage.validateTextOfPasswordLabelField("Password");
            test.log(Status.PASS, "Password label field text is correct");
            logger.info("Password label field text is correct");

        } else {
            test.log(Status.FAIL, "Password label field is not displayed");
            logger.error("Password label field is not displayed");
        }

        // Validate password input field is displayed
        if (loginPage.passwordInputFieldIsDisplayed()) {
            test.log(Status.PASS, "Password input field is displayed");
            logger.info("Password input field is displayed");
            loginPage.validateTextOfPasswordInputField("Password");
            test.log(Status.PASS, "Password input field placeholder text is correct");
            logger.info("Password input field placeholder text is correct");
            loginPage.enterTextInPasswordInputField("Password");
            test.log(Status.PASS, "Password input field text is correct");
            logger.info("Password input field text is correct");
            loginPage.clearTextInPasswordInputField();
            test.log(Status.PASS, "Password input field text is cleared");
            logger.info("Password input field text is cleared");
        } else {
            test.log(Status.FAIL, "Password input field is not displayed");
            logger.error("Password input field is not displayed");
        }

        // Validate forgot password link is displayed
        if (loginPage.isForgotPasswordLinkDisplayed()) {
            test.log(Status.PASS, "Forgot password link is displayed");
            logger.info("Forgot password link is displayed");
            loginPage.validateTextOfForgotPasswordLink("Forgot Your Password?");
            test.log(Status.PASS, "Forgot password link text is correct");
            logger.info("Forgot password link text is correct");

        } else {
            test.log(Status.FAIL, "Forgot password link is not displayed");
            logger.error("Forgot password link is not displayed");
        }

        // Validate sign in button is displayed
        if (loginPage.isSignInButtonDisplayed()) {
            test.log(Status.PASS, "Sign in button is displayed");
            logger.info("Sign in button is displayed");
            loginPage.validateTextOfSignInButton("Sign In");
            test.log(Status.PASS, "Sign in button text is correct");
            logger.info("Sign in button text is correct");

        } else {
            test.log(Status.FAIL, "Sign in button is not displayed");
            logger.error("Sign in button is not displayed");
        }

        // Validate not a partner text is displayed
        if (loginPage.isNotAPartnerTextDisplayed()) {
            test.log(Status.PASS, "Not a partner text is displayed");
            logger.info("Not a partner text is displayed");
            loginPage.validateTextOfNotAPartnerText("Not a partner?");
            test.log(Status.PASS, "Not a partner text is correct");
            logger.info("Not a partner text is correct");

        } else {
            test.log(Status.FAIL, "Not a partner text is not displayed");
            logger.error("Not a partner text is not displayed");
        }
        // Validate register today button is displayed
        if (loginPage.isRegisterTodayButtonDisplayed()) {
            test.log(Status.PASS, "Register today button is displayed");
            logger.info("Register today button is displayed");
            loginPage.validateTextOfRegisterTodayButton("Register today");
            // click register today button
             loginPage.clickRegisterTodayButton();
            test.log(Status.PASS, "Register today button is clicked");
            logger.info("Register today button is clicked");
            getDriver().navigate().back();
            test.info("Navigated back to login page");
            logger.info("Navigated back to login page");
            test.log(Status.PASS, "Register today button text is correct");
            logger.info("Register today button text is correct");

        } else {
            test.log(Status.FAIL, "Register today button is not displayed");
            logger.error("Register today button is not displayed");
        }

        // Validate Welcome partner Portal page heading
        if (loginPage.isWelcomePartnerPortalHeadingDisplayed()) {
            test.log(Status.PASS, "Welcome partner Portal page heading is displayed");
            logger.info("Welcome partner Portal page heading is displayed");
            loginPage.validateTextOfWelcomePartnerPortalHeading("Welcome to your  partner portal");
            test.log(Status.PASS, "Welcome partner Portal page heading text is correct");
            logger.info("Welcome partner Portal page heading text is correct");

        } else {
            test.log(Status.FAIL, "Welcome partner Portal page heading is not displayed");
            logger.error("Welcome partner Portal page heading is not displayed");

        }

        // Validate Checkout all inclusive section heading
        if (loginPage.isCheckoutAllInclusiveSectionHeadingDisplayed()) {
            test.log(Status.PASS, "Checkout all inclusive section heading is displayed");
            logger.info("Checkout all inclusive section heading is displayed");
            loginPage.validateTextOfCheckoutAllInclusiveSectionHeading(
                    "Check out our all-inclusive partner success programs in our Partner Portal.");
            test.log(Status.PASS, "Checkout all inclusive section heading text is correct");
            logger.info("Checkout all inclusive section heading text is correct");

        } else {
            test.log(Status.FAIL, "Checkout all inclusive section heading is not displayed");
            logger.error("Checkout all inclusive section heading is not displayed");
        }

        // Validate Checkout all inclusive section sub-heading
        if (loginPage.isCheckoutAllInclusiveSectionSubHeadingDisplayed()) {
            test.log(Status.PASS, "Checkout all inclusive section sub-heading is displayed");
            logger.info("Checkout all inclusive section sub-heading is displayed");
            loginPage.validateTextOfCheckoutAllInclusiveSectionSubHeading(
                    "Our Partner Success team is here to help you with an entire organization of industry, product and marketing experts that can help you grow your business. Find marketing resources to generate leads, create more opportunities and close more deals! ");
            test.log(Status.PASS, "Checkout all inclusive section sub-heading text is correct");
            logger.info("Checkout all inclusive section sub-heading text is correct");

        } else {
            test.log(Status.FAIL, "Checkout all inclusive section sub-heading is not displayed");
            logger.error("Checkout all inclusive section sub-heading is not displayed");
        }

        // Validate Register today 2nd button
        if (loginPage.isRegisterToday2ndButtonDisplayed()) {
            test.log(Status.PASS, "Register today 2nd button is displayed");
            logger.info("Register today 2nd button is displayed");
            loginPage.validateTextOfRegisterToday2ndButton("Register today");
            test.log(Status.PASS, "Register today 2nd button text is correct");
            logger.info("Register today 2nd button text is correct");
            loginPage.clickRegisterToday2ndButton();
            test.log(Status.PASS, "Register today 2nd button is clicked");
            logger.info("Register today 2nd button is clicked");
            getDriver().navigate().back();
            test.info("Navigated back to login page");
            logger.info("Navigated back to login page");

        } else {
            test.log(Status.FAIL, "Register today 2nd button is not displayed");
            logger.error("Register today 2nd button is not displayed");
        }

        // Validate Create your own microsite text heading
        if (loginPage.isCreateYourOwnMicrositeHeadingDisplayed()) {
            test.log(Status.PASS, "Create your own microsite text heading is displayed");
            logger.info("Create your own microsite text heading is displayed");
            loginPage.validateTextOfCreateYourOwnMicrositeHeading("Create your own microsite");
            test.log(Status.PASS, "Create your own microsite text heading text is correct");
            logger.info("Create your own microsite text heading text is correct");

        } else {
            test.log(Status.FAIL, "Create your own microsite text heading is not displayed");
            logger.error("Create your own microsite text heading is not displayed");
        }
        // Validate Create your own microsite text sub-heading
        if (loginPage.isCreateYourOwnMicrositeSubHeadingDisplayed()) {
            test.log(Status.PASS, "Create your own microsite text sub-heading is displayed");
            logger.info("Create your own microsite text sub-heading is displayed");
            loginPage.validateTextOfCreateYourOwnMicrositeSubHeading(
                    "Check out our customizable microsite that helps you capitalize on our products.");
            test.log(Status.PASS, "Create your own microsite text sub-heading text is correct");
            logger.info("Create your own microsite text sub-heading text is correct");

        } else {
            test.log(Status.FAIL, "Create your own microsite text sub-heading is not displayed");
            logger.error("Create your own microsite text sub-heading is not displayed");
        }

        // Validate Create your own microsite icon
        if (loginPage.isCreateYourOwnMicrositeIconDisplayed()) {
            test.log(Status.PASS, "Create your own microsite icon is displayed");
            logger.info("Create your own microsite icon is displayed");

        } else {
            test.log(Status.FAIL, "Create your own microsite icon is not displayed");
            logger.error("Create your own microsite icon is not displayed");
        }
        // Validate Customize an email campaign text heading, sub-heading and icon
        if (loginPage.isCustomizeAnEmailCampaignHeadingDisplayed()) {
            test.log(Status.PASS, "Customize an email campaign text heading is displayed");
            logger.info("Customize an email campaign text heading is displayed");
            loginPage.validateTextOfCustomizeAnEmailCampaignHeading("Check out our pre-packaged campaigns, and customize them to start building leads today.");
            test.log(Status.PASS, "Customize an email campaign text heading text is correct");
            logger.info("Customize an email campaign text heading text is correct");

        } else {
            test.log(Status.FAIL, "Customize an email campaign text heading is not displayed");
            logger.error("Customize an email campaign text heading is not displayed");
        }

        // Validate Customize an email campaign text sub-heading
        if (loginPage.isCustomizeAnEmailCampaignSubHeadingDisplayed()) {
            test.log(Status.PASS, "Customize an email campaign text sub-heading is displayed");
            logger.info("Customize an email campaign text sub-heading is displayed");
            loginPage.validateTextOfCustomizeAnEmailCampaignSubHeading("Check out our pre-packaged campaigns, and customize them to start building leads today. ");
            test.log(Status.PASS, "Customize an email campaign text sub-heading text is correct");
            logger.info("Customize an email campaign text sub-heading text is correct");

        } else {
            test.log(Status.FAIL, "Customize an email campaign text sub-heading is not displayed");
            logger.error("Customize an email campaign text sub-heading is not displayed");
        }

        // Validate Customize an email campaign icon
        if (loginPage.isCustomizeAnEmailCampaignIconDisplayed()) {
            test.log(Status.PASS, "Customize an email campaign icon is displayed");
            logger.info("Customize an email campaign icon is displayed");

        } else {
            test.log(Status.FAIL, "Customize an email campaign icon is not displayed");
            logger.error("Customize an email campaign icon is not displayed");
        }

        // Validate Try our co-branded collateral text heading
        if (loginPage.isTryOurCoBrandedCollateralHeadingDisplayed()) {
            test.log(Status.PASS, "Try our co-branded collateral text heading is displayed");
            logger.info("Try our co-branded collateral text heading is displayed");
            loginPage.validateTextOfTryOurCoBrandedCollateralHeading("Try our co-branded collateral");
            test.log(Status.PASS, "Try our co-branded collateral text heading text is correct");
            logger.info("Try our co-branded collateral text heading text is correct");

        } else {
            test.log(Status.FAIL, "Try our co-branded collateral text heading is not displayed");
            logger.error("Try our co-branded collateral text heading is not displayed");
        }

        // Validate Try our co-branded collateral text sub-heading
        if (loginPage.isTryOurCoBrandedCollateralSubHeadingDisplayed()) {
            test.log(Status.PASS, "Try our co-branded collateral text sub-heading is displayed");
            logger.info("Try our co-branded collateral text sub-heading is displayed");
            loginPage.validateTextOfTryOurCoBrandedCollateralSubHeading("Check out all of our pre-made collateral that can be customized to highlight your company.");
            test.log(Status.PASS, "Try our co-branded collateral text sub-heading text is correct");
            logger.info("Try our co-branded collateral text sub-heading text is correct");

        } else {
            test.log(Status.FAIL, "Try our co-branded collateral text sub-heading is not displayed");
            logger.error("Try our co-branded collateral text sub-heading is not displayed");
        }

        // Validate Try our co-branded collateral icon
        if (loginPage.isTryOurCoBrandedCollateralIconDisplayed()) {
            test.log(Status.PASS, "Try our co-branded collateral icon is displayed");
            logger.info("Try our co-branded collateral icon is displayed");

        } else {
            test.log(Status.FAIL, "Try our co-branded collateral icon is not displayed");
            logger.error("Try our co-branded collateral icon is not displayed");
        }
        // Validate Are you generating new, exciting leads? text heading
        if (loginPage.isAreYouGeneratingNewExcitingLeadsHeadingDisplayed()) {
            test.log(Status.PASS, "Are you generating new, exciting leads? text heading is displayed");
            logger.info("Are you generating new, exciting leads? text heading is displayed");
            loginPage.validateTextOfAreYouGeneratingNewExcitingLeadsHeading("Are you generating new, exciting leads?");
            test.log(Status.PASS, "Are you generating new, exciting leads? text heading text is correct");
            logger.info("Are you generating new, exciting leads? text heading text is correct");

        } else {
            test.log(Status.FAIL, "Are you generating new, exciting leads? text heading is not displayed");
            logger.error("Are you generating new, exciting leads? text heading is not displayed");
        }
        // Validate Are you generating new, exciting leads? text sub-heading
        if (loginPage.isAreYouGeneratingNewExcitingLeadsSubHeadingDisplayed()) {
            test.log(Status.PASS, "Are you generating new, exciting leads? text sub-heading is displayed");
            logger.info("Are you generating new, exciting leads? text sub-heading is displayed");
            loginPage.validateTextOfAreYouGeneratingNewExcitingLeadsSubHeading(
                    "Take a look at all we have to offer and find marketing resources to generate leads, create more opportunities and close more deals! ");
            test.log(Status.PASS, "Are you generating new, exciting leads? text sub-heading text is correct");
            logger.info("Are you generating new, exciting leads? text sub-heading text is correct");

        } else {
            test.log(Status.FAIL, "Are you generating new, exciting leads? text sub-heading is not displayed");
            logger.error("Are you generating new, exciting leads? text sub-heading is not displayed");
        }

        // Validate Need help navigating the Portal? text heading and sub-heading
        if (loginPage.isNeedHelpNavigatingThePortalHeadingDisplayed()) {
            test.log(Status.PASS, "Need help navigating the Portal? text heading is displayed");
            logger.info("Need help navigating the Portal? text heading is displayed");
            loginPage.validateTextOfNeedHelpNavigatingThePortalHeading("Need help navigating the Portal?");
            test.log(Status.PASS, "Need help navigating the Portal? text heading text is correct");
            logger.info("Need help navigating the Portal? text heading text is correct");

        } else {
            test.log(Status.FAIL, "Need help navigating the Portal? text heading is not displayed");
            logger.error("Need help navigating the Portal? text heading is not displayed");
        }

        if (loginPage.isNeedHelpNavigatingThePortalSubHeadingDisplayed()) {
            test.log(Status.PASS, "Need help navigating the Portal? text sub-heading is displayed");
            logger.info("Need help navigating the Portal? text sub-heading is displayed");
            loginPage.validateTextOfNeedHelpNavigatingThePortalSubHeading("Our Seclore team is here to assist you with any questions or support you need to make the most of the Partner Portal and achieve your business goals.");
            test.log(Status.PASS, "Need help navigating the Portal? text sub-heading text is correct");
            logger.info("Need help navigating the Portal? text sub-heading text is correct");

        } else {
            test.log(Status.FAIL, "Need help navigating the Portal? text sub-heading is not displayed");
            logger.error("Need help navigating the Portal? text sub-heading is not displayed");
        }


    }

}
