package com.pom.libclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBook  {

	public static void main(String[] args) {
		//Creating object for libglobal class
		LibGlobal global = new LibGlobal();
		
		//Calling the getDriver Method
		WebDriver driver = global.getDriver();
		
		global.loadUrl("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		global.type(txtUserName, "8098951396");
		
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		global.type(txtPassWord, "Manmadhan12");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		global.btnClick(btnLogin);
		
		global.quitBrowser();
		
	}

}
