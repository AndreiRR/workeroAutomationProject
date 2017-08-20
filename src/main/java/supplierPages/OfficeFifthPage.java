package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OfficeFifthPage extends CreateOfficeLocators  {
    private WebDriver driver;



    public OfficeFifthPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void setDeskProduct(String numberOfDesk) {
        productDDLocator.click();
        numberOfProductLocator.sendKeys(numberOfDesk);
        //floorLocator.sendKeys(floor);
    }

    public OfficeEditModePage clickSubmitForReview() {
        saveProductLocator.click();
        submitToReview.click();
        driver.switchTo().alert().accept();

        return new OfficeEditModePage(driver);
    }
}
