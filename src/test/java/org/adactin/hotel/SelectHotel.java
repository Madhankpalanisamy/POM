package org.adactin.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends UtilityClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="radiobutton_0")
	private WebElement clickRadio;

	@FindBy(xpath="//input[@id='continue']")
	private WebElement btnContinue;

	public WebElement getClickRadioHotel() {
		return clickRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
}
