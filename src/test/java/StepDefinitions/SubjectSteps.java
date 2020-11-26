package StepDefinitions;

import Pages.LeftNavSubject;
import Pages.MainContentSubject;
import Pages.ParentClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubjectSteps {

ParentClass parentElement =new ParentClass();
    LeftNavSubject leftNav= new LeftNavSubject();
    MainContentSubject mainContent = new MainContentSubject();

    @Then("^Navigate to subject page$")
    public void navigate_to_subject_page()  {

        leftNav.findElementAndClickFunction("education");
        leftNav.findElementAndClickFunction("setupEducation");
        leftNav.findElementAndClickFunction("subject");

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
        mainContent.findAndClickElement("subjectAddButton");
        Thread.sleep(1000);
        mainContent.findElementAndSendKeys("nameInput","grup1");

        mainContent.findElementAndSendKeys("codeInput","1234");

//        mainContent.findAndClickElement("addSubjectCategoryButton");
//        Thread.sleep(1000);
//        mainContent.findElementAndSendKeys("newSubjektName", "Tester1");
//        Thread.sleep(1000);
//        mainContent.findElementAndSendKeys("newSubjektCode", "3663");
//        Thread.sleep(1000);
//        mainContent.findAndClickElement("newSubjectSaveButton");
//        Thread.sleep(1000);
//        mainContent.findAndClickElement("newSubjectCloseButton");



        mainContent.findAndClickElement("CategoryListBtn");

        mainContent.findAndClickElement("SubjectSelect");

        mainContent.findAndClickElement("StyleButton");

        mainContent.findAndClickElement("StyleSelectButton");

        mainContent.findAndClickElement("SubjectSaveButton");




//        mainContent.findAndClickElement("SubjectCloseButton");
//        Thread.sleep(1000);
    }

    @And("^Succes message should be displayed$")
    public void succesMessageShouldBeDisplayed() {
    }


    @Then("^Subject page title control$")
    public void subjectPageTitleControl() {

        mainContent.findElementAndVerifyContainsText("subjectTitle","Subjects");
    }

    @And("^error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {

        mainContent.findElementAndVerifyContainsText("newSubjectError","already exists.");
    }

    @Then("^user delete \"([^\"]*)\"$")
    public void userDelete(String usernameDelete) throws InterruptedException {

       mainContent.editAndDeleteFunction("grup1234","delete");

       mainContent.findAndClickElement("yesButton");

       mainContent.findAndClickElement("yesSubjectButton");
    }

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String searchSubjectName, String newSubjectName)  {
        mainContent.editAndDeleteFunction(searchSubjectName, "edit");
        mainContent.findElementAndSendKeys("nameInput", newSubjectName);
        mainContent.findAndClickElement("saveButton");
    }

    @Then("^Click subject activ or inactiv$")
    public void clickSubjectActivOrInactiv() {

      mainContent.findAndClickElement("activeButton");
    }

    @Then("^When searching by  name as \"([^\"]*)\"$")
    public void whenSearchingByNameAs(String name)  {
        mainContent.findElementAndSendKeys("searchName",name);
        mainContent.findAndClickElement("searchButton");

    }

    @Then("^Check list with listname as \"([^\"]*)\" and searchtext as \"([^\"]*)\"$")
    public void checkListWithListnameAsAndSearchtextAs(String listname, String text)  {
        mainContent.checklist(listname,text);
    }

    @Then("^user subject category should not be deleted$")
    public void userSubjectCategoryShouldNotBeDeleted() {
parentElement.scrollToElement(leftNav.SubjectCategoriesButton);

leftNav.findElementAndClickFunction("SubjectCategoriesButton");

    }


    @When("^When searching by Subject Category name as \"([^\"]*)\"$")
    public void whenSearchingBySubjectCategoryNameAs(String name)  {

        mainContent.findElementAndSendKeys("searchCategoryName",name);
        mainContent.findAndClickElement("searchCategoryButton");
    }



    @Then("^user not be deleted as \"([^\"]*)\"$")
    public void userNotBeDeletedAs(String name)  {
        mainContent.findAndClickElement("deleteSubjectButtonList");
        mainContent.findAndClickElement("yesSubjectButton");
    }
}
