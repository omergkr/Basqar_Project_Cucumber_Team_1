package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class PositionSalary_Positions_BankAccounts_Content extends ParentClass {


    WebElement currentElemet;
    List<WebElement> currentList;
    By currentolocater;

    public PositionSalary_Positions_BankAccounts_Content() {

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


    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanResourcessetup;

    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;


    @FindBy(xpath = "//div//h3[text()='  Position Salary ']")
    private WebElement positionSalaryPageTitle;

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    private WebElement inputPositionSalaryName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement inputPositionName;


    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']/input")
    private WebElement inputIban;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']/input")
    private WebElement integrationCode;

    //ms-text-field[@formcontrolname='integrationCode']/input

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement inputShortName;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement saveButton;

    @FindBy(css = "div[id='toast-container']")
    private WebElement containsmesaj;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement PositionSalarayNameSearch;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement bankAccountsNameSearch;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement PositionNameSearch;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement PositionShortNameSearch;


    @FindBy(xpath = "//ms-search-button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button/button")
    private WebElement deletButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//ms-edit-button/button")
    private WebElement editButton;

    @FindBy(xpath = "//label[@class='mat-slide-toggle-label']")
    private WebElement ectiveButton;


    @FindAll(

            {@FindBy(xpath = "//fa-icon[@class='ng-fa-icon ng-star-inserted']")}
    )
    public List<WebElement> positionSalaryIcons;

    @FindBy(xpath = "//ms-standard-button[@icon='users-class']")
    private WebElement positionSalaryfirstIcon;

    @FindBy(xpath = "//ms-add-button[@tooltip='GENERAL.BUTTON.ADD']")
    private WebElement addButtonforSalarayHistory;


    @FindBy(xpath = "//input[@data-placeholder='Experience Range (Ex.: 0-3, 4-6)']")
    private WebElement experienceRange;

    @FindBy(xpath = "//button[@aria-label='Open calendar']")
    private WebElement openCalendar;


    @FindBy(xpath = "//input[@data-placeholder='From']")
    private WebElement from;

    @FindBy(xpath = "//input[@data-placeholder='Salary']")
    private WebElement salary;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement currency;


    @FindAll(

            {@FindBy(xpath = "//div[@class='mat-calendar-body-cell-content mat-focus-indicator']")}
    )
    public List<WebElement> calendardates;


    @FindAll(

            {@FindBy(xpath = "//span[@class='mat-option-text']")}
    )
    public List<WebElement> currencytyps;

    @FindBy(xpath = "//span[text()=' Add ']")
    private WebElement salaryHistoryAddButton;


    @FindAll(

            {@FindBy(xpath = "//td[@class='mat-cell cdk-cell cdk-column-title mat-column-title ng-tns-c348-142 ng-star-inserted']")}
    )
    public List<WebElement> namelist;


    @FindAll(

            {@FindBy(xpath = "//td[@class='mat-cell cdk-cell cdk-column-shortName mat-column-shortName ng-tns-c348-44 ng-star-inserted']")}
    )
    public List<WebElement> Shortnamelist;


    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")
    private WebElement salaryHistoryEditIcon;


    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;


    @FindBy(xpath = "//div//h3[text()='  Positions ']")
    private WebElement positionspagetitle;


    @FindBy(xpath = "//div//h3[text()='  Bank Accounts ']")
    private WebElement bankAccountstitle;


    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement firstSetup;


    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement bankAccounts;

    @FindBy(xpath = "(//span[text()='Currency'])[3]")
    private WebElement bankAccountcurrency;

    @FindBy(xpath = "//span[text()=' USD ']")
    private WebElement usd;


    public void findAndClickElement(String elementName) {

        switch (elementName) {

            case "loginButton":
                currentElemet = loginButton;
                break;

            case "gotItButton":
                currentElemet = gotItButton;
                break;

            case "humanResources":
                currentElemet = humanResources;
                break;
            case "humanResourcessetup":
                currentElemet = humanResourcessetup;
                break;
            case "positionSalary":
                currentElemet = positionSalary;
                break;
            case "addbutton":
                currentElemet = addButton;
                break;

            case "saveButton":
                currentElemet = saveButton;
                break;
            case "searchButton":
                currentElemet = searchButton;
                break;
            case "deletButton":
                currentElemet = deletButton;
                break;
            case "yesButton":
                currentElemet = yesButton;
                break;
            case "editButton":
                currentElemet = editButton;
                break;
            case "ectiveButton":
                currentElemet = ectiveButton;
                break;

            case "from":
                currentElemet = from;
                break;
            case "addButtonforSalarayHistory":
                currentElemet = addButtonforSalarayHistory;
                break;

            case "openCalendar":
                currentElemet = openCalendar;
                break;
            case "currency":
                currentElemet = currency;
                break;
            case "salaryHistoryAddButton":
                currentElemet = salaryHistoryAddButton;
                break;
            case "salaryHistoryEditIcon":
                currentElemet = salaryHistoryEditIcon;
                break;

            case "positions":
                currentElemet = positions;
                break;

            case "firstSetup":
                currentElemet = firstSetup;
                break;

            case "bankAccounts":
                currentElemet = bankAccounts;
                break;

            case "parameters":
                currentElemet = parameters;
                break;

            case "bankAccountcurrency":
                currentElemet = bankAccountcurrency;
                break;
            case "usd":
                currentElemet = usd;
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


            case "inputPositionSalaryName":
                currentElemet = inputPositionSalaryName;
                break;

            case "inputPositionName":
                currentElemet = inputPositionName;
                break;


            case "inputShortName":
                currentElemet = inputShortName;
                break;

            case "PositionSalarayNameSearch":
                currentElemet = PositionSalarayNameSearch;
                break;

            case "PositionNameSearch":
                currentElemet = PositionNameSearch;
                break;
            case "PositionShortNameSearch":
                currentElemet = PositionShortNameSearch;
                break;

            case "bankAccountsNameSearch":
                currentElemet = bankAccountsNameSearch;
                break;


            case "experienceRange":
                currentElemet = experienceRange;
                break;

            case "salary":
                currentElemet = salary;
                break;

            case "inputIban":
                currentElemet = inputIban;
                break;

            case "integrationCode":
                currentElemet = integrationCode;
                break;


        }

        sendKeysElement(currentElemet, text);
    }

    public void findElementAndVerifyContainsText(String elementname, String mesaj) {

        switch (elementname) {

            case "positionSalaryPageTitle":
                currentElemet = positionSalaryPageTitle;
                break;

            case "positionspagetitle":
                currentElemet = positionspagetitle;
                break;

            case "bankAccountstitle":
                currentElemet = bankAccountstitle;
                break;


            case "containsmesaj":
                currentElemet = containsmesaj;
                break;

            case "errorMessage":
                currentElemet = errorMessage;
                break;

        }

        verifyElement(currentElemet, mesaj);

    }

    public void buttonisEnabled(String elementname) {

        switch (elementname) {

            case "saveButton":
                currentElemet = saveButton;
                break;


        }

        Assert.assertFalse(saveButton.isEnabled());

    }

    public void click_on_an_Element_in_a_ListWithindex(String listName, String indexnumber) {

        int intindexnumber = Integer.parseInt(indexnumber);

        switch (listName) {

            case "positionSalaryIcons":
                currentList = positionSalaryIcons;
                currentolocater = By.xpath("//fa-icon[@class='ng-fa-icon ng-star-inserted']");
                break;
            case "positionSalaryfirstIcon":
                currentElemet = positionSalaryfirstIcon;
                break;

            case "calendardates":
                currentList = calendardates;
                currentolocater = By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator']");
                break;
            case "currencytyps":
                currentList = currencytyps;
                currentolocater = By.xpath("//span[@class='mat-option-text']");
                break;

        }

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(currentolocater, 0));
        System.out.println("liste size:" + currentList.size());
//        for (WebElement n:currentList) {
//            System.out.println(n.getText());
//        }

        currentList.get(intindexnumber).click();

    }

    public void check_if_the_Elements_in_theListContainText(String listName, String text) {

        switch (listName) {

            case "namelist":
                currentList = namelist;
                break;

            case "Shortnamelist":
                currentList = Shortnamelist;
                break;


        }

        for (WebElement n : currentList) {

            Assert.assertTrue(n.getText().contains(text));
        }


    }


}

