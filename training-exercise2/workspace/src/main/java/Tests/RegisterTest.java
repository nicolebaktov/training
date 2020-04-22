package Tests;
import Pages.*;
import static Tests.BaseTest.DRIVER;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest {
    @Before
    public void navigateToRegistrationPage() {
        BasePage base = new BasePage();
        base.clickOnRegisterTopButton();
    }

    @Test
    public void registerTest() {
        RegisterPage register = new RegisterPage(DRIVER);
        register.fillTheRegisterationPage();
        register.clickOnRegisterButton();
    }
}
