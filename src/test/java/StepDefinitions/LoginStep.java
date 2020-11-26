package StepDefinitions;

import Pages.PositionSalary_Positions_BankAccounts_Content;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginStep {


    WebDriver driver;
    PositionSalary_Positions_BankAccounts_Content mainContent = new PositionSalary_Positions_BankAccounts_Content();


    @Given("^Navigate to basqar$")
    public void navigateToBasqar() {

        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    /**
     *  Keys send to username and password
     */
    @When("^Enter username and password and  click Login button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {


        // Keys send to username and password
        mainContent.findElementAndSendKeys("username", "daulet2030@gmail.com");
        mainContent.findElementAndSendKeys("password", "TechnoStudy123@");

        // Elements found and clicked
        mainContent.findAndClickElement("loginButton");
        if (mainContent.gotItButton.isDisplayed())
        mainContent.findAndClickElement("gotItButton");



    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {


    }
}
