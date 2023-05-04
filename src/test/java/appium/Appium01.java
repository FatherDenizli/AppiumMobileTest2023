package appium;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Appium01 {


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

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        //   cap.setCapability(MobileCapabilityType.DEVICE_NAME,"RealDevice");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        cap.setCapability("APP_WAIT_ACTIVITY" , ".DispatchActivity");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\user\\IdeaProjects\\AppiumTechpro2022\\src\\Apps\\GestureTool.apk");

        cap.setCapability("appPackage", "com.davemac327.gesture.tool");
        cap.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
        // If you want to start your app as installed before use below code.
        //        cap.setCapability(MobileCapabilityType.NO_RESET,true);

        driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);

//         Thread.sleep(3000);
//         if(driver.isDeviceLocked()){
//             driver.unlockDevice();
             Thread.sleep(3000);

//            MobileElement   continueButton=driver.findElementById("com.android.permissioncontroller:id/continue_button");
//            continueButton.click();
//            Thread.sleep(3000);
            MobileElement popUpOkButton= driver.findElementById("android:id/button1");
            popUpOkButton.click();
            Thread.sleep(3000);

            MobileElement homeScreenTitle=driver.findElementById("android:id/title");
            Assert.assertEquals(homeScreenTitle.getText(), "Gesture Tool");





    }
}
