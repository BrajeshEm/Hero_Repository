package com.mobileApp.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hero.utilities.getUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ChromeCheck {

	
	public class Amazon {
		 
		WebDriver driver;
		DesiredCapabilities cap = new DesiredCapabilities();
		 
		@BeforeClass
		public void init() throws MalformedURLException{
			
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0.0");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "1adc23aa0107");//1adc23aa0107//2fa5b6a9
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
			cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			//cap.setCapability(MobileCapabilityType.NO_RESET, true);
			
			driver =  new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 
		 
		}
		
		public void scroll(WebElement ele) {

			for (int i = 1; i < 4; i++) {
				try {
					Thread.sleep(1000);
					ele.click();

					break;

				} catch (Exception e) {

					Dimension dims = driver.manage().window().getSize();
					int x = (int) (dims.getWidth() / 2);
					int y = (int) (dims.getHeight() * .8);

					int endy = (int) (dims.getHeight() * .3);

					System.out.println("Swiping top to bottom");

					new TouchAction((PerformsTouchActions) driver).press(new PointOption().withCoordinates(x, y))
							.waitAction(new WaitOptions().withDuration(Duration.ofMillis(500)))
							.moveTo(new PointOption().withCoordinates(x, endy)).release().perform();

				} }
			}
		
		public void setDate(WebDriver driver, String value, WebElement calLocator) throws InterruptedException
		{
			JavascriptExecutor jse= (JavascriptExecutor)driver;
			String script= "arguments[0].setAttribute('value','"+value+"');";
			Thread.sleep(1000);
			jse.executeScript(script, calLocator);
		}
		 
		@Test
		public void testApp() throws MalformedURLException, InterruptedException {
		 
		
		    System.out.println("Ajit");
		    driver.get("https://herouw.net//Forms/Index?cid=pP1wcnwLK2Q__s_&isghq=false");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@value='REGISTER']")).click();
		    driver.findElement(By.xpath("//input[@value='START']")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//input[@id='Step1Data_FirstName']")).sendKeys("Hero");
		   driver.findElement(By.xpath("//input[@id='Step1Data_LastName']")).sendKeys("Hero");
		    driver.findElement(By.xpath("//input[@id='Step1Data_Suffix']")).sendKeys("He");
		    Thread.sleep(1000);
		    //driver.findElement(By.xpath("//input[@id='Step1Data_DayTimePhone']")).sendKeys("(222)");
		    Thread.sleep(2000);
		    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		  //get current date time with Date()
		  Date date = new Date();

		  // Now format the date
		  String dateFormatted= dateFormat.format(date);
		  System.out.println("Date----->"+dateFormatted);
		    WebElement ele = driver.findElement(By.xpath("//input[@id='Step1Data_DateofBirth']"));
		
		   scroll(ele);
		 // driver.findElement(By.xpath("//input[@id='Step1Data_DateofBirth']")).sendKeys("03082020");
		   //  ele.click();
		
		   //driver.findElement(By.xpath("//android.view.View[contains(@index='10')]")).click();
		 //  setDate(driver, "08082020", ele);
		
		   ele.sendKeys("sdhvfvyf");
		  // ele.sendKeys(Keys.TAB);
		 
		Thread.sleep(5000);
		 
		
		
			
			System.out.println("Brajesh");
		
		}
		}
}
