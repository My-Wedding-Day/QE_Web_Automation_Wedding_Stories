package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.RegisterWOSteps;

public class RegisterWO {
    @Steps
    RegisterWOSteps registerWOSteps;

    //PreCondition
    @Given("I am open register Wedding Organizer page")
    public void i_am_open_register_Wedding_Organizer_page() {
        registerWOSteps.openHomePage();
        registerWOSteps.openWeddingStoriesPage();
        registerWOSteps.openRegisterPage();
        registerWOSteps.ClickRegisterWOPage();
    }

    //REGISTER SUCCESSFULLY
    @When("I enter Bussiness Name ini nama wo")
    public void i_enter_Bussiness_Name_ini_nama_wo() {
        registerWOSteps.inputvalidBussinessName();
    }

    @When("I enter Email iniwo13@gmail.com")
    public void i_enter_Email_iniwo_gmail_com() {
        registerWOSteps.validEmail();

    }

    @When("I am enter Address jl jalan doang")
    public void i_am_enter_Address_jl_jalan_doang() {
        registerWOSteps.inputAddress();

    }

    @When("I am choose city Jakarta")
    public void i_am_choose_city_Jakarta() {
        registerWOSteps.chooseCity();
    }

    @When("I am enter Phone Number {}")
    public void i_am_enter_Phone_Number(String PhoneNumber) {
        registerWOSteps.inputPhoneNumber(PhoneNumber);
    }
    @When("I am enter Password {}")
    public void iAmEnterPassword(String Password) {
        registerWOSteps.inputPassword(Password);
    }

    @Then("I am click button register")
    public void i_am_click_button_register() {
        registerWOSteps.clickBtnRegister();
    }

    @Then("show alert message please verify successfully pop up")
    public void show_alert_message_please_verify_successfully_pop_up() {
        registerWOSteps.validatePopUp();
    }

    //REGISTER FAILED
    @When("I enter Bussiness Name {string}")
    public void i_enter_Bussiness_Name(String InvalidBussinessName) {
        registerWOSteps.inputInvalidBussinessName(InvalidBussinessName);
    }

    @When("I enter Email {string}")
    public void i_enter_Email(String InvalidEmail) {
        registerWOSteps.InvalidEmail(InvalidEmail);
    }

    @Then("show alert message {string}")
    public void show_alert_message(String string) {
    }

    @When("I am not input Email")
    public void i_am_not_input_Email() {

    }

    @When("I am not input Password")
    public void i_am_not_input_Password() {

    }

    @When("I am Failed Register")
    public void iAmFailedRegister() {
    }
}
