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

public class addCarrier {
	/**
	 * This class will be created for Register Page Object Repository :OR 
	 * 
	 * @throws Exception
	 * 
	 */
   
    public WebDriver driver;
    ActionDriver adriver ;
	public  addCarrier(WebDriver rdriver) {
		adriver = new ActionDriver();	
		driver = rdriver;
			PageFactory.initElements(rdriver, this);
	}
	
	/* Click on Registor and Start Link */ 
	By entryUW         =   By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
	
	By AdminMenu       = By.xpath("//a[contains(text(),'ADMINISTRATION')]");
			
	By CarrierMgmt     = By.xpath("//a[contains(text(),'Carrier Management')]");
	
	By AddCarBtn       = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[1]/div[1]/input[1]");
	
	
	/* Add Carrier Page elements */
	
	By CompanyName        = By.id("CarrierName");
	By Status             = By.xpath("//input[@data-val-required='The Status field is required.']");
	By SelectPeo          = By.xpath("//button[normalize-space()='Select']");
	By searchPeo          = By.xpath("//input[@placeholder='Search']");
	By clickanyele             = By.xpath("//label[normalize-space()='Select PEO']");
	By submit             = By.xpath("//input[@id='submitbutton']");
	
		//Elements of Add Carrier page
	
	getUtil get = new getUtil(driver);

		public void clickOnentryUW(String eleName, int timeout) throws Exception {
			adriver.click(entryUW, timeout, eleName);
		}
	
	    public void clickOnAdminMenu(String eleName, int timeout) throws Exception {
		    adriver.click(AdminMenu, timeout, eleName);
	    }
	    public void clickOnCarManagement(String eleName, int timeout) throws Exception {
			adriver.click(CarrierMgmt, timeout, eleName);
		}
	    public void clickOnAddCarBtn(String eleName, int timeout) throws Exception {
			adriver.click(AddCarBtn, timeout, eleName);
		}
	    public void SetCompName(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(CompanyName, eleName, timeout, typeData);
		}
	    public void clickOnStatus(String eleName, int timeout) throws Exception {
			adriver.clickByJs(Status, timeout, eleName);
		}
	    public void SetSelectedPeoName(String typeData, int timeout,String eleName) throws Exception {
	    	adriver.clickByJs(SelectPeo, timeout, eleName);
	    	adriver.Type(searchPeo, eleName, timeout, typeData);
	        By ele = By.xpath("//label[normalize-space()='"+typeData+"']");
	        adriver.click(ele, timeout, eleName);
	        adriver.click(clickanyele, timeout, eleName);
        }
	    public void clickOnSubmit(String eleName, int timeout) throws Exception {
			adriver.clickByJs(submit, timeout, eleName);
		}
}