package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebPage;

public class WebStep {

    WebPage webPage;
    public WebStep(){
        this.webPage = new WebPage();
    }

    @Given("user is on login page")
    public void userIsOnLoginPage(){
        webPage.isOnLoginPage();
    }

    @And("user input user name {string}")
    public void userInputUserName(String username) {
        webPage.inputUserName(username);
    }
    @And("user input password {string}")
    public void userInputPassword(String password) {
        webPage.inputPassword(password);
    }

    @And("user click button login")
    public void userClickButtonLogin() {
        webPage.clickButtonlogin();
    }

    @Then("user able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errmsg) {
        webPage.assertErrorMessage(errmsg);
    }
    @Then("user able to see login error message {string}")
    public void userAbleToSeeLoginErrorMessage(String lgnerrmsg) {
        webPage.assertErrorMessage(lgnerrmsg);
    }
}