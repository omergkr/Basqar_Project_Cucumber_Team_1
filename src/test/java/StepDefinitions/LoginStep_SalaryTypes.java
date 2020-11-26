package StepDefinitions;

import Pages.LeftNav_SalaryTypes;
import Pages.MainContent_SalaryTypes;
import Pages.ParentClass_SalaryTypes;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginStep_SalaryTypes {


    WebDriver driver;
    MainContent_SalaryTypes mainContent = new MainContent_SalaryTypes();
    LeftNav_SalaryTypes leftNav = new LeftNav_SalaryTypes();
    ParentClass_SalaryTypes parentSalaryType=new ParentClass_SalaryTypes();


    @Given("^Navigate to basqar$")
    public void navigateToBasqar() {

        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    @When("^Enter username and password and  click Login button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {


        mainContent.findElementAndSendKeys("username", "daulet2030@gmail.com");
        mainContent.findElementAndSendKeys("password", "TechnoStudy123@");
        mainContent.findAndClickElement("loginButton");
        mainContent.findAndClickElement("gotItButton");


    }
    @Then("^User should login successfully$")
    public void user_should_login_successfully() {

    }



    @And("^Navigate to Salary Types page$")
    public void navigateToSalaryTypesPage() {

        leftNav.findElementAndClickFunction("humanButton");
        leftNav.findElementAndClickFunction("setupButton");
        leftNav.findElementAndClickFunction("SalaryTypesButton");


    }

    @When("^click add button$")
    public void clickAddButton() {
        mainContent.findAndClickElement("addButton");

    }


    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        mainContent.findElementAndVerifyContainsText("successfullytext", "Salary Type successfully created");
    }

    @Then("^SalaryTypes page title control$")
    public void salarytypesPageTitleControl() {
        mainContent.findElementAndVerifyContainsText("SalaryTypesTittle", "Salary Types");
    }

    @Then("^Enter name as \"([^\"]*)\" click User Type and Click Save Button$")
    public void enterNameAsClickUserTypeAndClickSaveButton(String userName) {

        mainContent.findElementAndSendKeys("nameInput", userName);
        mainContent.findAndClickElement("userType");
        mainContent.findAndClickElement("AdministratorButton");
        mainContent.findAndClickElement("saveButton");

    }

    @And("^Erros message should be displayed$")
    public void errosMessageShouldBeDisplayed() {
        mainContent.findElementAndVerifyContainsText("errorMessage", "Error!");
    }

    @Then("^User have to name add$")
    public void userHaveToNameAdd() {
        if (mainContent.saveButton.isEnabled())
            mainContent.findAndClickElement("saveButton");
    }


    @Then("^Success delete message should be displayed$")
    public void successDeleteMessageShouldBeDisplayed() {
        mainContent.findElementAndVerifyContainsText("deleteSuccessMessage", "Salary Type successfully deleted");
    }





    @When("^User can salary Types edit$")
    public void userCanSalaryTypesEdit() {
        mainContent.findAndClickElement("editButton");
        mainContent.findElementAndSendKeys("nameInput","akmazlgl");
        mainContent.findAndClickElement("userType");
        mainContent.findAndClickElement("cancelButton");

        mainContent.findAndClickElement("AdministratorButton");
        mainContent.findAndClickElement("saveButton");
    }

    @Then("^Success edit message should be displayed$")
    public void successEditMessageShouldBeDisplayed() {
        mainContent.findElementAndVerifyContainsText("editSuccessMessage", "Salary Type successfully updated");
    }


    @When("^User can salary Types delete$")
    public void userCanSalaryTypesDelete() {

        mainContent.findAndClickElement("deleteButton");
        mainContent.findAndClickElement("yesButton");
    }

    @When("^Click activ or inactiv buttons of Salary Types$")
    public void clickActivOrInactivButtonsOfSalaryTypes() {
        mainContent.findAndClickElement("activeButton");
    }

    @Then("^Success activ or inactiv message should be displayed$")
    public void successActivOrInactivMessageShouldBeDisplayed() {
        mainContent.findElementAndVerifyContainsText("activeSuccessMessage", "Salary Type successfully updated");
    }




}
