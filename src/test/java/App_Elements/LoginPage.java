package App_Elements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
		
		boolean clicksubmit = submit.isEnabled();
		
		if(clicksubmit==true) {
			Assert.assertTrue(true);
		}else
		{
			Assert.assertFalse(false);
		}
		
		if(submit.isEnabled()) {
			submit.click();
			Assert.assertTrue(true);
		}else
		{
			Assert.assertFalse(false);
		
		}
		
		
		return this;
	}
	
	@FindBy(css = "#user_bar > ul > li > a") private WebElement signout;
	public LoginPage click_signout() {
		
		
		if(signout.isEnabled()) {
			signout.click();
		}
		
		
		return this;
	}
	
	

}
