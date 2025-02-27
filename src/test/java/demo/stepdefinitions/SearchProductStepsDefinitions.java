package demo.stepdefinitions;

import demo.actions.SearchProductSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SearchProductStepsDefinitions {

    @Steps
    SearchProductSteps searchProduct;

    @Given("I click on the search bar")
    public void iClickOnTheSearchBar() {
        searchProduct.clickOnSearchbar();
    }

    @Given("I entered the product name {string} on search bar")
    public void iEnterProductName(String productName) {
        searchProduct.enteredProductName(productName);
    }

    @When("I click on the search button")
    public void iClickOnSearchButton() {
        searchProduct.clickSearchButton();
    }

    @Then("I should see results for {string}")
    public void iShouldSeeResultsFor(String productName) {
        searchProduct.verifySearchResults(productName);
    }
}
