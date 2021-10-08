package com.hero.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;

public class GHQ_RegistorPage {
	/**
	 * This class will be created for Restistor Page Object Reprository :OR 
	 * 
	 * @throws Exception
	 * 
	 */
   
    public WebDriver driver;
    ActionDriver adriver ;
	public  GHQ_RegistorPage(WebDriver rdriver) {
		adriver = new ActionDriver();	
		driver = rdriver;
			PageFactory.initElements(rdriver, this);
	}
	
	/* Click on Registor and Start Link */ 
	By regLink               =   By.xpath("//input[@value='Register']");
	By textFirstName        = By.xpath("//input[@id='FirstName']");
	By textLastName        = By.xpath("///input[@id='LastName']");
	By clickStart           = By.xpath(("//input[@id='defaultSubmitButton']"));
	
	
	
		/* Setup Method for PHQ_Registor : Identification */

		public void clickOnRegistorLink(String eleName, int timeout) throws Exception {
			adriver.click(regLink, timeout, eleName);
		}

		public void setFirstName(String typeData, int timeout, String eleName) throws Exception {
			adriver.Type(textFirstName, eleName, timeout, typeData);
		}
		
		public void setLastName(String typeData, int timeout, String eleName) throws Exception {
			adriver.Type(textLastName, eleName, timeout, typeData);
		}

		
	}