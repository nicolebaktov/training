package Tests;

import Pages.RegisterPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
   public static  WebDriver driver = null;

    @Before
    public void setUp() {
        String path;

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        path = "http://newtours.demoaut.com/mercuryregister.php?osCsid=300994835431581d933f180c47baac96";
        driver.get(path);
    }

    @After
    public void terminateTest() {
        driver.quit();
    }
}
