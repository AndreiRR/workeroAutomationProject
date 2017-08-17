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
        LoginPage loginPage = new LoginPage(driver);
        WorkeroHomepage homePage = loginPage.loginAsSupplier("andrei.raschitor@expertnetwork.ro","secret");
        assertThat(driver.getTitle(),is("WORKERO - Home supplier"));


        ExcelLibrary excel = new ExcelLibrary();
        OfficeFirstPage contactInfoPage = homePage.pressAddOfficeBtns();

        contactInfoPage.setOfficeName();
        contactInfoPage.setOfficeVat("");

        OfficeSecondPage calendarPage = contactInfoPage.setContactInfo();
        OfficeThirdPage amenitiesPage = calendarPage.setCalendarManagement();
        OfficeFourthPage houseRulePage =  amenitiesPage.setAmenitiesAndServices("");
        OfficeFifthPage fifthPage = houseRulePage.houseRule("houseRule");
        OfficeSubmitToReviewPage submit = fifthPage.setProductType("","");

    }
}
