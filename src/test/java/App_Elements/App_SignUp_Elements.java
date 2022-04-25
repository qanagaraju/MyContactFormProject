package App_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class App_SignUp_Elements {
	
	
	WebDriver driver;
	boolean signup;
	
	@FindBy(xpath="//a[contains(text(),'Free Account Sign Up!')]") private WebElement signUp;
	public App_SignUp_Elements user_click_on_signup() {
		
	
		
		if(signUp.isEnabled()) {
			signUp.click();
		} 
		
		return this;
				
	}
	
	
	
	
	@FindBy(name="name") private WebElement Name;
	public App_SignUp_Elements Insert_Name(String name) {
		Name.sendKeys(name);
		return this;
	}
	
	@FindBy(name="email") private WebElement email;
	public App_SignUp_Elements Insert_mail(String mail) {
		email.sendKeys(mail);
		return this;
	}
	
	@FindBy(name="user_signup") private WebElement SignUpName;
	public App_SignUp_Elements insert_signUpName(String signName) {
		SignUpName.sendKeys(signName);
		return this;
	}
	
	
	@FindBy(name="pass_signup") private WebElement SignUpPass;
	public App_SignUp_Elements insert_signUpPassword(String password) {
		SignUpPass.sendKeys(password);
		return this;
	}
	
	@FindBy(name="pass2") private WebElement retypePassword;
	public App_SignUp_Elements insert_retypePassword(String rpass) {
		retypePassword.sendKeys(rpass);
		return this;
	}
	
	
	@FindBy(name="useragree") private WebElement userAgree;
	public App_SignUp_Elements click_userAgree() {
		
		
		try {
			
			userAgree.click();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return this;
	}
	
	@FindBy(name="Submit")private WebElement SubmitButton;
	public App_SignUp_Elements click_SubmitButton() {
		SubmitButton.click();
		return this;
	}
	
	

}
