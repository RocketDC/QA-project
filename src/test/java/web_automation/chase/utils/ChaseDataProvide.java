package web_automation.chase.utils;

import org.testng.annotations.DataProvider;

public class ChaseDataProvide {
    //Adding data provider for Contact Us page
    @DataProvider
    public static Object[][] chaseUrls() {
        return new Object[][] {
            {"https://www.chase.com/", "demo/"  }
        };
    }
    
    @DataProvider
    public static Object[][] chaseData() {
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
