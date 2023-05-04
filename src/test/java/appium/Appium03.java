package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Appium03 {

    AndroidDriver<MobileElement> driver;
    @Test
    public void test() throws MalformedURLException, InterruptedException {


        DesiredCapabilities cap = new DesiredCapabilities();

        //   There are these options also for setting capability as below
//         cap.setCapability("platformName", "Android");
//         cap.setCapability(CapabilityType.PLATFORM_NAME,"Android");//
//         cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");


        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6 Pro API 30 2");
        //   cap.setCapability(MobileCapabilityType.DEVICE_NAME,"RealDevice");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        cap.setCapability(MobileCapabilityType.APP, "/Users/user/IdeaProjects/AppiumTechpro2022/src/Apps/gestureTool.apk");

        cap.setCapability("appPackage", "com.davemac327.gesture.tool");
        cap.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
        // If you want to start your app as installed before use below code.
        cap.setCapability(MobileCapabilityType.NO_RESET, true);

        driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);

        System.out.println("App installed successfully");

        Thread.sleep(3000);
        //Validate that user is on Home Screen
        MobileElement homeScreenTitle=driver.findElementById("android:id/title");
        Assert.assertEquals(homeScreenTitle.getText(), "Gesture Tool");
        System.out.println("Home screen");
        //Tap on gesture button
        MobileElement addGestureButton=driver.findElementById("com.davemac327.gesture.tool:id/addButton");
        addGestureButton.click();
        System.out.println("Tapped Add gesture button");
        // user should be on Create gesture screen
        Thread.sleep(3000);
        MobileElement createGestureScreenTitle= driver.findElementById("android:id/title");
        Assert.assertTrue(createGestureScreenTitle.isDisplayed());

        System.out.println("Create gesture screen ");

        //user send text to the text box as "Techproed"

        MobileElement nameBox=driver.findElementById("com.davemac327.gesture.tool:id/gesture_name");
        nameBox.sendKeys("TechProEdAppium5");

        System.out.println("Send text as TechproEdAppium5");

        // if you need to hide keyboard use below method
        driver.hideKeyboard();

        //tap on screen to make Done buttons enabled
        MobileElement blackScreen=driver.findElementById("com.davemac327.gesture.tool:id/gestures_overlay");
        blackScreen.click();
        System.out.println("Tapped the screen ");

        // user tap on Done button

        MobileElement doneButton=driver.findElementById("com.davemac327.gesture.tool:id/done");
        doneButton.click();

        System.out.println("Tapped done button ");

        //Validate user is on Home screen
        Thread.sleep(3000);
        MobileElement homeScreenTitle1=driver.findElementById("android:id/title");
        Assert.assertEquals(homeScreenTitle1.getText(), "Gesture Tool");



        List<MobileElement> listOfGestureName=driver.findElementsById("android:id/text1");
        System.out.println(listOfGestureName.size());

//        for (MobileElement name:listOfGestureName){
//
//            if(name.equals("TechProEdAppium5")){
//                System.out.println(name.getText());
//                Assert.assertTrue(name.isDisplayed());
//                System.out.println("Gesturename Created as "+name);
//            }


      for(int i=0;i<listOfGestureName.size();i++){
          System.out.println(listOfGestureName.get(i).getText());
          if(listOfGestureName.get(i).getText().equals("TechProEdAppium5")){

              Assert.assertTrue(listOfGestureName.get(i).isDisplayed());
              System.out.println("Gesture name created as "+listOfGestureName.get(i).getText());
          }




      }














//        driver.findElementById("com.davemac327.gesture.tool:id/addButton").click();
//
//        Thread.sleep(3000);
//
//        driver.findElementById("com.davemac327.gesture.tool:id/gesture_name").sendKeys("welcome to center", Keys.ENTER);
//        Thread.sleep(3000);
//
//        driver.findElementById("com.davemac327.gesture.tool:id/done").click();



    }












}
