package info.eidss.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(info.eidss.utilities.Driver.getDriver(), this);
        
    }

    @FindBy(id = "Username")
    public WebElement loginInputBox;


    @FindBy(id = "Password")
    public WebElement passwordInputBox;

    @FindBy ( xpath = "//button[text()='Login']")
    public WebElement loginButton;


    

}
