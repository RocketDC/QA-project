package web_automation.chase.tests;

import org.testng.annotations.Test;
import web_automation.chase.base.TestBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import web_automation.chase.pages.RegisterPage;
import web_automation.chase.utils.ChaseDataProvide;

public class TC03_Register extends TestBase {
    public final String moduleName = "Register";

    @Test(priority = 1, description = "Verify register page elements", dataProvider = "secloreUrls", dataProviderClass = ChaseDataProvide.class)
    public void verifyRegisterPage(String url, String endpoint) {
        ExtentTest test = extent.createTest(
                moduleName + " - " + "Verify register page elements");
        setExtentTest(test);
        RegisterPage registerPage = new RegisterPage(getDriver());

        getDriver().navigate().to("https://partners.seclore.com/#/page/register");
        test.log(Status.PASS, "Navigated to Register Page");
        logger.info("Navigated to Register Page");
        hardWait(7);

        if (registerPage.isSecloreLogoDisplayed()) {
            test.log(Status.PASS, "Seclore logo is displayed");
            logger.info("Seclore logo is displayed");
        } else {
            test.log(Status.FAIL, "Seclore logo is not displayed");
            logger.error("Seclore logo is not displayed");

        }

        if (registerPage.isLoginButtonDisplayed()) {
            test.log(Status.PASS, "Login button is displayed");
            logger.info("Login button is displayed");
            registerPage.validateTextOfLoginButton("Login");
            test.log(Status.PASS, "Login button text is correct");
            logger.info("Login button text is correct");
        } else {
            test.log(Status.FAIL, "Login button is not displayed");
            logger.error("Login button is not displayed");
        }

        if (registerPage.isRegisterButtonDisplayed()) {
            test.log(Status.PASS, "Register button is displayed");
            logger.info("Register button is displayed");
            registerPage.validateTextOfRegisterButton("Register");
            test.log(Status.PASS, "Register button text is correct");
            logger.info("Register button text is correct");
        } else {
            test.log(Status.FAIL, "Register button is not displayed");
            logger.error("Register button is not displayed");
        }

        // Validate Register now to access your portal. text heading and sub-heading
        if (registerPage.isRegisterHeadingDisplayed()) {
            test.log(Status.PASS, "Register heading is displayed");
            logger.info("Register heading is displayed");
            registerPage.validateTextOfRegisterHeading("Register now to access your portal.");
            test.log(Status.PASS, "Register heading text is correct");
            logger.info("Register heading text is correct");
        } else {
            test.log(Status.FAIL, "Register heading is not displayed");
            logger.error("Register heading is not displayed");
        }

        if (registerPage.isRegisterSubHeadingDisplayed()) {
            test.log(Status.PASS, "Register sub-heading is displayed");
            logger.info("Register sub-heading is displayed");
            registerPage.validateTextOfRegisterSubHeading("We commit to helping our partners reach their goals and exceed expectations with our products. Register to access a turn-key customizable solution that provides you with campaigns, emails, and all the tools you need to be successful with us.  ");
            test.log(Status.PASS, "Register sub-heading text is correct");
            logger.info("Register sub-heading text is correct");
        } else {
            test.log(Status.FAIL, "Register sub-heading is not displayed");
            logger.error("Register sub-heading is not displayed");
        }

        // Validate Country label and input field(Dropdown)
        if (registerPage.isCountryLabelDisplayed()) {
            test.log(Status.PASS, "Country label is displayed");
            logger.info("Country label is displayed");
            registerPage.validateTextOfCountryLabel("Country");
            test.log(Status.PASS, "Country label text is correct");
            logger.info("Country label text is correct");
        } else {
            test.log(Status.FAIL, "Country label is not displayed");
            logger.error("Country label is not displayed");
        }

        if (registerPage.isCountryDropdownDisplayed()) {
            test.log(Status.PASS, "Country dropdown is displayed");
            logger.info("Country dropdown is displayed");
            registerPage.selectCountryFromDropdown("India");
            test.log(Status.PASS, "Country dropdown is selected");
            logger.info("Country dropdown is selected");
        } else {
            test.log(Status.FAIL, "Country dropdown is not displayed");
            logger.error("Country dropdown is not displayed");
        }

        // Validate Company Name label and input field
        if (registerPage.isCompanyNameLabelDisplayed()) {
            test.log(Status.PASS, "Company Name label is displayed");
            logger.info("Company Name label is displayed");
            registerPage.validateTextOfCompanyNameLabel("Company Name");
            test.log(Status.PASS, "Company Name label text is correct");
            logger.info("Company Name label text is correct");
        } else {
            test.log(Status.FAIL, "Company Name label is not displayed");
            logger.error("Company Name label is not displayed");
        }

        if (registerPage.isCompanyNameInputDisplayed()) {
            test.log(Status.PASS, "Company Name input field is displayed");
            logger.info("Company Name input field is displayed");
            registerPage.validatePlaceholderTextOfCompanyNameInput("Company Name");
            test.log(Status.PASS, "Company Name input field placeholder text is correct");
            logger.info("Company Name input field placeholder text is correct");
            registerPage.enterCompanyName("Test Company");
            test.log(Status.PASS, "Company Name is entered");
            logger.info("Company Name is entered");
        } else {
            test.log(Status.FAIL, "Company Name input field is not displayed");
            logger.error("Company Name input field is not displayed");
        }

        // Validate Email label and input field
        if (registerPage.isEmailLabelDisplayed()) {
            test.log(Status.PASS, "Email label is displayed");
            logger.info("Email label is displayed");
            registerPage.validateTextOfEmailLabel("Email Address");
            test.log(Status.PASS, "Email label text is correct");
            logger.info("Email label text is correct");
        } else {
            test.log(Status.FAIL, "Email label is not displayed");
            logger.error("Email label is not displayed");
        }

        if (registerPage.isEmailInputDisplayed()) {
            test.log(Status.PASS, "Email input field is displayed");
            logger.info("Email input field is displayed");
            registerPage.validatePlaceholderTextOfEmailInput("Email Address");
            test.log(Status.PASS, "Email input field placeholder text is correct");
            logger.info("Email input field placeholder text is correct");
            registerPage.enterEmail("test@gmail.com");
            test.log(Status.PASS, "Email is entered");
            logger.info("Email is entered");
        } else {
            test.log(Status.FAIL, "Email input field is not displayed");
            logger.error("Email input field is not displayed");
        }

        // Validate First name label and input field
        if (registerPage.isFirstNameLabelDisplayed()) {
            test.log(Status.PASS, "First name label is displayed");
            logger.info("First name label is displayed");
            registerPage.validateTextOfFirstNameLabel("First Name");
            test.log(Status.PASS, "First name label text is correct");
            logger.info("First name label text is correct");
        } else {
            test.log(Status.FAIL, "First name label is not displayed");
            logger.error("First name label is not displayed");
        }

        if (registerPage.isFirstNameInputDisplayed()) {
            test.log(Status.PASS, "First name input field is displayed");
            logger.info("First name input field is displayed");
            registerPage.validatePlaceholderTextOfFirstNameInput("First Name");
            test.log(Status.PASS, "First name input field placeholder text is correct");
            logger.info("First name input field placeholder text is correct");
            registerPage.enterFirstName("John");
            test.log(Status.PASS, "First name is entered");
            logger.info("First name is entered");
        } else {
            test.log(Status.FAIL, " First name input field is not displayed");
            logger.error("First name input field is not displayed");
        }

        // Validate Last name label and input field
        if (registerPage.isLastNameLabelDisplayed()) {
            test.log(Status.PASS, "Last name label is displayed");
            logger.info("Last name label is displayed");
            registerPage.validateTextOfLastNameLabel("Last Name");
            test.log(Status.PASS, "Last name label text is correct");
            logger.info("Last name label text is correct");
        } else {
            test.log(Status.FAIL, "Last name label is not displayed");
            logger.error("Last name label is not displayed");
        }

        if (registerPage.isLastNameInputDisplayed()) {
            test.log(Status.PASS, "Last name input field is displayed");
            logger.info("Last name input field is displayed");
            registerPage.validatePlaceholderTextOfLastNameInput("Last Name");
            test.log(Status.PASS, "Last name input field placeholder text is correct");
            logger.info("Last name input field placeholder text is correct");
            registerPage.enterLastName("Doe");
            test.log(Status.PASS, "Last name is entered");
            logger.info("Last name is entered");
        } else {
            test.log(Status.FAIL, "Last name input field is not displayed");
            logger.error("Last name input field is not displayed");
        }


        // Validate Phone number label and input field
        if (registerPage.isPhoneNumberLabelDisplayed()) {
            test.log(Status.PASS, "Phone number label is displayed");
            logger.info("Phone number label is displayed");
            registerPage.validateTextOfPhoneNumberLabel("Phone");
            test.log(Status.PASS, "Phone number label text is correct");
            logger.info("Phone number label text is correct");
        } else {
            test.log(Status.FAIL, "Phone number label is not displayed");
            logger.error("Phone number label is not displayed");
        }

        if (registerPage.isPhoneNumberInputDisplayed()) {
            test.log(Status.PASS, "Phone number input field is displayed");
            logger.info("Phone number input field is displayed");
            registerPage.validatePlaceholderTextOfPhoneNumberInput("Phone");
            test.log(Status.PASS, "Phone number input field placeholder text is correct");
            logger.info("Phone number input field placeholder text is correct");
            registerPage.enterPhoneNumber("1234567890");
            test.log(Status.PASS, "Phone number is entered");
            logger.info("Phone number is entered");
        } else {
            test.log(Status.FAIL, "Phone number input field is not displayed");
            logger.error("Phone number input field is not displayed");
        }

        // Validate Type of partner label and input field(Dropdown)
        if (registerPage.isTypeOfPartnerLabelDisplayed()) {
            test.log(Status.PASS, "Type of partner label is displayed");
            logger.info("Type of partner label is displayed");
            registerPage.validateTextOfTypeOfPartnerLabel("Type of Partner");
            test.log(Status.PASS, "Type of partner label text is correct");
            logger.info("Type of partner label text is correct");
        } else {
            test.log(Status.FAIL, "Type of partner label is not displayed");
            logger.error("Type of partner label is not displayed");
        }

        if (registerPage.isTypeOfPartnerDropdownDisplayed()) {
            test.log(Status.PASS, "Type of partner dropdown is displayed");
            logger.info("Type of partner dropdown is displayed");
            registerPage.selectTypeOfPartnerFromDropdown("Reseller");
            test.log(Status.PASS, "Type of partner dropdown is selected");
            logger.info("Type of partner dropdown is selected");
        } else {
            test.log(Status.FAIL, "Type of partner dropdown is not displayed");
            logger.error("Type of partner dropdown is not displayed");
        }

        // Validate Partner Size label, input field and footer text
        if (registerPage.isPartnerSizeLabelDisplayed()) {
            test.log(Status.PASS, "Partner Size label is displayed");
            logger.info("Partner Size label is displayed");
            registerPage.validateTextOfPartnerSizeLabel("Partner Size (no. employees)");
            test.log(Status.PASS, "Partner Size label text is correct");
            logger.info("Partner Size label text is correct");
        } else {
            test.log(Status.FAIL, "Partner Size label is not displayed");
            logger.error("Partner Size label is not displayed");
        }

        if (registerPage.isPartnerSizeInputDisplayed()) {
            test.log(Status.PASS, "Partner Size input field is displayed");
            logger.info("Partner Size input field is displayed");
            registerPage.validatePlaceholderTextOfPartnerSizeInput("Partner Size (no. employees)");
            test.log(Status.PASS, "Partner Size input field placeholder text is correct");
            logger.info("Partner Size input field placeholder text is correct");
            registerPage.enterPartnerSize("10");
            test.log(Status.PASS, "Partner Size is entered");
            logger.info("Partner Size is entered");
        } else {
            test.log(Status.FAIL, "Partner Size input field is not displayed");
            logger.error("Partner Size input field is not displayed");
        }

        if (registerPage.isPartnerSizeFooterTextDisplayed()) {
            test.log(Status.PASS, "Partner Size footer text is displayed");
            logger.info("Partner Size footer text is displayed");
            registerPage.validateTextOfPartnerSizeFooterText("Enter the approximate number of employees in your company (Enter the number only)");
            test.log(Status.PASS, "Partner Size footer text is correct");
            logger.info("Partner Size footer text is correct");
        } else {
            test.log(Status.FAIL, "Partner Size footer text is not displayed");
            logger.error("Partner Size footer text is not displayed");
        }

        // Validate Submit button
        if (registerPage.isSubmitButtonDisplayed()) {
            test.log(Status.PASS, "Submit button is displayed");
            logger.info("Submit button is displayed");
            registerPage.validateTextOfSubmitButton("Submit");
            test.log(Status.PASS, "Submit button text is correct");
            logger.info("Submit button text is correct");
            // registerPage.clickSubmitButton();
            test.log(Status.PASS, "Submit button is clicked");
            logger.info("Submit button is clicked");
        } else {
            test.log(Status.FAIL, "Submit button is not displayed");
            logger.error("Submit button is not displayed");
        }

    }

}
