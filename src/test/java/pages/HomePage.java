package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helper.Utility.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage {
    By button_menu = By.id("react-burger-menu-btn");
    By button_logout = By.id("logout_sidebar_link");
    By product_title = By.xpath("//*[@id=\"item_0_title_link\"]/div");
    By icon_shopping_cart = By.id("shopping_cart_container");
    By add_one_item = By.xpath("(//*[text()='Add to cart'])");
    By shooping_cart_badge = By.xpath("//span[(@class='shopping_cart_badge')]");
    By remove_item = By.xpath("(//*[text()='Remove'])");

    public void isOnHomePage(){
        driver.findElement(product_title);
        WebElement productElement = driver.findElement(product_title);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Bike Light", productElement.getText());
    }
    public void clickButtonMenu(){
        driver.findElement(button_menu).click();
    }
    public void clickButtonlogout(){
        driver.findElement(button_logout).click();
    }
    public void clickIconShoppingCart(){
        driver.findElement(icon_shopping_cart).click();
    }
    public void seeIconToCart(){
        driver.findElement(icon_shopping_cart);
        WebElement yourCart1 = driver.findElement(icon_shopping_cart);
        assertTrue(yourCart1.isDisplayed());
    }
    public void addItemsToCart(int itemCount) {
        for (int i = 0; i < itemCount; i++) {
            driver.findElement(add_one_item).click();
        }
    }
    public void assertCartItem(String cartItem){
        String itemActual = driver.findElement(shooping_cart_badge).getText();
        Assertions.assertThat(cartItem).isEqualTo(itemActual);
    }
    public void removeItemsFromCart(int itemRemove) {
        for (int i = 0; i < itemRemove; i++) {
            driver.findElement(remove_item).click();
        }
    }
}
