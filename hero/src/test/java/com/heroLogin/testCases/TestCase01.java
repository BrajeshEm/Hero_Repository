package com.heroLogin.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hero.config.ActionDriver;
import com.hero.config.StartBrowser;

public class TestCase01 extends com.hero.config.StartBrowser {

	@Test
	public void verifyTitle() throws IOException
	{
		StartBrowser.test = StartBrowser.test.createNode("Navigate to Home Page1");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		
		
		String Title = driver.getTitle();
		System.out.println(Title);
		test.info("Ham");
		boolean equals = test.equals(Title.equals("Google"));
		test.info("Kya");
		test.info("Kyaaa");
		
		
	}
	@Test(priority=2)
	public void txtGoogleSearch() throws IOException
	{
		StartBrowser.test = StartBrowser.test.createNode("Navigate to Home Page2");
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		
		String actualSeartch = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).getText();
		
		if(actualSeartch.equals("google"))
			Assert.assertTrue(true);
		else
			test.fail("TestCaseFailed");
			
		System.out.println("Title not match test case fail");
		test.fail("Result:");
	test.warning(" Dey Did The Raam....!!!!");
	Assert.assertTrue(false);
	
		
	}
}

	

