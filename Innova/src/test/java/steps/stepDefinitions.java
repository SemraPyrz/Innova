package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.basketPageActions;
import pageActions.homePageActions;
import pageActions.productPageActions;
import pageActions.womenWatchPageActions;
import utility.hooks;

import java.net.MalformedURLException;

public class stepDefinitions extends hooks {

    @Before("@chrome")
    public void setUpChrome() throws MalformedURLException {
        hooks.set_up_browser(BrowserType.Chrome);
    }

    @After("@chrome")
    public void tearDown() {
        hooks.tear_Down();
    }

    @Given("I launch ([^\"]*)")
    public void launchUrl(String arg0) throws MalformedURLException {
        homePageActions.launchUrl(arg0);
    }

    @Given("I refresh the page")
    public void refreshPage() throws Throwable {
        homePageActions.refreshPage();
    }

    @When("I open fashionMenu and choose womenWatch")
    public void iOpenFashionMenuChooseWomenWath() {
        homePageActions.openFashionMenuChooseWomenWatch();
    }

    @When("I filter products by Guess")
    public void iFilterProductsByGuess() throws InterruptedException {

        womenWatchPageActions.filterProductsByGuess();
    }

    @And("I scroll down page to pagination and open second page")
    public void iScrollDownPageToPaginationOpenSecondPage() throws InterruptedException {
        womenWatchPageActions.scrollDownToPaginationOpenSecondPage();
    }

    @And("I get details of first product and open it")
    public void iGetDetailsOfFirstProductAndOpenIt() throws InterruptedException {
        womenWatchPageActions.getDetailsOfFirstProductAndOpen();
    }

    @And("I verify product details if it is my selected list item or not")
    public void iVerifyProductDetailsIfItIsMySelectedListItemOrNot() throws Throwable {
        productPageActions.verifyProductItem();
    }

    @Then("I add product to my basket")
    public void iAddProductToMyBasket() throws InterruptedException {
        productPageActions.addProductToBasket();
    }

    @And("I check my basket count and open it")
    public void iCheckMyBasketCountAndOpenIt() throws Throwable {
        productPageActions.checkBasketAndOpen();
    }

    @And("I verify my basket product details if it is my selected list item or not")
    public void iVerifyMyBasketProductDetailsIfItIsMySelectedListItemOrNot() throws Throwable {
        basketPageActions.verifyMyBasketItem();
    }


}
