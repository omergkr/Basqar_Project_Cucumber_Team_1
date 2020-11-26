package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class Excel_Template_Content extends ParentExcelTemplate {


    WebElement currentElement;
    List<WebElement> currentList;

    public Excel_Template_Content() {

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[text()='Got it!']")
    public WebElement gotItButton;

    //TODO
    @FindBy (xpath = " //ms-add-button[contains(@tooltip,'.ADD')]//button")
    private WebElement addButton;
    @FindBy (css = "ms-text-field[formcontrolname='name']>input")
    private WebElement name;
    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveButton;
    @FindBy (css = "input[data-placeholder='Period Count']")
    private WebElement periodCount;
    //TODO NOT: periodCount a sadece sayı göndermeli, harf girişini kabul etmiyor.
    //TODO NOT: userType drowdown secmeli, random select metodu yazılmalı...
    @FindBy (css = "#mat-chip-list-input-0")
    private WebElement userType;
    @FindBy (xpath ="//span[text()='Dashboard ']")
    private WebElement dashboard;
    @FindBy (css ="div#toast-container")
    private WebElement message;  //   div[role='allertdialog']

    @FindAll({@FindBy(css="ms-edit-button.ng-star-inserted")})
    private List<WebElement> editButtonList;
    // sol taraftaki isimleri listesi
    @FindAll({ @FindBy (css = "tbody>tr>td:nth-child(2)") })
    private List<WebElement> nameList;
    //deletebuton list
    @FindAll({ @FindBy (css = "ms-delete-button.ng-star-inserted") })
    private List<WebElement> deleteButtonList;
//  Aşağıdaki mesajlist ekranda çıkan got it veya succus mesajlarını
//  edit delete de beklerken sıkıntı çıkmasın diye eklendi

    @FindAll({ @FindBy(css = "div#toast-container") })
    private List<WebElement> messageList;

    //silerken tıklatacağım save button
    @FindBy(css = "button[type='submit']")
    private WebElement yesButton;

    //    @FindBy (xpath ="//*[@id='mat-dialog-1']/budget-excel-template-dialog/ms-dialog/div/simple-dialog-title/mat-toolbar/mat-toolbar-row/button[2]")
//    private WebElement closeDialog;
    @FindBy (css = "button[aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindAll({
            @FindBy(xpath = "//td[@class='mat-cell cdk-cell cdk-column-name mat-column-name ng-tns-c348-75 ng-star-inserted']")
    })
    public List<WebElement> namelist;

    @FindBy(xpath = "//h3[text()='  Budget Excel Template ']")
    public WebElement pageTitle;

    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private WebElement reports;
    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement setupReports;
    @FindBy(linkText = "Excel Template")
    private WebElement excelTemplate;
    @FindBy (xpath="//div[@class='mat-slide-toggle-thumb-container']")
    public WebElement activeButton;
    @FindBy (xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchName;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;



    public void findAndClickElement(String elementName) {

        switch (elementName) {

            case "loginButton":
                currentElement = loginButton;
                break;

            case "gotItButton":
                currentElement = gotItButton;
                break;

            case "addButton":
                currentElement = addButton;
                break;

            case "saveButton":
                currentElement = saveButton;
                break;

            case "userType":
                currentElement = userType;
                break;

            case "yesButton":
                currentElement = yesButton;
                break;

            case "closeDialog":
                currentElement = closeDialog;
                break;

            case "reports":
                currentElement = reports;
                break;

            case "setupReports":
                currentElement = setupReports;
                break;

            case "excelTemplate":
                currentElement = excelTemplate;
                break;

            case "activeButton":
                currentElement = activeButton;
                break;

            case "searchButton":
                currentElement = searchButton;
                break;

        }

        clickElement(currentElement);
    }


    public void findElementAndSendKeys(String elementName, String text) {

        switch (elementName) {

            case "username":
                currentElement = username;
                break;

            case "password":
                currentElement = password;
                break;

            case "name":
                currentElement = name;
                break;

            case "periodCount":
                currentElement = periodCount;
                break;

            case "searchName":
                currentElement = searchName;
                break;


        }

        sendKeysElement(currentElement, text);
    }



    public void findElementAndVerifyContainsText(String TextName, String msg) {

        switch (TextName) {

            case "message":
                currentElement = message;
                break;

            case "ErrorMessage":
                currentElement = dashboard;
                break;

        }
        verifyElementContainsText(currentElement, msg);
    }




    public void editFunction(String value){

        if (messageList.size() > 0) {
            //if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                clickElement(editButtonList.get(i));
                break;
            }
        }
    }

    public void deleteFunction(String value){

        if (messageList.size() > 0) {
//            if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                clickElement(deleteButtonList.get(i));
                break;
            }
        }
    }




    public void elementisEnabled(String elementName) {

        switch (elementName) {

            case "saveButton":
                currentElement = saveButton;
                break;


        }

        Assert.assertFalse(currentElement.isEnabled());//Save buttonu gözüküp gözükmedigini kontrol ediyoruz


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






}
