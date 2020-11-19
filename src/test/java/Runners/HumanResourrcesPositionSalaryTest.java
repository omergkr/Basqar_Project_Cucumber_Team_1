package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
//        tags ={"@RegressionTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {

                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // to generate a extend report we need this plugin
                //olusturulacak raporun yari ve adi veriliyor
        }
)


public class HumanResourrcesPositionSalaryTest  extends AbstractTestNGCucumberTests {

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
