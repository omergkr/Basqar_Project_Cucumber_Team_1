package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Subjects extends ParentClass_Subject {

    public LeftNav_Subjects() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private  WebElement setupEducation;

    @FindBy(xpath = "(//span[text()='Subjects'])[1]")
    private  WebElement subject;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    public WebElement SubjectCategoriesButton;



    @FindBy(linkText = "Human Resources")
    private WebElement humanButton;

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c103-21 ng-star-inserted']")
    private WebElement humanSetupButton;

    @FindBy(linkText = "Salary Modifiers")
    private WebElement SalaryModfButton;



    WebElement myElement;
    public void findElementAndClickFunction(String elementName){

        switch (elementName ){

            case "education" :
                myElement =education;
                break;

            case "setupEducation" :
                myElement =setupEducation;
                break;

            case "subject" :
                myElement =subject;
                break;

            case "SubjectCategoriesButton" :
                myElement =SubjectCategoriesButton;
                break;


            case "humanButton" :
                myElement =humanButton;
                break;


            case "humanSetupButton" :
                myElement =humanSetupButton;
                break;

            case "SalaryModfButton" :
                myElement =SalaryModfButton;
                break;


        }

        clickFunction(myElement);

    }
}
