package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.UserCreateReservationSteps;

public class UserCreateReservation {
    @Steps
    UserCreateReservationSteps usercreatereservationsteps;

    @Given("I am already logged in as a user that want to book a date of wedding")
    public void i_am_already_logged_in_as_a_user_that_want_to_book_a_date_of_wedding() {
        usercreatereservationsteps.openHomepage();
        usercreatereservationsteps.openLoginPage();
        usercreatereservationsteps.inputvalidEmailPassword();
        usercreatereservationsteps.clickbtnLogin();
        usercreatereservationsteps.validateUser();

    }

    @When("I choose the package of the wedding")
    public void iChooseThePackageOfTheWedding() {
        usercreatereservationsteps.clickPackage();
        usercreatereservationsteps.validateWO();
    }


    @When("I input mandatory field")
    public void iInputMandatoryField() {
        usercreatereservationsteps.inputPax();
        usercreatereservationsteps.chooseDate();
        usercreatereservationsteps.selectDate();
        usercreatereservationsteps.inputDescription();
    }

    @When("I click Order button")
    public void i_click_Order_button() {
        usercreatereservationsteps.clickOrder();
    }

    @Then("I am successfully reserved the date of the wedding and waiting for the approval from the organizer")
    public void i_am_successfully_reserved_the_date_of_the_wedding_and_waiting_for_the_approval_from_the_organizer() {

    }


}
