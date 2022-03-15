package com.hero.testCasesSD;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsSD.AddParityPlansPage;
import com.hero.pageObjectsSD.ChangePasswordPlansPage;
import com.hero.pageObjectsSD.LoginPage;

public class ChangePasswordTestCase extends StartBrowser{

@Test
public void ChangePassword() throws Exception {

StartBrowser.test = StartBrowser.test.createNode("Login to Application");
ActionDriver aDriver = new ActionDriver();
aDriver.navigateToApplication();
LoginPage lg = new LoginPage(driver);

// Login credentials /
lg.setUserId("shivangi.admin", 10, "userName");
lg.setPassword("Password@1", 10, "userName");
lg.clickOnLoginBtn("Login button", 10);


//Change Password /
AddParityPlansPage au = new AddParityPlansPage(driver);
au.clickOnentryUW("UW", 5);

ChangePasswordPlansPage as = new ChangePasswordPlansPage (driver);
as.clickOnMyProfile("My Profile", 10);
as.clickOnChangePassword("Change Password", 10);
//as.clickOnNewPassword("New Password", 10);
//as.setOnNewPassword("New Password", 10, "Password@1");
driver.findElement(By.name("NewPassword")).sendKeys("Password@1");
//as.clickOnConfirmPassword("Confirm Password", 10);
as.setOnConfirmPassword("Confirm Password", 10, "Password@1");
as.clickOnChangePass("Change Password", 10);


}
}