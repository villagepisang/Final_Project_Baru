package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// WebPage for Login and common elements
public class WebPage {
    By input_username = By.id("user-name");
    By input_pass = By.id("password");
    By button_login = By.id("login-button");
    By text_error_msg (String msg){
        return By.xpath("//*[contains(text(), '"+ msg +"')]");
    }

    public void isOnLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }
    public void inputUserName(String username){
        driver.findElement(input_username).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(input_pass).sendKeys(password);
    }
    public void clickButtonlogin(){
        driver.findElement(button_login).click();
    }
    public void assertErrorMessage(String errormsg){
        driver.findElement(text_error_msg(errormsg)).isDisplayed();
    }
}
