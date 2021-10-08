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

public class EditPeoFullFeatures {
	/**
	 * This class will be created for Register Page Object Repository :OR 
	 * 
	 * @throws Exception
	 * 
	 */
   
    public WebDriver driver;
    ActionDriver adriver ;
	public  EditPeoFullFeatures(WebDriver rdriver) {
		adriver = new ActionDriver();	
		driver = rdriver;
			PageFactory.initElements(rdriver, this);
	}
	
	// Click on Registor and Start Link 
	
	By entryUW         = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
	By AdminMenu       = By.xpath("//a[contains(text(),'ADMINISTRATION')]");
	By PeoManagement   = By.xpath("//a[contains(text(),'PEO/Assoc./Trust Management')]");
	By SearchPeoBtn    = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[3]/div[1]/div[2]/label[1]/input[1]");
	By EditPeoBtn      = By.xpath("//tbody/tr[1]/td[5]/a[1]");

	
	// Edit Peo Page elements 
	
	By BasicInfo          = By.xpath("//span[@id='client-basic-infoheadericon']");
	By PeoName            = By.id("peoModel_PEOName");
	By Status             = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/input[1]");
	By BrokerName         = By.xpath("//select[@id='peoModel_BrokerId']");
	By broker             = By.xpath("//option[contains(text(),'Aeroline Brokers')]");
	By AbbreviatedName    = By.xpath("//input[@id='peoModel_AbbrName']");
    By Url                = By.xpath("//input[@id='peoModel_URL']");
    By MilliSubEmail      = By.xpath("//input[@id='peoModel_SubmissionEmail']");
    By ManageTeamPanel    = By.xpath("//div[@id='Primarycontact5']//span[@id='client-prcontact-infoheadericon13']");
    By uwTeam             = By.xpath("//input[@id='chkcompanyZLxFtd3iBCVhOMfTZFeduSFtc0LkU5Ka9VrbuDd9FXDy7heXqNEGHQ__s___s_']");
    By primary            = By.xpath("//a[@class='imageContact']");
    
	//Bucket definition
    
    By BucketDefinition             = By.xpath("//span[@id='client-prcontact-infoheadericon11']");
    By AddBucketDefinition          = By.xpath("//a[@id='addCensus']");
    By BucketName                   = By.xpath("//input[@id='DefinitionName']");
    By AddBucket                    = By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/a[1]");
    By BucketName1                  = By.xpath("//input[@id='BucketName1']");
    By BucketMin1                   = By.xpath("//input[@id='BucketMin1']");
    By BucketMax1                   = By.xpath("//input[@id='BucketMax1']");
    By BucketRate1                  = By.xpath("//input[@id='BucketRate1']");
    By Bucketsave                   = By.xpath("//input[@id='addBucketdefinition']");
    
	//Location Groupings
    
    By LocationPanel                  = By.xpath("//span[@id='client-prcontact-infoheadericon2']");
    By Location                       = By.xpath("//input[@id='peoCensusLocation_CensusLocation']");
    By StatusL                        = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]");
    By ReceivedRatingEmail            = By.xpath("//textarea[@id='peoLocationAdditionalDetails_ReceivedRatingContact']");
    By Baseline                       = By.xpath("//input[@id='peoCensusLocation_Baseline']");
    By TierType                       = By.xpath("//select[@id='peoLocationAdditionalDetails_TierTypeList']");
    By TierValue                      = By.xpath("//option[contains(text(),'Five-Tier')]");
    By AreaFactor                     = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[12]/div[2]/input[1]");
    By IndustryCodeRequired           = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[15]/div[2]/input[2]");
    By ApplyIndustryFactor            = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[16]/div[2]/input[2]");
   
  
    
    By submit                       = By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[15]/div[1]/input[1]");
	
		/* Setup Method for PHQ_Registor : Identification */
	
	getUtil get = new getUtil(driver);
	
	
	
	// Methods to click on Registor and Start Link

		public void clickOnentryUW(String eleName, int timeout) throws Exception {
			adriver.click(entryUW, timeout, eleName);
		}
	
	    public void clickOnAdminMenu(String eleName, int timeout) throws Exception {
		    adriver.click(AdminMenu, timeout, eleName);
	    }
	    public void clickOnPeoManagement(String eleName, int timeout) throws Exception {
			adriver.click(PeoManagement, timeout, eleName);
		}
	    public void clickOnSearchPeoBtn(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(SearchPeoBtn, eleName, timeout, typeData);
		}
	    
	    public void clickOnEditPeoBtn (String eleName, int timeout) throws Exception {
			adriver.click(EditPeoBtn, timeout, eleName);
		}
	    
	    
	    
	    // Methods to Edit Peo Page elements 
	    
	    public void clickOnBasicInfoBtn (String eleName, int timeout) throws Exception {
			adriver.click(BasicInfo, timeout, eleName);
		}
	    
	    public void SetPeoName(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(PeoName, eleName, timeout, typeData);
		}
	    public void clickOnStatus(String eleName, int timeout) throws Exception {
			adriver.clickByJs(Status, timeout, eleName);
		}
	    public void SetBrokerName(String eleName, int timeout) throws IOException, InterruptedException {
	    	driver.findElement(BrokerName).click();
	    	Thread.sleep(10000);
	    	//adriver.selectByDropdwn(broker, timeout, eleName);
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
	    
	    public void clickOnManageTeamPanel(String eleName, int timeout) throws Exception {
			adriver.clickByJs(ManageTeamPanel, timeout, eleName);
		}
	    
	    public void selTeamUW(String eleName, int timeOut) throws Exception {
			WebElement ele =	driver.findElement(By.xpath("//label[normalize-space()='Milliman UW team']"));
			getUtil.acrollIntoView(ele, driver);
			adriver.clickByAction(uwTeam, timeOut, eleName);
			WebElement ele1 =	driver.findElement(primary);
			getUtil.acrollIntoView(ele1, driver);
			adriver.clickByAction(primary, timeOut, eleName);
		}
	    
	    
	    
	 // Methods for Submit Button
	    
	    public void clickOnSubmit(String eleName, int timeout) throws Exception {
	    	//WebElement ele =	driver.findElement(submit);
			getUtil.ScrolldownTillPageEnd(driver);
			adriver.clickByAction(submit, timeout, eleName);
		}
	    
	    
	    
	 // Methods to Add Bucket Definition
	    
	    public void clickOnBucketDefinitionPanel(String eleName, int timeout) throws Exception {
			adriver.clickByJs(BucketDefinition, timeout, eleName);
		}
	    public void clickOnAddBucketDefinition(String eleName, int timeout) throws Exception {
			adriver.clickByJs(AddBucketDefinition, timeout, eleName);
		}
	    public void SetBucketName(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(BucketName, eleName, timeout, typeData);
		}
	    public void clickOnAddBucket(String eleName, int timeout) throws Exception {
			adriver.click(AddBucket, timeout, eleName);
		}
	    public void SetBucketName1(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(BucketName1, eleName, timeout, typeData);
		}
	    public void SetBucketMin1(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(BucketMin1, eleName, timeout, typeData);
		}
	    public void SetBucketMax1(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(BucketMax1, eleName, timeout, typeData);
		}
	    public void SetBucketRate1(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(BucketRate1, eleName, timeout, typeData);
		}

		public void clickOnBucketsave(String eleName, int timeout) throws Exception {
			adriver.click(Bucketsave, timeout, eleName);
	    }
		
		
		
		//Location Groupings
		
		 
	    public void clickOnLocationPanel(String eleName, int timeout) throws Exception {
			adriver.clickByJs(LocationPanel, timeout, eleName);
		}
	    
	    public void SetLocation(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(Location, eleName, timeout, typeData);
	    }
	    
	    public void clickOnStatus1(String eleName, int timeout) throws Exception {
			adriver.click(StatusL, timeout, eleName);
	    }
	    
	    public void SetReceivedRatingEmail(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(ReceivedRatingEmail, eleName, timeout, typeData);
			
	    }
	    
	    public void SetBaseline(String typeData, String eleName, int timeout) throws Exception {
			adriver.Type(Baseline, eleName, timeout, typeData);
	    }
			
	    public void SetTierType(String eleName, int timeout) throws IOException, InterruptedException {
	    	
	    	getUtil.acrollIntoView(driver.findElement(TierType), driver);
	    	driver.findElement(TierType).click();
	    	Thread.sleep(10000);
	    	driver.findElement(TierValue).click();
        }
	    
	    public void clickOnAreaFactor(String eleName, int timeout) throws Exception {
			adriver.click(AreaFactor, timeout, eleName);
	    }
			
	    public void clickOnIndustryCode(String eleName, int timeout) throws Exception {
			adriver.click(IndustryCodeRequired, timeout, eleName);
	    }
			
	    public void clickOnApplyIndustryFactor(String eleName, int timeout) throws Exception {
			adriver.click(ApplyIndustryFactor , timeout, eleName);
	    }
	    
	   /* public void SetTierType1(String eleName, int timeout) throws IOException, InterruptedException {
	    	driver.findElement(IndustryFactorTableSIC).click();
	    	Thread.sleep(10000);
	    	driver.findElement(SicValue).click();
        }
	    
	    public void SetTierType2(String eleName, int timeout) throws IOException, InterruptedException {
	    	driver.findElement(IndustryFactorTableNAICS).click();
	    	Thread.sleep(10000);
	    	driver.findElement(NaicsValue).click();
        } */
	   
		
	
}