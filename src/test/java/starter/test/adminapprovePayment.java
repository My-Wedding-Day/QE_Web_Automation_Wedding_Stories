package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.adminapprovePaymentSteps;

public class adminapprovePayment {

    @Steps
    adminapprovePaymentSteps adminapprovepaymentsteps;

    @Given("I am the login page admin")
    public void i_am_the_login_page_admin() {
        adminapprovepaymentsteps.openHomePage();
        adminapprovepaymentsteps.clickAdmin();

    }
    @When("I input valid email and valid password")
    public void i_input_valid_email_and_valid_password() {
        adminapprovepaymentsteps.inputvalidEmail();
        adminapprovepaymentsteps.inputvalidPassword();
        adminapprovepaymentsteps.clickSignin();
    }
    @When("I redirected to Home Page")
    public void i_redirected_to_home_page() {
        adminapprovepaymentsteps.drpdownDashboard();


    }
    @When("I Click Dashboard")
    public void i_click_dashboard() {
        adminapprovepaymentsteps.ClickDashboard();

    }
    @When("I choose user payment")
    public void i_choose_user_payment() {
        adminapprovepaymentsteps.validatelistpaymentUser();
        adminapprovepaymentsteps.drpdownPaymentUser();


    }
    @Then("I successfully accept payment user")
    public void i_successfully_accept_payment_user() {
        adminapprovepaymentsteps.clickAccept();
        adminapprovepaymentsteps.popUp();

    }

}
