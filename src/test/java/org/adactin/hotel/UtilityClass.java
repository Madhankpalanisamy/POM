package org.adactin.hotel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	
	public static WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhan Kumar\\eclipse-workspace\\POM\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public void loadurl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void type(WebElement txtUserName,String userName	) {
		txtUserName.sendKeys(userName);
		
	}
	
	public void btnClick(WebElement btnLogin) {
		boolean displayed = btnLogin.isDisplayed();
		System.out.println("Login Button is display : " +displayed);
		btnLogin.click();

	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void selectByVisibleText(WebElement location,String equals) {
		
		Select select = new Select(location);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			if (text.equals(equals)) {
				select.selectByVisibleText(text);
				
			}
			
		}
		
		
	}
	
	public void selectByValue(WebElement hotel,String equals) {
		
		Select select = new Select(hotel);
		List<WebElement> options = select.getOptions();
		for(WebElement eachHotel : options) {
			String attribute = eachHotel.getAttribute("value");
			if (attribute.equals(equals)) {
				eachHotel.click();
				
			}
		}
		
	}
	
	
	public void selectByIndex(WebElement roomType, int index) {
		Select select = new Select(roomType);
		select.selectByIndex(index);
		}
	
	public void getCheckInDateDetails(WebElement elementDate,String date ) {
		elementDate.sendKeys(date);
	}
	
	public void getSearchDetails(WebElement search) {
		search.click();
	}
	
	public void selectHotelDetails(WebElement selectHotel) {
		boolean displayed = selectHotel.isDisplayed();
		System.out.println("selected hotel is displayed : " +displayed);
		boolean enabled = selectHotel.isEnabled();
		System.out.println("select option is enabled  : " +enabled);
		selectHotel.click();
	
	}
	
	public void clickContinueButton(WebElement continuebutton) {
		continuebutton.click();
	}
	
	public void getAttribute(WebElement attribute) {
		String orderNo = attribute.getAttribute("value");
		System.out.println("Order id is : " +orderNo);
	}
	
	
	
}





