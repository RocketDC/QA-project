package common;


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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.Reporter;
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

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class TestBase {
    public static String testCycleId, testCycleKey;
    public List TestCaseMapId = new ArrayList();
    public List testExecutionResultId = new ArrayList();
    public int executionResultPass = 125628, executionResultFail = 125625;
    public static List passTestcaseKey = new ArrayList();
    public static List failTestcaseKey = new ArrayList();
    public static List passTestcaseResponse = new ArrayList();
    public static List failTestcaseResponse = new ArrayList();
    public List testStepExecutionId = new ArrayList();
    public static List issueID = new ArrayList();
    public static boolean isTestCycleCreated;
    protected static int lengthRow, responseCode;
    protected static Response response, jiraResponse;
    public static int count = 0, environmentId = 35354;
    public static String requestBody, responseString, status, message, data;
    public static Properties properties;
    public static Date date = new Date();
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
    public static String dt = formatter.format(date);
    public static FileReader fileReader;


    //public static AndroidDriver driver;
    private static final ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();


    public static URL url;
    public static String appPath;
    public static AppiumDriverLocalService service;
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
    // WebDriverWait wait = new WebDriverWait(TestBase.getDriver(),12);
    public static AndroidDriver getDriver() {
        return driver.get();
    }


    public static void setDriver(AndroidDriver driver1) {
        driver.set(driver1);
    }


    public static void setExtentTest(ExtentTest test1) {
        test.set(test1);
    }

//
//    @BeforeTest
//    @Parameters(value = {"deviceIndex"})
//    public void setup(String deviceIndex) throws Exception {
//
//
//        AndroidDriver driver = null;
//
//
//        if (driver == null) {
//            if (properties.getProperty("env").equalsIgnoreCase("local")) {
//                File directory = new File(System.getProperty("user.dir") + "/src/main/resources/build");
//                File[] files = directory.listFiles();
//                for (File file : files) {
//                    // convert the file name into string
//                    String fileName = file.toString();
//
//
//                    int index = fileName.lastIndexOf('.');
//                    if (index > 0) {
//                        String extension = fileName.substring(index + 1);
//                        if (extension.equalsIgnoreCase("apk")) {
//                            appPath = fileName;
//                            break;
//                        } else {
//                            logger.info("APK file not found in resources folder");
//                            // throw new Exception("APK file not found in resources folder");
//                        }
//                    }
//                }
//
//
//                DesiredCapabilities caps = new DesiredCapabilities();
//                caps.setCapability("appium:app", appPath);
////                caps.setCapability("platformName", properties.getProperty("platformName"));
//                caps.setCapability("appium:platformVersion", properties.getProperty("platformVersion"));
//                caps.setCapability("appium:udid", properties.getProperty("udid")); // Give Device ID of // your mobile phone
//                caps.setCapability("appium:appPackage", properties.getProperty("appPackage")); //Give apps' package name
//                caps.setCapability("appium:appActivity", properties.getProperty("appActivity")); // Give splash screen/home screen activity to start app or main activity
//                caps.setCapability("appium:fullReset", "false");
//                // caps.setCapability("appium:noReset", "true");
//                caps.setCapability("appium:deviceName", properties.getProperty("deviceName"));
//                //caps.setCapability("uiautomator2ServerLaunchTimeout", 90000);
//                caps.setCapability("appium:uiautomator2ServerLaunchTimeout", 90000);
//                //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//                caps.setCapability("appium:newCommandTimeout", 90);
//                //caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//                caps.setCapability("appium:automationName", "UiAutomator2");
//                caps.setCapability("appium:MobileCapabilityType.PLATFORM_NAME", "Android");
//                // caps.setCapability("appium:automationName", "UiAutomator2");
//                caps.setCapability("appium:chromedriver_autodownload", true);
//                caps.setCapability("appium:uiautomator2ServerInstallTimeout", 20000);
//                caps.setCapability("appium:adbExecTimeout", 40000);
//
//
//                //url = new URL("http://127.0.0.1:4723/wd/hub");
//                //url = new URL("http://127.0.0.1:4727");
//                url = new URL(service.getUrl().toString());
//                driver = new AndroidDriver(url, caps);
//                setDriver(driver);
//
//
//            }
//
//
//            if (properties.getProperty("env").equalsIgnoreCase("cloud")) {
//
//
//                JSONParser parser = new JSONParser();
//                JSONObject config = (JSONObject) parser.parse(new FileReader(System.getProperty("user.dir") + "/config/parallel.conf.json"));
//                //JSONArray grp = (JSONArray) config.get("groups");
//                JSONArray envs = (JSONArray) config.get("environments");
//
//
//                DesiredCapabilities caps = new DesiredCapabilities();
//                Map<String, String> envCapabilities = (Map<String, String>) envs.get(Integer.parseInt(deviceIndex));
//                Iterator it = envCapabilities.entrySet().iterator();
//                while (it.hasNext()) {
//                    Map.Entry pair = (Map.Entry) it.next();
//                    caps.setCapability(pair.getKey().toString(), pair.getValue().toString());
//                }
//
//
//                //Map<String, String> grpCapabilities = (Map<String, String>) grp.get(Integer.parseInt(groupId));
//                //it = grpCapabilities.entrySet().iterator();
//                //while (it.hasNext()) {
//                //Map.Entry pair = (Map.Entry) it.next();
//                //caps.setCapability(pair.getKey().toString(), pair.getValue().toString());
//                //caps.setCapability("name", pair.getValue().toString());
//                //}
//
//
//
//
//                Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
//                it = commonCapabilities.entrySet().iterator();
//                while (it.hasNext()) {
//                    Map.Entry pair = (Map.Entry) it.next();
//                    if (caps.getCapability(pair.getKey().toString()) == null) {
//                        caps.setCapability(pair.getKey().toString(), pair.getValue());
//                    }
//                }
//                String testName = System.getProperty("testName");
//                if (testName == null || testName.isEmpty()) {
//                    ITestContext context = Reporter.getCurrentTestResult().getTestContext();
//                    testName = context.getCurrentXmlTest().getParameter("testName");
//                }
//
//
//                caps.setCapability("name", testName);
//                url = new URL("https://" + properties.getProperty("userName") + ":" + properties.getProperty("accessKey") + "@hub-cloud.browserstack.com/wd/hub");
//                driver = new AndroidDriver(url, caps);
//                setDriver(driver);
//            }
//        }
//    }


    @BeforeSuite(alwaysRun = true)
    public void reportSetup() throws IOException, InterruptedException {


        propertiesLoad();
        extentReportSpark();
//        startAppiumServer();
    }


    @AfterSuite(alwaysRun = true)
    public void serverStopMethod() throws IOException {
        try {
            Thread.sleep(4000);


            stopAppiumServer();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }


    }


    @AfterTest
    public void reportTeardown() throws InterruptedException {


      /* TC05Settings settings = new TC05Settings();
       settings.tc04VerifyLogOut();
*/
        //extent.setSystemInfo("Used build Name", appPath.replace(System.getProperty("user.dir") + "/src/main/resources/build/", ""));
//        extent.setSystemInfo("Platform", getDriver().getCapabilities().getCapability("platformName").toString());
        extent.setSystemInfo("Platform", "Rest Assured");
        // extent.setSystemInfo("Device Model", getDriver().getCapabilities().getCapability("appium:deviceName").toString());
        // extent.setSystemInfo("Device OS Version", getDriver().getCapabilities().getCapability("appium:platformVersion").toString());
//        if (properties.getProperty("loginWith").equalsIgnoreCase("number")) {
//            extent.setSystemInfo("Used Mobile number for Login", properties.getProperty("mobileNumber"));
//        }
//        if (properties.getProperty("loginWith").equalsIgnoreCase("email") && properties.getProperty("appEnv").equalsIgnoreCase("uat")) {
//            extent.setSystemInfo("Used RM email for Login", properties.getProperty("rmUatEmail"));
//        }
//        if (properties.getProperty("loginWith").equalsIgnoreCase("email") && properties.getProperty("appEnv").equalsIgnoreCase("dev")) {
//            extent.setSystemInfo("Used RM email for Login", properties.getProperty("rmDevEmail"));
//        }
        extent.flush();
        // stopAppiumServer();


    }


//    @AfterMethod
//    public void tearDown(ITestResult result) throws IOException {
//
//        if (result.getStatus() == ITestResult.FAILURE) {
//            test.get().log(Status.FAIL, "TEST CASE FAILED " + result.getName());
//            test.get().log(Status.FAIL, "TEST CASE FAILED " + result.getThrowable());
//            //screenshot(System.getProperty("user.dir") + "/screenshots/" + counter);
//        } else if (result.getStatus() == ITestResult.SKIP) {
//            test.get().log(Status.SKIP, "Test Case SKIPPED " + result.getName());
//        } else if (result.getStatus() == ITestResult.SUCCESS) {
//            test.get().log(Status.PASS, "Test Case PASSED " + result.getName());
//        }
//    }


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


    public void startAppiumServer() throws IOException, InterruptedException {


//        if(properties.getProperty("operatingSystem").equalsIgnoreCase("Mac")){
//            if (service != null && service.isRunning()) {
//                service.stop();
//            }
//            if(isServerRunning(4723)){
//                System.out.println("service is not available");
//            }else {
//                System.out.println("service is available");
//            }
//            AppiumServiceBuilder builder = new AppiumServiceBuilder ();
//            builder.withIPAddress ("127.0.0.1")
//                    .usingPort (4723)
//                    .withAppiumJS (
//                            new File ("/usr/local/lib/node_modules/appium/build/lib/main.js"))
//                    .usingDriverExecutable (new File ("/usr/local/bin/node"))
//                    .withArgument (BASEPATH, "/wd/hub")
//                    .withArgument (GeneralServerFlag.SESSION_OVERRIDE)
//                    .withArgument (GeneralServerFlag.LOG_LEVEL, "debug");
//            Thread.sleep(8000);
//            service = AppiumDriverLocalService.buildService (builder);
//            service.start ();
//            Thread.sleep(8000);
//            System.out.println(url);
//            service.start();
//            logger.info("Appium server started successfully.");
//        }else {
        if (properties.getProperty("env").equalsIgnoreCase("local")) {
            AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder().withArgument(() -> "--base-path", "/wd/hub").withArgument(() -> "--allow-insecure", "chromedriver_autodownload");
            // Use any port, in case the default 4723 is already taken (maybe by another Appium server)
            serviceBuilder.usingAnyFreePort();
            // Tell serviceBuilder where node is installed. Or set this path in an environment variable named NODE_PATH
            //serviceBuilder.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe")); //Need to set path for NODE_HOME in .profile or /etc/profile file
            serviceBuilder.usingDriverExecutable(new File(System.getenv("NODE_PATH")));
            // Tell serviceBuilder where Appium is installed. Or set this path in an environment variable named APPIUM_PATH
            serviceBuilder.withAppiumJS(new File(System.getenv("APPIUM_PATH"))); //Need to set path for APPIUM_PATH in .profile or /etc/profile file
            serviceBuilder.withIPAddress("127.0.0.1");
            //serviceBuilder .usingPort(4723);
            // The XCUITest driver requires that a path to the Carthage binary is in the PATH variable. I have this set for my shell, but the Java process does not see it. It can be inserted here.
            HashMap<String, String> environment = new HashMap();
            environment.put("ANDROID_HOME", System.getenv("ANDROID_HOME")); //Need to set path for ANDROID_HOME in .profile or /etc/profile file
            serviceBuilder.withEnvironment(environment);


            if (service != null && service.isRunning()) {
                service.stop();
            }
            service = AppiumDriverLocalService.buildService(serviceBuilder);
            url = new URL(service.getUrl().toString());
            System.out.println(url);
            logger.info("URL:- " + url);
            service.start();
            logger.info("Appium server started successfully.");
        }


    }


    public void stopAppiumServer() {


        if (properties.getProperty("env").equalsIgnoreCase("local")) {
            getDriver().quit();
            service.stop();
            logger.info("Appium server stopped successfully.");
        } else {
            getDriver().quit();
            //ZipUtil.pack(new File(System.getProperty("user.dir") + "/reports/"), new File(System.getProperty("user.dir") + "/reports/report.zip"));
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


    public void screenshot(String path_screenshot) throws IOException {
        if (counter == 0) {


            File dir = new File(System.getProperty("user.dir") + "/screenshots");
            File[] files = dir.listFiles();
            for (File file : files) {
                // convert the file name into string
                String fileName = file.toString();
                int index = fileName.lastIndexOf('.');
                if (index > 0) {
                    String extension = fileName.substring(index + 1);
                    if (extension.equalsIgnoreCase("jpg")) {
                        String filePath = fileName;
                        File deleteFile = new File(filePath);
                        deleteFile.delete();
                    }
                }
            }
        }
        File srcFile = getDriver().getScreenshotAs(OutputType.FILE);
        //String filename= UUID.randomUUID().toString();
        File targetFile = new File(path_screenshot + ".jpg");
        FileUtils.copyFile(srcFile, targetFile);
        counter++;
    }


    public void horizontalScroll(String resourceID, String text) {
        getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)."
                + "resourceId(\"" + resourceID + "\"))"
                + ".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"" + text + "\"))");
    }


    public void scrollHorizontally() {
        // Get the screen dimensions
        Dimension size = getDriver().manage().window().getSize();


        // Define the starting and ending points for the scroll
        int startX = (int) (size.width * 0.8); // 80% from the right
        int endX = (int) (size.width * 0.2); // 20% from the right


        // Define the Y-coordinate for the scroll (you can set it to any desired value)
        int startY = size.height / 2;


        // Create a TouchAction to perform the scroll
        TouchAction touchAction = new TouchAction(getDriver());
        touchAction
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) // Adjust the duration as needed
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }


    public void scrollLeftToRight(WebElement sourceElement, WebElement targetElement) {


        TouchAction touchAction = new TouchAction(getDriver());
        touchAction.longPress(longPressOptions().withElement(element(sourceElement)))
                .moveTo(element(targetElement))
                .release()
                .perform();
    }


    //    public void verticalScroll(String resourceID, String text) {
//
//        getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" + ".resourceId(\"" + resourceID + "\")).scrollIntoView("
//                + "new UiSelector().text(\"" + text + "\"));");
//
//    }
//
    public void scrollAndClick(String visibleText)
    {
        try{
            addHardWait(3);
            getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
        }
        catch (Exception e)
        {
            scrolling(0.5,0.6,0.5,0.4);
            addHardWait(3);
            getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
        }
    }


    public void scroll(String text){
        try {
            getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + text + "\"))");
        }
        catch (Exception e){
            logger.atError();
        }
    }




//    public void scrolling(double start_x, double start_y, double end_x, double end_y) {
//        Dimension dimension = getDriver().manage().window().getSize();
//
//        int startx = (int) (dimension.width * start_x);
//        int staryy = (int) (dimension.height * start_y);
//        int endx = (int) (dimension.width * end_x);
//        int endy = (int) (dimension.height * end_y);
//
//        TouchAction action = new TouchAction<>(getDriver());
//        action.press(PointOption.point(startx, staryy))
//                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                .moveTo(PointOption.point(endx, endy)).release().perform();
//    }


    public void scrolling(double start_x, double start_y, double end_x, double end_y)  {
        Dimension dimension = getDriver().manage().window().getSize();


        System.out.println("Dimension: " + dimension);


        int startx = (int) (dimension.width * start_x);
        int staryy = (int) (dimension.height * start_y);
        int endx = (int) (dimension.width * end_x);
        int endy = (int) (dimension.height * end_y);
        System.out.println("startx: " + startx);
        System.out.println("staryy: " + staryy);
        System.out.println("endx: " + endx);
        System.out.println("endy: " + endy);
        Duration duration = Duration.ofMillis(1000);
        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipe = new Sequence(input, 0);
        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startx, staryy));
        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));


        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), endx, endy));
        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        getDriver().perform(ImmutableList.of(swipe));
        try{Thread.sleep(1000);}
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }


    }


    public String generateID(int num) {


        Random rnd = new Random();
        char[] digits = new char[num];
        digits[0] = (char) (rnd.nextInt(9) + '1');
        for (int i = 1; i < digits.length; i++) {
            digits[i] = (char) (rnd.nextInt(10) + '0');
        }
        return (new String(digits));
    }


    public boolean isElementDisplayed(WebElement el) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 7);
            wait.until(ExpectedConditions.visibilityOf(el));
            return el.isDisplayed() || el.isEnabled();
        } catch (Exception e) {
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


    public boolean isElementEnabled(WebElement el){
        try{
            WebDriverWait wait = new WebDriverWait(TestBase.getDriver(),12);
            wait.until(ExpectedConditions.visibilityOf(el));
            return el.isEnabled();
        }catch(Exception e){
            return false;
        }
    }


    public void reLaunchAPK() throws InterruptedException {
        Thread.sleep(775);
        getDriver().terminateApp(properties.getProperty("appPackage"));
        Thread.sleep(775);
        getDriver().activateApp(properties.getProperty("appPackage"));
        Thread.sleep(820);
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


