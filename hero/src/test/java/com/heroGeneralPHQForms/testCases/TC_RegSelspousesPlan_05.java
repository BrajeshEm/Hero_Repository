package com.heroGeneralPHQForms.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.utilities.getUtil;

import com_heroPHQForm_pageObjects.PHQ_general_registerPage;

public class TC_RegSelspousesPlan_05 extends StartBrowser{
	/***
	 * 
	 * @author Brajesh Kumar 
	           Test Script 05 This Test Script is Created to Vrify Registor Section
	           ************** 
	           Test Steps
	           1) Launch browser
	           1) Go to https://herouw.net//Forms/Index?cid=pP1wcnwLK2Q__s_&isghq=false
	           2) Click on Registor Link 
	           3) Enter All Valid User details in input field of HPQ Registation Step1(Select- health insurance plan as No)
	           4) Click on Submit
	           5) Verify Registation Confirmation Text Actual equal Expected
	           6) Expected :Should be Display after submit - Your Submission has been received
	            
	 * @throws Exception 
	 *
	 *
	 ***/
	@Test
	public void verifyRegWithSpousePln() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplicationGeneralPHQ();
		PHQ_general_registerPage reg = new PHQ_general_registerPage(driver);

		// Test Steps:-
		reg.clickOnRegisterLink("Registor", 10);
		reg.clickOnStartReg("Start", 15);

		/* Go to PHQ_Registration Step1 - Identification */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to Personal Health Questionnaire Registration Step1 Identification ");

		// Test Steps:-
		reg.setFirstName("Hero", 10, "First Name");
		reg.setLastName("Index", 5, "Last Name");
		reg.setSuffix("Sr", 5, "Suffix Name");

		reg.setMobNumber("(991)176-2626", 5, "Mobile No");
		reg.setDateHire("07/07/2000", 6, "Gate Hire");
		reg.clickOnHethInsNo("No", 5); // health insurance plan --> No
		reg.selSpusePlan("  Covered by spouse's plan (copy of id card may be required)", 10);
		reg.clickOnNext(" Next ", 10);
		Thread.sleep(10000);
		reg.setWaivingDOB("07/07/1990", 5, "D.O.B");

		/* Go to PHQ_Registration Step5 -5. Signature and Submission */
		StartBrowser.test = StartBrowser.test.createNode(" Go to PHQ_Registration Step5 - Signature and Submission  ");

		reg.clickOnElecSign("Electronics Signature", 20);
		reg.clickOnSubmitbtn("Submit", 20);

		/* Result */
		String expectedOutput = "Your Submission has been received";
		Thread.sleep(15000);
		String actualOutput = reg.verifyRegSubmis("verifySubmsText", 5);

		if (actualOutput.contentEquals(expectedOutput)) // Expected & actual Verify
		{
			Assert.assertTrue(true);
		} else {
			getUtil.TakeScreenOnTestFail(" testFailSnapCapture ");
			Assert.assertTrue(false);
		}
	}
}