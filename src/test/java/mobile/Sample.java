package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Sample {


    public AndroidDriver  driver;
    @BeforeTest
    public void setUp() throws InterruptedException, MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();


        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");

        //  cap.setCapability("chromeOptions", ImmutableMap.of("w3c",false));

        //  cap.setCapability(MobileCapabilityType.APP, "APK PATH OF CHROME"); // browserde calistirmak icin bunlari sildik
        //cap.setCapability("executableChromedriver", "absolutePatofChromedrive if need");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        Thread.sleep(3000);
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        cap.setCapability(MobileCapabilityType.NO_RESET,true);
        cap.setCapability("chromedriverExecutable", "C:\\Users\\user\\IdeaProjects\\AppiumTechpro2022\\src\\main\\resources\\drivers\\chromedriver112.exe");


        Thread.sleep(3000);

        //       cap.setCapability(MobileCapabilityType.NO_RESET, true);
        // If you want to start your app as installed before use below code.
//        cap.setCapability("appPackage","com.android.chrome");
//        cap.setCapability("appActivity","com.google.android.apps.chrome.Main");

        driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test
           public void test1() throws InterruptedException {
        driver.get("https://walmart.ca/");
             Thread.sleep(30000);



         }




        // print the title
//        System.out.println("Title "+driver.getTitle());
//
//// enter username
//        driver.findElement(By.name("email")).sendKeys("mukesh@gmail.com");
//
//// enter password
//        driver.findElement(By.name("pass")).sendKeys("mukesh_selenium");
//
//// click on submit button
//        driver.findElement(By.id("u_0_5")).click();
//
//// close the browser
//        driver.quit();


        /*
    @BeforeTest
    public void setup() throws MalformedURLException, InterruptedException {


        DesiredCapabilities cap = new DesiredCapabilities();

     //   cap.setCapability("chromedriverExecutable",  "./src/test/java/resources/drivers/chromedriver.exe");
      // cap.setCapability("chromedriverExecutableDir",  System.getProperty("user.data")+"/resources/drivers/chromedriver.exe");


    //    Thread.sleep(15000);
        cap.setCapability("browserName", "chrome");
        //cap.setCapability("device", "android");

        cap.setCapability("deviceName", "Android Emulator");
        cap.setCapability("platformversion", "11.0");
        cap.setCapability("platformName", "Android");
        //cap.setCapability("deviceName", "Pixel 2 API 30");




//        cap.setCapability("appPackage", "com.android.chrome");
//        cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");

        cap.setCapability("appPackage", "com.android.chrome");
        Thread.sleep(5000);
        cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        Thread.sleep(5000);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));


        System.out.println("Pass");







    }

//            DesiredCapabilities cap = new DesiredCapabilities();
//            cap.setCapability("platformName", "Android");
//            cap.setCapability("platformVersion", "11.0");
//            cap.setCapability("app", "C:\\apkfiles\\ApiDemos.apk");
//            cap.setCapability("deviceName", "Android Emulator");
//            cap.setCapability("automationName", "UiAutomator2");


    @Test
    public void test() {
        // Open url
        driver.get("https://walmart.ca/");
        System.out.println("Pass");
      ///
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // print the title
       //

   //

// enter username
   //     driver.
// enter password

*/



}