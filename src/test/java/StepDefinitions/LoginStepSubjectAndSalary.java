package StepDefinitions;

import Pages.SubjectAndSalaryModifiers;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepSubjectAndSalary {


    WebDriver driver;
    SubjectAndSalaryModifiers subjectAndSalaryModifiers = new SubjectAndSalaryModifiers();


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
        subjectAndSalaryModifiers.findElementAndSendKeys("username", "daulet2030@gmail.com");
        subjectAndSalaryModifiers.findElementAndSendKeys("password", "TechnoStudy123@");

        // Elements found and clicked
        subjectAndSalaryModifiers.findAndClickElement("loginButton");
        subjectAndSalaryModifiers.findAndClickElement("gotItButton");



    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {


    }
}
