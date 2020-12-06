package StepDefinitions;


import Pages.LeftNav_Subjects;
import Pages.ParentClass_Subject;
import Pages.Subjects_SalaryModifiers_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubjectSteps {

ParentClass_Subject parentElement =new ParentClass_Subject();
    LeftNav_Subjects leftNavSubject = new LeftNav_Subjects();
    Subjects_SalaryModifiers_Content subjectAndSalaryModifiers = new Subjects_SalaryModifiers_Content();

    @Then("^Navigate to subject page$")
    public void navigate_to_subject_page()  {

        leftNavSubject.findElementAndClickFunction("education");
        leftNavSubject.findElementAndClickFunction("setupEducation");
        leftNavSubject.findElementAndClickFunction("subject");

    }



    @Then("^Create a new Subject name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void createAnewSubjectNameAsAndCodeAs(String name, String code) throws InterruptedException {
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




    @Then("^Subject page title control$")
    public void subjectPageTitleControl() {

        subjectAndSalaryModifiers.findElementAndVerifyContainsText("subjectTitle","Subjects");
    }

    @And("^new subject error message should be displayed$")
    public void newsubjecterrorMessageShouldBeDisplayed() {

        subjectAndSalaryModifiers.findElementAndVerifyContainsText("newSubjectError","already exists.");
    }

    @Then("^user delete \"([^\"]*)\"$")
    public void userDelete(String usernameDelete) throws InterruptedException {
Thread.sleep(1000);
       subjectAndSalaryModifiers.editAndDeleteFunction(usernameDelete,"delete");

       subjectAndSalaryModifiers.findAndClickElement("yesButton");

       subjectAndSalaryModifiers.findAndClickElement("yesSubjectButton");
    }

    @When("^User edit subject the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditSubjectTheTo(String searchSubjectName, String newSubjectName)  {
        subjectAndSalaryModifiers.editAndDeleteFunction(searchSubjectName, "edit");
        subjectAndSalaryModifiers.findElementAndSendKeys("nameInput", newSubjectName);
        subjectAndSalaryModifiers.findAndClickElement("saveButton");
    }

    @Then("^Click subject activ or inactiv$")
    public void clickSubjectActivOrInactiv() {

      subjectAndSalaryModifiers.findAndClickElement("activeButton");
    }

    @Then("^When searching by subject name as \"([^\"]*)\"$")
    public void whenSearchingBySubjectNameAs(String name)  {
        subjectAndSalaryModifiers.findElementAndSendKeys("searchName",name);
        subjectAndSalaryModifiers.findAndClickElement("searchButton");

    }

    @Then("^Check list with subject listname as \"([^\"]*)\" and searchtext as \"([^\"]*)\"$")
    public void checkListWithSubjectListnameAsAndSearchtextAs(String listname, String text)  {
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


    @Then("^User not be subject deleted as \"([^\"]*)\"$")
    public void userNotBeSubjectDeletedAs(String name) throws InterruptedException {
Thread.sleep(1000);

        subjectAndSalaryModifiers.findAndClickElement("deleteSubjectButtonList");
        Thread.sleep(1000);
        subjectAndSalaryModifiers.findAndClickElement("yesButton");

    }
}
