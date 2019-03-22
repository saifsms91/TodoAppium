package screens.android;

import org.openqa.selenium.By;

import base.ScreenBase;

public class LandingPageAndroid extends ScreenBase{
	
	By ContinueWithEmailLogin = By.id("com.todoist:id/btn_welcome_continue_with_email");
	By EnterEmailAddesss =		By.id("com.todoist:id/email_exists_input");
	
	public void tapContinueWithEmailLogin() {
		System.out.println("ContinueWithEmailLogin: " + driver);
		driver.findElement(ContinueWithEmailLogin).click();
	}
	
	public void EnterEmailAddesss() {
		System.out.println("ContinueWithEmailLogin: " + driver);
		driver.findElement(ContinueWithEmailLogin).sendKeys("saifsma91@yopmail.com");
	}
}
