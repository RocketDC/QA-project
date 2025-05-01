package api_automation.base;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.JsonFormatter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.collect.ImmutableList;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class TestBase {

    protected static Response response, jiraResponse;
    public static int count = 0, environmentId = 35354;
    public static String requestBody, responseString, status, message, data;
    public static Properties properties;
    public static Date date = new Date();
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
    public static String dt = formatter.format(date);
    public static FileReader fileReader;

    public static URL url;
    public static String appPath;
    protected final Logger logger = LogManager.getLogger(getClass());
    public SoftAssert softAssert = new SoftAssert();


    public static ExtentSparkReporter spark;
    //public static ExtentTest test;
    public static ExtentReports extent;
    public static ThreadLocal<ExtentTest> test = new InheritableThreadLocal<>();


    public static JsonFormatter json;
    public static String reportDestination = "reports/report_" + dt + ".html";
    private static final String JSON_ARCHIVE = "target/json/jsonArchive.json";
    public static int counter = 0;



    public static void setExtentTest(ExtentTest test1) {
        test.set(test1);
    }


    @BeforeSuite(alwaysRun = true)
    public void reportSetup() throws IOException, InterruptedException {


        propertiesLoad();
        extentReportSpark();

    }


    @AfterSuite(alwaysRun = true)
    public void serverStopMethod() throws IOException {
        try {
            Thread.sleep(4000);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }


    }


    @AfterTest
    public void reportTeardown() throws InterruptedException {

        extent.setSystemInfo("Platform", "Rest Assured");

        extent.flush();


    }


    public void extentReportSpark() throws IOException {


        //Delete everything from reports folder expect .gitkeep
        File dir = new File(System.getProperty("user.dir") + "/reports");
        File[] files = dir.listFiles();
        for (File file : files) {
            // convert the file name into string
            String fileName = file.toString();
            int index = fileName.lastIndexOf('.');
            if (index > 0) {
                String extension = fileName.substring(index + 1);
                if (extension.equalsIgnoreCase("html") || extension.equalsIgnoreCase("zip")) {
                    String filePath = fileName;
                    File deleteFile = new File(filePath);
                    deleteFile.delete();
                }
            }
        }


        spark = new ExtentSparkReporter(reportDestination);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        json = new JsonFormatter(JSON_ARCHIVE);


        spark.config().setDocumentTitle("NetworkGo Automation Testing Report");
        spark.config().setReportName("NetworkGo Automation Test Suite");
        spark.config().setTimelineEnabled(Boolean.TRUE);
        spark.config().setOfflineMode(Boolean.TRUE);
        spark.config().setTheme(Theme.DARK);
        spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        spark.config().setTimelineEnabled(Boolean.TRUE);
    }


    public void propertiesLoad() throws IOException {


        try {
            fileReader = new FileReader("config/QA.properties");
            properties = new Properties();
            properties.load(fileReader);


        } catch (FileNotFoundException ex) {
            test.get().info("*************************************************");
            test.get().info("Property file you are looking for does not exist.");
            test.get().info("*************************************************");
        }
    }



    public static boolean isServerRunning(int port) throws IOException {
        try (ServerSocket socket = new ServerSocket()) {
            socket.setReuseAddress(false);
            socket.bind(new InetSocketAddress(InetAddress.getByName("localhost"), port), 1);
            return true;
        } catch (Exception ex) {
            return false;
        }


    }



    /**
     * Checks if the element is visible and is intractable
     *
     * @param el It is the element to be checked
     * @return returns the boolean value if the value was intractable as well as visible
     */
    public boolean isElementEnabledAndDisplayed(WebElement el) {
        try {
            return el.isDisplayed() && el.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * Returns the matching regex values
     *
     * @param value        It is the string from which the patterns to be extracted
     * @param regexPattern Regex pattern to be matched
     * @return returns the List of matching values
     */
    public List<String> matchingRegexValues(String value, String regexPattern) {
        List<String> listOfMatchingValues = new ArrayList<>();
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()) {
            listOfMatchingValues.add(matcher.group());
        }


        return listOfMatchingValues;
    }


    /**
     * Creates a random String
     *
     * @param sizeOfText   Size of the string required Ex. 5
     * @param StartingText Give a Starting text Ex. TC_
     * @return returns the random string Ex. TC_abcd1
     */
    public String generateText(int sizeOfText, String StartingText) {
        String resource = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(sizeOfText);
//        length of resource variable is -> 62
        for (int i = 0; i < sizeOfText; i++) {
            sb.append(resource.charAt(random.nextInt(62)));
        }
        return StartingText + sb;


    }


    public void addHardWait(double timeInSec) {
        try {
            System.out.println("========>>>>>>> Waiting for "+timeInSec+ " seconds");
            Thread.sleep((long) (timeInSec * 1000));
        } catch (InterruptedException err) {
            System.out.println(err.getMessage());
        }
    }




    public void isLoading(int waitBeforeChecking, WebElement onboarding, String Loading_stopped) {
        try {
            boolean loadingIsDisplayed;
            int count = 0;
            do {
                addHardWait(waitBeforeChecking);
                loadingIsDisplayed = onboarding.isDisplayed();
                count++;
                if (count >= 60)
                    logger.info("Api response is taking too much time, checked for following times -->" + count);
            } while (loadingIsDisplayed && count < 60);
        } catch (Exception e) {
            System.out.println(Loading_stopped);
            logger.info(Loading_stopped);
        }
    }




}


