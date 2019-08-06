package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement btnLogin;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void clickLogin(){
        clickOnElement(btnLogin);
    }
}
