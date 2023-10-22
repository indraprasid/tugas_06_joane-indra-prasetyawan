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

public class stepRunner {

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

    @And("User enters the valid password, i.e. secret_sauce")
    public void userEntersTheValidPasswordIESecret_sauce() {

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
    @Then("User is redirected to the homepage")
    public void userIsRedirectedToTheHomepage() {

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.saucedemo.com/inventory.html");
    }

    @Then("The system shows an error message")
    public void theSystemShowsAnErrorMessage() {

        String errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");

        driver.close();
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

    @And("User clicks Add to Cart button for the Sauce Labs Backpack product")
    public void userClicksAddToCartButtonForTheSauceLabsBackpackProduct() {

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }

    @Then("Verify the badge of cart is filled by number")
    public void verifyTheBadgeOfCartIsFilledByNumber() {

        String badgeCart = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();
        Assert.assertEquals(badgeCart, "1");
    }

    @Then("Verify the Add to Cart button is changed to Remove button for the Sauce Labs Backpack product")
    public void verifyTheAddToCartButtonIsChangedToRemoveButtonForTheSauceLabsBackpackProduct() {

        String removeBtn = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).getText();
        Assert.assertEquals(removeBtn, "Remove");

//        driver.close();
    }

    @And("User clicks Remove button for the Sauce Labs Backpack product")
    public void userClicksRemoveButtonForTheSauceLabsBackpackProduct() {

        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
    }

    @Then("Verify the Remove button is changed to Add to Cart button for the Sauce Labs Backpack product")
    public void verifyTheRemoveButtonIsChangedToAddToCartButtonForTheSauceLabsBackpackProduct() {

        String addToCartBtn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).getText();
        Assert.assertEquals(addToCartBtn, "Add to cart");

//        driver.close();
    }

    @And("User clicks Add to the side bar menu")
    public void userClicksAddToTheSideBarMenu() {

        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        driver.findElement(By.xpath("//div[@class='bm-menu']")).isDisplayed();
    }

    @And("User clicks About on the side bar menu")
    public void userClicksAboutOnTheSideBarMenu() {

        driver.findElement(By.id("about_sidebar_link")).click();
    }

    @Then("Verify the users are redirected to the SauceLabs page")
    public void verifyTheUsersAreRedirectedToTheSauceLabsPage() {

        String urlSauceLabs = driver.getCurrentUrl();
        Assert.assertEquals(urlSauceLabs,"https://saucelabs.com/");

        driver.close();
    }

    @And("Verify the Sauce Labs Backpack product is available in the Cart")
    public void verifyTheSauceLabsBackpackProductIsAvailableInTheCart() {

        driver.findElement(By.className("shopping_cart_link")).click();
        String titleOfProduct = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        Assert.assertEquals(titleOfProduct, "Sauce Labs Backpack");
    }

    @And("User clicks Checkout button")
    public void userClicksCheckoutButton() {

        driver.findElement(By.id("checkout")).click();
    }

    @And("Verify users are redirected to the Checkout Your Information page")
    public void verifyUsersAreRedirectedToTheCheckoutYourInformationPage() {

        String titlePage = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(titlePage, "Checkout: Your Information");
    }

    @And("User clicks Continue button")
    public void userClicksContinueButton() {

        driver.findElement(By.name("continue")).click();
    }

    @Then("The system shows an error message First Name is required")
    public void theSystemShowsAnErrorMessageFirstNameIsRequired() {

        String errFirstNameRequired = driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
        Assert.assertEquals(errFirstNameRequired, "Error: First Name is required");

        driver.close();
    }

    @And("User enters the (.*) as firstName$")
    public void userEntersTheFirstNameAsFirstName(String firstName) {

        driver.findElement(By.id("first-name")).sendKeys(firstName);
    }

    @And("User enters the (.*) as lastName$")
    public void userEntersTheLastNameAsLastName(String lastName) {

        driver.findElement(By.id("last-name")).sendKeys(lastName);
    }

    @And("User enters the (.*) as postalCode$")
    public void userEntersThePostalCodeAsPostalCode(String postalCode) {

        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
    }

    @And("User is redirected to the Checkout Review page with Sauce Labs Backpack product")
    public void userIsRedirectedToTheCheckoutReviewPageWithSauceLabsBackpackProduct() {

        String titleOfOverview = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(titleOfOverview, "Checkout: Overview");

        String titleOfProduct = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        Assert.assertEquals(titleOfProduct, "Sauce Labs Backpack");
    }

    @And("User clicks Finish button")
    public void userClicksFinishButton() {

        driver.findElement(By.name("finish")).click();
    }

    @Then("The system shows Thank you for your order")
    public void theSystemShowsThankYouForYourOrder() {

        String successCO = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
        Assert.assertEquals(successCO, "Thank you for your order!");

        driver.close();;
    }

}
