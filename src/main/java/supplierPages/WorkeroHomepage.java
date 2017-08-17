package supplierPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkeroHomepage {
    protected WebDriver driver;

    @FindBy(xpath = "//a[@href='http://workero.expn-demo.eu/supplier/offices']")
    WebElement officeSetupLocator;

    @FindBy(css = ".bigPlus")
    WebElement addNewOfficeBtnLocator;


    public WorkeroHomepage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public OfficeFirstPage pressAddOfficeBtns() {
        officeSetupLocator.click();
        addNewOfficeBtnLocator.click();

        return new OfficeFirstPage(driver);
    }
}
