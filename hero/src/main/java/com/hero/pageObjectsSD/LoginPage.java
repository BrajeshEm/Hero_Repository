package com.hero.pageObjectsSD;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class LoginPage {
	
	public WebDriver driver;
	ActionDriver aDriver ;
	public  LoginPage(WebDriver rdriver) {
		aDriver = new ActionDriver();
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	By TextUserName = By.xpath(("//input[@id='UserName']"));
	By TextPassword = By.xpath("//input[@id='Password']");
	By btnLogin =By.xpath("//input[@id='m_login_signin_submit']");
	
	public void setUserId(String typeData,int timeOut,String eleName) throws Exception {
		
		aDriver.Type(TextUserName, eleName, timeOut, typeData);
		
	}
	
	public void setPassword(String typeData,int timeOut,String eleName) throws IOException
	{
		aDriver.Type(TextPassword, eleName, timeOut, typeData);
	}
	
	public void clickOnLoginBtn(String eleName,int timeOut) throws Exception
	{
		getUtil.ScrolldownTillPageEnd(driver); // scroll for next otion
		aDriver.click(btnLogin, timeOut, eleName);
	}
	public void clickOnLogouttn() throws Exception {
		
	}
}

