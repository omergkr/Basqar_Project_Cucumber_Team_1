package StepDefinitions;

import Pages.LeftNavSubject;
import Pages.ParentClassSubject;
import Pages.SubjectAndSalaryModifiers;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubjectSteps {

ParentClassSubject parentElement =new ParentClassSubject();
    LeftNavSubject leftNavSubject = new LeftNavSubject();
    SubjectAndSalaryModifiers subjectAndSalaryModifiers = new SubjectAndSalaryModifiers();

    @Then("^Navigate to subject page$")
    public void navigate_to_subject_page()  {

        leftNavSubject.findElementAndClickFunction("education");
        leftNavSubject.findElementAndClickFunction("setupEducation");
        leftNavSubject.findElementAndClickFunction("subject");

    }



    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {




    }


    @When("^click on element with name$")
    public void clickOnElementWithName() {
    }

    @Then("^Create a Subject name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void createASubjectNameAsAndCodeAs(String name, String code) throws InterruptedException {
Thread.sleep(1000);
        subjectAndSalaryModifiers.findAndClickElement("subjectAddButton");
        Thread.sleep(1000);
        subjectAndSalaryModifiers.findElementAndSendKeys("nameInput","grup1");

        subjectAndSalaryModifiers.findElementAndSendKeys("codeInput","1234");

        subjectAndSalaryModifiers.findAndClickElement("CategoryListBtn");

        subjectAndSalaryModifiers.findAndClickElement("SubjectSelect");

        subjectAndSalaryModifiers.findAndClickElement("StyleButton");

        subjectAndSalaryModifiers.findAndClickElement("StyleSelectButton");

        subjectAndSalaryModifiers.findAndClickElement("SubjectSaveButton");


    }

    @And("^Succes message should be displayed$")
    public void succesMessageShouldBeDisplayed() {
    }


    @Then("^Subject page title control$")
    public void subjectPageTitleControl() {

        subjectAndSalaryModifiers.findElementAndVerifyContainsText("subjectTitle","Subjects");
    }

    @And("^error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {

        subjectAndSalaryModifiers.findElementAndVerifyContainsText("newSubjectError","already exists.");
    }

    @Then("^user delete \"([^\"]*)\"$")
    public void userDelete(String usernameDelete) {

       subjectAndSalaryModifiers.editAndDeleteFunction("grup1","delete");

       subjectAndSalaryModifiers.findAndClickElement("yesButton");

       subjectAndSalaryModifiers.findAndClickElement("yesSubjectButton");
    }

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String searchSubjectName, String newSubjectName)  {
        subjectAndSalaryModifiers.editAndDeleteFunction(searchSubjectName, "edit");
        subjectAndSalaryModifiers.findElementAndSendKeys("nameInput", newSubjectName);
        subjectAndSalaryModifiers.findAndClickElement("saveButton");
    }

    @Then("^Click subject activ or inactiv$")
    public void clickSubjectActivOrInactiv() {

      subjectAndSalaryModifiers.findAndClickElement("activeButton");
    }

    @Then("^When searching by  name as \"([^\"]*)\"$")
    public void whenSearchingByNameAs(String name)  {
        subjectAndSalaryModifiers.findElementAndSendKeys("searchName",name);
        subjectAndSalaryModifiers.findAndClickElement("searchButton");

    }

    @Then("^Check list with listname as \"([^\"]*)\" and searchtext as \"([^\"]*)\"$")
    public void checkListWithListnameAsAndSearchtextAs(String listname, String text)  {
        subjectAndSalaryModifiers.checklist(listname,text);
    }

    @Then("^user subject category should not be deleted$")
    public void userSubjectCategoryShouldNotBeDeleted() {
parentElement.scrollToElement(leftNavSubject.SubjectCategoriesButton);

leftNavSubject.findElementAndClickFunction("SubjectCategoriesButton");

    }


    @When("^When searching by Subject Category name as \"([^\"]*)\"$")
    public void whenSearchingBySubjectCategoryNameAs(String name)  {

        subjectAndSalaryModifiers.findElementAndSendKeys("searchCategoryName",name);
        subjectAndSalaryModifiers.findAndClickElement("searchCategoryButton");
    }



    @Then("^user not be deleted as \"([^\"]*)\"$")
    public void userNotBeDeletedAs(String name)  {
        subjectAndSalaryModifiers.findAndClickElement("deleteSubjectButtonList");
        subjectAndSalaryModifiers.findAndClickElement("yesSubjectButton");
    }
}
