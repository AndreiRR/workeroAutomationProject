package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OfficeSecondPage extends CreateOfficeLocators {
    private WebDriver driver;


    public OfficeSecondPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public OfficeThirdPage setCalendarManagement() {
        mondayLocator.click();
        fridayLocator.click();
        this.openHoursDd();
        continueLocator.click();
        return new OfficeThirdPage(driver);
    }

    public void openHoursDd() {
        Select startProgram = new Select(startProgramLocator);
        startProgram.selectByIndex(2);

        Select endProgram = new Select(endProgramLocator);
        endProgram.selectByIndex(3);
    }
}
