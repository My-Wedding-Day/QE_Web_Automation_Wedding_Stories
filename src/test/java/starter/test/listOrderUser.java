package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.listOrderUserSteps;

public class listOrderUser {

    @Steps
    listOrderUserSteps listorderusersteps;

    @Given("I am at the login page user to see list order")
    public void i_am_at_the_login_page_user_to_see_list_order() {
        listorderusersteps.openHomePage();
        listorderusersteps.openLoginPage();
    }

    @When("I am input valid email and valid password and the click login")
    public void i_am_input_valid_email_and_valid_password_and_the_click_login() {
        listorderusersteps.inputvalidEmailPassword();
        listorderusersteps.clickLogin();

    }

    @When("I am redirected to Home Page and go to History Order")
    public void i_am_redirected_to_Home_Page_and_go_to_History_Order() {
        listorderusersteps.successLogin();
        listorderusersteps.ClickDrpDwn();
        listorderusersteps.ViewHistoryOrder();
    }

    @Then("I am redirected to the History Order Page")
    public void i_am_redirected_to_the_History_Order_Page() {
        listorderusersteps.successViewHistory();
    }

}
