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


        //MobileElement countrySpinner = driver.findElementById("android:id/text1");


//        MobileElement homeScreenTitle = driver.findElementById("toolbar_title");
//        MobileElement countrySpinner = driver.findElementById("spinnerCountry");

         MobileElement homeScreenTitle = driver.findElementById("com.androidsample.generalstore:id/toolbar_title");
        Thread.sleep(3000);
        MobileElement countrySpinner = driver.findElementById("com.androidsample.generalstore:id/spinnerCountry");
        Thread.sleep(3000);

//        Assert.assertEquals("General Store", homeScreenTitle.getText());
//        System.out.println(homeScreenTitle.getText());

        MobileElement nameBox = driver.findElementById("com.androidsample.generalstore:id/nameField");
        MobileElement maleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioMale");
        MobileElement femaleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioFemale");
        MobileElement letsShopButton = driver.findElementById("com.androidsample.generalstore:id/btnLetsShop");

//ana sayfa da miyiz? onayladik

        //ulkeyi secmek icin ulke butununa bastik
        countrySpinner.click();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"))");
        driver.findElementByXPath("//android.widget.TextView[@text='Angola']").click();

        //istedigimiz ulkeyi dogru olarak sectik mi?
        String selectedCountry=driver.findElementByXPath("//android.widget.TextView[@text='Angola']").getText();
        System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Angola']").getText());
        Assert.assertEquals("Angola" ,selectedCountry );
        Thread.sleep(3000);

        // nameBox should be free for negative case
        nameBox.sendKeys("Ali");
 //     Assert.assertTrue(nameBox.getText().isEmpty());

        nameBox.clear();

// femaleRadioButton should be selected
        femaleRadioButton.click();
        // click shopButton
        letsShopButton.click();
        Thread.sleep(3000);


        // Verify errror message

//        MobileElement errorPopUpText = driver.findElementByXPath("//android.widget.Toast[@text='Please enter your name']");
//        String errorText = errorPopUpText.getText();
//        Assert.assertEquals(errorText, "Please enter your name");

        //close app
        driver.closeApp();







































    }
















}
