package StepDefinitions;

import Pages.SubjectCategories_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SubjectCategoriesSteps {

    SubjectCategories_Content subjectCategoriesContent = new SubjectCategories_Content();

    @When("^click on element with name$")
    public void clickOnElementWithName() {

        subjectCategoriesContent.findAndClickElement("Education");
        subjectCategoriesContent.findAndClickElement("Setup");
        subjectCategoriesContent.findAndClickElement("Subject_Categories");


    }


//    @Then("^Create a Subject name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
//    public void createASubjectNameAsAndCodeAs(String name, String code) {
//
//        subjectCategoriesContent.findAndClickElement("Subject_Add");
//        subjectCategoriesContent.findElementAndSendKeys("nameInput", name);
//        subjectCategoriesContent.findElementAndSendKeys("codeInput", code);
//
//        if (subjectCategoriesContent.saveButton.isEnabled())
//        subjectCategoriesContent.findAndClickElement("saveButton");
//
//    }

    @Then("^Succes message should be displayed$")
    public void succesMessageShouldBeDisplayed() {
        subjectCategoriesContent.findElementAndVerifyContainsText("msjContainer", "successfully");

    }

    @Then("^Create a Subject name(\\d+) as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void createASubjectNameAsAndCodeAs(int arg0, String name, String code) {
        subjectCategoriesContent.findAndClickElement("Subject_Add");
        subjectCategoriesContent.findElementAndSendKeys("nameInput", name);
        subjectCategoriesContent.findElementAndSendKeys("codeInput", code);

        if (subjectCategoriesContent.saveButton.isEnabled())
        subjectCategoriesContent.findAndClickElement("saveButton");

    }

    @And("^Succes Error message should be displayed$")
    public void succesErrorMessageShouldBeDisplayed() {
        subjectCategoriesContent.findElementAndVerifyContainsText("msjContainer", "already ");


    }

// Todo Edit und Delet

//    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
//    public void userEditTheTo(String searcofSubjectName, String newSubjecName) {
//
//        subjectCategoriesContent.editAndDeleteFunction(searcofSubjectName, "edit");
//        subjectCategoriesContent.findElementAndSendKeys("nameInput", newSubjecName);
//        subjectCategoriesContent.findAndClickElement("saveButton");
//    }


    @Then("^Messag:Subject Category successfully updated$")
    public void messagSubjectCategorySuccessfullyUpdated() {

        subjectCategoriesContent.findElementAndVerifyContainsText("msjContainer", "successfully");

    }

    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String nameOfSubjectToDelete) {

        subjectCategoriesContent.editAndDeleteFunction(nameOfSubjectToDelete, "Delete");
        subjectCategoriesContent.findAndClickElement("yesButton");

    }

    @When("^Click subject categoriy activ or inactiv$")
    public void clickSubjectCategoriyActivOrInactiv() {

        subjectCategoriesContent.findAndClickElement("activeButton");



    }

//    @When("^When searching by  name as \"([^\"]*)\"$")
//    public void whenSearchingByNameAs(String name) {
//
//        subjectCategoriesContent.findElementAndSendKeys("searchName",name);
//        subjectCategoriesContent.findAndClickElement("searchButton");
//
//
//    }

    @And("^Save Button is disable$")
    public void saveButtonIsDisable() {


subjectCategoriesContent.elementisEnabled("saveButton");

    }

//    @Then("^Check list with listname as \"([^\"]*)\" and searchtext as \"([^\"]*)\"$")
//    public void checkListWithListnameAsAndSearchtextAs(String listname, String text) {
//
//        subjectCategoriesContent.checklist(listname,text);
//
//    }

    @Then("^SubjectCategories page title control$")
    public void subjectcategoriesPageTitleControl() {


       Assert.assertTrue(subjectCategoriesContent.pageTitle.getText().contains("Subject Categories"));
    }
}
