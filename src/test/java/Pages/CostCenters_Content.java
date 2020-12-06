package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class CostCenters_Content extends ParentClass_CostCenters {


    WebElement myElement;
    WebElement currentElemet;

    public CostCenters_Content() {

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


    @FindBy(xpath = "//h3[text()='  Cost Centers ']")
    private WebElement CostCentersTittle;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;
    @FindBy(xpath = "//span[text()='Code']")
    private WebElement codeButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;
    @FindBy(xpath = "(//span[text()='Type'])[1]")
    private WebElement typeButton;
    @FindBy(xpath = "//span[text()=' Personal ']")
    private WebElement personalTypeButton;
    @FindBy(xpath = "//ms-text-field[@placeholder='COST_CENTER.FIELD.ORDER_NO']/input")
    private WebElement orderInput;
    @FindBy(xpath = "//div[@class='mat-chip-list-wrapper']/input")
    private WebElement expenseAccoutButton;
    @FindBy(xpath = "//span[text()=' 2.1 | Персонал ']")
    private WebElement expenseAccoutButton2;
    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[text()='Cost Center successfully created']")
    private WebElement costCenterSuccessfullyText;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> costcenternameList;
    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    public List<WebElement> deleteButtonList;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy (css ="div#toast-container")
    private WebElement message;
    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    public List<WebElement> editButtonList;



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
            case "codeButton":
                currentElemet = codeButton;
                break;

            case "typeButton":
                currentElemet = typeButton;
                break;
            case "personalTypeButton":
                currentElemet = personalTypeButton;
                break;
            case "expenseAccoutButton":
                currentElemet = expenseAccoutButton;
                break;
            case "expenseAccoutButton2":
                currentElemet = expenseAccoutButton2;
                break;
            case "saveButton":
                currentElemet = saveButton;
                break;

            case "yesButton":
                currentElemet = yesButton;
                break;
            case "CostCentersTittle":
                currentElemet = CostCentersTittle;
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
            case "orderInput":
                currentElemet = orderInput;
                break;




        }

        sendKeysElement(currentElemet, text);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "CostCentersTittle":
                myElement = CostCentersTittle;
                break;

            case "costCenterSuccessfullyText":
                myElement = costCenterSuccessfullyText;
                break;
            case "message":
                myElement = message;
                break;



        }

        verifyElementContainsText(myElement, msg);
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



        List<WebElement> SubjectnameList = waitVisibleListAllElement(costcenternameList);
        for (int i = 0; i < SubjectnameList.size(); i++) {
            if (SubjectnameList.get(i).getText().equalsIgnoreCase(subjectName)) {
                clickElement(btnList.get(i));
            }
        }

    }
}
