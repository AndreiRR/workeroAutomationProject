package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OfficeFourthPage extends CreateOfficeLocators {
    private WebDriver driver;

    public OfficeFourthPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



    public OfficeFifthPage houseRule(String houseRuleName) {
        addAnotherHouseRuleLocator.click();
        houseRuleNameLocator.sendKeys(houseRuleName);
        saveBtn.click();
        continueBtn.click();

        return new OfficeFifthPage(driver);
    }
}
