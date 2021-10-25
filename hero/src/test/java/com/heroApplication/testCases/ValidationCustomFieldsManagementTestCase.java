package com.heroApplication.testCases;

import org.testng.annotations.Test;

import com.hero.config.CommonUses;
import com.hero.config.StartBrowser;

import com_heroApplication_pageObjects.CheckValidationCustomFieldsManagement;
import com_heroApplication_pageObjects.addUsersPage;




public class ValidationCustomFieldsManagementTestCase extends StartBrowser{
	
	@Test
	public void CheckValidationCustomFieldsManagementTest() throws Exception {
		
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);
		cm.login();
		CheckValidationCustomFieldsManagement cfm = new CheckValidationCustomFieldsManagement(driver);
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("administration", 5);
		cfm.clickOncustomfieldsManagement("admin", 5);
	    cfm.selectPEO("$Magic","PEO", 5);	   
	    cfm.clickOnAdd("Add", 5);
		cfm.valTextMsgecflabel("Please enter custom field label","Custom Field Label",5);
		cfm.valTextMsgecfType("Please select custom field type","Custom Field Type",5);
		
	}
}
	