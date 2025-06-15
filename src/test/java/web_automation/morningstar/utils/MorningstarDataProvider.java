package web_automation.morningstar.utils;

import org.testng.annotations.DataProvider;
import web_automation.commons.base.CommonTestBase;

public class MorningstarDataProvider {
    //Adding data provider for Contact Us page
    @DataProvider
    public static Object[][] morningstarUrlsAndEndpoints() {
        return new Object[][] {
            {"https://www.morningstar.in", "" }
        };
    }

    @DataProvider
    public static Object[][] morningstarFormDataInitialRegistration() {
        //Adding data provider for Initial Registration page
        // Adding random data for firstname, lastname, email and phone
        // Using generateRandomString method from CommonTestBase class
        CommonTestBase commonTestBase = new CommonTestBase();
        String firstname = commonTestBase.generateRandomString(10, "test");
        String lastname = commonTestBase.generateRandomString(10, "test");
        String email = commonTestBase.generateRandomString(6, "test") + "@gmail.com";
        String phone = "+91"+String.valueOf(commonTestBase.generateRandomInt(10));
        return new Object[][] {
                {firstname, lastname, email, phone  }
        };
    }
}
