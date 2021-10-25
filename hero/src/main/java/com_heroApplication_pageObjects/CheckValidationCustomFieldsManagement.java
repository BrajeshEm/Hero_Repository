package com_heroApplication_pageObjects;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class CheckValidationCustomFieldsManagement {
	private static final By Akash = null;
	/**
	 * This class will be created for Custom Fields Management Page Object Repository :OR
	 * 
	 * @throws Exception
	 * 
	 */

	public WebDriver driver;
	ActionDriver adriver;

	public CheckValidationCustomFieldsManagement(WebDriver rdriver) {
		adriver = new ActionDriver();
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}


	By customfieldsManagement = By.xpath("//a[contains(text(),'Custom Fields Management')]");

	By PEO = By.xpath("//button[normalize-space()='All PEO/Assoc./Trust']");
	By selectPEO = By.xpath("//label[normalize-space()='$Magic']");
	By Add = By.xpath("//input[@id='btnCustomFields']");
//	By Add = By.xpath("//input[@value='ADD']");
	By customfieldLabel = By.xpath("//span[contains(text(),'Please enter custom field label')]");
	By customfieldType = By.xpath("//span[@id='SpanCustomFieldTypes']");
	/* Setup Method for PHQ_Registor : Identification */

	

	public void clickOncustomfieldsManagement(String eleName, int timeout) throws Exception {
		adriver.click(customfieldsManagement, timeout, eleName);
	}

	public void selectPEO(String typeData,String eleName, int timeout) throws Exception {
	 //  driver.findElement(PEO).click();
	   adriver.click(PEO, timeout, eleName);
		By selectPEO = By.xpath("//label[normalize-space()='"+typeData+"']");
		//driver.findElement(selectPEO).click();
		adriver.click(selectPEO, timeout, eleName);
		
		//adriver.selectDropdwnByVisibleText(PEO, timeout, typeData);
	}

	public void clickOnAdd(String eleName, int timeout) throws Exception {
		getUtil.ScrolldownTillPageEnd(driver);
		adriver.click(Add, timeout, eleName);
	} 

	public void valTextMsgecflabel(String expectedOutput, String eleName, int timeout) throws Exception {
		adriver.textValidation(customfieldLabel, expectedOutput, timeout, eleName);
	}

	public void valTextMsgecfType(String expectedOutput, String eleName, int timeout) throws Exception {
		adriver.textValidation(customfieldType, expectedOutput, timeout, eleName);
	}
}
//  Not able to clicking on add button. 
