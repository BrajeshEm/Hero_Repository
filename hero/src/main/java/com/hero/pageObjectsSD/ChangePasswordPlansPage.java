package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class ChangePasswordPlansPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public ChangePasswordPlansPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on My Profile and Change Password /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By myProfile = By.xpath("//a[contains(text(),'MY PROFILE')]");
By clickOnChangePass = By.xpath("//a[contains(text(),'Change Password')]");

//By clickOnNewPass = By.xpath("/input[@id='NewPasswordWed Jun 09 202118:02:03 GMT+0530 (India Standard Time)']");
By setOnNewPass = By.xpath("//input[@id='NewPasswordWed Jun 09 202118:02:03 GMT+0530 (India Standard Time)']");
//By clickOnConfirmPass = By.xpath("//input[@id='ConfirmPasswordWed Jun 09 202118:02:03 GMT+0530 (India Standard Time)']");
By setOnConfirmPass = By.xpath("//input[@id='ConfirmPasswordWed Jun 09 202118:02:03 GMT+0530 (India Standard Time)']");
By clickOnChangePassword = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[2]/div[4]/div[2]/input[1]");

By oldPasswordText = By.name("OldPassword");





// Setup Method for Change Password : /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}

public void clickOnMyProfile(String eleName, int timeout) throws Exception {
adriver.click(myProfile, timeout, eleName);
}

public void clickOnChangePassword(String eleName, int timeOut) throws Exception {
adriver.click(clickOnChangePass,timeOut, eleName);
}
//public void clickOnNewPassword(String eleName, int timeOut) throws Exception {
//adriver.click(clickOnNewPass,timeOut, eleName);
//}
public void setOnNewPassword(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setOnNewPass, eleName, timeOut,typeData);
}
//public void clickOnConfirmPassword(String eleName, int timeOut) throws Exception {
//adriver.click(clickOnConfirmPass,timeOut, eleName);
//}
public void setOnConfirmPassword(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setOnConfirmPass, eleName, timeOut,typeData);
}
public void clickOnChangePass(String eleName, int timeOut) throws Exception {
adriver.click(clickOnChangePassword,timeOut, eleName);
}

}
