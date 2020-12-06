package StepDefinitions;

import Pages.Human_SalaryConstantsContent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Human_SalaryConstantsContentSteps {

    Human_SalaryConstantsContent human = new Human_SalaryConstantsContent();

    @When("^HumannResources click on element with nameeE$")
    public void humannresourcesClickOnElementWithNameeE() {





        human.findAndClickElement("humanResources");
        human.findAndClickElement("Setup");
        human.findAndClickElement("salary_Constants");
    }


    @Then("^Human_Salary Constants page title controlLL$")
    public void human_salaryConstantsPageTitleControlLL() {

        Assert.assertTrue(human.pageTitle.getText().contains("Salary Constants"));
    }

    @When("^When User Create a SalaryCostans  name as \"([^\"]*)\" short name as \"([^\"]*)\" name s \"([^\"]*)\"name as Date sende as \"([^\"]*)\"$")
    public void whenUserCreateASalaryCostansNameAsShortNameAsNameSNameAsDateSendeAs(String arg0, String arg1, String arg2,String arg3) {


        human.findAndClickElement("addButton");
        human.findElementAndSendKeys("salaryCostansName", arg0);


        human.findElementAndSendKeys("salaryCostansKey", arg1);
        human.findElementAndSendKeys("salaryCostansValue", arg2);

        human.findAndClickElement("dayOfMonth");
        human.findAndClickElement("DateTAG");
        human.findAndClickElement("saveButton");




    }

    @Then("^User Edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String searcOfHumanName, String newHumanName) {
        human.editAndDeleteFunction(searcOfHumanName, "edit");
        human.findElementAndSendKeys("salaryCostansName", newHumanName);
        human.findAndClickElement("saveButton");





    }

    @And("^Messag:Succes message should be displayed$")
    public void messagSuccesMessageShouldBeDisplayed() {

        human.findElementAndVerifyContainsText("msjContainer","successfully");

    }



    @Then("^User Delet the \"([^\"]*)\"$")
    public void userDeletThe(String HumanNameDelete)  {

        human.findElementAndSendKeys("searchName",HumanNameDelete);
        human.findAndClickElement("searchButton");
        human.editAndDeleteFunction(HumanNameDelete,"Delete");
        human.findAndClickElement("yesButton");



    }

    @When("^searching by  name as \"([^\"]*)\"$")
    public void searchingByNameAs(String name)  {


        human.findElementAndSendKeys("searchName",name);
        human.findAndClickElement("searchButton");

    }

    @Then("^Check list with SaCOlistname as \"([^\"]*)\" and searchtext as \"([^\"]*)\"$")
    public void checkListWithSaCOlistnameAsAndSearchtextAs(String listname, String text)  {

      human.checklist(listname,text);
    }
}




