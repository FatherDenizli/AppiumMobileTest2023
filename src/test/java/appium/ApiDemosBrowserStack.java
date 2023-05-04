package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiDemosBrowserStack {

    //https://developer.android.com/reference/androidx/test/uiautomator/UiSelector           ONEMLI!!!  UiSelector()

//    >adb shell
//     $ dumpsys window windows | grep -E 'CurrentFocus|mFocusedApp'



    AndroidDriver<MobileElement> driver;


    @Test
    public void test1(Method m) throws MalformedURLException, InterruptedException {
                     // Method lang reflect

        DesiredCapabilities cap = new DesiredCapabilities();



        cap.setCapability("project", "First Java Project");
        cap.setCapability("build", "Java Android");
        cap.setCapability("name", m.getName());

        cap.setCapability("deviceName", "Samsung Galaxy S10");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("browserstack.user", "mustafababada_c3IuqZ");
        cap.setCapability("browserstack.key", "W4wp2xCMZ4eKkzZHtzUo");
        cap.setCapability(MobileCapabilityType.APP, "bs://d7d59beb48abb0a526c25660340e65b3c355daf3");

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability("appPackage", "io.appium.android.apis");
        cap.setCapability("appActivity", ".ApiDemos");





        bs://d7d59beb48abb0a526c25660340e65b3c355daf3

        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");

  //      io.appium.android.apis/io.appium.android.apis.ApiDemos



        // If you want to start your app as installed before use below code.
          cap.setCapability(MobileCapabilityType.NO_RESET,true);

        driver = new AndroidDriver<MobileElement>(new URL("http://hub.browserstack.com/wd/hub"), cap);

         String textApiDemos=driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").getText();
        System.out.println(textApiDemos);
        Thread.sleep(3000);

        // preference butonuna tikladik
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

        // preference depencies butonuna bastik butonuna tikladik




        Thread.sleep(3000);
        // wifi checkbox will be clicked
        driver.findElementByXPath("// android.widget.TextView[@text='3. Preference dependencies']").click();

        String isChecked = driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/checkbox\").checkable(true)").getAttribute("checked");
        System.out.println(isChecked);

        Thread.sleep(3000);
 //      MobileElement checkBox= driver.findElementById("android:id/checkbox");
   //     android.widget.CheckBox        resource-id
        //    wifi settings tiklandi
        if(isChecked.equals("false")){
        Thread.sleep(3000);
             driver.findElementById("android:id/checkbox").click();
            System.out.println("if calisti");

        }

        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(3000);
        //text penceresi acildigini gor
        Assert.assertTrue(driver.findElementById("android:id/alertTitle").isDisplayed());
        Thread.sleep(3000);
        // text yazdiralim
        driver.findElementById("android:id/edit").sendKeys("TextAppium");
        Thread.sleep(3000);
        // OK butonuna bas
       driver.findElementById("android:id/button1").click();

        System.out.println("mission completed ...");
        Thread.sleep(3000);

        driver.closeApp();










    }


}
