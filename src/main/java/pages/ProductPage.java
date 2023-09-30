package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }



    By AddToCartBtn = By.cssSelector("button[id=\"add-to-cart-sauce-labs-backpack\"]");
    By cartLink = By.className("shopping_cart_link");

    public void addToCart(){
        driver.findElement(AddToCartBtn).click();
    }

    public void navigateToCart(){
        driver.findElement(cartLink).click();
    }


}
