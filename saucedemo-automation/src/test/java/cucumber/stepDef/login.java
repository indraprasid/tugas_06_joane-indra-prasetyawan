package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com";

    @Given("User already open the sauce demo site")
    public void userAlreadyOpenTheSauceDemoSites() {

        WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @When("User enters the valid username, i.e. standard_user")
    public void userEntersTheValidUsernameIEStandard_user() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("User enters the valid password, i.e. secret_saucedemo")
    public void userEntersTheValidPasswordIESecret_saucedemo() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("User enters the invalid password, i.e. secret")
    public void userEntersTheInvalidPasswordIESecret() {
        driver.findElement(By.id("password")).sendKeys("secret");
    }

    @And("User clicks the Login button")
    public void userClicksTheLoginButton() {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
    @Then("The user is successfully logged in")
    public void theUserIsSuccessfullyLoggedIn() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.saucedemo.com/inventory.html");
    }

    @Then("The system shows an error message")
    public void theSystemShowsAnErrorMessage() {
        String errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");
    }

    @When("User enters the (.*) as username$")
    public void userEntersTheUsernameAsUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("User enters the (.*) as password$")
    public void userEntersThePasswordAsPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("Verify (.*) as status$")
    public void verifyStatus(String status) {
        if (status.equals("success")){
             String currentUrl = driver.getCurrentUrl();
             Assert.assertEquals(currentUrl,"https://www.saucedemo.com/inventory.html");
        } else{
            String errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
            Assert.assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");
        }

        driver.close();
    }
}
