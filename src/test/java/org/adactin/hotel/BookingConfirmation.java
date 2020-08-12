package org.adactin.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends UtilityClass {
	
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderNo;
	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logOut;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getLogOut() {
		return logOut;
	}
	
	
	
	

}
