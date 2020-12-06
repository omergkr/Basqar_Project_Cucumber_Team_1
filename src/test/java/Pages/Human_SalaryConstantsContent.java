package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Human_SalaryConstantsContent extends ParentClass {


    WebElement currentElemet;
    List<WebElement> currentList;

    public Human_SalaryConstantsContent() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement Setup;
    @FindBy(xpath = "(//span[text()='Salary Constants'])[1]")
    private WebElement salary_Constants;


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement salaryCostansName;
    @FindBy(xpath = "//input[@data-placeholder='Valid From']")
    private WebElement salaryCValidFrom;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='key']/input")
    private WebElement salaryCostansKey;
    @FindBy(css = "ms-integer-field[formcontrolname='value']>input")
    private WebElement salaryCostansValue;

    @FindBy(xpath = "//h3[text()='  Salary Constants ']")
    public WebElement pageTitle;


    @FindBy(xpath = "//input[@id='mat-input-7']")
    public WebElement dayOfMonth;

    @FindBy(xpath = "(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[5]")
    public WebElement DateTAG;
    //   @FindBy(xpath = "((//span[@class='mat-button-wrapper'])[28]")
//   // @FindBy(xpath ="(//ms-save-button//button")
//    public WebElement saveButton;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;
    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;


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


    @FindBy(css = "input[matinput]")
    public WebElement searchName;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']")
    private WebElement searchButton;


    @FindAll({
            @FindBy(xpath = "//td[@class='mat-cell cdk-cell cdk-column-name mat-column-name ng-tns-c348-75 ng-star-inserted']")
    })
    public List<WebElement> namelist;


    public void findAndClickElement(String elementName) {

        switch (elementName) {

            case "humanResources":
                currentElemet = humanResources;
                break;

            case "Setup":
                currentElemet = Setup;
                break;


            case "salary_Constants":
                currentElemet = salary_Constants;
                break;

            case "addButton":
                currentElemet = addButton;
                break;

            case "dayOfMonth":
                currentElemet = dayOfMonth;
                break;


//
//            case "saveButton":
//                currentElemet = saveButton;
//                break;
            case "saveButton":
                currentElemet = saveButton;
                break;


            case "yesButton":
                currentElemet = yesButton;
                break;


            case "searchButton":
                currentElemet = searchButton;
                break;

            case "salaryCostansName":
                currentElemet = salaryCostansName;
                break;

            case "DateTAG":
                currentElemet = DateTAG;
                break;


        }

        clickElement(currentElemet);
    }


    public void findElementAndSendKeys(String elementName, String text) {


        switch (elementName) {


            case "salaryCostansName":
                currentElemet = salaryCostansName;
                break;

            case "salaryCValidFrom":
                currentElemet = salaryCValidFrom;
                break;

            case "salaryCostansKey":
                currentElemet = salaryCostansKey;
                break;


            case "salaryCostansValue":
                currentElemet = salaryCostansValue;
                break;

            case "dayOfMonth":
                currentElemet = dayOfMonth;
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


        }
        verifyElementContainsText(currentElemet, msg);


    }

    public void checklist(String elementName, String text) {

        switch (elementName) {

            case "namelist":
                currentList = namelist;
                break;


        }
        boolean control = true;


        if (currentList.size() != 0) {
            for (WebElement element : currentList) {
                if (!element.getText().contains(text)) {

                    control = false;
                    break;
                }
            }
            Assert.assertTrue(control);

        }


    }


    public void editAndDeleteFunction(String subjectName, String editorDelete) {

        if (msjContainers.size() > 0) {
            if (msjContainer.isDisplayed())
                wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
        }


        List<WebElement> btnList = new ArrayList<>();

        if (editorDelete.equalsIgnoreCase("delete"))
            btnList = waitVisibleListAllElement(deleteButtonList);
        else
            btnList = waitVisibleListAllElement(editButtonList);


        List<WebElement> SubjectnameList = waitVisibleListAllElement(subjectnameList);
        for (int i = 0; i < SubjectnameList.size(); i++) {
            if (SubjectnameList.get(i).getText().equalsIgnoreCase(subjectName)) {
                clickElement(btnList.get(i));
            }


        }


    }
}






