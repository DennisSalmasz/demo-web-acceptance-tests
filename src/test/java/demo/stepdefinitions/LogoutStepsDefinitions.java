package demo.stepdefinitions;

import demo.actions.LogoutSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LogoutStepsDefinitions {

    @Steps
    LogoutSteps logout;

    @When("I click on the Logout button")
    public void iClickOnTheLogoutButton() {
        logout.clickLogoutButton();
    }

    @Then("I should be on the Home Page")
    public void iShouldBeOnTheHomePage() {
        logout.verifyHomePage();
    }
}
