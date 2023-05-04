package AppiumBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {


    public static AndroidDriver<MobileElement> getAndroidDriver() throws MalformedURLException   {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\user\\IdeaProjects\\AppiumTechpro2022\\src\\Apps\\Drag & Drop_ Brain-Game_5_Apkpure.apk");
//      capabilities.setCapability("appPackage", "com.davemac327.gesture.tool");
//      capabilities.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
        cap.setCapability(MobileCapabilityType.NO_RESET, "true");

        return new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

    }

}
