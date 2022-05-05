package com.heroApplication.testCases;

import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsMK.EditPeoPage;
import com.hero.pageObjectsMK.LoginPage;
import com.hero.pageObjectsMK.addPeoPage;

public class EditCarrierTestCase extends StartBrowser{
	
	@Test
	public void EditCarrierTest() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		LoginPage lg = new LoginPage(driver);
		
		lg.setUserId("brajesh.admin", 10, "userName");
		lg.setPassword("Password@2", 10, "userName");
		lg.clickOnLoginBtn("Login button", 10);

		addPeoPage au = new addPeoPage(driver);
		EditPeoPage EditPeo = new EditPeoPage(driver);
		au.clickOnentryUW("UW", 5);
		au.clickOnAdminMenu("AdminMenu", 5);
		au.clickOnPeoManagement("PeoManagement", 10);
		EditPeo.clickOnSearchPeoBtn("MonikaPeo1","SearchPeoBtn", 10);
		EditPeo.clickOnEditPeoBtn("EditPeoBtn", 10);
		EditPeo.clickOnBasicInfoBtn("EditPeoBtn", 10);	
		au.SetPeoName("MonikaPeo1","*PEO/Assoc./Trust",5);
		au.clickOnStatus("Status", 10);
		au.SetBrokerName("Aeroline Brokers", 10);
        au.SetAbbreviatedName("Ab12334", "Abbreviated_Name", 10);
        au.SetUrl("Urqwel12345rt", "URL", 10);
        au.SetMilliSubEmail("Ab123@test.com", "MillimanSubmissionEmail", 10);
		//EditPeo.clickOnManageTeamPanel("ManageTeamPanel", 10);
        //au.selTeamUW("MilliUwTeamMember", 10);
        au.clickOnSubmit("Submit", 10);
	}
}
	