package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OfficeEditModePage extends CreateOfficeLocators  {
    private WebDriver driver;

    public OfficeEditModePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
}
