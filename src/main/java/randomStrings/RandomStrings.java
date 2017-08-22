package randomStrings;

import org.apache.commons.lang3.RandomStringUtils;

public interface RandomStrings  {


    //Supplier Login
    String emailAddress = "andrei.raschitor@expertnetwork.ro";
    String password = "secret";

    //Random Data Office Contact Info
    String officeName = "Office " + RandomStringUtils.randomAlphabetic(6);
    String vatNumber = "VatNo " + RandomStringUtils.randomAlphabetic(6);
    String description = "Description " + RandomStringUtils.randomAlphabetic(10);
    String streetAddress = "Address " + RandomStringUtils.randomAlphabetic(6);
    String city = "City" + RandomStringUtils.randomAlphabetic(8);
    String state = "State " + RandomStringUtils.randomAlphabetic(3);
    String postalCode = RandomStringUtils.randomNumeric(6);
    String country = RandomStringUtils.randomAlphabetic(6);
    String officeEmail = RandomStringUtils.randomAlphabetic(4) + "@gmail.com";
    String contactPerson = RandomStringUtils.randomAlphabetic(6);
    String emailContactPerson = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
    String phoneNumber = RandomStringUtils.randomNumeric(5);
    String officeDirections = RandomStringUtils.randomAlphabetic(100);



    //Random Data Amenities and Services
    String parkingPrice = RandomStringUtils.randomNumeric(3);


    //Random Data House Rules
    String houseRuleName = RandomStringUtils.randomAlphabetic(6);


    //Random Data Desks
    String numberOfDesks = RandomStringUtils.randomNumeric(3);
    String deskFloor = RandomStringUtils.randomNumeric(2);
    String priceLessThan14Days = RandomStringUtils.randomNumeric(3);
    String priceMoreThan14Days = RandomStringUtils.randomNumeric(3);
    String pricePerDay = RandomStringUtils.randomNumeric(3);
    String pricePerWeek = RandomStringUtils.randomNumeric(3);
    String pricePerMonth = RandomStringUtils.randomNumeric(3);


    //Random Private Office Data
    String privateOfficeName = RandomStringUtils.randomAlphabetic(4);
    String privateOfficeSqm = RandomStringUtils.randomNumeric(2);
    String privateOfficeSeats = RandomStringUtils.randomNumeric(3);
    String privateOfficeFloor = RandomStringUtils.randomNumeric(2);
    String privateOfficeLocationInBuilding = RandomStringUtils.randomAlphabetic(5);
    String privateOfficePricePerDay = RandomStringUtils.randomNumeric(2);
    String privateOfficePricePerWeek = RandomStringUtils.randomNumeric(2);
    String privateOfficePricePerMonth = RandomStringUtils.randomNumeric(2);

}
