package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class StartQuotePageCurv {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public StartQuotePageCurv(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on Registor and Start Link /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By startq = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[1]/div[1]/div[1]/input[1]");
By compName = By.xpath("//input[@id='ClientName']");
By peo = By.xpath("//select[@id='PEOId']");
By freshPeo = By.xpath("//option[contains(text(),'Fresh PEO')]");
By uwType = By.xpath("//select[@id='UWTypeCode']");
By curv = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[2]/div[3]/div[2]/select[1]/option[2]");
By status = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[2]/div[4]/div[2]/select[1]/option[2]");
By reviewedByUw = By.xpath("//option[contains(text(),'Reviewed by UW')]");
By numOfEmp = By.xpath("//input[@id='ClientNbrEmployeeEnroll']");
By currentHealthCarrier = By.xpath("//select[@id='CurrentHealthProvider']");
By noneVirgin = By.xpath("//option[contains(text(),'None/Virgin')]");
By isCompCurrentlyWithPeo = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[2]/div[14]/div[2]/div[1]/input[2]");
By effectiveDate = By.xpath("//input[@id='ClientEffectiveDate']");
By selcity = By.xpath("//span[@title='Select City']");
By textBox = By.xpath("//input[@role='searchbox']");

By cNameAckron = By.xpath("//li[normalize-space()='Akron']");
By state = By.xpath("//select[@id='ClientState']");
By selectState = By.xpath("//option[contains(text(),'ALABAMA')]");
By zipCode = By.xpath("//input[@id='ClientZip']");
By location = By.xpath("//select[@id='ClientLocation']");
By selectLocation = By.xpath("//option[contains(text(),'fresh_q1')]");
By industryCode = By.xpath("//input[@id='IndustryCode']");
By upcommingRenewalDate = By.xpath("//input[@id='RenewalDate']");
By custom1TextBox = By.xpath("//input[@id='customField1']");
By contacts = By.xpath("//input[@id='chkcompanymGQDJd9qo4d9l__x_Ga6rN6ZrsY__x___i_vZLdUhJu3HNIEDQT1DYQRZ9Ru6Vw__s___s_']");
By primary = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[3]/div[1]/div[1]/a[1]");
By saveAndContinue = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[2]/div[1]/input[1]");
// Setup Method for PHQ_Registor : Identification /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnentrySQ(String eleName, int timeout) throws Exception {
adriver.click(startq, timeout, eleName);
}
public void setOnComp(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(compName, eleName, timeOut,typeData);
}
// public void TypeOnPeo(String eleName, int timeOut,String typeData) throws Exception {
// adriver.selectByDropdwn(peo, timeOut, eleName);
// }

public void setPeo(String eleName, int timeout) throws IOException, InterruptedException {
driver.findElement(peo).click();
//Thread.sleep(10000);
//adriver.selectByDropdwn(freshPeo, timeout, eleName);
driver.findElement(freshPeo).click();

}
public void setUwType(String eleName, int timeout) throws IOException, InterruptedException {
driver.findElement(uwType).click();
//Thread.sleep(10000);
//adriver.selectByDropdwn(freshPeo, timeout, eleName);
driver.findElement(curv).click();

}
public void setStatus(String eleName, int timeout) throws IOException, InterruptedException {
driver.findElement(status).click();
//Thread.sleep(10000);
//adriver.selectByDropdwn(freshPeo, timeout, eleName);
driver.findElement(reviewedByUw).click();

}

public void setNumOFEmp(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(numOfEmp, eleName, timeOut,typeData);
}

public void setCurrentHealthCarrier(String typeData, String eleName, int timeout) throws Exception {
//driver.findElement(currentHealthCarrier).click();
	adriver.clickByAction(currentHealthCarrier, timeout, eleName);
Thread.sleep(2000);
//adriver.selectByDropdwn(freshPeo, timeout, eleName);
	driver.findElement(By.xpath("//option[@value='"+typeData+"']")).click();
}

public void clickOnCompWithCurrentlyPeo(String eleName, int timeout) throws Exception {
adriver.click(isCompCurrentlyWithPeo, timeout, eleName);
}
public void setEffectiveDate(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(effectiveDate, eleName, timeOut,typeData);
}

public void selCity(String typeData,String eleName, int timeOut) throws Exception {
	
WebElement ele = driver.findElement(By.xpath("//label[normalize-space()='Company/Group ID']"));
getUtil.acrollIntoView(ele, driver);
adriver.clickByAction(selcity, timeOut, eleName);
adriver.Type(textBox, eleName, timeOut, typeData);
adriver.clickByAction(cNameAckron, timeOut, eleName);
}
public void setState(String eleName, int timeout) throws IOException, InterruptedException {
	 driver.findElement(state).click();
	 //Thread.sleep(10000);
	 //adriver.selectByDropdwn(freshPeo, timeout, eleName);
	 driver.findElement(selectState).click();

	 }

public void setZipCode(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(zipCode, eleName, timeOut,typeData);
}
public void setLocation(String eleName, int timeout) throws IOException, InterruptedException {
	 driver.findElement(location).click();
	 //Thread.sleep(10000);
	 //adriver.selectByDropdwn(freshPeo, timeout, eleName);
	 driver.findElement(selectLocation).click();

	 }

public void setIndustryCode(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(industryCode, eleName, timeOut,typeData);
}
public void setUpcommingRenewalDate(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(upcommingRenewalDate, eleName, timeOut,typeData);
}
public void setUpcustom1TextBox(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(custom1TextBox, eleName, timeOut,typeData);
}
public void selContacts(String typeData,String eleName, int timeOut) throws Exception {
WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
getUtil.acrollIntoView(ele, driver);
adriver.clickByAction(contacts, timeOut, eleName);
adriver.clickByAction(primary, timeOut, eleName);
}
public void clickOnSave(String eleName, int timeout) throws Exception {
adriver.click(saveAndContinue, timeout, eleName);
}

//option[contains(text(),'"+ASQ+"')]


}