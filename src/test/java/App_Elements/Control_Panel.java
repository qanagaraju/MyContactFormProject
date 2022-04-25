package App_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Control_Panel {
	
	
	@FindBy(xpath = "//*[@id='right_col_bottom']//a[text()='My User Information']") private WebElement myUserInfo;
	public Control_Panel User_click_myUser_Information() {
		
		myUserInfo.click();
	return this;	
	}
	
	/*
	@FindBy(xpath="//a[contains(text(),'Add E-mail Address')]") private WebElement addEmails;
	public Control_Panel user_click_addEmail() {
		addEmails.click();
		return this;
		
		
	}
	
	@FindBy(name="newemail") private WebElement insert_mail;
	public Control_Panel insert_user_email(String email) {
		insert_mail.sendKeys(email);
		return this;
	}

	@FindBy(name="submit") private WebElement submitEmail;
	public Control_Panel user_click_submitEmail() {
		submitEmail.click();
		return this;
	}

*/
}
