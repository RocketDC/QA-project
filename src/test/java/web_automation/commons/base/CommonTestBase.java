package web_automation.commons.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.JsonFormatter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.epam.healenium.SelfHealingDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonTestBase {
    private final String moduleName = "CommonTestBase";

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected static final Logger logger = LogManager.getLogger(CommonTestBase.class);
    public static Properties properties;
    public SoftAssert softAssert = new SoftAssert();

    public static ExtentReports extent;
    public static ThreadLocal<ExtentTest> test = new InheritableThreadLocal<>();
    public static ExtentSparkReporter spark;
    public static JsonFormatter json;

    private static final String REPORT_DIR = "reports";
    private static final String JSON_ARCHIVE = "target/json/jsonArchive.json";
    private static final String TIMESTAMP = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
    private static final String REPORT_PATH = REPORT_DIR + "/report_" + TIMESTAMP + ".html";

    /**
     * @return the current WebDriver instance
     */
    public static SelfHealingDriver getDriver() {
        return (SelfHealingDriver) driver.get();
    }

    public static void setDriver(SelfHealingDriver drv) {
        driver.set(drv);
    }

//    public static WebDriver getDriver() {
//        return driver.get();
//    }

    public static void setDriver(WebDriver drv) {
        driver.set(drv);
    }

    public void threadSleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void setExtentTest(ExtentTest testObj) {
        test.set(testObj);
    }

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() throws IOException {
        loadProperties();
        recordLogs();
        setupExtentReport();
        initializeChromeDriver();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        if (extent != null) {
            extent.setSystemInfo("Platform", "Web Automation");
            extent.flush();
        }
        getDriver().quit();
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        // Optional: Additional teardown per test if required
    }

    public void recordLogs() {
        File logDir = new File("logs");
        if (!logDir.exists()) {
            logDir.mkdirs();
        }
        File logFile = new File("logs/web_automation_execution.log");

        if (logFile.exists()) {
            try {
                new FileWriter(logFile, false).close();  // Overwrites and clears the file
                logger.info("Existing log file cleared.");
            } catch (IOException e) {
                logger.error("Failed to clear log file: " + e.getMessage());
            }
        }
    }

    public void initializeChromeDriver() {

//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver chromeDriver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();  // Auto-downloads the matching driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
//  Prepare prefs to disable notifications (2 = block, 1 = allow)
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
// Apply prefs
        options.setExperimentalOption("prefs", prefs);
        System.setProperty("heal-enabled", "false");
        WebDriver chromeDriver = new ChromeDriver(options);
//        create Self-healing driver
        SelfHealingDriver driver = SelfHealingDriver.create(chromeDriver);
//        WebDriver driver = new ChromeDriver(options);
        setDriver(driver);
    }

    public void setupExtentReport() throws IOException {
        cleanOldReports();

        spark = new ExtentSparkReporter(REPORT_PATH);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        json = new JsonFormatter(JSON_ARCHIVE);

        spark.config().setDocumentTitle("Automation Test Report");
        spark.config().setReportName("Web Automation Suite");
        spark.config().setTheme(Theme.DARK);
        spark.config().setTimelineEnabled(true);
        spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }

    private void cleanOldReports() {
        File dir = new File(REPORT_DIR);
        File[] files = dir.listFiles((d, name) -> name.endsWith(".html") || name.endsWith(".zip"));
        if (files != null) {
            for (File file : files) file.delete();
        }
    }

    private void loadProperties() throws IOException {
        FileReader reader = new FileReader("config/QA.properties");
        properties = new Properties();
        properties.load(reader);
    }

    public boolean isElementDisplayed(WebElement el) {
        try {
            new WebDriverWait(getDriver(), 10)
                    .until(ExpectedConditions.visibilityOf(el));
            return el.isDisplayed() && el.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public List<String> extractRegexMatches(String input, String regex) {
        List<String> matches = new ArrayList<>();
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) matches.add(matcher.group());
        return matches;
    }

    public String generateRandomString(int length, String prefix) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(prefix);
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public void hardWait(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException ignored) {
        }
    }

    public void click(WebElement el, String message) {
        ExtentTest test = extent.createTest("Clicking on ➜ " + message);
        setExtentTest(test);
        try {
            new WebDriverWait(getDriver(), 10)
                    .until(ExpectedConditions.elementToBeClickable(el));
            el.click();
        } catch (Exception e) {
            logger.error("Reference message :-" + message + "\nElement not clickable: ");
            test.log(Status.FAIL, "Reference message:- " + message + "\nElement not clickable: ");
        }
    }

    public void waitForElementToBeVisible(WebElement el) {
        try {
            new WebDriverWait(getDriver(), 10)
                    .until(ExpectedConditions.visibilityOf(el));
        } catch (Exception e) {
            logger.error("Element not visible: " + e.getMessage());
        }
    }

    public void waitForElementToBeInvisible(WebElement el) {
        try {
            new WebDriverWait(getDriver(), 10)
                    .until(ExpectedConditions.invisibilityOf(el));
        } catch (Exception e) {
            logger.error("Element not invisible: " + e.getMessage());
        }
    }

    public void waitForElementToBePresent(WebElement el) {
        try {
            new WebDriverWait(getDriver(), 10)
                    .until(ExpectedConditions.presenceOfElementLocated((By) el));
        } catch (Exception e) {
            logger.error("Element not present: " + e.getMessage());
        }
    }


    public boolean isElementEnabled(WebElement el) {
        try {
            new WebDriverWait(getDriver(), 12)
                    .until(ExpectedConditions.visibilityOf(el));
            return el.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }


    public void validateTextPresence(String expectedText) {
        // Create an Extent node for each individual text so you get granular pass/fail visibility.
        ExtentTest test = extent.createTest("Validate text ➜ " + expectedText);
        setExtentTest(test);
        // Log what we're about to do
        logger.info("Validating presence of text: '{}'", expectedText);

        boolean isPresent = isTextPresent(expectedText);

        if (isPresent) {
            test.log(Status.PASS, "Text '" + expectedText + "' is present on the page.");
            logger.info("✅ Text '{}' is present", expectedText);
        } else {
            test.log(Status.FAIL, "Text '" + expectedText + "' is NOT present on the page.");
            logger.info("❌ Text '{}' is NOT present", expectedText);

        }
    }

    /**
     * Helper that returns <code>true</code> when a node containing the supplied text becomes visible within 5 seconds.
     * Uses <code>normalize-space()</code> so stray whitespace in the DOM does not break the match.
     */
    private boolean isTextPresent(String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        try {
            WebElement element = wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.xpath("//*[contains(normalize-space(text()), '" + text + "')]")
                    ));
            return element != null;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void scrollIntoView(WebElement target) {
        try {
            logger.info("Scrolling ➜ " + target.getLocation().toString());
            Actions actions = new Actions(getDriver());
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            actions.moveToElement(target).perform();
            wait.until(ExpectedConditions.visibilityOf(target));
        } catch (Exception e) {
            logger.error("Error scrolling to element: " + e.getMessage());
        }
        if (target == null) {
            logger.error("Target element is null");
            return;
        }
        if (!isElementDisplayed(target)) {
            logger.error("Target element is not displayed");
        }

    }

    public boolean isDisplayed(WebElement element) {
        ExtentTest test = extent.createTest("Checking if element is displayed");
        setExtentTest(test);
        try {
            new WebDriverWait(getDriver(), 10)
                    .until(ExpectedConditions.visibilityOf(element));
            if (element.isDisplayed()) {
                return true;
            }

        } catch (TimeoutException e) {
            logger.error("TimeoutException :- " + e.getMessage());
            return false;
        }
        return false;
    }

    public void softAssert(WebElement element, String expectedText) {
        ExtentTest test = extent.createTest("Checking text ➜ " + expectedText);
        setExtentTest(test);
        waitForElementToBeVisible(element);
        String actualText = element.getText();
        if (actualText.equals(expectedText)) {
            test.log(Status.PASS, "Validating if [" + expectedText + "] is present");
        } else {
            test.log(Status.FAIL, "Text not found - Expected: " + expectedText + ", Actual: " + actualText);
            softAssert.fail("Text not found - Expected: " + expectedText + ", Actual: " + actualText);
            logger.error("Text not found - Expected: " + expectedText + ", Actual: " + actualText);
        }
    }

    public void validatePlaceholderText(WebElement element, String expectedText) {
        ExtentTest test = extent.createTest("Checking text ➜ " + expectedText);
        setExtentTest(test);
        waitForElementToBeVisible(element);
        String actualText = element.getAttribute("placeholder");
        if (actualText.equals(expectedText)) {
            test.log(Status.PASS, "Validating if Placeholder text [" + expectedText + "] is present");
        } else {
            test.log(Status.FAIL, "Placeholder Text not found - Expected: " + expectedText + ", Actual: " + actualText);
            softAssert.fail("Placeholder Text not found - Expected: " + expectedText + ", Actual: " + actualText);
            logger.error("Placeholder Text not found - Expected: " + expectedText + ", Actual: " + actualText);
        }
    }

    public void sendKeys(WebElement element, String expectedText) {
        ExtentTest test = extent.createTest("Sending text ➜ " + expectedText);
        setExtentTest(test);
        waitForElementToBeVisible(element);
        boolean isEditable = element.getAttribute("readonly") == null;
        if (isEditable) {
            element.clear();
            element.sendKeys(expectedText);
            test.log(Status.PASS, "Entered text [" + expectedText + "] to the textbox");
        } else {
            test.log(Status.FAIL, "Failed to enter " + expectedText + "Textbox is not editable");
            logger.error("Failed to enter " + expectedText + "Textbox is not editable");
        }
    }

}
