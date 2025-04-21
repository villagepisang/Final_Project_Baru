package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;

public class CartStep {
    CartPage cartPage;
    public CartStep(){
        this.cartPage = new CartPage();
    }
    @Then("user will directed to the your cart page")
    public void userWillDirectedToTheYourCartPage() {
        cartPage.yourCartPage();
    }
    @And("user will be directed to the your cart page")
    public void userWillBeDirectedToTheYourCartPage() {
        cartPage.yourCartPage();
    }
    @And("user click btn checkout")
    public void userClickBtnCheckout() {
        cartPage.btnCheckout();
    }
    @Then("user will be directed to your information page")
    public void userWillBeDirectedToYourInformationPage() {
        cartPage.yourInfoPage();
    }
    @When("user input first name {string}")
    public void userInputFirstName(String firstname) {
        cartPage.inputFirstName(firstname);
    }
    @And("user input last name {string}")
    public void userInputLastName(String lastname) {
        cartPage.inputLastName(lastname);
    }
    @And("user input postal code {string}")
    public void userInputPostalCode(String postalcode) {
        cartPage.inputPostalCode(postalcode);
    }
    @And("user click btn continue")
    public void userClickBtnContinue() {
        cartPage.clickContinue();
    }
    @And("user click btn finish")
    public void userClickBtnFinish() {
        cartPage.clickFinish();
    }
    @Then("user will be directed to the last page and sees the word {string}")
    public void userWillBeDirectedToTheLastPageAndSeesTheWord(String header) {
        cartPage.lastPage(header);
    }
    @When("user click btn cancel")
    public void userClickBtnCancel() {
        cartPage.clickCancel();
    }
    @And("user click btn continue shopping")
    public void userClickBtnContinueShopping() {
        cartPage.clickContinueShopp();
    }
}
