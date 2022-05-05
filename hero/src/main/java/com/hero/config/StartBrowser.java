package com.hero.config;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;
import com.hero.utilities.Readconfig;
import com.hero.utilities.getUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	/**
	 * Before Executing Test, Setup test environment
	 * 
	 * @throws Exception
	 * 
	 */
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static Logger log;
	//String method;

	@BeforeSuite
	public void beforeSuite() {
		
		log = Logger.getLogger("Hero_Index");
		PropertyConfigurator.configure("log4j.properties");
	}
	@BeforeTest
	public static ExtentReports extentReporGenerator() {
	
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		String repName = "Test-Report-" + timeStamp + ".html";
		String path = System.getProperty("user.dir") + "\\reports\\" + repName;
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		reporter.config().setDocumentTitle("Automation Report"); // Tittle of Report
		reporter.config().setReportName("Extent Report V4"); // Name of the report
		reporter.config().setTheme(Theme.DARK);//Default Theme of Report

		// General information releated to application
		extent.setSystemInfo("Application Name", "Google Test");
		extent.setSystemInfo("User Name", "Brajesh");
		extent.setSystemInfo("Envirnoment", "Practice");
		return extent;
	}
	
	@BeforeClass
	//@Parameters("browser")
	public void beforeClass() throws InterruptedException {

	Readconfig redconfig = new Readconfig();

		String browser = redconfig.getBrowserPath();

		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.silentOutput","true");
			WebDriverManager.chromedriver().setup();
			Thread.sleep(10000);
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Brajesh Kumar\\OneDrive\\Desktop\\chromedriver.exe");  
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please Provide the Correct Browser");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(getUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(getUtil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		

	}


  
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}

	@BeforeMethod
	public void setup(Method method) {
	    String testMethodName = method.getName(); //This will be:verifySaveButtonEnabled
	    test = extent.createTest(testMethodName);
	}

	@AfterMethod
	public void getResult(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			// MarkupHelper is used to display the output in different colors
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));

			// To capture screenshot path and store the path of the screenshot in the string
			// "screenshotPath"
			// We do pass the path captured by this method in to the extent reports using
			// "logger.addScreenCapture" method.

			// String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
			String screenshotPath = TakeScreenshot(driver, result.getName());
			// To add it in the extent report

			test.fail("Test Case Failed Snapshot is below " + test.addScreenCaptureFromPath(screenshotPath));

		} else if (result.getStatus() == ITestResult.SKIP) {
			// logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} 
		test.assignAuthor("Brajesh Kumar");

	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
	}

	@AfterTest
	public void afterTest() {

		
		extent.flush();

	}

	@AfterSuite
	public void afterSuite() {

	

	}
	public static String TakeScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
}