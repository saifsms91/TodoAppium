package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class CommonUtils {
	
	DesiredCapabilities caps = new DesiredCapabilities();
	
    public AppiumDriver<MobileElement> driver;
    
    public void setup(String platformName, String deviceName, String uri) throws MalformedURLException {
    	caps.setCapability("platformName", platformName);
    	caps.setCapability("deviceName", deviceName);
    	caps.setCapability("app", uri);
    	caps.setCapability("noReset", true);
    	URL remoteUrl = new URL("http://localhost:4723/wd/hub");
    	caps.setCapability("appPackage", "com.todoist"); 
    	caps.setCapability("appActivity","com.todoist.activity.HomeActivity"); 
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
    }
    
  
    }




