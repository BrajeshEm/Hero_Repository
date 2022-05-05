package com.hero.testCasesSD;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.AddParityPlansPage;
import com.hero.pageObjectsSD.CompanyDetailPageCensusUploadPage;
import com.hero.pageObjectsSD.CompanyDetailPageEmailPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.FactorTableManagementPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;

public class AddParityPlansTestCase extends StartBrowser{

@Test
public void addParityPlans() throws Exception {
// launch Chrome and direct it to the Base URL /

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@1", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


//Add_ParityPlans /
AddParityPlansPeoPage au = new AddParityPlansPeoPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnAdministration("Administration", 10);
au.clickOnPeoAssoc("Peo/AssocTrustManagement", 10);
au.clickOnSearch("Search", 10);
au.setOnSPeo("Peo/Assoc", 10, "Fresh PEO");
au.clickOnSearchIcon("Search Icon", 10);
au.clickOnEditIcon("Edit", 10);
//Thread.sleep(10000);
au.clickOnParityPlans("Parity Plans", 10);
Thread.sleep(10000);
//au.clickOnDownParityTemplate("Download Parity Plan template", 10);
//au.clickOnBrowseButton("Browse",10);
driver.findElement(By.xpath("//input[@id='prityfileupload']")).sendKeys("C://Users//dell//Desktop//ParityPlansTemplate.xlsx");
au.clickOnAddButton("Add", 10);
Thread.sleep(5000);
Alert alert = driver.switchTo().alert();
String alertText =  alert.getText();
System.out.print(alertText);
alert.accept();






}
}