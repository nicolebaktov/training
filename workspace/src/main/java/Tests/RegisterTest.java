package Tests;
import Pages.*;
import static Tests.BaseTest.driver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest {

    @Test
    public void registerTest() {
        RegisterPage register = new RegisterPage(driver);
        register.fillTheRegisterationPage();
        register.clickOnRegisterButton();
        Assert.assertTrue("The registration was successful" ,
                driver.findElement(By.xpath("//p/font [contains(text(),'Thank you for registering.')]")).isDisplayed());
    }
}
