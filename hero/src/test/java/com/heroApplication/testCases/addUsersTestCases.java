package com.heroApplication.testCases;

import org.testng.annotations.Test;

import com.hero.config.CommonUses;
import com.hero.config.StartBrowser;

import com_heroApplication_pageObjects.addUsersPage;



public class addUsersTestCases extends StartBrowser {

    @Test(priority=3)	
	public void addBrokerTest() throws Exception {

		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("admin", 5);
		au.clickOnaddUser("admin", 5);
		au.textOnFname("Akash", "firstName", 5);
		au.textOnLname("Talan", "lastName", 5);
		au.selectRole("Broker", "Role", 5);
		au.textOnUname("userName", 5);
		au.textOnemail("akashtalan1996@gmail.com", "email", 5);
		au.selectCompany("Broker.PP", "company", 10);
		au.clickOnselectAll("selectAll", 10);
		au.clickOnsubmit("submit", 5);
		au.validationUserCreatedSuccessMsge("The user has been successfully created.", "UserCrreatedSccessMsge", 5);
		cm.LogOut();
	}

	@Test(priority=1)	
	public void addAdminTest() throws Exception {

		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("admin", 5);
		au.clickOnaddUser("admin", 5);
		au.textOnFname("Akash", "firstName", 5);
		au.textOnLname("Talan", "lastName", 5);
		au.selectRole("Admin", "Role", 5);
		au.textOnUname("userName", 5);
		au.textOnemail("akashtalan1996@gmail.com", "email", 5);
		au.clickOnsubmit("submit", 5);
		au.validationUserCreatedSuccessMsge("The user has been successfully created.", "UserCrreatedSccessMsge", 5);
		cm.LogOut();
	}

	@Test(priority=2)	
	public void addCarrierTest() throws Exception {

		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("admin", 5);
		au.clickOnaddUser("admin", 5);
		au.textOnFname("Akash", "firstName", 5);
		au.textOnLname("Talan", "lastName", 5);
		au.selectRole("Carrier", "Role", 5);
		au.textOnUname("userName", 5);
		au.textOnemail("akashtalan1996@gmail.com", "email", 5);
		au.selectCompany("Car111", "company", 10);
		au.clickOnselectAll("selectAll", 10);
		au.clickOnsubmit("submit", 5);
		au.validationUserCreatedSuccessMsge("The user has been successfully created.", "UserCrreatedSccessMsge", 5);
		cm.LogOut();
	}

	@Test(priority=4)	
	public void addGatekeeperTest() throws Exception {

		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("admin", 5);
		au.clickOnaddUser("admin", 5);
		au.textOnFname("Akash", "firstName", 5);
		au.textOnLname("Talan", "lastName", 5);
		au.selectRole("Gatekeeper", "Role", 5);
		au.textOnUname("userName", 5);
		au.textOnemail("akashtalan1996@gmail.com", "email", 5);
		au.selectCompany("$Magic", "company", 10);
		au.clickOnselectAll("selectAll", 10);
		au.clickOnsubmit("submit", 5);
		au.validationUserCreatedSuccessMsge("The user has been successfully created.", "UserCrreatedSccessMsge", 5);
		cm.LogOut();
	}

	@Test(priority=5)	
	public void addSalespersonTest() throws Exception {

		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("admin", 5);
		au.clickOnaddUser("admin", 5);
		au.textOnFname("Akash", "firstName", 5);
		au.textOnLname("Talan", "lastName", 5);
		au.selectRole("Salesperson", "Role", 5);
		au.textOnUname("userName", 5);
		au.textOnemail("akashtalan1996@gmail.com", "email", 5);
		au.selectCompany("$TestPeoOne", "company", 10);
		au.clickOnselectAll("selectAll", 10);
		au.clickOnsubmit("submit", 5);
		au.validationUserCreatedSuccessMsge("The user has been successfully created.", "UserCrreatedSccessMsge", 5);
		cm.LogOut();
	}
}
