package ecommerceapp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

import static ecommerceapp.BaseClassECommerce.getAndroidDriver;

public class ECommerceLongPress05 {

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

        //1- Fill the form details and verify Toast error messages displayed appropriately for wrong inputs
        //1- hatali data ile form doldurdugunuzda hata mesajini dogrulayin

        MobileElement homeScreenTitle = driver.findElementByXPath("//android.widget.TextView[@text='General Store']");
        MobileElement countrySnipper = driver.findElementById("com.androidsample.generalstore:id/spinnerCountry");

        MobileElement nameBox = driver.findElementById("com.androidsample.generalstore:id/nameField");
        MobileElement maleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioMale");
        MobileElement femaleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioFemale");
        MobileElement letsShopButton = driver.findElementById("com.androidsample.generalstore:id/btnLetsShop");

        Assert.assertTrue(homeScreenTitle.isDisplayed());

        //ulkeyi secmek icin ulke butununa bastik
        countrySnipper.click();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belgium\"))");

        //ulkeyi sececegiz
        MobileElement expectedCountry = driver.findElementByXPath("//android.widget.TextView[@text='Belgium']");

        expectedCountry.click();
        Thread.sleep(3000);

        //istedigimiz ulkeyi dogru olarak sectik mi?
       MobileElement selectedCountry = driver.findElementByXPath("//android.widget.TextView[@text='Belgium']");
        System.out.println(selectedCountry.getText());
       Assert.assertEquals(selectedCountry.getText(),"Belgium" );

        //negative case icin name bos olmali
      //  Assert.assertTrue(nameBox.getText().isEmpty());

        nameBox.sendKeys("Ali");

        //female secilsin
        femaleRadioButton.click();
        //shop butonuna tiklayalim
        letsShopButton.click();
        //basarili girildi
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementById("com.androidsample.generalstore:id/toolbar_title").isDisplayed());

        //ik urun secilsin
//        driver.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();
//        Thread.sleep(2000);
//        //ikinci urun sec
//        driver.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();

          driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 4 Retro\"))");
          Thread.sleep(3000);
          MobileElement addToCart1 = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
          addToCart1.click();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"$120.0\"))");
        Thread.sleep(3000);
        MobileElement addToCart2= driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
        addToCart2.click();

//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike Blazer Mid '77\"))");
//        Thread.sleep(3000);
//        MobileElement addToCart3 = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
//        addToCart3.click();

        //sepete tikla
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();

        // Assert on page
//        Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Cart']").isDisplayed());
//        Thread.sleep(3000);

        //Ilk urun adi Air Jordan 4 Retro
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 4 Retro\"))");
        Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Air Jordan 4 Retro']").getText(),"Air Jordan 4 Retro");

        //Ikinci urun adi Air Jordan 1 Mid SE
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"$120.0\"))");
        Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']").getText(),"Air Jordan 1 Mid SE");

        //sepetteki iki urunun toplami ile genel toplami karsilastirma

//      1. Urun
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 4 Retro\"))");
        Thread.sleep(3000);

        String priceOfProduct1=driver.findElementByXPath("//android.widget.TextView[@text='$160.97']").getText();
        priceOfProduct1=priceOfProduct1.substring(1);


        double  price1=Double.valueOf(priceOfProduct1);
        System.out.println(price1);
//      2. Urun

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 1 Mid SE\"))");
        Thread.sleep(3000);

        String priceOfProduct2 = driver.findElementByXPath("//android.widget.TextView[@text='$120.0']").getText();

        priceOfProduct2=priceOfProduct2.substring(1);

        Double price2=Double.valueOf(priceOfProduct2);
        System.out.println(price2);

       double actualTotal = price1+price2;

        // Total price

        String totalPrice = driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();

        totalPrice = totalPrice.substring(1);

     double total=Double.valueOf(totalPrice);
        System.out.println(total);

    Assert.assertEquals(actualTotal,total);

        //term of conditons gormek icin long press yapilmali



        MobileElement termButton = driver.findElementById("com.androidsample.generalstore:id/termsButton");
        TouchAction touchAction = new TouchAction(driver);

        touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(termButton)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).release().perform();

        Thread.sleep(4000);



        MobileElement closeButton=driver.findElementById("android:id/button1");
        Assert.assertTrue(closeButton.isDisplayed());
        closeButton.click();

        Thread.sleep(4000);

        driver.closeApp();










































    }















}
