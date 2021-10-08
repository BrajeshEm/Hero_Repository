package com.hero.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;

public class getUtil extends StartBrowser{
   
	public WebDriver ldriver;
	public static long PAGE_LOAD_TIMEOUT = 20000;
	public static long IMPLICITY_WAIT = 20000;
	
	public getUtil(WebDriver rdriver) {
		this.ldriver = rdriver;
	}
	
	public static void TakeScreenOnTestFail(String eleName) throws IOException
	{
		ActionDriver ad = new ActionDriver();
		ad.TakeScreenShotOnFail(eleName);
		
	}
	public static void TakeScreenShotOnPass(String eleName) throws IOException
	{
		ActionDriver ad = new ActionDriver();
		ad.TakeScreenShotOnPass(eleName);
		
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement elelment,String dateval)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value' ,'"+dateval+"');",elelment);
	}
	
	public static void ScrolldownTillPageEnd(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	// This Method generated Automatic String
		public static String randomString() {
			String randomstring = RandomStringUtils.randomAlphabetic(5);
			return (randomstring);
		}

		// This Method generated Automatic Numeric.
		public static String randomNumeric() {
			String randomsnumeric = RandomStringUtils.randomNumeric(10);
			return (randomsnumeric);
		}
			
		public static void acrollIntoView(WebElement element,WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",element);
		}
		
		public static void ClickElementByJS(WebElement element, WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}
		
		public static void enterTextByJS(String value,WebElement element, WebDriver driver) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("arguments[0].value='"+value+"';", element);
		}
		
		public static void clickByRobotKey() throws AWTException
		{
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
		}
		public static void clickByAction(WebDriver driver) throws AWTException
		{
			Actions action = new Actions(driver); 
		    action.sendKeys(Keys.ENTER).build().perform();
			
		}
		
		public void getJSDropdown(String dropDown, String elementID)throws Exception{

		     JavascriptExecutor executor = (JavascriptExecutor)driver;
		     String dropdownScript = "var select = window.document.getElementById('" + 
		             dropDown +
		             "'); for(var i = 0; i < select.options.length; i++){if(select.options[i].text == '" +
		             elementID +
		             "'){ select.options[i].selected = true; } }";

		     Thread.sleep(2000);
		     executor.executeScript(dropdownScript);
		     Thread.sleep(2000);

		     String clickScript = "if ("+"\"createEvent\""+" in document) {var evt = document.createEvent("+"\"HTMLEvents\""+");     evt.initEvent("+"\"change\""+", false, true); " + dropDown + ".dispatchEvent(evt); } else " + dropDown + ".fireEvent("+"\"onchange\""+");";

		     executor.executeScript(clickScript);

		 }
}
