package com.heroLogin.testCases;
/*
 * Set of test script for testing Website Guru99 Bank
 * The test scripts is developed using Selenium Framework
 *
 */
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjects.LoginPage;
import com.hero.utilities.XLUtils;




public class TC_LoginDDTest_002 extends StartBrowser {

	/**
	 * 
	 * @author Brajesh Kumar
	 *        Test Script 02
	 *        ************** 
	 *        Test Steps
	 *        1)  Go to https://herouw.net//Forms/Index?cid=pP1wcnwLK2Q__s_&isghq=false
	          2) Enter valid UserId
	          3) Enter valid Password
	          4) Click Login
	          5) Verify the Page Title after login
	 * @throws Exception 
	 */
	
	@Test(dataProvider="Logindata")
	public void loginTest(String uName,String Psswrd, String credenStatus) throws Exception {
		
		// launch Chrome and direct it to the Base URL
		StartBrowser.test = StartBrowser.test.createNode("Go to MainHomePage");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		LoginPage login = new LoginPage(driver);
		login.setUserId(uName, 10, " UserName");
		login.setPassword(Psswrd, 10, " Password ");
		login.clickOnLoginBtn(" Login ", 10);
		test.info(credenStatus);
		System.err.println(credenStatus);
		String ExpectedTitle = "PHQStep1 - HEROUW";
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(ExpectedTitle)) {
			
			Assert.assertTrue(true);
			
		} else {
			aDriver.Print("Actual Result  :"+actualTitle);
			Assert.assertTrue(false);
		}
	}
	@DataProvider(name="Logindata")
	public String[][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\com\\hero\\testData\\testData.xlsx";
		int rwCount = XLUtils.getRowCount(path, "Sheet1");
		int cllCount = XLUtils.getCellCount(path, "Sheet1", 0);
		String[][] logindata = new String[rwCount][cllCount];
		
		for(int i=1;i<=rwCount;i++)
		{
			for(int j=0;j<cllCount;j++)
			{
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		
		return logindata;
	}
}
