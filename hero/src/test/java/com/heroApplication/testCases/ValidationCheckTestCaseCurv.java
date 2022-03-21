package com.heroApplication.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.EditCompanyPageCurv;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;
import com.hero.pageObjectsSD.StartQuotePageCurv;
import com.hero.pageObjectsSD.ValidationCheckPageCurv;

public class ValidationCheckTestCaseCurv extends StartBrowser{

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

// ValidationCheck 
ValidationCheckPageCurv au = new ValidationCheckPageCurv(driver);
au.clickOnentryUW("UW", 5);
au.clickOnentrySQ("Start Quote", 10);
Thread.sleep(5000);
au.clickOnSave("Save and Continue", 5);
Thread.sleep(5000);
au.valTextMsgeCompName("Please enter Company Name", "Company Name", 5);
Thread.sleep(5000);
au.valTextMsgePeoName("Please select PEO/Assoc./Trust", "PEO/Assoc./Trust", 5);
au.valTextMsgeNumberOfEes("Please enter Number of benefit eligible EEs", "umber of benefit eligible EEs", 5);
au.valTextMsgeCurrentHealth("Please select current health carrier", "current health carrier", 5);
au.valTextMsgeEffectiveDate("Please enter Effective Date", "Effective Date", 5);
au.valTextMsgeCity("Please select City", "City", 5);
au.valTextMsgeState("Please select state.", "State", 5);
au.valTextMsgeZipCode("Please enter Zip Code", "Zip Code", 5);
Thread.sleep(5000);
}

}