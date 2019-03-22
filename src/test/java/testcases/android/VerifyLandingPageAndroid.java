package testcases.android;

import org.testng.annotations.Test;

import base.TestBase;
import screens.android.LandingPageAndroid;

public class VerifyLandingPageAndroid extends TestBase{
	
	public LandingPageAndroid LandingPage;
	
	@Test  (priority = 1,enabled = true)
	public void VerifyLandingPageAndroid() throws Exception {
		
		LandingPage = new  LandingPageAndroid();

		LandingPage.tapContinueWithEmailLogin();
	}


}
