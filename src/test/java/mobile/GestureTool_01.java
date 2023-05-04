package mobile;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GestureTool_01 {

    AndroidDriver<MobileElement> driver;


    @Test
    public void test1() throws MalformedURLException, InterruptedException {


        DesiredCapabilities cap=new DesiredCapabilities();

        //   There are these options also for setting capability as below
//         cap.setCapability("platformName", "Android");
//         cap.setCapability(CapabilityType.PLATFORM_NAME,"Android");//
//         cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");


        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"RealDevice");
        //   cap.setCapability(MobileCapabilityType.DEVICE_NAME,"RealDevice");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");
        cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\user\\IdeaProjects\\AppiumTechpro2022\\src\\Apps\\GestureTool.apk");

        cap.setCapability("appPackage", "com.davemac327.gesture.tool");
        cap.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");

        driver=new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"),cap);

        Thread.sleep(3000);
        if(driver.isDeviceLocked()){
            driver.unlockDevice();


        }

    }



    @Test
    public void test2(){

        System.out.println("all");







    }

//    @Test
//    public void test2() throws InterruptedException {
//        driver.findElementById("com.android.permissioncontroller:id/continue_button").click();//Click "continue'
//        Thread.sleep(5000);
//
//        MobileElement okButton = driver.findElementByXPath("//android.widget.Button[@text='OK']");//Click "OK"
//        okButton.click();
//        String title = driver.findElement(By.id("android:id/title")).getText();//Get title and assert it is "Gesture Tool"
//        System.out.println(title);
//        Assert.assertTrue(title.contains("Gesture Tool"));
//        Thread.sleep(10000);
//
//
//
//    }



}
