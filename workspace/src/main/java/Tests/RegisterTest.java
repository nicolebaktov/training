package Tests;
import Pages.*;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Before
    public void navigate() {
        BasePage base = new BasePage(DRIVER);
        base.navigateToRegistrationPage();
    }

    @Test
    public void registerTest() {
        RegisterPage register = new RegisterPage(DRIVER);
        register.fillTheRegisterationPage();
        register.clickOnRegisterButton();
    }
}
