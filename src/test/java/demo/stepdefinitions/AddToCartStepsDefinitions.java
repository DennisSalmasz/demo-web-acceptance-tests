package demo.stepdefinitions;

import demo.actions.AddToCartSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class AddToCartStepsDefinitions {

    @Steps
    AddToCartSteps addToCart;

    @When("I click on Add to Cart button")
    public void iClickOnAddToCartButton() {
        addToCart.clickOnAddToCartButton();
    }

    @Then("I should see the product name {string} added on cart")
    public void iShouldSeeTheProductAddedOnCart(String productName) {
        addToCart.verifyProductNameOnCart(productName);
    }
}
