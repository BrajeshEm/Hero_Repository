package com_heroApplication_pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class CompanyPage {
	/**
	 * This class will be created for Restistor Page Object Reprository :OR
	 *
	 * @throws Exception
	 *
	 */

	public WebDriver driver;
	ActionDriver adriver;

	public CompanyPage(WebDriver rdriver) {
		adriver = new ActionDriver();
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

// Click on EditCompany and Start Link /
	By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
	By search = By.xpath("//input[@placeholder='Search']");
	By sComp1IQE = By
			.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]");
	By clickOnSearch = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/a[1]");
	By clickOnCompany = By.xpath(
			"//body[1]/div[1]/div[7]/section[1]/div[4]/div[1]/div[3]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[1]");
	By clickOnSearchIcon = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/a[1]");
	By uploadButton = By.xpath("//input[@id='btnMultipleupload']");
	By clickOnFile = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/span[1]/input[1]");
	By save = By.xpath("//input[@id='btnUploadDoc']");
	By sComp6 = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]");

	By viewSubmissionButton = By.xpath("//a[contains(text(),'View Submission')]");
	By pasteCensus = By.xpath("//a[contains(text(),'Paste Census')]");

//Click on EnrollmentAudit and Start Link /

	By sVolume1Hrx = By
			.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]");

	By editCompanyRecordButton = By.xpath("//a[contains(text(),'Edit Company Record')]");
	By status = By.xpath("//select[@id='StatusId']");
	By sold = By.xpath(
			"//body/div[@id='container']/div[6]/div[2]/div[1]/section[1]/form[1]/div[1]/div[2]/div[5]/div[2]/select[1]/option[7]");
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

//Click on SearchedCompany and Start Link /

	By sComp1SW = By
			.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]");
	By clickOnPhq = By.xpath("//body/div[@id='container']/div[6]/div[1]/div[2]/div[1]/div[2]/li[1]/a[1]");

	
	
	
	By censusButton = By.xpath("//a[contains(text(),'Census')]");
	
	By add = By.xpath("//body/div[3]/div[2]/div[3]/input[1]");
	By runQuote = By.xpath("//input[@id='btnRunQuote']");
	
	
	
	
	
	
	// Click on EditCompany and Start Link /
	
	By sComp1 = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]");
	
	By editC = By.xpath("//body[1]/div[1]/div[7]/section[1]/div[3]/div[1]/div[3]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]");

	By customField = By.xpath("//body/div[2]/div[1]/form[1]/div[2]/div[14]/div[7]/div[2]/div[1]/input[1]");

	
	
	// Click on Registor and Start Link /
	
	By administration = By.xpath("//body[1]/div[1]/div[5]/ul[1]/li[2]");
	By clickOnCustomFieldsManag = By.xpath("//a[contains(text(),'Custom Fields Management')]");
	By clickOnSelectPeo = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
	By setPeo = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/label[1]");
	By clickOnEditIcon = By.xpath("///tbody/tr[8]/td[7]/a[1]");
	By clickOnParentValue = By.xpath("//input[@id='ddlCustomFieldParentld']");
	By setOnParentValue = By.xpath("//input[@id='ddlCustomFieldParentld']");
	By clickOnComparisonoperator = By.xpath("//select[@id='ddlCompareOperator']");
	By setOnComparisonoperator = By.xpath("//option[contains(text(),'<')]");
	By clickOnSave = By.xpath("//input[@id='btnCustomFields']");
	

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
public void clickOnEditIcon(String eleName, int timeOut) throws Exception {
	getUtil.ScrolldownTillPageEnd(driver);
adriver.click(clickOnEditIcon, timeOut, eleName);
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
adriver.click(setOnComparisonoperator, timeout, eleName);
}



	
	
	
	
	
	
	getUtil get = new getUtil(driver);



	public void clickOnSearch(String eleName, int timeout) throws Exception {
		adriver.click(search, timeout, eleName);
	}

	public void setOnScomp(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(search, eleName, timeOut, typeData);
		driver.findElement(search).sendKeys(Keys.ENTER);
	}

	public void clickOnSearchIcon(String eleName, int timeout) throws Exception {
		adriver.click(clickOnSearch, timeout, eleName);
	}

	public void clickOnCompanyName(String eleName, int timeout) throws Exception {
//	List<WebElement> ele = driver.findElements(By.xpath("//a[normalize-space()='Comp_Hero']"));
//	ele.get(1).click();
		adriver.clickByJs(clickOnCompany, timeout, eleName);
	}

	public void clickOnUpload(String eleName, int timeout) throws Exception {
		adriver.click(uploadButton, timeout, eleName);
	}

	public void clickOnFile(String eleName, int timeout) throws Exception {
		adriver.click(clickOnFile, timeout, eleName);
	}
//driver.findElement().Sendkeys("C://Users//dell//Downloads//CompanyTrackingReport (8) (1).xlsx");

	public void clickOnSave(String eleName, int timeout) throws Exception {
		adriver.click(save, timeout, eleName);
	}

	public void clickOnViewSubmission(String eleName, int timeout) throws Exception {
		adriver.click(viewSubmissionButton, timeout, eleName);
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

	public void setPlanName(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(planName, eleName, timeOut, typeData);
	}

	public void setEEBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(eE, eleName, timeOut, typeData);
	}

	public void setEsBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(eS, eleName, timeOut, typeData);
	}

	public void setEcBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(eC, eleName, timeOut, typeData);
	}

	public void setFamBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(fam, eleName, timeOut, typeData);
	}

	public void setPlanDesign(String eleName, int timeout) throws IOException, InterruptedException {
		driver.findElement(planType).click();
		driver.findElement(setPlanPpo).click();
	}

	public void setDeductibleBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(inNwDeductible, eleName, timeOut, typeData);
	}

	public void setMemberCoinsurancr(String eleName, int timeout) throws IOException, InterruptedException {
		driver.findElement(memberCoin).click();
		driver.findElement(setMemberCoin).click();
	}

	public void setPrimaryCarePhyCopayBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(inNwPrimaryCar, eleName, timeOut, typeData);
	}

	public void setOutOfPocketBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(inNwOutOfPocket, eleName, timeOut, typeData);
	}

	public void setOnDeductibleBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(outNwDeduct, eleName, timeOut, typeData);
	}

	public void setMemberCoinBox(String eleName, int timeout) throws IOException, InterruptedException {
		driver.findElement(outOfNwMemberCoin).click();
		// Thread.sleep(10000);
		// adriver.selectByDropdwn(freshPeo, timeout, eleName);
		driver.findElement(selectMemCoin).click();

	}

	public void setOutOfNwOopMaxBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(outOfNwOopMax, eleName, timeOut, typeData);
	}

	public void setGenericCopayBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(genericCoapy, eleName, timeOut, typeData);
	}

	public void setForCopayBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(forCoapy, eleName, timeOut, typeData);
	}

	public void setNonForCopayBox(String eleName, int timeOut, String typeData) throws Exception {
		adriver.Type(nonForCopay, eleName, timeOut, typeData);
	}

	public void clickOnSaveButton(String eleName, int timeout) throws Exception {
		adriver.click(save, timeout, eleName);
	}

	public void clickOnPhq(String eleName, int timeout) throws Exception {
		adriver.click(clickOnPhq, timeout, eleName);
	}


		public void clickOnCensus(String eleName, int timeout) throws Exception {
		adriver.click(censusButton, timeout, eleName);
		}
		
		public void clickOnAdd(String eleName, int timeout) throws Exception {
		adriver.click(add, timeout, eleName);
		}
		public void clickOnRunQuote(String eleName, int timeout) throws Exception {
		adriver.click(runQuote, timeout, eleName);
		}

	

	

			public void clickOnCustomField(String eleName, int timeout) throws Exception {
			adriver.click(customField, timeout, eleName);
			}
		



	
	
}
