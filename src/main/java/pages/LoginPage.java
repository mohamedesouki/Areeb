package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By usernameElement = By.cssSelector("input[id=\"user-name\"]");
    By passwordElement = By.cssSelector("input[id=\"password\"]");
    By loginBtn = By.cssSelector("input[type=\"submit\"]");



    public void enterData(String userName,String password){

        driver.findElement(usernameElement).sendKeys(userName);
        driver.findElement(passwordElement).sendKeys(password);
    }

    public void clickButton(){
        driver.findElement(loginBtn).click();
    }

}
