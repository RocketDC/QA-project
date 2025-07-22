package android_automation.commons;

import java.io.IOException;

public interface TestBaseInterface {
    
    /**
     * Initializes the AndroidDriver and sets up the extent report.
     * @throws IOException if there is an error loading the properties file.
     */
    public void appiumServerSetup() throws IOException;

/* <<<<<<<<<<<<<<  ✨ StopAppiumServer Command ⭐ >>>>>>>>>>>>>>>> */
    /**
     * Stops the Appium server. It quits the AndroidDriver and stops
     * the Appium service if running locally. Logs server stop status.
     */
    public void stopAppiumServer();



/* <<<<<<<<<<<<<<  ✨ StartAppiumServer Command ⭐ >>>>>>>>>>>>>>>> */
    /**
     * Starts the Appium server. It starts the Appium service if running locally or
     * if running on BrowserStack it starts the local tunnel. It logs server start
     * status.
     */
    public void startAppiumServer();



    
}
