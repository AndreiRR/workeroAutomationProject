package tests;

import dataDriven.ExcelLibrary;
import driver.setup.BaseDriver;
import org.junit.Test;
import supplierPages.*;
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
        assertThat(driver.getTitle(),is("WORKERO - Contact information"));
        contactInfoPage.setOfficeName(excel.getOfficeNameValue());
        contactInfoPage.setOfficeVat(excel.getOffiCeVatNumberValue());

        OfficeSecondPage calendarPage = contactInfoPage.setContactInfo();
        assertThat(driver.getTitle(),is("WORKERO - Create office calendar"));
        OfficeThirdPage amenitiesPage = calendarPage.setCalendarManagement();

        amenitiesPage.setWifiOn();
        amenitiesPage.setParkingOn();
        amenitiesPage.clickParkingDropDown();
        amenitiesPage.setParkingPrice(excel.getParkingPriceValue());
        amenitiesPage.goToHouseRulePage();

        OfficeFourthPage houseRulePage = new OfficeFourthPage(driver);
        OfficeFifthPage fifthPage = houseRulePage.houseRule(excel.getHouseRulesValue());
        fifthPage.setDeskProduct(excel.getDeskValue());
       // OfficeEditModePage submitToReviewPage



      // OfficeFifthPage fifthPage = houseRulesPage.houseRule(excel.getHouseRulesValue());
        //OfficeEditModePage submit = fifthPage.setProductType("","");
    }
}
