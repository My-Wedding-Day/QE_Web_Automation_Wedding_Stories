package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.deletePackageSteps;

public class deletePackage {
    @Steps
    deletePackageSteps deletepackagesteps;

    @Given("I am on the login page web wedding stories")
    public void iAmOnTheLoginPageWebWeddingStories() {
        deletepackagesteps.openHomePage();
        deletepackagesteps.openLoginPage();
    }

    @When("I click the button login account as organizer")
    public void iClickTheButtonLoginAccountAsOrganizer() {
        deletepackagesteps.ClickSignInWO();

    }

    @When("I am input valid email and password")
    public void i_am_input_valid_email_and_password() {
        deletepackagesteps.validEmailPasword();

    }

    @When("I am click button Sign In")
    public void iAmClickButtonSignIn() {
        deletepackagesteps.ClickbtnLogIn();
    }

    @When("I am click avatar WO")
    public void i_am_click_avatar_WO() {
        deletepackagesteps.validateuserWO();
    }
    @When("I am click my packages")
    public void i_am_click_my_packages() {
        deletepackagesteps.clickMyPackage();
    }
    @When("I am redirected to My all packages")
    public void i_am_redirected_to_My_all_packages() {
        deletepackagesteps.validateMypackage();
    }

    @When("I delete My package wedding")
    public void iDeleteMyPackageWedding() {
        deletepackagesteps.deletePackage();
    }


    @Then("I am success Delete a package wedding")
    public void iAmSuccessDeleteAPackageWedding() {
        deletepackagesteps.clickPopup();
    }

}
