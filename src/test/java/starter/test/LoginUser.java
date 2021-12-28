package starter.test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.LoginUserSteps;

public class LoginUser {
    @Steps
    LoginUserSteps loginUserSteps;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginUserSteps.openHomePage();
        loginUserSteps.openLoginPage();
    }

    @When("I enter my email and password correctly")
    public void iEnterMyEmailAndPasswordCorrectly() {
        loginUserSteps.inputValidLogin();
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginUserSteps.clickLogin();
    }

    @Then("I am redirected to the homepage and I redirected to homepage")
    public void iAmRedirectedToTheHomepageAndIRedirectedToHomepage() {
        loginUserSteps.successLogin();
    }
}
