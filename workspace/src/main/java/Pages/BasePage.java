package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
    @FindBy(xpath = "//a [contains(text(),'SUPPORT')]")
    protected WebElement supportTopButton;

    @FindBy (xpath = "//a [contains(text(),'REGISTER')]")
    protected WebElement registerTopButton;

    public void clickOnSupportTopButton() {this.supportTopButton.click(); }
    public void clickOnRegisterTopButton() {this.registerTopButton.click(); }
}
