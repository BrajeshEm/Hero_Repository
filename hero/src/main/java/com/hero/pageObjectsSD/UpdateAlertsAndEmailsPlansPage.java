package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class UpdateAlertsAndEmailsPlansPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public UpdateAlertsAndEmailsPlansPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on My Profile and Update Alerts and Emails /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By myProfile = By.xpath("//a[contains(text(),'MY PROFILE')]");
By clickOnUpdateAlertsAndEmail = By.xpath("//a[contains(text(),'Update Alerts and Emails')]");

//Receive email notification for:/

By clickOnNewUserApprovalReq = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/span[3]");
By clickOnIqResultCon = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[4]/div[3]/div[2]/div[1]/div[1]/span[3]");
By clickOnHeroActivitySummary =By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[4]/div[6]/div[2]/div[1]/div[1]/span[1]");
By clickOnSave = By.xpath("//input[@id='submitBtn']");





// Setup Method for Update Alerts and Emails : /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnMyProfile(String eleName, int timeout) throws Exception {
adriver.click(myProfile, timeout, eleName);
}

public void clickOnUpdateAlertsAndEmail(String eleName, int timeOut) throws Exception {
adriver.click(clickOnUpdateAlertsAndEmail,timeOut, eleName);
}
public void clickOnNewUserApprovalReqest(String eleName, int timeOut) throws Exception {
adriver.click(clickOnNewUserApprovalReq, timeOut, eleName);
}

public void clickOnIqResultConfirmation(String eleName, int timeOut) throws Exception {
adriver.click(clickOnIqResultCon, timeOut, eleName );
}
public void clickOnHeroActivitySummary(String eleName, int timeOut) throws Exception {
adriver.click(clickOnHeroActivitySummary, timeOut, eleName );
}
public void clickOnSave(String eleName, int timeOut) throws Exception {
adriver.click(clickOnSave,timeOut, eleName);
}

}
