package com.module.pages;

import org.openqa.selenium.By;


import constants.Constant;

public class LoginPage {
	
		By email = By.id("email");
		
		By password = By.id("pass");
		
		By loginbtn = By.name("login");
		
		
	public void enterEmail(String text)
	{
			Constant.driver.findElement(email).sendKeys(text);
	}
	
	public void enterPswd(String text)
	{
		Constant.driver.findElement(password).sendKeys(text);
	}
	public void clickOnButton()
	{
		Constant.driver.findElement(loginbtn).click();
	}
	
}
