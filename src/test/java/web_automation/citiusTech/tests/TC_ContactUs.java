package web_automation.citiusTech.tests;

import org.testng.annotations.Test;
import web_automation.citiusTech.base.TestBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import web_automation.citiusTech.pages.ContactUs;
import web_automation.citiusTech.pages.HomePage;
import web_automation.citiusTech.utils.CitiusTechDataProvider;

public class TC_ContactUs extends TestBase{
public final String moduleName = "Contact Us";
    //Opening Contact Us page
    @Test(priority = 1,dataProvider = "citiusTechUrl",dataProviderClass = CitiusTechDataProvider.class)
    public void testingHomePageNAV(String url, String path) {
        ExtentTest test = extent.createTest("TC" + getClass() + "testHomePageNAV", "Opening Contact Us page").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());
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
        // Accepting cookies
        hardWait(5);
        if (homePage.cookieBannerIsDisplayed()) {
            test.log(Status.PASS, "Cookie banner is displayed");
            logger.info("Cookie banner is displayed");
            if (homePage.cookieBannerAcceptButtonIsDisplayed()) {
                test.log(Status.PASS, "Cookie banner accept button is displayed");
                logger.info("Cookie banner accept button is displayed");
                homePage.clickCookieBannerAcceptButton();
                test.log(Status.PASS, "Cookie banner accept button is clicked");
                logger.info("Cookie banner accept button is clicked");
            } else {
                test.log(Status.FAIL, "Cookie banner accept button is not displayed");
                logger.info("Cookie banner accept button is not displayed");
            }
        } else {
            test.log(Status.FAIL, "Cookie banner is not displayed");
            logger.info("Cookie banner is not displayed");
        }
// Validating the presence of What we do nav test
        if( homePage.whatWeDoNavIsDisplayed()) {
            test.log(Status.PASS, "What we do nav is displayed");
            logger.info("What we do nav is displayed");
            homePage.validateTextOfWhatWeDoNav("What we do");
            homePage.hoverWhatWeDoNav();
            if( homePage.setWhatWeDoNavHeadingIsDisplayed()) {
                test.log(Status.PASS, "What we do nav text is displayed");
                logger.info("What we do nav text is displayed");
                homePage.validateTextOfWhatWeDoNavHeading("What we do");
            } else {
                test.log(Status.FAIL, "What we do nav text is not displayed");
                logger.info("What we do nav text is not displayed");
            }

        } else {
            test.log(Status.FAIL, "What we do nav is not displayed");
            logger.info("What we do nav is not displayed");
        }

// Validating the presence of Who we are nav test
        if( homePage.whoWeAreNavIsDisplayed()) {
            test.log(Status.PASS, "Who We Are nav is displayed");
            logger.info("Who We Are nav is displayed");
            homePage.validateTextOfWhoWeAreNav("Who we are");
            homePage.hoverWhoWeAreNav();
            if( homePage.whoWeAreNavHeadingIsDisplayed()) {
                test.log(Status.PASS, "Who We Are nav text is displayed");
                logger.info("Who We Are nav text is displayed");
                homePage.validateTextOfWhoWeAreNavHeading("Who we are");
            } else {
                test.log(Status.FAIL, "Who We Are nav text is not displayed");
                logger.info("Who We Are nav text is not displayed");
            }

        } else {
            test.log(Status.FAIL, "Who We Are nav is not displayed");
            logger.info("Who We Are nav is not displayed");
        }

// Validating the presence of What We Think nav test
        if( homePage.whatWeThinkNavIsDisplayed()) {
            test.log(Status.PASS, "What We Think nav is displayed");
            logger.info("What We Think nav is displayed");
            homePage.validateTextOfWhatWeThinkNav("What we think");
            homePage.hoverWhatWeThinkNav();
            if( homePage.whatWeThinkNavHeadingIsDisplayed()) {
                test.log(Status.PASS, "What We Think nav text is displayed");
                logger.info("What We Think nav text is displayed");
                homePage.validateTextOfWhatWeThinkNavHeading("What we think");
            } else {
                test.log(Status.FAIL, "What We Think nav text is not displayed");
                logger.info("What We Think nav text is not displayed");
            }

        } else {
            test.log(Status.FAIL, "What We Think nav is not displayed");
            logger.info("What We Think nav is not displayed");
        }
// Validating the presence of Partners nav test
        if( homePage.partnersNavIsDisplayed()) {
            test.log(Status.PASS, "Partners nav is displayed");
            logger.info("Partners nav is displayed");
            homePage.validateTextOfPartnersNav("Partners");
            homePage.hoverPartnersNav();
            if( homePage.partnersNavHeadingIsDisplayed()) {
                test.log(Status.PASS, "Partners nav text is displayed");
                logger.info("Partners nav text is displayed");
                homePage.validateTextOfPartnersNavHeading("Partners");
            } else {
                test.log(Status.FAIL, "Partners nav text is not displayed");
                logger.info("Partners nav text is not displayed");
            }

        } else {
            test.log(Status.FAIL, "Partners nav is not displayed");
            logger.info("Partners nav is not displayed");
        }
    // Validating the presence of Careers nav test
        if( homePage.careersNavIsDisplayed()) {
            test.log(Status.PASS, "Careers nav is displayed");
            logger.info("Careers nav is displayed");
            homePage.validateTextOfCareersNav("Careers");
            homePage.clickCareersNav();
            if( homePage.hiringScamAlertBoxIsDisplayed()) {
                test.log(Status.PASS, "Hiring Scam Alert box is displayed");
                logger.info("Hiring Scam Alert box is displayed");

            } else {
                test.log(Status.FAIL, "Hiring Scam Alert box is not displayed");
                logger.info("Hiring Scam Alert box is not displayed");
            }

        } else {
            test.log(Status.FAIL, "Careers nav is not displayed");
            logger.info("Careers nav is not displayed");
        }
        if (homePage.contactUsNavIsDisplayed()) {
            test.log(Status.PASS, "Contact Us nav is displayed");
            logger.info("Contact Us nav is displayed");
            homePage.validateTextOfContactUsNav("Contact");
            homePage.clickContactUsNav();


        } else {
            test.log(Status.FAIL, "Contact Us nav is not displayed");
            logger.info("Contact Us nav is not displayed");
        }
        // Navigating to Contact Us page
        getDriver().navigate().to(url + path);
        test.log(Status.INFO, "Navigated to Contact Us page: " + url + path);
        logger.info("Navigated to Contact Us page: " + url + path);
        
    }

    // Testing Contact Us page elements
    @Test(priority = 2, dependsOnMethods = "testingHomePageNAV", dataProvider = "citiusTechData", dataProviderClass = CitiusTechDataProvider.class)
    public void testContactUsPageElements(String url, String path) {
        ExtentTest test = extent.createTest("TC" + getClass() + "testContactUsPageElements", "Testing Contact Us page elements").assignCategory(moduleName);
        setExtentTest(test);
        ContactUs contactUs = new ContactUs(getDriver());

        // Validating the presence of Citius Tech logo
        if (contactUs.citiusTechLogoIsDisplayed()) {
            test.log(Status.PASS, "Citius Tech logo is displayed");
            logger.info("Citius Tech logo is displayed");
        } else {
            test.log(Status.FAIL, "Citius Tech logo is not displayed");
            logger.info("Citius Tech logo is not displayed");
        }

        // Validating the presence of Contact Us button
        if (contactUs.contactUsNavIsDisplayed()) {
            test.log(Status.PASS, "Contact Us button is displayed");
            logger.info("Contact Us button is displayed");
            contactUs.validateTextOfContactUsNav("Contact");
            contactUs.clickContactUsNav();
        } else {
            test.log(Status.FAIL, "Contact Us button is not displayed");
            logger.info("Contact Us button is not displayed");
        }

        // Validating the presence of Contact Us heading
        if (contactUs.contactUsHeadingIsDisplayed()) {
            test.log(Status.PASS, "Contact Us heading is displayed");
            logger.info("Contact Us heading is displayed");
            contactUs.validateTextOfContactUsHeading("Contact us for Healthcare IT Services & Solutions");
        } else {
            test.log(Status.FAIL, "Contact Us heading is not displayed");
            logger.info("Contact Us heading is not displayed");
        }
        // Validating the presence of Contact Us subheading
        if (contactUs.contactUsSubheadingIsDisplayed()) {
            test.log(Status.PASS, "Contact Us subheading is displayed");
            logger.info("Contact Us subheading is displayed");
            contactUs.validateTextOfContactUsSubheading("Learn about our products and services, send a media inquiry, search for open positions, explore partnership opportunities, and more.");
        } else {
            test.log(Status.FAIL, "Contact Us subheading is not displayed");
            logger.info("Contact Us subheading is not displayed");
        }

        // Validating get in touch heading
        if (contactUs.getInTouchHeadingIsDisplayed()) {
            test.log(Status.PASS, "Get in Touch heading is displayed");
            logger.info("Get in Touch heading is displayed");
            contactUs.validateTextOfGetInTouchHeading("Get in touch");
        } else {
            test.log(Status.FAIL, "Get in Touch heading is not displayed");
            logger.info("Get in Touch heading is not displayed");
        }
        // Validating the presence of Get in Touch subheading
        if (contactUs.getInTouchSubheadingIsDisplayed()) {
            test.log(Status.PASS, "Get in Touch subheading is displayed");
            logger.info("Get in Touch subheading is displayed");
            contactUs.validateTextOfGetInTouchSubheading("For any queries feel free to contact us and our expert support team will get back to you as soon as possible!");
        } else {
            test.log(Status.FAIL, "Get in Touch subheading is not displayed");
            logger.info("Get in Touch subheading is not displayed");
        }
        // Validating write to us heading
        if (contactUs.writeToUsLabelIsDisplayed()) {
            test.log(Status.PASS, "Write to Us heading is displayed");
            logger.info("Write to Us heading is displayed");
            contactUs.validateTextOfWriteToUsLabel("WRITE TO US");
        } else {
            test.log(Status.FAIL, "Write to Us heading is not displayed");
            logger.info("Write to Us heading is not displayed");
        }



    }

}
