package com.heroGeneralPHQForms.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.utilities.getUtil;

import com_heroPHQForm_pageObjects.PHQ_general_registerPage;

public class TC_RegSelOtherReason_014 extends StartBrowser {

	@Test
	public void verifyRegWithOtherReason() throws Exception {
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
		reg.selOtherReason("Other Reason", 10);
		reg.textIfAnyDetails(" No Thanks ", 10, " Details (if any) ");
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