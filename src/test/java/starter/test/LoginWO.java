package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.LoginWOSteps;

public class LoginWO {
    @Steps
    LoginWOSteps loginWOSteps;

    //PreConditon
    @Given("I am open login page Oraganize")
    public void i_am_open_login_page_Oraganize() {
        loginWOSteps.openHomepage();
        loginWOSteps.IconWebsite();
        loginWOSteps.openSigninpage();
        loginWOSteps.ClickbuttonSignWO();

    }
    //LOGIN SUCCESSFULLY
    @When("I am enter valid email")
    public void i_am_enter_valid_email() {
        loginWOSteps.inputvalidEmail();
    }

    @When("I am enter valid password")
    public void i_am_enter_valid_password() {
        loginWOSteps.inputvalidPassword();
    }

    @When("I am click button Login")
    public void i_am_click_button_Login() {
        loginWOSteps.OpenProfileWO();
    }

    @Then("I am redirected to profile WO")
    public void i_am_redirected_to_profile_WO() {
        loginWOSteps.validateUsernameWO();
    }
    //Login Failed
    @When("I am enter invalid email {}")
    public void i_am_enter_invalid_email(String invalidemail) {
        loginWOSteps.inputInvalidEmail(invalidemail);

    }

    @When("I am enter invalid password {}")
    public void i_am_enter_invalid_password(String invalidpassword) {
        loginWOSteps.inputInvalidPassword(invalidpassword);

    }

    @Then("I am failed to login")
    public void i_am_failed_to_login() {

    }

    @When("I am not enter password")
    public void i_am_not_enter_password() {

    }

    @When("I am not enter email")
    public void i_am_not_enter_email() {

    }
}
