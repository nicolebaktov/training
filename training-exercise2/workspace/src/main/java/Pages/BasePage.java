package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static Tests.BaseTest.DRIVER;
import static Tests.BaseTest.WAIT;

public class BasePage {
    public static String THE_REGISTRATION_WAS_SUCCESSFUL_MESSEGE="Thank you for registering.";
    @FindBy(xpath = "//a [contains(text(),'SUPPORT')]")
    protected WebElement supportTopButton;

    @FindBy (xpath = "//a [contains(text(),'REGISTER')]")
    protected WebElement registerTopButton;

    public void clickOnSupportTopButton() {
        WAIT.until(ExpectedConditions.elementToBeClickable(this.supportTopButton)).click();
    }
    public void clickOnRegisterTopButton() {
        WAIT.until(ExpectedConditions.elementToBeClickable(this.registerTopButton)).click(); }
    public void assertTrueIfMessegeDisplayed(String messege) {
        Assert.assertTrue(DRIVER.findElement(By.xpath("//p/font [contains(text(),"+ messege +")]")).isDisplayed());
    }
}
