package ecommerceapp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ECommerceTotalAmountValidation05Scroll extends BaseClassECommerce {


    @Test
    public void test() throws MalformedURLException, InterruptedException {


        AndroidDriver<MobileElement> driver = getAndroidDriver();
        Thread.sleep(5000);
        MobileElement homeScreenTitle = driver.findElementById("com.androidsample.generalstore:id/toolbar_title");
        MobileElement countrySpinner = driver.findElementById("com.androidsample.generalstore:id/spinnerCountry");

        Thread.sleep(2000);
        Assert.assertTrue(driver.findElementById("com.androidsample.generalstore:id/toolbar_title").isDisplayed());

        MobileElement nameBox = driver.findElementById("com.androidsample.generalstore:id/nameField");
        MobileElement maleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioMale");
        MobileElement femaleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioFemale");
        MobileElement letsShopButton = driver.findElementById("com.androidsample.generalstore:id/btnLetsShop");

        // Select the country

        countrySpinner.click();
        Thread.sleep(5000);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Ghana\"))");
        MobileElement selectedCountry = driver.findElementByXPath("//android.widget.TextView[@text='Ghana']");
        Assert.assertEquals(selectedCountry.getText(),"Ghana");
        selectedCountry.click();

        //Enter a name into nameBox

        nameBox.sendKeys("Ali");

        //Click the Male

        maleRadioButton.click();

        //Click letsShopButon
        letsShopButton.click();


        //Select first product

  //      1. text() method:

//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"))");
//        MobileElement firstProduct = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
//        firstProduct.click();

//        2. textStartsWith() method:
//        driver.findElementsByAndroidUIAutomator("new UiSelector().textStartsWith(\"Air Jordan 9\")");
//        MobileElement firstProduct = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
//        firstProduct.click();

//        3. textContains() method:
        driver.findElementsByAndroidUIAutomator("new UiSelector().textContains(\"dan 4 Ret\")");
        MobileElement firstProduct = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
        firstProduct.click();
        Thread.sleep(3000);

        //Select second product
        Dimension dimension =driver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.5);
        int end_y = (int) (dimension.height * 0.2);

        for (int i=0; i<1; i++) {

            TouchAction touchAction = new TouchAction(driver);
            touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).perform();
        }
         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike SFB Jungle\"))");


        MobileElement secondProduct = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
        secondProduct.click();

        // Click spet
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
        Thread.sleep(5000);














































    }



































}
