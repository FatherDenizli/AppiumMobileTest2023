package ecommerceapp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static ecommerceapp.BaseClassECommerce.getAndroidDriver;

public class EcommerceNegativeLogin extends BaseClassECommerce{
/*
    //1- Fill the form details and verify Toast error messages displayed appropriately for wrong inputs
    //1- hatali data ile form doldurdugunuzda hata mesajini dogrulayin
//2-Shop the items in the app by scrolling to specific Product and add to cart
//3-Validate if the items selected in the page 2 are matching with the items displayed in check out page
//4- Validate the total Amount displayed in the checkout page matches with sum of product amounts selected for shopping
//5-Validate Mobile gestures working for link (long press) and navigate to WebView //6-Verify if user can do operations on Web view and navigate back to native app if needed.
(go to google and search “appium” then navigate to NATIVE APP and verify it)

     */

    @Test

    public void negativeTest() throws MalformedURLException, InterruptedException {

        AndroidDriver<MobileElement> driver=getAndroidDriver();
        Thread.sleep(3000);

        //1- Fill the form details and verify Toast error messages displayed appropriately for wrong inputs
        //1- hatali data ile form doldurdugunuzda hata mesajini dogrulayin
        System.out.println("all");
       // MobileElement homeScreenTitle = driver.findElementByXPath("//android.widget.TextView[@text='General Store']");

       // MobileElement countrySpinner =driver.findElementById("com.androidsample.generalstore:id/spinnerCountry");


        //Assert.assertEquals("General Store", homeScreenTitle.getText());























    }
















}
