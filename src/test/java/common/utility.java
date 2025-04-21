package common;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class utility {
    @DataProvider(name = "smsData")
    public Object[][] provideSmsData() {
        return new Object[][]{
                {"918888888888", "Hello from TestNG!"},
                {"919999999999", "Another test message"},
                {"918777777777", "Yet another one!"}
        };
    }

    @DataProvider(name = "smsDataFromJson")
    public Object[][] getSmsData() throws IOException {
        String json = new String(Files.readAllBytes(Paths.get("src/test/resources/properties.json")));
        JSONObject obj = new JSONObject(json);
        JSONArray arr = obj.getJSONArray("smsData");

        Object[][] data = new Object[arr.length()][2];
        for (int i = 0; i < arr.length(); i++) {
            JSONObject entry = arr.getJSONObject(i);
            data[i][0] = entry.getString("mobileNumber");
            data[i][1] = entry.getString("message");
        }
        return data;
    }
}
