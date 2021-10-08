package com.heroLogin.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.pageObjects.RegistorPage;
import com.hero.utilities.getUtil;

public class TC_RegistorExistingUserName_4 extends StartBrowser{

	/***
	 * 
	 * @author Brajesh Kumar 
	           Test Script 03 This Test Script is Created to Vrify Registor Section
	 *        ************** 
	 *        Test Steps
	 *         1) Go to https://herouw.net//Forms/Index?cid=pP1wcnwLK2Q__s_&isghq=false
	           2) Click on Registor Link after login button
	           3) Enter All Valid User details in input field of HPQ Registation Step
	           4) Click on Submit
	           5) Verify the Page Text after  Registation 
	           6) Expected: Details of added user must be Confirm
	           Expected_O/P : Your Submission has been received 
	 * @throws Exception 
	  *
	  *
	 ***/
	
	@Test
	
	public void verifyRegistration() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplicationGeneralPHQ();
		
        RegistorPage reg = new RegistorPage(driver);
		
		//Test Steps:-
		reg.clickOnRegistorLink("Registor", 10);
		reg.clickOnStartReg("Start", 15);
		
		/* Go to PHQ_Registration Step1 - Identification */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to Personal Health Questionnaire Registration Step1 Identification ");

		//Test Steps:-
		reg.setFirstName("Hero", 10, "First Name");
		reg.setLastName("Index", 5, "Last Name");
		reg.setSuffix("Sr", 5, "Suffix Name");
		reg.setMobNumber("(991)176-2626", 5, "Mobile No");
		reg.setDateHire("07/07/2020", 6, "Gate Hire");
		reg.clickOnHethInsYes("Yes", 5);
		reg.setDependent("0", 5);
		//String uname = getUtil.randomString(); // autogen. username
		reg.setUserName("Rajesh", 5, "UserName");
		reg.setPassword("Rajesh@123#", 5, "Password");
		reg.setConfrmPswrd("Hero@122", 5, "Password");
		reg.setDob("07/07/1981", 5, " DOB ");
		reg.setEmailId("radhe.kumar@gmail.com", 5, "Email Id");
		reg.setAddress1("Address: 11255 Trade", 5, "Address1");
		reg.setAddress2("Center Dr Rancho Cordova, CA", 5, "Address2");
		reg.setCity("California", 5, "City");
		reg.setState("ALASKA", 10);
		reg.setZip("95742", 10, "Zip");
		reg.clickOnNext(" Next ", 10);
		
		/* Go to PHQ_Registration Step2 - Demographic, Build and Tobacco Use */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to PHQ_Registration Step2 - Demographic, Build and Tobacco Use ");
		
		//Test Steps:-
		reg.setSSN("123456789", 20, "SSN");
		reg.setGender("Male", 10);
		reg.setHeightFt("6", 5, "Height in Ft");
		reg.setHeightInch("4", 5, "Height in Inch");
		reg.setWeight("60", 5, "Weight");
		reg.checkTmbacoLastYr(" Yes ", 10);
		reg.clickOnNext(" Next ", 10);
		
		/* Go to PHQ_Registration Step3 - Medical Conditions and Treatments */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to PHQ_Registration Step3 - Medical Conditions and Treatments ");
		
		//Test Steps:-
		reg.clickOnMedConListNo("No", 5);
		reg.clickOnNext(" Next ", 10);
		
		/* Go to PHQ_Registration Step4 - Check Condition Details and Medications   */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to PHQ_Registration Step3 - Check Condition Details and Medications  ");
		reg.clickOninfohedricon(" infoHdrIcon", 20);
		reg.clickOnNext(" Next ", 10);
		
		
		/* Go to PHQ_Registration Step5 -5. Signature and Submission   */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to PHQ_Registration Step5 - Signature and Submission  ");
		
		reg.clickOnElecSign("Electronics Signature", 10);
		reg.clickOnSubmitbtn("Submit", 10);
		
		
		String expectedOutput = "Password and Retype Password do not match";

		String actualOutput = reg.verifyUserExistingText("VeriFyExisting",10 , "Text");
				

		if (actualOutput.contentEquals(expectedOutput)) // Expected & actual Verify
		{
			getUtil.TakeScreenShotOnPass(" testPassSnapCapture ");
			Assert.assertTrue(true);

		} else {
			
			getUtil.TakeScreenOnTestFail(" testFailSnapCapture ");
			Assert.assertTrue(false);
			
		}
	}
}
