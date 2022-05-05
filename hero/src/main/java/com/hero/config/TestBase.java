package com.frisco.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.frisco.qa.util.TestUtil;
import com.frisco.qa.util.WebEventListener;

public class TestBase {
	
	// Declare objects
	public static WebDriver driver;
	public static Properties prop = null;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	// public static CustomListener eventListener;
	TestUtil testutil;

	public TestBase() {
		// prop=null;
		try {
			prop = new Properties();
			// FileInputStream ip = new FileInputStream(
			// "D:\\FRISCO_AUTOMATION\\Frisco\\src\\main\\java\\com\\frisco\\qa\\config\\config2.properties");
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/frisco/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "D://FRISCO_AUTOMATION//Frisco//browserdriver//chromedriver.exe");
			 */
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/browserdriver/chromedriver.exe");
			Thread.sleep(15000);
			driver = new ChromeDriver();
			// TestUtil.softWait();
		} else if (browserName.equals("FF")) {
			/*
			 * System.setProperty("webdriver.gecko.driver",
			 * "/Users/Banti Kumar/git/QAAutomationFrisco/Frisco/browserdriver/geckodriver.exe"
			 * );
			 */
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/browserdriver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					"D://FRISCO_AUTOMATION//Frisco//browserdriver//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		e_driver = new EventFiringWebDriver(driver);
		// eventListener = new WebEventListener(driver);
		eventListener = new WebEventListener();
		// eventListener =new CustomListener(driver);
		e_driver.register(eventListener);
		driver = e_driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

	public static void takeScreenshotAtEndOfTest(String methodname) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		// FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" +
		// System.currentTimeMillis() + ".png"));
		// FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/"
		// +System.class.getName()+"_"+ System.currentTimeMillis()+".png"));
		// FileUtils.copyFile(scrFile,
		// new File(currentDir + "/screenshots/" + methodname + "_" +
		// System.currentTimeMillis() + ".png"));
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		//take full screenshot
		/*
		 * Screenshot screenshot=new
		 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).
		 * takeScreenshot(driver); try { ImageIO.write(screenshot.getImage(),"PNG",new
		 * File("path of the file")); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */

	}

}
