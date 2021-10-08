package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class FactorTableManagementPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public FactorTableManagementPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on FactorTable and AddTable /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By administration = By.xpath("//body[1]/div[1]/div[5]/ul[1]/li[2]");
By clickOnFactorTableMan = By.xpath("//a[contains(text(),'Factor Tables Management')]");
By clickOnFactorType = By.xpath("//select[@id='factorTablesModel_FactorType']");
By clickOnFactorName = By.xpath("//input[@id='factorTablesModel_FactorName']");
By setFactorName = By.xpath("//input[@id='factorTablesModel_FactorName']");
By clickOnTableName = By.xpath("//select[@id='factorTablesModel_TableName']");
By clickOnComment = By.xpath("//input[@id='factorTablesModel_Comment']");
By setComment = By.xpath("//input[@id='factorTablesModel_Comment']");
By clickOnAdd = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[2]/fieldset[1]/div[3]/div[7]/div[2]/input[1]");


// Setup Method for  AddFactorTable : /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnAdministration(String eleName, int timeout) throws Exception {
adriver.click(administration, timeout, eleName);
}
public void clickOnFactorTableManagement(String eleName, int timeOut) throws Exception {
adriver.click(clickOnFactorTableMan,timeOut, eleName);
}
public void selFactorType(String fType, int timeout,String eleName) throws Exception {
adriver.click(clickOnFactorType, timeout, eleName);
driver.findElement(By.xpath("//option[normalize-space()='"+fType+"']")).click();
}
public void clickOnFactorTableName(String eleName, int timeOut) throws Exception {
adriver.click(clickOnFactorName,timeOut, eleName);
}
public void setFactorName(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(setFactorName, eleName, timeOut,typeData);
	}
public void selTableName(String fType, int timeout,String eleName) throws Exception {
adriver.click(clickOnTableName, timeout, eleName);
driver.findElement(By.xpath("//option[@value='"+fType+"']")).click();
}
public void clickOnComment(String eleName, int timeOut) throws Exception {
adriver.click(clickOnComment,timeOut, eleName);
}
public void setComment(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(setComment, eleName, timeOut,typeData);
	}
public void clickOnAdd(String eleName, int timeOut) throws Exception {
adriver.click(clickOnAdd,timeOut, eleName);
}
   

//Click on FactorTable and ResetTable /

By clickOnReset = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[2]/fieldset[1]/div[3]/div[7]/div[2]/input[2]");


//Setup Method for  AddFactorTable : /

public void clickOnReset(String eleName, int timeOut) throws Exception {
adriver.click(clickOnReset,timeOut, eleName);
}

//Click on FactorTable and EditAddedTable /
By clickOnEditIcon = By.xpath("//tbody/tr[2]/td[9]/a[1]");






//Setup Method for  EditAddedFactorTable : /
public void clickOnEdit(String eleName, int timeOut) throws Exception {
adriver.click(clickOnEditIcon,timeOut, eleName);
}





}
