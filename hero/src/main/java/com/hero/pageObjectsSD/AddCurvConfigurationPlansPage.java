package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class AddCurvConfigurationPlansPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public AddCurvConfigurationPlansPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on Edit PEO/Assoc./Trust and AddCurvConfiguration /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By administration = By.xpath("//body[1]/div[1]/div[5]/ul[1]/li[2]");
By clickOnPeoAssoc = By.xpath("//a[contains(text(),'PEO/Assoc./Trust Management')]");
By clickOnSearch = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[2]/label[1]/input[1]");
By setfresh = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[2]/label[1]/input[1]");
By clickOnSearchIcon = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[2]/a[1]");
By clickOnEdit = By.xpath("//tbody/tr[1]/td[5]/a[1]");
By clickOnCurvConfiguration = By.xpath("//span[normalize-space()='Curv Configuration']");
By clickOnLocation = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[14]/div[1]/div[2]/button[1]");
By ClickOnLocCheckbox = By.xpath("//div[@class='btn-group open']//li[@class='multiselect-item multiselect-all']//input[@name='multiselect']");
By clickOnRadioButton1 = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[14]/div[2]/div[2]/input[1]");
By clickOnMinHitRate1 = By.xpath("//input[@id='peoModel_MinHitRate1']");
By setOnMinHitRate1 = By.xpath("//input[@id='peoModel_MinHitRate1']");
By clickOnRadioButton2 = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[14]/div[4]/div[2]/input[1]");
By clickOnMinHitRate2 = By.xpath("//input[@id='peoModel_MinHitRate2']");
By setOnMinHitRate2 = By.xpath("//input[@id='peoModel_MinHitRate2']");
By clickOnUserName = By.xpath("//input[@id='peoModel_UserName']");
By setUserName = By.xpath("//input[@id='peoModel_UserName']");
By clickOnPass = By.xpath("//input[@id='peoModel_Password']");
By setPassword = By.xpath("//input[@id='peoModel_Password']");
By clickOnMaxEmp = By.xpath("//input[@id='peoModel_MaxEmployeeWithoutGHQ']");
By setMaxEmp = By.xpath("//input[@id='peoModel_MaxEmployeeWithoutGHQ']");
By SubscriptionStartDate = By.xpath("//input[@id='peoModel_SubscriptionStartDate']");
By clickOnRadioButtonSubExpire = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[14]/div[10]/div[2]/input[2]");
By clickOnAdd = By.xpath("//input[@id='btnGrxConfiguration']");


// Setup Method for  CurvConfiguration : /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnAdministration(String eleName, int timeout) throws Exception {
adriver.click(administration, timeout, eleName);
}

public void clickOnPeoAssoc(String eleName, int timeOut) throws Exception {
adriver.click(clickOnPeoAssoc,timeOut, eleName);
}
public void clickOnSearch(String eleName, int timeOut) throws Exception {
	adriver.click(clickOnSearch, timeOut,eleName );
	}
public void setOnSPeo(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setfresh, eleName, timeOut,typeData);
}
public void clickOnSearchIcon(String eleName, int timeout) throws Exception {
adriver.click(clickOnSearchIcon, timeout, eleName);
} 
public void clickOnEditIcon(String eleName, int timeout) throws Exception {
adriver.click(clickOnEdit, timeout, eleName);
}
public void clickOnCurvConfig(String eleName, int timeout) throws Exception {
	getUtil.acrollIntoView(driver.findElement(clickOnCurvConfiguration),driver);
adriver.click(clickOnCurvConfiguration, timeout, eleName);

}
public void clickOnLocation(String eleName, int timeout) throws Exception {
adriver.click(clickOnLocation, timeout, eleName);
}
public void clickOnLocCheckbox(String eleName, int timeout) throws Exception {
adriver.clickByJs(ClickOnLocCheckbox, timeout, eleName);
}

public void clickOnRadioButton(String eleName, int timeout) throws Exception {
adriver.click(clickOnRadioButton1, timeout, eleName);
}
public void clickOnMinHitRate1(String eleName, int timeout) throws Exception {
adriver.click(clickOnMinHitRate1, timeout, eleName);
}
public void setOnMinHitRate1(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setOnMinHitRate1, eleName, timeOut,typeData);
}
public void clickOnRadioButton2(String eleName, int timeout) throws Exception {
adriver.click(clickOnRadioButton2, timeout, eleName);
}
public void clickOnMinHitRate2(String eleName, int timeout) throws Exception {
adriver.click(clickOnMinHitRate2, timeout, eleName);
}
public void setOnMinHitRate2(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setOnMinHitRate2, eleName, timeOut,typeData);
}
public void clickOnUser(String eleName, int timeout) throws Exception {
adriver.click(clickOnUserName, timeout, eleName);
}
public void setOnUserName(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setUserName, eleName, timeOut,typeData);
}
public void clickOnPass(String eleName, int timeout) throws Exception {
adriver.click(clickOnPass, timeout, eleName);
}
public void setOnPassword(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setPassword, eleName, timeOut,typeData);
}
public void clickOnMaxEmployee(String eleName, int timeout) throws Exception {
adriver.click(clickOnMaxEmp, timeout, eleName);
}
public void setOnMaxEmployee(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setMaxEmp, eleName, timeOut,typeData);
}
public void setSubStartDate(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(SubscriptionStartDate, eleName, timeOut,typeData);
}
public void clickOnWillSubExp(String eleName, int timeout) throws Exception {
adriver.click(clickOnRadioButtonSubExpire, timeout, eleName);
}
public void clickOnAdd(String eleName, int timeout) throws Exception {
	
adriver.clickByAction(clickOnAdd, timeout, eleName);
}
}
