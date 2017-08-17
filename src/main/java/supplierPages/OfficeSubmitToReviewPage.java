package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OfficeSubmitToReviewPage extends CreateOfficeLocators  {
    private WebDriver driver;

    public OfficeSubmitToReviewPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
}
