package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.UpdateStatusOrderSteps;

public class UpdateStatusOrder {

    @Steps
    UpdateStatusOrderSteps updatestatusordersteps;

    @Given("I am at the login WO Page and I enter my username and password")
    public void i_am_at_the_login_WO_Page_and_I_enter_my_username_and_password() {
        updatestatusordersteps.openHomepage();
        updatestatusordersteps.IconWebsite();
        updatestatusordersteps.openSigninpage();
        updatestatusordersteps.ClickbuttonSignWO();
        updatestatusordersteps.inputvalidEmail();
        updatestatusordersteps.inputvalidPassword();
        updatestatusordersteps.OpenProfileWO();
    }

    @Given("I click Login Button and I am redirected to my profile WO Page")
    public void i_click_Login_Button_and_I_am_redirected_to_my_profile_WO_Page() {
        updatestatusordersteps.validateUsernameWO();
        updatestatusordersteps.clickpopUp();
    }

    @When("I am at the profile WO then I am going to List Order Page and then click Accept Order")
    public void i_am_at_the_profile_WO_then_I_am_going_to_List_Order_Page_and_then_click_Accept_Order() {
        updatestatusordersteps.drpDwnlist();
        updatestatusordersteps.clickorderList();
    }

    @Then("I am successfully accept incoming order")
    public void i_am_successfully_accept_incoming_order() {
        updatestatusordersteps.validateorder();
        updatestatusordersteps.detailPackage();
        updatestatusordersteps.clickAccept();
        updatestatusordersteps.clickpopupyes();
    }
}
