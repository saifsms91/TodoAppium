package screens.android;

import org.openqa.selenium.By;

import base.ScreenBase;

public class LandingPageAndroid extends ScreenBase{
	
	By ContinueWithEmailLoginLandingpage = By.id("com.todoist:id/btn_welcome_continue_with_email");
	By EnterEmailAddesss =		By.id("com.todoist:id/email_exists_input");
	By TapCountinueEmailAddress = By.id("com.todoist:id/btn_continue_with_email");
	
	public void tapContinueWithEmailLoginLandingPage() {
		System.out.println("ContinueWithEmailLoginLandingpage: " + driver);
		driver.findElement(ContinueWithEmailLoginLandingpage).click();
	}
	
	public void EnterEmailAddesss() {
		
		driver.findElement(EnterEmailAddesss).sendKeys("saifsma91@yopmail.com");
	}
	
	public void TapCountinueEmailAddress()
	
	{
		driver.findElement(TapCountinueEmailAddress).click();

	}
}
