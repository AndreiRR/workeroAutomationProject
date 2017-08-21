package dataDriven;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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
       XSSFSheet supplierCredentialsSheet =  workbook.getSheet("SupplierLoginCredentials");
       String emailAddress = supplierCredentialsSheet.getRow(1).getCell(0).getStringCellValue();

        return emailAddress;
    }

    public String getPassword() throws IOException {
        XSSFSheet supplierCredentialsSheet =  workbook.getSheet("SupplierLoginCredentials");
        String password = supplierCredentialsSheet.getRow(1).getCell(1).getStringCellValue();

        return password;
    }


    public String getOfficeContactInfoElements() throws IOException {
        XSSFSheet officeContactInfoSheet = workbook.getSheet("OfficeContactInfo");

        Iterator<Row> rowIterator = officeContactInfoSheet.iterator();
        officeContactInfoSheet.iterator();
        rowIterator.next();

        ArrayList<String> officeFirstStepElementsList = new ArrayList<>();


        while (rowIterator.hasNext())
        {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();
                switch (cell.getCellType())
                {
                    case Cell.CELL_TYPE_STRING:
                        officeFirstStepElementsList.add( cell.getStringCellValue());
                        break;
                }
            }
        }
        System.out.print(officeFirstStepElementsList);
        workbook.close();
        return officeFirstStepElementsList.toString();
    }
}
