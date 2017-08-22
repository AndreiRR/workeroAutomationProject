package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OfficeDesksFifthPage extends CreateOfficeLocators  {
    private WebDriver driver;



    public OfficeDesksFifthPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void setNumberOfDesk(String numberOfDeskValue) {
        productDropDownLocator.click();
        numberOfProductLocator.sendKeys(numberOfDeskValue);
    }

    public void setDeskFloor(String deskFloorValue) {
        floorLocator.sendKeys(deskFloorValue);
    }

    public void setPricePerHourLessThan14Days(String pricePerHourLessThan14Days) {
        pricePerHourLessThanLocator.sendKeys(pricePerHourLessThan14Days);
    }

    public void setPricePerHourGreaterThan14Days(String pricePerHourGreaterThan14Days) {
        pricePerHourGreaterThanLocator.sendKeys(pricePerHourGreaterThan14Days);
    }

    public void setPricePerDay(String pricePerDay) {
        deskPricePerDayLocator.sendKeys(pricePerDay);
    }

    public void setPricePerWeek(String pricePerWeek) {
        deskPricePerWeekLocator.sendKeys(pricePerWeek);
    }


    public void setPricePerMonth(String pricePerMonth) {
        deskPricePerMonthLocator.sendKeys(pricePerMonth);
    }

    public void clickSaveDeskBtn() {
        saveProductLocator.click();
    }


    public OfficePrivateFifthPage addPrivateOffice() {
        submitToReview.click();
        driver.switchTo().alert().accept();

        return new OfficePrivateFifthPage(driver);
    }
}
