package utulities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UtilitiesMethod {

    AndroidDriver<MobileElement> driver;

    public UtilitiesMethod(AndroidDriver<MobileElement> driver) {
        this.driver=driver;
    }

    public void scrollToText(String value)
    {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+value+"\"));");
    }



}
