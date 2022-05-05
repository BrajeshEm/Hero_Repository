package com.heroApplication.testCases;

import org.testng.annotations.Test;
import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.FormsPlansPage;
import com.hero.pageObjectsSD.LoginPage;
import com_heroApplication_pageObjects.AddParityPlansPeoPage;

public class FormsTestCase extends StartBrowser{

@Test
public void forms() throws Exception {
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
//Forms/
FormsPlansPage uc = new FormsPlansPage(driver);
uc.clickOnForms("Forms", 10);
Thread.sleep(5000);
uc.clickOnSearch("General", 10);
Thread.sleep(5000);
uc.setOnSearch("Search", 10, "General");
uc.clickOnSearchIcon("Search Icon", 10);
//GeneralPHQ /
uc.clickOnGenPHQ("GenralPHQ", 10);
//GeneralGHQ/
uc.clickOnGeneralGHQ("GeneralGHQ", 10);
Thread.sleep(5000);


}
}