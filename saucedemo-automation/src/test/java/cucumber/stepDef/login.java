package cucumber.stepDef;

import io.cucumber.java.en.Given;

/*
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
*/
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    @Given("User already open the sauce demo site.")
    public void userAlreadyOpenTheSauceDemoSite() {

        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

/*
 @When("User enters the valid username, i.e. standard_user")
 public void userEntersTheValidUsernameIEStandard_user() {

     System.out.println("Hello world!");
 }

 @And("User enters the valid password, i.e. secret_sauce")
 public void userEntersTheValidPasswordIESecret_sauce() {

     System.out.println("Hello world!");
 }

 @And("User clicks the Login button")
 public void userClicksTheLoginButton() {

     System.out.println("Hello world!");
 }

 @Then("The user is logged in successfully")
 public void theUserIsLoggedInSuccessfully() {

     System.out.println("Hello world!");
 }

 @And("Redirected to the Products page")
 public void redirectedToTheProductsPage() {

     System.out.println("Hello world!");
 }
*/

    @Given("User already open the sauce demo site")
    public void userAlreadyOpenTheSauceDemoSites() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }
/*

    @And("User enters the valid password, i.e. secret_saucedemo")
    public void userEntersTheValidPasswordIESecret_saucedemo() {

        System.out.println("Hello world!");
    }

    @Then("The system shows an error message {string}")
    public void theSystemShowsAnErrorMessageEpicSadfaceUsernameAndPasswordDoNotMatchAnyUserInThisService() {

        System.out.println("Hello world!");
    }

    @And("The user is unsuccessfully logged in")
    public void theUserIsUnsuccessfullyLoggedIn() {

        System.out.println("Hello world!");
    }
*/
}