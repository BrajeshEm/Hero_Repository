package com.heroLogin.testCases;

import org.testng.TestNG;

import com.heroGeneralPHQForms.testCases.TC_GenMedicalConditionsTreatments_No__003;

public class TestRunner {

	
	static TestNG testng;
	public static void main(String[] args) {
	
		testng = new TestNG();
		testng.setTestClasses(new Class[] {TC_GenMedicalConditionsTreatments_No__003.class});
		testng.run();
		
	}

}
