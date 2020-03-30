package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    @FindBy (name = "q")
    protected WebElement googleInputBox;

    @FindBy (css = ".aajZCb .gNO89b")
    protected WebElement searchButton;

    public  GoogleHomePage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void typeInGoogleInputBox(String keys) {
        this.googleInputBox.sendKeys(keys);
    }

    public void clickOnSearchButton() {
        this.searchButton.click();
    }
}
