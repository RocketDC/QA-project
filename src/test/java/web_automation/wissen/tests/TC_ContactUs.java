package web_automation.wissen.tests;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import web_automation.wissen.base.TestBase;
import web_automation.wissen.pages.ContactUs;
import web_automation.wissen.pages.HomePage;
import web_automation.wissen.utils.WissenDataProvider;

public class TC_ContactUs extends TestBase {
    public final String moduleName = "Contact Us";

    @Test(priority = 1,description = "Testing if user can navigate to Contact Us page and click on Write To Us link")
    public void testContactUsNavigation(String url) {
        ExtentTest test = extent
                .createTest("TC_ContactUs_testContactUsNavigation",
                        "Testing Contact Us page navigation and form submission")
                .assignCategory(moduleName);
        setExtentTest(test);

        // Initialize pages
        HomePage homePage = new HomePage(getDriver());

        // Navigate to home page
        getDriver().get(url);
        test.log(Status.INFO, "Navigated to home page");
        logger.info("Navigated to home page");

        // Verify home page elements
        if (homePage.isWissenLogoDisplayed()) {
            test.log(Status.PASS, "Wissen logo is displayed");
            logger.info("Wissen logo is displayed");
        } else {
            test.log(Status.FAIL, "Wissen logo is not displayed");
            logger.error("Wissen logo is not displayed");
        }

        // Navigate to Contact Us page
        if (homePage.isContactUsLinkDisplayed()) {
            test.log(Status.PASS, "Contact Us link is displayed");
            logger.info("Contact Us link is displayed");
            homePage.validateTextOfContactUsLink("Contact Us");
            homePage.hoverContactUs();
            if (homePage.isWriteToUsLinkDisplayed()) {
                test.log(Status.PASS, "Write To Us link is displayed");
                logger.info("Write To Us link is displayed");
                homePage.clickWriteToUs();
                test.log(Status.INFO, "Clicked on Write To Us link");
                logger.info("Clicked on Write To Us link");
            } else {
                test.log(Status.FAIL, "Write To Us link is not displayed");
                logger.error("Write To Us link is not displayed");
            }
        } else {
            test.log(Status.FAIL, "Contact Us link is not displayed");
            logger.error("Contact Us link is not displayed");
        }

    }
    
    @Test(priority = 2,description = "Testing if user can fill the contact us form and submit",dataProvider = "wissenData",dataProviderClass = WissenDataProvider.class,dependsOnMethods = "testContactUsNavigation")
    public void testContactUsForm(String url, String name,String surname, String position, String company, String reasonOfContact, String email, String phone, String message) {
        ExtentTest test = extent
                .createTest("TC_ContactUs_testContactUsForm",
                        "Testing Contact Us page navigation and form submission")
                .assignCategory(moduleName);
        setExtentTest(test);

        // Initialize pages
        ContactUs contactUs = new ContactUs(getDriver());

        // Validating the heading and subHeading contact us
        if (contactUs.isContactUsHeadingDisplayed()) {
            contactUs.validateTextOfContactUsHeading("Contact Us");
            test.log(Status.PASS, "Contact Us heading is displayed");
            logger.info("Contact Us heading is displayed");
        } else {
            test.log(Status.FAIL, "Contact Us heading is not displayed");
            logger.error("Contact Us heading is not displayed");
        }

        if (contactUs.isContactUsSubHeadingDisplayed()) {
            contactUs.validateTextOfContactUsSubHeading("Please contact us via this form, and we will reply as soon as possible.");
            test.log(Status.PASS, "Contact Us subHeading is displayed");
            logger.info("Contact Us subHeading is displayed");
        } else {
            test.log(Status.FAIL, "Contact Us subHeading is not displayed");
            logger.error("Contact Us subHeading is not displayed");
        }

        // Validating the form fields
        // Name
        if (contactUs.isNameLabelDisplayed()) {
            contactUs.validateTextOfNameLabel("Name");
            test.log(Status.PASS, "Name label is displayed");
            logger.info("Name label is displayed");
        } else {
            test.log(Status.FAIL, "Name label is not displayed");
            logger.error("Name label is not displayed");
        }

        if (contactUs.isNameInputDisplayed()) {
            contactUs.validatePlaceholderTextOfNameInput("Name");
            contactUs.enterName(name);
            test.log(Status.PASS, "Name input is displayed");
            logger.info("Name input is displayed");
        } else {
            test.log(Status.FAIL, "Name input is not displayed");
            logger.error("Name input is not displayed");
        }

        // Surname
        if (contactUs.isSurnameLabelDisplayed()) {
            contactUs.validateTextOfSurnameLabel("Surname");
            test.log(Status.PASS, "Surname label is displayed");
            logger.info("Surname label is displayed");
        } else {
            test.log(Status.FAIL, "Surname label is not displayed");
            logger.error("Surname label is not displayed");
        }

        if (contactUs.isSurnameInputDisplayed()) {
            contactUs.validatePlaceholderTextOfSurnameInput("Surname");
            contactUs.enterSurname(surname);
            test.log(Status.PASS, "Surname input is displayed");
            logger.info("Surname input is displayed");
        } else {
            test.log(Status.FAIL, "Surname input is not displayed");
            logger.error("Surname input is not displayed");
        }

        // Position
        if (contactUs.isPositionLabelDisplayed()) {
            contactUs.validateTextOfPositionLabel("Position");
            test.log(Status.PASS, "Position label is displayed");
            logger.info("Position label is displayed");
        } else {
            test.log(Status.FAIL, "Position label is not displayed");
            logger.error("Position label is not displayed");
        }

        if (contactUs.isPositionInputDisplayed()) {
            contactUs.validatePlaceholderTextOfPositionInput("Position");
            contactUs.enterPosition(position);
            test.log(Status.PASS, "Position input is displayed");
            logger.info("Position input is displayed");
        } else {
            test.log(Status.FAIL, "Position input is not displayed");
            logger.error("Position input is not displayed");
        }

        // Company
        if (contactUs.isCompanyLabelDisplayed()) {
            contactUs.validateTextOfCompanyLabel("Company");
            test.log(Status.PASS, "Company label is displayed");
            logger.info("Company label is displayed");
        } else {
            test.log(Status.FAIL, "Company label is not displayed");
            logger.error("Company label is not displayed");
        }

        if (contactUs.isCompanyInputDisplayed()) {
            contactUs.validatePlaceholderTextOfCompanyInput("Company");
            contactUs.enterCompany(company);
            test.log(Status.PASS, "Company input is displayed");
            logger.info("Company input is displayed");
        } else {
            test.log(Status.FAIL, "Company input is not displayed");
            logger.error("Company input is not displayed");
        }

        // Email
        if (contactUs.isEmailLabelDisplayed()) {
            contactUs.validateTextOfEmailLabel("Email");
            test.log(Status.PASS, "Email label is displayed");
            logger.info("Email label is displayed");
        } else {
            test.log(Status.FAIL, "Email label is not displayed");
            logger.error("Email label is not displayed");
        }

        if (contactUs.isEmailInputDisplayed()) {
            contactUs.validatePlaceholderTextOfEmailInput("Email");
            contactUs.enterEmail(email);
            test.log(Status.PASS, "Email input is displayed");
            logger.info("Email input is displayed");
        } else {
            test.log(Status.FAIL, "Email input is not displayed");
            logger.error("Email input is not displayed");
        }

        // Phone
        if (contactUs.isPhoneLabelDisplayed()) {
            contactUs.validateTextOfPhoneLabel("Phone");
            test.log(Status.PASS, "Phone label is displayed");
            logger.info("Phone label is displayed");
        } else {
            test.log(Status.FAIL, "Phone label is not displayed");
            logger.error("Phone label is not displayed");
        }

        if (contactUs.isPhoneInputDisplayed()) {
            contactUs.validatePlaceholderTextOfPhoneInput("Phone");
            contactUs.enterPhone(phone);
            test.log(Status.PASS, "Phone input is displayed");
            logger.info("Phone input is displayed");
        } else {
            test.log(Status.FAIL, "Phone input is not displayed");
            logger.error("Phone input is not displayed");
        }

        // Reason of contact
        if (contactUs.isReasonOfContactLabelDisplayed()) {
            contactUs.validateTextOfReasonOfContactLabel("Reason of contact");
            test.log(Status.PASS, "Reason of contact label is displayed");
            logger.info("Reason of contact label is displayed");
        } else {
            test.log(Status.FAIL, "Reason of contact label is not displayed");
            logger.error("Reason of contact label is not displayed");
        }

        if (contactUs.isReasonOfContactInputDisplayed()) {
            contactUs.validatePlaceholderTextOfReasonOfContactInput("Reason of contact");
            contactUs.enterReasonOfContact(reasonOfContact);
            test.log(Status.PASS, "Reason of contact input is displayed");
            logger.info("Reason of contact input is displayed");
        } else {
            test.log(Status.FAIL, "Reason of contact input is not displayed");
            logger.error("Reason of contact input is not displayed");
        }

        // Message
        if (contactUs.isMessageLabelDisplayed()) {
            contactUs.validateTextOfMessageLabel("Message");
            test.log(Status.PASS, "Message label is displayed");
            logger.info("Message label is displayed");
        } else {
            test.log(Status.FAIL, "Message label is not displayed");
            logger.error("Message label is not displayed");
        }

        if (contactUs.isMessageInputDisplayed()) {
            contactUs.validatePlaceholderTextOfMessageInput("Message");
            contactUs.enterMessage(message);
            test.log(Status.PASS, "Message input is displayed");
            logger.info("Message input is displayed");
        } else {
            test.log(Status.FAIL, "Message input is not displayed");
            logger.error("Message input is not displayed");
        }

        // I agree
        if (contactUs.isIAgreeLabelDisplayed()) {
            contactUs.validateTextOfIAgreeLabel("I agree");
            test.log(Status.PASS, "I agree label is displayed");
            logger.info("I agree label is displayed");
        } else {
            test.log(Status.FAIL, "I agree label is not displayed");
            logger.error("I agree label is not displayed");
        }

        if (contactUs.isIAgreeCheckboxDisplayed()) {
            contactUs.clickIAgreeCheckbox();
            test.log(Status.PASS, "I agree checkbox is displayed");
            logger.info("I agree checkbox is displayed");
        } else {
            test.log(Status.FAIL, "I agree checkbox is not displayed");
            logger.error("I agree checkbox is not displayed");
        }

        // Submit button
        if (contactUs.isSubmitButtonDisplayed()) {
            contactUs.validateTextOfSubmitButton("Submit");
            contactUs.clickSubmitButton();
            test.log(Status.PASS, "Submit button is displayed");
            logger.info("Submit button is displayed");
        } else {
            test.log(Status.FAIL, "Submit button is not displayed");
            logger.error("Submit button is not displayed");
        }

        // Success message
        if (contactUs.isSuccessMessageDisplayed()) {
            contactUs.validateTextOfSuccessMessage("Success");
            test.log(Status.PASS, "Success message is displayed");
            logger.info("Success message is displayed");
        } else {
            test.log(Status.FAIL, "Success message is not displayed");
            logger.error("Success message is not displayed");
        }

    }
}
