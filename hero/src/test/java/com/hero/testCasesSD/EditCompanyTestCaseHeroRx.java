package com.hero.testCasesSD;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.EditCompanyPageHeroRx;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;
import com.hero.pageObjectsSD.StartQuotePageHeroRx;

public class EditCompanyTestCaseHeroRx extends StartBrowser{

@Test
public void verifyRegWithSpousePln() throws Exception {
// launch Chrome and direct it to the Base URL /
StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

lg.setUserId("brajesh.admin", 10, "userName");
lg.setPassword("2wsx@WSX!", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);

EditCompanyPageHeroRx au = new EditCompanyPageHeroRx(driver);
au.clickOnentryUW("UW", 5);
au.clickOnSearch("Search", 10);
au.setOnScomp("select", 10, "Comp3");
Thread.sleep(5000);
au.clickOnSearchIcon("Click", 10);
Thread.sleep(5000);
au.clickOnEditCompany("Edit Company", 10);
//au.setReleasedBand("Released Band", 10);
au.clickOnCustomField("Radio1", 10);
au.clickOnSaveButton("Save", 10);




//au.setOnComp("Compname", 10,"COMP3");
//au.setPeo("Fresh Peo", 10);
//au.setUwType("Hero Rx", 10);
//au.setStatus("Reviewed by Uw", 10);
//au.setNumOFEmp("Num oF Eligible Emp", 10, "5");
//au.setCurrentHealthCarrier("None/Virgin","Current health carrier", 10);
//au.clickOnCompWithCurrentlyPeo("Is comp currently with peo", 10);
//au.selCity("Akron", "City", 10);
//au.setState("State", 10);
//au.setZipCode("Zip Code", 10, "12345");
//au.setLocation("Location", 10);
//au.setIndustryCode("Industry code", 10, "1231");
//au.setUpcommingRenewalDate("Upcomming renewal date", 10, "05/19/2021");
//au.setUpcustom1TextBox("Custom txt box", 10,"sssd");
//au.selContacts("Contacts", "Fresh Gk", 10);
//au.clickOnSave("Save and Continue", 10);
//au.setEffectiveDate("Effective Date", 10, "07/20/2021");
Thread.sleep(5000);
}
}