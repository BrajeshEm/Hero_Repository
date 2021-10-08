package com.hero.testCasesMK;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsMK.EditPeoPage;
import com.hero.pageObjectsMK.LoginPage;
import com.hero.pageObjectsMK.addCarrier;
import com.hero.pageObjectsMK.addPeoPage;

public class addCarrierTestCase extends StartBrowser{
	
	@Test
	public void addCarrierTest() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		LoginPage lg = new LoginPage(driver);

		lg.setUserId("akash.admin", 10, "userName");
		lg.setPassword("2wsx@WSX!", 10, "userName");
		lg.clickOnLoginBtn("Login button", 10);

		addCarrier ac = new addCarrier(driver);
		addPeoPage au = new addPeoPage(driver);
		
		au.clickOnentryUW("UW", 5);
		au.clickOnAdminMenu("AdminMenu", 5);
		ac.clickOnCarManagement("CarrierMgmt", 10);
		ac.clickOnAddCarBtn("AddCarBtn", 10);
		ac.SetCompName("Car111","CompanyName", 10);
		//ac.clickOnStatus("Status", 10);
		ac.SetSelectedPeoName("akashPeo", 10,"Select Peo");
        au.clickOnSubmit("Submit", 10);
	}
}

	