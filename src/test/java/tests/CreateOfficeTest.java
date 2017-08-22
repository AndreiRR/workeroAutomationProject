package tests;


import driver.setup.BaseDriver;
import org.junit.Test;
import randomStrings.RandomStrings;
import supplierPages.*;
import java.io.IOException;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CreateOfficeTest extends BaseDriver implements RandomStrings {


    @Test
    public void setNewOffice() throws IOException {
//        ExcelLibrary excel = new ExcelLibrary();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmail(emailAddress);
        loginPage.setPassword(password);
        WorkeroHomepage homePage = loginPage.loginAsSupplier();
        assertThat(driver.getTitle(),is("WORKERO - Home supplier"));



        OfficeFirstPage contactInfoPage = homePage.pressAddOfficeBtns();
        assertThat(driver.getTitle(),is("WORKERO - Contact information"));
        contactInfoPage.setOfficeName(officeName);
        contactInfoPage.setOfficeVat(vatNumber);
        contactInfoPage.setDescription(description);
        contactInfoPage.setStreetAddress(streetAddress);
        contactInfoPage.setCity(city);
        contactInfoPage.setState(state);
        contactInfoPage.setPostalCode(postalCode);
        contactInfoPage.setCountry(country);
        contactInfoPage.setOfficeEmail(officeEmail);
        contactInfoPage.setContactPerson(contactPerson);
        contactInfoPage.setEmailContactPerson(emailContactPerson);
        contactInfoPage.setPhoneNumber(phoneNumber);
        contactInfoPage.setDirections(officeDirections);


        OfficeSecondPage calendarPage = contactInfoPage.setContactInfo();
        assertThat(driver.getTitle(),is("WORKERO - Create office calendar"));


        OfficeThirdPage amenitiesPage = calendarPage.setCalendarManagement();
        amenitiesPage.setWifiOn();
        amenitiesPage.setParkingOn();
        amenitiesPage.clickParkingDropDown();
        amenitiesPage.setParkingPrice(parkingPrice);


        OfficeFourthPage houseRulePage = amenitiesPage.goToHouseRulePage();
        OfficeDesksFifthPage fifthPage = houseRulePage.houseRule(houseRuleName);
        fifthPage.setNumberOfDesk(numberOfDesks);
        fifthPage.setDeskFloor(deskFloor);
        fifthPage.setPricePerHourLessThan14Days(priceLessThan14Days);
        fifthPage.setPricePerHourGreaterThan14Days(priceMoreThan14Days);
        fifthPage.setPricePerDay(pricePerDay);
        fifthPage.setPricePerWeek(pricePerWeek);
        fifthPage.setPricePerMonth(pricePerMonth);
        fifthPage.clickSaveDeskBtn();

        OfficePrivateFifthPage addPrivateOffice = new OfficePrivateFifthPage(driver);
        addPrivateOffice.setPrivateOfficeBtn();
        addPrivateOffice.setPrivateOfficeName(privateOfficeName);
        addPrivateOffice.setPrivateOfficeSQM(privateOfficeSqm);
        addPrivateOffice.setPrivateOfficeSeats(privateOfficeSeats);
        addPrivateOffice.setPrivateOfficeFloor(privateOfficeFloor);
        addPrivateOffice.setPrivateOfficeLocationInBuilding(privateOfficeLocationInBuilding);
        addPrivateOffice.setPrivateOfficePricePerDay(privateOfficePricePerDay);
        addPrivateOffice.setPrivateOfficePricePerWeek(privateOfficePricePerWeek);
        addPrivateOffice.setPrivateOfficePricePerMonth(privateOfficePricePerMonth);
    }
}
