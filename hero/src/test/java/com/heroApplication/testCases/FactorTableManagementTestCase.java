package com.heroApplication.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.CompanyDetailPageCensusUploadPage;
import com.hero.pageObjectsSD.CompanyDetailPageEmailPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.FactorTableManagementPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;

public class FactorTableManagementTestCase extends StartBrowser{
public static FactorTableManagementPage au;

@Test(priority=0)
public void addFactorTableTest() throws Exception {
// launch Chrome and direct it to the Base URL /

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@2", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


//Add_FactorTable /
au = new FactorTableManagementPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnAdministration("Administration", 10);
au.clickOnFactorTableManagement("Factor Table Management", 10);
au.selFactorType("Age", 10, "Factor Type");
au.clickOnFactorTableName("Factor table Name", 10);
au.setFactorName("Factor Name", 10, "Agenew1");
au.selTableName("Age_MARA_Area", 10, "Table Name");
Thread.sleep(10000);
au.clickOnComment("Comment", 10);
au.setComment("Okay", 10, "Comment");
au.clickOnAdd("Add", 10);
Thread.sleep(10000);



//Reset_FactorTable /
//FactorTableManagementPage ab = new FactorTableManagementPage(driver);
//au.clickOnentryUW("UW", 5);
//au.clickOnAdministration("Administration", 10);
//au.clickOnFactorTableManagement("Factor Table Management", 10);
//au.selFactorType("Age", 10, "Factor Type");
//au.clickOnFactorTableName("Factor table Name", 10);
//au.setFactorName("Factor Name", 10, "Agenew1");
//au.selTableName("Age_MARA_Area", 10, "Table Name");
//au.clickOnComment("Comment", 10);
//au.setComment("Okay", 10, "Comment");
//au.clickOnAdd("Add", 10);
//ab.clickOnReset("Reset", 10);


////EditAdded_FactorTable /
//FactorTableManagementPage ac = new FactorTableManagementPage(driver);
//
//ac.clickOnEdit("Edit Icon", 10);
//
//Thread.sleep(10000);
}

@Test(priority=1)
public void resetFactorTableTest() throws Exception 
{
	//Reset_FactorTable /
	FactorTableManagementPage ab = new FactorTableManagementPage(driver);
	au.clickOnentryUW("UW", 5);
	au.clickOnAdministration("Administration", 10);
	au.clickOnFactorTableManagement("Factor Table Management", 10);
	au.selFactorType("Age", 10, "Factor Type");
	au.clickOnFactorTableName("Factor table Name", 10);
	au.setFactorName("Factor Name", 10, "Agenew1");
	au.selTableName("Age_MARA_Area", 10, "Table Name");
	au.clickOnComment("Comment", 10);
	au.setComment("Okay", 10, "Comment");
	au.clickOnAdd("Add", 10);
	ab.clickOnReset("Reset", 10);
	}

@Test(priority=2)
public void editFactorTableTest() throws Exception 
{
FactorTableManagementPage ac = new FactorTableManagementPage(driver);

ac.clickOnEdit("Edit Icon", 10);

Thread.sleep(10000);
}
	
}
