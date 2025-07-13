package web_automation.chase.utils;

import org.testng.annotations.DataProvider;

public class ChaseDataProvide {
    //Adding data provider for Contact Us page
    @DataProvider
    public static Object[][] chaseUrls() {
        return new Object[][] {
            {"https://www.chase.com", "/personal/home"  }
        };
    }
    
    @DataProvider
    public static Object[][] chaseData() {
        return new Object[][] {
            {
                 //Sample username
                 "sampleusername",
                 //Sample password
                 "samplepassword"
            }
        };
    }
}
