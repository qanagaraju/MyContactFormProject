package POM_App_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AppBaseClass.BaseClass;
import App_Elements.Control_Panel;
import Config.BrowserDriver;

public class control_Panel extends BaseClass {
	
	Control_Panel panel;
	
	
	
	@Test
	public void verify_user_information() {
		
		test = extent.createTest("Control panel Test");
		
		panel = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Control_Panel.class);
		panel.User_click_myUser_Information();
	
		
		BrowserDriver.getCurrentDriver().quit();
		
		
	}

}
