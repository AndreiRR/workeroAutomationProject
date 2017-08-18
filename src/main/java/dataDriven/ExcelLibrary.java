package dataDriven;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;


public class ExcelLibrary  {

    File path = new File("D:\\workeroAutomation\\dataDrivenWorkero.xlsx");

    FileInputStream input = new FileInputStream(path);
    XSSFWorkbook workbook = new XSSFWorkbook(input);

    public ExcelLibrary() throws IOException {
    }


    public XSSFSheet readExcel() throws IOException {
        XSSFSheet sheet =  workbook.getSheetAt(0);
        String data =  sheet.getRow(2).getCell(0).getStringCellValue();
        workbook.close();

        return sheet;
    }



    public String getEmailAddress() throws IOException {
        XSSFSheet supplierCredentialsSheet =  workbook.getSheetAt(1);
        String emailAddress = supplierCredentialsSheet.getRow(1).getCell(0).getStringCellValue();

        return emailAddress;
    }

    public String getPassword() throws IOException {
        XSSFSheet supplierCredentialsSheet =  workbook.getSheetAt(1);
        String password = supplierCredentialsSheet.getRow(1).getCell(1).getStringCellValue();

        return password;
    }



    public String getOfficeNameValue() throws IOException {
        XSSFSheet contactInfoSheet = readExcel();
        String officeNameValue = contactInfoSheet.getRow(2).getCell(0).getStringCellValue();

        return officeNameValue;
    }

    public String getOffiCeVatNumberValue() throws IOException {
        XSSFSheet contactInfoSheet = readExcel();
        String vatNumberValue = contactInfoSheet.getRow(1).getCell(1).getStringCellValue();

        return vatNumberValue;
    }

    public String getParkingPriceValue() {
        XSSFSheet amenitiesSheet = workbook.getSheetAt(3);
        String parkingPriceValue = amenitiesSheet.getRow(0).getCell(1).getStringCellValue();

        return parkingPriceValue;
    }

    public String getHouseRulesValue() throws IOException {
        XSSFSheet houseruleSheet =  workbook.getSheetAt(3);
        String houseRulesValue = houseruleSheet.getRow(1).getCell(0).getStringCellValue();

        return houseRulesValue;
    }
}
