package com.hero.config;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.hero.utilities.Readconfig;
import com.hero.utilities.getUtil;

public class ActionDriver extends StartBrowser {

	public static WebDriver driver;
	public Readconfig readConfig;
	public ExtentTest test;

	public ActionDriver() {
		driver = StartBrowser.driver;
		test = StartBrowser.test;
	}

	/**
	 *
	 * @param url - Useful to navigate the Application
	 * @throws IOException
	 */

	public void navigateToApplication() throws IOException {
		readConfig = new Readconfig();
		String url = readConfig.getApplicationURL();
		try {
			driver.navigate().to(url);
			test.info("Successfully navigate to URL : " + url);
			log.info("Successfully navigate to URL : " + url);
		} catch (Exception e) {
			test.error("Unable navigate to URL : " + url + " ExcepInfo: " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Unable navigate to URL : " + url);
		}
	}

	public void navigateToApplicationGHQ() throws IOException {
		readConfig = new Readconfig();
		String url = readConfig.getApplicationURLGHQ();
		try {
			driver.navigate().to(url);
			test.info("Successfully navigate to URL : " + url);
			log.info("Successfully navigate to URL : " + url);
		} catch (Exception e) {
			test.error("Unable navigate to URL : " + url + " ExcepInfo: " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Unable navigate to URL : " + url);
		}
	}
	
	public void navigateToApplicationGeneralPHQ() throws IOException {
		readConfig = new Readconfig();
		String url = readConfig.getApplicationURLGenaralPHQ();
		try {
			driver.navigate().to(url);
			test.info("Successfully navigate to URL : " + url);
			log.info("Successfully navigate to URL : " + url);
		} catch (Exception e) {
			test.error("Unable navigate to URL : " + url + " ExcepInfo: " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Unable navigate to URL : " + url);
		}
	}
	
	public void navigateToApplicationIowaPHQ() throws IOException {
		readConfig = new Readconfig();
		String url = readConfig.getApplicationURLIowaPHQ();
		try {
			driver.navigate().to(url);
			test.info("Successfully navigate to URL : " + url);
			log.info("Successfully navigate to URL : " + url);
		} catch (Exception e) {
			test.error("Unable navigate to URL : " + url + " ExcepInfo: " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Unable navigate to URL : " + url);
		}
	}

	
	public void navigateToApplicationUthaPHQ() throws IOException {
		readConfig = new Readconfig();
		String url = readConfig.getApplicationURLUthaPHQ();
		try {
			driver.navigate().to(url);
			test.info("Successfully navigate to URL : " + url);
			log.info("Successfully navigate to URL : " + url);
		} catch (Exception e) {
			test.error("Unable navigate to URL : " + url + " ExcepInfo: " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Unable navigate to URL : " + url);
		}
	}
	
	public void navigateToApplicationArizonaPHQ() throws IOException {
		readConfig = new Readconfig();
		String url = readConfig.getApplicationURLArizonaPHQ();
		try {
			driver.navigate().to(url);
			test.info("Successfully navigate to URL : " + url);
			log.info("Successfully navigate to URL : " + url);
		} catch (Exception e) {
			test.error("Unable navigate to URL : " + url + " ExcepInfo: " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Unable navigate to URL : " + url);
		}
	}

	public void navigateToApplicationMichiganPHQ() throws IOException {
		readConfig = new Readconfig();
		String url = readConfig.getApplicationURLMichiganPHQ();
		try {
			driver.navigate().to(url);
			test.info("Successfully navigate to URL : " + url);
			log.info("Successfully navigate to URL : " + url);
		} catch (Exception e) {
			test.error("Unable navigate to URL : " + url + " ExcepInfo: " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Unable navigate to URL : " + url);
		}
	}

	/**
	 * Useful to clicking on buttons, rb, links and check boxes.
	 *
	 * @param locator -- Get it from object Repository
	 * @param eleName -- Name of Element which you are clicking
	 * @throws Exception
	 */
	public void click(By locator, int timeOut, String eleName) throws Exception {
		try {
			new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(locator));
			driver.findElement(locator).click();
			test.info("Performed click operation on : " + eleName);
			log.info("Performed click operation on : " + eleName);
		} catch (Exception e) {
			test.error("Unable to Perform click operation on : " + eleName + " ExcepInfo: " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Performed click operation on : " + eleName);
		}
	}

//Click By Action Class
	public void clickByAction(By locator, int timeOut, String eleName) throws Exception {
		try {
			new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOfElementLocated(locator));
			WebElement ele = driver.findElement(locator);
			Actions action = new Actions(driver);
			action.moveToElement(ele).click().build().perform();
			test.info("Performed click operation on : " + eleName);
			log.info("Performed click operation on : " + eleName);
		} catch (Exception e) {
			test.error("Unable to Perform click operation on : " + eleName + " ExcepInfo. " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Unable to Perform click operation on : " + eleName);
		}
	}

	public void Type(By locator, String eleName, int timeOut, String typeData) throws IOException {
		try {
			new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOfElementLocated(locator));
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(typeData);
			test.info("Successfuly perpormed type action in text box : " + eleName + " with data " + typeData);
			log.info("Successfuly perpormed type action in text box : " + eleName + " with data " + typeData);
		} catch (Exception e) {
			test.error("Unable to perform type action in text box : " + eleName + " with data " + typeData
					+ "ExcepInfo." + e + MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Unable to perform type action in text box : " + eleName + " with data " + typeData);
		}
	}

	public void Print(String msge) {

		System.out.println(msge);
		try {
			test.info("Print performed : " + msge);
		} catch (Exception e) {
			test.error("Unable Print performed : " + msge);
		}
	}

//ScreenShot Method
	public String screenShot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

// Click by js script
	public void clickByJs(By locator, int timeOut, String eleName) throws Exception {
		try {
			new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(locator));
			WebElement ele = driver.findElement(locator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
			test.info("Performed click operation on : " + eleName);
			log.info("Performed click operation on : " + eleName);
		} catch (Exception e) {
			test.error("Unable to Perform click operation on : " + eleName + " info: " + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Performed click operation on : " + eleName);
		}
	}

//TakeScreen shot when test Fail fo extent report
	public void TakeScreenShotOnFail(String eleName) throws IOException {
		test.error("Expected Output not found : " + eleName,
				MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
	}

//TakeScreen shot when test pass fo extent report
	public void TakeScreenShotOnPass(String eleName) throws IOException {
		test.pass("Expected Output found : " + eleName,
				MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
	}

	public void selectByDropdwn(By locator, int timeOut, String eleName) throws IOException {
		try {
			new WebDriverWait(driver, timeOut).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			Select AType = new Select(driver.findElement(locator)); // here locator for click on DW
			AType.selectByValue(eleName); // here eleName is visible text.
			test.info("Performed select operation to : " + eleName);
			log.info("Performed select operation to : " + eleName);
		} catch (Exception e) {
			test.error("Performed select operation to : " + eleName + "ExcepInfo." + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Performed select operation to : " + eleName);
		}
	}
	
	public void selectDropdwnByVisibleText(By locator, int timeOut, String eleName) throws IOException {
		try {
			new WebDriverWait(driver, timeOut).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			Select AType = new Select(driver.findElement(locator)); // here locator for click on DW
			AType.selectByVisibleText(eleName); // here eleName is visible text.
			test.info("Performed select operation to : " + eleName);
			log.info("Performed select operation to : " + eleName);
		} catch (Exception e) {
			test.error("Performed select operation to : " + eleName + "ExcepInfo." + e,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			log.error("Performed select operation to : " + eleName);
		}
	}
	
	
	
	
	
	
	

	public void clickAndScroll(By locator, By locator2, String redBtn) throws InterruptedException {
		List<WebElement> elelist = driver.findElements(locator);
		int len = elelist.size();
		for (int i = 0; i < len; i++) {
			WebElement ele = elelist.get(i);
			getUtil.acrollIntoView(ele, driver);
			ele.click();
			test.info("Medical Conditions and Treatmens For Selected NO");
//Thread.sleep(3000);
		}
	}

	public String captureText(By locator, int timeOut, String eleName) throws Exception {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(locator));
		String ActualText = driver.findElement(locator).getText();

		return ActualText;
	}

	public String textValidation(By locator, String expectedOutput, int timeOut, String eleName) throws Exception {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.presenceOfElementLocated(locator));
		String ActualText = driver.findElement(locator).getText();
		if (ActualText.contentEquals(expectedOutput)) // Expected & actual Verify
		{
			getUtil.TakeScreenShotOnPass(" testPassSnapCapture ");
			Assert.assertTrue(true);
			log.info("textValidation -" + ActualText + " Vs " + expectedOutput);
		} else {
			getUtil.TakeScreenOnTestFail(" testFailSnapCapture ");
			log.error("textValidation -" + ActualText + " Vs " + expectedOutput);
			Assert.assertTrue(false);
		}
		return ActualText;
	}

}