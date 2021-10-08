package com.hero.pageObjectsMK;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class PeoValidationCheck {
	/**
	 * This class will be created for Register Page Object Repository :OR 
	 * 
	 * @throws Exception
	 * 
	 */
   
    public WebDriver driver;
    ActionDriver adriver ;
	public  PeoValidationCheck(WebDriver rdriver) {
		adriver = new ActionDriver();	
		driver = rdriver;
			PageFactory.initElements(rdriver, this);
	}
	
	/* Click on Registor and Start Link */ 
	By entryUW         =   By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
	
	
	By AdminMenu            = By.xpath("//a[contains(text(),'ADMINISTRATION')]");
	By PeoManagement        = By.xpath("//a[contains(text(),'PEO/Assoc./Trust Management')]");
	By SearchPeoBtn         = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[2]/label[1]/input[1]");
	By AddPeoBtn            = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[1]/div[1]/input[1]");
    By submit               = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[15]/div[1]/input[1]");
    By peoNameVal           = By.xpath("//span[@id='peoModel_PEOName-error']");
    By BrokerNameVal        = By.xpath("//span[@id='peoModel_BrokerId-error']");
    By AbbrNameNameVal      = By.xpath("//span[@id='peoModel_AbbrName-error']");
    By URLNameVal           = By.xpath("//span[@id='peoModel_URL-error']");
    By SubmissionEmailVal   = By.xpath("//span[@id='peoModel_SubmissionEmail-error']");
    By UWMemberVal          = By.xpath("//span[contains(text(),'Please select atleast one member for the Milliman ')]");
    By PrimaryUWMemberVal   = By.xpath("//span[contains(text(),'Please select a primary member for the Milliman UW')]");
  
  
  
  
  
    
    
		/* Setup Method for PHQ_Registor : Identification */
    
    public void clickOnentryUW(String eleName, int timeout) throws Exception {
		adriver.click(entryUW, timeout, eleName);
	}

    public void clickOnAdminMenu(String eleName, int timeout) throws Exception {
	    adriver.click(AdminMenu, timeout, eleName);
    }
    public void clickOnPeoManagement(String eleName, int timeout) throws Exception {
		adriver.click(PeoManagement, timeout, eleName);
	}
    public void clickOnAddPeoBtn(String eleName, int timeout) throws Exception {
		adriver.click(AddPeoBtn, timeout, eleName);
	}
	
    public void clickOnSubmit(String eleName, int timeout) throws Exception {
	    	//WebElement ele =	driver.findElement(submit);
			getUtil.ScrolldownTillPageEnd(driver);
			adriver.clickByAction(submit, timeout, eleName);
		}
    public void valTextPeoName(String expectedOutput,String eleName, int timeOut) throws Exception {
    	adriver.textValidation(peoNameVal, expectedOutput, timeOut, eleName);
    }
    public void valTextBrokerName(String expectedOutput,String eleName, int timeOut) throws Exception {
    	adriver.textValidation(BrokerNameVal, expectedOutput, timeOut, eleName);
    }
    public void valTextAbbrNameName(String expectedOutput,String eleName, int timeOut) throws Exception {
    	adriver.textValidation(AbbrNameNameVal, expectedOutput, timeOut, eleName);
    }
    public void valTextURLNameVal(String expectedOutput,String eleName, int timeOut) throws Exception {
    	adriver.textValidation(URLNameVal, expectedOutput, timeOut, eleName);
    }
    public void valTextSubmissionEmail(String expectedOutput,String eleName, int timeOut) throws Exception {
    	adriver.textValidation(SubmissionEmailVal, expectedOutput, timeOut, eleName);
    }
    public void valTextUWMember(String expectedOutput,String eleName, int timeOut) throws Exception {
    	adriver.textValidation(UWMemberVal, expectedOutput, timeOut, eleName);
    }
    public void valTextPrimaryUWMember(String expectedOutput,String eleName, int timeOut) throws Exception {
    	adriver.textValidation(PrimaryUWMemberVal, expectedOutput, timeOut, eleName);
    }
    
    
}

