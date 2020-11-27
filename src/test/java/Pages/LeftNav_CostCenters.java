package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_CostCenters extends ParentClass_CostCenters {
    public LeftNav_CostCenters() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Budget")
    private WebElement BudgetButton;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement setupButton;

    @FindBy(xpath = "(//span[text()='Cost Centers'])[1]")
    private WebElement CostCentersButton;




    WebElement myElement;
    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "BudgetButton":
                myElement = BudgetButton;
                break;

            case "setupButton":
                myElement = setupButton;
                break;
            case "CostCentersButton":
                myElement = CostCentersButton;
                break;

        }

        clickElement(myElement);
    }
}

