package com.hero.testCasesSD;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.AddCurvConfigurationPlansPage;
import com.hero.pageObjectsSD.AddCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.AddParityPlansPage;
import com.hero.pageObjectsSD.CompanyDetailPageCensusUploadPage;
import com.hero.pageObjectsSD.CompanyDetailPageEmailPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.EditCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.FactorTableManagementPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;

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
lg.setPassword("Password@2", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


//Edit_Custom Fields Management /
AddParityPlansPage au = new AddParityPlansPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnAdministration("Administration", 10);


AddCustomFieldsManagementPlansPage aq = new AddCustomFieldsManagementPlansPage(driver);
aq.clickOnCustomFieldManagement("Custom Fields Management", 10);
aq.clickOnSelectPeo("Click", 10);
aq.clickOnSetPeo("$TestPeoOne", 10);

EditCustomFieldsManagementPlansPage aw= new EditCustomFieldsManagementPlansPage(driver);
Thread.sleep(10000);
driver.findElement(By.xpath("/html/body/div/div[7]/section/form/div/div[2]/div/div[1]/div/div[3]/div[2]/div/table/tbody/tr[8]/td[7]/a")).click();

//aw.clickOnEditIcon("Edit Icon", 10);
aq.clickOnParentValue("Parent Value", 10);
aw.setOnParentValue("Parent Value", 10, "18");
aq.clickOnComparisonoperator("Comparison operator", 10);
aw.setOnComparisonoperator("<", 10);
aw.clickOnSave("Save", 10);
Thread.sleep(10000);




}
}