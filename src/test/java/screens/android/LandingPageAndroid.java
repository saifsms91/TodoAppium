package screens.android;

import org.openqa.selenium.By;

import base.ScreenBase;

public class LandingPageAndroid extends ScreenBase{
	
	By ContinueWithEmailLoginLandingpage = By.id("com.todoist:id/btn_welcome_continue_with_email");
	By EnterEmailAddress =		By.id("com.todoist:id/email_exists_input");
	By TapCountinueEmailAddress = By.id("com.todoist:id/btn_continue_with_email");
	By EnterPassword = By.id("com.todoist:id/log_in_password");
	By TapLogin = By.id("com.todoist:id/btn_log_in");
	
	
	public void tapContinueWithEmailLoginLandingPage() {
		System.out.println("ContinueWithEmailLoginLandingpage: " + driver);
		driver.findElement(ContinueWithEmailLoginLandingpage).click();
	}
	
	public void EnterEmailAddress() {
		
		driver.findElement(EnterEmailAddress).sendKeys("saifsma91@yahoomail.com");
	}
	
	public void TapCountinueEmailAddress()
	
	{
		driver.findElement(TapCountinueEmailAddress).click();

	}
	
	public void EnterPassword() {
		
		driver.findElement(EnterPassword).sendKeys("Testing@01");

	}
	
public void TapLogin() {
		
		driver.findElement(TapLogin).click();

	}
	
	
}
