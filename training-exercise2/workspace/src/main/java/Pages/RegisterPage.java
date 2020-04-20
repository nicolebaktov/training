package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Tests.BaseTest.WAIT;

public class RegisterPage extends BasePage {

    @FindBy (name = "firstName")
    protected WebElement firstName;

    @FindBy (name = "lastName")
    protected WebElement lastName;

    @FindBy (name = "phone")
    protected WebElement phoneNumber;

    @FindBy (name = "userName")
    protected WebElement email;

    @FindBy (name = "address1")
    protected WebElement address;

    @FindBy (name = "city")
    protected WebElement city;

    @FindBy (name = "state")
    protected WebElement state;

    @FindBy (name = "postalCode")
    protected WebElement postalCode;

    @FindBy (name = "email")
    protected WebElement userName;

    @FindBy (name = "password")
    protected WebElement password;

    @FindBy (name = "confirmPassword")
    protected WebElement confirmPassword;

    @FindBy (name = "register")
    protected WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void typeFirstName(String firstname) {
        this.firstName.sendKeys(firstname);
    }
    public void typeLastName(String lastname) {
        this.lastName.sendKeys(lastname);
    }
    public void typePhoneNumber(String phone) {
        this.phoneNumber.sendKeys(phone);
    }
    public void typeEmail(String email) {
        this.email.sendKeys(email);
    }
    public void typeAddress(String address) {
        this.address.sendKeys(address);
    }
    public void typeCity(String city) {
        this.city.sendKeys(city);
    }
    public void typePostalCode(String postalCode) {
        this.postalCode.sendKeys(postalCode);
    }
    public void typeUsername(String username) {
        this.userName.sendKeys(username);
    }
    public void typePassword(String password) {
        this.password.sendKeys(password);
    }
    public void confirmPassword() {this.confirmPassword.sendKeys(this.password.getText());}
    public void clickOnRegisterButton() {
        WAIT.until(ExpectedConditions.elementToBeClickable(this.registerButton)).click();
    }

    public void fillTheRegisterationPage() {
        this.typeFirstName("Dekel");
        this.typeLastName("Vaknin");
        this.typePhoneNumber("0542222222");
        this.typeEmail("dekelhameleh@gmail.com");
        this.typeAddress("yom gashom kvar sof ona");
        this.typeCity("Ramat Gan");
        this.typePostalCode("88888");
        this.typeUsername("dekelhameleh");
        this.typePassword("dekel192837");
        this.confirmPassword();
    }

    public void fillTheFormExitFillAgainAndSubmit() {
        this.fillTheRegisterationPage();
        this.clickOnSupportTopButton();
        this.clickOnRegisterTopButton();
        this.fillTheRegisterationPage();
        this.clickOnRegisterButton();
        this.assertTrueIfMessegeDisplayed(THE_REGISTRATION_WAS_SUCCESSFUL_MESSEGE);
    }
}
