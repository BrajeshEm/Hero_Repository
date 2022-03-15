package com.hero.testCasesSD;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.AddCurvConfigurationPlansPage;
import com.hero.pageObjectsSD.AddCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.AddParityPlansPage;
import com.hero.pageObjectsSD.CompanyDetailPageCensusUploadPage;
import com.hero.pageObjectsSD.CompanyDetailPageEmailPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.FactorTableManagementPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;

public class AddCustomFieldsManagementTestCase extends StartBrowser{

@Test
public void verifyRegWithSpousePln() throws Exception {
// launch Chrome and direct it to the Base URL /

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@1", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


//Add_Custom Fields Management /
AddParityPlansPage au = new AddParityPlansPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnAdministration("Administration", 10);
//Thread.sleep(10000);
AddCustomFieldsManagementPlansPage aq = new AddCustomFieldsManagementPlansPage(driver);
aq.clickOnCustomFieldManagement("Custom Fields Management", 10);
aq.clickOnSelectPeo("Click", 10);
aq.clickOnSetPeo("$TestPeoOne", 10);
aq.setOnCustomFieldLabel("Custom Field Label", 10, "Automation");
aq.clickOnCustomFieldType("Custom Field Type", 10);
aq.setOnCustomFieldType("Textbox", 10);
aq.clickOnParentName("Parent Name", 10);
aq.setOnParentName("Testing", 10);
aq.clickOnParentValue("Parent Value", 10);
aq.setOnParentValue("Parent Value", 10, "16");
aq.clickOnComparisonoperator("Comparison operator", 10);
aq.setOnComparisonoperator("=", 10);
//aq.setOnRequiredCheckBox("Required CheckBox", 10);
aq.clickOnAdd("Add", 10);
Thread.sleep(10000);



}
}