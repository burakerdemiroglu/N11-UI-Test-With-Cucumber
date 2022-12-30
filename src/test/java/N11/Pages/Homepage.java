package N11.Pages;

import N11.utils.Driver;
import N11.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Helper {
    public Homepage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//span[@class=\"setCookieBtn pickAll\"])[2]")
    public WebElement cookieBtn;
    @FindBy(id = "header")
    public WebElement homePage;
    @FindBy(xpath = "//a[@class=\"btnSignIn\"]")
    public WebElement singInBtn;
    @FindBy(className = "user")
    public WebElement hoverPanel;
    @FindBy(className = "logoutBtn")
    public WebElement logOutBtn;
    @FindBy(xpath = "//a/span[contains(text(),'Elektronik')]")
    public WebElement navBar;
    @FindBy(xpath = "//a/span[contains(text(),'Telefon & Aksesuarları')]")
    public WebElement productTexBox;

    public void clickCookieBtn() {
        clickElement(cookieBtn);
    }

    public void checkHomePage() {
        Assert.assertTrue(homePage.isDisplayed());
    }

    public void clickSingInBtn() {
        clickElement(singInBtn);
    }

    public void controlHoverPanel() {
        hoverElement(hoverPanel);
    }

    public void checkLogOutBtn() {
        Assert.assertTrue(logOutBtn.isDisplayed());
    }

    public void hoverNavBar() {
        hoverElement(navBar);


    }

    public void clickProductBox() {
        clickElement(productTexBox);
    }

}
