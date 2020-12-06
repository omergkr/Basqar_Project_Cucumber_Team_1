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


    @Then("^SubjectCategorie=Create a Subject name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void subjectcategorieCreateASubjectNameAsAndCodeAs(String name, String code) {

        subjectCategoriesContent.findAndClickElement("Subject_Add");
        subjectCategoriesContent.findElementAndSendKeys("nameInput", name);
        subjectCategoriesContent.findElementAndSendKeys("codeInput", code);

        if (subjectCategoriesContent.saveButton.isEnabled())
            subjectCategoriesContent.findAndClickElement("saveButton");

    }

    @And("^And= Succes message should be displayed$")
    public void andSuccesMessageShouldBeDisplayed() {
        subjectCategoriesContent.findElementAndVerifyContainsText("msjContainer", "successfully");



    }


    @When("^SubjectCategorie=User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void subjectcategorieUserEditTheTo(String searcofSubjectName, String newSubjecName)  {


        subjectCategoriesContent.editAndDeleteFunction(searcofSubjectName, "edit");
        subjectCategoriesContent.findElementAndSendKeys("nameInput", newSubjecName);
        subjectCategoriesContent.findAndClickElement("saveButton");

    }

    @When("^SubjectCategorie=User delete the \"([^\"]*)\"$")
    public void subjectcategorieUserDeleteThe(String nameOfSubjectToDelete)  {


        subjectCategoriesContent.editAndDeleteFunction(nameOfSubjectToDelete, "Delete");
        subjectCategoriesContent.findAndClickElement("yesButton");

    }

    @And("^Add:Save Button is disable$")
    public void addSaveButtonIsDisable() {
        subjectCategoriesContent.elementisEnabled("saveButton");



    }

    @Then("^SubjectCategories page title control name$")
    public void subjectcategoriesPageTitleControlName() {

        Assert.assertTrue(subjectCategoriesContent.pageTitle.getText().contains("Subject Categories"));

    }

    @Then("^Messag should Subject Category successfully updated$")
    public void messagShouldSubjectCategorySuccessfullyUpdated() {

        subjectCategoriesContent.findElementAndVerifyContainsText("msjContainer", "successfully");


    }

    @When("^SubjectCategorie searching by  name as \"([^\"]*)\"$")
    public void subjectcategorieSearchingByNameAs(String name) {


        subjectCategoriesContent.findElementAndSendKeys("searchName",name);
        subjectCategoriesContent.findAndClickElement("searchButton");


    }

    @Then("^Should=Check list with listname as \"([^\"]*)\" and searchtext as \"([^\"]*)\"$")
    public void shouldCheckListWithListnameAsAndSearchtextAs(String listname, String text) {
        subjectCategoriesContent.checklist(listname,text);
    }

    @And("^!! Succes Error message should be displayed$")
    public void succesErrorMessageShouldBeDisplayed() {
        subjectCategoriesContent.findElementAndVerifyContainsText("msjContainer", "already ");

    }

    @When("^SubjectCategorie=Click subject categoriy activ or inactiv$")
    public void subjectcategorieClickSubjectCategoriyActivOrInactiv() {

        subjectCategoriesContent.findAndClickElement("activeButton");

    }
}

