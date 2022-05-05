package com.heroApplication.testCases;

import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsMK.EditPeoPage;
import com.hero.pageObjectsMK.LoginPage;
import com.hero.pageObjectsMK.PeoValidationCheck;
import com.hero.pageObjectsMK.addPeoPage;

public class PeoValidationTestcase extends StartBrowser{
	
	@Test
	public void PeoValidationTest() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		LoginPage lg = new LoginPage(driver);
		
		lg.setUserId("brajesh.admin", 10, "userName");
		lg.setPassword("Password@2", 10, "userName");
		lg.clickOnLoginBtn("Login button", 10);

		addPeoPage au = new addPeoPage(driver);
		PeoValidationCheck val = new PeoValidationCheck(driver);
		EditPeoPage EditPeo = new EditPeoPage(driver);
		au.clickOnentryUW("UW", 5);
		au.clickOnAdminMenu("AdminMenu", 5);
		au.clickOnPeoManagement("PeoManagement", 10);
		au.clickOnAddPeoBtn("AddPeoBtn", 10);
		au.selTeamUW("Akash Admin", 10);
        au.clickOnSubmit1("Submit", 10);
        val.valTextPeoName("Please enter PEO/Assoc./Trust Name", "Peo Name", 5);
        val.valTextBrokerName("Please select Broker", "Broker name", 10);
        val.valTextAbbrNameName("Please enter Abbreviated Name", "Abbreviated name", 15);
        val.valTextURLNameVal("Please enter URL", "URL", 20);
        val.valTextSubmissionEmail("Please enter Milliman submission email", "Submission Email", 20);
//      val.valTextUWMember("Please select atleast one member for the Milliman UW team", "UW member", 20);
//      val.valTextPrimaryUWMember("Please select a primary member for the Milliman UW team", "Primary UW member", 20);
        
	}
}
	