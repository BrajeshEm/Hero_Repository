package com.heroPHQForm.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.utilities.getUtil;



public class AllInOne extends StartBrowser{
	/***
	 * 
	 * @author Brajesh Kumar 
	           Test Script 05 This Test Script is Created to Vrify Registor Section
	           ************** 
	           Test Steps
	           1) Launch browser
	           2) Go to https://herouw.net//Forms/Index?cid=pP1wcnwLK2Q__s_&isghq=false
	           3) Click on Registor Link 
	           4) Enter All Valid User details in input fields of HPQ Registation Step1(Select- health insurance plan as No)
	           5) Please provide a reason for waiving coverage
	           6) Got to step4 & select DOB & verify Electronic Signature
	           6) Click on Submit
	           7) Verify Registation Confirmation Text Actual Vs Expected
	           8) Expected Confirmation Text Should get Displayed after submit - 'Your Submission has been received'
	            
	 * @throws Exception 
	 *
	 *
	 ***/
	@Test
	public void verifyRegWithSpousePln() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver);

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

		reg.setMobNumber("9911762626", 5, "Mobile No");
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
	@Test
	public void verifyRegWithselNotEligible() throws Exception
	{
       /* launch Chrome and direct it to the Base URL */
        StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
        ActionDriver aDriver = new ActionDriver();
        aDriver.navigateToApplication();
        PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver); 
        
		//Test Steps:-
		reg.clickOnRegisterLink("Registor", 10);
		reg.clickOnStartReg("Start", 15);
		
		/* Go to PHQ_Registration Step1 - Identification */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to Personal Health Questionnaire Registration Step1 Identification ");

		//Test Steps:-
		reg.setFirstName("Hero", 10, "First Name");
		reg.setLastName("Index", 5, "Last Name");
		reg.setSuffix("Sr", 5, "Suffix Name");
		reg.setMobNumber("9911762626", 5, "Mobile No");
		reg.setDateHire("07/07/2000", 6, "Gate Hire");
		reg.clickOnHethInsNo("No", 5);       //health insurance plan --> No
		reg.selNotEligible(" Not eligible (part time, seasonal, etc.)", 10);
		reg.clickOnNext(" Next ", 10);
		Thread.sleep(10000);
		reg.setWaivingDOB("07/07/1990kkkkk", 5, "D.O.B");
		
		/* Go to PHQ_Registration Step5 -5. Signature and Submission   */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to PHQ_Registration Step5 - Signature and Submission  ");
		
		reg.clickOnElecSign("Electronics Signature", 20);
		reg.clickOnSubmitbtn("Submit", 20);
		StartBrowser.test = StartBrowser.test
				.createNode("verifyRegWithselNotEligible");
		
		/*Result*/
		System.out.println("Brajes.............");
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
	
	@Test
	public void verifyRegWithDoNotWantCoverage() throws Exception
	{
       /* launch Chrome and direct it to the Base URL */
        StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
        ActionDriver aDriver = new ActionDriver();
        aDriver.navigateToApplication();
        PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver); 
        
		//Test Steps:-
		reg.clickOnRegisterLink("Registor", 10);
		reg.clickOnStartReg("Start", 15);
		
		/* Go to PHQ_Registration Step1 - Identification */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to Personal Health Questionnaire Registration Step1 Identification ");

		//Test Steps:-
		reg.setFirstName("Hero", 10, "First Name");
		reg.setLastName("Index", 5, "Last Name");
		reg.setSuffix("Sr", 5, "Suffix Name");
		reg.setMobNumber("9911762626", 5, "Mobile No");
		reg.setDateHire("07/07/2000", 6, "Gate Hire");
		reg.clickOnHethInsNo("No", 5);       //health insurance plan --> No
		reg.selWonttCovrg("Do not want coverage", 10);
		reg.clickOnNext(" Next ", 10);
		Thread.sleep(10000);
		reg.setWaivingDOB("07/07/1990", 5, "D.O.B");
		
		/* Go to PHQ_Registration Step5 -5. Signature and Submission   */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to PHQ_Registration Step5 - Signature and Submission  ");
		
		reg.clickOnElecSign("Electronics Signature", 20);
		reg.clickOnSubmitbtn("Submit", 20);
		
		
		/*Result*/
		System.out.println("Brajes.............");
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
	@Test
	public void verifyRegWithWaitingPriod() throws Exception
	{
       /* launch Chrome and direct it to the Base URL */
        StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
        ActionDriver aDriver = new ActionDriver();
        aDriver.navigateToApplication();
        PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver); 
        
		//Test Steps:-
		reg.clickOnRegisterLink("Registor", 10);
		reg.clickOnStartReg("Start", 15);
		
		/* Go to PHQ_Registration Step1 - Identification */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to Personal Health Questionnaire Registration Step1 Identification ");

		//Test Steps:-
		reg.setFirstName("Hero", 10, "First Name");
		reg.setLastName("Index", 5, "Last Name");
		reg.setSuffix("Sr", 5, "Suffix Name");
		reg.setMobNumber("9911762626", 5, "Mobile No");
		reg.setDateHire("07/07/2000", 6, "Gate Hire");
		reg.clickOnHethInsNo("No", 5);       //health insurance plan --> No
		reg.selWaitingPriod(" I am currently in waiting period)", 10);
		reg.clickOnNext(" Next ", 10);
		Thread.sleep(10000);
		reg.setWaivingDOB("07/07/1990", 5, "D.O.B");
		
		/* Go to PHQ_Registration Step5 -5. Signature and Submission   */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to PHQ_Registration Step5 - Signature and Submission  ");
		
		reg.clickOnElecSign("Electronics Signature", 20);
		//reg.clickOnSubmitbtn("Submit", 20);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@onclick,\"return readonly(); ShowLoading('processing', 'step5');\")]")).click();
		Thread.sleep(2000);
	
		/*Result*/
		System.out.println("Brajes.............");
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
	@Test
	public void verifyRegWithSUnderAnotherPln() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver);

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
		reg.setMobNumber("9911762626", 5, "Mobile No");
		reg.setDateHire("07/07/2000", 6, "Gate Hire");
		reg.clickOnHethInsNo("No", 5); // health insurance plan --> No
		reg.selUnderAnotherPln(" I am covered under another plan", 10);
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
	@Test
	public void verifyRegWithVeterans() throws Exception
	{
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver);

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
		reg.setMobNumber("9911762626", 5, "Mobile No");
		reg.setDateHire("07/07/2000", 6, "Gate Hire");
		reg.clickOnHethInsNo("No", 5); // health insurance plan --> No
		reg.selVeterans("Veterans", 10);
		reg.clickOnNext(" Next ", 10);
		Thread.sleep(10000);
		reg.setWaivingDOB("07/07/1990", 5, "D.O.B");

		/* Go to PHQ_Registration Step5 -5. Signature and Submission */
		StartBrowser.test = StartBrowser.test.createNode(" Go to PHQ_Registration Step5 - Signature and Submission  ");

		reg.clickOnElecSign("Electronics Signature", 20);
		reg.clickOnSubmitbtn("Submit", 20);

		/* Result */
		System.out.println("Brajes.............");
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
	@Test
	public void verifyRegWithMedicare() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver);

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
		reg.setMobNumber("9911762626", 5, "Mobile No");
		reg.setDateHire("07/07/2000", 6, "Gate Hire");
		reg.clickOnHethInsNo("No", 5); // health insurance plan --> No
		reg.selMedicare("Medicare", 10);
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
	@Test
	public void verifyRegWithMedicaid() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver);

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
		reg.setMobNumber("9911762626", 5, "Mobile No");
		reg.setDateHire("07/07/2000", 6, "Gate Hire");
		reg.clickOnHethInsNo("No", 5); // health insurance plan --> No
		reg.selMedicaid("Medicaid", 10);
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
	@Test
	public void verifyRegWithIndividual() throws Exception
	{
       /* launch Chrome and direct it to the Base URL */
        StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
        ActionDriver aDriver = new ActionDriver();
        aDriver.navigateToApplication();
        PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver); 
        
		//Test Steps:-
		reg.clickOnRegisterLink("Registor", 10);
		reg.clickOnStartReg("Start", 15);
		
		/* Go to PHQ_Registration Step1 - Identification */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to Personal Health Questionnaire Registration Step1 Identification ");

		//Test Steps:-
		reg.setFirstName("Hero", 10, "First Name");
		reg.setLastName("Index", 5, "Last Name");
		reg.setSuffix("Sr", 5, "Suffix Name");
		reg.setMobNumber("9911762626", 5, "Mobile No");
		reg.setDateHire("07/07/2000", 6, "Gate Hire");
		reg.clickOnHethInsNo("No", 5);       //health insurance plan --> No
		reg.selIndividual("Individual", 10);
		reg.clickOnNext(" Next ", 10);
		Thread.sleep(10000);
		reg.setWaivingDOB("07/07/1990", 5, "D.O.B");
		
		/* Go to PHQ_Registration Step5 -5. Signature and Submission   */
		StartBrowser.test = StartBrowser.test
				.createNode(" Go to PHQ_Registration Step5 - Signature and Submission  ");
		
		reg.clickOnElecSign("Electronics Signature", 20);
		//reg.clickOnSubmitbtn("Submit", 20);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@onclick,\"return readonly(); ShowLoading('processing', 'step5');\")]")).click();
		Thread.sleep(2000);
	
		/*Result*/
		System.out.println("Brajes.............");
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
	@Test
	public void verifyRegWithOtherReason() throws Exception {
		/* launch Chrome and direct it to the Base URL */
		StartBrowser.test = StartBrowser.test.createNode(" Personal Health Questionnaire(PHQ) Registration  ");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		PHQ_iowa_registerPage reg = new PHQ_iowa_registerPage(driver);

		// Test Steps:- 
		reg.clickOnRegisterLink("Registor", 10);
		reg.clickOnStartReg("Start", 15);

		/* Go to PHQ_Registration Step1 - Identification */
		StartBrowser.test = StartBrowser.test.createNode(" Go to Personal Health Questionnaire Registration Step1 Identification ");

		// Test Steps:-
		reg.setFirstName("Hero", 10, "First Name");
		reg.setLastName("Index", 5, "Last Name");
		reg.setSuffix("Sr", 5, "Suffix Name");
		reg.setMobNumber("9911762626", 5, "Mobile No");
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
