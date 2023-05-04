package ecommerceapp;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;




public class ECommercePress05 extends BaseClassECommerce {
/*
    //1- Fill the form details and verify Toast error messages displayed appropriately for wrong inputs
    //1- hatali data ile form doldurdugunuzda hata mesajini dogrulayin
//2-Shop the items in the app by scrolling to specific Product and add to cart
//3-Validate if the items selected in the page 2 are matching with the items displayed in check out page
//4- Validate the total Amount displayed in the checkout page matches with sum of product amounts selected for shopping
//5-Validate Mobile gestures working for link (long press) and navigate to WebView
//6-Verify if user can do operations on Web view and navigate back to native app if needed.
(go to google and search “appium” then navigate to NATIVE APP and verify it)

     */

    @Test
    public void positiveTest() throws MalformedURLException, InterruptedException {

        AndroidDriver<MobileElement> driver = getAndroidDriver();
        Thread.sleep(7000);

        MobileElement homeScreenTitle = driver.findElementById("com.androidsample.generalstore:id/toolbar_title");
        System.out.println(homeScreenTitle.getText());
        MobileElement countrySnipper = driver.findElementById("com.androidsample.generalstore:id/spinnerCountry");
        MobileElement nameBox=driver.findElementById("com.androidsample.generalstore:id/nameField");
        MobileElement maleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioMale");
        MobileElement FemaleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioFemale");
        MobileElement LetsShopButton = driver.findElementById("com.androidsample.generalstore:id/btnLetsShop");


        Assert.assertEquals("General Store", homeScreenTitle.getText());
        Assert.assertTrue(driver.findElementById("com.androidsample.generalstore:id/toolbar_title").isDisplayed());



//        To select Country
        countrySnipper.click();
        Thread.sleep(4000);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belgium\"))");
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belgium\"))");

        Thread.sleep(4000);
        MobileElement selectedCountry = driver.findElementByXPath("//android.widget.TextView[@text='Belgium']");
        selectedCountry.click();
        Thread.sleep(4000);
//        System.out.println(selectedCountry.getText());
//        Assert.assertEquals(selectedCountry.getText(), "Belgium");
        nameBox.sendKeys("Ali");
        maleRadioButton.click();
        LetsShopButton.click();

//ik urun secilsin
//        driver.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();
//        Thread.sleep(2000);
//        //ikinci urun sec
//        driver.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();


       // (//android.widget.TextView[@text='ADD TO CART'])[1]





         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 4 Retro\"));");
         MobileElement        addToCart1= driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
         addToCart1. click(); // prod.addToCart.get(1).click();



        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"$120.0\"));");
        Thread.sleep(3000);
        MobileElement  addToCart2= driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
        Thread.sleep(3000);
        addToCart2. click(); // prod.addToCart.get(1).click();


        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike Blazer Mid '77\"));");
        MobileElement        addToCart3= driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
        addToCart3. click(); // prod.addToCart.get(1).click();


//sepete tikla

        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
        Thread.sleep(3000);

        //sepette ol
       MobileElement toolBarTitle= driver.findElementById("com.androidsample.generalstore:id/toolbar_title");
        Assert.assertTrue(toolBarTitle.isDisplayed());
        System.out.println(toolBarTitle.getText());

        //ilk urunun adi Air Jordan 4 Retro

        Assert.assertEquals(driver.findElementByXPath("//*[@text='Air Jordan 4 Retro']").getText(), "Air Jordan 4 Retro");


        //ikinci urun adi = Air Jordan 1 Mid SE



        Assert.assertEquals(driver.findElementByXPath("//*[@text='Air Jordan 1 Mid SE']").getText(), "Air Jordan 1 Mid SE");







    }
}