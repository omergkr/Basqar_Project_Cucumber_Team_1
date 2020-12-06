package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class SalaryTypes_Content extends ParentClass_SalaryTypes {


    WebElement myElement;
    WebElement currentElemet;

    public SalaryTypes_Content() {

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "mat-input-0")
    private WebElement username;


    @FindBy(id = "mat-input-1")
    private WebElement password;


    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[text()='Got it!']")
    private WebElement gotItButton;


    @FindBy(xpath = "//h3[text()='  Salary Types ']")
    private WebElement SalaryTypesTittle;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    //ms-text-field[@formcontrolname='name']/inpu





    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;


    @FindBy(xpath = "//input[@role='combobox']")
    private WebElement userType;

    @FindBy(xpath = "//span[text()=' Administrator ']")
    private WebElement AdministratorButton;
    @FindBy(xpath = "//mat-icon[text()='cancel']")
    private WebElement cancelButton;


    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[text()='Salary Type successfully created']")
    private WebElement successfullytext;
    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement errorMessage;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> nameList;


    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    public List<WebElement> deleteButtonList;
    @FindBy(xpath = "(//ms-delete-button/button)[3]")
    public WebElement deleteButton;
    @FindBy(xpath = "//div[text()='Salary Type successfully deleted']")
    private WebElement deleteSuccessMessage;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    public List<WebElement> editButtonList;
    @FindBy(xpath = "(//ms-edit-button/button)[4]")
    public WebElement editButton;



    @FindBy(xpath = "//div[text()='Salary Type successfully updated']")
    private WebElement editSuccessMessage;

    @FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb-container'])[4]")
    public WebElement activeButton;
    @FindBy(xpath = "//div[text()='Salary Type successfully updated']")
    private WebElement activeSuccessMessage;


    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;


    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement newSalaryTypesError;


    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;


    public void findAndClickElement(String elementName) {

        switch (elementName) {

            case "loginButton":
                currentElemet = loginButton;
                break;

            case "gotItButton":
                currentElemet = gotItButton;
                break;

            case "addButton":
                currentElemet = addButton;
                break;
            case "userType":
                currentElemet = userType;
                break;
            case "AdministratorButton":
                currentElemet = AdministratorButton;
                break;
            case "cancelButton":
                currentElemet = cancelButton;
                break;


            case "saveButton":
                currentElemet = saveButton;
                break;
            case "SalaryTypesTittle":
                currentElemet = SalaryTypesTittle;
                break;
            case "yesButton":
                currentElemet = yesButton;
                break;


            case "deleteButton":
                currentElemet = deleteButton;
                break;
            case "editButton":
                currentElemet = editButton;
                break;


            case "activeButton":
                currentElemet = activeButton;
                break;


        }

        clickElement(currentElemet);
    }


    public void findElementAndSendKeys(String elementName, String text) {

        switch (elementName) {

            case "username":
                currentElemet = username;
                break;

            case "password":
                currentElemet = password;
                break;
            case "nameInput":
                currentElemet = nameInput;
                break;


        }

        sendKeysElement(currentElemet, text);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {


            case "successfullytext":
                myElement = successfullytext;
                break;
            case "SalaryTypesTittle":
                myElement = SalaryTypesTittle;
                break;
            case "errorMessage":
                myElement = errorMessage;
                break;
            case "deleteSuccessMessage":
                myElement = deleteSuccessMessage;
                break;
            case "editSuccessMessage":
                myElement = editSuccessMessage;
                break;
            case "activeSuccessMessage":
                myElement = activeSuccessMessage;
                break;


        }

        verifyElementContainsText(myElement, msg);
    }

    public void editAndDeleteFunction(String subjectName, String editorDelete) {

        if (msjContainers.size() > 0) {
            if (newSalaryTypesError.isDisplayed())
                wait.until(ExpectedConditions.invisibilityOfAllElements(newSalaryTypesError));
        }


        List<WebElement> btnList;

        if (editorDelete.equalsIgnoreCase("delete"))
            btnList = waitVisibleListAllElement(deleteButtonList);
        else
            btnList = waitVisibleListAllElement(editButtonList);


        List<WebElement> nameListNew = waitVisibleListAllElement(nameList);
        for (int i = 0; i < nameListNew.size(); i++) {
            if (nameListNew.get(i).getText().equalsIgnoreCase(subjectName)) {
                clickElement(btnList.get(i));
            }
        }


    }


}
