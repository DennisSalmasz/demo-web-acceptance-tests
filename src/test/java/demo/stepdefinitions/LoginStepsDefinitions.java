package demo.stepdefinitions;

import demo.actions.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepsDefinitions {

    @Steps
    LoginSteps login;

    @Given("I click on login icon")
    public void iClickOnLoginIcon() {
        login.clickLoginIcon();
    }

    @When("I enter the email {string}")
    public void iEnterTheEmail(String string) {
        login.iEnterTheEmail(string);
    }

    @When("I enter the password {string}")
    public void iEnterThePassword(String string) {
        login.iEnterThePassword(string);
    }

    @When("I click on the Login button")
    public void iClickOnTheLoginButton() {
        login.clickLoginButton();
    }

    @Then("I should see the {string} message")
    public void iShouldSeeTheMessage(String string) {
        assertThat(login.getLoginWelcomeMessage()).isEqualTo(string);
    }
}
