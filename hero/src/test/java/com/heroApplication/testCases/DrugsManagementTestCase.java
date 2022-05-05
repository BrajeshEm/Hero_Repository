package com.heroApplication.testCases;

import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.DrugsManagementPlansPage;
import com.hero.pageObjectsSD.LoginPage;
import com_heroApplication_pageObjects.AddParityPlansPeoPage;

public class DrugsManagementTestCase extends StartBrowser{

@Test
public void drugsManagement() throws Exception {
// launch Chrome and direct it to the Base URL /

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@1", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


//Drugs Management /
AddParityPlansPeoPage au = new AddParityPlansPeoPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnAdministration("Administration", 10);

DrugsManagementPlansPage aq = new DrugsManagementPlansPage(driver);

aq.clickOnDrugsManagement("Deugs Management", 10);
aq.selFactorType("PHQ", 10, "Drugs Type");
aq.setOnFileUpload("File Upload", 10, "C://Users//Brajesh Kumar//workingAreaSelenium//Hero_Repository//hero//Resources//heroTestData//DrugFactorTemplate.xlsx");

aq.clickOnAdd("Add", 10);
Thread.sleep(5000);
driver.switchTo().alert().accept();

Thread.sleep(10000);
aq.selFactorType("Prescription Snapshot", 10, "Drug Type");
Thread.sleep(5000);
aq.setOnFileUpload("File Upload", 10, System.getProperty("user.dir")+"//Resources//heroTestData//DrugFactorTemplate.xlsx");

aq.clickOnAdd("Add", 10);


Thread.sleep(5000);



}
}