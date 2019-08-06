package logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    static WebDriver driver;
    static int defaultWaitTime = 10;
    static WebDriverWait wait;

    public static WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, defaultWaitTime);
        return driver;
    }

    public void openUrl(String URL){
        driver.manage().window().maximize();
        driver.get(URL);
    }

    public void closeBrowser(){
        driver.quit();
    }
}
