package demo.actions;

import demo.pageobjects.AccountPage;
import demo.pageobjects.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.NoSuchElementException;

import static org.awaitility.Awaitility.await;

public class LoginSteps extends UIInteractionSteps {

    @Step("I click on login icon")
    public void clickLoginIcon() {
        find(LoginPage.LOGIN_ICON).click();
    }

    @Step("I enter the email {string}")
    public void iEnterTheEmail(String string) {
        find(LoginPage.EMAIL_FIELD).sendKeys(string);
    }

    @Step("I enter the password {string}")
    public void iEnterThePassword(String string) {
        find(LoginPage.PASSWORD_FIELD).sendKeys(string);
    }

    @Step("I click on the Login button")
    public void clickLoginButton() {
        find(LoginPage.LOGIN_BUTTON).click();
    }

    @Step("I should see the {string} message")
    public String getLoginWelcomeMessage() {
        await().until(this::isWelcomeMessageVisible);
        return find(AccountPage.WELCOME_MESSAGE).getText();
    }

    private boolean isWelcomeMessageVisible() {
        try {
            return find(AccountPage.WELCOME_MESSAGE).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
