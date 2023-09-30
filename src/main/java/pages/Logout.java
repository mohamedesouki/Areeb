package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends BasePage{

    public Logout(WebDriver driver) {
        super(driver);
    }

    By menu = By.id("react-burger-menu-btn");
    By logoutBtn = By.id("logout_sidebar_link");

    public void logout(){
        driver.findElement(menu).click();
        driver.findElement(logoutBtn).click();
    }
}
