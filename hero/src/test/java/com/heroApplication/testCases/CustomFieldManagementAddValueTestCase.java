package com.heroApplication.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.AddCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.CustomFieldManagementAddValuePlansPage;
import com.hero.pageObjectsSD.EditCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.LoginPage;
import com_heroApplication_pageObjects.AddParityPlansPeoPage;

public class CustomFieldManagementAddValueTestCase extends StartBrowser{

@Test
public void verifyRegWithSpousePln() throws Exception {
// launch Chrome and direct it to the Base URL /

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);
CustomFieldManagementAddValuePlansPage ae = new CustomFieldManagementAddValuePlansPage(driver);

// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@1", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


//Edit_Custom Fields Management /
AddParityPlansPeoPage au = new AddParityPlansPeoPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnAdministration("Administration", 10);


AddCustomFieldsManagementPlansPage aq = new AddCustomFieldsManagementPlansPage(driver);
aq.clickOnCustomFieldManagement("Custom Fields Management", 10);
//aq.clickOnSelectPeo("Click", 10);
aq.selPeo("$TestPeoOne", 10,"PeoName");
aq.clickAddValueIcon(10, "AddValueIcon");

//Custom Field ManagementAddValue /
ae.clickOnValue("Value", 10);
ae.setOnValue("Value", 10, "9");
ae.clickOnAction("Click", 10);
ae.clickOnSave("Save", 10);

}
}