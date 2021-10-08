package com.heroLogin.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjects.LoginPage;
import com.hero.utilities.getUtil;




public class TC_LoginTest_001 extends StartBrowser {

	/**
	 * 
	 * @author Brajesh Kumar
	 *        Test Script 01
	 *        ************** 
	 *        Test Steps
	 *        1) Go to https://herouw.net//Forms/Index?cid=pP1wcnwLK2Q__s_&isghq=false
	          2) Enter valid UserId
	          3) Enter valid Password
	          4) Click Login
	          5) Verify the Page Title after login
	 * @throws Exception 
	 */
	
	@Test
	public void veriFyLoginTest() throws Exception {
		
		// launch Chrome and direct it to the Base URL
		StartBrowser.test = StartBrowser.test.createNode("Go to Login Page");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		LoginPage login = new LoginPage(driver);
		login.setUserId("Rajesh", 10, " UserName");
		login.setPassword("Rajesh@123#", 10, " Password ");
		Thread.sleep(30000);
		login.clickOnLoginBtn(" Login ", 10);
        
		/* Result Validation */
		String ExpectedTitle = "PHQStep1 - HEROUW";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(ExpectedTitle)) {
			getUtil.TakeScreenShotOnPass(" testPassSnapCapture ");
			Assert.assertTrue(true);
		} else {
			getUtil.TakeScreenOnTestFail(" testFailSnapCapture ");
			aDriver.Print("Actual Result  :"+actualTitle);
			Assert.assertTrue(false);
		}
	}
}