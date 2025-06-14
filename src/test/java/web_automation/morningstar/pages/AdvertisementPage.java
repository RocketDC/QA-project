package web_automation.morningstar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import web_automation.morningstar.base.TestBase;


public class AdvertisementPage extends TestBase {
    WebDriver driver;

    public AdvertisementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //  Morningstar Investment Conference India Details Page

    //Morningstar brands and products locator
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement morningstarBrandsAndProducts;

    public boolean isMorningstarBrandsAndProductsDisplayed() {
        return isDisplayed(morningstarBrandsAndProducts);
    }

    public void clickOnMorningstarBrandsAndProducts() {
        click(morningstarBrandsAndProducts, "Morningstar Brands and Products");
    }

    public void validateTextMorningstarBrandsAndProducts(String expectedText) {
        softAssert(morningstarBrandsAndProducts, expectedText);
    }

    // Company text locator
    @FindBy(xpath = "(//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span)[3]")
    private WebElement companyText;

    public boolean isCompanyTextDisplayed() {
        return isDisplayed(companyText);
    }

    public void clickOnCompanyText() {
        click(companyText, "Company Text");
    }

    public void validateTextCompanyText(String expectedText) {
        softAssert(companyText, expectedText);
    }

    //Morningstar logo locator
    @FindBy(xpath = "//img[@alt='Morningstar India']")
    private WebElement morningstarLogo;

    public boolean isMorningstarLogoDisplayed() {
        return isDisplayed(morningstarLogo);
    }

    public void clickOnMorningstarLogo() {
        click(morningstarLogo, "Morningstar Logo");
    }

    public void validateTextMorningstarLogo(String expectedText) {
        softAssert(morningstarLogo, expectedText);
    }

    //Morningstar Investment Conference India text
    @FindBy(xpath = "//*[@class='ck-page-nav__bar__heading']")
    private WebElement morningstarInvestmentConferenceIndia;

    public boolean isMorningstarInvestmentConferenceIndiaDisplayed() {
        return isDisplayed(morningstarInvestmentConferenceIndia);
    }

    public void clickOnMorningstarInvestmentConferenceIndia() {
        click(morningstarInvestmentConferenceIndia, "Morningstar Investment Conference India");
    }

    public void validateTextMorningstarInvestmentConferenceIndia(String expectedText) {
        softAssert(morningstarInvestmentConferenceIndia, expectedText);
    }

    //Brands text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement brandsText;

    public boolean isBrandsTextDisplayed() {
        return isDisplayed(brandsText);
    }

    public void clickOnBrandsText() {
        click(brandsText, "Brands Text");
    }

    public void validateTextBrandsText(String expectedText) {
        softAssert(brandsText, expectedText);
    }

    //Products text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement productsText;

    public boolean isProductsTextDisplayed() {
        return isDisplayed(productsText);
    }

    public void clickOnProductsText() {
        click(productsText, "Products Text");
    }

    public void validateTextProductsText(String expectedText) {
        softAssert(productsText, expectedText);
    }

    // Segments text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement segmentsText;

    public boolean isSegmentsTextDisplayed() {
        return isDisplayed(segmentsText);
    }

    public void clickOnSegmentsText() {
        click(segmentsText, "Segments Text");
    }

    public void validateTextSegmentsText(String expectedText) {
        softAssert(segmentsText, expectedText);
    }

    //Insights text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement insightsText;

    public boolean isInsightsTextDisplayed() {
        return isDisplayed(insightsText);
    }

    public void clickOnInsightsText() {
        click(insightsText, "Insights Text");
    }

    public void validateTextInsightsText(String expectedText) {
        softAssert(insightsText, expectedText);
    }

    // Overview text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement overviewText;

    public boolean isOverviewTextDisplayed() {
        return isDisplayed(overviewText);
    }

    public void clickOnOverviewText() {
        click(overviewText, "Overview Text");
    }

    public void validateTextOverviewText(String expectedText) {
        softAssert(overviewText, expectedText);
    }

    // Agenda text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement agendaText;

    public boolean isAgendaTextDisplayed() {
        return isDisplayed(agendaText);
    }

    public void clickOnAgendaText() {
        click(agendaText, "Agenda Text");
    }

    public void validateTextAgendaText(String expectedText) {
        softAssert(agendaText, expectedText);
    }

    // Travel text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement travelText;

    public boolean isTravelTextDisplayed() {
        return isDisplayed(travelText);
    }

    public void clickOnTravelText() {
        click(travelText, "Travel Text");
    }

    public void validateTextTravelText(String expectedText) {
        softAssert(travelText, expectedText);
    }

    // Partners text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement partnersText;

    public boolean isPartnersTextDisplayed() {
        return isDisplayed(partnersText);
    }

    public void clickOnPartnersText() {
        click(partnersText, "Partners Text");
    }

    public void validateTextPartnersText(String expectedText) {
        softAssert(partnersText, expectedText);
    }

    // FAQ text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement faqText;

    public boolean isFaqTextDisplayed() {
        return isDisplayed(faqText);
    }

    public void clickOnFaqText() {
        click(faqText, "Faq Text");
    }

    public void validateTextFaqText(String expectedText) {
        softAssert(faqText, expectedText);
    }   

    //Register now Button
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement registerNowButton;

    public boolean isRegisterNowButtonDisplayed() {
        return isDisplayed(registerNowButton);
    }

    public void clickOnRegisterNowButton() {
        click(registerNowButton, "Register Now Button");
    }

    public void validateTextRegisterNowButton(String expectedText) {
        softAssert(registerNowButton, expectedText);
    }

    //Welcome to the Morningstar Investment Conference India 2025 heading
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement welcomeToTheMorningstarInvestmentConferenceIndia2025Heading;

    public boolean isWelcomeToTheMorningstarInvestmentConferenceIndia2025HeadingDisplayed() {
        return isDisplayed(welcomeToTheMorningstarInvestmentConferenceIndia2025Heading);
    }

    public void clickOnWelcomeToTheMorningstarInvestmentConferenceIndia2025Heading() {
        click(welcomeToTheMorningstarInvestmentConferenceIndia2025Heading, "Welcome To The Morningstar Investment Conference India 2025 Heading");
    }

    public void validateTextWelcomeToTheMorningstarInvestmentConferenceIndia2025Heading(String expectedText) {
        softAssert(welcomeToTheMorningstarInvestmentConferenceIndia2025Heading, expectedText);
    }

   //Welcome to the Morningstar Investment Conference India 2025 Sub-heading
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement welcomeToTheMorningstarInvestmentConferenceIndia2025SubHeading;

    public boolean isWelcomeToTheMorningstarInvestmentConferenceIndia2025SubHeadingDisplayed() {
        return isDisplayed(welcomeToTheMorningstarInvestmentConferenceIndia2025SubHeading);
    }

    public void clickOnWelcomeToTheMorningstarInvestmentConferenceIndia2025SubHeading() {
        click(welcomeToTheMorningstarInvestmentConferenceIndia2025SubHeading, "Welcome To The Morningstar Investment Conference India 2025 Sub-Heading");
    }

    public void validateTextWelcomeToTheMorningstarInvestmentConferenceIndia2025SubHeading(String expectedText) {
        softAssert(welcomeToTheMorningstarInvestmentConferenceIndia2025SubHeading, expectedText);
    }

    // Date of conference
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement dateOfConference;

    public boolean isDateOfConferenceDisplayed() {
        return isDisplayed(dateOfConference);
    }

    public void clickOnDateOfConference() {
        click(dateOfConference, "Date Of Conference");
    }

    public void validateTextDateOfConference(String expectedText) {
        softAssert(dateOfConference, expectedText);
    }

    //location of conference
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement locationOfConference;

    public boolean isLocationOfConferenceDisplayed() {
        return isDisplayed(locationOfConference);
    }

    public void clickOnLocationOfConference() {
        click(locationOfConference, "Location Of Conference");
    }

    public void validateTextLocationOfConference(String expectedText) {
        softAssert(locationOfConference, expectedText);
    }

    //Register Now Button2
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement registerNowButton2;

    public boolean isRegisterNowButton2Displayed() {
        return isDisplayed(registerNowButton2);
    }

    public void clickOnRegisterNowButton2() {
        click(registerNowButton2, "Register Now Button2");
    }

    public void validateTextRegisterNowButton2(String expectedText) {
        softAssert(registerNowButton2, expectedText);
    }

    // Watch video Button
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement watchVideoButton;

    public boolean isWatchVideoButtonDisplayed() {
        return isDisplayed(watchVideoButton);
    }

    public void clickOnWatchVideoButton() {
        click(watchVideoButton, "Watch Video Button");
    }

    public void validateTextWatchVideoButton(String expectedText) {
        softAssert(watchVideoButton, expectedText);
    }

    //Countdown Timer Text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement countdownTimerText;

    public boolean isCountdownTimerTextDisplayed() {
        return isDisplayed(countdownTimerText);
    }

    public void clickOnCountdownTimerText() {
        click(countdownTimerText, "Countdown Timer Text");
    }

    public void validateTextCountdownTimerText(String expectedText) {
        softAssert(countdownTimerText, expectedText);
    }

    //   Countdown timer
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement countdownTimer;

    public boolean isCountdownTimerDisplayed() {
        return isDisplayed(countdownTimer);
    }

    public void clickOnCountdownTimer() {
        click(countdownTimer, "Countdown Timer");
    }

    public void validateTextCountdownTimer(String expectedText) {
        softAssert(countdownTimer, expectedText);
    }

    // Speaker section header
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement speakerSectionHeader;

    public boolean isSpeakerSectionHeaderDisplayed() {
        return isDisplayed(speakerSectionHeader);
    }

    public void clickOnSpeakerSectionHeader() {
        click(speakerSectionHeader, "Speaker Section Header");
    }

    public void validateTextSpeakerSectionHeader(String expectedText) {
        softAssert(speakerSectionHeader, expectedText);
    }

    // Speaker section sub-header
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement speakerSectionSubHeader;

    public boolean isSpeakerSectionSubHeaderDisplayed() {
        return isDisplayed(speakerSectionSubHeader);
    }

    public void clickOnSpeakerSectionSubHeader() {
        click(speakerSectionSubHeader, "Speaker Section Sub-Header");
    }

    public void validateTextSpeakerSectionSubHeader(String expectedText) {
        softAssert(speakerSectionSubHeader, expectedText);
    }

    // Stand out as Sponsors Text 
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement standOutAsSponsorsText;

    public boolean isStandOutAsSponsorsTextDisplayed() {
        return isDisplayed(standOutAsSponsorsText);
    }

    public void clickOnStandOutAsSponsorsText() {
        click(standOutAsSponsorsText, "Stand Out As Sponsors Text");
    }

    public void validateTextStandOutAsSponsorsText(String expectedText) {
        softAssert(standOutAsSponsorsText, expectedText);
    }

    // Stand out as Sponsors Sub-Text
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement standOutAsSponsorsSubText;

    public boolean isStandOutAsSponsorsSubTextDisplayed() {
        return isDisplayed(standOutAsSponsorsSubText);
    }

    public void clickOnStandOutAsSponsorsSubText() {
        click(standOutAsSponsorsSubText, "Stand Out As Sponsors Sub-Text");
    }

    public void validateTextStandOutAsSponsorsSubText(String expectedText) {
        softAssert(standOutAsSponsorsSubText, expectedText);
    }

    // Become a sponsor Button
    @FindBy(xpath = "//div[@class='mmds-top-hat-item--type mmds-top-hat-item--drawer']/button/span")
    private WebElement becomeASponsorButton;

    public boolean isBecomeASponsorButtonDisplayed() {
        return isDisplayed(becomeASponsorButton);
    }

    public void clickOnBecomeASponsorButton() {
        click(becomeASponsorButton, "Become a Sponsor Button");
    }

    public void validateTextBecomeASponsorButton(String expectedText) {
        softAssert(becomeASponsorButton, expectedText);
    }

    // 
}