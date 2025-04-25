package api_automation;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import common.TestBase;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


import static io.restassured.RestAssured.given;

/**
 * This class is responsible for sending SMS using the Nexmo API.
 * It includes methods to send an SMS, handle API errors, log API responses,
 * validate API responses, and fetch various properties from a JSON file.
 */
@Slf4j
public class SmsApi extends TestBase {
    private final String moduleName = "sms";

    @Test(priority = 1)
    public void testSendSms() {
        ExtentTest test = extent.createTest("TC" + getClass() + "testSendSms", "Verifying if user can send a message").assignCategory(moduleName );
        setExtentTest(test);
        logger.info("Verifying the SMS API");
        // Test method to send an SMS
        Response response = sendSms(getProperty("mobileNumber"), "Hello, this is a test message.", getProperty("api_key"));
        if (response.getStatusCode() == 200) {
            System.out.println("SMS sent successfully.");
        } else {
            System.out.println("Failed to send SMS. Status code: " + response.getStatusCode());
        }


    }

    @Test(priority = 2)
    public void testSendSms_without_APiKey() {
        ExtentTest test = extent.createTest("TC" + getClass() + "testSendSms_without_APiKey", "Verifying if user can't send a message without api key").assignCategory(moduleName );
        setExtentTest(test);
        logger.info("Verifying if user can't send a message without api key");
        // Test method to send an SMS
        Response response = smsRequest(getProperty("mobileNumber"), "Hello, this is a test message.", "" )
                .post(getProperty("sms_url")+ getProperty("sms_path")).then().extract().response();
        if( response.getStatusCode() == 200) {

            test.log(Status.FAIL,"SMS sending shouldn't be allowed without api key" + response.getStatusCode() + "\nResponse Body: " + response.getBody().asString());
            logger.info("SMS sending shouldn't be allowed without api key" + response.getStatusCode() + "\nResponse Body: " + response.getBody().asString());
        } else {
            logApiResponse(response.getBody().asString());
            test.log(Status.PASS,"SMS sent Failed without api key. Status code: " + response.getStatusCode());
            logger.info("SMS sent Failed without api key. Status code: " + response.getStatusCode());
        }
        System.out.println("Response: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());


    }

    @Test(priority = 3)
    public void testSendSms_without_message() {
        ExtentTest test = extent.createTest("TC" + getClass() + "testSendSms_without_message", "Verifying if user can't send sms without message").assignCategory(moduleName );
        setExtentTest(test);
        logger.info("Verifying if user can't send sms without message");
        // Test to send an SMS without message
        Response response = smsRequest(getProperty("mobileNumber"), "", getProperty("api_key") )
                .post(getProperty("sms_url")+ getProperty("sms_path")).then().extract().response();
        if( response.getStatusCode() == 200) {

            test.log(Status.FAIL,"SMS sending shouldn't be allowed without message" + response.getStatusCode() + "\nResponse Body: " + response.getBody().asString());
            logger.info("SMS sending shouldn't be allowed without message" + response.getStatusCode() + "\nResponse Body: " + response.getBody().asString());
        } else {
            logApiResponse(response.getBody().asString());
            test.log(Status.PASS,"SMS sent Failed without message. Status code: " + response.getStatusCode());
            logger.info("SMS sent Failed without message. Status code: " + response.getStatusCode());
        }
        System.out.println("Response: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());


    }

    @Test(priority = 4)
    public void testSendSms_without_ValidPhoneNumber() {
        ExtentTest test = extent.createTest("TC" + getClass() + "testSendSms_without_ValidPhoneNumber", "Verifying if user can't send sms without valid phone number").assignCategory(moduleName );
        setExtentTest(test);
        logger.info("Verifying if user can't send sms without valid phone number");
        // Test to send an SMS without message
        Response response = smsRequest("alpha", "Hello, this is a test message.", getProperty("api_key") )
                .post(getProperty("sms_url")+ getProperty("sms_path")).then().extract().response();
        if( response.getStatusCode() == 200) {

            test.log(Status.FAIL,"SMS sending shouldn't be allowed without valid phone number" + response.getStatusCode() + "\nResponse Body: " + response.getBody().asString());
            logger.info("SMS sending shouldn't be allowed without valid phone number" + response.getStatusCode() + "\nResponse Body: " + response.getBody().asString());
        } else {
            logApiResponse(response.getBody().asString());
            test.log(Status.PASS,"SMS sent Failed without valid phone number. Status code: " + response.getStatusCode());
            logger.info("SMS sent Failed without valid phone number. Status code: " + response.getStatusCode());
        }
        System.out.println("Response: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());


    }


    // Method to send an SMS
    public RequestSpecification smsRequest(String phoneNumber, String message, String apiKey) {

        RequestSpecification requestSpecification = given()
                .formParam("api_key", apiKey)
                .formParam("api_secret", getProperty("api_secret"))
                .formParam("to", phoneNumber)
                .formParam("from", "Nexmo")
                .formParam("text", message);

        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
        return requestSpecification;
    }
public Response sendSms(String phoneNumber, String message, String apiKey){
    ExtentTest test = extent.createTest("TC" + getClass() + "sendSms", "Sending the sms request").assignCategory(moduleName );
    setExtentTest(test);
    // Code to send an SMS using the API
    Response response = smsRequest(phoneNumber, message,apiKey )
            .post(getProperty("sms_url")+ getProperty("sms_path")).then().extract().response();
    if( response.getStatusCode() != 200) {
        handleApiError("Failed to send SMS. Status code: " + response.getStatusCode() + "\nError: " + response.getBody().asString());
        test.log(Status.FAIL,"Failed to send SMS. Status code: " + response.getStatusCode() + "\nError: " + response.getBody().asString());
        logger.info("Failed to send SMS. Status code: " + response.getStatusCode() + "\nError: " + response.getBody().asString());
    } else {
        logApiResponse(response.getBody().asString());
        test.log(Status.PASS,"SMS sent successfully. Status code: " + response.getStatusCode());
        logger.info("SMS sent successfully. Status code: " + response.getStatusCode());
    }
    System.out.println("Response: " + response.getStatusCode());
    System.out.println("Response Body: " + response.getBody().asString());

    return response;
}
    // Method to handle API errors
    public void handleApiError(String errorMessage) {
        // Code to handle API errors
        System.err.println("API Error: " + errorMessage);
    }
    // Method to log API responses
    public void logApiResponse(String response) {
        // Code to log API responses
        logger.info("API Response: " + response);
    }
    // Method to validate API responses
    public boolean validateApiResponse(String response) {
        return response != null && !response.isEmpty();
    }
    // Method to fetch various properties
    public String getProperty(String key) {
        try {
            // Read the JSON file as a String
            String jsonContent = new String(Files.readAllBytes(Paths.get("src/test/resources/properties.json")));

            // Parse the JSON content
            JSONObject jsonObject = new JSONObject(jsonContent);

            // Get a variable from the JSON file
            return jsonObject.getString(key);

        } catch (IOException e) {
            logger.error("Error reading property: {}", key, e);
        }
        return null;
    }

}
