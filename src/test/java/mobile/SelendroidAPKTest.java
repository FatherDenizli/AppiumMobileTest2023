package mobile;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class SelendroidAPKTest {

        public AndroidDriver driver;
    @BeforeTest
    public void test() throws MalformedURLException {

       try {
            DesiredCapabilities cap = new DesiredCapabilities();
            String url = "http://127.0.0.1:4723/wd/hub";
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "8.1.0");
            cap.setCapability("app", "C:\\apkfiles\\selendroid-test-app-0.17.0.apk");
            cap.setCapability("deviceName", "RealDevice");
            cap.setCapability("automationName", "UiAutomator2");

            driver = new AndroidDriver(new URL(url), cap);

    }catch(Exception e){
            System.out.println("pass");
     }


    }

        @Test
          public void selendroidTest() throws InterruptedException {
         // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // driver.findElement(By.id("my_text_fieldCD")).sendKeys("future");
            Thread.sleep(10000);
            driver.findElement(By.xpath("//android.widget.Button[@content-desc='visibleButtonTestCD']")).click();//Click Display text view
           // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("future");//Send word "future" to text input
          //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();//Google click

           //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
             driver.findElement(By.id("io.selendroid.testapp:id/spinner_webdriver_test_data")).click();//'Say Hello'-Demo click
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

             driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[1]")).click();


           //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
             driver.findElement(By.id("io.selendroid.testapp:id/spinner_webdriver_test_data")).click();//second time  :  'Say Hello'-Demo click
           //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[2]")).click();
//           xhtmlTestPage click

           String textOpenAWindow= driver.findElement(By.xpath("//android.view.View[@content-desc='Open a window with a close button']/android.widget.TextView")).getText();
//          Open a window with a close button

            Assert.assertTrue(textOpenAWindow.equals("Open a window with a close button"));
//          Open a window with a close button   text assertion
            System.out.println(textOpenAWindow);





           //**Sending data to the text field**//
           // driver.findElement(By.id("my_text_field")).sendKeys("Selendroid Test");

        //**Clicking on the button**//



        }


    }
