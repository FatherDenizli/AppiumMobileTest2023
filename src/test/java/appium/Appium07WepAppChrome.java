package appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;



import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Appium07WepAppChrome {
//    chrome://inspect/#devices


    AndroidDriver<MobileElement> driver;
    @BeforeTest
    public void chromeTest() throws InterruptedException, MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();


        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");

       //  cap.setCapability("chromeOptions", ImmutableMap.of("w3c",false));

        //  cap.setCapability(MobileCapabilityType.APP, "APK PATH OF CHROME"); // browserde calistirmak icin bunlari sildik
        //cap.setCapability("executableChromedriver", "absolutePatofChromedrive if need");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        Thread.sleep(3000);
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        cap.setCapability(MobileCapabilityType.NO_RESET,true);
        cap.setCapability("chromedriverExecutable", "C:\\Users\\user\\IdeaProjects\\AppiumTechpro2022\\src\\main\\resources\\drivers\\chromedriver112.exe");


        Thread.sleep(3000);

 //       cap.setCapability(MobileCapabilityType.NO_RESET, true);
        // If you want to start your app as installed before use below code.
//        cap.setCapability("appPackage","com.android.chrome");
//        cap.setCapability("appActivity","com.google.android.apps.chrome.Main");

        driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



        @Test

        public void test1() throws InterruptedException {


            driver.get("https://amazon.ca/");
            Thread.sleep(7000);
            System.out.println(driver.getContext() + " app acildigindaki tur");
            // Burda apllikasyonun hangi turleri oldugunu gormek icin getContextHandels() kullaniyoruz

            Set<String> butunTurler = driver.getContextHandles();
            for (String tur : butunTurler) {
                System.out.println(tur);

                if (tur.equals("WEBVIEW_chrome")) {

                    driver.context(tur);
                }
                System.out.println(driver.getContext() + " app sonraki durumu");

//           Remote  ==>     chrome://inspect#devices

            MobileElement logo=driver.findElementByXPath("//a[@id='nav-logo-sprites']");
            Assert.assertTrue(logo.isDisplayed());
                System.out.println("Ana sayfadayiz .......");
                Thread.sleep(7000);
   try {
       MobileElement signInButton = driver.findElementByXPath("//*[@id='nav-logobar-greeting']");
       signInButton.click();
       }catch (Exception e){
       System.out.println("clicked");
   }



                MobileElement welcome=driver.findElementByXPath("//h2");
                Assert.assertTrue(welcome.isDisplayed());
                System.out.println("Sign in sayfasindayiz");





//            driver.findElementByXPath("//android.view.View[@content-desc=\"Clear search keywords\"]").sendKeys("teapot", Keys.ENTER);
//                     //android.widget.EditText[@id='nav-search-keywords']
//          //  driver.findElementByXPath("//input[@type='submit']").click();
//            System.out.println("all");




        }
    }



}
