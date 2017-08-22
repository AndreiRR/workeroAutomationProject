package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OfficePrivateFifthPage extends CreateOfficeLocators {
    protected WebDriver driver;

    public OfficePrivateFifthPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public void setPrivateOfficeBtn() {
        addAnotherProductBtnLocator.click();
        Select select = new Select(privateDropDownLocator);
        select.selectByIndex(2);
    }

    public void setPrivateOfficeName(String privateOfficeNameValue) {
        privateOfficeNameLocator.sendKeys(privateOfficeNameValue);
    }

    public void setPrivateOfficeSQM(String sqmValue) {
        privateSquareMetersLocator.sendKeys(sqmValue);
    }

    public void setPrivateOfficeSeats(String seatsValue) {
        privateOfficeSeatsLocator.sendKeys(seatsValue);
    }

    public void setPrivateOfficeFloor(String privateFloorValue) {
        privateOfficeFloor.sendKeys(privateFloorValue);
    }

    public void setPrivateOfficeLocationInBuilding(String locationInBuildingValue) {
        directionsLocator.sendKeys(locationInBuildingValue);
    }

    public void setPrivateOfficePricePerDay(String privateOfficePricePerDayValue) {
        privatePricePerDayLocator.sendKeys(privateOfficePricePerDayValue);
    }

    public void setPrivateOfficePricePerWeek(String privateOfficePricePerWeekValue) {
        privatePricePerWeekLocator.sendKeys(privateOfficePricePerWeekValue);
    }

    public void setPrivateOfficePricePerMonth(String privateOfficePricePerMonthValue) {
        privatePricePerMonthLocator.sendKeys(privateOfficePricePerMonthValue);
    }


    public OfficeEditModePage clickSubmitForReview() {
        submitToReview.click();
        driver.switchTo().alert().accept();

        return new OfficeEditModePage(driver);
    }

}
