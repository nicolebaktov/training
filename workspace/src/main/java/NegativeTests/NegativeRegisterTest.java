package NegativeTests;
import Pages.RegisterPage;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class NegativeRegisterTest extends BaseTest {
    @Test
    public void negativeRegisterTest() {
        RegisterPage register = new RegisterPage(driver);
        register.fillTheRegisterationPage();
        register.clickOnSupportTopButton();
        register.clickOnRegisterTopButton();
        register.fillTheRegisterationPage();
        register.clickOnRegisterButton();
        Assert.assertTrue("The registration was successful" ,
                driver.findElement(By.xpath("//p/font [contains(text(),'Thank you for registering.')]")).isDisplayed());
    }

}
