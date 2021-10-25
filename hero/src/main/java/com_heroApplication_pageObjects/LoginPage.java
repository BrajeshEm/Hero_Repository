package com_heroApplication_pageObjects;

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
	By TextUserName = By.xpath("//input[@data-val-length='Username may be up to 50 characters in length']");
	By TextPassword = By.xpath("//input[@data-val-length='Password may be up to 100 characters in length']");
	By btnLogin = By.xpath("//input[@id='m_login_signin_submit']");
	By btnLogout =By.xpath("//img[@title='Logout']");
	By captchaBox = By.xpath("//div[@class='recaptcha-checkbox-border']");
	//By Logoutbtn=By.xpath("/html/body/div[3]/div/ul/li[15]/a");

	// Setup Method for Login Page	
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
	public void logout(String eleName, int timeOut) throws Exception {
		aDriver.click(btnLogout,timeOut, eleName);
	}
}

