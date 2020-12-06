package StepDefinitions;

import Pages.LeftNav_CostCenters;
import Pages.CostCenters_Content;
import Pages.ParentClass_CostCenters;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class CostCentersStep {


    WebDriver driver;
    CostCenters_Content mainContent = new CostCenters_Content();
    LeftNav_CostCenters leftNav = new LeftNav_CostCenters();
    ParentClass_CostCenters parentSalaryType=new ParentClass_CostCenters();


//    @Given("^Navigate to basqar$")
//    public void navigateToBasqar() {
//
//        driver = Driver.getDriver();
//        driver.get("https://test.basqar.techno.study/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//    }
//
//
//    @When("^Enter username and password and  click Login button$")
//    public void enterUsernameAndPasswordAndClickLoginButton() {
//
//
//        mainContent.findElementAndSendKeys("username", "daulet2030@gmail.com");
//        mainContent.findElementAndSendKeys("password", "TechnoStudy123@");
//        mainContent.findAndClickElement("loginButton");
//        mainContent.findAndClickElement("gotItButton");
//
//
//    }
//    @Then("^User should login successfully$")
//    public void user_should_login_successfully() {
//
//    }
    @Given("^Navigate to Cost Centers page$")
    public void navigateToCostCentersPage() {
        leftNav.findElementAndClickFunction("BudgetButton");
        leftNav.findElementAndClickFunction("setupButton");
        leftNav.findElementAndClickFunction("CostCentersButton");
    }



    @When("^Click add button$")
    public void clickAddButton() {
        mainContent.findAndClickElement("addButton");
    }

    @Then("^CostCenters page title control$")
    public void costcentersPageTitleControl() {
        mainContent.findElementAndVerifyContainsText("CostCentersTittle", "Cost Centers");
    }


//    @Then("^Success message should be displayed$")
//    public void successMessageShouldBeDisplayed() {
//        mainContent.findElementAndVerifyContainsText("costCenterSuccessfullyText", "Cost Center successfully created");
//    }



    @Then("^Enter name as \"([^\"]*)\" click User Type and Click Save Button$")
    public void enterNameAsClickUserTypeAndClickSaveButton(String userName) {

        mainContent.findElementAndSendKeys("nameInput", userName);
        mainContent.findAndClickElement("userType");
        mainContent.findAndClickElement("AdministratorButton");
        mainContent.findAndClickElement("saveButton");

    }
    @Then("^Enter name as \"([^\"]*)\" as code \"([^\"]*)\" as order no \"([^\"]*)\"$")
    public void enterNameAsAsCodeAsOrderNo(String name, String code, String order)   {
       mainContent.findElementAndSendKeys("nameInput",name);
       //mainContent.findAndClickElement("codeButton");
       mainContent.findElementAndSendKeys("codeInput",code);
       mainContent.findAndClickElement("typeButton");
       mainContent.findAndClickElement("personalTypeButton");
       mainContent.findElementAndSendKeys("orderInput",order);
       mainContent.findAndClickElement("expenseAccoutButton");
       mainContent.findAndClickElement("expenseAccoutButton2");
       mainContent.findAndClickElement("saveButton");

    }

    @When("^User can Cost Center delete the \"([^\"]*)\"$")
    public void userCanCostCenterDeleteThe(String nameOfCostCenterToDelete)  {
        mainContent.editAndDeleteFunction(nameOfCostCenterToDelete, "Delete");
        mainContent.findAndClickElement("yesButton");

    }
//    @Then("^Success delete message should be displayed$")
//    public void successDeleteMessageShouldBeDisplayed() {
//        mainContent.findElementAndVerifyContainsText("message", "successfully");
//    }


    @Then("^Success Edit message should be displayed$")
    public void successEditMessageShouldBeDisplayed() {
        mainContent.findElementAndVerifyContainsText("message", "successfully");

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
//    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
//    public void userEditTheTo(String salaryTypesName, String newSalaryName) {
//        mainContent.editAndDeleteFunction(salaryTypesName, "edit");
//        mainContent.findElementAndSendKeys("nameInput", newSalaryName);
//
//        mainContent.findAndClickElement("saveButton");
//
//    }








}
