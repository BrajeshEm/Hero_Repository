package com_heroApplication_pageObjects;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class AddParityPlansPeoPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public AddParityPlansPeoPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on Edit PEO/Assoc./Trust and AddParityPlans /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By administration = By.xpath("//body[1]/div[1]/div[5]/ul[1]/li[2]");
By clickOnPeoAssoc = By.xpath("//a[contains(text(),'PEO/Assoc./Trust Management')]");
By clickOnSearch = By.xpath("//input[@placeholder='Search']");
By setfresh = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[2]/label[1]/input[1]");
By clickOnSearchIcon = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[2]/a[1]");
By clickOnEdit = By.xpath("//tr[@class='odd']//a[@class='imageEditItem'][normalize-space()='Edit']");
By clickOnParityPlan = By.xpath("//span[normalize-space()='Parity Plans']");
By clickOnDownloadTemplateLink = By.xpath("//a[contains(text(),'Download Parity Plan template')]");
By ClickOnBrowse = By.xpath("//input[@id='prityfileupload']");
By clickOnAdd = By.xpath("//input[@id='addParityPlans']");


// Setup Method for  ParityPlans : /
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
	 driver.findElement(clickOnSearch).sendKeys(Keys.ENTER);
	}
public void setOnSPeo(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(clickOnSearch, eleName, timeOut,typeData);
driver.findElement(clickOnSearch).sendKeys(Keys.ENTER);
}
public void clickOnSearchIcon(String eleName, int timeout) throws Exception {
adriver.click(clickOnSearchIcon, timeout, eleName);
} 
public void clickOnEditIcon(String eleName, int timeout) throws Exception {
adriver.click(clickOnEdit, timeout, eleName);
}
public void clickOnParityPlans(String eleName, int timeout) throws Exception {
	getUtil.acrollIntoView(driver.findElement(clickOnParityPlan), driver);
adriver.click(clickOnParityPlan, timeout, eleName);
}
public void clickOnDownParityTemplate(String eleName, int timeout) throws Exception {
adriver.click(clickOnDownloadTemplateLink, timeout, eleName);
}
public void clickOnBrowseButton(String eleName, int timeout) throws Exception {
adriver.click(ClickOnBrowse, timeout, eleName);
}
public void clickOnAddButton(String eleName, int timeout) throws Exception {
adriver.click(clickOnAdd, timeout, eleName);

}



}
