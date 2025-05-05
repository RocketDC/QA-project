package web_automation.analytics_vidhya.utils;

import org.testng.annotations.DataProvider;

public class AnalyticsVidhyaDataProvider {
    @DataProvider
    public static Object[][] analyticVidhyaData() {
        return new Object[][]{

                { "https://www.analyticsvidhya.com", "/pinnacleplus/", "Alpha Beta", "7894561235","abc@abc.aki"},


        };
    }

    @DataProvider
    public static Object[][] analyticVidhyaPopUpData() {
        return new Object[][]{

                {  "Alpha Beta", "7894561235","abc@abc.aki"},


        };
    }
    @DataProvider
    public static Object[][] analyticVidhyaFees() {
        return new Object[][]{

                {  "₹94,999", "₹9,499"},


        };
    }

}
