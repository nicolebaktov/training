package Tests;
import Pages.GoogleHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GoogleSearchTest {

    WebDriver driver = null;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.co.il/?hl=iw");
    }

    @Test
    public void googleSearchTest() {
        GoogleHomePage home = new GoogleHomePage(driver);
        home.typeInGoogleInputBox("Automation step by step");
        home.clickOnSearchButton();
    }

    @AfterTest
    public void terminateTest() {
        driver.quit();
    }
}
