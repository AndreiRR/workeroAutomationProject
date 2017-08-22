package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfficeFirstPage extends CreateOfficeLocators {
    protected WebDriver driver;
    protected WebElement continueBtn;



    public OfficeFirstPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public void setOfficeName(String officeNameValue) {
        officeNameLocator.sendKeys(officeNameValue);
    }

    public void setOfficeVat(String officeVatValue) {
        vatNumberLocator.sendKeys(officeVatValue);
    }

    public void setDescription(String descriptionValue) {
        descriptionLocator.sendKeys(descriptionValue);
    }

    public void setStreetAddress(String streetAddressValue) {
        streetLocator.sendKeys(streetAddressValue);
    }

    public void setCity(String cityValue) {
        cityLocator.sendKeys(cityValue);
    }

    public void setState(String stateValue) {
        stateLocator.sendKeys(stateValue);
    }

    public void setPostalCode(String postalCodeValue) {
        postalCodeLocator.sendKeys(postalCodeValue);
    }

    public void setCountry(String countryValue) {
        countryLocator.sendKeys(countryValue);
    }

    public void setOfficeEmail(String officeEmailValue) {
        officeEmailLocator.sendKeys(officeEmailValue);
    }

    public void setContactPerson(String contactPersonValue) {
        contactPersonLocator.sendKeys(contactPersonValue);
    }

    public void setEmailContactPerson(String emailContactPersonValue) {
        emailAddresslocator.sendKeys(emailContactPersonValue);
    }

    public void setPhoneNumber(String phoneNumberValue) {
        phoneNumberLocator.sendKeys(phoneNumberValue);
    }

    public void setDirections(String officeDirectionsValue) {
        officeDirectionsLocator.sendKeys(officeDirectionsValue);
    }


    public OfficeSecondPage setContactInfo() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        continueBtn = wait.until(ExpectedConditions
                .elementToBeClickable(By.className("btnOpacity")));
        continueButtonLocator.click();

        return new OfficeSecondPage(driver);
    }
}
