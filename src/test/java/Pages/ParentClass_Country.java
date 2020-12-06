package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ParentClass_Country {

    WebDriver driver;
    WebDriverWait wait;

    public ParentClass_Country() {
        driver = Driver.getDriver();
        wait=new WebDriverWait(driver,10);
    }

    public void clickGeneralFunction(WebElement element)
    {
        scroll_To_Element(element);
       wait_clickable_to_Element(element);


        element.click();

    }
    public void writeSendGeneralFunction(WebElement element,String value)
    {

        wait_visible_to_Element(element);
        scroll_To_Element(element);
        element.clear();
        element.sendKeys(value);

    }

    public void wait_visible_to_Element(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }


    public void wait_clickable_to_Element (WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public void scroll_To_Element(WebElement element)
    {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verify_element_contains_text (WebElement element, String incoming_message) {

        Assert.assertTrue(element.getText().toLowerCase().contains(incoming_message));

    }


}
