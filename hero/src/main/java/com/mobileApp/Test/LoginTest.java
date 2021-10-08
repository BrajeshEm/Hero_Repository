package com.mobileApp.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LoginTest {

	WebDriver driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	 
	@BeforeClass
	public void init() throws MalformedURLException{
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ONE E1003");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2fa5b6a9");//1adc23aa0107//2fa5b6a9
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		
		driver =  new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), cap);
	 
	 
	}
	
	@Test
	public void LoginTest01() throws InterruptedException
	{
		 driver.get("https://herouw.net//Forms/Index?cid=pP1wcnwLK2Q__s_&isghq=false");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@value='I Already Have an Account']")).click();
		    driver.findElement(By.xpath("//input[@data-val-length='Username may be up to 50 characters in length']")).sendKeys("Rajesh");
		    driver.findElement(By.xpath("//input[@data-val-length='Password may be up to 100 characters in length']")).sendKeys("Rajesh");
	       Thread.sleep(70000);
		    
		    driver.findElement(By.xpath("//input[@id='loginButton']")).click();
	
	}

}
