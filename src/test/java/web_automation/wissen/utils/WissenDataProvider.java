package web_automation.wissen.utils;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class WissenDataProvider {
    @DataProvider
    public static Object[][] wissenData() {
        List<Object[]> data = new ArrayList<>();
        
        // Test data for Contact Us form
        data.add(new Object[]{
                "John",
                "Doe",
                "Client",
                "abc company",
                "john.doe@example.com",
                "1234567890",
                "I am interested in your services",
                "Something"
        });
        
//        data.add(new Object[]{
//            "Jane Smith",
//            "Doe",
//            "Client",
//            "abc company",
//            "jane.smith@example.com",
//            "9876543210",
//            "I have a query about your career opportunities",
//            "Something"
//        });
        
        return data.toArray(new Object[0][]);
    }

    @DataProvider
    public static Object[][] wissenUrls() {
        return new Object[][]{

                { "https://www.wissen.com/"},


        };
    }
}
