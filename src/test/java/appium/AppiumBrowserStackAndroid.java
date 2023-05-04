package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBrowserStackAndroid {

    @Test
    public void testCloud() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();


         caps.setCapability("build", "browserstack-build-2");
         caps.setCapability(  "name", "first_test");//
         caps.setCapability(  "project", "First TestNg Android Project");

        caps.setCapability("app", "bs://7cfa4df19e3fc18c37c051b77c1abaa4eafdb9fc");



        caps.setCapability("device", "Samsung Galaxy S20");
        caps.setCapability("os_version", "10.0");


        caps.setCapability("browserstack.user", "mustafababada_c3IuqZ");
        caps.setCapability("browserstack.key","W4wp2xCMZ4eKkzZHtzUo");

       AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);




















    }
}
