import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePagePO {
    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void test01(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.get("http://the-internet.herokuapp.com/");
    }

}
