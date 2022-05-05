package com.heroApplication.testCases;

import org.testng.annotations.Test;
import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.LoginPage;
import com_heroApplication_pageObjects.CompanyPage;

public class CompanyDetailPageCensusUploadTestCase extends StartBrowser{

@Test
public void verifyRegWithSpousePln() throws Exception {
// launch Chrome and direct it to the Base URL /
StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@1", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);

CompanyPage au = new CompanyPage(driver);
au.clickOnentryUW("UW", 5);
//au.clickOnSearch("Search", 10);
au.setOnScomp("select", 10, "Comp1IQE");
Thread.sleep(5000);
au.clickOnCompanyName("Company Name", 10);
au.clickOnCensus("Census", 10);
Thread.sleep(3000);
au.clickOnPasteCensus("Paste Census", 10);
Thread.sleep(10000);
au.clickOnAdd("Add", 10);
au.clickOnRunQuote("Run Quote", 10);
Thread.sleep(10000);
}
}