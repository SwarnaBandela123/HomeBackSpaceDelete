package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class HomeBackspaceDelete {
    public static AndroidDriver driver;


    public static void SetUp() throws MalformedURLException {
    	 DesiredCapabilities cap = new DesiredCapabilities();

         cap.setCapability("deviceName", "a6fuugukwcwseekv");
         cap.setCapability("platformName", "Android");
         cap.setCapability("appPackage", "com.android.chrome");
         cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
         URL url = new URL("http://127.0.0.1:4723/wd/hub");
         driver = new AndroidDriver(url, cap);

         System.out.println("Account verification");
     	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     	WebElement account = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]"));
     	account.click();
     	WebElement accountverify = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]"));
     	accountverify.click();
     	WebElement gotit = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
     	gotit.click();
     	System.out.println("Chrom browser lauched successfully");
         
     	
    }
    public static void main(String[] args) throws MalformedURLException {
		
		SetUp();
		WebElement enterURL = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
 		enterURL.sendKeys("https://rahulshettyacademy.com/AutomationPractice/");
 		WebElement clickURL = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
 		clickURL.click();
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		//this will lead to navigate back to mobile home screen
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		SetUp();
		//WebElement enterURL2 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
 		//enterURL2.sendKeys("https://rahulshettyacademy.com/AutomationPractice/");
 		
 		WebElement enterURL2=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
 		enterURL2.sendKeys("https://rahulshettyacademy.com/AutomationPractice/");
 		enterURL2.sendKeys("\n");
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

 		//For Backspace
 		//By using KeyEvent
 		driver.pressKey(new KeyEvent(AndroidKey.BACK));
 		
 		//Direct Method
 		driver.navigate().back();
 		
 		//By using SendKeys
 		WebElement BackSpace=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")); 		
 		BackSpace.sendKeys("\b");
    }
}
