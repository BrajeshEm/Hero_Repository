package com.heroLogin.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;
import com.hero.utilities.XLUtils;
import com.hero.utilities.getUtil;

import com_heroApplication_pageObjects.RegistorPage;

public class TC_RegistorDD_004 extends StartBrowser{

		/***
		   @author Brajesh Kumar 
		           #TC_ChangePswrd_004 
		           Test Steps 1) Go to https://herouw.net//Forms/Index?cid=pP1wcnwLK2Q__s_&isghq=false
		           2) Enter valid UserId 
		           3) Enter valid  Password
		           4) Click Login 
		           5) Click on New Customer Link after login button
		           6) Enter required fields 
		           7) Click on Submit
		           8) Expected: Details of added Customer must be shown 
		           Expected_O/P :Your Submission has been received
		 * @throws Exception 
		 
		 ***/


		@Test(dataProvider = "Logindata")
		public void CustTest(String FirstName,String LastName,String  Suffix,String  MobNumber,String  DateHire,String  Dependent,String  UserName,String  Password,String  confirmPassword,String  Dob,String  EmailId,String  Address1,String  Address2,String  City,
				String state,String  Zip,String  SSN,String HeightFt,String  HeightInch,String  Weight) throws Exception {

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
			reg.setFirstName(FirstName, 10, "First Name");
			reg.setLastName(LastName, 5, "Last Name");
			reg.setSuffix(Suffix, 5, "Suffix Name");
			reg.setMobNumber(MobNumber, 5, "Mobile No");
			reg.setDateHire(DateHire, 6, "Gate Hire");
			reg.clickOnHethInsYes("Yes", 5);
			reg.setDependent(Dependent, 5);
			
			reg.setUserName(UserName, 5, "UserName");
			reg.setPassword(Password, 5, "Password");
			reg.setConfrmPswrd(confirmPassword, 5, "Password");
			reg.setDob(Dob, 5, " DOB ");
			reg.setEmailId(EmailId, 5, "Email Id");
			reg.setAddress1(Address1, 5, "Address1");
			reg.setAddress2(Address2, 5, "Address2");
			reg.setCity(City, 5, "City");
			reg.setState(state, 10);
			reg.setZip(Zip, 10, "Zip");
			reg.clickOnNext(" Next ", 10);
			
			/* Go to PHQ_Registration Step2 - Demographic, Build and Tobacco Use */
			StartBrowser.test = StartBrowser.test
					.createNode(" Go to PHQ_Registration Step2 - Demographic, Build and Tobacco Use ");
			
			//Test Steps:-
			reg.setSSN(SSN, 20, "SSN");
			reg.setGender("Male", 10);
			reg.setHeightFt(HeightFt, 5, "Height in Ft");
			reg.setHeightInch(HeightInch, 5, "Height in Inch");
			reg.setWeight(Weight, 5, "Weight");
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
			
			
			String expectedOutput = "Your Submission has been received";

			String actualOutput = reg.verifyRegSubmis("verifySubmsText", 5);
					

			if (actualOutput.contentEquals(expectedOutput)) // Expected & actual Verify
			{
				getUtil.TakeScreenShotOnPass(" testPassSnapCapture ");
				Assert.assertTrue(true);

			} else {
				
				getUtil.TakeScreenOnTestFail(" testFailSnapCapture ");
				Assert.assertTrue(false);
				
			}
		}

		@DataProvider(name = "Logindata")
		public String[][] getData() throws IOException {
			String path = System.getProperty("user.dir")+"\\src\\test\\java\\com\\hero\\testData\\addUser.xlsx";
			int rwCount = XLUtils.getRowCount(path, "Sheet1");
			int cllCount = XLUtils.getCellCount(path, "Sheet1", 0);
			String[][] logindata = new String[rwCount][cllCount];

			for (int i = 1; i <= rwCount; i++) {
				for (int j = 0; j < cllCount; j++) {
					logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
				}
			}

			return logindata;
		}
	}
