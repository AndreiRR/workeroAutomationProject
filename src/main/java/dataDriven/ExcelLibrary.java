package dataDriven;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.*;


public class ExcelLibrary  {


    @Test
    public void readExcel() throws IOException {
        File path = new File("D:\\workeroAutomation\\dataDrivenWorkero.xlsx");

        FileInputStream input = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(input);

        XSSFSheet sheet =  workbook.getSheetAt(0);
        String data =  sheet.getRow(2).getCell(0).getStringCellValue();
        System.out.println(data);
        workbook.close();

    }
}
