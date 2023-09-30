package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage extends BasePage {

    public CompletePage(WebDriver driver) {
        super(driver);
    }


    By thanksMessage = By.className("complete-header");

    public String messageCheck(){
         return driver.findElement(thanksMessage).getText();
    }
}
