package com.hero.config;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.hero.pageObjects.LoginPage;
import com.hero.utilities.Readconfig;

public class CommonUses {

	public static WebDriver driver;
	public static ActionDriver aDriver;
	public LoginPage login;
	public CommonUses() {
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}
	
	public void login() throws Exception {
		StartBrowser.test.createNode("Go to MainHomePage");
		aDriver.navigateToApplication();
		login = new LoginPage(driver);
		login.setUserId(Readconfig.getApplicationUserName(), 10, " UserName");
		login.setPassword(Readconfig.getApplicationPassword(), 10, " Password ");
		login.clickOnLoginBtn(" Login ", 10);
	}
	
	public void login1() throws Exception {
		StartBrowser.test.createNode("Go to MainHomePage");
		aDriver.navigateToApplicationGHQ();
		login = new LoginPage(driver);
		login.setUserId(Readconfig.getApplicationUserName1(), 10, " UserName");
		login.setPassword(Readconfig.getApplicationPassword1(), 10, " Password ");
		login.clickOnLoginBtn(" Login ", 10);
	}
	
	public void LogOut() throws Exception {
		login.logout("btnLogin",5);
	}
}
