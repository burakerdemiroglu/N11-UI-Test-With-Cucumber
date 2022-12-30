package N11.stepdef;

import N11.Pages.Homepage;
import N11.Pages.Listpage;
import N11.Pages.Loginpage;
import N11.utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    Homepage _homepage;
    Helper _helper;
    Loginpage _loginpage;
    Listpage _listpage;

    public MyStepdefs() {
        _homepage = new Homepage();
        _helper = new Helper();
        _loginpage = new Loginpage();
        _listpage = new Listpage();
    }

    @Given("The user goes to the {string}")
    public void theUserGoesToThe(String url) {

        _helper.navigateToUrl(url);
    }

    @And("I check that the home page is opened")
    public void iCheckThatTheHomePageIsOpened() {

        _homepage.checkHomePage();
    }

    @And("I choose Accept Cookies from the cookie preferences")
    public void iChooseAcceptCookiesFromTheCookiePreferences() {

        // _homepage.clickCookieBtn();
    }

    @And("I login with {string} and {string}")
    public void iLoginWithAnd(String email, String password) {
        _homepage.clickSingInBtn();
        _loginpage.clickEmail(email);
        _loginpage.clickPasswordBox();
        _loginpage.clickPassword(password);
        _loginpage.clickLoginButton();
    }

    @And("I check that successfully login")
    public void iCheckThatSuccessfullyLogin() {
        _homepage.controlHoverPanel();
        _homepage.checkLogOutBtn();
    }

    @And("The user navigates to the {string} category and clicks on the {string} subcategory.")
    public void theUserNavigatesToTheCategoryAndClicksOnTheSubcategory(String Listname, String Product) {
        _homepage.hoverNavBar();
        _homepage.clickProductBox();
    }


    @And("The user selects the Price Ascending sort option and refreshes the page.")
    public void theUserSelectsThePriceAscendingSortOptionAndRefreshesThePage() {
        _listpage.clickPriceList();

        _listpage.clickChooseHighPrice();
    }

    @And("The user selects the {string} from the list and goes to the product page.")
    public void theUserSelectsTheFromTheListAndGoesToTheProductPage(String firstproduct) {
        _listpage.firstProduct(firstproduct);
    }

    @And("User clicks add to cart button and goes to cart page.")
    public void userClicksAddToCartButtonAndGoesToCartPage() throws InterruptedException {
      _listpage.addProductTextBtn();
      _listpage.clickBtnScrool();
      _listpage.clickMyBasketBtn();
    }

    @And("The user changes the quantity of the product to {int} on the cart page.")
    public void theUserChangesTheQuantityOfTheProductToOnTheCartPage(int arg0) {
        _listpage.clickTwoProductBtn();
    }

    @And("The user clicks the {string} button and goes to the payment page.")
    public void theUserClicksTheButtonAndGoesToThePaymentPage(String arg0) {
        _listpage.clickContiniueShoppingBtn();
    }


    @Then("The user checks for the existence of the make payment button.")
    public void theUserChecksForTheExistenceOfTheMakePaymentButton() {
        _listpage.checkFinishShopping();
    }
}
