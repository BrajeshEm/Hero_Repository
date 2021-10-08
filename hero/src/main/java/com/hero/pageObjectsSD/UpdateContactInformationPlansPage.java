package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class UpdateContactInformationPlansPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public UpdateContactInformationPlansPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on My Profile and Update Contact Information /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By myProfile = By.xpath("//a[contains(text(),'MY PROFILE')]");
By clickOnUpdateContact = By.xpath("//a[contains(text(),'Update Contact')]");
By setOnPhone = By.xpath("//input[@id='Phone']");
By setOnQualification = By.xpath("//input[@id='Qualification']");
By clickOnSave = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/fieldset[1]/div[7]/div[7]/div[2]/input[1]");





// Setup Method for Update Contact Information : /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnMyProfile(String eleName, int timeout) throws Exception {
adriver.click(myProfile, timeout, eleName);
}

public void clickOnUpdateContact(String eleName, int timeOut) throws Exception {
adriver.click(clickOnUpdateContact,timeOut, eleName);
}
public void setOnPhone(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setOnPhone, eleName, timeOut,typeData);
}

public void setOnQualification(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setOnQualification, eleName, timeOut,typeData);
}
public void clickOnSave(String eleName, int timeOut) throws Exception {
adriver.click(clickOnSave,timeOut, eleName);
}

}
