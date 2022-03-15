package bavvyTestCases;

import org.testng.annotations.Test;
import com.hero.config.StartBrowser;
import bavvyPageObject.bavvyLocators;



public class bavvyTestCases extends StartBrowser {

    @Test	
	public void bavvyTest() throws Exception {

		StartBrowser.test = StartBrowser.test.createNode("Login to Application");
		bavvyLocators bavvy = new bavvyLocators(driver);
		
		bavvy.login("bavvyadmin@bavvvy.com", "2wsx@WSX!");
		
		bavvy.addEmployer("ichra32");
//		bavvy.addEmployerAdmin("ichra31", "ichraa32@eradmin.com");
//		
//		bavvy.updateEmployerProfile("ichraa32@eradmin.com","Alaska","36006","Autauga");
//		Thread.sleep(8000);
		
	}
}
