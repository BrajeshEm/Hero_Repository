package com.heroApplication.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.LoginPage;
import com_heroApplication_pageObjects.CompanyPage;

public class CompanyDetailPageBatchUploadTestCase extends StartBrowser{

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

CompanyPage au = new CompanyPage(driver);
au.clickOnentryUW("UW", 5);
//au.clickOnSearch("Search", 10);
au.setOnScomp("select", 10, "Comp_Hero");
Thread.sleep(5000);
//au.clickOnSearchIcon("Click", 10);
au.clickOnCompanyName("Company Name", 10);
Thread.sleep(3000);
driver.findElement(By.id("batchfileupload")).sendKeys("C://Users//Brajesh Kumar//workingAreaSelenium//Hero_Repository//hero//Resources//heroTestData//SWPHQGHQxml_sw1ELv3_1 (PHQ1).xml");
Thread.sleep(3000);
au.clickOnUpload("Upload", 10);
Thread.sleep(3000);
au.valUploadSuccessText("Transaction is currently in the queue for processing (Transaction Id - ");


}
}