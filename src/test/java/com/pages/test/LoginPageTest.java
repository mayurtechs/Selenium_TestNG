package com.pages.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.module.pages.LoginPage;

import baseclass.Keywords;
import utility.ExcelFile;

public class LoginPageTest {
@Test
	public void TC_001() throws IOException
	{
	    Keywords.openBrowser("Firefox");
	    Keywords.openUrl("https://www.facebook.com/");
		LoginPage lp = new LoginPage();
		lp.enterEmail(ExcelFile.getCellData(1, 0).toString());
		lp.enterPswd(ExcelFile.getCellData(1, 1).toString());
		lp.clickOnButton();
		
	}
}
