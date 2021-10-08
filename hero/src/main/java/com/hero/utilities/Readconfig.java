   package com.hero.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.testng.annotations.Test;


public class Readconfig {

	public static Properties pro;
	public Readconfig() {
		File scr = new File("./Configuration/Config.properties");

		try {
			if(scr.exists())
			{
				FileInputStream fis = new FileInputStream(scr);
				pro = new Properties();
				pro.load(fis);
				fis.close();
			}
			else System.out.println("File Not Found");
			
		} catch (Exception e) {

			System.out.println("Exception is.... " + e.getMessage());
		}
	}
	
	public  String getApplicationURL()
	{
		String url = pro.getProperty("BaseURL");
		return url;
	}
	
	public  String getApplicationURLGHQ()
	{
		String url = pro.getProperty("BaseURLGHQ");
		return url;
	}
	
	public  String getApplicationURLGenaralPHQ()
	{
		String url = pro.getProperty("BaseURLGeneralPHQ");
		return url;
	}
	
	public  String getApplicationURLIowaPHQ()
	{
		String url = pro.getProperty("BaseURLIowaPHQ");
		return url;
	}
	
	public  String getApplicationURLUthaPHQ()
	{
		String url = pro.getProperty("BaseURLUthaPHQ");
		return url;
	}
	

	public  String getApplicationURLArizonaPHQ()
	{
		String url = pro.getProperty("BaseURLArizonaPHQ");
		return url;
	}
	
	public  String getApplicationURLMichiganPHQ()
	{
		String url = pro.getProperty("BaseURLMichiganPHQ");
		return url;
	}
	
	public static String getApplicationUserName()
	{
		String Uname = pro.getProperty("uname");
		return Uname;
	}
	public  static String getApplicationPassword()
	{
		String Pwrd = pro.getProperty("pswrd");
		return Pwrd;
	}
	public static String getApplicationUserName1()
	{
		String Uname = pro.getProperty("uname1");
		return Uname;
	}
	public  static String getApplicationPassword1()
	{
		String Pwrd = pro.getProperty("pswrd1");
		return Pwrd;
	}
	public  String getFirfoxPath()
	{
		String FirfocPath = pro.getProperty("FirfoxPath");
		return FirfocPath;
	}
	public  String getChromePath()
	{
		String ChromePath = pro.getProperty("ChromePath");
		return ChromePath;
	}
	public  String getIePath()
	{
		String IePath = pro.getProperty("IePath");
		
		return IePath;
	}
	public  String getBrowserPath()
	{
		String Browser = pro.getProperty("Browser");
		
		return Browser;
	}
	@Test
	public void Check()
	{
		String br = pro.getProperty("FirfoxPath");
		System.out.println(br);
	}
	
}
