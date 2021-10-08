package com.hero.testCasesSD;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.AddCurvConfigurationPlansPage;
import com.hero.pageObjectsSD.AddParityPlansPage;
import com.hero.pageObjectsSD.CompanyDetailPageCensusUploadPage;
import com.hero.pageObjectsSD.CompanyDetailPageEmailPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.FactorTableManagementPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;

public class AddCurvConfigurationTestCase extends StartBrowser{

@Test
public void AddCurvConfiguration() throws Exception {
// launch Chrome and direct it to the Base URL /

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@2", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


//Add_CurvConfiguration /
AddParityPlansPage au = new AddParityPlansPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnAdministration("Administration", 10);
au.clickOnPeoAssoc("Peo/AssocTrustManagement", 10);
au.clickOnSearch("Search", 10);
au.setOnSPeo("Peo/Assoc", 10, "Fresh PEO");
au.clickOnSearchIcon("Search Icon", 10);
au.clickOnEditIcon("Edit", 10);
//Thread.sleep(10000);
AddCurvConfigurationPlansPage aq = new AddCurvConfigurationPlansPage(driver);
aq.clickOnCurvConfig("Parity Plans", 10);
Thread.sleep(10000);
aq.clickOnLocation("Location", 10);
aq.clickOnLocCheckbox("check box", 10);
Thread.sleep(5000);
driver.findElement(By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[14]/div[6]/div[1]/label[1]")).click();

aq.clickOnRadioButton("click", 10);
aq.clickOnMinHitRate1("Click", 10);
aq.setOnMinHitRate1("Min Hit Rate1", 10, "50");
aq.clickOnRadioButton2("click", 10);
aq.clickOnMinHitRate2("Click", 10);
aq.setOnMinHitRate2("Min Hit Rate2", 10, "30");
aq.clickOnUser("UserName", 10);
aq.setOnUserName("User Name", 10, "Automation");
aq.clickOnPass("Password", 10);
aq.setOnPassword("Password", 10, "LPMRth27TEST");
aq.clickOnMaxEmployee("Max Employee", 10);
aq.setOnMaxEmployee("Max Employee", 10, "99");


//au.clickOnBrowseButton("Browse",10);
aq.setSubStartDate("Sub Start Date", 10, "06/16/2021");
driver.findElement(By.xpath("//label[contains(text(),'Max # of employees without GHQ')]")).click();
aq.clickOnWillSubExp("Will Subs Expire", 10);
aq.clickOnAdd("Add", 10);
Thread.sleep(10000);




}
}