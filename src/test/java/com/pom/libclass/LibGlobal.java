package com.pom.libclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhan Kumar\\eclipse-workspace\\SeleniumDay1\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public void loadUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void type(WebElement txtUserName,String data ) {
		txtUserName.sendKeys(data);
	}
	
	public void btnClick(WebElement login) {
		login.click();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
