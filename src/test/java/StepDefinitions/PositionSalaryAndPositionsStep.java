package StepDefinitions;

import Pages.PositionSalary_Positions_BankAccounts_Content;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class PositionSalaryAndPositionsStep {


    PositionSalary_Positions_BankAccounts_Content mainContent=new PositionSalary_Positions_BankAccounts_Content();

    @When("^click on button with button name$")
    public void clickOnButtonWithButtonName(DataTable elements) throws InterruptedException {

        List<String> elementstoClick = elements.asList(String.class);
        for (String n : elementstoClick) {
            System.out.println(n);
            mainContent.findAndClickElement(n);

            Thread.sleep(3000);

        }
    }

        @Then("^page validation$")
        public void pageValidation (DataTable elements) {

            List<List<String>>  elementsNameAndValue=elements.asLists(String.class);

            for (int i = 0; i <elementsNameAndValue.size() ; i++) {

                System.out.println(elementsNameAndValue.get(i).get(0));
                System.out.println(elementsNameAndValue.get(i).get(1));
                mainContent.findElementAndVerifyContainsText(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));

            }



        }

    @Then("^Send text with inputbox name$")
    public void sendTextWithInputboxName(DataTable elements) {

        List<List<String>>  elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i <elementsNameAndValue.size() ; i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));
            System.out.println(elementsNameAndValue.get(i).get(1));
            mainContent.findElementAndSendKeys(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));

        }



    }

    @Then("^Control to verification message$")
    public void controlToVerificationMessage(DataTable elements) {

        List<List<String>>  elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i <elementsNameAndValue.size() ; i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));
            System.out.println(elementsNameAndValue.get(i).get(1));
            mainContent.findElementAndVerifyContainsText(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));

        }



    }

    @And("^Check that the button is visible$")
    public void checkThatTheButtonIsVisible(DataTable elements) {
        List<String> elementstoClick = elements.asList(String.class);
        for (String n : elementstoClick) {
            System.out.println(n);
            mainContent.buttonisEnabled(n);


        }



    }

    @And("^Click on an icon in a List$")
    public void clickOnAnIconInAList(DataTable elements) {

        List<List<String>>  elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i <elementsNameAndValue.size() ; i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));
            System.out.println(elementsNameAndValue.get(i).get(1));
            mainContent.click_on_an_Element_in_a_ListWithindex(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));

        }


    }

    @Then("^check to list with input text$")
    public void checkToListWithInputText(DataTable elements) {

        List<List<String>>  elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i <elementsNameAndValue.size() ; i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));
            System.out.println(elementsNameAndValue.get(i).get(1));
            mainContent.check_if_the_Elements_in_theListContainText(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));

        }

    }
}
