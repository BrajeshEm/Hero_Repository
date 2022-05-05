package com.heroApplication.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.LoginPage;
import com_heroApplication_pageObjects.CompanyPage;

public class CompanyDetailPageEmailTestCase extends StartBrowser{

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

CompanyPage au = new CompanyPage(driver);
au.clickOnentryUW("UW", 5);

au.setOnScomp("select", 10, "Comp1SW");
Thread.sleep(5000);
au.clickOnCompanyName("Company Name", 10);
au.clickOnPhq("Phq", 10);
Thread.sleep(10000);
}
}