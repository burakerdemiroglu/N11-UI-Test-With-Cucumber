package N11.Pages;

import N11.utils.Driver;
import N11.utils.Helper;
import org.junit.Assert;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Listpage extends Helper {
    public Listpage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".iconSortBy")
    public WebElement priceList;
    @FindBy(xpath = "//div[contains(text(),' Artan fiyat')]")
    public WebElement highPriceBtn;
    @FindBy(xpath = "//button[@title='Sepete Ekle']")
    public WebElement addproductbtn;
    @FindBy(id = "shareWinTooltipClose")
    public WebElement closeCouponBtn;
    @FindBy(id = "btnScrollTop")
    public WebElement btnScrool;
    @FindBy(css = ".iconsBasketWhite")
    public WebElement myBasketBtn;
    @FindBy(css = ".spinnerUp.spinnerArrow")
    public WebElement twoProductBtn;
    @FindBy(id = "js-goToPaymentBtn")
    public WebElement continueShopping;
    @FindBy(xpath = "//span[contains(text(),'Ödeme Yap')]")
    public WebElement finsngShopping;

    public void clickPriceList() {
        clickElement(priceList);
    }

    public void clickChooseHighPrice() {
        clickElement(highPriceBtn);
    }

    public void firstProduct(String firstProduct) {
        By locator = By.xpath("//li[not(@data-adimpression-event-name)]//div[@data-position=" + firstProduct + "]");
        clickElement(locator);
    }

    public void addProductTextBtn() throws InterruptedException {
        Thread.sleep(3000);
        switchLastTab();
        clickElement(closeCouponBtn);
        clickElement(addproductbtn);
    }

    public void clickBtnScrool() {
        clickElement(btnScrool);
    }

    public void clickMyBasketBtn() {
        clickElement(myBasketBtn);
    }

    public void clickTwoProductBtn() {
        clickElement(twoProductBtn);
    }

    public void clickContiniueShoppingBtn() {
        clickElement(continueShopping);
    }

    public void checkFinishShopping() {
        Assert.assertTrue(finsngShopping.isDisplayed());
    }
}
