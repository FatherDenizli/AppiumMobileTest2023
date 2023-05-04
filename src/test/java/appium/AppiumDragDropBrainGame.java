package appium;

import AppiumBase.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static AppiumBase.BaseClass.getAndroidDriver;

public class AppiumDragDropBrainGame extends BaseClass {

    @Test
    public void dragDroTest() throws MalformedURLException , InterruptedException{


//        DesiredCapabilities capabilities=new DesiredCapabilities();
//
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"realDevice");
//        capabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
//        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\user\\IdeaProjects\\AppiumTechpro2022\\src\\Apps\\Drag & Drop_ Brain-Game_5_Apkpure.apk");
////
//       AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), capabilities);

        AndroidDriver<MobileElement> driver = getAndroidDriver();




         Thread.sleep(5000);
            driver.findElementById("dragdrop.stufflex.com.dragdrop:id/btn_football").click();
        Thread.sleep(5000);

//        MobileElement drag=driver.findElementsById("com.mobeta.android.demodslv:id/text").get(2);
//        MobileElement drop=driver.findElementsById("com.mobeta.android.demodslv:id/text").get(5);

        driver.findElementById("dragdrop.stufflex.com.dragdrop:id/hintsTxt").click();


       // (//android.widget.TextView)[5]
          MobileElement source= (MobileElement) driver.findElementById("dragdrop.stufflex.com.dragdrop:id/chooseB");

          MobileElement target=(MobileElement) driver.findElementById("dragdrop.stufflex.com.dragdrop:id/answer");

          driver.findElementById("dragdrop.stufflex.com.dragdrop:id/hintsTxt").click();







//        TouchAction action = new TouchAction((AndroidDriver)driver);
//        action.longPress(new ElementOption().withElement(source))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
//                .moveTo(new ElementOption().withElement(target))
//                .release()
//                .perform();


//        WebElement source = driver.findElement(By.id("draggable"));
//        WebElement target = driver.findElement(By.id("droppable"));
//        user Actions class to move source into target




          TouchAction action = new TouchAction((AndroidDriver) driver);
//
//
//        System.out.println("It Is dragging element.");
//
        action.longPress(ElementOption.element(source)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(ElementOption.element(target)).release().perform();

        driver.findElementById("dragdrop.stufflex.com.dragdrop:id/hintsTxt").click();

        action.longPress(ElementOption.element(source)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(ElementOption.element(target)).release().perform();



        driver.findElementById("dragdrop.stufflex.com.dragdrop:id/hintsTxt").click();

        MobileElement source1= (MobileElement) driver.findElementById("dragdrop.stufflex.com.dragdrop:id/chooseA");
        action.longPress(ElementOption.element(source1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(ElementOption.element(target)).release().perform();

        driver.findElementById("dragdrop.stufflex.com.dragdrop:id/hintsTxt").click();

        MobileElement source2= (MobileElement) driver.findElementById("dragdrop.stufflex.com.dragdrop:id/chooseC");
        action.longPress(ElementOption.element(source2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(ElementOption.element(target)).release().perform();




//          Actions actions = new Actions(driver);
 //         actions.clickAndHold(source).moveToElement(target).build().perform() ;









    }
}