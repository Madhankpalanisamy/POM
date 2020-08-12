package org.adactin.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends UtilityClass {
	
	public BookHotel() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditcardNo;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement creditCardType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expiryMonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expiryYear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cVVNumber;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement btnBookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditcardNo() {
		return creditcardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getcVVNumber() {
		return cVVNumber;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	
	
	
}
