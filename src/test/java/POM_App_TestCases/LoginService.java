package POM_App_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AppBaseClass.BaseClass;
import App_Elements.LoginPage;
import App_Views.InitialViews;
import Config.BrowserDriver;

public class LoginService extends BaseClass
{
  
	//Add Dependancies
	 //App_SignUp_Elements signupElement;
	 //WebDriver driver;
	 LoginPage loginpage;
	 
	@Parameters({"uname","password"})
    @Test(description = "user valid login credentials")
    public void verify_valid_User_Login(String uname,String password)
    {
		InitialViews.init();
		
		test = extent.createTest("Login Test");
		
		BrowserDriver.getCurrentDriver(reader.getbrowserType()).get(reader.getbaseUrl());
		
    	loginpage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPage.class);
    	loginpage.Insert_UserName(uname).Insert_Password(password).click_submit();
    	
    
    	
        
    }
	
	
   
    
    
	
    
}
