package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class CustomFieldManagementAddValuePlansPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public CustomFieldManagementAddValuePlansPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on Administration and Custom Field ManagementAddValue /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By administration = By.xpath("//body[1]/div[1]/div[5]/ul[1]/li[2]");
By clickOnCustomFieldsManag = By.xpath("//a[contains(text(),'Custom Fields Management')]");
By clickOnSelectPeo = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
By setPeo = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/label[1]");
By clickOnValue = By.xpath("//input[@id='CustomFieldValue']");
By setOnValue = By.xpath("//input[@id='CustomFieldValue']");
By clickOnAction = By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/img[1]");
By clickOnSave = By.xpath("//input[@value='Save']");




// Setup Method for Custom Field ManagementAddValue : /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnAdministration(String eleName, int timeout) throws Exception {
adriver.click(administration, timeout, eleName);
}

public void clickOnCustomFieldManagement(String eleName, int timeOut) throws Exception {
adriver.click(clickOnCustomFieldsManag,timeOut, eleName);
}
public void clickOnSelectPeo(String eleName, int timeOut) throws Exception {
	adriver.click(clickOnSelectPeo, timeOut,eleName );
	}
public void clickOnSetPeo(String eleName, int timeout) throws Exception {
adriver.click(setPeo, timeout, eleName);
}
//public void clickOnEditIcon(String eleName, int timeOut) throws Exception {
//	getUtil.ScrolldownTillPageEnd(driver);
//adriver.click(clickOnEditIcon, timeOut, eleName);
//}
public void clickOnValue(String eleName, int timeout) throws Exception {
adriver.click(clickOnValue, timeout, eleName);
}
public void setOnValue(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setOnValue, eleName, timeOut,typeData);
}
public void clickOnAction(String eleName, int timeout) throws Exception {
adriver.click(clickOnAction, timeout, eleName);
}

public void clickOnSave(String eleName, int timeout) throws Exception {
adriver.click(clickOnSave, timeout, eleName);
}











}
