package demo.stepdefinitions;

import demo.actions.HomeSteps;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;

public class HomeStepsDefinitions {

    @Steps
    HomeSteps navigate;

    @Given("I am on the Home Page")
    public void iAmOnTheHomePage() {
        navigate.getHomePage();
    }
}
