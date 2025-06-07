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

    @Test(priority = 1,description = "Testing if user can navigate to Contact Us page and click on Write To Us link",dataProvider = "wissenUrls",dataProviderClass = WissenDataProvider.class)
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
    public void testContactUsForm(String name, String surname, String position, String company, String email,
            String phone, String reasonOfContact, String message) {
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
            contactUs.validateTextOfContactUsSubHeading(
                    "Please contact us via this form, and we will reply as soon as possible.");
            test.log(Status.PASS, "Contact Us subHeading is displayed");
            logger.info("Contact Us subHeading is displayed");
        } else {
            test.log(Status.FAIL, "Contact Us subHeading is not displayed");
            logger.error("Contact Us subHeading is not displayed");
        }
/*
        //Clicking the submit button to validate alert message
        if (contactUs.isSubmitButtonDisplayed()) {
            contactUs.clickSubmitButton();
            test.log(Status.INFO, "Clicked on Submit button without filling the form");
            logger.info("Clicked on Submit button without filling the form");

        } else {
            test.log(Status.FAIL, "Submit button is not displayed");
            logger.error("Submit button is not displayed");
        }

        // Validating the alert message
        if (contactUs.isAlertBoxDisplayed()) {
            contactUs.validateAlertBoxText("Please fill out this field.");
            test.log(Status.PASS, "Alert message is displayed");
            logger.info("Alert message is displayed");
            contactUs.acceptAlertBox();
        } else {
            test.log(Status.FAIL, "Alert message is not displayed");
            logger.error("Alert message is not displayed");
        }
*/
        // Validating the form fields
        // Name
        if (contactUs.isNameLabelDisplayed()) {
            contactUs.validateTextOfNameLabel("NAME");
            test.log(Status.PASS, "Name label is displayed");
            logger.info("Name label is displayed");
        } else {
            test.log(Status.FAIL, "Name label is not displayed");
            logger.error("Name label is not displayed");
        }

        if (contactUs.isNameInputDisplayed()) {
            contactUs.validatePlaceholderTextOfNameInput("e.g. Julia");
            contactUs.enterName(name);
            test.log(Status.PASS, "Name input is displayed");
            logger.info("Name input is displayed");
        } else {
            test.log(Status.FAIL, "Name input is not displayed");
            logger.error("Name input is not displayed");
        }

        // Surname
        if (contactUs.isSurnameLabelDisplayed()) {
            contactUs.validateTextOfSurnameLabel("SURNAME");
            test.log(Status.PASS, "Surname label is displayed");
            logger.info("Surname label is displayed");
        } else {
            test.log(Status.FAIL, "Surname label is not displayed");
            logger.error("Surname label is not displayed");
        }

        if (contactUs.isSurnameInputDisplayed()) {
            contactUs.validatePlaceholderTextOfSurnameInput("e.g. Smith");
            contactUs.enterSurname(surname);
            test.log(Status.PASS, "Surname input is displayed");
            logger.info("Surname input is displayed");
        } else {
            test.log(Status.FAIL, "Surname input is not displayed");
            logger.error("Surname input is not displayed");
        }

        // Position
        if (contactUs.isPositionLabelDisplayed()) {
            contactUs.validateTextOfPositionLabel("POSITION");
            test.log(Status.PASS, "Position label is displayed");
            logger.info("Position label is displayed");
        } else {
            test.log(Status.FAIL, "Position label is not displayed");
            logger.error("Position label is not displayed");
        }

        if (contactUs.isPositionInputDisplayed()) {
            contactUs.validatePlaceholderTextOfPositionInput("e.g. CFO");
            contactUs.enterPosition(position);
            test.log(Status.PASS, "Position input is displayed");
            logger.info("Position input is displayed");
        } else {
            test.log(Status.FAIL, "Position input is not displayed");
            logger.error("Position input is not displayed");
        }

        // Company
        if (contactUs.isCompanyLabelDisplayed()) {
            contactUs.validateTextOfCompanyLabel("COMPANY");
            test.log(Status.PASS, "Company label is displayed");
            logger.info("Company label is displayed");
        } else {
            test.log(Status.FAIL, "Company label is not displayed");
            logger.error("Company label is not displayed");
        }

        if (contactUs.isCompanyInputDisplayed()) {
            contactUs.validatePlaceholderTextOfCompanyInput("e.g. Papers");
            contactUs.enterCompany(company);
            test.log(Status.PASS, "Company input is displayed");
            logger.info("Company input is displayed");
        } else {
            test.log(Status.FAIL, "Company input is not displayed");
            logger.error("Company input is not displayed");
        }

        // Email
        if (contactUs.isEmailLabelDisplayed()) {
            contactUs.validateTextOfEmailLabel("EMAIL");
            test.log(Status.PASS, "Email label is displayed");
            logger.info("Email label is displayed");
        } else {
            test.log(Status.FAIL, "Email label is not displayed");
            logger.error("Email label is not displayed");
        }

        if (contactUs.isEmailInputDisplayed()) {
            contactUs.validatePlaceholderTextOfEmailInput("e.g.  julia.smith@gmail.com");
            contactUs.enterEmail(email);
            test.log(Status.PASS, "Email input is displayed");
            logger.info("Email input is displayed");
        } else {
            test.log(Status.FAIL, "Email input is not displayed");
            logger.error("Email input is not displayed");
        }

        // Phone
        if (contactUs.isPhoneLabelDisplayed()) {
            contactUs.validateTextOfPhoneLabel("PHONE");
            test.log(Status.PASS, "Phone label is displayed");
            logger.info("Phone label is displayed");
        } else {
            test.log(Status.FAIL, "Phone label is not displayed");
            logger.error("Phone label is not displayed");
        }

        if (contactUs.isPhoneInputDisplayed()) {
            contactUs.validatePlaceholderTextOfPhoneInput("e.g.  555 - 777 - 333");
            contactUs.enterPhone(phone);
            test.log(Status.PASS, "Phone input is displayed");
            logger.info("Phone input is displayed");
        } else {
            test.log(Status.FAIL, "Phone input is not displayed");
            logger.error("Phone input is not displayed");
        }

        // Reason of contact
        if (contactUs.isReasonOfContactLabelDisplayed()) {
            contactUs.validateTextOfReasonOfContactLabel("REASON FOR CONTACT");
            test.log(Status.PASS, "Reason of contact label is displayed");
            logger.info("Reason of contact label is displayed");
        } else {
            test.log(Status.FAIL, "Reason of contact label is not displayed");
            logger.error("Reason of contact label is not displayed");
        }

        if (contactUs.isReasonOfContactInputDisplayed()) {
            contactUs.validatePlaceholderTextOfReasonOfContactInput("Want to avail Saas as a service");
            contactUs.enterReasonOfContact(reasonOfContact);
            test.log(Status.PASS, "Reason of contact input is displayed");
            logger.info("Reason of contact input is displayed");
        } else {
            test.log(Status.FAIL, "Reason of contact input is not displayed");
            logger.error("Reason of contact input is not displayed");
        }

        // Message
        if (contactUs.isMessageLabelDisplayed()) {
            contactUs.validateTextOfMessageLabel("MESSAGE");
            test.log(Status.PASS, "Message label is displayed");
            logger.info("Message label is displayed");
        } else {
            test.log(Status.FAIL, "Message label is not displayed");
            logger.error("Message label is not displayed");
        }

        if (contactUs.isMessageInputDisplayed()) {
            contactUs.validatePlaceholderTextOfMessageInput("Let us know");
            contactUs.enterMessage(message);
            test.log(Status.PASS, "Message input is displayed");
            logger.info("Message input is displayed");
        } else {
            test.log(Status.FAIL, "Message input is not displayed");
            logger.error("Message input is not displayed");
        }

        // I agree
        if (contactUs.isIAgreeLabelDisplayed()) {
            contactUs.validateTextOfIAgreeLabel("I agree with the processing of personal data.");
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

        hardWait(4);

        // Success page
        if (contactUs.isSuccessPageHeadingDisplayed()) {
            contactUs.validateTextOfSuccessPageHeading("Contact Us");
            test.log(Status.PASS, "Success page heading is displayed");
            logger.info("Success page heading is displayed");
        } else {
            test.log(Status.FAIL, "Success page heading is not displayed");
            logger.error("Success page heading is not displayed");
        }

        if (contactUs.isSuccessPageSubHeadingDisplayed()) {
            contactUs.validateTextOfSuccessPageSubHeading(
                    "Please contact us via this form, and we will reply as soon as possible.");
            test.log(Status.PASS, "Success page sub heading is displayed");
            logger.info("Success page sub heading is displayed");
        } else {
            test.log(Status.FAIL, "Success page sub heading is not displayed");
            logger.error("Success page sub heading is not displayed");
        }

        if (contactUs.isSuccessPageMessageDisplayed()) {
            contactUs.validateTextOfSuccessPageMessage("Our team will get back to you with your request to connect.");
            test.log(Status.PASS, "Success page message is displayed");
            logger.info("Success page message is displayed");
        } else {
            test.log(Status.FAIL, "Success page message is not displayed");
            logger.error("Success page message is not displayed");
        }

    }
    
    @Test(priority = 3, description = "Testing if user can navigate to Contact Us page and click on Location")
    public void navigateToLocation() {
        ExtentTest test = extent.createTest("TC_ContactUs_navigateToLocation", "Testing Contact Us page navigation and form submission").assignCategory(moduleName);
        setExtentTest(test);

        // Initialize pages
        HomePage homePage = new HomePage(getDriver());
        ContactUs contactUs = new ContactUs(getDriver());

        // Navigate to Contact Us page
        if (homePage.isContactUsLinkDisplayed()) {
            test.log(Status.PASS, "Contact Us link is displayed");
            logger.info("Contact Us link is displayed");
            homePage.validateTextOfContactUsLink("Contact Us");
            homePage.hoverContactUs();
            // Click on Location link
            if (homePage.isLocationLinkDisplayed()) {
                test.log(Status.PASS, "Location link is displayed");
                logger.info("Location link is displayed");
                homePage.clickLocationLink();
                test.log(Status.INFO, "Clicked on Location link");
                logger.info("Clicked on Location link");
            } else {
                test.log(Status.FAIL, "Location link is not displayed");
                logger.error("Location link is not displayed");
            }
        } else {
            test.log(Status.FAIL, "Contact Us link is not displayed");
            logger.error("Contact Us link is not displayed");
        }

        hardWait(2);
        
        // Verify Location page
        if (contactUs.isLocationHeadingDisplayed()) {
            contactUs.validateTextOfLocationHeading("Location");
            test.log(Status.PASS, "Location heading is displayed");
            logger.info("Location heading is displayed");
        } else {
            test.log(Status.FAIL, "Location heading is not displayed");
            logger.error("Location heading is not displayed");
        }

        if (contactUs.isLocationSubHeadingDisplayed()) {
            contactUs.validateTextOfLocationSubHeading("Wissen has an open, tolerant, merit-driven, and transparent work culture, where we encourage ideas for improvement from all quarters and have even created a democratic space for dissent.");
            test.log(Status.PASS, "Location sub heading is displayed");
            logger.info("Location sub heading is displayed");
        } else {
            test.log(Status.FAIL, "Location sub heading is not displayed");
            logger.error("Location sub heading is not displayed");
        }

        if (contactUs.isWissenGADisplayed()) {
            contactUs.validateTextOfWissenGA("WISSEN – USA (GA)");
            test.log(Status.PASS, "Wissen GA is displayed");
            logger.info("Wissen GA is displayed");
        } else {
            test.log(Status.FAIL, "Wissen GA is not displayed");
            logger.error("Wissen GA is not displayed");
        }

        if(contactUs.isWissenGAAddressDisplayed()) {
            contactUs.validateTextOfWissenGAAddress("12505 Broadwell Rd, Alpharetta, GA 30004, United States");
            test.log(Status.PASS, "Wissen GA address is displayed");
            logger.info("Wissen GA address is displayed");
        } else {
            test.log(Status.FAIL, "Wissen GA address is not displayed");
            logger.error("Wissen GA address is not displayed");
        }
if(contactUs.isWissenWIDisplayed()) {
    contactUs.validateTextOfWissenWI("WISSEN – USA (WI)");
    test.log(Status.PASS, "WissenWI is displayed");
    logger.info("WissenWI is displayed");
} else {
    test.log(Status.FAIL, "WissenWI is not displayed");
    logger.error("WissenWI is not displayed");
}
if(contactUs.isWissenWIAddressDisplayed()) {
    contactUs.validateTextOfWissenWIAddress("2325 Parklawn Drive Suite K Waukesha, Wisconsin 53186, United States");
    test.log(Status.PASS, "WissenWI address is displayed");
    logger.info("WissenWI address is displayed");
} else {
    test.log(Status.FAIL, "WissenWI address is not displayed");
    logger.error("WissenWI address is not displayed");
}
        if(contactUs.isWissenNYDisplayed()) {
            contactUs.validateTextOfWissenNY("WISSEN – USA (NY)");
            test.log(Status.PASS, "WissenNY is displayed");
            logger.info("WissenNY is displayed");
        } else {
            test.log(Status.FAIL, "WissenNY is not displayed");
            logger.error("WissenNY is not displayed");
        }
        if(contactUs.isWissenNYAddressDisplayed()) {
            contactUs.validateTextOfWissenNYAddress("25 Broadway, 9th Floor, New York, NY 10004, United States");
            test.log(Status.PASS, "WissenNY address is displayed");
            logger.info("WissenNY address is displayed");
        } else {
            test.log(Status.FAIL, "WissenNY address is not displayed");
            logger.error("WissenNY address is not displayed");
        }

        if(contactUs.isWissenTxDisplayed()) {
            contactUs.validateTextOfWissenTx("WISSEN – USA (TX)");
            test.log(Status.PASS, "Wissen TX is displayed");
            logger.info("Wissen TX is displayed");
        } else {
            test.log(Status.FAIL, "Wissen TX is not displayed");
            logger.error("Wissen TX is not displayed");
        }

        if (contactUs.isWissenTxAddressDisplayed()) {
            contactUs.validateTextOfWissenTxAddress("5717, Legacy Dr Suite 250 Plano, TX 75024, United States");
            test.log(Status.PASS, "Wissen TX is displayed");
            logger.info("Wissen TX is displayed");
        } else {
            test.log(Status.FAIL, "Wissen TX is not displayed");
            logger.error("Wissen TX is not displayed");
        }

        if(contactUs.isWissenDelhiDisplayed()) {
            contactUs.validateTextOfWissenDelhi("WISSEN – DELHI");
            test.log(Status.PASS, "Wissen Delhi is displayed");
            logger.info("Wissen Delhi is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Delhi is not displayed");
            logger.error("Wissen Delhi is not displayed");
        }

        if(contactUs.isWissenDelhiAddressDisplayed()) {
            contactUs.validateTextOfWissenDelhiAddress("Wework, Cyber City, DLF Forum, DLF Tower 10th Rd, Phase III, Gurugram, Haryana 122002");
            test.log(Status.PASS, "Wissen Delhi address is displayed");
            logger.info("Wissen Delhi address is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Delhi address is not displayed");
            logger.error("Wissen Delhi address is not displayed");
        }

        if(contactUs.isWissenBangaloreDisplayed()) {
            contactUs.validateTextOfWissenBangalore("WISSEN-BANGALORE");
            test.log(Status.PASS, "Wissen Bangalore is displayed");
            logger.info("Wissen Bangalore is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Bangalore is not displayed");
            logger.error("Wissen Bangalore is not displayed");
        }

        if(contactUs.isWissenBangaloreAddressDisplayed()) {
            contactUs.validateTextOfWissenBangaloreAddress("#176, Adarsh Eco Place 4th Floor, KIADB EPIP 2nd Phase Whitefield Bangalore, Karnataka 560066");
            test.log(Status.PASS, "Wissen Bangalore address is displayed");
            logger.info("Wissen Bangalore address is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Bangalore address is not displayed");
            logger.error("Wissen Bangalore address is not displayed");
        }

//        if(contactUs.isWissenMumbaiDisplayed()) {
//            contactUs.validateTextOfWissenMumbai("Wissen Mumbai");
//            test.log(Status.PASS, "Wissen Mumbai is displayed");
//            logger.info("Wissen Mumbai is displayed");
//        } else {
//            test.log(Status.FAIL, "Wissen Mumbai is not displayed");
//            logger.error("Wissen Mumbai is not displayed");
//        }
//
//        if(contactUs.isWissenMumbaiAddressDisplayed()) {
//            contactUs.validateTextOfWissenMumbaiAddress("Wissen Mumbai");
//            test.log(Status.PASS, "Wissen Mumbai address is displayed");
//            logger.info("Wissen Mumbai address is displayed");
//        } else {
//            test.log(Status.FAIL, "Wissen Mumbai address is not displayed");
//            logger.error("Wissen Mumbai address is not displayed");
//        }

        if(contactUs.isWissenPuneDisplayed()) {
            contactUs.validateTextOfWissenPune("WISSEN – PUNE");
            test.log(Status.PASS, "Wissen Pune is displayed");
            logger.info("Wissen Pune is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Pune is not displayed");
            logger.error("Wissen Pune is not displayed");
        }

        if(contactUs.isWissenPuneAddressDisplayed()) {
            contactUs.validateTextOfWissenPuneAddress("Smartworks M Agile, Level 2 Pan card Club Road, Baner, Pune, Maharashtra, 411045");
            test.log(Status.PASS, "Wissen Pune address is displayed");
            logger.info("Wissen Pune address is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Pune address is not displayed");
            logger.error("Wissen Pune address is not displayed");
        }

        if(contactUs.isWissenHyderabadDisplayed()) {
            contactUs.validateTextOfWissenHyderabad("WISSEN-HYDERABAD");
            test.log(Status.PASS, "Wissen Hyderabad is displayed");
            logger.info("Wissen Hyderabad is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Hyderabad is not displayed");
            logger.error("Wissen Hyderabad is not displayed");
        }

        if(contactUs.isWissenHyderabadAddressDisplayed()) {
            contactUs.validateTextOfWissenHyderabadAddress("Q4, 9th Floor, Cyber Towers");
            test.log(Status.PASS, "Wissen Hyderabad address is displayed");
            logger.info("Wissen Hyderabad address is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Hyderabad address is not displayed");
            logger.error("Wissen Hyderabad address is not displayed");
        }

        if(contactUs.isWissenChennaiDisplayed()) {
            contactUs.validateTextOfWissenChennai("WISSEN – CHENNAI");
            test.log(Status.PASS, "Wissen Chennai is displayed");
            logger.info("Wissen Chennai is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Chennai is not displayed");
            logger.error("Wissen Chennai is not displayed");
        }

        if(contactUs.isWissenChennaiAddressDisplayed()) {
            contactUs.validateTextOfWissenChennaiAddress("Awfis Sierra, Plot no. 21, Electrical, Electronics & Instruments industries Perungudi, Sholinganallur, Seevaram, OMR, Chennai, Tamil Nadu 600096");
            test.log(Status.PASS, "Wissen Chennai address is displayed");
            logger.info("Wissen Chennai address is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Chennai address is not displayed");
            logger.error("Wissen Chennai address is not displayed");
        }

        if(contactUs.isWissenCanadaDisplayed()) {
            contactUs.validateTextOfWissenCanada("WISSEN – CANADA");
            test.log(Status.PASS, "Wissen Canada is displayed");
            logger.info("Wissen Canada is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Canada is not displayed");
            logger.error("Wissen Canada is not displayed");
        }

        if(contactUs.isWissenCanadaAddressDisplayed()) {
            contactUs.validateTextOfWissenCanadaAddress("157 Adelaide St W #338, Toronto, ON M5H 1P9");
            test.log(Status.PASS, "Wissen Canada address is displayed");
            logger.info("Wissen Canada address is displayed");
        } else {
            test.log(Status.FAIL, "Wissen Canada address is not displayed");
            logger.error("Wissen Canada address is not displayed");
        }

//        if(contactUs.isWissenUKDisplayed()) {
//            contactUs.validateTextOfWissenUK("Wissen UK");
//            test.log(Status.PASS, "Wissen UK is displayed");
//            logger.info("Wissen UK is displayed");
//        } else {
//            test.log(Status.FAIL, "Wissen UK is not displayed");
//            logger.error("Wissen UK is not displayed");
//        }
//
//        if(contactUs.isWissenUKAddressDisplayed()) {
//            contactUs.validateTextOfWissenUKAddress("Wissen UK");
//            test.log(Status.PASS, "Wissen UK address is displayed");
//            logger.info("Wissen UK address is displayed");
//        } else {
//            test.log(Status.FAIL, "Wissen UK address is not displayed");
//            logger.error("Wissen UK address is not displayed");
//        }

        if(contactUs.isWissenAUDisplayed()) {
            contactUs.validateTextOfWissenAU("WISSEN – AUSTRALIA");
            test.log(Status.PASS, "Wissen AU is displayed");
            logger.info("Wissen AU is displayed");
        } else {
            test.log(Status.FAIL, "Wissen AU is not displayed");
            logger.error("Wissen AU is not displayed");
        }

        if(contactUs.isWissenAUAddressDisplayed()) {
            contactUs.validateTextOfWissenAUAddress("Wissen Australia Pty Ltd, 19/105A Darling Point Road, DARLING POINT NSW 2027");
            test.log(Status.PASS, "Wissen AU address is displayed");
            logger.info("Wissen AU address is displayed");
        } else {
            test.log(Status.FAIL, "Wissen AU address is not displayed");
            logger.error("Wissen AU address is not displayed");
        }

        if(contactUs.isWissenVIDisplayed()) {
            contactUs.validateTextOfWissenVI("WISSEN – VIETNAM");
            test.log(Status.PASS, "Wissen VI is displayed");
            logger.info("Wissen VI is displayed");
        } else {
            test.log(Status.FAIL, "Wissen VI is not displayed");
            logger.error("Wissen VI is not displayed");
        }

        if(contactUs.isWissenVIAddressDisplayed()) {
            contactUs.validateTextOfWissenVIAddress("Marshal Global, Level 21, S-30, Vietcom bank Tower, 5 Me Linh Square, District 1, Ho Chi Minh City");
            test.log(Status.PASS, "Wissen VI address is displayed");
            logger.info("Wissen VI address is displayed");
        } else {
            test.log(Status.FAIL, "Wissen VI address is not displayed");
            logger.error("Wissen VI address is not displayed");
        }

        
    }
}
