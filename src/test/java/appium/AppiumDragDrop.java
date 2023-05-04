package appium;

import AppiumBase.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class AppiumDragDrop extends BaseClass {

    @Test
    public void dragDroTest() throws MalformedURLException , InterruptedException{


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

            driver.findElementByXPath("//*[@text='Background handle']").click();

//        MobileElement drag=driver.findElementsById("com.mobeta.android.demodslv:id/text").get(2);
//        MobileElement drop=driver.findElementsById("com.mobeta.android.demodslv:id/text").get(5);
       // (//android.widget.TextView)[5]
   WebElement source=driver.findElementsByXPath("//android.widget.TextView").get(3) ;

    WebElement target=driver.findElementsByXPath("//android.widget.TextView").get(8);

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



//          Actions actions = new Actions(driver);
 //         actions.clickAndHold(source).moveToElement(target).build().perform() ;









    }
}