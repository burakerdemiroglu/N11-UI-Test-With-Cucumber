package N11.Pages;

import N11.utils.Driver;
import N11.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Helper {

    public  Loginpage (){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id="email")
    public WebElement eMailBox;
    @FindBy(id="password")
    public WebElement passwordBox;
    @FindBy(id="loginButton")
    public WebElement loginButton;

    public void clickEmail (String email){
        sendKeysElement(eMailBox,email);
    }
    public void clickPasswordBox(){
        clickElement(passwordBox);
    }
    public void clickPassword (String password){

        sendKeysElement(passwordBox,password);
    }

    public void clickLoginButton(){
        clickElement(loginButton);
    }


}
