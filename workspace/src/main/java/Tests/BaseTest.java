package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest{
   public static WebDriverWait WAIT;
   public static  WebDriver DRIVER;
   public static  String PATH = "http://newtours.demoaut.com";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shavit3\\Desktop\\chromedriver.exe");
        DRIVER = new ChromeDriver();
        WAIT = new WebDriverWait(DRIVER, 10);
        DRIVER.get(PATH);
    }

    @After
    public void terminateTest() {
        DRIVER.quit();
    }
}
