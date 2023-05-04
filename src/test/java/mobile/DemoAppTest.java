package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoAppTest {



    AndroidDriver<MobileElement> driver;

    @BeforeTest

    public void setUp() throws MalformedURLException, InterruptedException {

//
            DesiredCapabilities cap = new DesiredCapabilities();

            //cap.setCapability("chromedriverExecutable", "./src/test/java/resources/drivers/chromedriver.exe");
          //  Thread.sleep(10000);
           // cap.setCapability("browsername", "chrome");


        cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "8.1.0");

            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        cap.setCapability("app", "C:\\apkfiles\\ApiDemos.apk");
        //   cap.setCapability("deviceName", "Android Emulator");
        //   cap.setCapability("deviceName", "Pixel 2 API 28");


        cap.setCapability("appPackage", "io.appium.android.apis");
        cap.setCapability("appActivity", ".ApiDemos");



        driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);


//        }catch(Exception e){
//            System.out.println("NP");
//
//        }
   }

    @Test
    public void  test1() throws InterruptedException {


        //Vertical scroling
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='NFC']")).click();//NFC
         Thread.sleep(10000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='ForegroundDispatch']")).click();//ForegroundDispatch

         driver.navigate().back();
         driver.navigate().back();

    }


    @Test
    public void  test2() throws InterruptedException {
        Thread.sleep(10000);
        // Click preference
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Preference']")).click();

        //  Preference dependencies
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        // Check box
        driver.findElement(By.id("android:id/title")).click();
        Thread.sleep(10000);
        driver.navigate().back();
        driver.navigate().back();


    }
    @Test
    public void  test3()   {


        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Seeking']")).click();

        driver.findElement(By.id("io.appium.android.apis:id/startButton")).click();

        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();


//        Actions actions=new Actions(driver);
//
//       // actions.dragAndDropBy(driver.findElement(By.id("io.appium.android.apis:id/seekBar"), )      dragAndDropBy().build().perform();
//         WebElement obj= driver.findElement(By.id("io.appium.android.apis:id/seekBar")) ;
//        TouchAction action=new TouchAction(driver);
//        action.longPress(ElementOption.element(obj)).moveTo(ElementOption.element(obj,200,200)).release();


    }










//         @AfterTest
//
//             public void tearDown(){
//
//             driver.close();
//
//
//         }

    }
