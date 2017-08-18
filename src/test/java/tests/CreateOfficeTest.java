package tests;


import dataDriven.ExcelLibrary;
import driver.setup.BaseDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import supplierPages.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CreateOfficeTest extends BaseDriver  {


    @Test
    public void setNewOffice() throws IOException {
        ExcelLibrary excel = new ExcelLibrary();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmail(excel.getEmailAddress());
        loginPage.setPassword(excel.getPassword());
        WorkeroHomepage homePage = loginPage.loginAsSupplier();
        assertThat(driver.getTitle(),is("WORKERO - Home supplier"));



        OfficeFirstPage contactInfoPage = homePage.pressAddOfficeBtns();
        contactInfoPage.setOfficeName(excel.getOfficeNameValue());
        contactInfoPage.setOfficeVat(excel.getOffiCeVatNumberValue());

        OfficeSecondPage calendarPage = contactInfoPage.setContactInfo();
        OfficeThirdPage amenitiesPage = calendarPage.setCalendarManagement();
        amenitiesPage.setWifiOn();
        amenitiesPage.setParkingOn();
        amenitiesPage.clickParkingDropDown();
        amenitiesPage.setParkingPrice();
        amenitiesPage.goToHouseRulePage();




//        OfficeFifthPage fifthPage = houseRulesPage.houseRule(excel.getHouseRulesValue());
//        OfficeSubmitToReviewPage submit = fifthPage.setProductType("","");
    }
}
