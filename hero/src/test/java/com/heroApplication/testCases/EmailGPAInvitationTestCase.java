package com.heroApplication.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.AddCurvConfigurationPlansPage;
import com.hero.pageObjectsSD.AddCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.ChangePasswordPlansPage;
import com.hero.pageObjectsSD.CompanyDetailPageCensusUploadPage;
import com.hero.pageObjectsSD.CompanyDetailPageEmailPage;
import com.hero.pageObjectsSD.DrugsManagementPlansPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.EmailGPAInvitationPlansPage;
import com.hero.pageObjectsSD.FactorTableManagementPage;
import com.hero.pageObjectsSD.FormsPlansPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;
import com.hero.pageObjectsSD.UpdateAlertsAndEmailsPlansPage;
import com.hero.pageObjectsSD.UpdateContactInformationPlansPage;

import com_heroApplication_pageObjects.AddParityPlansPeoPage;

public class EmailGPAInvitationTestCase extends StartBrowser{

@Test
public void EmailGPAInvitation() throws Exception {
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
au.clickOnAdministration("Administration", 10);

//Email GPA invitation/

EmailGPAInvitationPlansPage uc = new EmailGPAInvitationPlansPage(driver);
uc.clickOnEmailGpaInvitation("Email Gpa Invitation", 10);
//Thread.sleep(5000);

uc.setEmailFrom("From Email", 10, "test@heroFrom.com");
uc.setEmailTo("To Email", 10, "test@heroTo.com");
uc.setEmailCC("Email CC", 10, "test@heroCC.com");
uc.setEmailSubject("To Email", 10, "Milliman New Group Setup Form");
//uc.emailAttachementUpload("attached File", 10, "C://Users//Brajesh Kumar//workingAreaSelenium//Hero_Repository//hero//Resources//heroTestData//sample-pdf-file2.pdf");
uc.sendButtonClick("Send Button", 10);
uc.emailSentSuccessMsgeVal("Email Sent Confirmation", 10, "Email sent successfully.");





//uc.clickOnSearch("General", 10);
//Thread.sleep(5000);
//uc.setOnSearch("Search", 10, "General");
//uc.clickOnSearchIcon("Search Icon", 10);
////GeneralPHQ /
//uc.clickOnGenPHQ("GenralPHQ", 10);
//GeneralGHQ/
//uc.clickOnGeneralGHQ("GeneralGHQ", 10);
//Thread.sleep(5000);



}
}