package com.hero.testCasesSD;

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
import com.hero.pageObjectsSD.UpdateContactInformationPlansPage;

public class UpdateContactInformationTestCase extends StartBrowser{

@Test
public void updateContactInformation() throws Exception {
// launch Chrome and direct it to the Base URL /

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@2", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


AddParityPlansPage au = new AddParityPlansPage(driver);
au.clickOnentryUW("UW", 5);

ChangePasswordPlansPage as = new ChangePasswordPlansPage (driver);
as.clickOnMyProfile("My Profile", 10);

//Update Contact Information/
UpdateContactInformationPlansPage uc = new UpdateContactInformationPlansPage(driver);
uc.clickOnUpdateContact("Change Password", 10);
uc.setOnPhone("Phone", 10, "(888)998-8777");
uc.setOnQualification("Qualification", 10, "B.tech");
Thread.sleep(5000);
uc.clickOnSave("Save", 10);
Thread.sleep(5000);



}
}