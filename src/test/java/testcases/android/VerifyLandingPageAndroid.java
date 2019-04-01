package testcases.android;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.TestBase;
import screens.android.HomePageAndroid;
import screens.android.LandingPageAndroid;

public class VerifyLandingPageAndroid extends TestBase{
	
	public LandingPageAndroid LandingPage;
	public HomePageAndroid HomePage;
	
	@Test  (priority = 1,enabled = true)
	public void mobileProjectIsCreated() throws Exception {
		
		LandingPage = new  LandingPageAndroid();
		HomePage = new HomePageAndroid();
		LandingPage.tapContinueWithEmailLoginLandingPage();
		LandingPage.EnterEmailAddress();
		LandingPage.TapCountinueEmailAddress();
		LandingPage.EnterPassword();
		LandingPage.TapLogin();
		
		String validateProjectName= HomePage.getProjectList();
		assertEquals(validateProjectName, "Saif");

}
}