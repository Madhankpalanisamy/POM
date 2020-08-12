package org.adactin.hotel;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends UtilityClass {
	
	public SearchHotel() {
		
		PageFactory.initElements(driver, this);
	
	}
	
	
	

	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkInDate;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkoutDate;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement btnSubmit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	
	
	
	
	
	
	}


