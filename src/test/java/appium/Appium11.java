package appium;

import AppiumBase.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Appium11 extends BaseClass {


    @Test
    public void test() throws MalformedURLException, InterruptedException {


//        DesiredCapabilities capabilities=new DesiredCapabilities();
//
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"realDevice");
//        capabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
//        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\user\\IdeaProjects\\AppiumTechpro2022\\src\\Apps\\ApiDemos.apk");
//
//        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), capabilities);

          AndroidDriver<MobileElement> driver = getAndroidDriver();



        String textApiDemos=driver.findElementByXPath("//android.widget.TextView[@text='API DEMOS']").getText();
        System.out.println(textApiDemos);
        Thread.sleep(30000);


        // preference butonuna tikladik
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        Thread.sleep(30000);


        // Default butonuna tikladik
       MobileElement defaultValues= driver.findElementByXPath("//android.widget.TextView[@text='4. Default values']");
       defaultValues.click();
        Thread.sleep(30000);


//       check box must be checked
        MobileElement checkbox= driver.findElementByClassName("android.widget.CheckBox");
        if(checkbox.getAttribute("checked").equals("false")){

            checkbox.click();
            System.out.println("check box checked");
        }

        // click on edit text
        MobileElement editButton=  driver.findElementByXPath("//android.widget.TextView[@text='Edit text preference']");

       editButton.click();

       //provide your favorite

        MobileElement textBox=driver.findElementById("android:id/edit");
        textBox.clear();
        //provide  data
        textBox.sendKeys("Boncuk");
        Thread.sleep(3000);

        // click OK button
        MobileElement okButton = driver.findElementById("android:id/button1");
        okButton.click();
        Thread.sleep(3000);
        //click list and select 2. opton

      MobileElement listPreference = driver.findElementByXPath("//*[@text='List preference']");
       listPreference.click();
       Assert.assertTrue(driver.findElementById("android:id/alertTitle").isDisplayed());

       MobileElement secondOption = driver.findElementByXPath("//*[@text='Beta Option 02']");

       // we should see checked checked

        Assert.assertEquals(secondOption.getAttribute("checked"),"true");
        Thread.sleep(3000);

        // close the app
        driver.closeApp();














    }























}
