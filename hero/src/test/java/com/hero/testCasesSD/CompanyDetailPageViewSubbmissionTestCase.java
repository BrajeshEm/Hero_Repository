package com.hero.testCasesSD;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.CompanyDetailPageCensusUploadPage;
import com.hero.pageObjectsSD.CompanyDetailPageViewSubmissionPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;

public class CompanyDetailPageViewSubbmissionTestCase extends StartBrowser{

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

CompanyDetailPageViewSubmissionPage au = new CompanyDetailPageViewSubmissionPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnSearch("Search", 10);
au.setOnScomp("select", 10, "Comp1IQE");
Thread.sleep(5000);
au.clickOnSearchIcon("Click", 10);
Thread.sleep(5000);
au.clickOnCompanyName("Company Name", 10);
au.clickOnViewSubmission("Submission", 10);



Thread.sleep(5000);
}
}