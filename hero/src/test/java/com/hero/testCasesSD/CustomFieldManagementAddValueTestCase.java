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
import com.hero.pageObjectsSD.CustomFieldManagementAddValuePlansPage;
import com.hero.pageObjectsSD.EditCompanyPage;
import com.hero.pageObjectsSD.EditCustomFieldsManagementPlansPage;
import com.hero.pageObjectsSD.FactorTableManagementPage;
import com.hero.pageObjectsSD.LoginPage;
import com.hero.pageObjectsSD.StartQuotePage;

public class CustomFieldManagementAddValueTestCase extends StartBrowser{

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
AddParityPlansPeoPage au = new AddParityPlansPeoPage(driver);
au.clickOnentryUW("UW", 5);
au.clickOnAdministration("Administration", 10);


AddCustomFieldsManagementPlansPage aq = new AddCustomFieldsManagementPlansPage(driver);
aq.clickOnCustomFieldManagement("Custom Fields Management", 10);
aq.clickOnSelectPeo("Click", 10);
aq.clickOnSetPeo("$TestPeoOne", 10);

EditCustomFieldsManagementPlansPage aw= new EditCustomFieldsManagementPlansPage(driver);
Thread.sleep(10000);
driver.findElement(By.xpath("//tbody/tr[15]/td[9]/a[1]/img[1]")).click();
Thread.sleep(10000);

//Custom Field ManagementAddValue /

CustomFieldManagementAddValuePlansPage ae = new CustomFieldManagementAddValuePlansPage(driver);
ae.clickOnValue("Value", 10);
ae.setOnValue("Value", 10, "9");
ae.clickOnAction("Click", 10);
ae.clickOnSave("Save", 10);
Thread.sleep(10000);




}
}