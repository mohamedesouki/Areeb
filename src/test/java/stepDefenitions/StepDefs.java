package stepDefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;

import static stepDefenitions.Hooks.driver;

public class StepDefs {


    LoginPage login = new LoginPage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);

    CheckoutPage checkoutPage = new CheckoutPage(driver);

    CompletePage completePage = new CompletePage(driver);
    Logout logout = new Logout(driver);



    @Given("user open login page")
    public void userOpenLoginPage() {

    }


    @When("user enter username {string} and password {string} and click login button")
    public void userEnterUsername(String username,String password) {
        login.enterData(username,password);
        login.clickButton();
    }


    @And("user add item to cart")
    public void userAddItemToCart() {
        productPage.addToCart();
        
    }

    @And("user navigate to cart page")
    public void userNavigateToCheckoutPage() {
        productPage.navigateToCart();
    }



    @And("user checkout his cart by filling his data firstName {string} and lastName {string} and postal code {string}")
    public void userCheckoutCartAndFillData(String firstName, String lastName, String postalCode) {
        cartPage.checkoutClick();
        checkoutPage.fillData(firstName,lastName,postalCode);
        checkoutPage.continueClick();
        checkoutPage.finishClick();
    }

    @Then("Thanks message appears")
    public void thanksMessageAppears() {
        Assert.assertEquals(completePage.messageCheck(),"Thank you for your order!");


    }

    @And("user logout")
    public void userLogout() {
        logout.logout();
    }
}
