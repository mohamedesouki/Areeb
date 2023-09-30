package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }



    By checkoutBtn = By.id("checkout");

    public void checkoutClick(){
        driver.findElement(checkoutBtn).click();
    }

}
