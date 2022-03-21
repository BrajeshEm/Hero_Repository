package com.heroApplication.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.AddCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.EditCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.LoginPage;
import com_heroApplication_pageObjects.AddParityPlansPeoPage;

public class EditCustomFieldsManagementTestCase extends StartBrowser{

@Test
public void verifyRegWithSpousePln() throws Exception {
// launch Chrome and direct it to the Base URL /

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);
// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@1", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


//Edit_Custom Fields Management /
AddParityPlansPeoPage au = new AddParityPlansPeoPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnAdministration("Administration", 10);


AddCustomFieldsManagementPlansPage aq = new AddCustomFieldsManagementPlansPage(driver);
aq.clickOnCustomFieldManagement("Custom Fields Management", 10);
aq.selPeo("$TestPeoOne", 10,"PeoName");
Thread.sleep(10000);
EditCustomFieldsManagementPlansPage aw= new EditCustomFieldsManagementPlansPage(driver);
//driver.findElement(By.xpath("//tbody/tr[2]/td[7]/a[1]")).click();

aw.clickOnEditIcon("Edit Icon", 10);
aq.clickOnParentName("AAA", 10);
aw.setOnParentValue("9", 10);
aq.clickOnComparisonoperator("Comparison operator", 10);
aw.setOnComparisonoperator("<", 10);
aw.clickOnSave("Save", 10);
Thread.sleep(10000);




}
}