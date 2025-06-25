package web_automation.seclore.utils;

import org.testng.annotations.DataProvider;

public class SecloreDataProvider {
    //Adding data provider for Contact Us page
    @DataProvider
    public static Object[][] secloreUrl() {
        return new Object[][] {
            {"https://www.seclore.com/", "demo/"  }
        };
    }

    @DataProvider
    public static Object[][] secloreData() {
        return new Object[][] {
                {"https://www.citiustech.com", "/contact-us"  }
        };
    }
}
