package web_automation.analytics_vidhya.tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.asserts.SoftAssert;
import web_automation.analytics_vidhya.base.TestBase;
import org.testng.annotations.Test;
import web_automation.analytics_vidhya.pages.HomePage;
import web_automation.analytics_vidhya.utils.AnalyticsVidhyaDataProvider;

public class Login extends TestBase {

    private final String moduleName = "analyticsVidhyaLoginPage";


    @Test(priority = 1, dataProvider = "analyticVidhyaData", dataProviderClass = AnalyticsVidhyaDataProvider.class)
    public void validatingHomepagePopUp(String url, String path, String name, String phone, String email) {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingHomepagePopUp", "Validating if homepage pop up").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());
        // Set up WebDriver
        getDriver().get(url + path);

        homePage.clickAcceptCookies();
        hardWait(10);
        if (homePage.ifInitialPopUpHeadingIsDisplayed()) {
            test.log(Status.PASS, "Initial pop up is displayed");
            logger.info("Initial pop up is displayed");
            SoftAssert softAssert1 = new SoftAssert();
            softAssert1.assertEquals(homePage.getInitialPopUpHeadingText(), "Transform into a GenAI and Agentic AI Pro: Take the First Step");
            logger.info("Initial pop up heading is displayed");
            softAssert1.assertEquals(homePage.getfullNameLabelText(), "Full Name");
            logger.info("Full name label is displayed");
            softAssert1.assertEquals(homePage.getPhoneNumberLabelText(), "Phone Number");
            logger.info("Phone number label is displayed");
            softAssert1.assertEquals(homePage.getEmailLabelText(), "Email Id");
            logger.info("Email label is displayed");
            homePage.enterFullName(name);
            logger.info("Full name is entered");
            homePage.enterPhoneNumber(phone);
            logger.info("Phone number is entered");
            homePage.enterEmail(email);
            logger.info("Email is entered");
            softAssert1.assertEquals(homePage.getDownloadProjectButtonText(), "Download Projects");
            logger.info("Download project button is displayed");
            softAssert1.assertAll();
            homePage.downloadProjectButton();
            hardWait(5);
            homePage.clickSkipButton();
            logger.info("Skip button is clicked");
            hardWait(3);
            test.log(Status.PASS, "Initial pop up all the fields are validated");
            logger.info("Initial pop up all the fields are validated");

        } else {
            test.log(Status.FAIL, "Initial pop up is not displayed");
            logger.info("Initial pop up is not displayed");
        }


        test.log(Status.PASS, "Navigated to Analytics Vidhya pinnacle plus page");
        logger.info("Navigated to Analytics Vidhya");

    }

    //    @Test(priority = 2)
    public void validatingNavButtonsCTA() {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingNavCTA", "Validating if nav buttons are working").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());

        if (homePage.analyticsVidhyaIconTopNavIsDisplayed()) {
            logger.info("Analytics Vidhya icon is displayed");
            test.log(Status.PASS, "Analytics Vidhya icon is displayed");

        } else {

            test.log(Status.FAIL, "Analytics Vidhya icon is not displayed");
            logger.info("Analytics Vidhya icon is not displayed");
        }
        if (homePage.whatToExpectTopNavIsDisplayed()) {
            logger.info("What to expect CTA is displayed");
            test.log(Status.PASS, "What to expect CTA is displayed");
            homePage.validateTextOfWhatToExpectTopNav("What to Expect");
            homePage.clickWhatToExpectTopNav();
            logger.info("What to expect CTA is clicked");
            test.log(Status.PASS, "What to expect CTA is clicked");
        } else {
            test.log(Status.FAIL, "What to expect CTA is not displayed");
            logger.info("What to expect CTA is not displayed");
        }
        if (homePage.curriculumTopNavIsDisplayed()) {
            logger.info("Curriculum CTA is displayed");
            test.log(Status.PASS, "Curriculum CTA is displayed");
            homePage.validateTextOfCurriculumTopNav("Curriculum");
            homePage.clickCurriculumTopNav();
            logger.info("Curriculum CTA is clicked");
            test.log(Status.PASS, "Curriculum CTA is clicked");
        } else {
            test.log(Status.FAIL, "Curriculum CTA is not displayed");
            logger.info("Curriculum CTA is not displayed");
        }
        if (homePage.instructorsTopNavIsDisplayed()) {
            logger.info("Instructor CTA is displayed");
            test.log(Status.PASS, "Instructor CTA is displayed");
            homePage.validateTextOfInstructorsTopNav("Instructors");
            homePage.clickInstructorsTopNav();
            logger.info("Instructor CTA is clicked");
            test.log(Status.PASS, "Instructor CTA is clicked");
        } else {
            test.log(Status.FAIL, "Instructor CTA is not displayed");
            logger.info("Instructor CTA is not displayed");
        }
        if (homePage.feesTopNavIsDisplayed()) {
            logger.info("Fees CTA is displayed");
            test.log(Status.PASS, "Fees CTA is displayed");
            homePage.validateTextOfFeesTopNav("Fees");
            homePage.clickFeesTopNav();
            logger.info("Fees CTA is clicked");
            test.log(Status.PASS, "Fees CTA is clicked");
        } else {
            test.log(Status.FAIL, "Fees CTA is not displayed");
            logger.info("Fees CTA is not displayed");
        }
        if (homePage.testimonialsTopNavIsDisplayed()) {
            logger.info("Testimonials CTA is displayed");
            test.log(Status.PASS, "Testimonials CTA is displayed");
            homePage.validateTextOfTestimonialsTopNav("Testimonials");
            homePage.clickTestimonialsTopNav();
            getDriver().navigate().back();//It is redirecting to a Testimonials page
            homePage.clickOnCloseButtonInPopUp();
            logger.info("Testimonials CTA is clicked");
            test.log(Status.PASS, "Testimonials CTA is clicked");
        } else {
            test.log(Status.FAIL, "Testimonials CTA is not displayed");
            logger.info("Testimonials CTA is not displayed");
        }
        if (homePage.enrollNowButtonTopNavIsDisplayed()) {
            logger.info("Enroll now CTA is displayed");
            test.log(Status.PASS, "Enroll now CTA is displayed");
            homePage.validateTextOfEnrollNowButtonTopNav("Enroll Now");
            homePage.clickEnrollNowButtonTopNav();
            logger.info("Enroll now CTA is clicked");
            test.log(Status.PASS, "Enroll now CTA is clicked");
        } else {
            test.log(Status.FAIL, "Enroll now CTA is not displayed");
            logger.info("Enroll now CTA is not displayed");
        }

    }

    //    @Test(priority = 3)
    public void validatingfirstScreen() {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingfirstScreen", "Validating if first screen is displayed").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());
        if (homePage.ifSiteTitleIsDisplayed()) {
            logger.info("Site title is displayed");
            test.log(Status.PASS, "Site title is displayed");
            homePage.validateTextOfSiteTitle("GenAI Pinnacle Plus Program");
            logger.info("Site title is validated");
            test.log(Status.PASS, "Site title is validated");
        } else {
            test.log(Status.FAIL, "Site title is not displayed");
            logger.info("Site title is not displayed");
        }
        if (homePage.ifSiteSubTitleIsDisplayed()) {
            logger.info("Site sub title is displayed");
            test.log(Status.PASS, "Site sub title is displayed");
            homePage.validateTextOfSiteSubTitle("Industry-Focused Learning : Master GenAI and Agentic AI");
            logger.info("Site sub title is validated");
            test.log(Status.PASS, "Site sub title is validated");
        } else {
            test.log(Status.FAIL, "Site sub title is not displayed");
            logger.info("Site sub title is not displayed");
        }
        if (homePage.ifProjectsIsDisplayed()) {
            logger.info("Projects is displayed");
            test.log(Status.PASS, "Projects is displayed");
            homePage.validateTextOfProjects("300+");
            logger.info("Projects is validated");
            test.log(Status.PASS, "Projects is validated");
        } else {
            test.log(Status.FAIL, "Projects is not displayed");
            logger.info("Projects is not displayed");
        }

        if (homePage.ifHoursOfImmersiveLearningIsDisplayed()) {
            logger.info("Hours of immersive learning is displayed");
            test.log(Status.PASS, "Hours of immersive learning is displayed");
            homePage.validateTextOfHoursOfImmersiveLearning("Hours of Immersive Learning");
            logger.info("Hours of immersive learning is validated");
            test.log(Status.PASS, "Hours of immersive learning is validated");
        } else {
            test.log(Status.FAIL, "Hours of immersive learning is not displayed");
            logger.info("Hours of immersive learning is not displayed");
        }
        if (homePage.ifPlacementAssistanceIsDisplayed()) {
            logger.info("Placement assistance is displayed");
            test.log(Status.PASS, "Placement assistance is displayed");
            homePage.validateTextOfPlacementAssistance("Placement Assistance");
            logger.info("Placement assistance is validated");
            test.log(Status.PASS, "Placement assistance is validated");
        } else {
            test.log(Status.FAIL, "Placement assistance is not displayed");
            logger.info("Placement assistance is not displayed");
        }
        if (homePage.ifPlacementRateIsDisplayed()) {
            logger.info("Placement rate is displayed");
            test.log(Status.PASS, "Placement rate is displayed");
            homePage.validateTextOfPlacementRate("100%");
            logger.info("Placement rate is validated");
            test.log(Status.PASS, "Placement rate is validated");
        } else {
            test.log(Status.FAIL, "Placement rate is not displayed");
            logger.info("Placement rate is not displayed");
        }

        if (homePage.ifHoursOfLiveWorkshopsIsDisplayed()) {
            logger.info("Hours of live workshops is displayed");
            test.log(Status.PASS, "Hours of live workshops is displayed");
            homePage.validateTextOfHoursOfLiveWorkshops("Hours of Live Workshops Quarterly");
            logger.info("Hours of live workshops is validated");
            test.log(Status.PASS, "Hours of live workshops is validated");
        } else {
            test.log(Status.FAIL, "Hours of live workshops is not displayed");
            logger.info("Hours of live workshops is not displayed");
        }

        if (homePage.ifLiveWorkshopsIsDisplayed()) {
            logger.info("Live workshops is displayed");
            test.log(Status.PASS, "Live workshops is displayed");
            homePage.validateTextOfLiveWorkshops("30+");
            logger.info("Live workshops is validated");
            test.log(Status.PASS, "Live workshops is validated");
        } else {
            test.log(Status.FAIL, "Live workshops is not displayed");
            logger.info("Live workshops is not displayed");

        }

        if (homePage.ifExpertLedMentorshipsIsDisplayed()) {
            logger.info("Expert led mentorships is displayed");
            test.log(Status.PASS, "Expert led mentorships is displayed");
            homePage.validateTextOfExpertLedMentorships("1:1 Expert-Led Mentorships");
            logger.info("Expert led mentorships is validated");
            test.log(Status.PASS, "Expert led mentorships is validated");
        } else {
            test.log(Status.FAIL, "Expert led mentorships is not displayed");
            logger.info("Expert led mentorships is not displayed");
        }

        if (homePage.ifMentorshipsIsDisplayed()) {
            logger.info("Mentorship is displayed");
            test.log(Status.PASS, "Mentorship is displayed");
            homePage.validateTextOfMentorships("75+");
            logger.info("Mentorship is validated");
            test.log(Status.PASS, "Mentorship is validated");
        } else {
            test.log(Status.FAIL, "Mentorship is not displayed");
            logger.info("Mentorship is not displayed");
        }
    }

//    @Test(priority = 4, dataProvider = "analyticVidhyaPopUpData", dataProviderClass = AnalyticsVidhyaDataProvider.class)
    public void validatingFirstScreenContactBox(String name, String phoneNumber, String email) {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingFirstScreenBox", "Validating if first screen").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());
        if (homePage.ifPopUpTitleIsDisplayed()) {
            logger.info("Pop up title is displayed");
            test.log(Status.PASS, "Pop up title is displayed");
            homePage.validateTextOfPopUpTitle("Become a GenAI and Agentic AI Expert : Start Now");
            logger.info("Pop up title is validated");
            test.log(Status.PASS, "Pop up title is validated");
        } else {
            test.log(Status.FAIL, "Pop up title is not displayed");
            logger.info("Pop up title is not displayed");
        }
        if (homePage.ifFullNamePopUpIsDisplayed()) {
            logger.info("Full name is displayed");
            test.log(Status.PASS, "Full name is displayed");
            homePage.validatePlaceholderTextOfFullName("Your Full Name");
            homePage.enterFullNamePopUp(name);
            logger.info("Full name is validated");
            test.log(Status.PASS, "Full name is validated");
        } else {
            test.log(Status.FAIL, "Full name is not displayed");
            logger.info("Full name is not displayed");
        }
        if (homePage.ifPhoneNumberPopUpIsDisplayed()) {
            logger.info("Phone number is displayed");
            test.log(Status.PASS, "Phone number is displayed");
            homePage.validatePlaceholderTextOfPhoneNumber("Your Phone Number");
            homePage.enterPhoneNumberPopUp(phoneNumber);
            logger.info("Phone number is validated");
            test.log(Status.PASS, "Phone number is validated");
        } else {
            test.log(Status.FAIL, "Phone number is not displayed");
            logger.info("Phone number is not displayed");
        }
        if (homePage.ifCountryFlagIsDisplayed()) {
            logger.info("Country flag is displayed");
            test.log(Status.PASS, "Country flag is displayed");
            homePage.clickCountryFlag();
            logger.info("Country flag is clicked");
            test.log(Status.PASS, "Country flag is clicked");
            homePage.clickCountryFlag();
            logger.info("Country flag is validated");
            test.log(Status.PASS, "Country flag is validated");
        } else {
            test.log(Status.FAIL, "Country flag is not displayed");
            logger.info("Country flag is not displayed");
        }
        if (homePage.ifEmailPopUpIsDisplayed()) {
            logger.info("Email is displayed");
            test.log(Status.PASS, "Email is displayed");
            homePage.validatePlaceholderTextOfEmail("Your Email Id");
            homePage.enterEmailPopUp(email);
            logger.info("Email is validated");
            test.log(Status.PASS, "Email is validated");
        } else {
            test.log(Status.FAIL, "Email is not displayed");
            logger.info("Email is not displayed");
        }
        if (homePage.ifTncTextIsDisplayed()) {
            logger.info("TnC text is displayed");
            test.log(Status.PASS, "TnC text is displayed");
            homePage.validateTextTncText("I Agree to the Terms & Conditions");
            logger.info("TnC text is validated");
            test.log(Status.PASS, "TnC text is validated");
        } else {
            test.log(Status.FAIL, "TnC text is not displayed");
            logger.info("TnC text is not displayed");
        }
        if (homePage.ifSendWhatsAppTextIsDisplayed()) {
            logger.info("Send WhatsApp text is displayed");
            test.log(Status.PASS, "Send WhatsApp text is displayed");
            homePage.validateTextSendWhatsAppText("Send WhatsApp Updates");
            logger.info("Send WhatsApp text is validated");
            test.log(Status.PASS, "Send WhatsApp text is validated");
        } else {
            test.log(Status.FAIL, "Send WhatsApp text is not displayed");
            logger.info("Send WhatsApp text is not displayed");
        }

        if (homePage.ifDownloadBrochureButtonIsDisplayed()) {
            logger.info("Download brochure button is displayed");
            test.log(Status.PASS, "Download brochure button is displayed");
            homePage.validateTextDownloadBrochureButton("Download Brochure");
            homePage.clickDownloadBrochureButton();
            logger.info("Download brochure button is clicked");
            test.log(Status.PASS, "Download brochure button is clicked");
            logger.info("Download brochure button is validated");
            test.log(Status.PASS, "Download brochure button is validated");
        } else {
            test.log(Status.FAIL, "Download brochure button is not displayed");
            logger.info("Download brochure button is not displayed");
        }

    }

//    @Test(priority = 5)
    public void validatingSecondScreen() {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingSecondScreen", "Validating How Does the GenAI Pinnacle Plus Program Help You? section").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());
        if (homePage.ifHowDoesTheGenAiPinnaclePlusProgramHelpYouIsDisplayed()) {
            logger.info("How does the GenAi Pinnacle Plus program help you is displayed");
            test.log(Status.PASS, "How does the GenAi Pinnacle Plus program help you is displayed");
            homePage.validateTextOfHowDoesTheGenAiPinnaclePlusProgramHelpYou("How does the GenAI Pinnacle Plus Program Help You?");
            logger.info("How does the GenAi Pinnacle Plus program help you is validated");
            test.log(Status.PASS, "How does the GenAi Pinnacle Plus program help you is validated");
        } else {
            test.log(Status.FAIL, "How does the GenAi Pinnacle Plus program help you is not displayed");
            logger.info("How does the GenAi Pinnacle Plus program help you is not displayed");
        }
        if (homePage.ifHoursOfImmersiveLearning2IsDisplayed()) {
            logger.info("Hours of immersive learning is displayed");
            test.log(Status.PASS, "Hours of immersive learning is displayed");
            homePage.validateTextOfHoursOfImmersiveLearning2("300+ Hours of Immersive Learning");
            logger.info("Hours of immersive learning is validated");
            test.log(Status.PASS, "Hours of immersive learning is validated");
        } else {
            test.log(Status.FAIL, "Hours of immersive learning is not displayed");
            logger.info("Hours of immersive learning is not displayed");
        }
        if (homePage.ifFullSpectrumGenAiAndAgenticAiLearningIsDisplayed()) {
            logger.info("Full spectrum GenAi and Agentic Ai learning is displayed");
            test.log(Status.PASS, "Full spectrum GenAi and Agentic Ai learning is displayed");
            homePage.validateTextOfFullSpectrumGenAiAndAgenticAiLearning("Full-spectrum GenAI and Agentic AI learning with 14 modules");
            logger.info("Full spectrum GenAi and Agentic Ai learning is validated");
            test.log(Status.PASS, "Full spectrum GenAi and Agentic Ai learning is validated");
        } else {
            test.log(Status.FAIL, "Full spectrum GenAi and Agentic Ai learning is not displayed");
            logger.info("Full spectrum GenAi and Agentic Ai learning is not displayed");
        }
        if (homePage.ifMasterCuttingEdgeGenAiIsDisplayed()) {
            logger.info("Master cutting edge GenAi is displayed");
            test.log(Status.PASS, "Master cutting edge GenAi is displayed");
            homePage.validateTextOfMasterCuttingEdgeGenAi("Master cutting-edge GenAI and Agentic AI frameworks and tools.");
            logger.info("Master cutting edge GenAi is validated");
            test.log(Status.PASS, "Master cutting edge GenAi is validated");
        } else {
            test.log(Status.FAIL, "Master cutting edge GenAi is not displayed");
            logger.info("Master cutting edge GenAi is not displayed");
        }
        if (homePage.ifIndustryAlignedProjectsIsDisplayed()) {
            logger.info("Industry aligned projects is displayed");
            test.log(Status.PASS, "Industry aligned projects is displayed");
            homePage.validateTextOfIndustryAlignedProjects("50+ Industry-Aligned Projects");
            logger.info("Industry aligned projects is validated");
            test.log(Status.PASS, "Industry aligned projects is validated");
        } else {
            test.log(Status.FAIL, "Industry aligned projects is not displayed");
            logger.info("Industry aligned projects is not displayed");
        }
        if (homePage.ifAcquireRealWorldExperienceIsDisplayed()) {
            logger.info("Acquire real world experience is displayed");
            test.log(Status.PASS, "Acquire real world experience is displayed");
            homePage.validateTextOfAcquireRealWorldExperience("Acquire real-world experience through projects that connect theory with practice.");
            logger.info("Acquire real world experience is validated");
            test.log(Status.PASS, "Acquire real world experience is validated");
        } else {

            test.log(Status.FAIL, "Acquire real world experience is not displayed");
            logger.info("Acquire real world experience is not displayed");
        }
        if (homePage.ifDiverseProjectsIsDisplayed()) {
            logger.info("Diverse projects is displayed");
            test.log(Status.PASS, "Diverse projects is displayed");
            homePage.validateTextOfDiverseProjects("Diverse projects designed to transform knowledge into expertise.");
            logger.info("Diverse projects is validated");
            test.log(Status.PASS, "Diverse projects is validated");
        } else {
            test.log(Status.FAIL, "Diverse projects is not displayed");
            logger.info("Diverse projects is not displayed");
        }
        if (homePage.ifExpertMentorshipIsDisplayed()) {
            logger.info("Expert mentorship is displayed");
            test.log(Status.PASS, "Expert mentorship is displayed");
            homePage.validateTextOfExpertMentorship("1:1 Expert Mentorship");
            logger.info("Expert mentorship is validated");
            test.log(Status.PASS, "Expert mentorship is validated");
        } else {
            test.log(Status.FAIL, "Expert mentorship is not displayed");
            logger.info("Expert mentorship is not displayed");
        }
        if (homePage.ifExpertInsightsIsDisplayed()) {
            logger.info("Expert insights is displayed");
            test.log(Status.PASS, "Expert insights is displayed");
            homePage.validateTextOfExpertInsights("Get expert insights from seasoned professionals");
            logger.info("Expert insights is validated");
            test.log(Status.PASS, "Expert insights is validated");
        } else {
            test.log(Status.FAIL, "Expert insights is not displayed");
            logger.info("Expert insights is not displayed");
        }
        if (homePage.ifPersonalizedRoadmapIsDisplayed()) {
            logger.info("Personalized roadmap is displayed");
            test.log(Status.PASS, "Personalized roadmap is displayed");
            homePage.validateTextOfPersonalizedRoadmap("Accelerate your learning with a personalized roadmap to success");
            logger.info("Personalized roadmap is validated");
            test.log(Status.PASS, "Personalized roadmap is validated");
        } else {
            test.log(Status.FAIL, "Personalized roadmap is not displayed");
            logger.info("Personalized roadmap is not displayed");
        }
    }

//    @Test(priority = 6)
    public void validatingThirdScreen() {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingCurriculumStatisticsSection", "Validating Curriculum Statistics section").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());

        if (homePage.ifCurriculumStatisticsIsDisplayed()) {
            logger.info("Curriculum statistics section is displayed");
            test.log(Status.PASS, "Curriculum statistics section is displayed");
            homePage.validateTextOfCurriculumStatistics("Curriculum Statistics");
            logger.info("Curriculum statistics section is validated");
            test.log(Status.PASS, "Curriculum statistics section is validated");
        } else {
            test.log(Status.FAIL, "Curriculum statistics section is not displayed");
            logger.info("Curriculum statistics section is not displayed");
        }
        if (homePage.ifProjects2IsDisplayed()) {
            logger.info("Projects is displayed");
            test.log(Status.PASS, "Projects is displayed");
            homePage.validateTextOfProjects2("50+ Projects");
            logger.info("Projects is validated");
            test.log(Status.PASS, "Projects is validated");
        } else {
            test.log(Status.FAIL, "Projects is not displayed");
            logger.info("Projects is not displayed");
        }
        if (homePage.ifHandsOnLearningIsDisplayed()) {
            logger.info("Hands on learning is displayed");
            test.log(Status.PASS, "Hands on learning is displayed");
            homePage.validateTextOfHandsOnLearning("Hands-on learning with industry-relevant challenges.");
            logger.info("Hands on learning is validated");
            test.log(Status.PASS, "Hands on learning is validated");
        } else {
            test.log(Status.FAIL, "Hands on learning is not displayed");
            logger.info("Hands on learning is not displayed");
        }
        if (homePage.ifHoursOfImmersiveLearning2_2IsDisplayed()) {
            logger.info("Hours of immersive learning is displayed");
            test.log(Status.PASS, "Hours of immersive learning is displayed");
            homePage.validateTextOfHoursOfImmersiveLearning2_2("300+ Hours");
            logger.info("Hours of immersive learning is validated");
            test.log(Status.PASS, "Hours of immersive learning is validated");
        } else {
            test.log(Status.FAIL, "Hours of immersive learning is not displayed");
            logger.info("Hours of immersive learning is not displayed");
        }
        if (homePage.ifInDepthLearningIsDisplayed()) {
            logger.info("In depth learning is displayed");
            test.log(Status.PASS, "In depth learning is displayed");
            homePage.validateTextOfInDepthLearning("In-depth GenAI and Agentic AI learning to transform your career");
            logger.info("In depth learning is validated");
            test.log(Status.PASS, "In depth learning is validated");
        } else {
            test.log(Status.FAIL, "In depth learning is not displayed");
            logger.info("In depth learning is not displayed");
        }
        if (homePage.ifLibrariesIsDisplayed()) {
            logger.info("Libraries is displayed");
            test.log(Status.PASS, "Libraries is displayed");
            homePage.validateTextOfLibraries("40+ Libraries");
            logger.info("Libraries is validated");
            test.log(Status.PASS, "Libraries is validated");
        } else {
            test.log(Status.FAIL, "Libraries is not displayed");
            logger.info("Libraries is not displayed");
        }
        if (homePage.ifDevelopExpertiseIsDisplayed()) {
            logger.info("Develop expertise is displayed");
            test.log(Status.PASS, "Develop expertise is displayed");
            homePage.validateTextOfDevelopExpertise("Develop expertise in 40+ essential industry tools, libraries and frameworks.");
            logger.info("Develop expertise is validated");
            test.log(Status.PASS, "Develop expertise is validated");
        } else {
            test.log(Status.FAIL, "Develop expertise is not displayed");
            logger.info("Develop expertise is not displayed");
        }
        if (homePage.ifAssignmentsIsDisplayed()) {
            logger.info("Assignments is displayed");
            test.log(Status.PASS, "Assignments is displayed");
            homePage.validateTextOfAssignments("30+ Assignments");
            logger.info("Assignments is validated");
            test.log(Status.PASS, "Assignments is validated");
        } else {
            test.log(Status.FAIL, "Assignments is not displayed");
            logger.info("Assignments is not displayed");
        }
        if (homePage.ifTurnKnowledgeIntoActionIsDisplayed()) {
            logger.info("Turn knowledge into action is displayed");
            test.log(Status.PASS, "Turn knowledge into action is displayed");
            homePage.validateTextOfTurnKnowledgeIntoAction("To turn knowledge into action");
            logger.info("Turn knowledge into action is validated");
            test.log(Status.PASS, "Turn knowledge into action is validated");
        } else {
            test.log(Status.FAIL, "Turn knowledge into action is not displayed");
            logger.info("Turn knowledge into action is not displayed");
        }
        if (homePage.ifMentorshipSessionsIsDisplayed()) {
            logger.info("Mentorship sessions is displayed");
            test.log(Status.PASS, "Mentorship sessions is displayed");
            homePage.validateTextOfMentorshipSessions("75+ Mentorship Sessions");
            logger.info("Mentorship sessions is validated");
            test.log(Status.PASS, "Mentorship sessions is validated");
        } else {
            test.log(Status.FAIL, "Mentorship sessions is not displayed");
            logger.info("Mentorship sessions is not displayed");
        }
        if (homePage.ifLiveMentorshipSessionIsDisplayed()) {
            logger.info("Live mentorship session is displayed");
            test.log(Status.PASS, "Live mentorship session is displayed");
            homePage.validateTextOfLiveMentorshipSession("1:1 live mentorship session from GenAI and Agentic AI experts");
            logger.info("Live mentorship session is validated");
            test.log(Status.PASS, "Live mentorship session is validated");
        } else {
            test.log(Status.FAIL, "Live mentorship session is not displayed");
            logger.info("Live mentorship session is not displayed");
        }

    }

    @Test(priority = 7)
    public void validatingFourthScreen() {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingPersonalizedRoadmapScreen", "Validating Personalized Roadmap section").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());
        if (homePage.ifPersonalizedRoadmapSectionIsDisplayed()){
            logger.info("Personalized roadmap section is displayed");
            test.log(Status.PASS, "Personalized roadmap section is displayed");
            homePage.validateTextOfPersonalizedRoadmapSection("Personalized Roadmap");
            logger.info("Personalized roadmap section is validated");
            test.log(Status.PASS, "Personalized roadmap section is validated");
        } else {
            test.log(Status.FAIL, "Personalized roadmap section is not displayed");
            logger.info("Personalized roadmap section is not displayed");
        }
        if(homePage.ifYourAmbitionIsDisplayed()){
            logger.info("Your ambition is displayed");
            test.log(Status.PASS, "Your ambition is displayed");
            homePage.validateTextOfYourAmbition("Your ambition + our expertise = your custom path to mastery");
            logger.info("Your ambition is validated");
            test.log(Status.PASS, "Your ambition is validated");
        } else {
            test.log(Status.FAIL, "Your ambition is not displayed");
            logger.info("Your ambition is not displayed");
        }
        if(homePage.ifRequestCallbackButtonIsDisplayed()){
            logger.info("Request callback button is displayed");
            test.log(Status.PASS, "Request callback button is displayed");
            homePage.validateTextOfRequestCallbackButton("Request Callback");
            homePage.clickRequestCallbackButton();
            homePage.clickOnCloseButtonInPopUp();
            logger.info("Request callback button is validated");
            test.log(Status.PASS, "Request callback button is validated");
        } else {
            test.log(Status.FAIL, "Request callback button is not displayed");
            logger.info("Request callback button is not displayed");
        }
        if(homePage.ifGetPersonalizedRoadmapButtonIsDisplayed()){
            logger.info("Get personalized roadmap button is displayed");
            test.log(Status.PASS, "Get personalized roadmap button is displayed");
            homePage.validateTextOfGetPersonalizedRoadmapButton("Get Personalized Roadmap");
            homePage.clickGetPersonalizedRoadmapButton();
            homePage.clickOnCloseButtonInPopUp();
            logger.info("Get personalized roadmap button is validated");
            test.log(Status.PASS, "Get personalized roadmap button is validated");
        } else {
            test.log(Status.FAIL, "Get personalized roadmap button is not displayed");
            logger.info("Get personalized roadmap button is not displayed");
        }

    }

    @Test(priority = 8)
    public void validatingFifthScreen() {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingFifthScreen", "Validating Curriculum section").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());
        if (homePage.ifCurriculumIsDisplayed()){
            logger.info("Curriculum is displayed");
            test.log(Status.PASS, "Curriculum is displayed");
            homePage.validateTextOfCurriculum("Curriculum");
            logger.info("Curriculum is validated");
            test.log(Status.PASS, "Curriculum is validated");
        } else {
            test.log(Status.FAIL, "Curriculum is not displayed");
            logger.info("Curriculum is not displayed");
        }
        if(homePage.ifFromPythonFoundationsIsDisplayed()){
            logger.info("From python foundations is displayed");
            test.log(Status.PASS, "From python foundations is displayed");
            homePage.validateTextOfFromPythonFoundations("From Python foundations to GenAI and Agentic AI : Master 14 cutting-edge modules");
            logger.info("From python foundations is validated");
            test.log(Status.PASS, "From python foundations is validated");
        } else {
            test.log(Status.FAIL, "From python foundations is not displayed");
            logger.info("From python foundations is not displayed");
        }
        if(homePage.ifProjects3IsDisplayed()){
            logger.info("Projects is displayed");
            test.log(Status.PASS, "Projects is displayed");
            homePage.validateTextOfProjects3("50+ Projects");
            logger.info("Projects is validated");
            test.log(Status.PASS, "Projects is validated");
        } else {
            test.log(Status.FAIL, "Projects is not displayed");
            logger.info("Projects is not displayed");
        }
        if(homePage.ifHoursOfImmersiveLearning3IsDisplayed()){
            logger.info("Hours of immersive learning is displayed");
            test.log(Status.PASS, "Hours of immersive learning is displayed");
            homePage.validateTextOfHoursOfImmersiveLearning3("300+ Hours");
            logger.info("Hours of immersive learning is validated");
            test.log(Status.PASS, "Hours of immersive learning is validated");
        } else {
            test.log(Status.FAIL, "Hours of immersive learning is not displayed");
            logger.info("Hours of immersive learning is not displayed");
        }
        if(homePage.ifToolsIsDisplayed()){
            logger.info("Tools is displayed");
            test.log(Status.PASS, "Tools is displayed");
            homePage.validateTextOfTools("40+ Tools");
            logger.info("Tools is validated");
            test.log(Status.PASS, "Tools is validated");
        } else {
            test.log(Status.FAIL, "Tools is not displayed");
            logger.info("Tools is not displayed");
        }

        if(homePage.ifAssignments2IsDisplayed()){
            logger.info("Assignments is displayed");
            test.log(Status.PASS, "Assignments is displayed");
            homePage.validateTextOfAssignments2("30+ Assignments");
            logger.info("Assignments is validated");
            test.log(Status.PASS, "Assignments is validated");
        } else {
            test.log(Status.FAIL, "Assignments is not displayed");
            logger.info("Assignments is not displayed");
        }

        if(homePage.ifChooseWhatToLearnImageIsDisplayed()){
            logger.info("Choose what to learn image is displayed");
            test.log(Status.PASS, "Choose what to learn image is displayed");
            logger.info("Choose what to learn image is validated");
            test.log(Status.PASS, "Choose what to learn image is validated");
        } else {
            test.log(Status.FAIL, "Choose what to learn image is not displayed");
            logger.info("Choose what to learn image is not displayed");
        }
        if(homePage.ifDownloadFreeCurriculumButtonIsDisplayed()){
            logger.info("Download free curriculum button is displayed");
            test.log(Status.PASS, "Download free curriculum button is displayed");
            homePage.validateTextOfDownloadFreeCurriculumButton("Download Free Curriculum");
            homePage.clickDownloadFreeCurriculumButton();
            homePage.clickOnCloseButtonInPopUp();
            logger.info("Download free curriculum button is validated");
            test.log(Status.PASS, "Download free curriculum button is validated");
        } else {
            test.log(Status.FAIL, "Download free curriculum button is not displayed");
            logger.info("Download free curriculum button is not displayed");
        }

    }

    @Test(priority = 9)
    public void validateFifthScreenContactBox() {
        ExtentTest test = extent.createTest("TC" + getClass() + "validatingFifthScreenContactBox", "Validating Libraries & Frameworks section").assignCategory(moduleName);
        setExtentTest(test);
        HomePage homePage = new HomePage(getDriver());
        if (homePage.ifLibrariesAndFrameworksIsDisplayed()){
            logger.info("Libraries and Frameworks is displayed");
            test.log(Status.PASS, "Libraries and Frameworks is displayed");
            homePage.validateTextOfLibrariesAndFrameworks("Libraries & Frameworks");
            logger.info("Libraries and Frameworks is validated");
            test.log(Status.PASS, "Libraries and Frameworks is validated");

        }else {
            test.log(Status.FAIL, "Libraries and Frameworks is not displayed");
            logger.info("Libraries and Frameworks is not displayed");
        }
        if(homePage.ifMaster40LibrariesIsDisplayed()){
            logger.info("Master 40 libraries is displayed");
            test.log(Status.PASS, "Master 40 libraries is displayed");
            homePage.validateTextOfMaster40Libraries("Master 40+ GenAI and Agentic AI tools, libraries and frameworks for skill-building");
            logger.info("Master 40 libraries is validated");
            test.log(Status.PASS, "Master 40 libraries is validated");
        } else {
            test.log(Status.FAIL, "Master 40 libraries is not displayed");
            logger.info("Master 40 libraries is not displayed");
        }

        if(homePage.ifDownloadToolsPackButtonIsDisplayed()){
            logger.info("Download tools pack button is displayed");
            test.log(Status.PASS, "Download tools pack button is displayed");
            homePage.validateTextOfDownloadToolsPackButton("Download Tools Pack");
            homePage.clickDownloadToolsPackButton();
            homePage.clickOnCloseButtonInPopUp();
            logger.info("Download tools pack button is validated");
            test.log(Status.PASS, "Download tools pack button is validated");
        } else {
            test.log(Status.FAIL, "Download tools pack button is not displayed");
            logger.info("Download tools pack button is not displayed");
        }


    }



}
