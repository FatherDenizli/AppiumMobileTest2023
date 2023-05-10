package ecommerceapp;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class ECommerceShopping03 extends BaseClassECommerce{

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver<MobileElement> driver = getAndroidDriver();
        Thread.sleep(7000);



        MobileElement homeScreenTitle = driver.findElementById("toolbar_title");
        MobileElement countrySpinner = driver.findElementById("spinnerCountry");


        System.out.println(homeScreenTitle.getText());
        System.out.println(countrySpinner.getText());


        MobileElement nameBox = driver.findElementById("com.androidsample.generalstore:id/nameField");
        MobileElement maleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioMale");
        MobileElement femaleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioFemale");
        MobileElement letsShopButton = driver.findElementById("com.androidsample.generalstore:id/btnLetsShop");


        countrySpinner.click();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Monaco\"))");

        MobileElement expectedCountry = driver.findElementByXPath("//android.widget.TextView[@text='Monaco']");
        Assert.assertEquals(expectedCountry.getText(),"Monaco");
        Thread.sleep(3000);
        expectedCountry.click();



        nameBox.sendKeys("Ali");

        femaleRadioButton.click();

        letsShopButton.click();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 4 Retro\"))");
        Thread.sleep(3000);
        MobileElement addToCart1 = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
        addToCart1.click();


        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))");
        Thread.sleep(3000);
        MobileElement addToCart2 = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
        addToCart2.click();

        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElementById("com.androidsample.generalstore:id/toolbar_title").isDisplayed());

     //   First product name Air Jordan 4 Retro
        Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Air Jordan 4 Retro']").getText(),"Air Jordan 4 Retro");

        //   Second product name Converse All Star

        Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Converse All Star']").getText(),"Converse All Star");

        Thread.sleep(5000);
        //Close app
        driver.closeApp();

















    }

















}
