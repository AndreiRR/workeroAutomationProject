package driver.setup;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import selenium.support.BrowserFactory;

import java.util.concurrent.TimeUnit;

public class BaseDriver extends BrowserFactory  {
    protected WebDriver driver;
    protected String baseUrl = "http://workero.expn-demo.eu/supplier/login";


    @Before
    public void setUp() {
        driver = BrowserFactory.getBrowser("Chrome");
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}
