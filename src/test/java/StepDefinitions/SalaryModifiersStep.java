package StepDefinitions;

import Pages.LeftNavSubject;
import Pages.ParentClassSubject;
import Pages.SubjectAndSalaryModifiers;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SalaryModifiersStep {
    ParentClassSubject parentElement =new ParentClassSubject();
    LeftNavSubject leftNavSubject = new LeftNavSubject();
    SubjectAndSalaryModifiers subjectAndSalaryModifiers = new SubjectAndSalaryModifiers();




    @And("^Navigate to salary modifiers page$")
    public void navigateToSalaryModifiersPage() {


        leftNavSubject.findElementAndClickFunction("humanButton");
        leftNavSubject.findElementAndClickFunction("humanSetupButton");
        leftNavSubject.findElementAndClickFunction("SalaryModfButton");
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
