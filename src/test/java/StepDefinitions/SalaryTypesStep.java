package StepDefinitions;

import Pages.LeftNav_SalaryTypes;
import Pages.SalaryTypes_Content;
import Pages.ParentClass_SalaryTypes;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SalaryTypesStep {


    WebDriver driver;
    SalaryTypes_Content mainContent = new SalaryTypes_Content();
    LeftNav_SalaryTypes leftNav = new LeftNav_SalaryTypes();
    ParentClass_SalaryTypes parentSalaryType=new ParentClass_SalaryTypes();


    @Given("^Navigate to basqar for Salary Page$")
    public void navigateToBasqarForSalaryPage() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
       driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username and password and  click Login button for Salary Page$")
    public void enterUsernameAndPasswordAndClickLoginButtonForSalaryPage() {
        mainContent.findElementAndSendKeys("username", "daulet2030@gmail.com");
        mainContent.findElementAndSendKeys("password", "TechnoStudy123@");
        mainContent.findAndClickElement("loginButton");
       mainContent.findAndClickElement("gotItButton");
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

    @Then("^Success message should be displayed for Salary Page$")
    public void successMessageShouldBeDisplayedForSalaryPage() {
        mainContent.findElementAndVerifyContainsText("successfullytext", "Salary Type successfully created");
    }


    @Then("^SalaryTypes page title control$")
    public void salarytypesPageTitleControl() {
        mainContent.findElementAndVerifyContainsText("SalaryTypesTittle", "Salary Types");
    }

    @Then("^Enter name as \"([^\"]*)\" click User Type and Click Save Button for Salary Page$")
    public void enterNameAsClickUserTypeAndClickSaveButtonForSalaryPage(String userName)  {
        mainContent.findElementAndSendKeys("nameInput", userName);
        mainContent.findAndClickElement("userType");
        mainContent.findAndClickElement("AdministratorButton");
        mainContent.findAndClickElement("saveButton");

    }

    @And("^Erros message should be displayed for Salary Page$")
    public void errosMessageShouldBeDisplayedForSalaryPage() {
        mainContent.findElementAndVerifyContainsText("errorMessage", "Error!");
    }


    @Then("^User have to name add for Salary Page$")
    public void userHaveToNameAddForSalaryPage() {

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


    @When("^User can salary Types delete the \"([^\"]*)\"$")
    public void userCanSalaryTypesDeleteThe(String salaryNameDelete)  {
        mainContent.editAndDeleteFunction(salaryNameDelete,"delete");
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
