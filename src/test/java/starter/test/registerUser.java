package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.RegisterUserSteps;

public class registerUser {
    @Steps
    RegisterUserSteps registerUserSteps;

    @Given("I am on the register page")
    public void i_am_on_the_register_page() {
        registerUserSteps.openHomePage();
        registerUserSteps.openRegisterPage();
    }

    @When("I enter my username email and password correctly")
    public void i_enter_my_username_email_and_password_correctly() {
        registerUserSteps.inputValidRegister();
    }

    @When("I click Register button")
    public void i_click_Register_button() {
        registerUserSteps.clickSignUp();
    }

    @Then("I am Successfully registered my Account")
    public void i_am_Successfully_registered_my_Account() {
        registerUserSteps.successSignUp();
    }
}
