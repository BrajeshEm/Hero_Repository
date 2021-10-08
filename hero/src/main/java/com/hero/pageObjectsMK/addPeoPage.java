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

public class addPeoPage {
	/**
	 * This class will be created for Register Page Object Repository :OR
	 * 
	 * @throws Exception
	 * 
	 */

	public WebDriver driver;
	ActionDriver adriver;

	public addPeoPage(WebDriver rdriver) {
		adriver = new ActionDriver();
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	/* Click on Registor and Start Link */
	By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");

	By AdminMenu = By.xpath("//a[contains(text(),'ADMINISTRATION')]");

	By PeoManagement = By.xpath("//a[contains(text(),'PEO/Assoc./Trust Management')]");

	By AddPeoBtn = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[1]/div[1]/input[1]");

	/* Add Peo Page elements */

	By PeoName = By.id("peoModel_PEOName");
	By Status = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/input[1]");
	By BrokerName = By.xpath("//select[@id='peoModel_BrokerId']");
	By broker = By.xpath("//option[contains(text(),'Aeroline Brokers')]");
	By AbbreviatedName = By.xpath("//input[@id='peoModel_AbbrName']");
	By Url = By.xpath("//input[@id='peoModel_URL']");
	By MilliSubEmail = By.xpath("//input[@id='peoModel_SubmissionEmail']");
	By uwTeam = By.xpath("//input[@id='chkcompany5wlJoeR7iXYP3YSfJDjya2K4dNO92WHuvxAoQKDqT86o0xwfgcHr__i_g__s___s_']");
	By primary = By.xpath("//a[@class='imageContact']");
	By submit = By.xpath("//input[@id='submitbutton']|//input[@name='command']");
	By submit1 = By.xpath("//input[@name='SUBMIT']");
	

	/* Setup Method for PHQ_Registor : Identification */

	getUtil get = new getUtil(driver);

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

	public void SetPeoName(String typeData, String eleName, int timeout) throws Exception {
		adriver.Type(PeoName, eleName, timeout, typeData);
	}

	public void clickOnStatus(String eleName, int timeout) throws Exception {
		adriver.clickByJs(Status, timeout, eleName);
	}

	public void SetBrokerName(String eleName, int timeout) throws IOException, InterruptedException {
		driver.findElement(BrokerName).click();
		Thread.sleep(3000);
		driver.findElement(broker).click();
	}

	public void SetAbbreviatedName(String typeData, String eleName, int timeout) throws Exception {
		adriver.Type(AbbreviatedName, eleName, timeout, typeData);
	}

	public void SetUrl(String typeData, String eleName, int timeout) throws Exception {
		adriver.Type(Url, eleName, timeout, typeData);
	}

	public void SetMilliSubEmail(String typeData, String eleName, int timeout) throws Exception {
		adriver.Type(MilliSubEmail, eleName, timeout, typeData);
	}

	public void selTeamUW(String eleName, int timeOut) throws Exception {
		WebElement ele = driver.findElement(By.xpath("//label[normalize-space()='Milliman UW team']"));
		getUtil.acrollIntoView(ele, driver);
		adriver.clickByAction(uwTeam, timeOut, eleName);
		adriver.clickByAction(primary, timeOut, eleName);
	}

	public void clickOnSubmit(String eleName, int timeout) throws Exception {
		adriver.clickByJs(submit, timeout, eleName);
	}
	
	public void clickOnSubmit1(String eleName, int timeout) throws Exception {
		adriver.clickByJs(submit1, timeout, eleName);
	}
	
}