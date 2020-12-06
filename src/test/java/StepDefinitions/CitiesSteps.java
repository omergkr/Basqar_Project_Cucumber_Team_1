package StepDefinitions;

import Pages.Cities_Content;
import Pages.Country_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CitiesSteps {
    Cities_Content citiesContent = new Cities_Content();
    Country_Content countryContent = new Country_Content();

    @And("^Select cities page$")
    public void selectCitiesPage() {

        citiesContent.find_and_click_for_element("setup");
        citiesContent.find_and_click_for_element("parameters");
        citiesContent.find_and_click_for_element("cities");
    }


    @Then("^Enter new City slect Country \"([^\"]*)\" and city Name \"([^\"]*)\" Save click$")
    public void enterNewCitySlectCountryAndCityNameSaveClick(String incoming_countryName, String incoming_cityName)  {

        countryContent.find_and_click_for_element(" country_combobox");
        countryContent.select_combobox_variable(incoming_countryName);
        countryContent.find_and_send_for_element("inputName",incoming_cityName);
        countryContent.find_and_click_for_element("saveButton");





    }

    @And("^Select citiess page$")
    public void selectCitiessPage() {
        citiesContent.find_and_click_for_element("cities");
    }

}
