package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class CompanyDetailPageViewSubmissionPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public CompanyDetailPageViewSubmissionPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on EditCompany and Start Link /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By search = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]");
By sComp1IQE = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]");
By clickOnSearch = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/a[1]");
By clickOnCompany = By.xpath("//body[1]/div[1]/div[7]/section[1]/div[3]/div[1]/div[3]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[1]");
By clickOnSearchIcon = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[1]/div[1]/a[1]");
By viewSubmissionButton = By.xpath("//a[contains(text(),'View Submission')]");
By pasteCensus = By.xpath("//a[contains(text(),'Paste Census')]");




// Setup Method for PHQ_Registor : Identification /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnSearch(String eleName, int timeout) throws Exception {
adriver.click(search, timeout, eleName);
}
public void setOnScomp(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(sComp1IQE, eleName, timeOut,typeData);
}
public void clickOnSearchIcon(String eleName, int timeout) throws Exception {
adriver.click(clickOnSearch, timeout, eleName);
}

public void clickOnCompanyName(String eleName, int timeout) throws Exception {
	
adriver.click(clickOnCompany, timeout, eleName);
}

public void clickOnViewSubmission(String eleName, int timeout) throws Exception {
adriver.click(viewSubmissionButton, timeout, eleName);
}

}


//option[contains(text(),'"+ASQ+"')]


