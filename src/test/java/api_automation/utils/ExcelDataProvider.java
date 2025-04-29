package api_automation.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;

public class ExcelDataProvider {

    @DataProvider(name = "smsDataFromExcel")
    public Object[][] getData() throws Exception {
        FileInputStream fis = new FileInputStream(new File("src/test/resources/SMS_Test_Data.xlsx"));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rows - 1][2]; // Skip header

        for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            data[i - 1][0] = row.getCell(0).getStringCellValue(); // phone
            data[i - 1][1] = row.getCell(1).getStringCellValue(); // message
        }

        workbook.close();
        fis.close();
        return data;
    }
}

