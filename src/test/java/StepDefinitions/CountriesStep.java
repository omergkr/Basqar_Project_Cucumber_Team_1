package StepDefinitions;

import Pages.Cities_Content;
import Pages.Country_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CountriesStep {

    Cities_Content citiesContent = new Cities_Content();
    Country_Content countryContent = new Country_Content();



    @And("^Select countries page$")
    public void selectCountriesPage() {

        citiesContent.find_and_click_for_element("setup");
        citiesContent.find_and_click_for_element("parameters");
        citiesContent.find_and_click_for_element("countries");





    }


    @When("^Add new$")
    public void addNew() {
        countryContent.find_and_click_for_element("addButton");
    }

    @Then("^Create new country name \"([^\"]*)\" and  code \"([^\"]*)\"$")
    public void createNewCountryNameAndCode(String incoming_countryname, String incoming_countrycode)  {

        countryContent.find_and_send_for_element("inputName",incoming_countryname);
        countryContent.find_and_send_for_element("inputCode",incoming_countrycode);
        countryContent.find_and_click_for_element("saveButton");



    }

    @And("^Check for successful or Error$")
    public void checkForSuccessfulOrError() {
        countryContent.find_and_check_message_status("checkMessageOkey","successfully ");
    }

    @And("^check for \"([^\"]*)\"$")
    public void checkFor(String incoming_message)  {
        countryContent.find_and_check_message_status("checkMessageOkey",incoming_message);



    }

    @And("^close dialog window$")
    public void closeDialogWindow() {
        countryContent.find_and_click_for_element("x_button");

    }

    @When("^Deletion process \"([^\"]*)\"$")
    public void deletionProcess(String incoming_nameToDelete)  {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        countryContent.delete_or_edit_method(incoming_nameToDelete,"delete");
        countryContent.find_and_click_for_element("yesButton");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @When("^Edit process old_name \"([^\"]*)\" new_name \"([^\"]*)\"$")
    public void editProcessOld_nameNew_name(String incoming_altName, String incoming_newName)  {

        countryContent.delete_or_edit_method(incoming_altName,"edit");
        countryContent.find_and_send_for_element("inputName",incoming_newName);
        countryContent.find_and_click_for_element("saveButton");

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }


    @Then("^Select countriess page$")
    public void selectCountriessPage() {
        citiesContent.find_and_click_for_element("countries");

    }
}
