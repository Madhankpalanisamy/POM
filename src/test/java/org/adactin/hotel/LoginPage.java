package org.adactin.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends UtilityClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id= "username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtUserPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtUserPassword() {
		return txtUserPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

		
	
	
	
		
		
		
		
	

}
