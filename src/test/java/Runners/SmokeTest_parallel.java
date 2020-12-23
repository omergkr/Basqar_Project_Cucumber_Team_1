package Runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags ={"@SmokeTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {

                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // to generate a extend report we need this plugin
                //olusturulacak raporun yari ve adi veriliyor
        }
)


public class SmokeTest_parallel extends AbstractTestNGCucumberTests {


    @BeforeClass
    @Parameters("browser")
    public static void beforClass(String browser)
    {
        Driver.threadBrowserName.set(browser);

    }






    @AfterClass
    public static void afterClass()
    {
        Reporter.loadXMLConfig("src/test/java/XMLFiles/extentReportSet.xml");
        //ayarlar alindi cucumber extent reporttan haberi oldu
        Reporter.setSystemInfo("User Name","Ömer Göker");
        Reporter.setSystemInfo("Application Name","Basqar");
        Reporter.setSystemInfo("Application Name","Basqar");
        Reporter.setSystemInfo("Operating System Info",System.getProperty("os.name"));
        Reporter.setSystemInfo("Department","QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber report");


    }



}
