package com.heroApplication.testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.utilities.getUtil;

import com_heroApplication_pageObjects.StartQuotePage;

public class StartQuoteTestCase extends StartBrowser {

	@Test
	public void verifyRegWithSpousePln() throws Exception {
// launch Chrome and direct it to the Base URL /
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		LoginPage lg = new LoginPage(driver);
		
		StartQuotePage au = new StartQuotePage(driver);
		lg.setUserId("brajesh.admin", 10, "userName");
		lg.setPassword("Password@2", 10, "userName");
		lg.clickOnLoginBtn("Login button", 10);
		au.clickOnentryUW("UW", 5);
		au.clickOnentrySQ("Start Quote", 10);
		String compName = getUtil.randomString();
		au.setOnComp("Compname", 10, compName);
		au.setPeo("Fresh Peo", 10);
		au.setUwType("Instantaneous Quote", 10);
		au.setStatus("Reviewed by Uw", 10);
		au.setNumOFEmp("Num oF Eligible Emp", 10, "5");
		au.setCurrentHealthCarrier("None/Virgin", "Current health carrier", 10);
		au.clickOnCompWithCurrentlyPeo("Is comp currently with peo", 10,"Yes");
		au.setEffectiveDate("Effective Date", 10, "03/22/2022");
		au.setUpcustom1TextBox("Custom txt box", 10, "sssd");
		au.selCity("Akron", "City", 10);
		au.setState("State", 10);
		au.setZipCode("Zip Code", 10, "12345");
		au.setLocation("Location", 10);
		au.setIndustryCode("Industry code", 10, "1231");
		au.setUpcommingRenewalDate("Upcomming renewal date", 10, "05/19/2021");
		au.selContacts("Contacts", "Fresh Gk", 10);
		au.clickOnSave("Save and Continue", 10);
		Thread.sleep(2000);
		au.clientNameValidation(compName, 10, "clientName");

	}
}