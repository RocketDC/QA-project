package web_automation.chase.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import web_automation.chase.base.TestBase;

public class HomePage extends TestBase {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToChaseUrl(String url) {
        driver.navigate().to(url);
    }

    public void validateChaseTitle(String title) {
        vaildatePageTitle(title);
    }

    //Personal CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement presonalCTAText;

    public boolean isPersonalCTADisplayed() {
        return isDisplayed(presonalCTAText);
    }

    public void validatePersonalCTAText(String text) {
        softAssert(presonalCTAText, text);
    }

    //Business CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement businessCTAText;

    public boolean isBusinessCTADisplayed() {
        return isDisplayed(businessCTAText);
    }

    public void validateBusinessCTAText(String text) {
        softAssert(businessCTAText, text);
    }

    //Commercial CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement commercialCTAText;

    public boolean isCommercialCTADisplayed() {
        return isDisplayed(commercialCTAText);
    }

    public void validateCommercialCTAText(String text) {
        softAssert(commercialCTAText, text);
    }

    //Chase logo
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseLogo;

    public boolean isChaseLogoDisplayed() {
        return isDisplayed(chaseLogo);
    }

    //Schedule meeting CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement scheduleMeetingCTAText;

    public boolean isScheduleMeetingCTADisplayed() {
        return isDisplayed(scheduleMeetingCTAText);
    }

    public void validateScheduleMeetingCTAText(String text) {
        softAssert(scheduleMeetingCTAText, text);
    }

    //Customer service CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement customerServiceCTAText;

    public boolean isCustomerServiceCTADisplayed() {
        return isDisplayed(customerServiceCTAText);
    }

    public void validateCustomerServiceCTAText(String text) {
        softAssert(customerServiceCTAText, text);
    }

    //Change Language CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement changeLanguageCTAText;

    public boolean isChangeLanguageCTADisplayed() {
        return isDisplayed(changeLanguageCTAText);
    }

    public void validateChangeLanguageCTAText(String text) {
        softAssert(changeLanguageCTAText, text);
    }

    //Search Icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement searchIcon;

    public boolean isSearchIconDisplayed() {
        return isDisplayed(searchIcon);
    }

    //Checking CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement checkingCTAText;

    public boolean isCheckingCTADisplayed() {
        return isDisplayed(checkingCTAText);
    }

    public void validateCheckingCTAText(String text) {
        softAssert(checkingCTAText, text);
    }

    public void clickCheckingCTAText() {
        click(checkingCTAText, "Checking CTA Text");
    }

    //Savings CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement savingsCTAText;

    public boolean isSavingsCTADisplayed() {
        return isDisplayed(savingsCTAText);
    }

    public void validateSavingsCTAText(String text) {
        softAssert(savingsCTAText, text);
    }

    public void clickSavingsCTAText() {
        click(savingsCTAText, "Savings CTA Text");
    }

    //Credit CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement creditCTAText;

    public boolean isCreditCTADisplayed() {
        return isDisplayed(creditCTAText);
    }

    public void validateCreditCTAText(String text) {
        softAssert(creditCTAText, text);
    }

    public void clickCreditCTAText() {
        click(creditCTAText, "Credit CTA Text");
    }

    //Home Loans CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement homeLoansCTAText;

    public boolean isHomeLoansCTADisplayed() {
        return isDisplayed(homeLoansCTAText);
    }

    public void validateHomeLoansCTAText(String text) {
        softAssert(homeLoansCTAText, text);
    }

    public void clickHomeLoansCTAText() {
        click(homeLoansCTAText, "Home Loans CTA Text");
    }

    //Auto Loans CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement autoLoansCTAText;

    public boolean isAutoLoansCTADisplayed() {
        return isDisplayed(autoLoansCTAText);
    }

    public void validateAutoLoansCTAText(String text) {
        softAssert(autoLoansCTAText, text);
    }

    public void clickAutoLoansCTAText() {
        click(autoLoansCTAText, "Auto Loans CTA Text");
    }

    //Investing By JP Morgan
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement investingByJP_Morgan;

    public boolean isInvestingByJP_MorganDisplayed() {
        return isDisplayed(investingByJP_Morgan);
    }

    public void validateInvestingByJP_Morgan(String text) {
        softAssert(investingByJP_Morgan, text);
    }

    public void clickInvestingByJP_Morgan() {
        click(investingByJP_Morgan, "Investing By JP Morgan");
    }

    //Education CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement educationCTAText;

    public boolean isEducationCTADisplayed() {
        return isDisplayed(educationCTAText);
    }

    public void validateEducationCTAText(String text) {
        softAssert(educationCTAText, text);
    }

    public void clickEducationCTAText() {
        click(educationCTAText, "Education CTA Text");
    }

    //Travel CTA Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement travelCTAText;

    public boolean isTravelCTADisplayed() {
        return isDisplayed(travelCTAText);
    }

    public void validateTravelCTAText(String text) {
        softAssert(travelCTAText, text);
    }

    public void clickTravelCTAText() {
        click(travelCTAText, "Travel CTA Text");
    }

    //Chase card icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseCardIcon;

    public boolean isChaseCardIconDisplayed() {
        return isDisplayed(chaseCardIcon);
    }

    public void validateChaseCardIcon(String text) {
        softAssert(chaseCardIcon, text);
    }

    // Our Best Offer Ever text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement ourBestOfferEverText;

    public boolean isOurBestOfferEverTextDisplayed() {
        return isDisplayed(ourBestOfferEverText);
    }

    public void validateOurBestOfferEverText(String text) {
        softAssert(ourBestOfferEverText, text);
    }

    //Section Heading
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement sectionHeading;

    public boolean isSectionHeadingDisplayed() {
        return isDisplayed(sectionHeading);
    }

    public void validateSectionHeading(String text) {
        softAssert(sectionHeading, text);
    }

    //Section Sub Heading
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement sectionSubHeading;

    public boolean isSectionSubHeadingDisplayed() {
        return isDisplayed(sectionSubHeading);
    }

    public void validateSectionSubHeading(String text) {
        softAssert(sectionSubHeading, text);
    }

    //See details Button 
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement seeDetailsButton;

    public boolean isSeeDetailsButtonDisplayed() {
        return isDisplayed(seeDetailsButton);
    }

    public void validateSeeDetailsButton(String text) {
        softAssert(seeDetailsButton, text);
    }

    public void clickSeeDetailsButton() {
        click(seeDetailsButton, "See details Button");
    }

    //Welcome/Login section heading
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement welcomeLoginSectionHeading;

    public boolean isWelcomeLoginSectionHeadingDisplayed() {
        return isDisplayed(welcomeLoginSectionHeading);
    }

    public void validateWelcomeLoginSectionHeading(String text) {
        softAssert(welcomeLoginSectionHeading, text);
    }

    //Username field
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement usernameField;

    public boolean isUsernameFieldDisplayed() {
        return isDisplayed(usernameField);
    }

    public void validateUsernameField(String text) {
        softAssert(usernameField, text);
    }

    //Username Input
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement usernameInput;

    public boolean isUsernameInputDisplayed() {
        return isDisplayed(usernameInput);
    }

    public void validateUsernameInput(String text) {
        softAssert(usernameInput, text);
    }

    public void enterUsernameInput(String text) {
        sendKeys(usernameInput, text);
    }

    //Password field
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement passwordField;

    public boolean isPasswordFieldDisplayed() {
        return isDisplayed(passwordField);
    }

    public void validatePasswordField(String text) {
        softAssert(passwordField, text);
    }

    //Password Input
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement passwordInput;

    public boolean isPasswordInputDisplayed() {
        return isDisplayed(passwordInput);
    }

    public void validatePasswordInput(String text) {
        softAssert(passwordInput, text);
    }

    public void enterPasswordInput(String text) {
        sendKeys(passwordInput, text);
    }

    // Remember me checkbox
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement rememberMeCheckbox;

    public boolean isRememberMeCheckboxDisplayed() {
        return isDisplayed(rememberMeCheckbox);
    }

    public void validateRememberMeCheckbox(String text) {
        softAssert(rememberMeCheckbox, text);
    }

    public void clickRememberMeCheckbox() {
        click(rememberMeCheckbox, "Remember me Checkbox");
    }

    //Remember me Text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement rememberMeText;

    public boolean isRememberMeTextDisplayed() {
        return isDisplayed(rememberMeText);
    }

    public void validateRememberMeText(String text) {
        softAssert(rememberMeText, text);
    }

    //Use token CTA text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement useTokenCTAText;

    public boolean isUseTokenCTATextDisplayed() {
        return isDisplayed(useTokenCTAText);
    }

    public void validateUseTokenCTAText(String text) {
        softAssert(useTokenCTAText, text);
    }

    public void clickUseTokenCTAText() {
        click(useTokenCTAText, "Use token CTA Text");
    }

    //Sign In button
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement signInButton;

    public boolean isSignInButtonDisplayed() {
        return isDisplayed(signInButton);
    }

    public void validateSignInButton(String text) {
        softAssert(signInButton, text);
    }

    public void clickSignInButton() {
        click(signInButton, "Sign In Button");
    }

    //Forgot username CTA
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement forgotUsernameCTA;

    public boolean isForgotUsernameCTADisplayed() {
        return isDisplayed(forgotUsernameCTA);
    }

    public void validateForgotUsernameCTA(String text) {
        softAssert(forgotUsernameCTA, text);
    }

    public void clickForgotUsernameCTA() {
        click(forgotUsernameCTA, "Forgot username CTA");
    }

    //Sign Up CTA
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement signUpCTA;

    public boolean isSignUpCTADisplayed() {
        return isDisplayed(signUpCTA);
    }

    public void validateSignUpCTA(String text) {
        softAssert(signUpCTA, text);
    }

    public void clickSignUpCTA() {
        click(signUpCTA, "Sign Up CTA");
    }

    //Choose what's Section heading
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chooseWhatsSectionHeading;

    public boolean isChooseWhatsSectionHeadingDisplayed() {
        return isDisplayed(chooseWhatsSectionHeading);
    }

    public void validateChooseWhatsSectionHeading(String text) {
        softAssert(chooseWhatsSectionHeading, text);
    }

    //Business icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement businessIcon;

    public boolean isBusinessIconDisplayed() {
        return isDisplayed(businessIcon);
    }

    public void validateBusinessIcon(String text) {
        softAssert(businessIcon, text);
    }

    //Business text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement businessText;

    public boolean isBusinessTextDisplayed() {
        return isDisplayed(businessText);
    }

    public void validateBusinessText(String text) {
        softAssert(businessText, text);
    }

    //Cards Icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement cardsIcon;

    public boolean isCardsIconDisplayed() {
        return isDisplayed(cardsIcon);
    }

    public void validateCardsIcon(String text) {
        softAssert(cardsIcon, text);
    }

    //Cards text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement cardsText;

    public boolean isCardsTextDisplayed() {
        return isDisplayed(cardsText);
    }

    public void validateCardsText(String text) {
        softAssert(cardsText, text);
    }

    //Checking icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement checkingIcon;

    public boolean isCheckingIconDisplayed() {
        return isDisplayed(checkingIcon);
    }

    public void validateCheckingIcon(String text) {
        softAssert(checkingIcon, text);
    }

    //Checking text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement checkingText;

    public boolean isCheckingTextDisplayed() {
        return isDisplayed(checkingText);
    }

    public void validateCheckingText(String text) {
        softAssert(checkingText, text);
    }

    //Travel icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement travelIcon;

    public boolean isTravelIconDisplayed() {
        return isDisplayed(travelIcon);
    }

    public void validateTravelIcon(String text) {
        softAssert(travelIcon, text);
    }

    //Travel text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement travelText;

    public boolean isTravelTextDisplayed() {
        return isDisplayed(travelText);
    }

    public void validateTravelText(String text) {
        softAssert(travelText, text);
    }

    //Saving icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement savingIcon;

    public boolean isSavingIconDisplayed() {
        return isDisplayed(savingIcon);
    }

    public void validateSavingIcon(String text) {
        softAssert(savingIcon, text);
    }

    //Saving text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement savingText;

    public boolean isSavingTextDisplayed() {
        return isDisplayed(savingText);
    }

    public void validateSavingText(String text) {
        softAssert(savingText, text);
    }

    //Home loans icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement homeLoansIcon;

    public boolean isHomeLoansIconDisplayed() {
        return isDisplayed(homeLoansIcon);
    }

    public void validateHomeLoansIcon(String text) {
        softAssert(homeLoansIcon, text);
    }

    //Home loans text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement homeLoansText;

    public boolean isHomeLoansTextDisplayed() {
        return isDisplayed(homeLoansText);
    }

    public void validateHomeLoansText(String text) {
        softAssert(homeLoansText, text);
    }

    //Auto loans icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement autoLoansIcon;

    public boolean isAutoLoansIconDisplayed() {
        return isDisplayed(autoLoansIcon);
    }

    public void validateAutoLoansIcon(String text) {
        softAssert(autoLoansIcon, text);
    }

    //Auto loans text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement autoLoansText;

    public boolean isAutoLoansTextDisplayed() {
        return isDisplayed(autoLoansText);
    }

    public void validateAutoLoansText(String text) {
        softAssert(autoLoansText, text);
    }

    //Chase Total Checking Banner Heading
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseTotalCheckingBannerHeading;

    public boolean isChaseTotalCheckingBannerHeadingDisplayed() {
        return isDisplayed(chaseTotalCheckingBannerHeading);
    }

    public void validateChaseTotalCheckingBannerHeading(String text) {
        softAssert(chaseTotalCheckingBannerHeading, text);
    }

    //Chase Total Checking Banner sub-text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseTotalCheckingBannerSubText;

    public boolean isChaseTotalCheckingBannerSubTextDisplayed() {
        return isDisplayed(chaseTotalCheckingBannerSubText);
    }

    public void validateChaseTotalCheckingBannerSubText(String text) {
        softAssert(chaseTotalCheckingBannerSubText, text);
    }

    // Chase Total button
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseTotalButton;

    public boolean isChaseTotalButtonDisplayed() {
        return isDisplayed(chaseTotalButton);
    }

    public void validateChaseTotalButton(String text) {
        softAssert(chaseTotalButton, text);
    }

    public void clickChaseTotalButton() {
        click(chaseTotalButton, "Chase Total Button");
    }

    //Chase Auto Banner text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseAutoBannerText;

    public boolean isChaseAutoBannerTextDisplayed() {
        return isDisplayed(chaseAutoBannerText);
    }

    public void validateChaseAutoBannerText(String text) {
        softAssert(chaseAutoBannerText, text);
    }

    //Chase total sub-text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseTotalSubText;

    public boolean isChaseTotalSubTextDisplayed() {
        return isDisplayed(chaseTotalSubText);
    }

    public void validateChaseTotalSubText(String text) {
        softAssert(chaseTotalSubText, text);
    }

    //Chase auto button
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseAutoButton;

    public boolean isChaseAutoButtonDisplayed() {
        return isDisplayed(chaseAutoButton);
    }

    public void validateChaseAutoButton(String text) {
        softAssert(chaseAutoButton, text);
    }

    public void clickChaseAutoButton() {
        click(chaseAutoButton, "Chase Auto Button");
    }

    //Chase Freedom Unlimited Banner text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseFreedomUnlimitedBannerText;

    public boolean isChaseFreedomUnlimitedBannerTextDisplayed() {
        return isDisplayed(chaseFreedomUnlimitedBannerText);
    }

    public void validateChaseFreedomUnlimitedBannerText(String text) {
        softAssert(chaseFreedomUnlimitedBannerText, text);
    }

    //Chase Freedom Unlimited Banner sub-text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseFreedomUnlimitedBannerSubText;

    public boolean isChaseFreedomUnlimitedBannerSubTextDisplayed() {
        return isDisplayed(chaseFreedomUnlimitedBannerSubText);
    }

    public void validateChaseFreedomUnlimitedBannerSubText(String text) {
        softAssert(chaseFreedomUnlimitedBannerSubText, text);
    }

    //Chase Freedom Unlimited button
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement chaseFreedomUnlimitedButton;

    public boolean isChaseFreedomUnlimitedButtonDisplayed() {
        return isDisplayed(chaseFreedomUnlimitedButton);
    }

    public void validateChaseFreedomUnlimitedButton(String text) {
        softAssert(chaseFreedomUnlimitedButton, text);
    }

    public void clickChaseFreedomUnlimitedButton() {
        click(chaseFreedomUnlimitedButton, "Chase Freedom Unlimited Button");
    }

    //Earn upto 500 icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement earnUpto500Icon;

    public boolean isEarnUpto500IconDisplayed() {
        return isDisplayed(earnUpto500Icon);
    }

    //Earn upto 500 text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement earnUpto500Text;

    public boolean isEarnUpto500TextDisplayed() {
        return isDisplayed(earnUpto500Text);
    }

    public void validateEarnUpto500Text(String text) {
        softAssert(earnUpto500Text, text);
    }

    //Earn upto 500 sub-text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement earnUpto500SubText;

    public boolean isEarnUpto500SubTextDisplayed() {
        return isDisplayed(earnUpto500SubText);
    }

    public void validateEarnUpto500SubText(String text) {
        softAssert(earnUpto500SubText, text);
    }

    //Earn upto 500 button
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement earnUpto500Button;

    public boolean isEarnUpto500ButtonDisplayed() {
        return isDisplayed(earnUpto500Button);
    }

    public void validateEarnUpto500Button(String text) {
        softAssert(earnUpto500Button, text);
    }

    public void clickEarnUpto500Button() {
        click(earnUpto500Button, "Earn Upto 500 Button");
    }

    //Enjoy 125 icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement enjoy125Icon;

    public boolean isEnjoy125IconDisplayed() {
        return isDisplayed(enjoy125Icon);
    }

    public void validateEnjoy125Icon(String text) {
        softAssert(enjoy125Icon, text);
    }

    //Enjoy 125 text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement enjoy125Text;

    public boolean isEnjoy125TextDisplayed() {
        return isDisplayed(enjoy125Text);
    }

    public void validateEnjoy125Text(String text) {
        softAssert(enjoy125Text, text);
    }   

    //Enjoy 125 sub-text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement enjoy125SubText;

    public boolean isEnjoy125SubTextDisplayed() {
        return isDisplayed(enjoy125SubText);
    }

    public void validateEnjoy125SubText(String text) {
        softAssert(enjoy125SubText, text);
    }

    //Enjoy 125 button
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement enjoy125Button;

    public boolean isEnjoy125ButtonDisplayed() {
        return isDisplayed(enjoy125Button);
    }

    public void validateEnjoy125Button(String text) {
        softAssert(enjoy125Button, text);
    }

    public void clickEnjoy125Button() {
        click(enjoy125Button, "Enjoy 125 Button");
    }

    //Earn 700 icon
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement earn700Icon;

    public boolean isEarn700IconDisplayed() {
        return isDisplayed(earn700Icon);
    }

    public void validateEarn700Icon(String text) {
        softAssert(earn700Icon, text);
    }

    //Earn 700 text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement earn700Text;

    public boolean isEarn700TextDisplayed() {
        return isDisplayed(earn700Text);
    }

    public void validateEarn700Text(String text) {
        softAssert(earn700Text, text);
    }

    //Earn 700 sub-text
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement earn700SubText;

    public boolean isEarn700SubTextDisplayed() {
        return isDisplayed(earn700SubText);
    }

    public void validateEarn700SubText(String text) {
        softAssert(earn700SubText, text);
    }

    //Earn 700 button
    @FindBy(xpath = "//a[text()='Get a Demo']")
    private WebElement earn700Button;

    public boolean isEarn700ButtonDisplayed() {
        return isDisplayed(earn700Button);
    }

    public void validateEarn700Button(String text) {
        softAssert(earn700Button, text);
    }

    public void clickEarn700Button() {
        click(earn700Button, "Earn 700 Button");
    }
}
