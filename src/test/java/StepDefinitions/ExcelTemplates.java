package StepDefinitions;

import Pages.Excel_Template_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ExcelTemplates {


    Excel_Template_Content excel_template_content=new Excel_Template_Content();

    @When("^click on element with name$")
    public void clickOnElementWithName() {

        excel_template_content.findAndClickElement("reports");
        excel_template_content.findAndClickElement("setupReports");
        excel_template_content.findAndClickElement("excelTemplate");

    }

    @Then("^Create a new Budget Excel Template name as \"([^\"]*)\" and period count as \"([^\"]*)\"$")
    public void createANewBudgetExcelTemplateNameAsAndPeriodCountAs(String name, String periodCount) {

        excel_template_content.findAndClickElement("addButton");
        excel_template_content.findElementAndSendKeys("name", name);
        excel_template_content.findElementAndSendKeys("periodCount", periodCount);

        if (excel_template_content.saveButton.isEnabled())
            excel_template_content.findAndClickElement("saveButton");

        if (excel_template_content.saveButton.isEnabled())
            excel_template_content.findAndClickElement("saveButton");

        excel_template_content.findAndClickElement("closeDialog");

    }


    @Then("^Message: your process has been successfully done$")
    public void messageYourProcessHasBeenSuccessfullyDone() {

        excel_template_content.findElementAndVerifyContainsText("message", "successfully");
    }

    @And("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {

        excel_template_content.findElementAndVerifyContainsText("message", "successfully");

    }

    @And("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {

        excel_template_content.findElementAndVerifyContainsText("message", "already ");

    }

// Todo Edit and Delete

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String oldValue, String newValue) {

        excel_template_content.editFunction(oldValue);
        excel_template_content.findElementAndSendKeys("name", newValue);
        excel_template_content.findAndClickElement("saveButton");
        excel_template_content.findAndClickElement("closeDialog");

    }


    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String nameOfSubjectToDelete) {

        excel_template_content.deleteFunction(nameOfSubjectToDelete);
        excel_template_content.findAndClickElement("yesButton");

    }








    @Then("^Check aktiv radio button clickable or not$")
    public void checkAktivRadioButtonClickableOrNot() {
        excel_template_content.findAndClickElement("activeButton");
    }

    @When("^Click subject categoriy activ or inactiv$")
    public void clickSubjectCategoriyActivOrInactiv() {

        excel_template_content.findAndClickElement("addButton");
        excel_template_content.findAndClickElement("activeButton");
        Assert.assertFalse(excel_template_content.activeButton.isSelected());

    }

    @When("^When searching by  name as \"([^\"]*)\"$")
    public void whenSearchingByNameAs(String name) {

        excel_template_content.findElementAndSendKeys("searchName",name);
        excel_template_content.findAndClickElement("searchButton");
    }

    @And("^Save Button is disable$")
    public void saveButtonIsDisable() {

    excel_template_content.elementisEnabled("saveButton");

    }

    @Then("^Check list with listname as \"([^\"]*)\" and searchtext as \"([^\"]*)\"$")
    public void checkListWithListnameAsAndSearchtextAs(String listname, String text) {

        excel_template_content.checklist(listname,text);
    }

    @Then("^BudgetExcelTemplate page title control$")
    public void budgetexceltemplatePageTitleControl() {

        Assert.assertTrue(excel_template_content.pageTitle.getText().contains("Budget Excel Template"));
    }



}
