package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_SalaryTypes extends ParentClass_SalaryTypes {
    public LeftNav_SalaryTypes() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Human Resources")
    private WebElement humanButton;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupButton;

    @FindBy(xpath = "//span[text()='Salary Types']")
    private WebElement SalaryTypesButton;




    WebElement myElement;
    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "humanButton":
                myElement = humanButton;
                break;

            case "setupButton":
                myElement = setupButton;
                break;
            case "SalaryTypesButton":
                myElement = SalaryTypesButton;
                break;

        }

        clickElement(myElement);
    }
}

