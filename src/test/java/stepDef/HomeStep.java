package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.WebPage;

public class HomeStep {
    HomePage homePage;
    public HomeStep(){
        this.homePage = new HomePage();
    }
    @Then("user is on home page")
    public void userIsOnHomePage() {
        homePage.isOnHomePage();
    }
    @And("user click button menu")
    public void userClickButtonMenu() {
        homePage.clickButtonMenu();
    }
    @Then("user click button logout")
    public void userClickButtonLogout() {
        homePage.clickButtonlogout();
    }
    @When("user click icon shopping cart")
    public void userClickIconShoppingCart() {
        homePage.clickIconShoppingCart();
    }
    @And("user will see icon to cart in home page")
    public void userWillSeeIconToCartInHomePage() {
        homePage.seeIconToCart();
    }
    @And("user add {string} item to cart")
    public void userAddItemToCart(String itemCount) {
        homePage.addItemsToCart(Integer.parseInt(itemCount));
    }
    @Then("user verify cart item is match {string}")
    public void userVerifyCartItemIsMatch(String cartItem) {
        homePage.assertCartItem(cartItem);
    }
    @When("user remove {string} item to cart")
    public void userRemoveItemToCart(String itemRemove) {
        homePage.removeItemsFromCart(Integer.parseInt(itemRemove));
    }
}
