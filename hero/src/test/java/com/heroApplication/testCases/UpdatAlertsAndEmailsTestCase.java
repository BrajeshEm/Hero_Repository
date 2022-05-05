package com.heroApplication.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.AddCurvConfigurationPlansPage;
import com.hero.pageObjectsSD.AddCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.AddParityPlansPage;
import com.hero.pageObjectsSD.ChangePasswordPlansPage;
import com.hero.pageObjectsSD.CompanyDetailPageCensusUploadPage;
import com.hero.pageObjectsSD.CompanyDetailPageEmailPage;
import com.hero.pageObjectsSD.DrugsManagementPlansPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.FactorTableManagementPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;
import com.hero.pageObjectsSD.UpdateAlertsAndEmailsPlansPage;
import com.hero.pageObjectsSD.UpdateContactInformationPlansPage;

import com_heroApplication_pageObjects.AddParityPlansPeoPage;

public class UpdatAlertsAndEmailsTestCase extends StartBrowser{

@Test
public void updateAlertsAndEmails() throws Exception {
// launch Chrome and direct it to the Base URL /

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@1", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


AddParityPlansPeoPage au = new AddParityPlansPeoPage(driver);
au.clickOnentryUW("UW", 5);

ChangePasswordPlansPage as = new ChangePasswordPlansPage (driver);
as.clickOnMyProfile("My Profile", 10);

//Update Alerts and Emails/
UpdateAlertsAndEmailsPlansPage uc = new UpdateAlertsAndEmailsPlansPage(driver);
uc.clickOnUpdateAlertsAndEmail("Update Alerts and Emails", 10);
uc.clickOnNewUserApprovalReqest("New User Approval Reqest", 10);
uc.clickOnIqResultConfirmation("Iq Result Confirmation", 10);
uc.clickOnHeroActivitySummary("Hero Activity Summary", 10);
Thread.sleep(5000);
uc.clickOnSave("Save", 10);
Thread.sleep(5000);



}
}