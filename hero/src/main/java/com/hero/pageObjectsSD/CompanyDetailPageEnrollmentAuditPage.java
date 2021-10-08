package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class CompanyDetailPageEnrollmentAuditPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public CompanyDetailPageEnrollmentAuditPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on EnrollmentAudit and Start Link /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By search = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]");
By sVolume1Hrx = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]");
By clickOnSearch = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/a[1]");
By clickOnCompany = By.xpath("//body[1]/div[1]/div[7]/section[1]/div[3]/div[1]/div[3]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[1]");
By clickOnSearchIcon = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/a[1]");
By editCompanyRecordButton = By.xpath("//a[contains(text(),'Edit Company Record')]");
By status = By.xpath("//select[@id='StatusId']");
By sold = By.xpath("//body/div[@id='container']/div[6]/div[2]/div[1]/section[1]/form[1]/div[1]/div[2]/div[5]/div[2]/select[1]/option[7]");
By saveAndContinue = By.xpath("//input[@id='btnSave']");
By census = By.xpath("//body/div[@id='container']/div[6]/div[1]/div[2]/div[1]/div[3]/li[1]/a[1]");
By enrollmentAudit = By.xpath("//span[@class='bootstrap-switch-label']");
By clickOnPasteCensus = By.xpath("//a[contains(text(),'Paste Census')]");
By runAudit = By.xpath("//input[@id='btnRunQuote']");


//Click on ParityToolPage and Start Link /
By parity = By.xpath("//a[contains(text(),'Parity Tool')]");
By addPlan = By.xpath("//input[@id='btnAddParityTool']");
By planName = By.xpath("//input[@id='PlanName']");
By eE = By.xpath("//input[@id='EE']");
By eS = By.xpath("//input[@id='ES']");
By eC = By.xpath("//input[@id='EC']");
By fam = By.xpath("//input[@id='Fam']");
By planType = By.xpath("//select[@id='PlanType']");
By setPlanPpo = By.xpath("//option[contains(text(),'PPO/POS')]");
By inNwDeductible = By.xpath("//input[@id='Deductible']");
By memberCoin = By.xpath("//select[@id='MemberCoinsurance']");
By setMemberCoin = By.xpath("//body/div[3]/div[1]/form[1]/div[2]/div[13]/div[2]/select[1]/option[4]");
By inNwPrimaryCar = By.xpath("//input[@id='PCPCopay']");
By inNwOutOfPocket = By.xpath("//input[@id='OOPMax']");
By outNwDeduct = By.xpath("//input[@id='DeductibleOutofNetwork']");
By outOfNwMemberCoin = By.xpath("//select[@id='OutOfNetworkCoinsurance']");
By selectMemCoin = By.xpath("//body/div[3]/div[1]/form[1]/div[2]/div[17]/div[3]/div[2]/select[1]/option[2]");
By outOfNwOopMax = By.xpath("//input[@id='OOPMaxOutofNetwork']");
By genericCoapy = By.xpath("//input[@id='GenericCopay']");
By forCoapy = By.xpath("//input[@id='FormularyCopay']");
By nonForCopay = By.xpath("//input[@id='NonFormularyCopay']");
By save = By.xpath("//input[@id='btnResultSave']");


//Click on EnrollmentAudit and Start Link /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnSearch(String eleName, int timeout) throws Exception {
adriver.click(search, timeout, eleName);
}
public void setOnScomp(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(sVolume1Hrx, eleName, timeOut,typeData);
}
public void clickOnSearchIcon(String eleName, int timeout) throws Exception {
adriver.click(clickOnSearch, timeout, eleName);
}

public void clickOnCompanyName(String eleName, int timeout) throws Exception {
	
adriver.click(clickOnCompany, timeout, eleName);
}

public void clickOnEditCompany(String eleName, int timeout) throws Exception {
adriver.click(editCompanyRecordButton, timeout, eleName);
}

public void setStatus(String eleName, int timeout) throws IOException, InterruptedException {
driver.findElement(status).click();
//Thread.sleep(10000);
//adriver.selectByDropdwn(freshPeo, timeout, eleName);
driver.findElement(sold).click();

}
public void clickOnSave(String eleName, int timeout) throws Exception {
adriver.click(saveAndContinue, timeout, eleName);
}
public void clickOnCensusButton(String eleName, int timeout) throws Exception {
adriver.click(census, timeout, eleName);
}

public void clickOnEnrollmentAuditButton(String eleName, int timeout) throws Exception {
adriver.click(enrollmentAudit, timeout, eleName);
}
public void clickOnPasteCensus(String eleName, int timeout) throws Exception {
adriver.click(clickOnPasteCensus, timeout, eleName);
}
public void clickOnRunAuditButton(String eleName, int timeout) throws Exception {
adriver.click(runAudit, timeout, eleName);
}


//Click on ParityToolPage and Start Link /

public void clickOnParityButton(String eleName, int timeout) throws Exception {
adriver.click(parity, timeout, eleName);
}
public void clickOnAddParityPlanButton(String eleName, int timeout) throws Exception {
adriver.click(addPlan, timeout, eleName);
}
public void setPlanName(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(planName, eleName, timeOut,typeData);
	}
public void setEEBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(eE, eleName, timeOut,typeData);
	}
public void setEsBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(eS, eleName, timeOut,typeData);
	}
public void setEcBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(eC, eleName, timeOut,typeData);
	}
public void setFamBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(fam, eleName, timeOut,typeData);
	}
public void setPlanDesign(String eleName, int timeout) throws IOException, InterruptedException {
driver.findElement(planType).click();
driver.findElement(setPlanPpo).click();
}
public void setDeductibleBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(inNwDeductible, eleName, timeOut,typeData);
	}
public void setMemberCoinsurancr(String eleName, int timeout) throws IOException, InterruptedException {
driver.findElement(memberCoin).click();
driver.findElement(setMemberCoin).click();
}
public void setPrimaryCarePhyCopayBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(inNwPrimaryCar, eleName, timeOut,typeData);
	}
public void setOutOfPocketBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(inNwOutOfPocket, eleName, timeOut,typeData);
	}
public void setOnDeductibleBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(outNwDeduct, eleName, timeOut,typeData);
	}
public void setMemberCoinBox(String eleName, int timeout) throws IOException, InterruptedException {
	 driver.findElement(outOfNwMemberCoin).click();
	 //Thread.sleep(10000);
	 //adriver.selectByDropdwn(freshPeo, timeout, eleName);
	 driver.findElement(selectMemCoin).click();

	 }
public void setOutOfNwOopMaxBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(outOfNwOopMax, eleName, timeOut,typeData);
	}
public void setGenericCopayBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(genericCoapy, eleName, timeOut,typeData);
	}
public void setForCopayBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(forCoapy, eleName, timeOut,typeData);
	}
public void setNonForCopayBox(String eleName, int timeOut,String typeData) throws Exception {
	adriver.Type(nonForCopay, eleName, timeOut,typeData);
	}
public void clickOnSaveButton(String eleName, int timeout) throws Exception {
adriver.click(save, timeout, eleName);
}
}

