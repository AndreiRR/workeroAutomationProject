package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOfficeLocators  {

    //FirstStep Locators
    @FindBy(id = "name")
    protected WebElement officeNameLocator;

    @FindBy(id = "vat_number")
    protected WebElement vatNumberLocator;

    @FindBy(className = "btnOpacity")
    protected WebElement continueButtonLocator;

    @FindBy(id = "description")
    protected WebElement descriptionLocator;

    @FindBy(id = "street")
    protected WebElement streetLocator;

    @FindBy(id = "city")
    protected WebElement cityLocator;

    @FindBy(id = "state")
    protected WebElement stateLocator;

    @FindBy(id = "postal_code")
    protected WebElement postalCodeLocator;

    @FindBy(id = "country")
    protected WebElement countryLocator;

    @FindBy(id = "office_email")
    protected WebElement officeEmailLocator;

    @FindBy(id = "contact_person")
    protected WebElement contactPersonLocator;

    @FindBy(id = "email_address")
    protected WebElement emailAddresslocator;

    @FindBy(id = "phone")
    protected WebElement phoneNumberLocator;

    @FindBy(id = "directions")
    protected WebElement directionsLocator;


    //SecondStep Locators
    @FindBy(xpath = "//label[@for='weekday-Mon'][text()='MO']")
    protected WebElement mondayLocator;

    @FindBy(xpath = "//label[@for='weekday-Fri'][text()='FR']")
    protected WebElement fridayLocator;

    @FindBy(name = "start-program-start")
    protected WebElement startProgramLocator;

    @FindBy(name = "start-program-end")
    protected WebElement endProgramLocator;

    @FindBy(css = "div[class='stepNavigation'] >[class='buttonHeader active']")//div[class='stepNavigation'] >[class='buttonHeader active']
    protected WebElement continueLocator;


    //ThirdStep Locators
    @FindBy(xpath = "//label[@for='amenity[1]'][text()='Wi-Fi Access']")
    protected WebElement wifiLocator;

    @FindBy(xpath = "//label[@for='service[1]'][text()='Parking']")
    protected WebElement parkingLocator;

    @FindBy(xpath = "//button[@class='form-control input-to-disable button-sly-select'][text()='Type']")
    protected WebElement parkingDropDownLocator;

    @FindBy(xpath = "//li[@value='2'][text()='Per hour']")
    protected WebElement parkingDpdDwnOptionLocator;

    @FindBy(id = "price.1")
    protected WebElement priceParkingLocator;

    @FindBy(css = ".buttonHeader.active")
    protected WebElement continueBtnLocator;


    //FourthStep Locators
    @FindBy(id = "add-custom-houserule")
    protected WebElement addAnotherHouseRuleLocator;

    @FindBy(id = "new-houserule-name")
    protected WebElement houseRuleNameLocator;

    @FindBy(id = "custom-rule-save")
    protected WebElement saveBtn;

    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div/div[1]/div[1]/div/div[2]/div/a[2]")
    protected WebElement continueBtn;


    //FifthStep Locators
    @FindBy(xpath = "//option[@value='desk']")
    protected WebElement productDDLocator;

    @FindBy(id = "desk.1.number_of_desks")
    protected WebElement numberOfProductLocator;

    @FindBy(id = "desk.1.floor")
    protected WebElement floorLocator;

    @FindBy(id = "desk.1.price_hour_lt_14_days")
    protected WebElement pricePerHourLessThanLocator;

    @FindBy(id = "desk.1.price_hour_gt_14_days")
    protected WebElement pricePerHourGreaterThanLocator;

    @FindBy(id = "desk.1.price_day")
    protected WebElement pricePerDayLocator;

    @FindBy(id = "desk.1.price_week")
    protected WebElement pricePerWeekLocator;

    @FindBy(id = "desk.1.price_month")
    protected WebElement pricePerMonthLocator;

    @FindBy(css = "#new-products-holder button#custom-rule-save")
    protected WebElement saveProductLocator;

    @FindBy(xpath = "//div[contains(@class,'stepNavigation')]//a[contains(text(),'Submit for review')]")
    protected WebElement submitToReview;
}
