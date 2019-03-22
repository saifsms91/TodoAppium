package base;

import java.net.MalformedURLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.AppiumDriver;
import screens.android.LandingPageAndroid;
import utils.CommonUtils;

public class TestBase {

	public static AppiumDriver driver;
	public LandingPageAndroid LandingPage;
	
	
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/TodoReport.html");

	private static final String ANDROID_URI = "/Users/saif.siddiqui/Desktop/SaifLearning/src/test/resources/app/Todoist_v12.8_apkpure.com.apk";

	@BeforeSuite
	
	
	public void setUp() throws MalformedURLException {
		System.out.println("setting the suite");
		pageObjectConfig();
		System.out.println("Setup TestCase");

		CommonUtils utils = new CommonUtils();

		utils.setup("Android", "Motorola", ANDROID_URI);
		driver = utils.driver;

	}

	private void pageObjectConfig() {
		
		LandingPage = new  LandingPageAndroid();
		
	}


	@AfterSuite public void tearDown() {
	 
	  driver.quit();
	 }
	 
}
