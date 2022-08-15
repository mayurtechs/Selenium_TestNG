package com.module.pages;

import org.openqa.selenium.By;

import constants.Constant;

public class SignupPage{


 By firstname = By.xpath("//input[@maxlength = '10']");

 By lastname  = By.xpath("//input[@maxlength = '15']");

 By email = By.xpath("//input[@required = '']");
 
 public void enterFirstName(String firstName)
 {
	 Constant.driver.findElement(firstname).sendKeys(firstName);
 }
 public void entrLastName(String lastName)
 {
	 Constant.driver.findElement(lastname).sendKeys(lastName);;
 }
 public void enterEmail(String emailid)
 {
	 Constant.driver.findElement(email).sendKeys(emailid);
 }

}