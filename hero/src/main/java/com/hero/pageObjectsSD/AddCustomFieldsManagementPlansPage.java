package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class AddCustomFieldsManagementPlansPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public AddCustomFieldsManagementPlansPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on Edit Administration and AddCustomFieldsManagement /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By administration = By.xpath("//body[1]/div[1]/div[5]/ul[1]/li[2]");
By clickOnCustomFieldsManag = By.xpath("//a[contains(text(),'Custom Fields Management')]");
By clickOnSelectPeo = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
By setPeo = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/label[1]");
By clickOnCustomFieldLabel = By.xpath("//input[@id='customField_CustomFieldLabel']");
By setOnCustomFieldLabel = By.xpath("//input[@id='customField_CustomFieldLabel']");
By clickOnCustomFieldType = By.xpath("//select[@id='ddlCustomFieldTypeId']");
By setOnCustomFieldType = By.xpath("//option[contains(text(),'Textbox')]");
By clickOnParentName = By.xpath("//select[@id='ddlCustomFieParentld']");
By setOnParentName = By.xpath("//option[contains(text(),'Parent1')]");
By clickOnParentValue = By.xpath("//input[@id='ddlCustomFieldParentld']");
By setOnParentValue = By.xpath("//input[@id='ddlCustomFieldParentld']");
By clickOnComparisonoperator = By.xpath("//select[@id='ddlCompareOperator']");
By setOnComparisonoperator = By.xpath("//option[@id='id1']");
By clickOnRequiredCheckBox = By.xpath("//input[@id='customField_IsRequired']");
By clickOnAdd = By.id("btnCustomFields");
By Automation = By.xpath("//option[contains(normalize-space(),'Automation')]");
By clickPeo  = By.xpath("//button[normalize-space()='All PEO/Assoc./Trust']");
By PeoNameType = By.xpath("//input[@placeholder='Search']");
By clickPeoName = By.cssSelector("section[id='content'] form");     





// Setup Method for CustomFieldsManagement : /
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
public void setOnCustomFieldLabel(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setOnCustomFieldLabel, eleName, timeOut,typeData);
}
public void clickOnCustomFieldType(String eleName, int timeout) throws Exception {
adriver.click(clickOnCustomFieldType, timeout, eleName);
}
public void setOnCustomFieldType(String eleName, int timeout) throws Exception {
adriver.click(setOnCustomFieldType, timeout, eleName);
}
public void clickOnParentName(String eleName, int timeout) throws Exception {
//adriver.click(clickOnParentName, timeout, eleName);
	adriver.selectDropdwnByVisibleText(clickOnParentName, timeout, eleName);
}
public void setOnParentValue(String eleName, int timeout) throws Exception {

//
adriver.click(Automation, timeout, eleName);
}
public void clickOnParentValue(String eleName, int timeout) throws Exception {
adriver.click(clickOnParentValue, timeout, eleName);
}
public void setOnParentValue(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setOnParentValue, eleName, timeOut,typeData);
}



public void clickOnComparisonoperator(String eleName, int timeout) throws Exception {
adriver.click(clickOnComparisonoperator, timeout, eleName);
}
public void setOnComparisonoperator(String eleName, int timeout) throws Exception {
//adriver.click(setOnComparisonoperator, timeout, eleName);
adriver.selectDropdwnByVisibleText(clickOnComparisonoperator, timeout, eleName);
}
public void setOnRequiredCheckBox(String eleName, int timeout) throws Exception {
adriver.click(clickOnRequiredCheckBox, timeout, eleName);
}
public void clickOnAdd(String eleName, int timeout) throws Exception {
	getUtil.acrollIntoView(driver.findElement(clickOnAdd), driver);
adriver.click(clickOnAdd, timeout, eleName);
}

public void selPeo(String typeData,int timeOut,String eleName) throws Exception {
	adriver.click(clickPeo, timeOut, eleName);
	adriver.Type(PeoNameType, eleName, timeOut, typeData);
	Thread.sleep(2000);
	adriver.click(By.xpath("//label[normalize-space()='"+typeData+"']"), timeOut, eleName);
}

public void selPeo2(String typeData,int timeOut,String eleName) throws Exception {
	adriver.click(clickPeo, timeOut, eleName);
	adriver.Type(PeoNameType, eleName, timeOut, typeData);
	Thread.sleep(2000);
	adriver.click(By.xpath("//label[normalize-space()=\"*Te-st,P_e.o'2&(3)_-'.,\"]"), timeOut, eleName);
}

public void clickAddValueIcon(int timeOut,String eleName) throws Exception {
	
	adriver.clickByJs(By.xpath("//tbody/tr[1]/td[9]/a[1]/img[1]"), timeOut, eleName);
}


//public void clickOnLocation(String eleName, int timeout) throws Exception {
//adriver.click(clickOnLocation, timeout, eleName);
//}
//public void clickOnLocCheckbox(String eleName, int timeout) throws Exception {
//adriver.click(ClickOnLocCheckbox, timeout, eleName);
//}
//
//public void clickOnRadioButton(String eleName, int timeout) throws Exception {
//adriver.click(clickOnRadioButton1, timeout, eleName);
//}
//public void clickOnMinHitRate1(String eleName, int timeout) throws Exception {
//adriver.click(clickOnMinHitRate1, timeout, eleName);
//}
//public void setOnMinHitRate1(String eleName, int timeOut,String typeData) throws Exception {
//adriver.Type(setOnMinHitRate1, eleName, timeOut,typeData);
//}
//public void clickOnRadioButton2(String eleName, int timeout) throws Exception {
//adriver.click(clickOnRadioButton2, timeout, eleName);
//}
//public void clickOnMinHitRate2(String eleName, int timeout) throws Exception {
//adriver.click(clickOnMinHitRate2, timeout, eleName);
//}
//public void setOnMinHitRate2(String eleName, int timeOut,String typeData) throws Exception {
//adriver.Type(setOnMinHitRate2, eleName, timeOut,typeData);
//}
//public void clickOnUser(String eleName, int timeout) throws Exception {
//adriver.click(clickOnUserName, timeout, eleName);
//}

//public void clickOnPass(String eleName, int timeout) throws Exception {
//adriver.click(clickOnPass, timeout, eleName);
//}
//public void setOnPassword(String eleName, int timeOut,String typeData) throws Exception {
//adriver.Type(setPassword, eleName, timeOut,typeData);
//}
//public void clickOnMaxEmployee(String eleName, int timeout) throws Exception {
//adriver.click(clickOnMaxEmp, timeout, eleName);
//}
//public void setOnMaxEmployee(String eleName, int timeOut,String typeData) throws Exception {
//adriver.Type(setMaxEmp, eleName, timeOut,typeData);
//}
//public void setSubStartDate(String eleName, int timeOut,String typeData) throws Exception {
//adriver.Type(SubscriptionStartDate, eleName, timeOut,typeData);
//}
//public void clickOnWillSubExp(String eleName, int timeout) throws Exception {
//adriver.click(clickOnRadioButtonSubExpire, timeout, eleName);
//}
}
