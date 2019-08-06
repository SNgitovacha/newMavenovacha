package tests;

import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class LoginTest extends Browser {

    HomePage homePage;

    @BeforeClass
    public void beforeClass(){
        Browser.initializeDriver();
        Browser.openUrl("https://www.saucedemo.com");
        homePage = new HomePage(Browser.driver, Browser.wait);
    }

    @Test
    public void test01(){
        homePage.clickLogin();
    }

    @AfterClass
    public void afterClass(){
        Browser.closeBrowser();
    }
}
