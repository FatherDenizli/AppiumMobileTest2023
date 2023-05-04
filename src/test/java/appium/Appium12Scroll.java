package appium;

import AppiumBase.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;


import java.net.MalformedURLException;

public class Appium12Scroll extends BaseClass {


    @Test

    public void scrollTest() throws MalformedURLException, InterruptedException {

        AndroidDriver<MobileElement> driver=getAndroidDriver();

        MobileElement viewsButton=driver.findElementByXPath("//android.widget.TextView[@text='Views']");
        viewsButton.click();

        Thread.sleep(300);

        // now we can scroll in this screen

        Dimension dimension =driver.manage().window().getSize();


      Thread.sleep(3000);
             int start_x = (int) (dimension.width * 0.5);
             int start_y = (int) (dimension.height * 0.8);

            int end_x = (int) (dimension.width * 0.5);
            int end_y = (int) (dimension.height * 0.2);

            TouchAction touchAction = new TouchAction(driver);
            touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).perform();

      Thread.sleep(3000);
            MobileElement popUpMenu = driver.findElementByXPath("//*[@text='Popup Menu']");
            popUpMenu.click();














    }






}
