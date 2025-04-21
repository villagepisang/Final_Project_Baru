package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helper.Utility.driver;
import static org.junit.Assert.assertTrue;

public class CartPage {
    By your_cart = By.xpath("//*[text()='Your Cart']");
    By btn_checkout = By.id("checkout");
    By assert_your_info_page = By.xpath("//*[text()='Checkout: Your Information']");
    By first_name = By.id("first-name");
    By last_name = By.id("last-name");
    By postal_code = By.id("postal-code");
    By btn_continue = By.id("continue");
    By btn_finish = By.id("finish");
    By last_page = By.xpath("//h2[@class='complete-header']");
    By btn_cancel = By.id("cancel");
    By btn_continue_shopping = By.id("continue-shopping");

    public void yourCartPage(){
        driver.findElement(your_cart);
        WebElement yourCart = driver.findElement(your_cart);
        assertTrue(yourCart.isDisplayed());
    }
    public void btnCheckout(){
        driver.findElement(btn_checkout).click();
    }
    public void yourInfoPage(){
        driver.findElement(assert_your_info_page);
        WebElement yourInfo = driver.findElement(assert_your_info_page);
        assertTrue(yourInfo.isDisplayed());
    }
    public void inputFirstName(String firstname){
        driver.findElement(first_name).sendKeys(firstname);
    }
    public void inputLastName(String lastname){
        driver.findElement(last_name).sendKeys(lastname);
    }
    public void inputPostalCode(String postalcode){
        driver.findElement(postal_code).sendKeys(postalcode);
    }
    public void clickContinue(){
        driver.findElement(btn_continue).click();
    }
    public void clickFinish(){
        driver.findElement(btn_finish).click();
    }
    public void lastPage(String header){
        String headerWord = driver.findElement(last_page).getText();
        Assertions.assertThat(header).isEqualTo(headerWord);
    }
    public void clickCancel(){
        driver.findElement(btn_cancel).click();
    }
    public void clickContinueShopp(){
        driver.findElement(btn_continue_shopping).click();
    }
}
