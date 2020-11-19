package StepDefinitions;

import Pages.ParentClass;

import Utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks extends ParentClass {



    //her seneryodan once
    @Before
    public void before(Scenario scenario){   //parametrede alabiliyor

        System.out.println("Scenario started");
        System.out.println(scenario.getId()+ " scenario id");
        System.out.println(scenario.getName()+ " scenario name");

    }


    //her seneryodan sonra
    @After
    public void after(Scenario scenario){

        System.out.println("Scenario finished");
        System.out.println("Scenario result: "+scenario.getStatus());

        Date now =new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH mm ss");
        String strDate=formatter.format(now);
        strDate=strDate.replaceAll(":","_");


        if (scenario.getStatus()=="failed"){

            String scenarioName=scenario.getName();



            //ekran goruntusu alma degiskenimizi tanimladik
            TakesScreenshot ts =(TakesScreenshot)Driver.getDriver();

            //erkan goruntusu dosyasi tipi secilerek olusturuldu
            File ekranDosyasi=ts.getScreenshotAs(OutputType.FILE);

            // ekranDosyasını bir dosyaya yazma/kopyalama işlemi yapılıyor.
            // DosyaKopyala (ekranDosyası, ekranGoruntusu.png);
            // Yukarıdaki komut JAVA nın için de yok, bunun için diğer yapılmış bir kütüphane
            // bulup AYNI SELENYUMU eklediğimiz ekleyeceğiz. bu kütüphane common.io bu apache isimli siteden indirilecek.


            try {
                FileUtils.copyFile(ekranDosyasi,new File("target/FailedScreenShots/"+Driver.threadBrowserName.get()+scenarioName+strDate+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }




        }



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



     //   Driver.quitDriver();
    }


    public static void screenShoot(Scenario scenario){

        String scenarioName=scenario.getName();

        Date now =new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH mm ss");
        String strDate=formatter.format(now);
        strDate=strDate.replaceAll(":","_");

        //ekran goruntusu alma degiskenimizi tanimladik
        TakesScreenshot ts =(TakesScreenshot)Driver.getDriver();

        //erkan goruntusu dosyasi tipi secilerek olusturuldu
        File ekranDosyasi=ts.getScreenshotAs(OutputType.FILE);

        // ekranDosyasını bir dosyaya yazma/kopyalama işlemi yapılıyor.
        // DosyaKopyala (ekranDosyası, ekranGoruntusu.png);
        // Yukarıdaki komut JAVA nın için de yok, bunun için diğer yapılmış bir kütüphane
        // bulup AYNI SELENYUMU eklediğimiz ekleyeceğiz. bu kütüphane common.io bu apache isimli siteden indirilecek.


        try {
            FileUtils.copyFile(ekranDosyasi,new File("target/FailedScreenShots/"+Driver.threadBrowserName.get()+scenarioName+strDate+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }




    }




}