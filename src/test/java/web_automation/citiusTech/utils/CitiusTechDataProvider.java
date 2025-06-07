package web_automation.citiusTech.utils;

import org.testng.annotations.DataProvider;

public class CitiusTechDataProvider {
    //Adding data provider for Contact Us page
    @DataProvider
    public static Object[][] citiusTechData() {
        return new Object[][] {
            {"https://www.citiustech.com", "/contact-us"  }
        };
    }
}
