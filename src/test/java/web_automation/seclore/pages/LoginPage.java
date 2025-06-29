package web_automation.seclore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import web_automation.seclore.base.TestBase;

public class LoginPage extends TestBase{
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Seclore Partner logo
    @FindBy(xpath = "(//img[@alt='Seclore Partner Center Logo'])[2]")
    private WebElement logoSeclorePartner;

    //Click seclore logo
    public void clickSecloreLogo() {
        scrollIntoView(logoSeclorePartner);
        click(logoSeclorePartner, "Seclore Partner Logo");
    }

    //Validate seclore logo is displayed
    public boolean isSecloreLogoDisplayed() {
        scrollIntoView(logoSeclorePartner);
        return isDisplayed(logoSeclorePartner);
    }
    
    //Login button
    @FindBy(xpath = "(//a[@role='button'][normalize-space()='Login'])[2]")
    private WebElement loginButton;

    //Click on Login Button
    public void clickLoginButton() {
        scrollIntoView(loginButton);
        click(loginButton, "Login Button");
    }

    //Validate Login button is displayed
    public boolean isLoginButtonDisplayed() {
        scrollIntoView(loginButton);
        return isDisplayed(loginButton);
    }
    //Validate text of Login button
    public void validateTextOfLoginButton(String text) {
        scrollIntoView(loginButton);
        softAssert(loginButton, text);
    }

    //Register button
    @FindBy(xpath = "(//a[@role='button'][normalize-space()='Register'])[2]")
    private WebElement registerButton;

    //Click on Register Button
    public void clickRegisterButton() {
        scrollIntoView(registerButton);
        click(registerButton, "Register Button");
    }
    //Validate Register button is displayed
    public boolean isRegisterButtonDisplayed() {
        scrollIntoView(registerButton);
        return isDisplayed(registerButton);
    }
    //Validate text of Register button
    public void validateTextOfRegisterButton(String text) {
        scrollIntoView(registerButton);
        softAssert(registerButton, text);
    }

    //Login heading
    @FindBy(xpath = "(//p[normalize-space()='Login'])[1]")
    private WebElement loginHeading;

    //Validate Login heading is displayed
    public boolean isLoginHeadingDisplayed() {
        scrollIntoView(loginHeading);
        return isDisplayed(loginHeading);
    }

    //Validate text of Login heading
    public void validateTextOfLoginHeading(String text) {
        scrollIntoView(loginHeading);
        softAssert(loginHeading, text);
    }
    //Email label field
    @FindBy(xpath = "(//label[@for='inputEmail'][normalize-space()='Email Address'])[1]")
    private WebElement emailLabelField;

    //Validate if Email label field is displayed
    public boolean isEmailLabelFieldDisplayed() {
        scrollIntoView(emailLabelField);
        return isDisplayed(emailLabelField);
    }
    //Validate text of Email label field
    public void validateTextOfEmailLabelField(String text) {
        scrollIntoView(emailLabelField);
        softAssert(emailLabelField, text);
    }

    //Email input field
    @FindBy(xpath = "(//input[@id='inputEmail'])[1]")
    private WebElement emailInputField;

    //Validate if Email input field is displayed
    public boolean isEmailInputFieldDisplayed() {
        scrollIntoView(emailInputField);
        return isDisplayed(emailInputField);
    }

    //Enter text in Email input field
    public void enterTextInEmailInputField(String text) {
        scrollIntoView(emailInputField);
        sendKeys(emailInputField, text);
    }

    //Validate placeholder text
    public void validatePlaceholderTextOfEmailInputField(String text) {
        scrollIntoView(emailInputField);
        validatePlaceholderText(emailInputField,text);
    }

    //Password label field
    @FindBy(xpath = "//label[normalize-space()='Password']")
    private WebElement passwordLabelField;

    //Validate if password label is displayed
    public boolean passwordLabelIsDisplayed(){
        scrollIntoView(passwordLabelField);
        return isDisplayed(passwordLabelField);
        
    }

    //Validate text of Password label field
    public void validateTextOfPasswordLabelField(String text) {
        scrollIntoView(passwordLabelField);
        softAssert(passwordLabelField, text);
    }
    //Password input field
    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement passwordInputField;
    //Validate if Password input field is displayed
    public boolean passwordInputFieldIsDisplayed(){
        scrollIntoView(passwordInputField);
        return isDisplayed(passwordInputField);
    }

    //Validate Placeholdere text of Password input field
    public void validateTextOfPasswordInputField(String text) {
        scrollIntoView(passwordInputField);
        validatePlaceholderText(passwordInputField, text);
    }

    //Enter the text in Password input field
    public void enterTextInPasswordInputField(String text) {
        scrollIntoView(passwordInputField);
        sendKeys(passwordInputField, text); 
    
    }

    //Forgot Password link
    @FindBy(xpath = "//a[normalize-space()='Forgot Your Password?']")
    private WebElement forgotPasswordLink;

    //Forgot Password link is displayed
    public boolean isForgotPasswordLinkDisplayed() {
        scrollIntoView(forgotPasswordLink);
        return isDisplayed(forgotPasswordLink);
    }

    //Click on Forgot Password link
    public void clickForgotPasswordLink() {
        scrollIntoView(forgotPasswordLink);
        click(forgotPasswordLink, "Forgot Password Link");
    }

    //Validate text of Forgot Password link
    public void validateTextOfForgotPasswordLink(String text) {
        scrollIntoView(forgotPasswordLink);
        softAssert(forgotPasswordLink, text);
    }

    //Sign in button
    @FindBy(xpath = "//button[@id='loginButton']")
    private WebElement signInButton;

    //Sign in button is displayed
    public boolean isSignInButtonDisplayed() {
        scrollIntoView(signInButton);
        return isDisplayed(signInButton);
    }

    //Click on Sign in button
    public void clickSignInButton() {
        scrollIntoView(signInButton);
        click(signInButton, "Sign In Button");
    }
    //Validate text of Sign in button
    public void validateTextOfSignInButton(String text) {
        scrollIntoView(signInButton);
        softAssert(signInButton, text);
    }

    //Not a partner? text
    @FindBy(xpath = "//p[normalize-space()='Not a partner?']")
    private WebElement notAPartnerText;

    //Validate Not a partner? text is displayed
    public boolean isNotAPartnerTextDisplayed() {
        scrollIntoView(notAPartnerText);
        return isDisplayed(notAPartnerText);
    }

    //Validate text of Not a partner? text
    public void validateTextOfNotAPartnerText(String text) {
        scrollIntoView(notAPartnerText);
        softAssert(notAPartnerText, text);
    }

    //Register today button
    @FindBy(xpath = "//div[@class='bee-col bee-col-2 bee-col-w4']//span[contains(text(),'Register today')]")
    private WebElement registerTodayButton;

    //Register today button is displayed
    public boolean isRegisterTodayButtonDisplayed() {
        scrollIntoView(registerTodayButton);
        return isDisplayed(registerTodayButton);
    }

    //Click on Register today button
    public void clickRegisterTodayButton() {
        scrollIntoView(registerTodayButton);
        click(registerTodayButton, "Register Today Button");
    }

    //Validate text of Register today button
    public void validateTextOfRegisterTodayButton(String text) {
        scrollIntoView(registerTodayButton);
        softAssert(registerTodayButton, text);
    }

    //Welcome partner Portal page heading
    @FindBy(xpath = "//span[normalize-space()='Welcome to your  partner portal']")
    private WebElement welcomePartnerPortalHeading;

    //Welcome partner Portal page heading is displayed
    public boolean isWelcomePartnerPortalHeadingDisplayed() {
        scrollIntoView(welcomePartnerPortalHeading);
        return isDisplayed(welcomePartnerPortalHeading);
    }

    //Validate text of Welcome partner Portal page heading
    public void validateTextOfWelcomePartnerPortalHeading(String text) {
        scrollIntoView(welcomePartnerPortalHeading);
        softAssert(welcomePartnerPortalHeading, text);
    }

    //Checkout all inclusive section heading
    @FindBy(xpath = "//span[normalize-space()='Check out our all-inclusive partner success programs in our Partner Portal.']")
    private WebElement checkoutAllInclusiveSectionHeading;

    //Checkout all inclusive section heading is displayed
    public boolean isCheckoutAllInclusiveSectionHeadingDisplayed() {
        scrollIntoView(checkoutAllInclusiveSectionHeading);
        return isDisplayed(checkoutAllInclusiveSectionHeading);
    }

    //Validate text of Checkout all inclusive section heading
    public void validateTextOfCheckoutAllInclusiveSectionHeading(String text) {
        scrollIntoView(checkoutAllInclusiveSectionHeading);
        softAssert(checkoutAllInclusiveSectionHeading, text);
    }


    //Checkout all inclusive section sub-heading
    @FindBy(xpath = "//p[contains(text(),'Our Partner Success team is here to help you with ')]")
    private WebElement checkoutAllInclusiveSectionSubHeading;

    //Checkout all inclusive section sub-heading is displayed
    public boolean isCheckoutAllInclusiveSectionSubHeadingDisplayed() {
        scrollIntoView(checkoutAllInclusiveSectionSubHeading);
        return isDisplayed(checkoutAllInclusiveSectionSubHeading);
    }

    //Validate text of Checkout all inclusive section sub-heading
    public void validateTextOfCheckoutAllInclusiveSectionSubHeading(String text) {
        scrollIntoView(checkoutAllInclusiveSectionSubHeading);
        softAssert(checkoutAllInclusiveSectionSubHeading, text);
    }

    //Register today 2nd button
    @FindBy(xpath = "(//span[contains(text(),'Register today')])[2]")
    private WebElement registerToday2ndButton;

    //Register today 2nd button is displayed
    public boolean isRegisterToday2ndButtonDisplayed() {
        scrollIntoView(registerToday2ndButton);
        return isDisplayed(registerToday2ndButton);
    }

    //Click on Register today 2nd button
    public void clickRegisterToday2ndButton() {
        scrollIntoView(registerToday2ndButton);
        click(registerToday2ndButton, "Register Today 2nd Button");
    }

    //Validate text of Register today 2nd button
    public void validateTextOfRegisterToday2ndButton(String text) {
        scrollIntoView(registerToday2ndButton);
        softAssert(registerToday2ndButton, text);
    }

    // Create your own microsite text heading
    @FindBy(xpath = "//span[normalize-space()='Create your own microsite']")
    private WebElement createYourOwnMicrositeHeading;

    // Create your own microsite text heading is displayed
    public boolean isCreateYourOwnMicrositeHeadingDisplayed() {
        scrollIntoView(createYourOwnMicrositeHeading);
        return isDisplayed(createYourOwnMicrositeHeading);
    }

    //Validate text of Create your own microsite text heading
    public void validateTextOfCreateYourOwnMicrositeHeading(String text) {
        scrollIntoView(createYourOwnMicrositeHeading);
        softAssert(createYourOwnMicrositeHeading, text);
    }

    // Create your own microsite text sub-heading
    @FindBy(xpath = "//p[contains(text(),'Check out our customizable microsite that helps yo')]")
    private WebElement createYourOwnMicrositeSubHeading;

    // Create your own microsite text sub-heading is displayed
    public boolean isCreateYourOwnMicrositeSubHeadingDisplayed() {
        scrollIntoView(createYourOwnMicrositeSubHeading);
        return isDisplayed(createYourOwnMicrositeSubHeading);
    }

    //Validate text of Create your own microsite text sub-heading
    public void validateTextOfCreateYourOwnMicrositeSubHeading(String text) {
        scrollIntoView(createYourOwnMicrositeSubHeading);
        softAssert(createYourOwnMicrositeSubHeading, text);
    }

    // Create your own microsite icon
    @FindBy(xpath = "//div[@class='bee-col bee-col-1 bee-col-w4']//img[contains(@class,'bee-fixedwidth')]")
    private WebElement createYourOwnMicrositeIcon;

    // Create your own microsite icon is displayed
    public boolean isCreateYourOwnMicrositeIconDisplayed() {
        scrollIntoView(createYourOwnMicrositeIcon);
        return isDisplayed(createYourOwnMicrositeIcon);
    }

    // Customize an email campaign text heading
    @FindBy(xpath = "//h2[contains(text(),'Customize an email campaign')]")
    private WebElement customizeAnEmailCampaignHeading;

    // Customize an email campaign text heading is displayed
    public boolean isCustomizeAnEmailCampaignHeadingDisplayed() {
        scrollIntoView(customizeAnEmailCampaignHeading);
        return isDisplayed(customizeAnEmailCampaignHeading);
    }

    //Validate text of Customize an email campaign text heading
    public void validateTextOfCustomizeAnEmailCampaignHeading(String text) {
        scrollIntoView(customizeAnEmailCampaignHeading);
        softAssert(customizeAnEmailCampaignHeading, text);
    }

    // Customize an email campaign text sub-heading
    @FindBy(xpath = "//p[contains(text(),'Check out our pre-packaged campaigns, and customiz')]")
    private WebElement customizeAnEmailCampaignSubHeading;

    // Customize an email campaign text sub-heading is displayed
    public boolean isCustomizeAnEmailCampaignSubHeadingDisplayed() {
        scrollIntoView(customizeAnEmailCampaignSubHeading);
        return isDisplayed(customizeAnEmailCampaignSubHeading);
    }

    //Validate text of Customize an email campaign text sub-heading
    public void validateTextOfCustomizeAnEmailCampaignSubHeading(String text) {
        scrollIntoView(customizeAnEmailCampaignSubHeading);
        softAssert(customizeAnEmailCampaignSubHeading, text);
    }

    // Customize an email campaign icon
    @FindBy(xpath = "//div[@class='bee-col bee-col-2 bee-col-w4']//img[contains(@class,'bee-fixedwidth')]")
    private WebElement customizeAnEmailCampaignIcon;

    // Customize an email campaign icon is displayed
    public boolean isCustomizeAnEmailCampaignIconDisplayed() {
        scrollIntoView(customizeAnEmailCampaignIcon);
        return isDisplayed(customizeAnEmailCampaignIcon);
    }

    //Try our co-branded collateral text heading
    @FindBy(xpath = "//span[normalize-space()='Try our co-branded collateral']")
    private WebElement tryOurCoBrandedCollateralHeading;

    //Try our co-branded collateral text heading is displayed
    public boolean isTryOurCoBrandedCollateralHeadingDisplayed() {
        scrollIntoView(tryOurCoBrandedCollateralHeading);
        return isDisplayed(tryOurCoBrandedCollateralHeading);
    }

    //Validate text of Try our co-branded collateral text heading
    public void validateTextOfTryOurCoBrandedCollateralHeading(String text) {
        scrollIntoView(tryOurCoBrandedCollateralHeading);
        softAssert(tryOurCoBrandedCollateralHeading, text);
    }
    //Try our co-branded collateral text sub-heading
    @FindBy(xpath = "//p[contains(text(),'Check out all of our pre-made collateral that can ')]")
    private WebElement tryOurCoBrandedCollateralSubHeading;

    //Try our co-branded collateral text sub-heading is displayed
    public boolean isTryOurCoBrandedCollateralSubHeadingDisplayed() {
        scrollIntoView(tryOurCoBrandedCollateralSubHeading);
        return isDisplayed(tryOurCoBrandedCollateralSubHeading);
    }

    //Validate text of Try our co-branded collateral text sub-heading
    public void validateTextOfTryOurCoBrandedCollateralSubHeading(String text) {
        scrollIntoView(tryOurCoBrandedCollateralSubHeading);
        softAssert(tryOurCoBrandedCollateralSubHeading, text);
    }

    //Try our co-branded collateral icon
    @FindBy(xpath = "//div[@class='bee-col bee-col-3 bee-col-w4']//img[contains(@class,'bee-fixedwidth')]")
    private WebElement tryOurCoBrandedCollateralIcon;

    //Try our co-branded collateral icon is displayed
    public boolean isTryOurCoBrandedCollateralIconDisplayed() {
        scrollIntoView(tryOurCoBrandedCollateralIcon);
        return isDisplayed(tryOurCoBrandedCollateralIcon);
    }


    // Are you generating new, exciting leads? text heading
    @FindBy(xpath = "//span[normalize-space()='Are you generating new, exciting leads?']")
    private WebElement areYouGeneratingNewExcitingLeadsHeading;

    // Are you generating new, exciting leads? text heading is displayed
    public boolean isAreYouGeneratingNewExcitingLeadsHeadingDisplayed() {
        scrollIntoView(areYouGeneratingNewExcitingLeadsHeading);
        return isDisplayed(areYouGeneratingNewExcitingLeadsHeading);
    }

    //Validate text of Are you generating new, exciting leads? text heading
    public void validateTextOfAreYouGeneratingNewExcitingLeadsHeading(String text) {
        scrollIntoView(areYouGeneratingNewExcitingLeadsHeading);
        softAssert(areYouGeneratingNewExcitingLeadsHeading, text);
    }

    // Are you generating new, exciting leads? text sub-heading
    @FindBy(xpath = "//p[contains(text(),'Take a look at all we have to offer and find marke')]")
    private WebElement areYouGeneratingNewExcitingLeadsSubHeading;
    // Are you generating new, exciting leads? text sub-heading is displayed
    public boolean isAreYouGeneratingNewExcitingLeadsSubHeadingDisplayed() {
        scrollIntoView(areYouGeneratingNewExcitingLeadsSubHeading);
        return isDisplayed(areYouGeneratingNewExcitingLeadsSubHeading);
    }

    //Validate text of Are you generating new, exciting leads? text sub-heading
    public void validateTextOfAreYouGeneratingNewExcitingLeadsSubHeading(String text) {
        scrollIntoView(areYouGeneratingNewExcitingLeadsSubHeading);
        softAssert(areYouGeneratingNewExcitingLeadsSubHeading, text);
    }

    // Need help navigating the Portal? text heading and sub-heading
    @FindBy(xpath = "//span[normalize-space()='Need help navigating the Portal?']")
    private WebElement needHelpNavigatingThePortalHeading;

    // Need help navigating the Portal? text heading is displayed
    public boolean isNeedHelpNavigatingThePortalHeadingDisplayed() {
        scrollIntoView(needHelpNavigatingThePortalHeading);
        return isDisplayed(needHelpNavigatingThePortalHeading);
    }

    //Validate text of Need help navigating the Portal? text heading
    public void validateTextOfNeedHelpNavigatingThePortalHeading(String text) {
        scrollIntoView(needHelpNavigatingThePortalHeading);
        softAssert(needHelpNavigatingThePortalHeading, text);
    }

    // Need help navigating the Portal? text sub-heading
    @FindBy(xpath = "//p[contains(text(),'Our Seclore team is here to assist you with any qu')]")
    private WebElement needHelpNavigatingThePortalSubHeading;

    // Need help navigating the Portal? text sub-heading is displayed
    public boolean isNeedHelpNavigatingThePortalSubHeadingDisplayed() {
        scrollIntoView(needHelpNavigatingThePortalSubHeading);
        return isDisplayed(needHelpNavigatingThePortalSubHeading);
    }

    //Validate text of Need help navigating the Portal? text sub-heading
    public void validateTextOfNeedHelpNavigatingThePortalSubHeading(String text) {
        scrollIntoView(needHelpNavigatingThePortalSubHeading);
        softAssert(needHelpNavigatingThePortalSubHeading, text);
    }

    

}
