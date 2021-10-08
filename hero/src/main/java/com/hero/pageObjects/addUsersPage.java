package com.hero.pageObjects;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class addUsersPage {
	private static final By Akash = null;
	/**
	 * This class will be created for Restistor Page Object Reprository :OR
	 * 
	 * @throws Exception
	 * 
	 */

	public WebDriver driver;
	ActionDriver adriver;

	public addUsersPage(WebDriver rdriver) {
		adriver = new ActionDriver();
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	/* Locator Defining */
	By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
	By admin = By.xpath("//a[normalize-space()='ADMINISTRATION']");
	By adduser = By.xpath("//a[contains(text(),'Add User')]");
	By firstName = By.xpath("//input[@id='FirstName']");
	By lastName = By.xpath("//input[@id='LastName']");
	By role = By.xpath("//select[@id='Role']");
	By selectRole = By.xpath("//option[@value='Admin']");
	By userName = By.xpath("//input[@id='UserName']");
	By email = By.xpath("//input[@id='Email']");
	By company = By.xpath("//select[@id='Company']");
	By selectCompany = By.xpath("//select[contains(@id,'Company')]");
	By selectAll = By.id("chkcompanyA");
	By submit = By.xpath("//input[@name='submit']");
	By userCreatedConfrmMsge = By.xpath("//div[.='The user has been successfully created.']");
	
	By textFirstName            =   By.xpath("//span[contains(text(),'Please enter First Name')]");                      
	By textLastName             =   By.xpath("//span[contains(text(),'Please enter Last Name')]");
	By textUserName             =   By.xpath("//span[contains(text(),'Please enter your Username')]");
	By textEmail                =   By.xpath("//span[contains(text(),'Please enter your Email')]");  
	By textRole                 =   By.xpath("//span[@id='Role-error']");
	By textSelectCompany           =   By.xpath("//span[contains(text(),'Please select Company')]");

	/* Setup Method for PHQ_Registor : Identification */

	public void clickOnentryUW(String eleName, int timeout) throws Exception {
		adriver.click(entryUW, timeout, eleName);
	}

	public void clickAdministration(String eleName, int timeout) throws Exception {
		adriver.click(admin, timeout, eleName);
	}

	public void clickOnaddUser(String eleName, int timeout) throws Exception {
		adriver.click(adduser, timeout, eleName);
	}

	public void textOnFname(String typeData, String eleName, int timeout) throws Exception {
		adriver.Type(firstName, eleName, timeout, typeData);
	}

	public void textOnLname(String typeData, String eleName, int timeout) throws Exception {
		adriver.Type(lastName, eleName, timeout, typeData);
	}

	public void selectRole(String typeData, String eleName, int timeout) throws Exception {
		adriver.selectByDropdwn(role, timeout, typeData);
	}

	public void selectCompany(String typeData, String eleName, int timeout) throws Exception {

		adriver.selectDropdwnByVisibleText(company, timeout, typeData);
//				driver.findElement(By.xpath("//select[@id='Company']")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//option[text()='Broker.PP']")).click();
	}

	public void textOnUname(String eleName, int timeout) throws Exception {
		adriver.Type(userName, eleName, timeout, getUtil.randomString());
	}

	public void textOnemail(String typeData, String eleName, int timeout) throws Exception {
		adriver.Type(email, eleName, timeout, typeData);
	}

	public void clickOnselectAll(String eleName, int timeout) throws Exception {
		getUtil.ScrolldownTillPageEnd(driver);
		adriver.click(selectAll, timeout, eleName);
	}

	public void clickOnsubmit(String eleName, int timeout) throws Exception {
		getUtil.ScrolldownTillPageEnd(driver);
		adriver.click(submit, timeout, eleName);
	}
	
	public void validationUserCreatedSuccessMsge(String expectedOutput,String eleName, int timeout) throws Exception {
		adriver.textValidation(userCreatedConfrmMsge,expectedOutput,timeout, eleName);
	}
	
	public void valTextMsgefName(String expectedOutput, String eleName, int timeout) throws Exception {
		adriver.textValidation(textFirstName,expectedOutput, timeout, eleName);
	}
	
	public void valTextMsgelName(String expectedOutput, String eleName, int timeout) throws Exception {
		adriver.textValidation(textLastName,expectedOutput, timeout, eleName);
	}			
	
	public void valTextMsgeuName(String expectedOutput, String eleName, int timeout) throws Exception {
		adriver.textValidation(textUserName,expectedOutput, timeout, eleName);
	}
	
	public void valTextMsgeemail(String expectedOutput, String eleName, int timeout) throws Exception {
		adriver.textValidation(textEmail,expectedOutput, timeout, eleName);
	}
	
	public void valTextMsgeRole(String expectedOutput, String eleName, int timeout) throws Exception {
		adriver.textValidation(textRole,expectedOutput, timeout, eleName);
	}
	
	public void valTextMsgeselectCompany(String expectedOutput, String eleName, int timeout) throws Exception {
		adriver.textValidation(textSelectCompany, expectedOutput, timeout, eleName);
     }	
}
