package App_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.BrowserDriver;
import POM_App_Utilities.AppScreens;

public class LoginPage {
	
	AppScreens screens;
	// WebDriver driver;
	
	@FindBy(name="user") private WebElement username;
	public LoginPage Insert_UserName(String un) {
		username.sendKeys(un);
		
		return this;
	}
	
	
	@FindBy(name = "pass") private WebElement password;
	public LoginPage Insert_Password(String pw) {
		password.sendKeys(pw);
		 
		return this;
	}
	
	@FindBy(name = "btnSubmit") private WebElement submit;
	public LoginPage click_submit() {
		submit.click();
		return this;
	}
	
	@FindBy(css = "#user_bar > ul > li > a") private WebElement signout;
	public LoginPage click_signout() {
		signout.click();
		
		return this;
	}
	
	

}
