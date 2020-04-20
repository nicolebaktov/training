package NegativeTests;
import Pages.RegisterPage;
import Tests.BaseTest;
import org.junit.Test;

public class NegativeRegisterTest extends BaseTest {

    @Test
    public void negativeRegisterTest() {
        RegisterPage register = new RegisterPage(DRIVER);
        register.fillTheFormExitFillAgainAndSubmit();
    }

}
