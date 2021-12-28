        package starter.test;

        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;
        import net.thucydides.core.annotations.Steps;
        import starter.steps.ProfileUserSteps;

        public class ProfileUser {
            @Steps
            ProfileUserSteps profileUserSteps;

            @Given("I on the login page")
            public void i_on_the_login_page() {
                profileUserSteps.openHomePage();
                profileUserSteps.iconWebsite();
                profileUserSteps.openLoginPage();
            }

            @When("I enter email and password correctly")
            public void i_enter_email_and_password_correctly() {
                profileUserSteps.inputvalidEmail();
                profileUserSteps.inputvalidPassword();
            }

            @When("I click Log in button")
            public void i_click_Log_in_button() {

                profileUserSteps.clickButtonLogin();
            }

            @When("I click logo avatar user")
            public void i_click_logo_avatar_user() {

                profileUserSteps.validateUsername();
            }

            @When("I click profile")
            public void i_click_profile() {

                profileUserSteps.CLickProfile();
                profileUserSteps.clickbtnProfileUser();

            }

            @Then("I am redirected to profile user")
            public void i_am_redirected_to_profile_user() {
                profileUserSteps.validateUsernameProfile();
            }
        }

