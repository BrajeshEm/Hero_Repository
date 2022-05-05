package com.heroApplication.testCases;

import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsMK.LoginPage;
import com.hero.pageObjectsMK.addPeoPage;

public class user_loginTest_01 extends StartBrowser{
	
	@Test
	public void verifyRegWithSpousePln() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		addPeoPage au = new addPeoPage(driver);
		LoginPage lg = new LoginPage(driver);
		
		lg.setUserId("brajesh.admin", 10, "userName");
		lg.setPassword("Password@2", 10, "userName");
		lg.clickOnLoginBtn("Login button", 10);

	}
}
	