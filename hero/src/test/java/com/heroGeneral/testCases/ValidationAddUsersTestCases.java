package com.heroGeneral.testCases;

import org.testng.annotations.Test;
import com.hero.config.CommonUses;
import com.hero.config.StartBrowser;
import com.hero.pageObjects.addUsersPage;

public class ValidationAddUsersTestCases extends StartBrowser {

	@Test(priority = 1)
	public void addUserTest() throws Exception { // - without any user select validation
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("administration", 5);
		au.clickOnaddUser("add User", 5);
		au.clickOnsubmit("submit", 5);
		au.valTextMsgefName("Please enter First Name", "firstName", 5);
		au.valTextMsgelName("Please enter Last Name", "lastName", 5);
		au.valTextMsgeRole("Please select Role", "Role", 5);
		au.valTextMsgeuName("Please enter your Username", "userName", 5);
		au.valTextMsgeemail("Please enter your Email", "email", 5);
		cm.LogOut();

	}

	@Test(priority = 2)
	public void validationUserAdminTest() throws Exception {
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("administration", 5);
		au.clickOnaddUser("add User", 5);
		au.selectRole("Admin", "Role", 5);
		au.clickOnsubmit("submit", 5);
		au.valTextMsgefName("Please enter First Name", "firstName", 5);
		au.valTextMsgelName("Please enter Last Name", "lastName", 5);
		au.valTextMsgeuName("Please enter your Username", "userName", 5);
		au.valTextMsgeemail("Please enter your Email", "email", 5);
		cm.LogOut();

	}

	@Test(priority = 3)
	public void validationUserCarrierTest() throws Exception {
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("administration", 5);
		au.clickOnaddUser("add User", 5);
		au.selectRole("Carrier", "Role", 5);
		au.clickOnsubmit("submit", 5);
		au.valTextMsgefName("Please enter First Name", "firstName", 5);
		au.valTextMsgelName("Please enter Last Name", "lastName", 5);
		au.valTextMsgeuName("Please enter your Username", "userName", 5);
		au.valTextMsgeemail("Please enter your Email", "email", 5);
		//au.valTextMsgeselectCompany("Please select Company", "selectCompany", 5);
		cm.LogOut();

	}

	@Test(priority = 4)
	public void validationUserBrokerTest() throws Exception {
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("administration", 5);
		au.clickOnaddUser("add User", 5);
		au.selectRole("Broker", "Role", 5);
		au.clickOnsubmit("submit", 5);
		au.valTextMsgefName("Please enter First Name", "firstName", 5);
		au.valTextMsgelName("Please enter Last Name", "lastName", 5);
		au.valTextMsgeuName("Please enter your Username", "userName", 5);
		au.valTextMsgeemail("Please enter your Email", "email", 5);
		//au.valTextMsgeselectCompany("Please select Company", "selectCompany", 5);
		cm.LogOut();

	}

	@Test(priority = 5)
	public void validationUserGatekeeperTest() throws Exception {
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("administration", 5);
		au.clickOnaddUser("add User", 5);
		au.selectRole("Gatekeeper", "Role", 5);
		au.clickOnsubmit("submit", 5);
		au.valTextMsgefName("Please enter First Name", "firstName", 5);
		au.valTextMsgelName("Please enter Last Name", "lastName", 5);
		au.valTextMsgeuName("Please enter your Username", "userName", 5);
		au.valTextMsgeemail("Please enter your Email", "email", 5);
		//au.valTextMsgeselectCompany("Please select Company", "selectCompany", 5);
		cm.LogOut();

	}

	@Test(priority = 6)
	public void validationUserSalespersonTest() throws Exception {
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		CommonUses cm = new CommonUses();
		addUsersPage au = new addUsersPage(driver);

		cm.login();
		au.clickOnentryUW("UW", 5);
		au.clickAdministration("administration", 5);
		au.clickOnaddUser("add User", 5);
		au.selectRole("Salesperson", "Role", 5);
		au.clickOnsubmit("submit", 5);
		au.valTextMsgefName("Please enter First Name", "firstName", 5);
		au.valTextMsgelName("Please enter Last Name", "lastName", 5);
		au.valTextMsgeuName("Please enter your Username", "userName", 5);
		au.valTextMsgeemail("Please enter your Email", "email", 5);
		//au.valTextMsgeselectCompany("Please select Company", "selectCompany", 5);
		cm.LogOut();

	}
}
