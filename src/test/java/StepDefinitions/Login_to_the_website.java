package StepDefinitions;

import Pages.Country_Content;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Login_to_the_website  {

    WebDriver driver;
    Country_Content countryContent = new Country_Content();

    /**
     * This method goes to the website.
     * enter the web address Login_to_the_Website.feature
     *
     * @param website_addresse
     */
    @Given("^go to website \"([^\"]*)\"$")
    public void goToWebsite(String website_addresse) {
        driver = Driver.getDriver();
        driver.get(website_addresse);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\" login click$")
    public void enterUsernameAndPasswordLoginClick(String incoming_username, String incoming_password) {

        countryContent.find_and_send_for_element("username",incoming_username);
        countryContent.find_and_send_for_element("password",incoming_password);



        countryContent.find_and_click_for_element("loginButton");
        countryContent.find_and_click_for_element("goItbutton");

    }

    @Then("^Check for successful login$")
    public void checkForSuccessfulLogin() {
    }

    @And("^quit$")
    public void quit() {
        Driver.quitDriver();
    }
}
