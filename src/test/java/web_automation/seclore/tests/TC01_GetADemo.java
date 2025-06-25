package web_automation.seclore.tests;

import org.testng.annotations.Test;
import web_automation.seclore.base.TestBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import web_automation.seclore.pages.HomePage;
import web_automation.seclore.pages.GetADemoPage;
import web_automation.seclore.utils.SecloreDataProvider;

public class TC01_GetADemo extends TestBase{
    public final String moduleName = "Get A Demo";
    
    //Test case 1: Verify that the Get a Demo button and nav buttons are displayed on the homepage
@Test(priority = 1, description = "Verify that the Get a Demo button and nav buttons are displayed on the homepage", dataProvider = "secloreUrls", dataProviderClass = SecloreDataProvider.class)
public void verifyGetADemoButtonAndNavButtonsAreDisplayed(String url, String endpoint) {
    ExtentTest test = extent
            .createTest("TC" + getClass() + "_verifyGetADemoButtonAndNavButtonsAreDisplayed",
                    "Verify that the Get a Demo button and nav buttons are displayed on the homepage")
            .assignCategory(moduleName);
    setExtentTest(test);
    getDriver().get(url + endpoint);
    HomePage homePage = new HomePage(getDriver());

    if (homePage.logoSecloreIsDisplayed()) {
        test.log(Status.PASS, "Logo is displayed");
        logger.info("Logo is displayed");
    } else {
        test.log(Status.FAIL, "Logo is not displayed");
        logger.error("Logo is not displayed");
    }

    if (homePage.navPlatformIsDisplayed()) {
        test.log(Status.PASS, "Platform is displayed");
        logger.info("Platform is displayed");
        homePage.validateTextOfNavPlatform("Platform");
        test.log(Status.PASS, "Platform text is correct");
        logger.info("Platform text is correct");
        homePage.hoverNavPlatform();
        test.log(Status.PASS, "Platform is hovered");
        logger.info("Platform is hovered");
    } else {
        test.log(Status.FAIL, "Platform is not displayed");
        logger.error("Platform is not displayed");
    }

    if (homePage.navSolutionsIsDisplayed()) {
        test.log(Status.PASS, "Solutions is displayed");
        logger.info("Solutions is displayed");
        homePage.validateTextOfNavSolutions("Solutions");
        test.log(Status.PASS, "Solutions text is correct");
        logger.info("Solutions text is correct");
        homePage.hoverNavSolutions();
        test.log(Status.PASS, "Solutions is hovered");
        logger.info("Solutions is hovered");
    } else {
        test.log(Status.FAIL, "Solutions is not displayed");
        logger.error("Solutions is not displayed");
    }

    if (homePage.navPricingIsDisplayed()) {
        test.log(Status.PASS, "Pricing is displayed");
        logger.info("Pricing is displayed");
        homePage.validateTextOfNavPricing("Pricing");
        test.log(Status.PASS, "Pricing text is correct");
        logger.info("Pricing text is correct");
        homePage.hoverNavPricing();
        test.log(Status.PASS, "Pricing is hovered");
        logger.info("Pricing is hovered");
    } else {
        test.log(Status.FAIL, "Pricing is not displayed");
        logger.error("Pricing is not displayed");
    }

    if (homePage.navResourcesIsDisplayed()) {
        test.log(Status.PASS, "Resources is displayed");
        logger.info("Resources is displayed");
        homePage.validateTextOfNavResources("Resources");
        test.log(Status.PASS, "Resources text is correct");
        logger.info("Resources text is correct");
        homePage.hoverNavResources();
        test.log(Status.PASS, "Resources is hovered");
        logger.info("Resources is hovered");
    } else {
        test.log(Status.FAIL, "Resources is not displayed");
        logger.error("Resources is not displayed");
    }
    // Partners isDisplayed
    if (homePage.navPartnersIsDisplayed()) {
        test.log(Status.PASS, "Partners is displayed");
        logger.info("Partners is displayed");
        homePage.validateTextOfNavPartners("Partners");
        test.log(Status.PASS, "Partners text is correct");
        logger.info("Partners text is correct");
        homePage.hoverNavPartners();
        test.log(Status.PASS, "Partners is hovered");
        logger.info("Partners is hovered");
    } else {
        test.log(Status.FAIL, "Partners is not displayed");
        logger.error("Partners is not displayed");
    }
    // About isDisplayed
    if (homePage.navAboutIsDisplayed()) {
        test.log(Status.PASS, "About is displayed");
        logger.info("About is displayed");
        homePage.validateTextOfNavAbout("About");
        test.log(Status.PASS, "About text is correct");
        logger.info("About text is correct");
        homePage.hoverNavAbout();
        test.log(Status.PASS, "About is hovered");
        logger.info("About is hovered");
    } else {
        test.log(Status.FAIL, "About is not displayed");
        logger.error("About is not displayed");
    }
    // Support isDisplayed
    if (homePage.navSupportIsDisplayed()) {
        test.log(Status.PASS, "Support is displayed");
        logger.info("Support is displayed");
        homePage.validateTextOfNavSupport("Support");
        test.log(Status.PASS, "Support text is correct");
        logger.info("Support text is correct");
        homePage.hoverNavSupport();
        test.log(Status.PASS, "Support is hovered");
        logger.info("Support is hovered");
    } else {
        test.log(Status.FAIL, "Support is not displayed");
        logger.error("Support is not displayed");
    }
    // How to open a seclore file isDisplayed
    if (homePage.linkHowToOpenFileIsDisplayed()) {
        test.log(Status.PASS, "How to open a seclore file is displayed");
        logger.info("How to open a seclore file is displayed");
    } else {
        test.log(Status.FAIL, "How to open a seclore file is not displayed");
        logger.error("How to open a seclore file is not displayed");
    }
    // Search isDisplayed
    if (homePage.iconSearchIsDisplayed()) {
        test.log(Status.PASS, "Search is displayed");
        logger.info("Search is displayed");
    } else {
        test.log(Status.FAIL, "Search is not displayed");
        logger.error("Search is not displayed");
    }
    // Language isDisplayed
    if (homePage.iconLanguageIsDisplayed()) {
        test.log(Status.PASS, "Language is displayed");
        logger.info("Language is displayed");
    } else {
        test.log(Status.FAIL, "Language is not displayed");
        logger.error("Language is not displayed");
    }
    // Get a Demo isDisplayed
    if (homePage.btnGetADemoIsDisplayed()) {
        test.log(Status.PASS, "Get a Demo button is displayed");
        logger.info("Get a Demo button is displayed");
        homePage.validateTextOfBtnGetADemo("Get a demo");
        test.log(Status.PASS, "Get a Demo button text is correct");
        logger.info("Get a Demo button text is correct");
        homePage.hoverBtnGetADemo();
        test.log(Status.PASS, "Get a Demo button is hovered");
        logger.info("Get a Demo button is hovered");
        homePage.clickBtnGetADemo();
        test.log(Status.PASS, "Get a Demo button is clicked");
        logger.info("Get a Demo button is clicked");

    } else {
        test.log(Status.FAIL, "Get a Demo button is not displayed");
        logger.error("Get a Demo button is not displayed");
    }

}

//Test case 2: Verifying Get a demo Page
@Test(priority = 2, description = "Verifying Get a demo Page",dependsOnMethods = "verifyGetADemoButtonAndNavButtonsAreDisplayed", dataProvider = "secloreData", dataProviderClass = SecloreDataProvider.class)
public void verifyGetADemoPage(String businessEmail, String firstName, String lastName, String companyName, String jobTitle, String phoneNumber, String country) {
    ExtentTest test = extent
            .createTest("TC" + getClass() + "_verifyGetADemoPage",
                    "Verifying Get a demo Page")
            .assignCategory(moduleName);
    setExtentTest(test);
    GetADemoPage getADemoPage = new GetADemoPage(getDriver());
    if (getADemoPage.secloreLogoIsDisplayed()) {
        test.log(Status.PASS, "Logo is displayed");
        logger.info("Logo is displayed");
    } else {
        test.log(Status.FAIL, "Logo is not displayed");
        logger.error("Logo is not displayed");
    }

    if (getADemoPage.headerShareDataFearlesslyIsDisplayed()) {
        test.log(Status.PASS, "Header is displayed");
        logger.info("Header is displayed");
        getADemoPage.validateTextOfHeaderShareDataFearlessly("Share Data Fearlessly");
        
    } else {
        test.log(Status.FAIL, "Header is not displayed");
        logger.error("Header is not displayed");
    }
    if (getADemoPage.subHeaderProtectControlIsDisplayed()) {
        test.log(Status.PASS, "Sub header is displayed");
        logger.info("Sub header is displayed");
        getADemoPage.validateTextOfSubHeaderProtectControl("Protect & control your digital assets wherever they go");
    } else {
        test.log(Status.FAIL, "Sub header is not displayed");
        logger.error("Sub header is not displayed");
    }
    if(getADemoPage.listDigitalAssetSecurityIsDisplayed()) {
        test.log(Status.PASS, "List is displayed");
        logger.info("List is displayed");
        getADemoPage.validateTextOfListDigitalAssetSecurity("Digital asset security");
    } else {
        test.log(Status.FAIL, "List is not displayed");
        logger.error("List is not displayed");
    }
    if(getADemoPage.listGranularAccessIsDisplayed()) {
        test.log(Status.PASS, "List is displayed");
        logger.info("List is displayed");
        getADemoPage.validateTextOfListGranularAccess("Granular access and privacy controls");
    } else {
        test.log(Status.FAIL, "List is not displayed");
        logger.error("List is not displayed");
    }
    if(getADemoPage.listNeverLoseControlIsDisplayed()) {
        test.log(Status.PASS, "List is displayed");
        logger.info("List is displayed");
        getADemoPage.validateTextOfListNeverLoseControl("Never lose control or visibility");
    } else {
        test.log(Status.FAIL, "List is not displayed");
        logger.error("List is not displayed");
    }
    if(getADemoPage.linkSeeDataCentricSecurityIsDisplayed()) {
        test.log(Status.PASS, "Link is displayed");
        logger.info("Link is displayed");
        getADemoPage.validateTextOfLinkSeeDataCentricSecurity("See Seclore’s data-centric security in action");
    } else {
        test.log(Status.FAIL, "Link is not displayed");
        logger.error("Link is not displayed");
    }

    if(getADemoPage.headerRequestDemoIsDisplayed()) {
        test.log(Status.PASS, "Header is displayed");
        logger.info("Header is displayed");
        getADemoPage.validateTextOfHeaderRequestDemo("Request a personalized demo");
    } else {
        test.log(Status.FAIL, "Header is not displayed");
        logger.error("Header is not displayed");
    }

    if(getADemoPage.labelBusinessEmailIsDisplayed()) {
        test.log(Status.PASS, "Label is displayed");
        logger.info("Label is displayed");
        getADemoPage.validateTextOfLabelBusinessEmail("Business Email");
    } else {
        test.log(Status.FAIL, "Label is not displayed");
        logger.error("Label is not displayed");
    }
    if(getADemoPage.inputBusinessEmailIsDisplayed()) {
        test.log(Status.PASS, "Input is displayed");
        logger.info("Input is displayed");
        getADemoPage.enterInputInEmail(businessEmail);

    } else {
        test.log(Status.FAIL, "Input is not displayed");
        logger.error("Input is not displayed");
    }
    //Validating first name
    if(getADemoPage.labelFirstNameIsDisplayed()) {
        test.log(Status.PASS, "Label is displayed");
        logger.info("Label is displayed");
        getADemoPage.validateTextOfLabelFirstName("First Name");
    } else {
        test.log(Status.FAIL, "Label is not displayed");
        logger.error("Label is not displayed");
    }
    if(getADemoPage.inputFirstNameIsDisplayed()) {
        test.log(Status.PASS, "Input is displayed");
        logger.info("Input is displayed");
        getADemoPage.enterInputInFirstName(firstName);
    } else {
        test.log(Status.FAIL, "Input is not displayed");
        logger.error("Input is not displayed");
    }
    //Validating last name
    if(getADemoPage.labelLastNameIsDisplayed()) {
        test.log(Status.PASS, "Label is displayed");
        logger.info("Label is displayed");
        getADemoPage.validateTextOfLabelLastName("Last Name");
    } else {
        test.log(Status.FAIL, "Label is not displayed");
        logger.error("Label is not displayed");
    }
    if(getADemoPage.inputLastNameIsDisplayed()) {
        test.log(Status.PASS, "Input is displayed");
        logger.info("Input is displayed");
        getADemoPage.enterInputInLastName(lastName);
    } else {
        test.log(Status.FAIL, "Input is not displayed");
        logger.error("Input is not displayed");
    }
    //Validating company name
    if(getADemoPage.labelCompanyNameIsDisplayed()) {
        test.log(Status.PASS, "Label is displayed");
        logger.info("Label is displayed");
        getADemoPage.validateTextOfLabelCompanyName("Company Name");
    } else {
        test.log(Status.FAIL, "Label is not displayed");
        logger.error("Label is not displayed");
    }
    if(getADemoPage.inputCompanyNameIsDisplayed()) {
        test.log(Status.PASS, "Input is displayed");
        logger.info("Input is displayed");
        getADemoPage.enterInputInCompanyName(companyName);
    } else {
        test.log(Status.FAIL, "Input is not displayed");
        logger.error("Input is not displayed");
    }
    //Validating job title
    if(getADemoPage.labelJobTitleIsDisplayed()) {
        test.log(Status.PASS, "Label is displayed");
        logger.info("Label is displayed");
        getADemoPage.validateTextOfLabelJobTitle("Job Title");
    } else {
        test.log(Status.FAIL, "Label is not displayed");
        logger.error("Label is not displayed");
    }
    if(getADemoPage.inputJobTitleIsDisplayed()) {
        test.log(Status.PASS, "Input is displayed");
        logger.info("Input is displayed");
        getADemoPage.enterInputInJobTitle(jobTitle);
    } else {
        test.log(Status.FAIL, "Input is not displayed");
        logger.error("Input is not displayed");
    }
    //Validating phone number
    if(getADemoPage.labelPhoneNumberIsDisplayed()) {
        test.log(Status.PASS, "Label is displayed");
        logger.info("Label is displayed");
        getADemoPage.validateTextOfLabelPhoneNumber("Phone Number");
    } else {
        test.log(Status.FAIL, "Label is not displayed");
        logger.error("Label is not displayed");
    }
    if(getADemoPage.inputPhoneNumberIsDisplayed()) {
        test.log(Status.PASS, "Input is displayed");
        logger.info("Input is displayed");
        getADemoPage.enterInputInPhoneNumber(phoneNumber);
    } else {
        test.log(Status.FAIL, "Input is not displayed");
        logger.error("Input is not displayed");
    }
    //Validating country
    if(getADemoPage.labelCountryIsDisplayed()) {
        test.log(Status.PASS, "Label is displayed");
        logger.info("Label is displayed");
        getADemoPage.validateTextOfLabelCountry("Country");
    } else {
        test.log(Status.FAIL, "Label is not displayed");
        logger.error("Label is not displayed");
    }
    if(getADemoPage.inputCountryIsDisplayed()) {
        test.log(Status.PASS, "Input is displayed");
        logger.info("Input is displayed");
        getADemoPage.enterInputInCountry(country);
    } else {
        test.log(Status.FAIL, "Input is not displayed");
        logger.error("Input is not displayed");
    }
    //Validating submit button
    if(getADemoPage.submitButtonIsDisplayed()) {
        test.log(Status.PASS, "Button is displayed");
        logger.info("Button is displayed");
        getADemoPage.validateTextOfSubmitButton("Submit");
        getADemoPage.clickOnSubmitButton();
    } else {
        test.log(Status.FAIL, "Button is not displayed");
        logger.error("Button is not displayed");
    }
}
}
