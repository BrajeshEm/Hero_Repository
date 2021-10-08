package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class DrugsManagementPlansPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public DrugsManagementPlansPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on Edit Administration and AddDrugsManagement /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By administration = By.xpath("//body[1]/div[1]/div[5]/ul[1]/li[2]");
By clickOnDrugsManag = By.xpath("//a[contains(text(),'Drugs Management')]");
//By clickOnDrugType = By.xpath("//select[@id='drugModel_DrugType']");
By clickOnSelectDrugType = By.xpath("//option[contains(text(),'PHQ')]");
By clickOnBrowser = By.xpath("//input[@id='fileuploadfile']");
By clickOnAdd = By.xpath("//input[@id='submitbutton']");





// Setup Method for DrugsManagement : /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnAdministration(String eleName, int timeout) throws Exception {
adriver.click(administration, timeout, eleName);
}

public void clickOnDrugsManagement(String eleName, int timeOut) throws Exception {
adriver.click(clickOnDrugsManag,timeOut, eleName);
}
//public void clickOnDrugType(String eleName, int timeOut) throws Exception {
//	adriver.click(clickOnDrugType, timeOut,eleName );
//	}
public void selFactorType(String fType, int timeout,String eleName) throws Exception {
adriver.click(clickOnSelectDrugType, timeout, eleName);
driver.findElement(By.xpath("//option[normalize-space()='"+fType+"']")).click();
}
public void setOnFileUpload(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(clickOnBrowser, eleName, timeOut,typeData);
}
public void clickOnAdd(String eleName, int timeout) throws Exception {
adriver.click(clickOnAdd, timeout, eleName);
}


}
