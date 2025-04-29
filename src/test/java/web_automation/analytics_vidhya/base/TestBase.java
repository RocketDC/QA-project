package web_automation.analytics_vidhya.base;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class TestBase {
    private final String moduleName = "TestBase";

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected static final Logger logger = LogManager.getLogger(TestBase.class);
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

    public static SelfHealingDriver getDriver() {
        return (SelfHealingDriver) driver.get();
    }

    public static void setDriver(SelfHealingDriver drv) {
        driver.set(drv);
    }

    public static void setExtentTest(ExtentTest testObj) {
        test.set(testObj);
    }

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() throws IOException {
        recordLogs();
        loadProperties();
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

    public void recordLogs(){
        File logDir = new File("logs");
        if (!logDir.exists()) {
            logDir.mkdirs();
        }
        File logFile = new File("logs/test-execution.log");

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

        WebDriver chromeDriver = new ChromeDriver(options);
//        create Self-healing driver
        SelfHealingDriver driver = SelfHealingDriver.create(chromeDriver);
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

    public void waitForElementToBeClickable(WebElement el) {
        try {
            new WebDriverWait(getDriver(), 10)
                    .until(ExpectedConditions.elementToBeClickable(el));
        } catch (Exception e) {
            logger.error("Element not clickable: " + e.getMessage());
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

    public void softAssert(WebElement element, String expectedText, String message) {
        ExtentTest test = extent.createTest("TC" + getClass() + "launchingTheWebApp", "Launching the analytics vidhya app").assignCategory(moduleName);
        setExtentTest(test);
        waitForElementToBeVisible(element);
        String actualText = element.getText();
        if (actualText.equals(expectedText)) {
            test.log(Status.PASS, message + " - Expected: " + expectedText + ", Actual: " + actualText);
        } else {
            test.log(Status.FAIL, message + " - Expected: " + expectedText + ", Actual: " + actualText);
            softAssert.fail(message + " - Expected: " + expectedText + ", Actual: " + actualText);
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
}
