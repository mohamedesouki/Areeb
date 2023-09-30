package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    By first_Name = By.id("first-name");

    By last_Name = By.id("last-name");

    By postal_Code = By.id("postal-code");
    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");



    public void fillData (String firstName,String lastName,String postalCode){
        driver.findElement(first_Name).sendKeys(firstName);
        driver.findElement(last_Name).sendKeys(lastName);
        driver.findElement(postal_Code).sendKeys(postalCode);
    }
    public void continueClick(){
        driver.findElement(continueBtn).click();
    }

    public void finishClick(){
        driver.findElement(finishBtn).click();
    }
}
