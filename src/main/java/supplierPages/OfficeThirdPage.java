package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OfficeThirdPage extends CreateOfficeLocators {
    protected WebDriver driver;


    public OfficeThirdPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public void setWifiOn() {
        wifiLocator.click();
    }

    public void setParkingOn() {
        parkingLocator.click();
    }


    public void setParkingPrice(String parkingPrice) {
        priceParkingLocator.clear();
        priceParkingLocator.sendKeys(parkingPrice);
    }


    public void clickParkingDropDown() {
        parkingDropDownLocator.click();
        parkingDpdDwnOptionLocator.click();

    }


    public OfficeFourthPage goToHouseRulePage() {
        continueBtnLocator.click();

        return new OfficeFourthPage(driver);
    }
}
