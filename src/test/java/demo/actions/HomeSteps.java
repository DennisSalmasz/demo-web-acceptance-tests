package demo.actions;

import demo.pageobjects.HomePage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class HomeSteps extends UIInteractionSteps {

    HomePage navigate;

    @Step("I am on the Home Page")
    public void getHomePage() {
        navigate.open();
        Serenity.getDriver().manage().window().maximize();
    }
}
