package com.heroApplication.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.LoginPage;

import com_heroApplication_pageObjects.CompanyPage;

public class CompanyDetailPageSupportingDataFileTestCase extends StartBrowser{

@Test
public void verifyRegWithSpousePln() throws Exception {
// launch Chrome and direct it to the Base URL /
StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

lg.setUserId("brajesh.admin", 10, "userName");
lg.setPassword("Password@2", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);

CompanyPage au = new CompanyPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnSearch("Search", 10);
au.setOnScomp("select", 10, "Comp1IQE");
Thread.sleep(5000);
au.clickOnSearchIcon("Click", 10);
Thread.sleep(5000);
au.clickOnCompanyName("Company Name", 10);
//au.clickOnUpload("Upload", 10);
//au.clickOnFile("File", 10);
driver.findElement(By.xpath("//input[@id='btnMultipleupload']")).sendKeys("C://Users//dell//Downloads//CompanyTrackingReport (8) (1).xlsx");
au.clickOnSave("Save", 10);

//au.setOnComp("Compname", 10,"COMP1");
//au.setPeo("Fresh Peo", 10);
//au.setUwType("Instantaneous Quote", 10);
//au.setStatus("Reviewed by Uw", 10);
//au.setNumOFEmp("Num oF Eligible Emp", 10, "5");
//au.setCurrentHealthCarrier("None/Virgin","Current health carrier", 10);
//au.clickOnCompWithCurrentlyPeo("Is comp currently with peo", 10);
//
//
//au.selCity("Akron", "City", 10);
//
//au.setState("State", 10);
//au.setZipCode("Zip Code", 10, "12345");
//au.setLocation("Location", 10);
//au.setIndustryCode("Industry code", 10, "1231");
//au.setUpcommingRenewalDate("Upcomming renewal date", 10, "05/19/2021");
//au.setUpcustom1TextBox("Custom txt box", 10,"sssd");
//au.selContacts("Contacts", "Fresh Gk", 10);
//au.clickOnSave("Save and Continue", 10);
//au.setEffectiveDate("Effective Date", 10, "05/20/2021");

Thread.sleep(5000);
}
}