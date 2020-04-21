package NegativeTests;
import Pages.BasePage;
import Pages.RegisterPage;
import Tests.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class NegativeRegisterTest extends BaseTest {
    
    @Before
    public void navigate() {
        BasePage base = new BasePage(DRIVER);
        base.navigateToRegistrationPage();
    }

    @Test
    public void negativeRegisterTest() {
        RegisterPage register = new RegisterPage(DRIVER);
        register.fillTheFormExitFillAgainAndSubmit();
    }

}
