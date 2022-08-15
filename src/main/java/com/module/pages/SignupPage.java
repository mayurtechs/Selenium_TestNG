package com.module.pages;

import org.openqa.selenium.By;

import constants.Constant;

public class SignupPage{


 By firstname = By.xpath("//input[@maxlength = '10']");

 By lastname  = By.xpath("//input[@maxlength = '15']");

 By email = By.xpath("//input[@required = '']");
 
 public void enterFirstName(String text)
 {
	 Constant.driver.findElement(firstname).sendKeys(text);
 }
 public void entrLastName(String text)
 {
	 Constant.driver.findElement(lastname).sendKeys(text);;
 }
 public void enterEmail(String text)
 {
	 Constant.driver.findElement(email).sendKeys(text);
 }

}