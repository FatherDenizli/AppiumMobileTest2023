package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium02 {


    AndroidDriver<MobileElement> driver;
    @Test
    public void test() throws MalformedURLException, InterruptedException {


        DesiredCapabilities cap=new DesiredCapabilities();

        //   There are these options also for setting capability as below
//         cap.setCapability("platformName", "Android");
//         cap.setCapability(CapabilityType.PLATFORM_NAME,"Android");//
//         cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");


        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 6 Pro API 30 2");
        //   cap.setCapability(MobileCapabilityType.DEVICE_NAME,"RealDevice");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");
        cap.setCapability(MobileCapabilityType.APP,"/Users/user/IdeaProjects/AppiumTechpro2022/src/Apps/gestureTool.apk");

        cap.setCapability("appPackage", "com.davemac327.gesture.tool");
        cap.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
        // If you want to start your app as installed before use below code.
           cap.setCapability(MobileCapabilityType.NO_RESET,true);

        driver=new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"),cap);

//         Thread.sleep(3000);
//         if(driver.isDeviceLocked()){
//             driver.unlockDevice();

//    Locate the element with xpath in a different way

       MobileElement  testButton=driver.findElementByXPath("//*[@text='Test']");
//    // ==>  //android.widget.Button[@text='Test']  OR (//android.widget.Button)[3]  index ile
        testButton.click();

        Thread.sleep(3000);
        MobileElement homeScreenTitle=driver.findElementById("android:id/title");
        Assert.assertEquals(homeScreenTitle.getText(), "Test a gesture");

        System.out.println("actual txt "+homeScreenTitle.getText());








    }











}
