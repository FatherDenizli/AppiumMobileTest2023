package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium08UiSelector {


    AndroidDriver<MobileElement> driver;


    @Test
    public void test1() throws MalformedURLException, InterruptedException {


        DesiredCapabilities cap = new DesiredCapabilities();

        //   There are these options also for setting capability as below
//         cap.setCapability("platformName", "Android");
//         cap.setCapability(CapabilityType.PLATFORM_NAME,"Android");//
//         cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");


        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 30");
        //   cap.setCapability(MobileCapabilityType.DEVICE_NAME,"RealDevice");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        cap.setCapability(MobileCapabilityType.APP, "/Users/user/IdeaProjects/AppiumTechpro2022/src/Apps/GestureTool.apk");

        cap.setCapability("appPackage", "com.davemac327.gesture.tool");
        cap.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
        // If you want to start your app as installed before use below code.
          cap.setCapability(MobileCapabilityType.NO_RESET,true);

        driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);

        // ResourceID
  //      driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\")").click();

//        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(0)").click();
//        Thread.sleep(7000);

//        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").text(\"Test\")").click();
//        Thread.sleep(7000);

//https://developer.android.com/reference/androidx/test/uiautomator/UiSelector           ONEMLI!!!
        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").textStartsWith(\"Add\")").click();
        Thread.sleep(7000);



       System.out.println(driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/done\").enabled(false)").getAttribute("enabled"));







    }


}
