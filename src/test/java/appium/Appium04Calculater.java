package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium04Calculater {



    @Test
    public void calculater() throws MalformedURLException, InterruptedException {

        AndroidDriver<MobileElement> driver;

        DesiredCapabilities cap = new DesiredCapabilities();



        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6 Pro API 30 2");
        //   cap.setCapability(MobileCapabilityType.DEVICE_NAME,"RealDevice");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        cap.setCapability(MobileCapabilityType.APP, "/Users/user/IdeaProjects/AppiumTechpro2022/src/Apps/Calculator_Test.apk");

//        cap.setCapability("appPackage", "com.davemac327.gesture.tool");
//        cap.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
        // If you want to start your app as installed before use below code.
        cap.setCapability(MobileCapabilityType.NO_RESET, true);

        driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);

        Thread.sleep(3000);

        System.out.println("App install successfully ...");

        MobileElement num1=driver.findElementById("digit_1");
        MobileElement num2=driver.findElementById("digit_2");
        MobileElement num3=driver.findElementById("digit_3");
        MobileElement num4=driver.findElementById("digit_4");
        MobileElement num5=driver.findElementById("digit_5");
        MobileElement num6=driver.findElementById("digit_6");
        MobileElement num7=driver.findElementById("digit_7");
        MobileElement num8=driver.findElementById("digit_8");
        MobileElement num9=driver.findElementById("digit_9");
        MobileElement num0=driver.findElementById("digit_0");

        MobileElement divide=driver.findElementByAccessibilityId("divide");
        MobileElement multiply=driver.findElementByAccessibilityId("multiply");
        MobileElement plus=driver.findElementByAccessibilityId("plus");
        MobileElement minus=driver.findElementByAccessibilityId("minus");
        MobileElement equals=driver.findElementByAccessibilityId("equals");

//        35+82
        num3.click();
        num5.click();
        plus.click();

        num8.click();
        num2.click();
 //     pre result =117
        MobileElement preResult=driver.findElementById("result_preview");
        final String preResultText= preResult.getText();
       // cast String to integer
        int preResultInt=Integer.parseInt(preResultText);
        System.out.println("preResult is "+preResultText);

        //tap equals
        equals.click();

        Thread.sleep(3000);

        MobileElement finalResult=driver.findElementById("result_final");
        final String finalResultText=finalResult.getText();

        int finalResultInt=Integer.parseInt(finalResultText);
        System.out.println("Final result is "+finalResultText);

        Assert.assertEquals(finalResultText,preResultText);
        Assert.assertEquals(finalResultInt, preResultInt);
        System.out.println("Final result is equal to pre result "+finalResultText+"="+preResultText);









    }





}
