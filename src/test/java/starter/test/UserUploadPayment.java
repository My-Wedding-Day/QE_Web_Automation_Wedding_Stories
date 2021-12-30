package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.UserUploadPaymentSteps;

public class UserUploadPayment {

    @Steps
    UserUploadPaymentSteps paymentusersteps;

    @Given("I at the login page user to see list payment")
    public void i_at_the_login_page_user_to_see_list_payment() {
        paymentusersteps.openHomePage();
        paymentusersteps.iconWebsite();
        paymentusersteps.openLoginPage();
    }

    @When("I input valid email and valid password and the click login")
    public void i_input_valid_email_and_valid_password_and_the_click_login() {
        paymentusersteps.inputvalidEmail();
        paymentusersteps.inputvalidPassword();
        paymentusersteps.clickButtonLogin();
    }

    @When("I redirected to Home Page and go to History Order")
    public void i_redirected_to_Home_Page_and_go_to_History_Order() {
        paymentusersteps.validateUsername();
        paymentusersteps.CLickHistory();
        paymentusersteps.clickbtnHistory();
        paymentusersteps.validateUsernameProfile();

    }

    @When("I click payment")
    public void i_click_payment() {
        paymentusersteps.drpdwn();
        paymentusersteps.clickPayment();

    }

    @When("I upload valid payment {string}")
    public void iUploadValidPayment(String filename) {
        paymentusersteps.uploadPayment(filename);
    }


    @Then("I succes upload valid payment")
    public void iSuccesUploadValidPayment() {
        paymentusersteps.successUpload();
    }
}