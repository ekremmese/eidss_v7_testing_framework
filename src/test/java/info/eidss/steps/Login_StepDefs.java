package info.eidss.step_definitions;

import info.eidss.pages.LoginPage;
import info.eidss.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the main page.")
    public void the_user_is_on_the_main_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://eidss7-01.eidss.info/EIDSS7WEB-BV3/Administration/Admin/login");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks the Login button")
    public void user_clicks_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user lands on main page")
    public void the_user_lands_on_main_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
