package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.addPackageSteps;

public class addPackage {

    @Steps
    addPackageSteps addpackagesteps;

    @Given("I am on the login page web")
    public void i_am_on_the_login_page_web() {
        addpackagesteps.openHomePage();
        addpackagesteps.openLoginPage();

    }

    @When("I click the login account as organizer")
    public void i_click_the_login_account_as_organizer() {
        addpackagesteps.ClickSignInWO();
    }

    @When("I input valid email and password")
    public void i_input_valid_email_and_password() {
        addpackagesteps.validEmailPasword();
    }

    @When("I click button sign in")
    public void i_click_button_sign_in() {
        addpackagesteps.ClickbtnLogIn();
    }

    @When("I click avatar WO")
    public void i_click_avatar_WO() {
        addpackagesteps.validateuserWO();

    }

    @When("I click my packages")
    public void i_click_my_packages() {
        addpackagesteps.clickMyPackage();

    }

    @When("I am redirected to My packages")
    public void i_am_redirected_to_My_packages() {
        addpackagesteps.validateMypackage();
    }

    @When("I click New Package")
    public void i_click_New_Package() {
        addpackagesteps.validatenewPackage();
    }

    @When("I input complete and valid data")
    public void i_input_complete_and_valid_data() {
        addpackagesteps.inputformMandatory();

    }

    @When("I upload photo {}")
    public void iUploadPhoto(String filename) {
        addpackagesteps.uploadimg(filename);
    }


    @Then("I am success add a package wedding")
    public void i_am_success_add_a_package_wedding() {
        addpackagesteps.clickSave();
        addpackagesteps.clickpopupok();
    }


}
