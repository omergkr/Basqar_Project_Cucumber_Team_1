package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class Country_Content extends ParentClass_Country {

    WebElement effectiveElement;

    public Country_Content() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement goItbutton;

    @FindBy(xpath = "//ms-add-button")
    private WebElement addButton;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement inputName;

    @FindBy(xpath = "  //ms-text-field[@formcontrolname='code']/input")
    private WebElement inputCode;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement checkMessageOkey;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement checkMessageError;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement x_button;

    @FindAll({@FindBy(xpath = "//table/tbody/tr/td[2]")})
    private List<WebElement> nameList;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button")
    })
    private List<WebElement> deleteButtonList;

    @FindAll({@FindBy(xpath = "//ms-edit-button/button")})
    public List<WebElement> editButtonList;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//mat-form-field[@formgroupname='country']")

    private WebElement country_combobox;@FindAll(
            {@FindBy(xpath = "//mat-option[@role='option']")
            })
    private List<WebElement> country_allOption;







    public void find_and_click_for_element(String ElementName) {

        switch (ElementName) {
            case "loginButton":
                effectiveElement = loginButton;
                break;

            case "goItbutton":
                effectiveElement = goItbutton;
                break;

            case "addButton":
                effectiveElement = addButton;
                break;

            case "saveButton":
                effectiveElement = saveButton;
                break;

            case "x_button":
                effectiveElement = x_button;
                break;

            case "yesButton":
                effectiveElement = yesButton;
                break;

            case " country_combobox":
                effectiveElement =  country_combobox;
                break;



        }
        clickGeneralFunction(effectiveElement);

    }

    public void find_and_send_for_element(String ElementName, String value) {

        switch (ElementName) {
            case "username":
                effectiveElement = username;
                break;

            case "password":
                effectiveElement = password;
                break;

            case "inputName":
                effectiveElement = inputName;
                break;

            case "inputCode":
                effectiveElement = inputCode;
                break;

        }
        writeSendGeneralFunction(effectiveElement, value);

    }


    public void find_and_check_message_status(String element, String message) {

        switch (element) {
            case "checkMessageOkey":
                effectiveElement = checkMessageOkey;
                break;

            case "checkMessageError":
                effectiveElement = checkMessageError;
                break;

        }
        verify_element_contains_text(effectiveElement, message);

    }

    public void delete_or_edit_method(String incoming_name, String operation_name) {

        if (checkMessageOkey.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(checkMessageOkey));


        List<WebElement> buttonList = new ArrayList<>();

        if (operation_name.equalsIgnoreCase("delete"))
            buttonList = (deleteButtonList);
        else
            buttonList = editButtonList;


        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).getText().equalsIgnoreCase(incoming_name))
                clickGeneralFunction(buttonList.get(i));


        }
    }

    public void select_combobox_variable ( String incoming_variable) {


        for (WebElement option:country_allOption
             ) {

            if (option.getText().contains(incoming_variable)) {
                clickGeneralFunction(option);

                break;
            }
        }
    }
}

