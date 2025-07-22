package android_automation.commons;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.JsonFormatter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.browserstack.local.Local;
import com.google.common.collect.ImmutableList;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.AppiumBy;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
//import net.lightbody.bmp.BrowserMobProxy;
//import net.lightbody.bmp.BrowserMobProxyServer;
//import net.lightbody.bmp.client.ClientUtil;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class AppiumTestBase {
    public static Local bsLocal;
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
    public static String  requestBody, responseString, status, message, data;
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

    public static AndroidDriver getDriver() {
        return driver.get();
    }
    //public static BrowserMobProxy proxy;

    public static void setDriver(AndroidDriver driver1) {
        driver.set(driver1);
    }

    public static void setExtentTest(ExtentTest test1) {
        test.set(test1);
    }

    @BeforeTest
    @Parameters(value = {"deviceIndex"})
    public void setup(String deviceIndex) throws Exception {

        AndroidDriver driver = null;
        if (driver == null) {
            if (properties.getProperty("env").equalsIgnoreCase("local")) {
                File directory = new File(System.getProperty("user.dir") + "/src/main/resources/build");
                File[] files = directory.listFiles();
                for (File file : files) {
                    // convert the file name into string
                    String fileName = file.toString();

                    int index = fileName.lastIndexOf('.');
                    if (index > 0) {
                        String extension = fileName.substring(index + 1);
                        if (extension.equalsIgnoreCase("apk")) {
                            appPath = fileName;
                            break;
                        } else {
                            logger.info("APK file not found in resources folder");
                            throw new Exception("APK file not found in resources folder");
                        }
                    }
                }

                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("appium:app", appPath);
                caps.setCapability("platformName", properties.getProperty("platformName"));
                caps.setCapability("appium:platformVersion", properties.getProperty("platformVersion"));
                caps.setCapability("appium:udid", properties.getProperty("udid")); // Give Device ID of // your mobile phone
                caps.setCapability("appium:appPackage", properties.getProperty("appPackage")); //Give apps' package name
                caps.setCapability("appium:appActivity", properties.getProperty("appActivity")); // Give splash screen/home screen activity to start app or main activity
                caps.setCapability("appium:fullReset", "false");
                caps.setCapability("appium:deviceName",properties.getProperty("deviceName"));
                caps.setCapability("appium:uiautomator2ServerLaunchTimeout", 90000);
                caps.setCapability("appium:automationName", "UiAutomator2");
                caps.setCapability("appium:MobileCapabilityType.PLATFORM_NAME", "Android");
                caps.setCapability("appium:chromedriver_autodownload", true);
                caps.setCapability("appium:uiautomator2ServerInstallTimeout", 20000);
                //caps.setCapability("appium:adbExecTimeout", 40000);
                caps.setCapability("appium:adbExecTimeout", 60000);
                caps.setCapability("appium:newCommandTimeout", 180);
//                caps.setCapability("appium:uiautomator2ServerInstallTimeout", 20000);
//                caps.setCapability("appium:adbExecTimeout", 40000);
                //caps.setCapability("appium:chromedriverExecutable", "C:\\Users\\rakes\\Downloads\\Automation_Projects\\HDFC_Latest_18_06_25\\qa_automation\\chromedriver-win64\\chromedriver.exe");
                //caps.setCapability("appium:webviewConnectTimeout", "40000");
                //caps.setCapability("appium:autoWebview", false);

                url = new URL(service.getUrl().toString());
                driver = new AndroidDriver(url, caps);
                setDriver(driver);
            }

            if (properties.getProperty("env").equalsIgnoreCase("cloud")) {

                JSONParser parser = new JSONParser();
                JSONObject config = (JSONObject) parser.parse(new FileReader(System.getProperty("user.dir") + "/config/parallel.conf.json"));
                JSONArray envs = (JSONArray) config.get("environments");

                DesiredCapabilities caps = new DesiredCapabilities();
                Map<String, String> envCapabilities = (Map<String, String>) envs.get(Integer.parseInt(deviceIndex));
                Iterator it = envCapabilities.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry) it.next();
                    caps.setCapability(pair.getKey().toString(), pair.getValue().toString());
                }


                Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
                it = commonCapabilities.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry) it.next();
                    if (caps.getCapability(pair.getKey().toString()) == null) {
                        caps.setCapability(pair.getKey().toString(), pair.getValue());
                    }
                }
                String testName = System.getProperty("testName");
                if (testName == null || testName.isEmpty()) {
                    ITestContext context = Reporter.getCurrentTestResult().getTestContext();
                    testName = context.getCurrentXmlTest().getParameter("testName");
                }

                //caps.setCapability("local", "true");
                caps.setCapability("name", testName);
                caps.setCapability("framework", "testng");
                caps.setCapability("browserstackAutomation", true);
                caps.setCapability("testObservability", true);

                url = new URL("https://" + properties.getProperty("userName") + ":" + properties.getProperty("accessKey") + "@hub-cloud.browserstack.com/wd/hub");
                driver = new AndroidDriver(url, caps);
                setDriver(driver);
            }
        }
    }

    @BeforeSuite(alwaysRun = true)
    public void reportSetup() throws Exception {

        propertiesLoad();
        extentReportSpark();
        startAppiumServer();
        ///Enabling BroswerStack Local tunnel hosting BroswerStack Local
        startBroswerStackLocalServer();
    }

    @AfterSuite(alwaysRun = true)
    public void serverStopMethod() throws Exception {
        if(bsLocal.isRunning()){
            bsLocal.stop();
        }
        System.out.println("BsLocal servering ON/OFF:"+bsLocal.isRunning());

        stopAppiumServer();
    }

    @AfterTest
    public void reportTeardown() throws InterruptedException {
        extent.setSystemInfo("Platform", getDriver().getCapabilities().getCapability("platformName").toString());
        if (properties.getProperty("loginWith").equalsIgnoreCase("number")) {
            extent.setSystemInfo("Used Mobile number for Login", properties.getProperty("mobileNumber"));
        }
        if (properties.getProperty("loginWith").equalsIgnoreCase("tid")) {
            extent.setSystemInfo("Used TID for Login", properties.getProperty("tid"));
        }
        extent.flush();

        ///BrowserStackk
        if(properties.getProperty("env").equalsIgnoreCase("cloud")) {
            stopAppiumServer();
        }
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {
            test.get().log(Status.FAIL, "TEST CASE FAILED " + result.getName());
            test.get().log(Status.FAIL, "TEST CASE FAILED " + result.getThrowable());
            //screenshot(System.getProperty("user.dir") + "/screenshots/" + counter);
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.get().log(Status.SKIP, "Test Case SKIPPED " + result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.get().log(Status.PASS, "Test Case PASSED " + result.getName());
        }
    }

    public static WebDriver launchChromeDriver() throws InterruptedException {
        //   WebDriverManager.chromedriver().setup();
        // Create a new ChromeDriver instance
        WebDriver webDriver=null;
        try {
            webDriver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();
            webDriver.manage().window().maximize();
            test.get().log(Status.PASS,"Web-Browser intiated");
            return webDriver;
        }catch (Exception e) {
            test.get().log(Status.FAIL, "Web-Browser not intiated");
            return webDriver;
        }
    }

    public boolean deleteExsistingReportsFolder(String folderName) {
        Boolean status = true;
        try {
            String command = "adb shell rm -r /sdcard/Download/'" + folderName +"'";
            Process process = Runtime.getRuntime().exec(command);
            Thread.sleep(1000);

            /////GetRequiredFile
            command = "adb shell ls /sdcard/Download/";
            process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            List<String> fileList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                fileList.add(line);
            }
            for (int i = 0; i < fileList.size(); i++) {
                if (fileList.get(i).equalsIgnoreCase(folderName)) {
                    status = false;
                    break;
                }
            }
            if (status) {
                test.get().log(Status.PASS,"Folder deleted:" + folderName);
            } else {
                test.get().log(Status.FAIL,"Folder not deleted:" + folderName);
            }
            return status;
        } catch (Exception e) {
            test.get().log(Status.FAIL,"Folder not deleted:" + folderName);
            status=false;
            return status;
        }
    }

    public boolean tranferExcelToReportsFolder(String searchFileName){
        String requiredFileName="";
        Boolean status=true;
        try{
            /////GetRequiredFile
            String command = "adb shell ls /sdcard/Download/HDFC\\ SmartHub\\ Reports";
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            List<String> fileList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                fileList.add(line);
            }
            List<String> xlsxFiles = fileList.stream()
                    .filter(fileName -> fileName.endsWith(".xlsx"))
                    .collect(Collectors.toList());

            for(int i=0;i<xlsxFiles.size();i++) {
                if (xlsxFiles.get(i).contains(searchFileName)) {
                    requiredFileName=xlsxFiles.get(i);
                    test.get().log(Status.INFO,"Verify file is found:"+requiredFileName);
                    break;
                }
            }
////TransferFile
            String path=System.getProperty("user.dir");
            if(!requiredFileName.isEmpty()){
                command = "adb pull \"/sdcard/Download/HDFC SmartHub Reports/"+requiredFileName+"\" "+path+"\\Transaction_Report\\";
                process = Runtime.getRuntime().exec(command);
            }else{
                status=false;
                test.get().log(Status.FAIL,"File not available:"+requiredFileName);
            }
            return status;
        }catch (Exception e){
            test.get().log(Status.FAIL,"File not available:"+requiredFileName);
            status=false;
            return status;
        }
    }
    ///Read Excel Files code
    public List<String> readExcelByColumnName(String filePath, String columnName) {
        List<String> columnValue = new ArrayList<String>();
        try {
            // Open the Excel file
            FileInputStream file = new FileInputStream(new File(filePath));

            // Create a Workbook instance (XSSFWorkbook for .xlsx files)
            Workbook workbook = new XSSFWorkbook(file);

            // Get the first sheet (you can change this index to target a different sheet)
            Sheet sheet = workbook.getSheetAt(0);

            // Get the first row (header row)
            Row headerRow = sheet.getRow(0);
            System.out.println(headerRow.getLastCellNum());

            // Find the index of the column by its name
            int columnIndex = -1;
            Iterator<Cell> cellIterator = headerRow.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getStringCellValue().equalsIgnoreCase(columnName)) {
                    columnIndex = cell.getColumnIndex();
                    break;
                }
            }


            // If the column is not found, print a message and return empty arrayList
            if (columnIndex == -1) {
                System.out.println("Column with name '" + columnName + "' not found.");
                test.get().log(Status.FAIL,"Column with name '" + columnName + "' not found.");
            }else {

                // Iterate through the rows and fetch values from the specified column
                for (Row row : sheet) {
                    Cell cell = row.getCell(columnIndex);
                    if (cell != null) {
                        columnValue.add(cell.toString());
                        switch (cell.getCellType()) {
                            case STRING:
                                System.out.println(cell.getStringCellValue());
                                break;
                            case NUMERIC:
                                System.out.println(cell.getNumericCellValue());
                                break;
                            case BOOLEAN:
                                System.out.println(cell.getBooleanCellValue());
                                break;
                            default:
                                System.out.println("Unsupported cell type");
                        }
                    }
                }
            }
            // test.get().log(Status.INFO, "Fetched Data:" + columnValue);
            // Close the file input stream
            file.close();
        } catch (Exception e) {
            test.get().log(Status.FAIL, e);
            e.printStackTrace();
        }
        return columnValue;
    }

    public List<String> readExcelByColumnName(String filePath, String sheetName,String columnName) {
        List<String> columnValue = new ArrayList<String>();
        try {
            // Open the Excel file
            FileInputStream file = new FileInputStream(new File(filePath));

            // Create a Workbook instance (XSSFWorkbook for .xlsx files)
            Workbook workbook = new XSSFWorkbook(file);

            // Get the custom sheet name sheet
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                test.get().log(Status.FAIL,"Sheet '" + sheetName + "' not found.");
                throw new IllegalArgumentException("Sheet '" + sheetName + "' not found.");
            }else{
                test.get().log(Status.PASS,"Sheet '" + sheetName + "' found.");
            }

            // Get the first row (header row)
            Row headerRow = sheet.getRow(0);
            System.out.println(headerRow.getLastCellNum());

            // Find the index of the column by its name
            int columnIndex = -1;
            Iterator<Cell> cellIterator = headerRow.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getStringCellValue().equalsIgnoreCase(columnName)) {
                    columnIndex = cell.getColumnIndex();
                    break;
                }
            }

            // If the column is not found, print a message and return empty arrayList
            if (columnIndex == -1) {
                System.out.println("Column with name '" + columnName + "' not found.");
                test.get().log(Status.FAIL,"Column with name '" + columnName + "' not found.");
            }else {

                // Iterate through the rows and fetch values from the specified column
                for (Row row : sheet) {
                    Cell cell = row.getCell(columnIndex);
                    if (cell != null) {
                        columnValue.add(cell.toString());
                        switch (cell.getCellType()) {
                            case STRING:
                                System.out.println(cell.getStringCellValue());
                                break;
                            case NUMERIC:
                                System.out.println(cell.getNumericCellValue());
                                break;
                            case BOOLEAN:
                                System.out.println(cell.getBooleanCellValue());
                                break;
                            default:
                                System.out.println("Unsupported cell type");
                        }
                    }
                }
            }
            // test.get().log(Status.INFO, "Fetched Data:" + columnValue);
            // Close the file input stream
            file.close();
        } catch (Exception e) {
            test.get().log(Status.FAIL, e);
            e.printStackTrace();
        }
        return columnValue;
    }

    public List<String> readExcelByColumnNameToUpperCase(String filePath, String columnName) {
        List<String> columnValue = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            Row headerRow = sheet.getRow(0);

            int columnIndex = -1;
            Iterator<Cell> cellIterator = headerRow.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getStringCellValue().equalsIgnoreCase(columnName)) {
                    columnIndex = cell.getColumnIndex();
                    break;
                }
            }

            if (columnIndex == -1) {
                System.out.println("Column with name '" + columnName + "' not found.");
                test.get().log(Status.FAIL,"Column with name '" + columnName + "' not found.");
            } else {
                for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                    Row row = sheet.getRow(rowIndex);
                    if (row == null) continue;

                    Cell cell = row.getCell(columnIndex);
                    if (cell != null) {
                        String value = cell.toString().replace("’", "'");

                        // Capitalize only the header (first row)
                        if (rowIndex == 0) {
                            value = value.toUpperCase();
                        }

                        columnValue.add(value);

                        // Optional: logging
                        switch (cell.getCellType()) {
                            case STRING:
                                System.out.println(cell.getStringCellValue());
                                break;
                            case NUMERIC:
                                System.out.println(cell.getNumericCellValue());
                                break;
                            case BOOLEAN:
                                System.out.println(cell.getBooleanCellValue());
                                break;
                            default:
                                System.out.println("Unsupported cell type");
                        }
                    }
                }
            }
            file.close();
        } catch (Exception e) {
            test.get().log(Status.FAIL, e);
            e.printStackTrace();
        }
        return columnValue;
    }


    public List<String> readDataFromExcelRow1(String filenameWithPath) throws IOException {
        String path=System.getProperty("user.dir");
        List<String> columnValue = new ArrayList<String>();
        try {
            // Specify the path to your Excel file
            FileInputStream file = new FileInputStream(new File(filenameWithPath));

            // Create a workbook instance for reading Excel file (XSSFWorkbook for .xlsx files)
            Workbook workbook = new XSSFWorkbook(file);

            // Get the first sheet of the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Get the first row (row index 0)
            Row firstRow = sheet.getRow(0);

            // Iterate over the first row's cells to fetch values
            if (firstRow != null) {
                for (Cell cell : firstRow) {
                    columnValue.add(cell.toString());
                    // Get the value of each cell (depending on the type of data, adjust accordingly)
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("Unsupported Type" + "\t");
                            break;
                    }
                }
            }
            // Close the input stream
            file.close();
        } catch (IOException e) {
            test.get().log(Status.FAIL, e);
            e.printStackTrace();
        }
        //test.get().log(Status.INFO, "Fetched Data:" + columnValue);
        return columnValue;
    }

    public List<String> readDataFromExcelRow1(String filenameWithPath,String sheetName) throws IOException {
        String path=System.getProperty("user.dir");
        List<String> columnValue = new ArrayList<String>();
        try {
            // Specify the path to your Excel file
            FileInputStream file = new FileInputStream(new File(filenameWithPath));

            // Create a workbook instance for reading Excel file (XSSFWorkbook for .xlsx files)
            Workbook workbook = new XSSFWorkbook(file);

            // Get the first sheet of the workbook
            Sheet sheet = workbook.getSheet(sheetName);

            // Get the first row (row index 0)
            Row firstRow = sheet.getRow(0);

            // Iterate over the first row's cells to fetch values
            if (firstRow != null) {
                for (Cell cell : firstRow) {
                    columnValue.add(cell.toString());
                    // Get the value of each cell (depending on the type of data, adjust accordingly)
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("Unsupported Type" + "\t");
                            break;
                    }
                }
            }
            // Close the input stream
            file.close();
        } catch (IOException e) {
            test.get().log(Status.FAIL, e);
            e.printStackTrace();
        }
        test.get().log(Status.INFO, "Fetched Data:" + columnValue);
        return columnValue;
    }
    public List<String> readDataFromExcelColumn1(String fileNameWithPath) throws IOException {
        String path=System.getProperty("user.dir");
        List<String> columnValue = new ArrayList<String>();
        //  ArrayList<String>column1;
        try {
            // File path of the Excel file
            FileInputStream file = new FileInputStream(new File(fileNameWithPath));

            // Create Workbook instance (XSSFWorkbook for .xlsx file format)
            Workbook workbook = new XSSFWorkbook(file);

            // Get the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through the rows of the sheet
            for (Row row : sheet) {
                // Get the value from the first column (column 0)
                Cell cell = row.getCell(0);

                // If the cell contains a value, print it
                if (cell != null) {
                    columnValue.add(cell.toString());
                    System.out.println(cell.toString());
                }
            }
            test.get().log(Status.INFO, "Fetched Data:" + columnValue);
            // Close the file input stream
            file.close();
        }catch (Exception e){
            test.get().log(Status.FAIL, e);
        }
        return columnValue;
    }

    public static List<String> getSheetNames(String filePath) {
        List<String> sheetNames = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
            Workbook workbook = WorkbookFactory.create(fis);

            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                sheetNames.add(workbook.getSheetName(i));
            }
            workbook.close();
        } catch (Exception e) {
            test.get().log(Status.FAIL,"Excel file not Present->"+filePath);
            e.printStackTrace();
        }
        test.get().log(Status.INFO,"Excel file->"+filePath +"-> Sheet names->"+sheetNames);
        return sheetNames;
    }

    public  List<String> readWholeExcelValuesToString(String fileNameWithPath) {
        List<String> values = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(fileNameWithPath))) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            DataFormatter formatter = new DataFormatter(); // Formats everything as string
            DataFormat format = workbook.createDataFormat();
            CellStyle generalStyle = workbook.createCellStyle();
            generalStyle.setDataFormat(format.getFormat("General"));
            //   generalStyle.setDataFormat((short) 0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    cell.setCellStyle(generalStyle);
                    if (cell == null || cell.getCellType() == CellType.BLANK) {
                        values.add(""); // Handle null/empty
                    }else{
                        // Convert every cell to a string using DataFormatter
                        String value = formatter.formatCellValue(cell);
                        value = formatter.formatCellValue(cell).replace("’", "'");
                        values.add(value);
                    }
                }
            }
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // test.get().log(Status.INFO, "Fetched Data:" + values);
        return values;
    }

    public static List<String> readExcelAsTable(String fileNameWithPath) {
        List<String> values = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(fileNameWithPath))) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();

            // Ensure all cells are read with General format
            DataFormat dataFormat = workbook.createDataFormat();
            CellStyle generalStyle = workbook.createCellStyle();
            generalStyle.setDataFormat(dataFormat.getFormat("General"));

            // Step 1: Find last non-empty column from header row
            Row headerRow = sheet.getRow(0);
            int lastColumnIndex = 0;
            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
                Cell cell = headerRow.getCell(i, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                if (cell != null && !formatter.formatCellValue(cell).trim().isEmpty()) {
                    lastColumnIndex = i;
                }
            }

            // Step 2: Read data and apply general formatting
            for (Row row : sheet) {
                for (int i = 0; i <= lastColumnIndex; i++) {
                    Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    cell.setCellStyle(generalStyle);
                    String value = formatter.formatCellValue(cell);
                    // Replace "’" with "'" (single quote)
                    value = value.replace("’", "'");
                    values.add(value.isEmpty() ? " " : value);  // Convert blank to space
                }
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return values;

    }

    public static List<String> readExcelAsTable(String fileNameWithPath,String sheetName) {
        List<String> values = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(fileNameWithPath))) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            DataFormatter formatter = new DataFormatter();

            // Ensure all cells are read with General format
            DataFormat dataFormat = workbook.createDataFormat();
            CellStyle generalStyle = workbook.createCellStyle();
            generalStyle.setDataFormat(dataFormat.getFormat("General"));

            // Step 1: Find last non-empty column from header row
            Row headerRow = sheet.getRow(0);
            int lastColumnIndex = 0;
            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
                Cell cell = headerRow.getCell(i, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                if (cell != null && !formatter.formatCellValue(cell).trim().isEmpty()) {
                    lastColumnIndex = i;
                }
            }

            // Step 2: Read data and apply general formatting
            for (Row row : sheet) {
                for (int i = 0; i <= lastColumnIndex; i++) {
                    Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    cell.setCellStyle(generalStyle);
                    String value = formatter.formatCellValue(cell);
                    // Replace "’" with "'" (single quote)
                    value = value.replace("’", "'");
                    values.add(value.isEmpty() ? " " : value);  // Convert blank to space
                }
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return values;
    }


    public static List<String> readExcelFirstRowAsUpperCase(String fileNameWithPath) {
        List<String> flatList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(fileNameWithPath))) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();// Ensures all values are read as strings

            // Ensure all cells are read with General format
            DataFormat dataFormat = workbook.createDataFormat();
            CellStyle generalStyle = workbook.createCellStyle();
            generalStyle.setDataFormat(dataFormat.getFormat("General"));

            // Step 1: Read the header row to find the last non-empty column
            Row headerRow = sheet.getRow(0);
            int lastColumnIndex = 0;

            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
                Cell cell = headerRow.getCell(i, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                if (cell != null && !formatter.formatCellValue(cell).trim().isEmpty()) {
                    lastColumnIndex = i;
                }
            }

            // Step 2: Loop through all rows and columns
            for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row == null) continue;

                for (int i = 0; i <= lastColumnIndex; i++) {

                    Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    cell.setCellStyle(generalStyle);
                    String value = formatter.formatCellValue(cell);
                    // Replace "’" with "'" (single quote)
                    value = value.replace("’", "'");


                    // Capitalize values in the first row (header)
                    if (rowIndex == 0 && !value.trim().isEmpty()) {
                        value = value.toUpperCase();
                    }

                    flatList.add(value.isEmpty() ? "" : value);
                }
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return flatList;
    }


    public static List<String> readExcelFirstRowAsUpperCase(String fileNameWithPath,String sheetName) {
        List<String> flatList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(fileNameWithPath))) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            DataFormatter formatter = new DataFormatter();// Ensures all values are read as strings

            // Ensure all cells are read with General format
            DataFormat dataFormat = workbook.createDataFormat();
            CellStyle generalStyle = workbook.createCellStyle();
            generalStyle.setDataFormat(dataFormat.getFormat("General"));

            // Step 1: Read the header row to find the last non-empty column
            Row headerRow = sheet.getRow(0);
            int lastColumnIndex = 0;

            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
                Cell cell = headerRow.getCell(i, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                if (cell != null && !formatter.formatCellValue(cell).trim().isEmpty()) {
                    lastColumnIndex = i;
                }
            }

            // Step 2: Loop through all rows and columns
            for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row == null) continue;

                for (int i = 0; i <= lastColumnIndex; i++) {

                    Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    cell.setCellStyle(generalStyle);
                    String value = formatter.formatCellValue(cell);
                    // Replace "’" with "'" (single quote)
                    value = value.replace("’", "'");


                    // Capitalize values in the first row (header)
                    if (rowIndex == 0 && !value.trim().isEmpty()) {
                        value = value.toUpperCase();
                    }
                    flatList.add(value.isEmpty() ? "" : value);
                }
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return flatList;
    }


    public  List<String> readWholeExcelValuesToString(String fileNameWithPath,String sheetName) {
        List<String> values = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(fileNameWithPath))) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            DataFormatter formatter = new DataFormatter(); // Formats everything as string
            DataFormat format = workbook.createDataFormat();
            CellStyle generalStyle = workbook.createCellStyle();
            generalStyle.setDataFormat(format.getFormat("General"));
            //   generalStyle.setDataFormat((short) 0);
            for (Row row : sheet) {
                int lastColumn = row.getLastCellNum(); // Ensure full width is covered
                for (int cn = 0; cn < lastColumn; cn++) {
                    Cell cell = row.getCell(cn, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                    if (cell == null || cell.getCellType() == CellType.BLANK) {
                        values.add("");
                    } else {
                        String value = formatter.formatCellValue(cell).replace("’", "'");
                        values.add(value);
                    }
                }
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // test.get().log(Status.INFO, "Fetched Data:" + values);
        return values;
    }

    public boolean compareTitleOfExcel(String fileNameWithPath,String expectedTitleHeader) throws IOException {
        String path = System.getProperty("user.dir");
        Boolean status = true;

        List<String> expectedRowValues = readExcelByColumnName(path + "\\Transaction_Report\\Expected_Headers\\Transaction_Headers.xlsx", expectedTitleHeader);
        List<String> actualRowValues = readDataFromExcelRow1(fileNameWithPath);

////Check count and has values or not
        if(expectedRowValues.size()>0&& actualRowValues.size()>0&&actualRowValues.size()==expectedRowValues.size()-1){
            for (int i = 1; i < expectedRowValues.size(); i++) {
                if (expectedRowValues.get(i).equals(actualRowValues.get(i - 1))) {
                    status = true;
                } else {
                    status = false;
                    break;
                }
            }
            if(status){
                test.get().log(Status.PASS, "Report titles are matching->FileName:"+fileNameWithPath);
            }else{
                test.get().log(Status.FAIL, "Reports titles are not matching->FileName:"+fileNameWithPath);
            }
            test.get().log(Status.INFO, "Expected Titles:" + expectedRowValues);
            test.get().log(Status.INFO, "Actual Titles in report:" + actualRowValues);
        }else{
            status = false;
            test.get().log(Status.FAIL, "Reports titles are not matching->FileName:"+fileNameWithPath);
            test.get().log(Status.INFO, "Expected Titles:" + expectedRowValues);
            test.get().log(Status.INFO, "Actual Titles in report:" + actualRowValues);
        }
        return status;
    }


    public boolean compareTitleOfExcel(String fileNameWithPath,String sheetName,String expectedTitleHeader) throws IOException {
        String path = System.getProperty("user.dir");
        Boolean status = true;

        List<String> expectedRowValues = readExcelByColumnName(path + "\\Transaction_Report\\Expected_Headers\\Transaction_Headers.xlsx",expectedTitleHeader);
        List<String> actualRowValues = readDataFromExcelRow1(fileNameWithPath,sheetName);

////Check count and has values or not
        if(expectedRowValues.size()>0&& actualRowValues.size()>0&&actualRowValues.size()==expectedRowValues.size()-1){
            for (int i = 1; i < expectedRowValues.size(); i++) {
                if (expectedRowValues.get(i).equals(actualRowValues.get(i - 1))) {
                    status = true;
                } else {
                    status = false;
                    break;
                }
            }
            if(status){
                test.get().log(Status.PASS, "Report titles are matching->FileName:"+fileNameWithPath);
            }else{
                test.get().log(Status.FAIL, "Reports titles are not matching->FileName:"+fileNameWithPath);
            }
            test.get().log(Status.INFO, "Expected Titles:" + expectedRowValues);
            test.get().log(Status.INFO, "Actual Titles in report:" + actualRowValues);
        }else{
            status = false;
            test.get().log(Status.FAIL, "Reports titles are not matching->FileName:"+fileNameWithPath);
            test.get().log(Status.INFO, "Expected Titles:" + expectedRowValues);
            test.get().log(Status.INFO, "Actual Titles in report:" + actualRowValues);
        }
        return status;
    }

    public boolean compareWholeExcel(String downloadedfileNameActual,String dataBaseFileNameExpected) throws IOException {
        String path = System.getProperty("user.dir");
        Boolean status = true;

        List<String> downloadedfileListActual = readExcelAsTable(path + "\\Transaction_Report\\"+downloadedfileNameActual);
        List<String> dataBaseFileListExpected = readExcelAsTable(path + "\\Transaction_Report\\"+dataBaseFileNameExpected);
        int differenceCount=0;
////Check count and has values or not
        if(downloadedfileListActual.size()>0&& dataBaseFileListExpected.size()>0&&downloadedfileListActual.size()==dataBaseFileListExpected.size()){
            for (int i = 0; i <downloadedfileListActual.size(); i++) {
                if (downloadedfileListActual.get(i).equals(dataBaseFileListExpected.get(i))) {
                    //status = true;
                } else {
                    status = false;
                    differenceCount++;
                    test.get().log(Status.INFO,"Actual Value:"+downloadedfileListActual.get(i) +"<br /> Expected Value:"+ dataBaseFileListExpected.get(i)+"<br /> Differnece Count:"+differenceCount);
                    // break;
                }
            }
            if(differenceCount==0){
                test.get().log(Status.PASS, "Verify Reports are same"+"<br />Downloaded File(Actual)->"+downloadedfileNameActual+"<br />Database File(Expected)->"+dataBaseFileNameExpected);
            }else{
                test.get().log(Status.FAIL, "Verify Reports are same"+"<br />Downloaded File(Actual)->"+downloadedfileNameActual+"<br />Database File(Expected)->"+dataBaseFileNameExpected);
            }
        }else{
            status = false;
            test.get().log(Status.FAIL, "Reports are not same or not matching"+"<br />Downloaded File(Actual)->"+downloadedfileNameActual+"<br />Database File(Expected)->"+dataBaseFileNameExpected);
        }
        return status;
    }


    public boolean compareWholeExcel(String downloadedfileNameActual,String sheetName,String dataBaseFileNameExpected) throws IOException {
        String path = System.getProperty("user.dir");
        Boolean status = true;

        List<String> downloadedfileListActual = readWholeExcelValuesToString(path + "\\Transaction_Report\\"+downloadedfileNameActual,sheetName);
        List<String> dataBaseFileListExpected = readWholeExcelValuesToString(path + "\\Transaction_Report\\"+dataBaseFileNameExpected);
        int differenceCount=0;
////Check count and has values or not
        if(downloadedfileListActual.size()>0&& dataBaseFileListExpected.size()>0&&downloadedfileListActual.size()==dataBaseFileListExpected.size()){
            for (int i = 0; i <downloadedfileListActual.size(); i++) {
                if (downloadedfileListActual.get(i).equals(dataBaseFileListExpected.get(i))) {
                    //status = true;
                } else {
                    status = false;
                    differenceCount++;
                    String actualValue=downloadedfileListActual.get(i);
                    String expectedValue=dataBaseFileListExpected.get(i);
                    test.get().log(Status.INFO,"Actual Value:"+actualValue +"<br /> Expected Value:"+ expectedValue+"<br /> Differnece Count:"+differenceCount);
                    // break;
                }
            }
            if(differenceCount==0){
                test.get().log(Status.PASS, "Verify Reports are same"+"<br />Downloaded File(Actual)->"+downloadedfileNameActual+"<br />Database File(Expected)->"+dataBaseFileNameExpected);
            }else{
                test.get().log(Status.FAIL, "Verify Reports are same"+"<br />Downloaded File(Actual)->"+downloadedfileNameActual+"<br />Database File(Expected)->"+dataBaseFileNameExpected);
            }
        }else{

            status = false;
            test.get().log(Status.FAIL, "Reports are not same or not matching"+"<br />Downloaded File(Actual)->"+downloadedfileNameActual+"<br />Database File(Expected)->"+dataBaseFileNameExpected);
        }
//        test.get().log(Status.INFO,"Download from mobile->"+downloadedfileListActual);
//        test.get().log(Status.INFO,"Download from DB->"+dataBaseFileListExpected);
        return status;
    }


    public boolean compareWholeExcelTitleToUpperCase(String downloadedfileNameActual,String sheetName,String dataBaseFileNameExpected) throws IOException {
        String path = System.getProperty("user.dir");
        Boolean status = true;

        List<String> downloadedfileListActual = readExcelFirstRowAsUpperCase(path + "\\Transaction_Report\\"+downloadedfileNameActual,sheetName);
        List<String> dataBaseFileListExpected = readExcelFirstRowAsUpperCase(path + "\\Transaction_Report\\"+dataBaseFileNameExpected);
        int differenceCount=0;
////Check count and has values or not
        if(downloadedfileListActual.size()>0&& dataBaseFileListExpected.size()>0&&downloadedfileListActual.size()==dataBaseFileListExpected.size()){
            for (int i = 0; i <downloadedfileListActual.size(); i++) {
                if (downloadedfileListActual.get(i).equals(dataBaseFileListExpected.get(i))) {
                    //status = true;
                } else {
                    status = false;
                    differenceCount++;
                    String actualValue=downloadedfileListActual.get(i);
                    String expectedValue=dataBaseFileListExpected.get(i);
                    test.get().log(Status.INFO,"Actual Value:"+actualValue +"<br /> Expected Value:"+ expectedValue+"<br /> Differnece Count:"+differenceCount);
                    // break;
                }
            }
            if(differenceCount==0){
                test.get().log(Status.PASS, "Verify Reports are same"+"<br />Downloaded File(Actual)->"+downloadedfileNameActual+"<br />Database File(Expected)->"+dataBaseFileNameExpected);
            }else{
                test.get().log(Status.FAIL, "Verify Reports are same"+"<br />Downloaded File(Actual)->"+downloadedfileNameActual+"<br />Database File(Expected)->"+dataBaseFileNameExpected);
            }
        }else{

            status = false;
            test.get().log(Status.FAIL, "Reports are not same or not matching"+"<br />Downloaded File(Actual)->"+downloadedfileNameActual+"<br />Database File(Expected)->"+dataBaseFileNameExpected);
        }
//        test.get().log(Status.INFO,"Download from mobile->"+downloadedfileListActual);
//        test.get().log(Status.INFO,"Download from DB->"+dataBaseFileListExpected);
        return status;
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

        spark.config().setDocumentTitle("HDFC SmartHub Automation Testing Report");
        spark.config().setReportName("HDFC SmartHub Automation Test Suite");
        spark.config().setTimelineEnabled(Boolean.TRUE);
        spark.config().setOfflineMode(Boolean.TRUE);
        spark.config().setTheme(Theme.STANDARD);
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

    public void startBroswerStackLocalServer() throws Exception {
        bsLocal = new Local();
        ///Enabling BroswerStack Local tunnel hosting BroswerStack Local
        if(properties.getProperty("env").equalsIgnoreCase("cloud")) {
            if (properties.getProperty("isVPNRequired").equalsIgnoreCase("yes")) {
                if (bsLocal.isRunning()) {
                    bsLocal.stop();
                    Thread.sleep(2500);
                }
                HashMap<String, String> bsLocalArgs = new HashMap<String, String>();
                bsLocalArgs.put("key", properties.getProperty("accessKey"));
                bsLocalArgs.put("forcelocal", "true");
                bsLocal.start(bsLocalArgs);
                Thread.sleep(3000);
                System.out.println(bsLocal.isRunning());
            }
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
//                serviceBuilder.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"));
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
        try(ServerSocket socket= new ServerSocket()){
            socket.setReuseAddress(false);
            socket.bind(new InetSocketAddress(InetAddress.getByName("localhost"), port), 1);
            return true;
        }catch (Exception ex){
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
        try {
            getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).resourceId(\""+resourceID+"\")).setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\""+text+"\"))"));
            test.get().info("Horizontal scroll done");
        }
        catch (Exception e){
            test.get().fail("Horizontal scroll not done");
        }
    }


    public  String generateRandomName(int length) {
        Random random = new Random();
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + (random.nextBoolean() ? 'A' : 'a'));
            name.append(randomChar);
        }
        return name.toString();
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

    public void verticalScroll(String resourceID, String text) {

        getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()" + ".resourceId(\"" + resourceID + "\")).scrollIntoView("
                + "new UiSelector().text(\"" + text + "\"));"));

    }


//    public void scrollAndClick(String visibleText) {
//        getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
//    }

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

    public void scrollBottom() throws InterruptedException {
        scrolling(0.5, 0.8, 0.5, 0.2);
    }

    public void scrolling(double start_x, double start_y, double end_x, double end_y) throws InterruptedException {
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
        Thread.sleep(1000);
    }

    public void swipeWithDirection(String direction, WebElement ele) {
        // Locate the carousel banner element
        // WebElement ele = driver.findElement(By.id("carousel_banner_id")); // Replace with the actual ID

        // Get the element's location and size
        int startX, endX;
        int y = (int) (ele.getLocation().getY() + ele.getSize().getHeight() / 2); // Swipe at mid-height of the banner

        if ("left".equalsIgnoreCase(direction)) {
            // Swipe left: start near the right edge, end near the left edge
            startX = (int) (ele.getLocation().getX() + ele.getSize().getWidth() * 0.8);
            endX = (int) (ele.getLocation().getX() + ele.getSize().getWidth() * 0.2);
        } else if ("right".equalsIgnoreCase(direction)) {
            // Swipe right: start near the left edge, end near the right edge
            startX = (int) (ele.getLocation().getX() + ele.getSize().getWidth() * 0.2);
            endX = (int) (ele.getLocation().getX() + ele.getSize().getWidth() * 0.8);
        } else {
            throw new IllegalArgumentException("Invalid direction: Use 'left' or 'right'.");
        }

        // Create a swipe action using PointerInput
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 0);

        // Add swipe actions to the sequence
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, y));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(800), PointerInput.Origin.viewport(), endX, y));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Perform the swipe action
        getDriver().perform(Collections.singletonList(swipe));
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

    public boolean isElementDisplayed(WebElement el){
        try{
            return el.isDisplayed() || el.isEnabled();
        }catch(Exception e){
            return false;
        }
    }

    public boolean isElementDisplayed(WebElement el,int i){
        try{
            Wait wait = new WebDriverWait(AppiumTestBase.getDriver(), Duration.ofSeconds(i));
            wait.until(ExpectedConditions.visibilityOf(el));
            test.get().log(Status.PASS, "Element displayed :"+el);
            return el.isDisplayed();
        }catch(Exception e){
            //           test.get().log(Status.FAIL, "Element Not displayed :"+el +":"+e);
            return false;
        }
    }

    public boolean isElementEnabled(WebElement el){
        try{
            Wait wait = new WebDriverWait(AppiumTestBase.getDriver(), Duration.ofSeconds(13));
            wait.until(ExpectedConditions.visibilityOf(el));
            return el.isEnabled();
        }catch(Exception e){
            return false;
        }
    }

}