package com.heroApplication.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjectsMK.EditPeoFullFeatures;
import com.hero.pageObjectsMK.EditPeoPage;
import com.hero.pageObjectsMK.LoginPage;
import com.hero.pageObjectsMK.addPeoPage;
import com.hero.utilities.getUtil;

public class EditPeoFullFeaturesTestCase extends StartBrowser{
	
	@Test
	public void verifyRegWithSpousePln() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		LoginPage lg = new LoginPage(driver);
		
		lg.setUserId("brajesh.admin", 10, "userName");
		lg.setPassword("Password@2", 10, "userName");
		lg.clickOnLoginBtn("Login button", 10);

		addPeoPage au = new addPeoPage(driver);
		EditPeoPage EditPeo = new EditPeoPage(driver);
		EditPeoFullFeatures EditPeoF = new EditPeoFullFeatures(driver);
		
		//Open Edit Peo Page
		
		au.clickOnentryUW("UW", 5);
		au.clickOnAdminMenu("AdminMenu", 5);
		au.clickOnPeoManagement("PeoManagement", 10);
		EditPeo.clickOnSearchPeoBtn("MonikaPeo1","SearchPeoBtn", 10);
		EditPeo.clickOnEditPeoBtn("EditPeoBtn", 10);
		EditPeo.clickOnBasicInfoBtn("EditPeoBtn", 10);
		
		/* Update the Peo Page elements */
		
		au.SetPeoName("MonikaPeo1","*PEO/Assoc./Trust",5);
		au.clickOnStatus("Status", 10);
		au.SetBrokerName("Aeroline Brokers", 10);
        au.SetAbbreviatedName("Ab12334", "Abbreviated_Name", 10);
        au.SetUrl("Urqwel12345rt", "URL", 10);
        au.SetMilliSubEmail("Ab123@test.com", "MillimanSubmissionEmail", 10);
		//EditPeo.clickOnManageTeamPanel("ManageTeamPanel", 10);
        //au.selTeamUW("MilliUwTeamMember", 10);
        
      //To Add Bucket definition
        
        EditPeoF.clickOnBucketDefinitionPanel("Bucket Definition Panel", 10);
        EditPeoF.clickOnAddBucketDefinition("Add Bucket Definition", 10);
        EditPeoF.SetBucketName(getUtil.randomString(),"Bucket Name",10);
        EditPeoF.clickOnAddBucket("AddBucket", 10);
        EditPeoF.SetBucketName1("B1","Bucket Name",5);
        EditPeoF.SetBucketMin1("5","Bucket Name",5);
        EditPeoF.SetBucketMax1("10","Bucket Name",5);
        EditPeoF.SetBucketRate1("10","Bucket Name",5);
        EditPeoF.clickOnBucketsave("Bucket Definition Panel", 10);
        Thread.sleep(3000);
        
      //To Add Location Groupings
        
        EditPeoF.clickOnLocationPanel("LocationPanel", 10);
        EditPeoF.SetLocation("Loc1","Location",5);
        EditPeoF.clickOnStatus1("StatusL", 10);
        EditPeoF.SetReceivedRatingEmail("Monika@test.in","Received rating email",5);
      //  EditPeoF.clickOnAddBucket("AddBucket", 10);
        EditPeoF.SetBaseline("0.1","Baseline",5);
        EditPeoF.SetTierType("Five-Tier",5);
        EditPeoF.clickOnAreaFactor("clickOnIndustryCode",5);
        EditPeoF.clickOnApplyIndustryFactor("clickOnApplyIndustryFactor",5);
        //EditPeoF.clickOnBucketsave("Bucket Definition Panel", 10);
        // EditPeoF.clickOnAddBucket("AddBucket", 10);
        
        
        au.clickOnSubmit("Submit", 10);
    	//driver.findElement(By.xpath("//body/div[@id='container']/div[7]/section[1]/form[1]/div[1]/div[15]/div[1]/input[1]")).click();
        
	}
}
	