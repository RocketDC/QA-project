package web_automation.commons.base;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.epam.healenium.SelfHealingDriver;
import java.io.IOException;
import java.util.List;

/**
 * Core interface defining the contract for web automation operations.
 * This interface contains all public methods from CommonTestBase that should be
 * accessible to test classes.
 */
public interface AutomationInterface {
    
    // ===============================================================
    // 1. WebDriver Related Methods
    // ===============================================================
    
    /**
     * Gets the current WebDriver instance.
     * @return the current WebDriver instance
     */
    static SelfHealingDriver getDriver() {
        return null;
    }

    /**
     * Sets the WebDriver instance.
     * @param drv the WebDriver instance to set
     */
    static void setDriver(SelfHealingDriver drv) {}
    
    /**
     * Sets the WebDriver instance (alternative method).
     * @param drv the WebDriver instance to set
     */
    static void setDriver(WebDriver drv) {}
    
    /**
     * Sets the ExtentTest instance for reporting.
     * @param testObj the ExtentTest instance to set
     */
    static void setExtentTest(ExtentTest testObj) {}

    // ===============================================================
    // 2. Test Lifecycle Methods
    // ===============================================================
    
    /**
     * Initializes the test suite.
     * @throws IOException if an I/O error occurs
     */
    void beforeSuite() throws IOException;
    
    /**
     * Cleans up after the test suite.
     */
    void afterSuite();
    
    /**
     * Executes after each test method.
     */
    void afterTest();

    // ===============================================================
    // 3. Wait and Synchronization Methods
    // ===============================================================
    
    /**
     * Pauses execution for the specified number of seconds.
     * @param seconds the number of seconds to pause
     */
    void threadSleep(int seconds);
    
    /**
     * Waits for the specified number of seconds.
     * @param seconds the number of seconds to wait
     */
    void hardWait(double seconds);
    
    /**
     * Waits for an element to be visible.
     * @param el the element to wait for
     */
    void waitForElementToBeVisible(WebElement el);
    
    /**
     * Waits for an element to be invisible.
     * @param el the element to wait for
     */
    void waitForElementToBeInvisible(WebElement el);
    
    /**
     * Waits for an element to be present in the DOM.
     * @param el the element to wait for
     */
    void waitForElementToBePresent(WebElement el);
    
    // ===============================================================
    // 4. Element Interaction Methods
    // ===============================================================
    
    /**
     * Clicks on the specified element.
     * @param el the element to click
     * @param message a description of the action for reporting
     */
    void click(WebElement el, String message);
    
    /**
     * Sends keys to the specified element.
     * @param element the element to send keys to
     * @param expectedText the text to send
     */
    void sendKeys(WebElement element, String expectedText);
    
    /**
     * Clears the text from the specified element.
     * @param element the element to clear
     * @param message a description of the action for reporting
     */
    void clearTextBox(WebElement element, String message);
    
    /**
     * Hovers over the specified element.
     * @param element the element to hover over
     * @param message a description of the action for reporting
     */
    void hover(WebElement element, String message);
    
    /**
     * Scrolls the specified element into view.
     * @param target the element to scroll to
     */
    void scrollIntoView(WebElement target);
    
    // ===============================================================
    // 5. Element State Verification
    // ===============================================================
    
    /**
     * Checks if the specified element is displayed.
     * @param el the element to check
     * @return true if the element is displayed, false otherwise
     */
    boolean isElementDisplayed(WebElement el);
    
    /**
     * Checks if the specified element is enabled.
     * @param el the element to check
     * @return true if the element is enabled, false otherwise
     */
    boolean isElementEnabled(WebElement el);
    
    /**
     * Checks if the specified element is displayed.
     * @param element the element to check
     * @return true if the element is displayed, false otherwise
     */
    boolean isDisplayed(WebElement element);
    
    // ===============================================================
    // 6. Alert Handling
    // ===============================================================
    
    /**
     * Checks if an alert is present.
     * @return true if an alert is present, false otherwise
     */
    boolean isAlertPresent();
    
    /**
     * Accepts the currently active alert.
     */
    void acceptAlert();
    
    /**
     * Dismisses the currently active alert.
     */
    void dismissAlert();
    
    /**
     * Gets the text of the currently active alert.
     * @return the alert text, or null if no alert is present
     */
    String getAlertText();
    
    // ===============================================================
    // 7. Frame Handling
    // ===============================================================
    
    /**
     * Switches to the specified frame.
     * @param frame the frame to switch to
     */
    void switchToFrame(WebElement frame);
    
    /**
     * Switches back to the default content.
     */
    void switchToDefaultContent();
    
    // ===============================================================
    // 8. Dropdown Handling
    // ===============================================================
    
    /**
     * Selects an option from a dropdown by visible text.
     * @param element the dropdown element
     * @param option the option to select
     * @param message a description of the action for reporting
     */
    void selectFromDropdown(WebElement element, String option, String message);
    
    // ===============================================================
    // 9. Text Verification
    // ===============================================================
    
    /**
     * Validates that the specified text is present on the page.
     * @param expectedText the text to validate
     */
    void validateTextPresence(String expectedText);
    
    /**
     * Asserts that the specified element's text matches the expected text.
     * @param element the element to check
     * @param expectedText the expected text
     */
    void softAssert(WebElement element, String expectedText);
    
    /**
     * Asserts that the actual text matches the expected text.
     * @param actualText the actual text
     * @param expectedText the expected text
     */
    void softAssert(String actualText, String expectedText);
    
    /**
     * Validates the placeholder text of the specified element.
     * @param element the element to check
     * @param expectedText the expected placeholder text
     */
    void validatePlaceholderText(WebElement element, String expectedText);
    
    // ===============================================================
    // 10. Utility Methods
    // ===============================================================
    
    /**
     * Extracts all matches of the specified regex from the input string.
     * @param input the input string
     * @param regex the regular expression to match
     * @return a list of matches
     */
    List<String> extractRegexMatches(String input, String regex);
    
    /**
     * Generates a random string of the specified length.
     * @param length the length of the string to generate
     * @param prefix the prefix to prepend to the random string
     * @return the generated string
     */
    String generateRandomString(int length, String prefix);
    
    /**
     * Checks if the specified text is present on the page.
     * @param text the text to check for
     * @return true if the text is present, false otherwise
     */
    boolean isTextPresent(String text);
    
    /**
     * Records logs for the test execution.
     */
    void recordLogs();
    
    /**
     * Finds an element using the specified locator.
     * @param by the locator to find the element with
     * @return the found WebElement
     */
    WebElement findElement(By by);
    
    /**
     * Finds all elements matching the specified locator.
     * @param by the locator to find elements with
     * @return a list of matching WebElements
     */
    List<WebElement> findElements(By by);
}