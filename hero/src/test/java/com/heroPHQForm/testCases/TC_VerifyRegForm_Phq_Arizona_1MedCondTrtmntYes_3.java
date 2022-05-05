package com.heroPHQForm.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;

import com.hero.utilities.getUtil;

import com_heroPHQForm_pageObjects.PHQ_arizona_registerPage;

public class TC_VerifyRegForm_Phq_Arizona_1MedCondTrtmntYes_3 extends StartBrowser{

	/***
	 * 
	 * @author Brajesh Kumar 
	           Test Script 03 This Test Script is Created to Vrify Registor Section
	           ************** 
	           Test Steps
	           1) Go to https://herouw.net//Forms/Index?cid=pP1wcnwLK2Q__s_&isghq=false
	           2) Click on Registor Link 
	           3) Enter All Valid User details in input field of HPQ Registation Step1,Step2,Step3,Step4 and Step5
	           4) Click on Submit
	           5) Verify Registation Confirmation Text Actual equal Expected
	           6) Expected :Should be Displayed after submit - Your Submission has been received
	            
	 * @throws Exception 
	 *
	 *
	 ***/
@Test
public void VerifyRegForm1MedCondTrtmntYes_3() throws Exception {
	
	/* launch Chrome and direct it to the Base URL */
	ActionDriver aDriver = new ActionDriver();
	//aDriver.navigateToApplication();
	driver.get("https://herouw.net//Forms/Index?cid=DGSDlLqwFeU__s_&isghq=false");
	PHQ_arizona_registerPage reg = new PHQ_arizona_registerPage(driver);

	// Test Steps:-
	reg.clickOnRegisterLink("Registor", 10);
	reg.clickOnStartReg("Start", 15);

	/* Go to PHQ_Registration Step1 - Identification */
	// Test Steps:-
	reg.setFirstName("Hero", 10, "First Name");
	reg.setLastName("Index", 5, "Last Name");
	reg.setSuffix("Sr", 5, "Suffix Name");
	reg.setMobNumber("9889999898", 5, "Mobile No");
	reg.setDateHire("07/07/2020", 6, "Gate Hire");
	reg.clickOnHethInsYes("Yes", 5); // health insurance plan --> Yes/No
	reg.setDependent("0", 30);
	String uname = getUtil.randomString(); // autogen. username
	reg.setUserName(uname, 5, "UserName");
	reg.setPassword("Hero@122", 5, "Password");
	reg.setConfrmPswrd("Hero@122", 5, "Password");
	reg.setDob("07/07/1981", 5, " DOB ");
	reg.setEmailId("radhe.kumar@gmail.com", 5, "Email Id");
	reg.setAddress1("Address: 11255 Trade", 5, "Address1");
	reg.setAddress2("Center Dr Rancho Cordova, CA", 5, "Address2");
	reg.setCity("California", 5, "City");
	reg.setState("CA", 30);
	reg.setZip("95742", 10, "Zip");
	reg.clickOnNext(" Next ", 10);
	Thread.sleep(15000);

	/* Go to PHQ_Registration Step2 - Demographic, Build and Tobacco Use */
	// Test Steps:-
	reg.setSSN("123456789", 20, "SSN");
	reg.setGender("F", 20);
	reg.setHeightFt("6", 5, "Height in Ft");
	reg.setHeightInch("4", 5, "Height in Inch");
	reg.setWeight("60", 5, "Weight");
	reg.checkTmbacoLastYr(" Yes ", 10);
	reg.clickOnNext(" Next ", 10);
	Thread.sleep(15000);

	/* Go to PHQ_Registration Step3 - Medical Conditions and Treatments */
	// Test Steps:-
	
	
	reg.clickOnMedConListNo("No", 5);
	reg.clickOnMedConListNo1("No", 5);
	reg.clickOnNext(" Next ", 10);
	
	
//	/* Go to PHQ_Registration Step4 - Check Condition Details and Medications */
//	// Arthritis--
//	reg.setArthritiLocation("finger joints", 10, "Arthritis Location");
//	reg.selArthritiType("Gout", 5);
//	reg.selArthritiJointsImpacted("Joints Impacted", 5);
//	reg.selArthritiDateOnset("08/12/2020", 10, "Date of onset");
//	reg.selArthritiLastDateTreated("08/12/2020", 10, "Date of onset");
//	reg.selArthritiDegreeRecovery("0", 5, "Degree of recovery");
//	reg.selArthritiJStillTaking("Still Taking", 5);
//	reg.selArthritiArthritiNotes("Note Text..", 5, "Note");
//
//	// Back Disorder
//	reg.selBackDisCondition("Spinal fusion", 5);
//	reg.setBackDisDegreeRcvery("Present", 5);
//	reg.selBackDisOperated("Yes", 5);
//	reg.setBackDisherapylst6mnths("3 times or less", 5);
//	reg.setBackDisDateOnset("08/12/2020", 10, "Date of onset");
//	reg.selBackDisLastDatTreated("08/12/2020", 10, "Last date treated");
//	reg.selBackDisStillTaking("Still Taking", 5);
//	reg.selBackDisNotes("Note Text..", 5, "Note");
//
//	// Cancer
//	reg.setCancerLocation("Neck", 5, "Location");
//	reg.selCancerType("Sarcoma", 5);
//	reg.selCancerStage("Local", 5);
//	reg.selCancerDateOnset("08/12/2020", 10, "Date of onset");
//	reg.selCancerLastDateTreated("08/12/2019", 10, "Last date treated");
//	reg.selCancerRemision("Yes", 5);
//	reg.selCamcerStillTaking("Yes", 5);
//	reg.selCancerDegreeRecovery("10", 10, "Degree Recovery");
//	reg.setCancerNotes("Text Note....!!", 5, "Note");
//
//	// Heart Disease
//	reg.selselHeartDiseaseCond("Arrhythmia", 5);
//	reg.setHeartDiseaseDateOnset("08/01/1985", 10, "Date of onset");
//	reg.setHeartDiseaseLastDatTreated("07/02/1990", 5, "Last date treated");
//	reg.setHeartDiseaseTreatment("Angina", 5);
//	reg.setHeartDiseaseDegreeRcvery("Asymptomatic (normal stress EKG)", 5);
//	reg.selHeartDiseaseStillTaking("Yes", 10);
//	reg.textHeartDiseaseNotes("Text.....", 10, "Note");
//	
//	// Depression/ Mental Illness
//	reg.selDprsMentalIlnessCond("Anxiety", 10);
//	reg.selDprsMentalIlnessConl("Current counseling", 10);
//	reg.selDprsMentalIlnessPriorHosp("Yes", 10);
//	reg.selDprsMentalIlnessHistShok("Yes", 10);
//	reg.selDprsMentalIlnessDateOnset("08/01/2020", 10, "Date of onset");
//	reg.selDprsMentalIlnessLastDatTreated("08/07/2020", 15, "Last date treated");
//	reg.selDprsMentalIlnessStillTaking("Yes", 10);
//	reg.textDprsMentalIlnessNotes("Text....", 10, "Note");
//
//	// Diabetes
//	reg.selDiabetesType("Type 1", 10);
//	reg.selDiabetesDateOnset("08/01/2020", 20, "Date of onset");
//	reg.selDiabetesLastDatTreated("08/07/2020", 15, "Last date treated");
//	reg.setDiabetesHbaBloodsugarlevel("101", "115", "120", 20, "Hba1c/Blood sugar levels");
//	reg.setDiabetesStillTaking("Yes", 10);
//	
//	// High Blood Pressure
//	reg.setHighBldPressrRed("101", "102", "103", 10, "List 3 most recent readings");
//	reg.selHighBldStillTaking("Yes", 10);
//
//	// High Cholesterol
//	reg.setHighCholstrlRed("101", "102", "103", 10, "List 3 most recent readings");
//	reg.selHighCholstrlStillTaking("Yes", 10);
//
//	// Pregnancy
//	reg.setPregnancyDueDate("08/01/2020", 10, "DueDate");
//	reg.setPregnancyMulBirths("0", 10);
//	// reg.setPregnancyPreviousCSection("Yes", 10);
//	// reg.setPregnancyPreviousCSection("Yes", 10);
//	WebElement ele1 = driver.findElement(By.xpath("//input[@id='MedicationPregnancy_0__PreviousSection']"));
//	WebElement ele2 = driver.findElement(By.xpath("//input[@name='MedicationPregnancy[0].PreviousPreTermBirth']"));
//	Actions action = new Actions(driver);
//	action.moveToElement(ele1).click().build().perform();
//	action.moveToElement(ele2).click().build().perform();
//	reg.setPregnancyComplications("None", 10);
//	reg.setPregnancyOtherDetail("None", 10, "Other Detail");
//
//	// Stroke
//	reg.selStrokeCond("Without Complication", 10);
//	reg.setStrokeDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setStrokeLastDatTreated("08/07/2020", 15, "Last date treated");
//	reg.selStrokeStillTaking("Yes", 10);
//	reg.setStrokeDegreeRcvery("0", 10, "Degree of recovery");
//	reg.setTextStrokeNotes("Note text...!!", 10, "Note");
//
//	// Tumor
//	reg.setTumorLocation("Brain", 10, "Tumor Location");
//	reg.selTumorMalignant("Yes", 10);
//	reg.selTumorOperated("Yes", 10);
//	reg.selTumorDateOnset("08/01/2020", 10, "Date of onset");
//	reg.selTumorLastDateTreated("08/07/2020", 15, "Last date treated");
//	reg.selTumorStillTaking("Yes", 10);
//	reg.setTumorNotes("Note Text..!", 10, "Note");
//
//	// Transplants
//	reg.setTrnsPlntsOrgan("Kideny", 10, "Organ");
//	reg.seTrnsPlntsStatus("Pending", 10);
//	reg.setTrnsPlntsDate("08/01/2020", 10, "Transplant Date");
//	reg.setTrnsPlntsLastdatetreated("08/07/2020", 15, "Last date treated");
//	reg.setTrnsPlntsOStillTaking("Yes", 10);
//	reg.setTrnsPlntsDegreerecovery("0", 10, "Degree Recovery");
//	reg.setTrnsPlntsNotes("Text Note..!", 10, "Note");
//
//	// **Other Conditions***/
//
//	// Other Conditions - Treatment for serious illness past 5 years
//	reg.setTrtmentIllness5yrsCond("Medium", 10, "Condition/Diagnosis");
//	reg.setTrtmntIllnessDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setTrtmntIllnessDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setTrtmntIllnessStillTaking("Yes", 10);
//	reg.setTrtmntIllnessDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Conditions - Surgery for serious illness past 5 years
//	reg.setSurgeryIllness5yrsCond("Medium", 10, "Condition/Diagnosis");
//	reg.setSurgeryIllnessDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setSurgeryllnessDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setSurgeryllnessStillTaking("Yes", 10);
//	reg.setSurgeryllnessDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Conditions -Substance depe
//	reg.setSubDepend5yrsCond("Medium", 10, "Condition/Diagnosis");
//	reg.setSubDependDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setSubDependDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setSubDependStillTaking("Yes", 10);
//	reg.setSubDependDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Stomach
//	reg.setStomachCond("Medium", 10, "Condition/Diagnosis");
//	reg.setStomachDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setStomachDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setStomachStillTaking("Yes", 10);
//	reg.setStomachDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Respiratory
//	reg.setRespiratoryCond("Medium", 10, "Condition/Diagnosis");
//	reg.setRespiratoryDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setRespiratoryDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setRespiratoryStillTaking("Yes", 10);
//	reg.setRespiratoryDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Prescription
//	reg.setPrescriptionCond("Medium", 10, "Condition/Diagnosis");
//	reg.setPrescriptionDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setPrescriptionDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setPrescriptionStillTaking("Yes", 10);
//	reg.setPrescriptionDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Pending surgery
//
//	reg.setPndngSurgryCond("Medium", 10, "Condition/Diagnosis");
//	reg.setPndngSurgryDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setPndngSurgryDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setPndngSurgryStillTaking("Yes", 10);
//	reg.setPndngSurgryDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Pending medical treatment or diagnostic testing
//	reg.setPndgMedTrtmntyCond("Medium", 10, "Condition/Diagnosis");
//	reg.setPndgMedTrtmntDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setPndgMedTrtmntDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setPndgMedTrtmntStillTaking("Yes", 10);
//	reg.setPndgMedTrtmntDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Pending hospitalization PndgHostp
//	reg.setPndgHostpCond("Medium", 10, "Condition/Diagnosis");
//	reg.setPndgHostpDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setPndgHostpDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setPndgHostpStillTaking("Yes", 10);
//	reg.setPndgHostpDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Muscular Disorder
//	reg.setMslDisordrCond("Medium", 10, "Condition/Diagnosis");
//	reg.setMslDisordrDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setMslDisordrDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setMslDisordrStillTaking("Yes", 10);
//	reg.setMslDisordrDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Liver Disease LveDiese
//	reg.setLveDieseCond("Medium", 10, "Condition/Diagnosis");
//	reg.setLveDieseDateOnset("08/01/2020", 10, "Date of onset");
//	reg.setLveDieseDateTreated("08/07/2020", 10, "Last date treated");
//	reg.setLveDieseStillTaking("Yes", 10);
//	reg.setLveDieseDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition -Kidney Disorder
//	reg.setKidnDisorderCond("Medium", 10, "Condition/Diagnosis");
//	reg.setKidnDisorderOnset("08/01/2020", 10, "Date of onset");
//	reg.seKidnDisorderTreated("08/07/2020", 10, "Last date treated");
//	reg.setKidnDisorderStillTaking("Yes", 10);
//	reg.setKidnDisorderDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition -Immune / Autoimmune Disease
//	reg.setImmDisesCond("Medium", 10, "Condition/Diagnosis");
//	reg.setImmDisesOnset("08/01/2020", 10, "Date of onset");
//	reg.seImmDisesTreated("08/07/2020", 10, "Last date treated");
//	reg.setImmDisesStillTaking("Yes", 10);
//	reg.setImmDisesDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Hospitalization or emergency room visit for serious
//	reg.setHostEmrgVistCond("Medium", 10, "Condition/Diagnosis");
//	reg.setHostEmrgVistOnset("08/01/2020", 10, "Date of onset");
//	reg.seHostEmrgVistTreated("08/07/2020", 10, "Last date treated");
//	reg.setHostEmrgVistStillTaking("Yes", 10);
//	reg.setHostEmrgVistDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Currently scheduled for surgery
//	reg.setCurntlySchedSurgeryCond("Medium", 10, "Condition/Diagnosis");
//	reg.setCurntlySchedSurgeryOnset("08/01/2020", 10, "Date of onset");
//	reg.setCurntlySchedSurgeryTreated("08/07/2020", 10, "Last date treated");
//	reg.setCurntlySchedSurgeryStillTaking("Yes", 10);
//	reg.setCurntlySchedSurgeryDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Currently hospitalized or confined in a treatment facility
//	reg.setCurntkyHospFacilityCond("Medium", 10, "Condition/Diagnosis");
//	reg.setCurntkyHospFacilityOnset("08/01/2020", 10, "Date of onset");
//	reg.setCurntkyHospFacilityTreated("08/07/2020", 10, "Last date treated");
//	reg.setCurntkyHospFacilityStillTaking("Yes", 10);
//	reg.setCurntkyHospFacilityDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Currently confined or incapacitated
//	reg.setCurrentlyIncaptedCond("Medium", 10, "Condition/Diagnosis");
//	reg.setCurrentlyIncaptedOnset("08/01/2020", 10, "Date of onset");
//	reg.setCurrentlyIncaptedTreated("08/07/2020", 10, "Last date treated");
//	reg.setCurrentlyIncaptedStillTaking("Yes", 10);
//	reg.setCurrentlyIncaptedDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Counseling
//	reg.setCounselingCond("Medium", 10, "Condition/Diagnosis");
//	reg.setCounselingOnset("08/01/2020", 10, "Date of onset");
//	reg.setCounselingTreated("08/07/2020", 10, "Last date treated");
//	reg.setCounselingStillTaking("Yes", 10);
//	reg.setCounselingDegRcvry("1", 10, "Degree of recovery");
//
//	//// Other Condition - Condition not on PHQ
//	reg.setCondNotPHQCond("Medium", 10, "Condition/Diagnosis");
//	reg.setCondNotPHQOnset("08/01/2020", 10, "Date of onset");
//	reg.setCondNotPHQTreated("08/07/2020", 10, "Last date treated");
//	reg.setCondNotPHQStillTaking("Yes", 10);
//	reg.setCondNotPHQDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Circulatory System Disease
//	reg.setCirclatrySysDisesCond("Medium", 10, "Condition/Diagnosis");
//	reg.setCirclatrySysDisesOnset("08/01/2020", 10, "Date of onset");
//	reg.setCirclatrySysDisesTreated("08/07/2020", 10, "Last date treated");
//	reg.setCirclatrySysDisesStillTaking("Yes", 10);
//	reg.setCirclatrySysDisesDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - Bowel
//	reg.setBowelCond("Medium", 10, "Condition/Diagnosis");
//	reg.setBowelOnset("08/01/2020", 10, "Date of onset");
//	reg.setBowelTreated("08/07/2020", 10, "Last date treated");
//	reg.setBowelStillTaking("Yes", 10);
//	reg.setBowelDegRcvry("1", 10, "Degree of recovery");
//
//	// Other Condition - BirthDefects
//	reg.setBirthDefectsCond("Medium", 10, "Condition/Diagnosis");
//	reg.setBirthDefectsOnset("08/01/2020", 10, "Date of onset");
//	reg.setBirthDefectsTreated("08/07/2020", 10, "Last date treated");
//	reg.setBirthDefectsStillTaking("Yes", 10);
//	reg.setBirthDefectsDegRcvry("1", 10, "Degree of recovery");
//
//	/// Other Condition - AIDS or HIV+
//	reg.setAIDSHIVCond("Medium", 10, "Condition/Diagnosis");
//	reg.setAIDSHIVOnset("08/01/2020", 10, "Date of onset");
//	reg.setAIDSHIVTreated("08/07/2020", 10, "Last date treated");
//	reg.setAIDSHIVStillTaking("Yes", 10);
//	reg.setAIDSHIVDegRcvry("1", 10, "Degree of recovery");
	reg.clickOnNext(" Next ", 10);
	Thread.sleep(3000);
	
	/* Go to PHQ_Registration Step5 -5. Signature and Submission */
	reg.clickOnElecSign("Electronics Signature", 10);
	reg.clickOnSubmitbtn("Submit", 10);

	/*Expected Vs Actual Validation*/
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
}
