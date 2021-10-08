package com.hero.testCasesSD;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.CompanyDetailPageCensusUploadPage;
import com.hero.pageObjectsSD.CompanyDetailPageEnrollmentAuditPage;
import com.hero.pageObjectsSD.CompanyDetailPageViewSubmissionPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;

public class CompanyDetailPageEnrollmentAuditTestCase extends StartBrowser{

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

CompanyDetailPageEnrollmentAuditPage au = new CompanyDetailPageEnrollmentAuditPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnSearch("Search", 10);
au.setOnScomp("select", 10, "Volume1Hrx");
Thread.sleep(5000);
au.clickOnSearchIcon("Click", 10);
Thread.sleep(5000);
au.clickOnCompanyName("Company Name", 10);
au.clickOnEditCompany("Edit Company Record", 10);
Thread.sleep(5000);
au.setStatus("Sold", 10);
Thread.sleep(10000);
au.clickOnSave("Save and Continue", 10);
au.clickOnCensusButton("Census", 10);
au.clickOnEnrollmentAuditButton("Enrollment Audit", 10);
au.clickOnPasteCensus("Paste Census", 10);
Thread.sleep(10000);
au.clickOnRunAuditButton("Run Audit", 10);
Thread.sleep(10000);



au.clickOnParityButton("Parity", 10);
Thread.sleep(5000);
au.clickOnAddParityPlanButton("Add Party", 10);
Thread.sleep(5000);
au.setPlanName("Plan Name", 10, "PPP3");
au.setEEBox("EE", 0, "200");
au.setEsBox("ES", 10, "200");
au.setEcBox("EC", 10, "200");
au.setFamBox("Fam", 10,"200");
Thread.sleep(5000);
au.setPlanDesign("PPO/POS", 10);
Thread.sleep(5000);
au.setDeductibleBox("Deductible", 10, "2000");
Thread.sleep(5000);
au.setMemberCoinsurancr("10%", 10);
Thread.sleep(5000);
au.setPrimaryCarePhyCopayBox("Primary Care", 10, "200");
Thread.sleep(5000);
au.setOutOfPocketBox("Out Of Pocket Max", 10, "500");
Thread.sleep(5000);
au.setOnDeductibleBox("Deductible", 10, "2000");
Thread.sleep(5000);
au.setMemberCoinBox("5%", 10);
au.setOutOfNwOopMaxBox("OOP Max", 10, "1000");
Thread.sleep(5000);
au.setGenericCopayBox("Generic Copay", 10, "100");
au.setForCopayBox("Formulary Copay", 10, "100");
au.setNonForCopayBox("Non Formulary Copay", 10, "100");
Thread.sleep(5000);
au.clickOnSaveButton("Save", 10);
Thread.sleep(5000);
}


}