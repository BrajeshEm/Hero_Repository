package com_heroPHQForm_pageObjects;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;

public class PHQ_iowa_registerPage {
	/**
	 * This class will be created for Restistor Page Object Reprository :OR 
	 * 
	 * @throws Exception
	 * 
	 */
   
    public WebDriver driver;
    ActionDriver adriver ;
	public  PHQ_iowa_registerPage(WebDriver rdriver) {
		adriver = new ActionDriver();	
		driver = rdriver;
			PageFactory.initElements(rdriver, this);
	}
	
	/* Click on Registor and Start Link */ 
	By regLink                    =   By.xpath("//input[@value='Register']");
	By iowaCoverageLink           =   By.xpath("//input[@id='objDemographic_0__covergaetype_Medical']");
	By iowaPreviousCoverageLink   =   By.xpath("//body/div[@id='container']/div[6]/section[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input[1]");
	By iowaSelectAllThatApp       =   By.xpath("//input[@id='Employee']");
	By iowaNameOfCoveredPerson    =   By.xpath("//input[@id='NameofCoveredPerson']");
	By iowaIncuranceComNameAdd    =   By.xpath("//input[@id='Insurancecompny']");
	By iowaAidsHiv                =   By.xpath("//input[@id='HIVAids']");
	By iowaInOutPatient           =   By.xpath("//body/div[@id='container']/div[6]/section[1]/form[1]/div[1]/div[4]/div[2]/div[2]/div[2]/input[2]");
	By iowaConditionDiagnosis     =   By.xpath("//input[@id='MedicationOthers_0__conditions']");
		/* Setup Method for PHQ_Registor : Identification */

		public void clickOnRegistorLink(String eleName, int timeout) throws Exception {
			adriver.click(regLink, timeout, eleName);
		}
		public void clickOnCoverageReqLink(String eleName, int timeout) throws Exception {
			adriver.click(iowaCoverageLink, timeout, eleName);
		}
		public void clickOnPreviousCoverageLink(String eleName, int timeout) throws Exception {
			adriver.click(iowaPreviousCoverageLink, timeout, eleName);
		}
		public void clickOnSelectAllThatAppLink(String eleName, int timeout) throws Exception {
			adriver.click(iowaSelectAllThatApp, timeout, eleName);
		}
		public void selOnNameOfCoveredPerson(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(iowaNameOfCoveredPerson, eleName, timeout, typeData);
		}

		public void selOnIncuranceComNameAdd(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(iowaIncuranceComNameAdd, eleName, timeout, typeData);
		}
		public void clickOnAidsHivLink(String eleName, int timeout) throws Exception {
			adriver.click(iowaAidsHiv, timeout, eleName);
		}
		public void clickOnInOutPatient(String eleName, int timeout) throws Exception {
			adriver.click(iowaInOutPatient, timeout, eleName);
		}
		public void setAIDSHIVCond(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(iowaConditionDiagnosis, eleName, timeout, typeData);
		}

			}