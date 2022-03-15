package bavvyTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class AlertDemo {
	
	int myNum = 5;               // Integer (whole number)
	//float myFloatNum = 5.99;     // Floating point number
	double myDoubleNum = 9.98;   // Floating point number
	char myLetter = 'D';         // Character
	boolean myBoolean = true;       // Boolean
	String myText = "Hello";     // String
	
	
	@Test
	public  void  alertDemoTest() throws InterruptedException  {									
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
        
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
       driver.findElement(By.name("submit")).click();	
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println("Alert1 Text Print: - "+alertMessage);	
        Thread.sleep(5000);
        		
   // alert.sendKeys("dshfhdh");
        // Accepting alert		
        alert.accept();
        String alertMessage1= driver.switchTo().alert().getText();	
        System.out.println("Alert2 Text Print: - "+alertMessage1);	
        Thread.sleep(5000);
        alert.accept();
        driver.quit();
        
        System.out.println("Alert2 Text Print: - "+myNum+" ,double :- "+myDoubleNum);	
    }	

}