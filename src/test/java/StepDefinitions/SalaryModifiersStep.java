package StepDefinitions;

import Pages.LeftNav_Subjects;
import Pages.ParentClass_Subject;
import Pages.Subjects_SalaryModifiers_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SalaryModifiersStep {
    ParentClass_Subject parentElement =new ParentClass_Subject();
    LeftNav_Subjects leftNavSubjects = new LeftNav_Subjects();
    Subjects_SalaryModifiers_Content subjectAndSalaryModifiers = new Subjects_SalaryModifiers_Content();




    @And("^Navigate to salary modifiers page$")
    public void navigateToSalaryModifiersPage() {


        leftNavSubjects.findElementAndClickFunction("humanButton");
        leftNavSubjects.findElementAndClickFunction("humanSetupButton");
        leftNavSubjects.findElementAndClickFunction("SalaryModfButton");
    }

    @Then("^Salary Modifiers page title control$")
    public void salaryModifiersPageTitleControl() {

        subjectAndSalaryModifiers.findElementAndVerifyContainsText("salaryModfTitle","Salary Modifiers");
    }


    @Then("^Create a Salary modifiers$")
    public void createASalaryModifiers() throws InterruptedException {
        Thread.sleep(1000);
        subjectAndSalaryModifiers.findAndClickElement("salryMdfAddButton");

        subjectAndSalaryModifiers.findElementAndSendKeys("descrptionAdd","ctn");

        subjectAndSalaryModifiers.findElementAndSendKeys("variableAdd","0863");

        subjectAndSalaryModifiers.findAndClickElement("modifierTypeBtn");

        subjectAndSalaryModifiers.findAndClickElement("modfTypeSelect");

        subjectAndSalaryModifiers.findElementAndSendKeys("integrationCodeAdd","36633");

        subjectAndSalaryModifiers.findElementAndSendKeys("priorityAdd","6346");

        subjectAndSalaryModifiers.findElementAndSendKeys("amountAdd","1986");
        subjectAndSalaryModifiers.findAndClickElement("salaryModifersSaveBtn");


    }

    @Then("^delete Salary Modifiers$")
    public void deleteSalaryModifiers() {
       subjectAndSalaryModifiers.findAndClickElement("deleteSalryMdfBtn");
        subjectAndSalaryModifiers.findAndClickElement("yesSalryMdfBtn");

    }




    @Then("^Edit Salary Modifiers$")
    public void editSalaryModifiers() throws InterruptedException {
        subjectAndSalaryModifiers.findAndClickElement("EditSalryMdfBtn");

        subjectAndSalaryModifiers.findElementAndSendKeys("descrptionAdd","ctntprk");

        subjectAndSalaryModifiers.findElementAndSendKeys("variableAdd","6363");

        subjectAndSalaryModifiers.findAndClickElement("modifierTypeBtn");

        subjectAndSalaryModifiers.findAndClickElement("modfTypeSelect");

        subjectAndSalaryModifiers.findElementAndSendKeys("integrationCodeAdd","9632");

        subjectAndSalaryModifiers.findElementAndSendKeys("priorityAdd","4663");

        subjectAndSalaryModifiers.findElementAndSendKeys("amountAdd","1907");
        Thread.sleep(1000);

        subjectAndSalaryModifiers.findAndClickElement("salaryModifersSaveBtn");

    }

    @Then("^search by description  Salary Modifiers$")
    public void searchByDescriptionSalaryModifiers() {

        subjectAndSalaryModifiers.findElementAndSendKeys("searchDescription","ctn");
        subjectAndSalaryModifiers.findAndClickElement("searchDescrBtn");



    }



}
