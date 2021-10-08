package hero.heroPHQForm_pageObjects;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class phq_michigan_RegistorPage {
	/**
	 * This class will be created for Restistor Page Object Reprository :OR 
	 * 
	 * @throws Exception
	 * 
	 */
   

	
    public WebDriver driver;
    ActionDriver adriver ;
	public  phq_michigan_RegistorPage(WebDriver rdriver) {
		adriver = new ActionDriver();	
		driver = rdriver;
			PageFactory.initElements(rdriver, this);
	}
	public JavascriptExecutor js;
	
	/* Click on Registor and Start Link */ 
	By regLink               =   By.xpath("//input[@value='Register']");
	By regStart              =   By.xpath("/html/body/div/div[6]/section/form/div[3]/input");

	/* Identification */
	By TextFirstName         =   By.xpath("//*[@name='objEmployee.FirstName']");
	By textLastName          =   By.xpath("//*[@name='objEmployee.LastName']");
	By textSuffix            =   By.xpath("//*[@id='objEmployee_Suffix']");
	By textDaytymPh          =   By.xpath("/html/body/div[1]/div[6]/section/form/div[1]/div[5]/div[2]/input");
	By sDatedpdwn            =   By.xpath("//*[@name='objEmployee.DateofHire']");
	
	//*Are you planning to enroll in your employer's health insurance plan? -- Yes/No
	//--->if Yes
	By redBtnHelInsYes      =   By.xpath("//*[@id=\"enroll\"]");
	By sdepen               =   By.xpath("//*[@id=\"objEmployee_NoofDependents\"]");
	By textUserName         =   By.xpath("//*[@id=\"objEmployee_empDetail_UserName\"]");
	By textPswrd            =   By.xpath("//*[@id=\"objEmployee_empDetail_Password\"]");
	By textConfrmPswrd      =   By.xpath("//*[@id=\"objEmployee_empDetail_ConfirmPassword\"]");
	By textMarStatus        =   By.xpath("//select[@id='objEmployee_empDetail_MaritalStatus']");
	By textEmpStatus        =   By.xpath("//select[@id='objEmployee_empDetail_employmentstatus']");
	By textDOB              =   By.xpath("//*[@id=\"objEmployee_empDetail_DateofBirth\"]");
	By textEmail            =   By.xpath("//*[@id=\"objEmployee_empDetail_Email\"]");
	By textAddress1         =   By.xpath("//*[@id=\"objEmployee_empDetail_Address1\"]");
	By textAddress2         =   By.xpath("//*[@id=\"objEmployee_empDetail_Address2\"]");
	By textCity             =   By.xpath("//*[@id=\"objEmployee_empDetail_City\"]");
    By sState               =   By.xpath("//select[contains(.,'Select state')]");  //dropdown
    By textZipCode          =   By.xpath("//*[@id=\"objEmployee_empDetail_Zip\"]");
    By clickOnNext          =   By.xpath("//*[@id=\"nextbutton\"]");
    
    /* 2 Demographic, Build and Tobacco Use */
    By textSSN             =   By.xpath("//input[@id='PHQdemographic_0__SSNRequired']");
	By sGender             =   By.xpath("//*[@id=\"PHQdemographic_0__Gender\"]"); //dropdown
	By textHeightFt        =   By.xpath("//input[@id=\"PHQdemographic_0__Heightft\"]");
	By textHeightInch      =   By.xpath("//*[@id=\"PHQdemographic_0__Heightinch\"]");
	By textWeight          =   By.xpath("//*[@id=\"PHQdemographic_0__Weight\"]");
	By cboxTabacoo         =   By.xpath("//*[@id=\"PHQdemographic_0__tobaccoUseinlastyear\"]"); // click yes
	By cboxCovReq          =   By.xpath("//input[@id='PHQdemographic_0__covergaetype_Medical']");// click Medical
	
	// *Within the last 18th months,did you have health insurance coverage? --// Yes/No
	//--->if Yes
	By redBtnHelInsCoverageYes      =   By.xpath("//body/div[@id='container']/div[6]/section[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input[1]]");
	By clickOnSelAllThatApply       =   By.xpath("//input[@id='Employee']");
	By TextNameOfCovPer             =   By.xpath("//input[@id='NameofCoveredPerson']");
	By TextInsCompNameAndAdd        =   By.xpath("//input[@id='Insurancecompny']");
	
	/* 3 Medical Conditions and Treatments */
	By clickOnMedConListYes =  By.xpath("//body/div[@id='container']/div[6]/section[1]/form[1]/div[3]/div/div[1]/input[2]");
	By clickOnMedConListYes1 =   By.xpath("//body/div[@id='container']/div[6]/section[1]/form[1]/div[3]/div[31]/div/div[2]/input[2]");
	By textMedConListNoYes =   By.xpath("//*[@id=\"divpanel\"]/div/div[1]/div[2]/label");
	
	By clickOnMedConListtNo = By.xpath("//body/div[@id='container']/div[6]/section[1]/form[1]/div[1]/div[4]/div[2]/div[5]/div[2]/input[2]"); // sel cancer yes
	
	                                //Arthritis
	By textArthritiLocation                =        By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[3]/table[1]/tbody/tr/td[2]/input");
	By selArthritiType                     =    By.xpath("//*[@id=\"MedicationArthritis_0__Typearthritis\"]");
	By redArthritiJointsImpacted           =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[3]/table[1]/tbody/tr/td[4]/input");
	By selArthritiDateOnset                =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[3]/table[1]/tbody/tr/td[5]/input");
	By selArthritiLastDateTreated          =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[3]/table[1]/tbody/tr/td[6]/input");
	By textArthritiDegreeRecovery          =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[3]/table[1]/tbody/tr/td[7]/input");
	By redArthritiStillTaking              =    By.xpath("//input[@id='MedicationArthritis_0__StillTaking']");
	By textArthritiNotes                   =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[3]/table[1]/tbody/tr/td[10]/input");
	      
	                                //Back Disorder
	By selBackDisorderCond                 =     By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[5]/table[1]/tbody/tr/td[2]/select");
    By setBackDisDegreeRcvery              =     By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[5]/table[1]/tbody/tr/td[3]/select");
    By setBackDisOperated                  =     By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[5]/table[1]/tbody/tr/td[4]/input[1]");
    By setBackDisherapylst6mnths           =     By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[5]/table[1]/tbody/tr/td[5]/select");
	By setBackDisDateOnset                 =     By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[5]/table[1]/tbody/tr/td[6]/input");
	By setBackDisLastDatTreated            =     By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[5]/table[1]/tbody/tr/td[7]/input");
	By selBackDisStillTaking               =     By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[5]/table[1]/tbody/tr/td[9]/input[1]");
	By textBackDisNotes                    =     By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[5]/table[1]/tbody/tr/td[10]/input");
	                                                     
	                                 //Cancer
	By textCancerLocation                  =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[7]/table[1]/tbody/tr/td[2]/input");
	By selCancerType                       =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[7]/table[1]/tbody/tr/td[3]/select");
	By selCancerStage                      =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[7]/table[1]/tbody/tr/td[4]/select");
	By selCancerDateOnset                  =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[7]/table[1]/tbody/tr/td[5]/input");
	By selCancerLastDateTreated            =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[7]/table[1]/tbody/tr/td[6]/input");
	By selCancerRemision                   =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[7]/table[1]/tbody/tr/td[7]/input[1]");
	By redCancerStillTaking                =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[7]/table[1]/tbody/tr/td[9]/input[1]");
	By textCancerDegreeRecovery            =    By.xpath("//input[@id='MedicationCancer_0__DegreeofRecovery']");
	By textCancerNotes                     =    By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[7]/table[1]/tbody/tr/td[11]/input");
	
	                                 //Heart Disease
	By selHeartDiseaseCond                      =     By.xpath("//select[@id='MedicationHeartDisease_0__Condition']");
    By setHeartDiseaseDegreeRcvery              =     By.xpath("//select[@id='MedicationHeartDisease_0__DegreeofRecovery']");
    By setHeartDiseaseTreatment                 =     By.xpath("//select[@id='MedicationHeartDisease_0__Treatment']");
	By setHeartDiseaseDateOnset                 =     By.xpath("//input[@id='MedicationHeartDisease_0__DateofOnset']");
	By setHeartDiseaseLastDatTreated            =     By.xpath("//input[@id='MedicationHeartDisease_0__LastDateTreated']");
	By selHeartDiseaseStillTaking               =     By.xpath("//input[@id='MedicationHeartDisease_0__StillTaking']");
	By textHeartDiseaseNotes                    =     By.xpath("//input[@id='MedicationHeartDisease_0__Notes']");
	
	                                //Depression/ Mental Illness
	By selDprsMentalIlnessCond                 =     By.xpath("//select[@id='MedicationDepression_0__Condition']");
	By selDprsMentalIlnessConl                 =     By.xpath("//select[@id='MedicationDepression_0__Counselling']");
	By selDprsMentalIlnessPriorHosp            =     By.xpath("//input[@id='MedicationDepression_0__PriorHospitalization']");
	By selDprsMentalIlnessHistShok             =     By.xpath("//input[@id='MedicationDepression_0__HistoryofShock']");
	By selDprsMentalIlnessDateOnset            =     By.xpath("//input[@id='MedicationDepression_0__DateofOnset']");
	By selDprsMentalIlnessLastDatTreated       =     By.xpath("//input[contains(@id,'MedicationDepression_0__LastTreated')]");
	By selDprsMentalIlnessStillTaking          =     By.xpath("//input[@id='MedicationDepression_0__StillTaking']");
	By textDprsMentalIlnessNotes               =     By.xpath("//input[@id='MedicationDepression_0__Notes']");
	
	                                //Diabetes
	By selDiabetesType                         =     By.xpath("//select[@id='MedicationDiabetes_0__Type']");
	By selDiabetesDateOnset                    =     By.xpath("/html/body/div[1]/div[6]/section/form/main/div[1]/div[13]/table[1]/tbody/tr/td[3]/input");
	By selDiabetesLastDatTreated               =     By.xpath("//input[@id='MedicationDiabetes_0__LastDateTreated']");
	By setDiabetesHba1Bloodsugarlevel          =     By.xpath("//input[@id='MedicationDiabetes_0__hba1']");
	By setDiabetesHba2Bloodsugarlevel          =     By.xpath("//input[@id='MedicationDiabetes_0__hba2']");
	By setDiabetesHba3Bloodsugarlevel          =     By.xpath("//input[@id='MedicationDiabetes_0__hba3']");
	By setDiabetesStillTaking                  =     By.xpath("//input[@id='MedicationDiabetes_0__StillTaking']");
	
	                               //High Blood Pressure
	By setHighBldPressrRed1                    =     By.xpath("//input[@id='MedicationHighBP_0__Recent1']");
	By setHighBldPressrRed2                    =     By.xpath("//input[@id='MedicationHighBP_0__Recent2']");
	By setHighBldPressrRed3                    =     By.xpath("//input[@id='MedicationHighBP_0__Recent3']");
	By selHighBldStillTaking                   =     By.xpath("//input[@id='MedicationHighBP_0__StillTaking']");

	                               //High Cholesterol
	By setHighCholstrlRed1                    =     By.xpath("//input[@id='MedicationHighCholestrol_0__Recent1']");
	By setHighCholstrlRed2                    =     By.xpath("//input[@id='MedicationHighCholestrol_0__Recent2']");
	By setHighCholstrlRed3                    =     By.xpath("//input[@id='MedicationHighCholestrol_0__Recent3']");
	By selHighCholstrlStillTaking             =     By.xpath("//input[@id='MedicationHighCholestrol_0__StillTaking']");
	
	                               // //Pregnancy
	By setPregnancyDueDate                    =     By.xpath("//input[@id='MedicationPregnancy_0__Duedate']");
	By setPregnancyMulBirths                  =     By.xpath("//select[@id='MedicationPregnancy_0__MultipleBirth']");
	By setPregnancyPreviousCSection           =     By.xpath("//input[@id='MedicationPregnancy_0__PreviousSection']");
	By setPregnancyPreviousTermBirth          =     By.xpath("//input[@id='MedicationPregnancy_0__PreviousPreTermBirth']");
	By setPregnancyComplications              =     By.xpath("//select[@id='MedicationPregnancy_0__Complication']");
	By setPregnancyOtherDetail                =     By.xpath("//input[@id='MedicationPregnancy_0__OtherDetails']");
	
	
	                               //Stroke
	By selStrokeCond                      =     By.xpath("//select[@id='MedicationStroke_0__Condition']");
    By setStrokeDegreeRcvery              =     By.xpath("//input[@id='MedicationStroke_0__DegreeofRecovery']");
	By setStrokeDateOnset                 =     By.xpath("//input[@id='MedicationStroke_0__DateofOnset']");
	By setStrokeLastDatTreated            =     By.xpath("//input[@id='MedicationStroke_0__LastTreated']");
	By selStrokeStillTaking               =     By.xpath("//input[@id='MedicationStroke_0__StillTaking']");
	By textStrokeNotes                    =     By.xpath("//input[@id='MedicationStroke_0__Notes']");
	
	                               //Tumor
	By setTumorLocation                  =      By.xpath("//input[@id='MedicationTumour_0__Location']");
	By selTumorMalignant                 =      By.xpath("//input[@id='MedicationTumour_0__Maligant']");
	By selTumorOperated                  =      By.xpath("//input[@id='MedicationTumour_0__Operated']");
	By selTumorDateOnset                 =      By.xpath("//input[@id='MedicationTumour_0__DateofOnset']");
	By selTumorLastDateTreated           =      By.xpath("//input[@id='MedicationTumour_0__LastTreated']");
	By selTumorStillTaking               =      By.xpath("//input[@id='MedicationTumour_0__StillTaking']");
	By setTumorNotes                     =      By.xpath("//input[@id='MedicationTumour_0__Notes']");
	
                                   //Transplants
	By setTrnsPlntsOrgan                 =      By.xpath("//input[@id='MedicationTransplants_0__Organ']");
	By seTrnsPlntsStatus                 =      By.xpath("//select[@id='MedicationTransplants_0__Status']");
	By setTrnsPlntsDate                  =      By.xpath("//input[@id='MedicationTransplants_0__TransplantDate']");
	By setTrnsPlntsLastdatetreated       =      By.xpath("//input[@id='MedicationTransplants_0__LastTreated']");
	By setTrnsPlntsOStillTaking          =      By.xpath("//input[@id='MedicationTransplants_0__StillTaking']");
	By setTrnsPlntsDegreerecovery        =      By.xpath("//input[@id='MedicationTransplants_0__DegreeofRecovery']");
	By setTrnsPlntsNotes                 =      By.xpath("//input[@id='MedicationTransplants_0__Notes']");

	                               //Other Conditions - Treatment for serious illness past 5 years
	By setTrtmentIllness5yrsCond          =      By.xpath("//input[@id='MedicationOthers_0__conditions']");
	By setTrtmntIllnessDateOnset          =      By.xpath("//input[@id='MedicationOthers_0__DateofOnset']");
	By setTrtmntIllnessDateTreated        =      By.xpath("//input[@id='MedicationOthers_0__LastDateTreated']");
	By setTrtmntIllnessStillTaking        =      By.xpath("//input[@id='MedicationOthers_0__StillTaking']");
	By setTrtmntIllnessDegRcvry           =      By.xpath("//input[@id='MedicationOthers_0__DegreeofRecovery']");
	                                 //Other Conditions - Surgery for serious illness past 5 years
	By setSurgeryIllness5yrsCond          =      By.xpath("//input[@id='MedicationOthers_1__conditions']");
	By setSurgeryIllnessDateOnset         =      By.xpath("//input[@id='MedicationOthers_1__DateofOnset']");
	By setSurgeryllnessDateTreated        =      By.xpath("//input[@id='MedicationOthers_1__LastDateTreated']");
	By setSurgeryllnessStillTaking        =      By.xpath("//input[@id='MedicationOthers_1__StillTaking']");
	By setSurgeryllnessDegRcvry           =      By.xpath("//input[@id='MedicationOthers_1__DegreeofRecovery']");
	
	//Other Conditions - Substance dependency  
	By setSubDepend5yrsCond          =      By.xpath("//input[@id='MedicationOthers_2__conditions']");
	By setSubDependDateOnset         =      By.xpath("//input[@id='MedicationOthers_2__DateofOnset']");
	By setSubDependDateTreated        =      By.xpath("//input[@id='MedicationOthers_2__LastDateTreated']");
	By setSubDependStillTaking        =      By.xpath("//input[@id='MedicationOthers_2__StillTaking']");
	By setSubDependDegRcvry           =      By.xpath("//input[@id='MedicationOthers_2__DegreeofRecovery']");
	
	//Other Condition - Stomach
	By setStomachCond               =      By.xpath("//input[@id='MedicationOthers_3__conditions']");
	By setStomachDateOnset          =      By.xpath("//input[@id='MedicationOthers_3__DateofOnset']");
	By setStomachDateTreated        =      By.xpath("//input[@id='MedicationOthers_3__LastDateTreated']");
	By setStomachStillTaking        =      By.xpath("//input[@id='MedicationOthers_3__StillTaking']");
	By setStomachDegRcvry           =      By.xpath("//input[@id='MedicationOthers_3__DegreeofRecovery']");
	
	//Other Condition - Respiratory
	By setRespiratoryCond               =      By.xpath("//input[@id='MedicationOthers_4__conditions']");
	By setRespiratoryDateOnset          =      By.xpath("//input[@id='MedicationOthers_4__DateofOnset']");
	By setRespiratoryDateTreated        =      By.xpath("//input[@id='MedicationOthers_4__LastDateTreated']");
	By setRespiratoryStillTaking        =      By.xpath("//input[@id='MedicationOthers_4__StillTaking']");
	By setRespiratoryDegRcvry           =      By.xpath("//input[@id='MedicationOthers_4__DegreeofRecovery']");
	
	//Other Condition - Prescription
	By setPrescriptionCond               =      By.xpath("//input[@id='MedicationOthers_5__conditions']");
	By setPrescriptionDateOnset          =      By.xpath("//input[@id='MedicationOthers_5__DateofOnset']");
	By setPrescriptionDateTreated        =      By.xpath("//input[@id='MedicationOthers_5__LastDateTreated']");
	By setPrescriptionStillTaking        =      By.xpath("//input[@id='MedicationOthers_5__StillTaking']");
	By setPrescriptionDegRcvry           =      By.xpath("//input[@id='MedicationOthers_5__DegreeofRecovery']");
	
	//Other Condition - Pending surgery 
	
	By setPndngSurgryCond               =      By.xpath("//input[@id='MedicationOthers_6__conditions']");
	By setPndngSurgryDateOnset          =      By.xpath("//input[@id='MedicationOthers_6__DateofOnset']");
	By setPndngSurgryDateTreated        =      By.xpath("//input[@id='MedicationOthers_6__LastDateTreated']");
	By setPndngSurgryStillTaking        =      By.xpath("//input[@id='MedicationOthers_6__StillTaking']");
	By setPndngSurgryDegRcvry           =      By.xpath("//input[@id='MedicationOthers_6__DegreeofRecovery']");
	
	//Other Condition - Pending medical treatment or diagnostic testing 
	By setPndgMedTrtmntyCond             =      By.xpath("//input[@id='MedicationOthers_7__conditions']");
	By setPndgMedTrtmntDateOnset         =      By.xpath("//input[@id='MedicationOthers_7__DateofOnset']");
	By setPndgMedTrtmntDateTreated       =      By.xpath("//input[@id='MedicationOthers_7__LastDateTreated']");
	By setPndgMedTrtmntStillTaking       =      By.xpath("//input[@id='MedicationOthers_7__StillTaking']");
	By setPndgMedTrtmntDegRcvry          =      By.xpath("//input[@id='MedicationOthers_7__DegreeofRecovery']");
	
	
	//Other Condition - Pending hospitalization PndgHostp
	
	By setPndgHostpCond             =      By.xpath("//input[@id='MedicationOthers_8__conditions']");
	By setPndgHostpDateOnset         =      By.xpath("//input[@id='MedicationOthers_8__DateofOnset']");
	By setPndgHostpDateTreated       =      By.xpath("//input[@id='MedicationOthers_8__LastDateTreated']");
	By setPndgHostpStillTaking       =      By.xpath("//input[@id='MedicationOthers_8__StillTaking']");
	By setPndgHostpDegRcvry          =      By.xpath("//input[@id='MedicationOthers_8__DegreeofRecovery']");
	
	//Other Condition - Muscular Disorder 
	
	By setMslDisordrCond             =      By.xpath("//input[@id='MedicationOthers_9__conditions']");
	By setMslDisordrDateOnset         =      By.xpath("//input[@id='MedicationOthers_9__DateofOnset']");
	By setMslDisordrDateTreated       =      By.xpath("//input[@id='MedicationOthers_9__LastDateTreated']");
	By setMslDisordrStillTaking       =      By.xpath("//input[@id='MedicationOthers_9__StillTaking']");
	By setMslDisordrDegRcvry          =      By.xpath("//input[@id='MedicationOthers_9__DegreeofRecovery']");
	
	//Other Condition - Liver Disease  LveDiese
	By setLveDieseCond             =      By.xpath("//input[@id='MedicationOthers_10__conditions']");
	By setLveDieseDateOnset         =      By.xpath("//input[@id='MedicationOthers_10__DateofOnset']");
	By setLveDieseDateTreated       =      By.xpath("//input[@id='MedicationOthers_10__LastDateTreated']");
	By setLveDieseStillTaking       =      By.xpath("//input[@id='MedicationOthers_10__StillTaking']");
	By setLveDieseDegRcvry          =      By.xpath("//input[@id='MedicationOthers_10__DegreeofRecovery']");
	
	//Other Condition -Kidney Disorder 
	By setKidnDisorderCond             =      By.xpath("//input[@id='MedicationOthers_11__conditions']");
	By setKidnDisorderOnset         =      By.xpath("//input[@id='MedicationOthers_11__DateofOnset']");
	By seKidnDisorderTreated       =      By.xpath("//input[@id='MedicationOthers_11__LastDateTreated']");
	By setKidnDisorderStillTaking       =      By.xpath("//input[@id='MedicationOthers_11__StillTaking']");
	By setKidnDisorderDegRcvry          =      By.xpath("//input[@id='MedicationOthers_11__DegreeofRecovery']");
	
	// Other Condition -Immune / Autoimmune Disease
	By setImmDisesCond = By.xpath("//input[@id='MedicationOthers_12__conditions']");
	By setImmDisesOnset = By.xpath("//input[@id='MedicationOthers_12__DateofOnset']");
	By seImmDisesTreated = By.xpath("//input[@id='MedicationOthers_12__LastDateTreated']");
	By setImmDisesStillTaking = By.xpath("//input[@id='MedicationOthers_12__StillTaking']");
	By setImmDisesDegRcvry = By.xpath("//input[@id='MedicationOthers_12__DegreeofRecovery']");

	// Other Condition - Hospitalization or emergency room visit for serious illness past 5 years
	By setHostEmrgVistCond = By.xpath("//input[@id='MedicationOthers_13__conditions']");
	By setHostEmrgVistOnset = By.xpath("//input[@id='MedicationOthers_13__DateofOnset']");
	By seHostEmrgVistTreated = By.xpath("//input[@id='MedicationOthers_13__LastDateTreated']");
	By setHostEmrgVistStillTaking = By.xpath("//input[@id='MedicationOthers_13__StillTaking']");
	By setHostEmrgVistDegRcvry = By.xpath("//input[@id='MedicationOthers_13__DegreeofRecovery']");
	
	
	// Other Condition - Currently scheduled for surgery 
	By setCurntlySchedSurgeryCond = By.xpath("//input[@id='MedicationOthers_14__conditions']");
	By setCurntlySchedSurgeryOnset = By.xpath("//input[@id='MedicationOthers_14__DateofOnset']");
	By setCurntlySchedSurgeryTreated = By.xpath("//input[@id='MedicationOthers_14__LastDateTreated']");
	By setCurntlySchedSurgeryStillTaking = By.xpath("//input[@id='MedicationOthers_14__StillTaking']");
	By setCurntlySchedSurgeryDegRcvry = By.xpath("//input[@id='MedicationOthers_14__DegreeofRecovery']");
	
	//Other Condition - Currently hospitalized or confined in a treatment facility 
	By setCurntkyHospFacilityCond = By.xpath("//input[@id='MedicationOthers_15__conditions']");
	By setCurntkyHospFacilityOnset = By.xpath("//input[@id='MedicationOthers_15__DateofOnset']");
	By setCurntkyHospFacilityTreated = By.xpath("//input[@id='MedicationOthers_15__LastDateTreated']");
	By setCurntkyHospFacilityStillTaking = By.xpath("//input[@id='MedicationOthers_15__StillTaking']");
	By setCurntkyHospFacilityDegRcvry = By.xpath("//input[@id='MedicationOthers_15__DegreeofRecovery']");
	
	
	//Other Condition - Currently confined or incapacitated 
	
	By setCurrentlyIncaptedCond = By.xpath("//input[@id='MedicationOthers_16__conditions']");
	By setCurrentlyIncaptedOnset = By.xpath("//input[@id='MedicationOthers_16__DateofOnset']");
	By setCurrentlyIncaptedTreated = By.xpath("//input[@id='MedicationOthers_16__LastDateTreated']");
	By setCurrentlyIncaptedStillTaking = By.xpath("//input[@id='MedicationOthers_16__StillTaking']");
	By setCurrentlyIncaptedDegRcvry = By.xpath("//input[@id='MedicationOthers_16__DegreeofRecovery']");
	
	//Other Condition - Counseling
	By setCounselingCond = By.xpath("//input[@id='MedicationOthers_17__conditions']");
	By setCounselingOnset = By.xpath("//input[@id='MedicationOthers_17__DateofOnset']");
	By setCounselingTreated = By.xpath("//input[@id='MedicationOthers_17__LastDateTreated']");
	By setCounselingStillTaking = By.xpath("//input[@id='MedicationOthers_17__StillTaking']");
	By setCounselingDegRcvry = By.xpath("//input[@id='MedicationOthers_17__DegreeofRecovery']");
	
	
	
	//Other Condition - Condition not on PHQ 
	By setCondNotPHQCond = By.xpath("//input[@id='MedicationOthers_18__conditions']");
	By setCondNotPHQOnset = By.xpath("//input[@id='MedicationOthers_18__DateofOnset']");
	By setCondNotPHQTreated = By.xpath("//input[@id='MedicationOthers_18__LastDateTreated']");
	By setCondNotPHQStillTaking = By.xpath("//input[@id='MedicationOthers_18__StillTaking']");
	By setCondNotPHQDegRcvry = By.xpath("//input[@id='MedicationOthers_18__DegreeofRecovery']");
	
	//Other Condition - Circulatory System Disease 
	By setCirclatrySysDisesCond = By.xpath("//input[@id='MedicationOthers_19__conditions']");
	By setCirclatrySysDisesOnset = By.xpath("//input[@id='MedicationOthers_19__DateofOnset']");
	By setCirclatrySysDisesTreated = By.xpath("//input[@id='MedicationOthers_19__LastDateTreated']");
	By setCirclatrySysDisesStillTaking = By.xpath("//input[@id='MedicationOthers_19__StillTaking']");
	By setCirclatrySysDisesDegRcvry = By.xpath("//input[@id='MedicationOthers_19__DegreeofRecovery']");
	
	//Other Condition - Circulatory System Disease 
	By setBowelCond = By.xpath("//input[@id='MedicationOthers_20__conditions']");
	By setBowelOnset = By.xpath("//input[@id='MedicationOthers_20__DateofOnset']");
	By setBowelTreated = By.xpath("//input[@id='MedicationOthers_20__LastDateTreated']");
	By setBowelStillTaking = By.xpath("//input[@id='MedicationOthers_20__StillTaking']");
	By setBowelDegRcvry = By.xpath("//input[@id='MedicationOthers_20__DegreeofRecovery']");
	
	
	//Other Condition - BirthDefects
	By setBirthDefectsCond = By.xpath("//input[@id='MedicationOthers_21__conditions']");
	By setBirthDefectsOnset = By.xpath("//input[@id='MedicationOthers_21__DateofOnset']");
	By setBirthDefectsTreated = By.xpath("//input[@id='MedicationOthers_21__LastDateTreated']");
	By setBirthDefectsStillTaking = By.xpath("//input[@id='MedicationOthers_21__StillTaking']");
	By setBirthDefectsDegRcvry = By.xpath("//input[@id='MedicationOthers_21__DegreeofRecovery']");

	//Other Condition - AIDS or HIV+ 
	By setAIDSHIVCond = By.xpath("//input[@id='MedicationOthers_22__conditions']");
	By setAIDSHIVOnset = By.xpath("//input[@id='MedicationOthers_22__DateofOnset']");
	By setAIDSHIVTreated = By.xpath("//input[@id='MedicationOthers_22__LastDateTreated']");
	By setAIDSHIVStillTaking = By.xpath("//input[@id='MedicationOthers_22__StillTaking']");
	By setAIDSHIVDegRcvry = By.xpath("//input[@id='MedicationOthers_22__DegreeofRecovery']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* 4 Check Condition Details and Medications */
	//By clickOninfohedricon =   By.xpath("//*[@id=\"Otherinfoheadericon\"]");
	By TextConDia            =   By.xpath("//input[@id='MedicationOthers_0__conditions']");
	By setBackDisDateOnsett          =     By.xpath("//input[@id='MedicationOthers_0__DateofOnset']");
	By setBackDisLastDatTreatedd     =     By.xpath("//input[@id='MedicationOthers_0__LastDateTreated']");
	
	By TextConDiaa                    =  By.xpath("//input[@id='MedicationOthers_1__conditions']");
	By setBackDisDateOnsettt          =  By.xpath("//input[@id='MedicationOthers_1__DateofOnset']");
	By setBackDisLastDatTreateddd     =  By.xpath("//input[@id='MedicationOthers_1__LastDateTreated']");
	
	By eleCod1 = By.xpath("//tbody/tr[@id='row_0']/td[6]/span[1]/span[1]/span[1]/ul[1]/li[1]");
	By eleValueCod1 = By.xpath("//li[normalize-space()='5-HTP TRYPTOPHAN']");
	By eleCod2 = By.xpath("//tbody/tr[@id='row_0']/td[6]/span[1]/span[1]/span[1]/ul[1]/li[1]");
	By eleValueCod2 = By.xpath("//li[normalize-space()='8-MOP']");

	
	/* 5. Signature and Submission */
	By clickOnElecSign    =   By.xpath("//*[@id=\"dvelectronicsignature\"]/input[1]");
	By clickOnSubmit      =   By.xpath("//input[contains(@onclick,\"return readonly(); ShowLoading('processing', 'step5');\")]");
	By textWaivingDOB     =   By.xpath("//*[@id=\"PHQWaiver_0__DateOfBirth\"]");  // if Ins plane No waiving coverage
	
	/*  Final and Submission */
	By verifyRegSubmis    =   By.xpath("//*[@id=\"divpanel\"]/div/div/div[2]/div");
	
	
	By veriFyExistinguser =   By.xpath("//*[@id=\"employeeDetail\"]/div[4]/div[2]/div[2]/span/span");
    
	//---> if no
		By redBtnHelInsNo        =   By.xpath("//input[@id=\"notenroll\"]");
		
		//Please provide a reason for waiving coverage:--
		By redBtnSpusePlan       =   By.xpath("//input[@value=\"Covered by spouse's plan (copy of id card may be required)\"]");
		By redBtnNotEligible     =   By.xpath("//input[@value='Not eligible (part time, seasonal,etc.)']");
		By redBtnWonttCovrg      =   By.xpath("//input[@value='Not eligible (part time, seasonal,etc.)']");
		By redBtnWaitingPriod    =   By.xpath("//input[contains(@value,'I am currently in waiting period')]");
		By redBtnUnderAnotherPln  =   By.xpath("//input[@value='I am covered under another plan']");
		By textArea                   =   By.xpath("//textarea[@class='text-box multi-line']");
		By redBtnVeterans         =   By.xpath("//input[@value='Veterans']");
		By redBtnMedicare         =   By.xpath("//input[@value='Medicare']");
		By redBtnMedicaid         =   By.xpath("//input[@value='Medicaid']");
		By redBtnIndividual       =   By.xpath("//input[@value='Individual']");
		By redBtnOtherReason      =   By.xpath("//input[@value='Other Reason']");
	
	
		/* Setup Method for PHQ_Registor : Identification */
		
		getUtil get = new getUtil(driver);
		

		public void clickOnRegistorLink(String eleName, int timeout) throws Exception {
			adriver.click(regLink, timeout, eleName);
		}

		public void clickOnStartReg(String eleName, int timeout) throws Exception {
			// getUtil.ScrolldownTillPageEnd(driver);
			adriver.clickByJs(regStart, timeout, eleName);
		}

		/* 2nd */
		public void setFirstName(String typeData, int timeout, String eleName) throws Exception {
			adriver.Type(TextFirstName, eleName, timeout, typeData);
		}

		public void setLastName(String typeData, int timeout, String eleName) throws Exception {
			adriver.Type(textLastName, eleName, timeout, typeData);
		}

		public void setSuffix(String typeData, int timeout, String eleName) throws Exception {
			adriver.Type(textSuffix, eleName, timeout, typeData);
		}

		public void setMobNumber(String typeData, int timeout, String eleName) throws Exception {
			driver.findElement(textDaytymPh).clear();
			driver.findElement(textDaytymPh).click();
			adriver.Type(textDaytymPh, eleName, timeout, typeData);
		}

		public void setDateHire(String typeData, int timeout, String eleName) throws Exception {
			WebElement ele = driver.findElement(sDatedpdwn);
			getUtil.selectDateByJS(driver, ele, typeData);
		}

		// *Are you planning to enroll in your employer's health insurance plan? --
		// Yes/No

		// --->if Yes
		public void clickOnHethInsYes(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnHelInsYes, timeout, eleName);
		}

		public void setDependent(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(sdepen, timeout, eleName);
			;
		}

		public void setUserName(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textUserName, eleName, timeout, typeData);
		}

		public void setPassword(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textPswrd, eleName, timeout, typeData);
		}

		public void setConfrmPswrd(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textConfrmPswrd, eleName, timeout, typeData);
		}
		
		public void setMaritalStatus(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(textMarStatus, timeout, eleName);
			;
		}
		
		public void setEmpStatus(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(textEmpStatus, timeout, eleName);
			;
		}


		public void setDob(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textDOB, eleName, timeout, typeData);
		}

		public void setEmailId(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textEmail, eleName, timeout, typeData);
		}

		public void setAddress1(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textAddress1, eleName, timeout, typeData);
		}

		public void setAddress2(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textAddress2, eleName, timeout, typeData);
		}

		public void setCity(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textCity, eleName, timeout, typeData);
		}

		public void setState(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(sState, timeout, eleName);
			;
		}

		public void setZip(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textZipCode, eleName, timeout, typeData);
		}

		public void clickOnNext(String eleName, int timeout) throws Exception {
			getUtil.ScrolldownTillPageEnd(driver);
			adriver.click(clickOnNext, timeout, eleName);
		}

		/* Setup Method for PHQ_Registor : 2 Demographic, Build and Tobacco Use */

		public void setSSN(String typeData, int timeout, String eleName) throws IOException {
			driver.findElement(textSSN).clear();
			driver.findElement(textSSN).click();
			adriver.Type(textSSN, eleName, timeout, typeData);
		}

		public void setGender(String eleName, int timeout) throws IOException {
			driver.findElement(sGender).click();
			adriver.selectByDropdwn(sGender, timeout, eleName);
			;
		}

		public void setHeightFt(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textHeightFt, eleName, timeout, typeData);
		}

		public void setHeightInch(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textHeightInch, eleName, timeout, typeData);
		}

		public void setWeight(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textWeight, eleName, timeout, typeData);
		}

		public void checkTmbacoLastYr(String eleName, int timeout) throws Exception {
			getUtil.ScrolldownTillPageEnd(driver); // scroll for next otion
			adriver.click(cboxTabacoo, timeout, eleName);
		}
		
		public void checkCoverageReq(String eleName, int timeout) throws Exception {
			getUtil.ScrolldownTillPageEnd(driver); // scroll for next otion
			adriver.click(cboxCovReq, timeout, eleName);
		}
		
		// *Within the last 18th months,did you have health insurance coverage? --
				// Yes/No

	    // --->if Yes
		public void clickOnHethInsCoverageYes(String eleName, int timeout) throws Exception {
			adriver.click(redBtnHelInsCoverageYes, timeout, eleName);
		}
		public void clickOnSelectAllThatApply(String eleName, int timeout) throws Exception {
			getUtil.ScrolldownTillPageEnd(driver);
			adriver.click(clickOnSelAllThatApply, timeout, eleName);
		}
		
		public void setNameOfCovPerson(String typeData, int timeout, String eleName) throws Exception {
			adriver.Type(TextNameOfCovPer, eleName, timeout, typeData);
		}
		
		public void setInsCompNameAndAdd(String typeData, int timeout, String eleName) throws Exception {
			adriver.Type(TextInsCompNameAndAdd, eleName, timeout, typeData);
		}

		/* Setup Method for PHQ_Registor : 3 Medical Conditions and Treatments */
		
		public void clickOnMedConListYes(String redBtn, int timeout) throws Exception // sel yes
		{
			adriver.clickAndScroll(clickOnMedConListYes, clickOnMedConListYes, redBtn);
		}
		public void clickOnMedConListYes1(String redBtn, int timeout) throws Exception // sel yes
		{
			adriver.clickAndScroll(clickOnMedConListYes1, textMedConListNoYes, redBtn);
		}

		// Arthriti
		public void setArthritiLocation(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textArthritiLocation, eleName, timeout, typeData);
		}

		public void selArthritiType(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(selArthritiType, timeout, eleName);
			;
		}

		public void selArthritiJointsImpacted(String eleName, int timeout) throws Exception {
			adriver.click(redArthritiJointsImpacted, timeout, eleName);
		}

		public void selArthritiDateOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(selArthritiDateOnset, eleName, timeout, typeData);
		}

		public void selArthritiLastDateTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(selArthritiLastDateTreated, eleName, timeout, typeData);
		}

		public void selArthritiDegreeRecovery(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textArthritiDegreeRecovery, eleName, timeout, typeData);
		}

		public void selArthritiJStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redArthritiStillTaking, timeout, eleName);
		}

		public void selArthritiArthritiNotes(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textArthritiNotes, eleName, timeout, typeData);
		}
		// Back Disorder

		public void selBackDisCondition(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(selBackDisorderCond, timeout, eleName);
			;
		}

		public void setBackDisDegreeRcvery(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(setBackDisDegreeRcvery, timeout, eleName);
			;
		}

		public void selBackDisOperated(String eleName, int timeout) throws Exception {
			adriver.click(setBackDisOperated, timeout, eleName);
			;
		}

		public void setBackDisherapylst6mnths(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(setBackDisherapylst6mnths, timeout, eleName);
			;
		}

		public void setBackDisDateOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBackDisDateOnset, eleName, timeout, typeData);
		}

		public void selBackDisLastDatTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBackDisLastDatTreated, eleName, timeout, typeData);
		}

		public void selBackDisStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selBackDisStillTaking, timeout, eleName);
		}

		public void selBackDisNotes(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textBackDisNotes, eleName, timeout, typeData);
		}

		// Cancer
		public void setCancerLocation(String typeData, int timeout, String eleName) throws IOException {
			getUtil.acrollIntoView(driver.findElement(textCancerLocation), driver);
			adriver.Type(textCancerLocation, eleName, timeout, typeData);
		}

		public void selCancerType(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(selCancerType, timeout, eleName);
			;
		}

		public void selCancerStage(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(selCancerStage, 5, eleName);
			;
		}

		public void selCancerDateOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(selCancerDateOnset, eleName, timeout, typeData);
		}

		public void selCancerLastDateTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(selCancerLastDateTreated, eleName, timeout, typeData);
		}

		public void selCancerRemision(String eleName, int timeout) throws Exception {
			adriver.click(selCancerRemision, timeout, eleName);
		}

		public void selCamcerStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redCancerStillTaking, timeout, eleName);
		}

		public void selCancerDegreeRecovery(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textCancerDegreeRecovery, eleName, timeout, typeData);
		}

		public void setCancerNotes(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textCancerNotes, eleName, timeout, typeData);
		}

		// Heart Disease
		public void selselHeartDiseaseCond(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(selHeartDiseaseCond, timeout, eleName);
			;
		}

		public void setHeartDiseaseDateOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setHeartDiseaseDateOnset, eleName, timeout, typeData);
		}

		public void setHeartDiseaseLastDatTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setHeartDiseaseLastDatTreated, eleName, timeout, typeData);
		}

		public void setHeartDiseaseTreatment(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(setHeartDiseaseTreatment, timeout, eleName);
			;
		}

		public void setHeartDiseaseDegreeRcvery(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(setHeartDiseaseDegreeRcvery, timeout, eleName);
			;
		}

		public void selHeartDiseaseStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selHeartDiseaseStillTaking, timeout, eleName);
		}

		public void textHeartDiseaseNotes(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textHeartDiseaseNotes, eleName, timeout, typeData);
		}

		// Depression/ Mental Illness
		public void selDprsMentalIlnessCond(String eleName, int timeout) throws IOException {
			getUtil.acrollIntoView(driver.findElement(selDprsMentalIlnessCond), driver);
			adriver.selectByDropdwn(selDprsMentalIlnessCond, timeout, eleName);
			;
		}

		public void selDprsMentalIlnessConl(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(selDprsMentalIlnessConl, timeout, eleName);
			;
		}

		public void selDprsMentalIlnessPriorHosp(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selDprsMentalIlnessPriorHosp, timeout, eleName);
		}

		public void selDprsMentalIlnessHistShok(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selDprsMentalIlnessHistShok, timeout, eleName);
		}

		public void selDprsMentalIlnessDateOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(selDprsMentalIlnessDateOnset, eleName, timeout, typeData);
		}

		public void selDprsMentalIlnessLastDatTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(selDprsMentalIlnessLastDatTreated, eleName, timeout, typeData);
		}

		public void selDprsMentalIlnessStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selDprsMentalIlnessStillTaking, timeout, eleName);
		}

		public void textDprsMentalIlnessNotes(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textDprsMentalIlnessNotes, eleName, timeout, typeData);
		}

		// Diabetes

		public void selDiabetesType(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(selDiabetesType, timeout, eleName);
			;
		}

		public void selDiabetesLastDatTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(selDiabetesLastDatTreated, eleName, timeout, typeData);
		}

		public void selDiabetesDateOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(selDiabetesDateOnset, eleName, timeout, typeData);
		}

		public void setDiabetesHbaBloodsugarlevel(String typeData1, String typeData2, String typeData3, int timeout,
				String eleName) throws IOException {
			adriver.Type(setDiabetesHba1Bloodsugarlevel, eleName, timeout, typeData1);
			// driver.findElement(setDiabetesHba1Bloodsugarlevel).click();
			adriver.Type(setDiabetesHba2Bloodsugarlevel, eleName, timeout, typeData2);
			// driver.findElement(setDiabetesHba1Bloodsugarlevel).click();
			adriver.Type(setDiabetesHba3Bloodsugarlevel, eleName, timeout, typeData3);
		}

		public void setDiabetesStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setDiabetesStillTaking, timeout, eleName);
		}

		// High Blood Pressure
		public void setHighBldPressrRed(String typeData1, String typeData2, String typeData3, int timeout,
				String eleName) throws IOException {
			adriver.Type(setHighBldPressrRed1, eleName, timeout, typeData1);
			adriver.Type(setHighBldPressrRed2, eleName, timeout, typeData2);
			adriver.Type(setHighBldPressrRed3, eleName, timeout, typeData3);
		}

		public void selHighBldStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selHighBldStillTaking, timeout, eleName);
		}

		// High Cholesterol
		public void setHighCholstrlRed(String typeData1, String typeData2, String typeData3, int timeout,
				String eleName) throws IOException {
			adriver.Type(setHighCholstrlRed1, eleName, timeout, typeData1);
			adriver.Type(setHighCholstrlRed2, eleName, timeout, typeData2);
			adriver.Type(setHighCholstrlRed3, eleName, timeout, typeData3);
		}

		public void selHighCholstrlStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selHighCholstrlStillTaking, timeout, eleName);
		}

		// Pregnancy
		public void setPregnancyDueDate(String typeData, int timeout, String eleName) throws IOException {
			getUtil.acrollIntoView(driver.findElement(setPregnancyDueDate), driver);
			adriver.Type(setPregnancyDueDate, eleName, timeout, typeData);
		}

		public void setPregnancyMulBirths(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(setPregnancyMulBirths, timeout, eleName);
		}

		public void setPregnancyPreviousCSection(String eleName, int timeout) throws Exception {
			// adriver.clickByAction(setPregnancyPreviousCSection, timeout, eleName);
			WebElement ele1 = driver.findElement(By.xpath("//input[@id='MedicationPregnancy_0__PreviousSection']"));
			Actions action = new Actions(driver);
			action.moveToElement(ele1).click().build().perform();

		}

		public void setPregnancyPreviousTermBirth(String eleName, int timeout) throws Exception {
			// adriver.clickByAction(setPregnancyPreviousTermBirth, timeout, eleName);
			WebElement ele2 = driver
					.findElement(By.xpath("//input[@name='MedicationPregnancy[0].PreviousPreTermBirth']"));
			Actions action = new Actions(driver);
			action.moveToElement(ele2).click().build().perform();
		}

		public void setPregnancyComplications(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(setPregnancyComplications, timeout, eleName);
		}

		public void setPregnancyOtherDetail(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setPregnancyOtherDetail, eleName, timeout, typeData);
		}

		// Stroke
		public void selStrokeCond(String eleName, int timeout) throws IOException {
			adriver.selectByDropdwn(selStrokeCond, timeout, eleName);
			;
		}

		public void setStrokeDegreeRcvery(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setStrokeDegreeRcvery, eleName, timeout, typeData);
		}

		public void setStrokeDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setStrokeDateOnset, eleName, timeout, typeData);
		}

		public void setStrokeLastDatTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setStrokeLastDatTreated, eleName, timeout, typeData);
		}

		public void selStrokeStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selStrokeStillTaking, timeout, eleName);
		}

		public void setTextStrokeNotes(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textStrokeNotes, eleName, timeout, typeData);
		}

		// Tumor
		public void setTumorLocation(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setTumorLocation, eleName, timeout, typeData);
		}

		public void selTumorMalignant(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selTumorMalignant, timeout, eleName);
		}

		public void selTumorOperated(String eleName, int timeout)  throws Exception {
			adriver.clickByJs(selTumorOperated, timeout, eleName);
		}

		public void selTumorDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(selTumorDateOnset, eleName, timeout, typeData);
		}

		public void selTumorLastDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(selTumorLastDateTreated, eleName, timeout, typeData);
		}

		public void selTumorStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(selTumorStillTaking, timeout, eleName);
		}

		public void setTumorNotes(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setTumorNotes, eleName, timeout, typeData);
		}

		// Transplants

		public void setTrnsPlntsOrgan(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setTrnsPlntsOrgan, eleName, timeout, typeData);
		}

		public void seTrnsPlntsStatus(String eleName, int timeout) throws IOException{
			adriver.selectByDropdwn(seTrnsPlntsStatus, timeout, eleName);
			;
		}

		public void setTrnsPlntsDate(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setTrnsPlntsDate, eleName, timeout, typeData);
		}

		public void setTrnsPlntsLastdatetreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setTrnsPlntsLastdatetreated, eleName, timeout, typeData);
		}

		public void setTrnsPlntsDegreerecovery(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setTrnsPlntsDegreerecovery, eleName, timeout, typeData);
		}

		public void setTrnsPlntsOStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setTrnsPlntsOStillTaking, timeout, eleName);
		}

		public void setTrnsPlntsNotes(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setTrnsPlntsNotes, eleName, timeout, typeData);
		}

		// **Other Conditions***/

		// Other Conditions - Treatment for serious illness past 5 years

		public void setTrtmentIllness5yrsCond(String typeData, int timeout, String eleName) throws IOException{
			getUtil.acrollIntoView(driver.findElement(setTrtmentIllness5yrsCond), driver);
			adriver.Type(setTrtmentIllness5yrsCond, eleName, timeout, typeData);
		}

		public void setTrtmntIllnessDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setTrtmntIllnessDateOnset, eleName, timeout, typeData);
		}

		public void setTrtmntIllnessDateTreated(String typeData, int timeout, String eleName)throws IOException {
			adriver.Type(setTrtmntIllnessDateTreated, eleName, timeout, typeData);
		}

		public void setTrtmntIllnessStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setTrtmntIllnessStillTaking, timeout, eleName);
		}

		public void setTrtmntIllnessDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setTrtmntIllnessDegRcvry, eleName, timeout, typeData);
		}
		// Other Conditions - Surgery for serious illness past 5 years

		public void setSurgeryIllness5yrsCond(String typeData, int timeout, String eleName) throws IOException{
			// getUtil.acrollIntoView(driver.findElement(setSurgeryIllness5yrsCond),
			// driver);
			adriver.Type(setSurgeryIllness5yrsCond, eleName, timeout, typeData);
		}

		public void setSurgeryIllnessDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setSurgeryIllnessDateOnset, eleName, timeout, typeData);
		}

		public void setSurgeryllnessDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setSurgeryllnessDateTreated, eleName, timeout, typeData);
		}

		public void setSurgeryllnessStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setSurgeryllnessStillTaking, timeout, eleName);
		}

		public void setSurgeryllnessDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setSurgeryllnessDegRcvry, eleName, timeout, typeData);
		}

		// Other Conditions - Substance dependency
		public void setSubDepend5yrsCond(String typeData, int timeout, String eleName) throws IOException{
			// getUtil.acrollIntoView(driver.findElement(setSubDepend5yrsCond), driver);
			adriver.Type(setSubDepend5yrsCond, eleName, timeout, typeData);
		}

		public void setSubDependDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setSubDependDateOnset, eleName, timeout, typeData);
		}

		public void setSubDependDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setSubDependDateTreated, eleName, timeout, typeData);
		}

		public void setSubDependStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setSubDependStillTaking, timeout, eleName);
		}

		public void setSubDependDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setSubDependDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Stomach

		public void setStomachCond(String typeData, int timeout, String eleName) throws IOException{
			getUtil.acrollIntoView(driver.findElement(setStomachCond), driver);
			adriver.Type(setStomachCond, eleName, timeout, typeData);
		}

		public void setStomachDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setStomachDateOnset, eleName, timeout, typeData);
		}

		public void setStomachDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setStomachDateTreated, eleName, timeout, typeData);
		}

		public void setStomachStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setStomachStillTaking, timeout, eleName);
		}

		public void setStomachDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setStomachDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Respiratory
		public void setRespiratoryCond(String typeData, int timeout, String eleName) throws IOException{
			// getUtil.acrollIntoView(driver.findElement(setRespiratoryCond), driver);
			adriver.Type(setRespiratoryCond, eleName, timeout, typeData);
		}

		public void setRespiratoryDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setRespiratoryDateOnset, eleName, timeout, typeData);
		}

		public void setRespiratoryDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setRespiratoryDateTreated, eleName, timeout, typeData);
		}

		public void setRespiratoryStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setRespiratoryStillTaking, timeout, eleName);
		}

		public void setRespiratoryDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setRespiratoryDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Prescription
		public void setPrescriptionCond(String typeData, int timeout, String eleName) throws IOException{
			getUtil.acrollIntoView(driver.findElement(setPrescriptionCond), driver);
			adriver.Type(setPrescriptionCond, eleName, timeout, typeData);
		}

		public void setPrescriptionDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPrescriptionDateOnset, eleName, timeout, typeData);
		}

		public void setPrescriptionDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPrescriptionDateTreated, eleName, timeout, typeData);
		}

		public void setPrescriptionStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setPrescriptionStillTaking, timeout, eleName);
		}

		public void setPrescriptionDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPrescriptionDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Pending surgery
		public void setPndngSurgryCond(String typeData, int timeout, String eleName) throws IOException{
			// getUtil.acrollIntoView(driver.findElement(setPndngSurgryCond), driver);
			adriver.Type(setPndngSurgryCond, eleName, timeout, typeData);
		}

		public void setPndngSurgryDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPndngSurgryDateOnset, eleName, timeout, typeData);
		}

		public void setPndngSurgryDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPndngSurgryDateTreated, eleName, timeout, typeData);
		}

		public void setPndngSurgryStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setPndngSurgryStillTaking, timeout, eleName);
		}

		public void setPndngSurgryDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPndngSurgryDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Pending medical treatment or diagnostic testing
		public void setPndgMedTrtmntyCond(String typeData, int timeout, String eleName) throws IOException{
			getUtil.acrollIntoView(driver.findElement(setPndgMedTrtmntyCond), driver);
			adriver.Type(setPndgMedTrtmntyCond, eleName, timeout, typeData);
		}

		public void setPndgMedTrtmntDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPndgMedTrtmntDateOnset, eleName, timeout, typeData);
		}

		public void setPndgMedTrtmntDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPndgMedTrtmntDateTreated, eleName, timeout, typeData);
		}

		public void setPndgMedTrtmntStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setPndgMedTrtmntStillTaking, timeout, eleName);
		}

		public void setPndgMedTrtmntDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPndgMedTrtmntDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Pending hospitalization PndgHostp

		public void setPndgHostpCond(String typeData, int timeout, String eleName) throws IOException{
			getUtil.acrollIntoView(driver.findElement(setPndgHostpCond), driver);
			adriver.Type(setPndgHostpCond, eleName, timeout, typeData);
		}

		public void setPndgHostpDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPndgHostpDateOnset, eleName, timeout, typeData);
		}

		public void setPndgHostpDateTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setPndgHostpDateTreated, eleName, timeout, typeData);
		}

		public void setPndgHostpStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setPndgHostpStillTaking, timeout, eleName);
		}

		public void setPndgHostpDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setPndgHostpDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Muscular Disorder

		public void setMslDisordrCond(String typeData, int timeout, String eleName) throws IOException{
			// getUtil.acrollIntoView(driver.findElement(setMslDisordrCond), driver);
			adriver.Type(setMslDisordrCond, eleName, timeout, typeData);
		}

		public void setMslDisordrDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setMslDisordrDateOnset, eleName, timeout, typeData);
		}

		public void setMslDisordrDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setMslDisordrDateTreated, eleName, timeout, typeData);
		}

		public void setMslDisordrStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setMslDisordrStillTaking, timeout, eleName);
		}

		public void setMslDisordrDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setMslDisordrDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Liver Disease LveDiese

		public void setLveDieseCond(String typeData, int timeout, String eleName) throws IOException{
			getUtil.acrollIntoView(driver.findElement(setLveDieseCond), driver);
			adriver.Type(setLveDieseCond, eleName, timeout, typeData);
		}

		public void setLveDieseDateOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setLveDieseDateOnset, eleName, timeout, typeData);
		}

		public void setLveDieseDateTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setLveDieseDateTreated, eleName, timeout, typeData);
		}

		public void setLveDieseStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setLveDieseStillTaking, timeout, eleName);
		}

		public void setLveDieseDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setLveDieseDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition -Kidney Disorder

		public void setKidnDisorderCond(String typeData, int timeout, String eleName) throws IOException{
			// getUtil.acrollIntoView(driver.findElement(setKidnDisorderCond ), driver);
			adriver.Type(setKidnDisorderCond, eleName, timeout, typeData);
		}

		public void setKidnDisorderOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setKidnDisorderOnset, eleName, timeout, typeData);
		}

		public void seKidnDisorderTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(seKidnDisorderTreated, eleName, timeout, typeData);
		}

		public void setKidnDisorderStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setKidnDisorderStillTaking, timeout, eleName);
		}

		public void setKidnDisorderDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setKidnDisorderDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition -Immune / Autoimmune Disease
		public void setImmDisesCond(String typeData, int timeout, String eleName) throws IOException{
			// getUtil.acrollIntoView(driver.findElement(setImmDisesCond ), driver);
			adriver.Type(setImmDisesCond, eleName, timeout, typeData);
		}

		public void setImmDisesOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setImmDisesOnset, eleName, timeout, typeData);
		}

		public void seImmDisesTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(seImmDisesTreated, eleName, timeout, typeData);
		}

		public void setImmDisesStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setImmDisesStillTaking, timeout, eleName);
		}

		public void setImmDisesDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setImmDisesDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Hospitalization or emergency room visit for serious illness
		// past 5 years
		public void setHostEmrgVistCond(String typeData, int timeout, String eleName) throws IOException{
			// getUtil.acrollIntoView(driver.findElement(setHostEmrgVistCond ), driver);
			adriver.Type(setHostEmrgVistCond, eleName, timeout, typeData);
		}

		public void setHostEmrgVistOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setHostEmrgVistOnset, eleName, timeout, typeData);
		}

		public void seHostEmrgVistTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(seHostEmrgVistTreated, eleName, timeout, typeData);
		}

		public void setHostEmrgVistStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setHostEmrgVistStillTaking, timeout, eleName);
		}

		public void setHostEmrgVistDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setHostEmrgVistDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Currently scheduled for surgery
		public void setCurntlySchedSurgeryCond(String typeData, int timeout, String eleName)throws IOException {
			// getUtil.acrollIntoView(driver.findElement(setCurntlySchedSurgeryCond ),
			// driver);
			adriver.Type(setCurntlySchedSurgeryCond, eleName, timeout, typeData);
		}

		public void setCurntlySchedSurgeryOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setCurntlySchedSurgeryOnset, eleName, timeout, typeData);
		}

		public void setCurntlySchedSurgeryTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setCurntlySchedSurgeryTreated, eleName, timeout, typeData);
		}

		public void setCurntlySchedSurgeryStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setCurntlySchedSurgeryStillTaking, timeout, eleName);
		}

		public void setCurntlySchedSurgeryDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setCurntlySchedSurgeryDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Currently hospitalized or confined in a treatment facility

		public void setCurntkyHospFacilityCond(String typeData, int timeout, String eleName) throws IOException{
			getUtil.acrollIntoView(driver.findElement(setCurntkyHospFacilityCond), driver);
			adriver.Type(setCurntkyHospFacilityCond, eleName, timeout, typeData);
		}

		public void setCurntkyHospFacilityOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setCurntkyHospFacilityOnset, eleName, timeout, typeData);
		}

		public void setCurntkyHospFacilityTreated(String typeData, int timeout, String eleName)throws IOException {
			adriver.Type(setCurntkyHospFacilityTreated, eleName, timeout, typeData);
		}

		public void setCurntkyHospFacilityStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setCurntkyHospFacilityStillTaking, timeout, eleName);
		}

		public void setCurntkyHospFacilityDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setCurntkyHospFacilityDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Currently confined or incapacitated

		public void setCurrentlyIncaptedCond(String typeData, int timeout, String eleName) throws IOException{
			// getUtil.acrollIntoView(driver.findElement(setCurrentlyIncaptedCond ),
			// driver);
			adriver.Type(setCurrentlyIncaptedCond, eleName, timeout, typeData);
		}

		public void setCurrentlyIncaptedOnset(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setCurrentlyIncaptedOnset, eleName, timeout, typeData);
		}

		public void setCurrentlyIncaptedTreated(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setCurrentlyIncaptedTreated, eleName, timeout, typeData);
		}

		public void setCurrentlyIncaptedStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setCurrentlyIncaptedStillTaking, timeout, eleName);
		}

		public void setCurrentlyIncaptedDegRcvry(String typeData, int timeout, String eleName) throws IOException{
			adriver.Type(setCurrentlyIncaptedDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Counseling

		public void setCounselingCond(String typeData, int timeout, String eleName) throws IOException {
			getUtil.acrollIntoView(driver.findElement(setCounselingCond), driver);
			adriver.Type(setCounselingCond, eleName, timeout, typeData);
		}

		public void setCounselingOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setCounselingOnset, eleName, timeout, typeData);
		}

		public void setCounselingTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setCounselingTreated, eleName, timeout, typeData);
		}

		public void setCounselingStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setCounselingStillTaking, timeout, eleName);
		}

		public void setCounselingDegRcvry(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setCounselingDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Condition not on PHQ
		public void setCondNotPHQCond(String typeData, int timeout, String eleName) throws IOException {
			// getUtil.acrollIntoView(driver.findElement(setCondNotPHQCond ), driver);
			adriver.Type(setCondNotPHQCond, eleName, timeout, typeData);
		}

		public void setCondNotPHQOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setCondNotPHQOnset, eleName, timeout, typeData);
		}

		public void setCondNotPHQTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setCondNotPHQTreated, eleName, timeout, typeData);
		}

		public void setCondNotPHQStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setCondNotPHQStillTaking, timeout, eleName);
		}

		public void setCondNotPHQDegRcvry(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setCondNotPHQDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Circulatory System Disease
		public void setCirclatrySysDisesCond(String typeData, int timeout, String eleName) throws IOException {
			getUtil.acrollIntoView(driver.findElement(setCirclatrySysDisesCond), driver);
			adriver.Type(setCirclatrySysDisesCond, eleName, timeout, typeData);
		}

		public void setCirclatrySysDisesOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setCirclatrySysDisesOnset, eleName, timeout, typeData);
		}

		public void setCirclatrySysDisesTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setCirclatrySysDisesTreated, eleName, timeout, typeData);
		}

		public void setCirclatrySysDisesStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setCirclatrySysDisesStillTaking, timeout, eleName);
		}

		public void setCirclatrySysDisesDegRcvry(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setCirclatrySysDisesDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - Circulatory System Disease
		public void setBowelCond(String typeData, int timeout, String eleName) throws IOException {
			getUtil.acrollIntoView(driver.findElement(setBowelCond), driver);
			adriver.Type(setBowelCond, eleName, timeout, typeData);
		}

		public void setBowelOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBowelOnset, eleName, timeout, typeData);
		}

		public void setBowelTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBowelTreated, eleName, timeout, typeData);
		}

		public void setBowelStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setBowelStillTaking, timeout, eleName);
		}

		public void setBowelDegRcvry(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBowelDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - BirthDefects
		public void setBirthDefectsCond(String typeData, int timeout, String eleName) throws IOException {
			// getUtil.acrollIntoView(driver.findElement(setBirthDefectsCond ), driver);
			adriver.Type(setBirthDefectsCond, eleName, timeout, typeData);
		}

		public void setBirthDefectsOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBirthDefectsOnset, eleName, timeout, typeData);
		}

		public void setBirthDefectsTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBirthDefectsTreated, eleName, timeout, typeData);
		}

		public void setBirthDefectsStillTaking(String eleName, int timeout) throws Exception {

			adriver.clickByJs(setBirthDefectsStillTaking, timeout, eleName);
		}

		public void setBirthDefectsDegRcvry(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBirthDefectsDegRcvry, eleName, timeout, typeData);
		}

		// Other Condition - AIDS or HIV+
		public void setAIDSHIVCond(String typeData, int timeout, String eleName) throws IOException {
			getUtil.acrollIntoView(driver.findElement(setBirthDefectsCond), driver);
			adriver.Type(setAIDSHIVCond, eleName, timeout, typeData);
		}

		public void setAIDSHIVOnset(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setAIDSHIVOnset, eleName, timeout, typeData);
		}

		public void setAIDSHIVTreated(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setAIDSHIVTreated, eleName, timeout, typeData);
		}

		public void setAIDSHIVStillTaking(String eleName, int timeout) throws Exception {
			adriver.clickByJs(setAIDSHIVStillTaking, timeout, eleName);

		}

		public void setAIDSHIVDegRcvry(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setAIDSHIVDegRcvry, eleName, timeout, typeData);
		}

		/* Setup Method for PHQ_Registor : 4 Check Condition Details and Medications */
		
		public void setConditionDiagnosis(String typeData, int timeout, String eleName) throws Exception {
			adriver.Type(TextConDia, eleName, timeout, typeData);
		}
		
		public void setBackDisDateOnsett(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBackDisDateOnsett, eleName, timeout, typeData);
		}

		public void selBackDisLastDatTreatedd(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBackDisLastDatTreatedd, eleName, timeout, typeData);
		}
		
		public void setConditionDiagnosiss(String typeData, int timeout, String eleName) throws Exception {
			adriver.Type(TextConDiaa, eleName, timeout, typeData);
		}
		
		public void setBackDisDateOnsettt(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBackDisDateOnsettt, eleName, timeout, typeData);
		}

		public void selBackDisLastDatTreateddd(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(setBackDisLastDatTreateddd, eleName, timeout, typeData);
		}

		

		public void setTrtmentDrugCond1(String eleName, int timeout) throws Exception {
		adriver.click(eleCod1, timeout, eleName);
		adriver.clickByAction(eleValueCod1, timeout, eleName);
		}

		public void setTrtmentDrugCond2(String eleName, int timeout) throws Exception {
		adriver.click(eleCod2, timeout, eleName);
		adriver.clickByAction(eleValueCod2, timeout, eleName);
		}
//
//		public void clickOninfohedricon(String eleName, int timeout) throws Exception {
//			adriver.click(clickOninfohedricon, timeout, eleName);
//		}

		/* Setup Method for PHQ_Registor : 5. Signature and Submission */
		public void clickOnElecSign(String eleName, int timeout) throws Exception {
			getUtil.ScrolldownTillPageEnd(driver);
			adriver.click(clickOnElecSign, timeout, eleName);
		}

		public void clickOnSubmitbtn(String eleName, int timeout) throws Exception {
			adriver.click(clickOnSubmit, timeout, eleName);
		}

		/* Setup Method for PHQ_Registor : Submission Confirmation Text */
		public String verifyRegSubmis(String eleName, int timeout) throws Exception {
			String text = adriver.captureText(verifyRegSubmis, timeout, eleName);
			return text;
		}

		public String verifyUserExistingText(String typeData, int timeout, String eleName) throws Exception {
			String text = adriver.captureText(veriFyExistinguser, 10, "ExistingUser");
			return text;
		}

		// --->if No
		public void clickOnHethInsNo(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnHelInsNo, timeout, eleName);
		}

		// Please provide a reason for waiving coverage:--

		public void selSpusePlan(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnSpusePlan, timeout, eleName);
		}

		public void selNotEligible(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnNotEligible, timeout, eleName);
		}

		public void selWonttCovrg(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnWonttCovrg, timeout, eleName);
		}

		public void selWaitingPriod(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnWaitingPriod, timeout, eleName);
		}

		public void selUnderAnotherPln(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnUnderAnotherPln, timeout, eleName);
		}

		public void textIfAnyDetails(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textArea, eleName, timeout, typeData);
		}

		public void selVeterans(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnVeterans, timeout, eleName);
		}

		public void selMedicare(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnMedicare, timeout, eleName);
		}

		public void selMedicaid(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnMedicaid, timeout, eleName);
		}

		public void selIndividual(String eleName, int timeout) throws Exception {

			adriver.clickByJs(redBtnIndividual, timeout, eleName);
		}

		public void selOtherReason(String eleName, int timeout) throws Exception {
			adriver.clickByJs(redBtnOtherReason, timeout, eleName);
		}

		public void setWaivingDOB(String typeData, int timeout, String eleName) throws IOException {
			adriver.Type(textWaivingDOB, eleName, timeout, typeData);
		}

		public void takeInputFromUser() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Name A,B");
			String user = scan.nextLine();

		}
	}