package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cities_Content extends ParentClass_Country {

    public Cities_Content() {
        PageFactory.initElements(driver,this);
    }

    WebElement effectiveElement;

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = " (//span[text()='Countries'])[1]")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Cities'][1]")
    private WebElement cities;





    public void find_and_click_for_element(String element) {

        switch (element) {
            case "setup":
                effectiveElement = setup;
                break;


            case "parameters":
                effectiveElement = parameters;
                break;

            case "countries":
                effectiveElement = countries;
                break;

            case "cities":
                effectiveElement = cities;
                break;



        }
        clickGeneralFunction(effectiveElement);


    }


}


