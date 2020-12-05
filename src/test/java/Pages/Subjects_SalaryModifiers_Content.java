package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class Subjects_SalaryModifiers_Content extends ParentClass_Subject {


    WebElement currentElement;
    WebElement myElement;
List<WebElement> currentList;

    public Subjects_SalaryModifiers_Content() {

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindBy(xpath = "//h3[text()='  Subjects ']")
    private WebElement subjectTitle;


    @FindBy(xpath = "//ms-add-button//button")
    private WebElement subjectAddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;


    @FindBy(xpath = "(//span[text()='Subject Category'])[1]")
    private WebElement CategoryListBtn;

    @FindBy(xpath = "(//span[@class='mat-option-text'])")
    private WebElement SubjectSelect;

    @FindBy(id = "mat-select-value-11")
    private WebElement StyleButton;

    @FindBy(xpath = "(//span[@class='mat-option-text'])")
    private WebElement StyleSelectButton;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement SubjectSaveButton;

    @FindBy(xpath = "//button[@aria-describedby='cdk-describedby-message-17'])[1]")
    private WebElement SubjectCloseButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement newSubjectError;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> nameList;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    public List<WebElement> deleteButtonList;
    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    public List<WebElement> editButtonList;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;


    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy (xpath="//div[@class='mat-slide-toggle-thumb']")
    public WebElement activeButton;


    @FindBy (xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchName;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;


    @FindAll({
            @FindBy(xpath = "//td[@class='mat-cell cdk-cell cdk-column-name mat-column-name ng-tns-c348-75 ng-star-inserted']")
    })
    public List<WebElement> namelist;




    @FindBy (xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchCategoryName;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchCategoryButton;


    @FindBy(xpath = "//ms-delete-button/button")
    public WebElement deleteSubjectButtonList;


    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesSubjectButton;


//>>>>>>>>>>>>>>>>>>>>>>>>SalaryModifiers<<<<<<<<<<<<<<<<<<<<
@FindBy(xpath = "//h3[text()='  Salary Modifiers ']")
private WebElement salaryModfTitle;


    @FindBy(xpath = "//ms-add-button//button")
    private WebElement salryMdfAddButton;


    @FindBy(xpath = "//input[@formcontrolname ='description']")
    private WebElement descrptionAdd;


    @FindBy(xpath = "//input[@formcontrolname ='variable']")
    private WebElement variableAdd;

    @FindBy(xpath = "//mat-select[@formcontrolname ='modifierType']")
    private WebElement modifierTypeBtn;

    @FindBy(xpath = "(//div//mat-option)[1]")
    private WebElement modfTypeSelect;

    @FindBy(xpath = "//input[@name='integrationCode']")
    private WebElement integrationCodeAdd;


    @FindBy(xpath = "//input[@formcontrolname ='priority']")
    private WebElement priorityAdd;

    @FindBy(xpath = "//ms-currency-field//input")
    private WebElement amountAdd;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement salaryModifersSaveBtn;

    @FindBy(xpath = "//ms-delete-button/button")
    public WebElement deleteSalryMdfBtn;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesSalryMdfBtn;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    private WebElement EditSalryMdfBtn;

    @FindBy(xpath = "(//mat-form-field//input)[1]")
    private WebElement searchDescription;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchDescrBtn;



    public void findAndClickElement(String elementName) {

        switch (elementName) {

            case "loginButton":
                currentElement = loginButton;
                break;

            case "gotItButton":
                currentElement = gotItBtn;
                break;


            case "subjectAddButton":
                currentElement = subjectAddButton;
                break;


            case "CategoryListBtn":
                currentElement = CategoryListBtn;
                break;

            case "SubjectSelect":
                currentElement = SubjectSelect;
                break;

            case "StyleButton":
                currentElement = StyleButton;
                break;

            case "StyleSelectButton":
                currentElement = StyleSelectButton;
                break;

            case "SubjectSaveButton":
                currentElement = SubjectSaveButton;
                break;

            case "SubjectCloseButton":
                currentElement = SubjectCloseButton;
                break;
            case "yesButton":
                currentElement = yesButton;
                break;

            case "saveButton":
                currentElement = saveButton;
                break;

            case "activeButton":
                currentElement = activeButton;
                break;

            case "searchButton":
                currentElement = searchButton;
                break;



            case "searchCategoryButton":
                currentElement = searchCategoryButton;
                break;

            case "deleteSubjectButtonList":
                currentElement = deleteSubjectButtonList;
                break;

            case "yesSubjectButton":
                currentElement = yesSubjectButton;


            case "salryMdfAddButton":
                currentElement = salryMdfAddButton;
                break;


            case "modifierTypeBtn":
                currentElement = modifierTypeBtn;
                break;

            case "modfTypeSelect":
                currentElement = modfTypeSelect;
                break;


            case "amountAdd":
                currentElement = amountAdd;
                break;

            case "salaryModifersSaveBtn":
                currentElement = salaryModifersSaveBtn;
                break;

            case "deleteSalryMdfBtn":
                currentElement = deleteSalryMdfBtn;
                break;

            case "yesSalryMdfBtn":
                currentElement = yesSalryMdfBtn;
                break;

            case "EditSalryMdfBtn":
                currentElement = EditSalryMdfBtn;
                break;

            case "searchDescrBtn":
                currentElement = searchDescrBtn;
                break;
        }
        clickFunction(currentElement);
    }


    public void findElementAndSendKeys(String elementName, String text) {

        switch (elementName) {

            case "username":
                currentElement = username;
                break;

            case "password":
                currentElement = password;
                break;

            case "nameInput":
                currentElement = nameInput;
                break;


            case "codeInput":
                currentElement = codeInput;
                break;

            case "searchName":
                currentElement = searchName;
                break;

            case "searchCategoryName":
                currentElement = searchCategoryName;
                break;


            case "descrptionAdd":
                currentElement = descrptionAdd;
                break;

            case "variableAdd":
                currentElement = variableAdd;
                break;

            case "integrationCodeAdd":
                currentElement = integrationCodeAdd;
                break;

            case "priorityAdd":
                currentElement = priorityAdd;
                break;

            case "amountAdd":
                currentElement = amountAdd;
                break;

            case "searchDescription":
                currentElement = searchDescription;
                break;


        }

        sendKeysFunction(currentElement, text);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "subjectTitle":
                myElement = subjectTitle;
                break;

            case "newSubjectError":
                myElement = newSubjectError;
                break;

            case "salaryModfTitle":
                myElement = salaryModfTitle;
                break;

        }

        verifyElementContainsText(myElement, msg);
    }


    public void checklist(String elementName,String text) {

        switch (elementName) {

            case "namelist":
                currentList = namelist;
                break;


        }
        boolean control= true;


        if (currentList.size()!=0){
            for ( WebElement element : currentList) {
                if (!element.getText().contains(text)) {

                    control = false;
                    break;
                }
            }
            Assert.assertTrue(control);

        }


    }

   
    public  void editAndDeleteFunction(String subjectName,String editorDelete) {

        if (msjContainers.size() > 0) {
            if (newSubjectError.isDisplayed())
                wait.until(ExpectedConditions.invisibilityOfAllElements(newSubjectError));
        }


        List<WebElement> btnList;

        if (editorDelete.equalsIgnoreCase("delete"))
            btnList = waitVisibleListAllElement(deleteButtonList);
        else
            btnList = waitVisibleListAllElement(editButtonList);




        List<WebElement> nameListNew = waitVisibleListAllElement(nameList);
        for (int i = 0; i < nameListNew.size(); i++) {
            if (nameListNew.get(i).getText().equalsIgnoreCase(subjectName)) {
                clickFunction(btnList.get(i));
            }
        }
    }

}

