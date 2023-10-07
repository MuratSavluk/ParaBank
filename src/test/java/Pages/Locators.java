package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Parent {
    public Locators() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(linkText = "An internal error has occurred and has been logged.")
    public WebElement error;
    @FindBy(css = "input[name='username']")
    public WebElement logUserName;
    @FindBy(css = "input[name='password']")
    public WebElement logUserPass;
    @FindBy(css = "input[value='Log In']")
    public WebElement logBtn;
    @FindBy(linkText = "Log Out")
    public WebElement succesly;


    public WebElement getWebElement(String strElemet) {
        switch (strElemet) {
            case "logUserName":return this.logUserName;
            case "logUserPass":return  this.logUserPass;
            case "logBtn":return  this.logBtn;
            case "succesly":return this.succesly;
        }
        return null;
    }
}
