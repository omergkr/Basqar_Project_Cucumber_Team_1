package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SubjectCategories_Content extends ParentClass {


    WebElement currentElemet;
    List<WebElement> currentList;

    public SubjectCategories_Content() {

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

    // Todo 03
    @FindBy(xpath = "//span[text()='Education']")
    private WebElement Education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement Setup;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    private WebElement Subject_Categories;

    @FindBy(xpath = "//ms-add-button[@tooltip='SUBJECT_CATEGORIES.TITLE.ADD']")
    private WebElement Subject_Add;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveButton;


    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;



    @FindBy(xpath = " //div[@role='alertdialog']")
    private WebElement ErrorMessage;

    //TODO Edit und Delet
    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> subjectnameList;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    public List<WebElement> deleteButtonList;


    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    public List<WebElement> editButtonList;


    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;


    @FindBy (xpath="//div[@class='mat-slide-toggle-thumb-container']")
    public WebElement activeButton;


    @FindBy (xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchName;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;


    @FindAll({
            @FindBy(xpath = "//td[@class='mat-cell cdk-cell cdk-column-name mat-column-name ng-tns-c348-75 ng-star-inserted']")
    })
    public List<WebElement> namelist;


    @FindBy(xpath = "//h3[text()='  Subject Categories ']")
    public WebElement pageTitle;


    public void findAndClickElement(String elementName) {

        switch (elementName) {

            case "loginButton":
                currentElemet = loginButton;
                break;

            case "gotItButton":
                currentElemet = gotItButton;
                break;

            case "Education":
                currentElemet = Education;
                break;

            case "Setup":
                currentElemet = Setup;
                break;


            case "Subject_Categories":
                currentElemet = Subject_Categories;
                break;


            case "Subject_Add":
                currentElemet = Subject_Add;
                break;


            case "saveButton":
                currentElemet = saveButton;
                break;

            case "yesButton":
                currentElemet = yesButton;
                break;

            case "activeButton":
                currentElemet = activeButton;
                break;

            case "searchButton":
                currentElemet = searchButton;
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

            case "codeInput":
                currentElemet = codeInput;
                break;


            case "searchName":
                currentElemet = searchName;
                break;

        }

        sendKeysElement(currentElemet, text);
    }

    public void findElementAndVerifyContainsText(String TextName, String msg) {

        switch (TextName) {

            case "msjContainer":
                currentElemet = msjContainer;
                break;

            case "ErrorMessage":
                currentElemet = ErrorMessage;
                break;

        }
        verifyElementContainsText(currentElemet, msg);
    }


    public void elementisEnabled(String elementName) {

        switch (elementName) {

            case "saveButton":
                currentElemet = saveButton;
                break;


        }

        Assert.assertFalse(currentElemet.isEnabled());//Save buttonu gözüküp gözükmedigini kontrol ediyoruz


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

    public  void editAndDeleteFunction(String subjectName,String editorDelete){

        if (msjContainers.size()>0) {
            if (msjContainer.isDisplayed())
                wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
        }


        List<WebElement> btnList= new ArrayList<>();

        if (editorDelete.equalsIgnoreCase("delete"))
         btnList=waitVisibleListAllElement(deleteButtonList);
        else
            btnList=waitVisibleListAllElement(editButtonList);



        List<WebElement> SubjectnameList = waitVisibleListAllElement(subjectnameList);
        for (int i = 0; i < SubjectnameList.size(); i++) {
            if (SubjectnameList.get(i).getText().equalsIgnoreCase(subjectName)) {
                clickElement(btnList.get(i));
            }
        }

    }




}


