package web_automation.morningstar.tests;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import web_automation.morningstar.base.TestBase;
import web_automation.morningstar.pages.AdvertisementPage;
import web_automation.morningstar.pages.HomePage;
import web_automation.morningstar.utils.MorningstarDataProvider;
import web_automation.morningstar.pages.EventRegistration;


public class TC_InvestmentConferenceRegister extends TestBase {
    public final String moduleName = "Investment Conference";

    //Open Investment conference page
    @Test(priority = 1, dataProvider = "morningstarUrlsAndEndpoints", dataProviderClass = MorningstarDataProvider.class)
    public void validateHomepageAdvertisement(String url, String endpoint) {
        ExtentTest test = extent.createTest("TC" + getClass() + "validateHomepageAdvertisement", "Validate Homepage Advertisement").assignCategory(moduleName );
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

    //Validating registering for Investment Conference Overview page
    @Test(priority = 2,dependsOnMethods = "validateHomepageAdvertisement")
    public void validateRegisterForInvestmentConferenceOverviewPage() {
        ExtentTest test = extent.createTest("TC" + getClass() + "validateRegisterForInvestmentConferenceOverviewPage", "Validate Overview Page for Investment Conference").assignCategory(moduleName );
        setExtentTest(test);

        //Advertisement page
        AdvertisementPage advertisementPage = new AdvertisementPage(getDriver());

        //shifting to the new tab opened
        hardWait(5);
        getDriver().switchTo().window(getDriver().getWindowHandles().toArray()[1].toString());
        logger.info("=======================================(Switched to the new tab)====================================");

        //validating Morningstar brands and products text
        if (advertisementPage.isMorningstarBrandsAndProductsDisplayed()) {
            test.log(Status.PASS, "Morningstar Brands and Products is displayed");
            logger.info("Morningstar Brands and Products is displayed");
        } else {
            test.log(Status.FAIL, "Morningstar Brands and Products is not displayed");
            logger.error("Morningstar Brands and Products is not displayed");
        }

        //validating company text
        if (advertisementPage.isCompanyTextDisplayed()) {
            test.log(Status.PASS, "Company Text is displayed");
            logger.info("Company Text is displayed");
        } else {
            test.log(Status.FAIL, "Company Text is not displayed");
            logger.error("Company Text is not displayed");
        }

        //validating Morningstar logo
        if (advertisementPage.isMorningstarLogoDisplayed()) {
            test.log(Status.PASS, "Morningstar Logo is displayed");
            logger.info("Morningstar Logo is displayed");
        } else {
            test.log(Status.FAIL, "Morningstar Logo is not displayed");
            logger.error("Morningstar Logo is not displayed");
        }

        //validating Morningstar Investment Conference India text
        if (advertisementPage.isMorningstarInvestmentConferenceIndiaDisplayed()) {
            test.log(Status.PASS, "Morningstar Investment Conference India is displayed");
            logger.info("Morningstar Investment Conference India is displayed");
        } else {
            test.log(Status.FAIL, "Morningstar Investment Conference India is not displayed");
            logger.error("Morningstar Investment Conference India is not displayed");
        }

        //validating brands text
        if (advertisementPage.isBrandsTextDisplayed()) {
            test.log(Status.PASS, "Brands Text is displayed");
            logger.info("Brands Text is displayed");
            advertisementPage.validateTextBrandsText("Brands");
        } else {
            test.log(Status.FAIL, "Brands Text is not displayed");
            logger.error("Brands Text is not displayed");
        }

        //validating products text
        if (advertisementPage.isProductsTextDisplayed()) {
            test.log(Status.PASS, "Products Text is displayed");
            logger.info("Products Text is displayed");
            advertisementPage.validateTextProductsText("Products");
        } else {
            test.log(Status.FAIL, "Products Text is not displayed");
            logger.error("Products Text is not displayed");
        }

        //validating segments text
        if (advertisementPage.isSegmentsTextDisplayed()) {
            test.log(Status.PASS, "Segments Text is displayed");
            logger.info("Segments Text is displayed");
            advertisementPage.validateTextSegmentsText("Segments");
        } else {
            test.log(Status.FAIL, "Segments Text is not displayed");
            logger.error("Segments Text is not displayed");
        }

        //validating insights text
        if (advertisementPage.isInsightsTextDisplayed()) {
            test.log(Status.PASS, "Insights Text is displayed");
            logger.info("Insights Text is displayed");
            advertisementPage.validateTextInsightsText("Insights");
        } else {
            test.log(Status.FAIL, "Insights Text is not displayed");
            logger.error("Insights Text is not displayed");
        }

        //validating overview text
        if (advertisementPage.isOverviewTextDisplayed()) {
            test.log(Status.PASS, "Overview Text is displayed");
            logger.info("Overview Text is displayed");
            advertisementPage.validateTextOverviewText("Overview");
        } else {
            test.log(Status.FAIL, "Overview Text is not displayed");
            logger.error("Overview Text is not displayed");
        }

        //validating agenda text
        if (advertisementPage.isAgendaTextDisplayed()) {
            test.log(Status.PASS, "Agenda Text is displayed");
            logger.info("Agenda Text is displayed");
            advertisementPage.validateTextAgendaText("Agenda");
        } else {
            test.log(Status.FAIL, "Agenda Text is not displayed");
            logger.error("Agenda Text is not displayed");
        }

        //validating travel text
        if (advertisementPage.isTravelTextDisplayed()) {
            test.log(Status.PASS, "Travel Text is displayed");
            logger.info("Travel Text is displayed");
            advertisementPage.validateTextTravelText("Travel");
        } else {
            test.log(Status.FAIL, "Travel Text is not displayed");
            logger.error("Travel Text is not displayed");
        }
        //Validating Partners text
        if (advertisementPage.isPartnersTextDisplayed()) {
            test.log(Status.PASS, "Partners Text is displayed");
            logger.info("Partners Text is displayed");
            advertisementPage.validateTextPartnersText("Partners");
        } else {
            test.log(Status.FAIL, "Partners Text is not displayed");
            logger.error("Partners Text is not displayed");
        }

        // Validating FAQ text
        if (advertisementPage.isFAQTextDisplayed()) {
            test.log(Status.PASS, "FAQ Text is displayed");
            logger.info("FAQ Text is displayed");
            advertisementPage.validateTextFAQText("FAQ");
        } else {
            test.log(Status.FAIL, "FAQ Text is not displayed");
            logger.error("FAQ Text is not displayed");
        }

        //Validating Register now button
        if (advertisementPage.isRegisterNowButtonDisplayed()) {
            test.log(Status.PASS, "Register Now Button is displayed");
            logger.info("Register Now Button is displayed");
            advertisementPage.validateTextRegisterNowButton("Register Now");
        } else {
            test.log(Status.FAIL, "Register Now Button is not displayed");
            logger.error("Register Now Button is not displayed");
        }

        // Validating Welcome to the Morningstar Investment Conference India 2025 heading
        if (advertisementPage.isWelcomeToTheMorningstarInvestmentConferenceIndia2025HeadingDisplayed()) {
            test.log(Status.PASS, "Welcome to the Morningstar Investment Conference India 2025 Heading is displayed");
            logger.info("Welcome to the Morningstar Investment Conference India 2025 Heading is displayed");
            advertisementPage.validateTextWelcomeToTheMorningstarInvestmentConferenceIndia2025Heading("Welcome to the Morningstar Investment Conference India 2025");
        } else {
            test.log(Status.FAIL,
                    "Welcome to the Morningstar Investment Conference India 2025 Heading is not displayed");
            logger.error("Welcome to the Morningstar Investment Conference India 2025 Heading is not displayed");
        }

        // Validating Welcome to the Morningstar Investment Conference India 2025 sub-heading
        if (advertisementPage.isWelcomeToTheMorningstarInvestmentConferenceIndia2025SubHeadingDisplayed()) {
            test.log(Status.PASS,
                    "Welcome to the Morningstar Investment Conference India 2025 Sub-Heading is displayed");
            logger.info("Welcome to the Morningstar Investment Conference India 2025 Sub-Heading is displayed");
            advertisementPage.validateTextWelcomeToTheMorningstarInvestmentConferenceIndia2025SubHeading("Every investor evolves. Markets change, life stages progress, and guidance can’t afford to stand still. The Morningstar Investment Conference provides advisers and financial experts with cutting-edge research, expert insights, and thorough analysis. Register today to develop your practice for today’s evolving investor.");
        } else {
            test.log(Status.FAIL,
                    "Welcome to the Morningstar Investment Conference India 2025 Sub-Heading is not displayed");
            logger.error("Welcome to the Morningstar Investment Conference India 2025 Sub-Heading is not displayed");
        }
        
        // Validating Date of conference
        if (advertisementPage.isDateOfConferenceDisplayed()) {
            test.log(Status.PASS, "Date of conference is displayed");
            logger.info("Date of conference is displayed");
            advertisementPage.validateTextDateOfConference("04 November 2025");
        } else {
            test.log(Status.FAIL, "Date of conference is not displayed");
            logger.error("Date of conference is not displayed");
        }

        // Validating Location of conference
        if (advertisementPage.isLocationOfConferenceDisplayed()) {
            test.log(Status.PASS, "Location of conference is displayed");
            logger.info("Location of conference is displayed");
            advertisementPage.validateTextLocationOfConference("Jio World Convention Centre, Mumbai");
        } else {
            test.log(Status.FAIL, "Location of conference is not displayed");
            logger.error("Location of conference is not displayed");
        }

        //Validating Register Now Button2
        if (advertisementPage.isRegisterNowButton2Displayed()) {
            test.log(Status.PASS, "Register Now Button2 is displayed");
            logger.info("Register Now Button2 is displayed");
            advertisementPage.validateTextRegisterNowButton2("Register Now");
        } else {
            test.log(Status.FAIL, "Register Now Button2 is not displayed");
            logger.error("Register Now Button2 is not displayed");
        }

        // Validating Watch video Button
        if (advertisementPage.isWatchVideoButtonDisplayed()) {
            test.log(Status.PASS, "Watch video Button is displayed");
            logger.info("Watch video Button is displayed");
            advertisementPage.validateTextWatchVideoButton("Watch Video");
        } else {
            test.log(Status.FAIL, "Watch video Button is not displayed");
            logger.error("Watch video Button is not displayed");
        }

        // Validating Countdown Timer Text
        if (advertisementPage.isCountdownTimerTextDisplayed()) {
            test.log(Status.PASS, "Countdown Timer Text is displayed");
            logger.info("Countdown Timer Text is displayed");
            advertisementPage.validateTextCountdownTimerText("Countdown Till the Conference");
        } else {
            test.log(Status.FAIL, "Countdown Timer Text is not displayed");
            logger.error("Countdown Timer Text is not displayed");
        }

        //Validating Countdown timer
        if (advertisementPage.isCountdownTimerDisplayed()) {
            test.log(Status.PASS, "Countdown Timer is displayed");
            logger.info("Countdown Timer is displayed");
            advertisementPage.validateTextCountdownTimer("Countdown Timer");
        } else {
            test.log(Status.FAIL, "Countdown Timer is not displayed");
            logger.error("Countdown Timer is not displayed");
        }

        // Validating Speaker section header
        if (advertisementPage.isSpeakerSectionHeaderDisplayed()) {
            test.log(Status.PASS, "Speaker section header is displayed");
            logger.info("Speaker section header is displayed");
            advertisementPage.validateTextSpeakerSectionHeader("Captivating Keynote Speakers");
        } else {
            test.log(Status.FAIL, "Speaker section header is not displayed");
            logger.error("Speaker section header is not displayed");
        }
        // Selecting accept all cookies
        if( advertisementPage.isAcceptAllCookiesButtonDisplayed()) {
            test.log(Status.INFO, "Accept All Cookies Button is displayed");
            logger.info("Accept All Cookies Button is displayed");
            advertisementPage.clickOnAcceptAllCookiesButton();
        } else {
            test.log(Status.INFO, "Accept All Cookies Button is not displayed");
            logger.info("Accept All Cookies Button is not displayed");
        }

        // Clicking cookies box close button
        if (advertisementPage.isCloseCookiesTextBoxDisplayed()) {
            test.log(Status.INFO, "Cookies Box Close Button is displayed");
            logger.info("Cookies Box Close Button is displayed");
            advertisementPage.clickOnCloseCookiesTextBox();
        } else {
            test.log(Status.INFO, "Cookies Box Close Button is not displayed");
            logger.info("Cookies Box Close Button is not displayed");
        }

        // Validating Speaker section sub-header
        if (advertisementPage.isSpeakerSectionSubHeaderDisplayed()) {
            test.log(Status.PASS, "Speaker section sub-header is displayed");
            logger.info("Speaker section sub-header is displayed");
            advertisementPage.validateTextSpeakerSectionSubHeader("Here's the full list of speakers who participated in the 2024 event. Our 2025 speakers and agenda will be announced soon. Stay tuned for updates!");
        } else {
            test.log(Status.FAIL, "Speaker section sub-header is not displayed");
            logger.error("Speaker section sub-header is not displayed");
        }

        // Validating Stand out as Sponsors Text 
        if (advertisementPage.isStandOutAsSponsorsTextDisplayed()) {
            test.log(Status.PASS, "Stand out as Sponsors Text is displayed");
            logger.info("Stand out as Sponsors Text is displayed");
            advertisementPage.validateTextStandOutAsSponsorsText("Stand out as Sponsors");
        } else {
            test.log(Status.FAIL, "Stand out as Sponsors Text is not displayed");
            logger.error("Stand out as Sponsors Text is not displayed");
        }

        // Validating Stand out as Sponsors sub-text
        if (advertisementPage.isStandOutAsSponsorsSubTextDisplayed()) {
            test.log(Status.PASS, "Stand out as Sponsors sub-text is displayed");
            logger.info("Stand out as Sponsors sub-text is displayed");
            advertisementPage.validateTextStandOutAsSponsorsSubText("Sponsors help us bring the Morningstar Investment Conference to the next level, with their support fostering the connection that attendees demand.");
        } else {
            test.log(Status.FAIL, "Stand out as Sponsors sub-text is not displayed");
            logger.error("Stand out as Sponsors sub-text is not displayed");
        }

        // Validating Become a sponsor Button
        if (advertisementPage.isBecomeASponsorButtonDisplayed()) {
            test.log(Status.PASS, "Become a sponsor Button is displayed");
            logger.info("Become a sponsor Button is displayed");
            advertisementPage.validateTextBecomeASponsorButton("Become a sponsor");
        } else {
            test.log(Status.FAIL, "Become a sponsor Button is not displayed");
            logger.error("Become a sponsor Button is not displayed");
        }

        // Clicking on register now
        if (advertisementPage.isRegisterNowButtonDisplayed()) {
            test.log(Status.PASS, "Register Now Button is displayed");
            logger.info("Register Now Button is displayed");
            advertisementPage.clickOnRegisterNowButton();
        } else {
            test.log(Status.FAIL, "Register Now Button is not displayed");
            logger.error("Register Now Button is not displayed");
        }
        
    }
    //Validating initial Registration page for Investment Conference and fetching data from data provider
    @Test(priority = 3, dependsOnMethods = "validateRegisterForInvestmentConferenceOverviewPage", dataProvider = "morningstarFormDataInitialRegistration", dataProviderClass = MorningstarDataProvider.class)
    public void validateInitialRegistrationPage(String firstName, String lastName, String email, String phoneNumber) {
        ExtentTest test = extent.createTest("TC" + getClass() + "validateInitialRegistrationPage", "Validate Initial Registration Page for Investment Conference").assignCategory(moduleName );
        setExtentTest(test);

        //move to the recenly opened tab
        getDriver().switchTo().window(getDriver().getWindowHandles().toArray()[2].toString());

        // Validating Initial Registration  
        EventRegistration eventRegistrationPage = new EventRegistration(getDriver());
        
        if(eventRegistrationPage.isInitialRegistrationTextDisplayed()) {
            test.log(Status.PASS, "Initial Registration page is displayed");
            logger.info("Initial Registration page is displayed");
        } else {
            test.log(Status.FAIL, "Initial Registration page is not displayed");
            logger.error("Initial Registration page is not displayed");
        }

        //Validating Personal Information header
        if(eventRegistrationPage.isPersonalInformationHeaderDisplayed()) {
            test.log(Status.PASS, "Personal Information header is displayed");
            logger.info("Personal Information header is displayed");
            eventRegistrationPage.validateTextPersonalInformationHeader("Personal Information");
        } else {
            test.log(Status.FAIL, "Personal Information header is not displayed");
            logger.error("Personal Information header is not displayed");
        }

        //Validating Personal Information sub-header
        if(eventRegistrationPage.isPersonalInformationSubHeaderDisplayed()) {
            test.log(Status.PASS, "Personal Information sub-header is displayed");
            logger.info("Personal Information sub-header is displayed");
            eventRegistrationPage.validateTextPersonalInformationSubHeader("Fill out the information below, then click Next to continue.");
        } else {
            test.log(Status.FAIL, "Personal Information sub-header is not displayed");
            logger.error("Personal Information sub-header is not displayed");
        }

        //Validating First Name label
        if(eventRegistrationPage.isFirstNameDisplayed()) {
            test.log(Status.PASS, "First Name label is displayed");
            logger.info("First Name label is displayed");
            eventRegistrationPage.validateTextFirstName("First name");
        } else {
            test.log(Status.FAIL, "First Name label is not displayed");
            logger.error("First Name label is not displayed");
        }

        //Validating First Name input field
        if(eventRegistrationPage.isFirstNameTextboxDisplayed()) {
            test.log(Status.PASS, "First Name input field is displayed");
            logger.info("First Name input field is displayed");
            eventRegistrationPage.validatePlaceholderTextFirstNameTextbox("First Name");
            eventRegistrationPage.enterFirstName(firstName);
        } else {
            test.log(Status.FAIL, "First Name input field is not displayed");
            logger.error("First Name input field is not displayed");
        }

        //Validating Last Name label
        if(eventRegistrationPage.isLastNameDisplayed()) {
            test.log(Status.PASS, "Last Name label is displayed");
            logger.info("Last Name label is displayed");
            eventRegistrationPage.validateTextLastName("Last name");
        } else {
            test.log(Status.FAIL, "Last Name label is not displayed");
            logger.error("Last Name label is not displayed");
        }

        //Validating Last Name input field
        if(eventRegistrationPage.isLastNameTextboxDisplayed()) {
            test.log(Status.PASS, "Last Name input field is displayed");
            logger.info("Last Name input field is displayed");
            eventRegistrationPage.validatePlaceholderTextLastNameTextbox("Last Name");
            eventRegistrationPage.enterLastName(lastName);
        } else {
            test.log(Status.FAIL, "Last Name input field is not displayed");
            logger.error("Last Name input field is not displayed");
        }

        //Validating Email label
        if(eventRegistrationPage.isEmailDisplayed()) {
            test.log(Status.PASS, "Email label is displayed");
            logger.info("Email label is displayed");
            eventRegistrationPage.validateTextEmail("Email address");
        } else {
            test.log(Status.FAIL, "Email label is not displayed");
            logger.error("Email label is not displayed");
        }

        //Validating Email input field
        if(eventRegistrationPage.isEmailTextboxDisplayed()) {
            test.log(Status.PASS, "Email input field is displayed");
            logger.info("Email input field is displayed");
            eventRegistrationPage.validatePlaceholderTextEmailTextbox("Email");
            eventRegistrationPage.enterEmail(email);
        } else {
            test.log(Status.FAIL, "Email input field is not displayed");
            logger.error("Email input field is not displayed");
        }

        //Validating mobile Number label
        if(eventRegistrationPage.isMobileDisplayed()) {
            test.log(Status.PASS, "Mobile Number label is displayed");
            logger.info("Mobile Number label is displayed");
            eventRegistrationPage.validateTextMobile("Mobile");
        } else {
            test.log(Status.FAIL, "Mobile Number label is not displayed");
            logger.error("Mobile Number label is not displayed");
        }

        //Validating Mobile Number input field
        if(eventRegistrationPage.isMobileTextboxDisplayed()) {
            test.log(Status.PASS, "Mobile Number input field is displayed");
            logger.info("Mobile Number input field is displayed");
            eventRegistrationPage.validatePlaceholderTextMobileTextbox("Mobile Number");
            eventRegistrationPage.enterMobile(phoneNumber);
        } else {
            test.log(Status.FAIL, "Mobile Number input field is not displayed");
            logger.error("Mobile Number input field is not displayed");
        }
        //Validating Mobile format label
        if(eventRegistrationPage.isMobileFormatDisplayed()) {
            test.log(Status.PASS, "Mobile format label is displayed");
            logger.info("Mobile format label is displayed");
            eventRegistrationPage.validateTextMobileFormat("**Please include +91 infront of your mobile number e.g. +91xxxxxxxxx");
        } else {
            test.log(Status.FAIL, "Mobile format label is not displayed");
            logger.error("Mobile format label is not displayed");
        }
        // Validating   I'm registering on behalf of this person text
        if(eventRegistrationPage.isImRegisteringOnBehalfOfThisPersonDisplayed()) {
            test.log(Status.PASS, "I'm registering on behalf of this person text is displayed");
            logger.info("I'm registering on behalf of this person text is displayed");
            eventRegistrationPage.validateTextImRegisteringOnBehalfOfThisPerson("I'm registering on behalf of this person");
        } else {
            test.log(Status.FAIL, "I'm registering on behalf of this person text is not displayed");
            logger.error("I'm registering on behalf of this person text is not displayed");
        }

        // Validating   I'm registering on behalf of this person checkbox
        if(eventRegistrationPage.isImRegisteringOnBehalfOfThisPersonCheckboxDisplayed()) {
            test.log(Status.PASS, "I'm registering on behalf of this person checkbox is displayed");
            logger.info("I'm registering on behalf of this person checkbox is displayed");
            eventRegistrationPage.clickOnImRegisteringOnBehalfOfThisPersonCheckbox();
            // Clicking on the checkbox to deselect it
            logger.info("Clicking on the checkbox to deselect it");
            eventRegistrationPage.clickOnImRegisteringOnBehalfOfThisPersonCheckbox();
        } else {
            test.log(Status.FAIL, "I'm registering on behalf of this person checkbox is not displayed");
            logger.error("I'm registering on behalf of this person checkbox is not displayed");
        }

        // Validating Cancel Button
        if(eventRegistrationPage.isCancelButtonDisplayed()) {
            test.log(Status.PASS, "Cancel Button is displayed");
            logger.info("Cancel Button is displayed");
            eventRegistrationPage.validateTextCancelButton("Cancel");
        } else {
            test.log(Status.FAIL, "Cancel Button is not displayed");
            logger.error("Cancel Button is not displayed");
        }

        // Validating Next Button
        if(eventRegistrationPage.isNextButton1Displayed()) {
            test.log(Status.PASS, "Next Button is displayed");
            logger.info("Next Button is displayed");
            eventRegistrationPage.validateTextNextButton1Button("Next");
            eventRegistrationPage.clickNextButton1();
        } else {
            test.log(Status.FAIL, "Next Button is not displayed");
            logger.error("Next Button is not displayed");
        }


    }
}