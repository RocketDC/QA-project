package web_automation.morningstar.utils;

import org.testng.annotations.DataProvider;

public class MorningstarDataProvider {
    //Adding data provider for Contact Us page
    @DataProvider
    public static Object[][] morningstarUrlsAndEndpoints() {
        return new Object[][] {
            {"https://www.morningstar.in", "" }
        };
    }

    @DataProvider
    public static Object[][] morningstarFormData() {
        return new Object[][] {
                {"", "/contact-us"  }
        };
    }
}
