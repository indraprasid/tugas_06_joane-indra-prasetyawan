package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;

public class login {

/*
WebDriver driver;
String baseURL = "https://www.saucedemo.com/";
*/

    @Given("User already open the sauce demo site.")
    public void userAlreadyOpenTheSauceDemoSite() {
    }

    @When("User enters the valid username, i.e. standard_user")
    public void userEntersTheValidUsernameIEStandard_user() {
    }

    @And("User enters the valid password, i.e. secret_sauce")
    public void userEntersTheValidPasswordIESecret_sauce() {
    }

    @And("User clicks the Login button")
    public void userClicksTheLoginButton() {
    }

    @Then("The user is logged in successfully")
    public void theUserIsLoggedInSuccessfully() {
    }

    @And("Redirected to the Products page")
    public void redirectedToTheProductsPage() {
    }

    @Given("User already open the sauce demo site")
    public void userAlreadyOpenTheSauceDemoSites() {
    }

    @And("User enters the valid password, i.e. secret_saucedemo")
    public void userEntersTheValidPasswordIESecret_saucedemo() {
    }

    @Then("The system shows an error message {string}")
    public void theSystemShowsAnErrorMessageEpicSadfaceUsernameAndPasswordDoNotMatchAnyUserInThisService() {
    }

    @And("The user is unsuccessfully logged in")
    public void theUserIsUnsuccessfullyLoggedIn() {
    }

    @Given("B")
    public void b() {
    }

    @When("C")
    public void c() {
    }

    @And("D")
    public void d() {
    }

    @Then("E")
    public void e() {
    }
}
