package appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class Appium05ChromeNativeApp {


    AndroidDriver<MobileElement> driver;
    @Test
    public void chromeTest() throws InterruptedException, MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

    //    cap.setCapability("browsername", "chrome");
  //   cap.setCapability("chromedriverExecutable", "./src/main/resources/drivers/chromedriver111.exe");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        //   cap.setCapability(MobileCapabilityType.DEVICE_NAME,"RealDevice");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        cap.setCapability(MobileCapabilityType.NO_RESET,true);
 //       cap.setCapability("chromeOptions", ImmutableMap.of("w3c",false));

      // cap.setCapability(MobileCapabilityType.APP, "APK PATH OF CHROME");
     //   cap.setCapability("executableChromedriver", "absolutePatofChromedrive if need");



         Thread.sleep(3000);

        cap.setCapability(MobileCapabilityType.NO_RESET, true);
        // If you want to start your app as installed before use below code.

        cap.setCapability("appPackage","com.android.chrome");
        cap.setCapability("appActivity","com.google.android.apps.chrome.Main");


        driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);

        Thread.sleep(7000);

        driver.get("https://amazon.com/");


        System.out.println(driver.getContext()+" app acildigindaki tur");

        Set<String> butunTurler=driver.getContextHandles();
        for (String tur:butunTurler){
            System.out.println(tur);

            if (tur.equals("WEBVIEW_chrome")){

                driver.context(tur);
            }
        }
 //      System.out.println(driver.getContext()+" degisimden sonraki tur");
        Thread.sleep(5000);
    MobileElement homeScreenLogo=driver.findElementByAccessibilityId("Amazon");

       Assert.assertTrue(homeScreenLogo.isDisplayed());
        System.out.println("Ana sayfadayiz");

      //  System.out.println(homeScreenLogo.getText());


       // homeScreenLogo.click();


    //    driver.findElementByLinkText("").click();

//        Thread.sleep(5000);
//        MobileElement welcomeText=driver.findElementByXPath("//android.widget.TextView[@text='Welcome']");
//        Thread.sleep(3000);
//        Assert.assertEquals(welcomeText.getText(),"Welcome");
        Thread.sleep(3000);
        driver.findElementByXPath("//android.view.View[@content-desc='Sign in ›']").click();
        driver.findElementByXPath("//*[@id='ap_email_login_icon']").sendKeys("fathermountain@gmail.com");


        Thread.sleep(7000);

        driver.findElementByXPath("//android.widget.Button[@resource-id='continue']").click();
        Thread.sleep(7000);
        driver.findElementByXPath("//android.widget.EditText[@resource-id='ap_password']").sendKeys("Aurora20");
        Thread.sleep(7000);
        driver.findElementByXPath("//android.view.View[@resource-id='auth-signin-button']").click();









        Thread.sleep(3000);

        System.out.println("all");



    }



}
