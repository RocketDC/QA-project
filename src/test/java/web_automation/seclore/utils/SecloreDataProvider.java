package web_automation.seclore.utils;

import org.testng.annotations.DataProvider;

public class SecloreDataProvider {
    //Adding data provider for Contact Us page
    @DataProvider
    public static Object[][] secloreUrls() {
        return new Object[][] {
            {"https://www.seclore.com/", "demo/"  }
        };
    }

    @DataProvider
    public static Object[][] secloreData() {
        return new Object[][] {
            {
                "eren.jaeger@scouts.paradis",   // Business Email
                "Eren",                         // First Name
                "Jaeger",                       // Last Name
                "Survey Corps",                 // Company name
                "Attack Titan Shifter",         // Job title
                "8451234567",                   // Phone number
                "India",                        // Country
                "Maharashtra"                   // State    
            }
        };
    }
}
