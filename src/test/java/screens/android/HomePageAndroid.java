package screens.android;

import org.openqa.selenium.By;

import base.ScreenBase;

public class HomePageAndroid extends ScreenBase {
	
	By ProfilePage = By.id ("com.todoist:id/btn_welcome_continue_with_email");
	By projectslist = By.id("com.todoist:id/empty_content");

public String  ProfilePage() {
	
	return driver.findElement(ProfilePage).getText();
	 
}

public String getProjectList()

{
	
	return driver.findElement(projectslist).getText();


}

}
