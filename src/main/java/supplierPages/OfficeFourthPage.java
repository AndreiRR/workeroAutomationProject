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



    public OfficeDesksFifthPage houseRule(String houseRuleName) {
        addAnotherHouseRuleLocator.click();
        houseRuleNameLocator.sendKeys(houseRuleName);
        houseRuleSaveBtn.click();
        continueBtn.click();

        return new OfficeDesksFifthPage(driver);
    }
}
