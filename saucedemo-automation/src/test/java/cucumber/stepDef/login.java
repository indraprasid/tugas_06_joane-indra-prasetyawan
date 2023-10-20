package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    @Given("User already open the sauce demo site.")
    public void userAlreadyOpenTheSauceDemoSite() {
        System.setProperty("webdriver.chrome.driver", "saucedemo-automation/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @When("User enters the valid username, i.e. standard_user")
    public void userEntersTheValidUsernameIEStandard_user() {
        throw new io.cucumber.java.PendingException();
    }

    @And("User enters the valid password, i.e. secret_sauce")
    public void userEntersTheValidPasswordIESecret_sauce() {
        throw new io.cucumber.java.PendingException();
    }

    @And("User clicks the Login button")
    public void userClicksTheLoginButton() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user is logged in successfully")
    public void theUserIsLoggedInSuccessfully() {
        throw new io.cucumber.java.PendingException();
    }

    @And("Redirected to the Products page")
    public void redirectedToTheProductsPage() {
        throw new io.cucumber.java.PendingException();
    }

    @Given("User already open the sauce demo site")
    public void userAlreadyOpenTheSauceDemoSites() {
        throw new io.cucumber.java.PendingException();
    }

    @And("User enters the valid password, i.e. secret_saucedemo")
    public void userEntersTheValidPasswordIESecret_saucedemo() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The system shows an error message {string}")
    public void theSystemShowsAnErrorMessageEpicSadfaceUsernameAndPasswordDoNotMatchAnyUserInThisService() {
        throw new io.cucumber.java.PendingException();
    }

    @And("The user is unsuccessfully logged in")
    public void theUserIsUnsuccessfullyLoggedIn() {
        throw new io.cucumber.java.PendingException();
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
