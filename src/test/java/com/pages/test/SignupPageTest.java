package com.pages.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.module.pages.SignupPage;

import baseclass.Keywords;

public class SignupPageTest {
@Parameters({"firstName","lastName","emailid"})
@Test	
	public void TC_002(String firstName, String lastName, String emailid)
	{
	Keywords.openBrowser("Firefox");
	Keywords.openUrl("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	SignupPage sp = new SignupPage();
	sp.enterFirstName(firstName);
	sp.entrLastName(lastName);
	sp.enterEmail(emailid);
	}
}
