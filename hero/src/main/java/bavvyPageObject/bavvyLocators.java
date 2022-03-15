package bavvyPageObject;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class bavvyLocators {
	
	/**
	 * This class will be created for Register Page Object Repository :OR
	 * 
	 * @throws Exception
	 * 
	 */

	public WebDriver driver;
	ActionDriver adriver;

	public bavvyLocators(WebDriver rdriver) {
		adriver = new ActionDriver();
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By userNameText      = By.xpath("//input[@placeholder='Email']");
	By passwordText      = By.xpath("//input[@placeholder='Password']");
	By loginBtn          = By.xpath("//button[normalize-space()='LOGIN']");
	By employerLnk       = By.xpath("//span[normalize-space()='Employers']");
	By addEmployerBtn    = By.xpath("//button[@class='btn-add-employee']");
	By employerNameText  = By.id("EmployerName");
	By saveChangeBtn     = By.cssSelector("button[type='submit']");
	By selOrgPersonaBtn  = By.cssSelector(".nav-link.dropdown-toggle.waves-light");
	By searchText        = By.id("inputInMdBootstrapDropdownOption");
	By erAdminLnk        = By.xpath("//span[normalize-space()='Employer Admins']");
	By AddErAdminBtn     = By.xpath("//button[normalize-space()='ADD EMPLOYER ADMIN']");
	By firstNameText     = By.id("FirstName");
	By lastNameText      = By.id("LastName");
	By emailId           = By.xpath("//input[@id='EmailAddress']");
	By userLnk           = By.xpath("//span[contains(normalize-space(),'Users')]");
	By selOrgPersonaDD   = By.xpath("//a[normalize-space()='Select Organization']");
	By searchUsersText   = By.cssSelector("input[placeholder='Search']");
	By usersGribKababMenu = By.xpath("//div[@class='dropdown']");
	By loginAsEmployeeLnk = By.xpath("//a[normalize-space()='Login As Employee']");
	By confirmBtn         = By.cssSelector(".btn-teal");
	By selIndustry        = By.cssSelector("#IndustryTypeID");
	By selTypeIndustry    = By.xpath("//span[normalize-space()='0111 - Wheat Farming']");
	By addressLin1Text    = By.cssSelector("#OfficeAddressLine1");
	By OfficeCityText     = By.cssSelector("#OfficeCity");
	By stateDD            = By.id("OfficeStateID");
	By zipCodeText        = By.cssSelector("#OfficeZipcode");	
	By countyDD           = By.cssSelector("mdb-select[id='OfficeCountyID'] div[class='single form-control ng-star-inserted']");
	



	public void  login(String user,String pswrd) throws Exception {
	driver.get("http://stage.bavvy.com/login");
	Thread.sleep(5000);
	adriver.Type(userNameText,"username",5,user);
	adriver.Type(passwordText,"password",5,pswrd);
	adriver.click(loginBtn, 5, "Login");
	}
	
	
	public void addEmployer(String erName) throws Exception
	{
		adriver.click(employerLnk, 	10, "Employer");
		
		adriver.click(addEmployerBtn, 10, "AddEmployer");
		
		adriver.Type(employerNameText, "Employer Name", 10, erName);
	
		//adriver.click(saveChangeBtn, 10, "Save Changes");
	}
	
	public void addEmployerAdmin(String erSearch,String erAdminEmail) throws Exception
	{
		adriver.click(selOrgPersonaBtn, 5, "Select Organization");
		adriver.Type(searchText, "search employer", 5, erSearch);
		driver.findElement(searchText).sendKeys(Keys.ENTER);
		adriver.click(By.xpath("//a[normalize-space()='"+erSearch+" (ER)']"), 5, erSearch);
		adriver.click(erAdminLnk, 5, "ER Admin");
		adriver.click(AddErAdminBtn, 5, "Add ER Admin");
		adriver.Type(firstNameText, "First Name", 5, "Brajesh");
		adriver.Type(lastNameText, "Last Name", 5, "Kumar");
		adriver.Type(emailId, "Email Address", 5, erAdminEmail);
		Thread.sleep(3000);
		adriver.click(saveChangeBtn, 5, "Save and continue");
		Thread.sleep(3000);
		adriver.click(saveChangeBtn, 5, "Save and continue");
		
	}
	
	public void updateEmployerProfile(String erName, String stateName, String zipCode, String county) throws Exception {
		
		adriver.click(selOrgPersonaBtn, 5, "Select Organization");
		adriver.click(selOrgPersonaDD, 5,  "Select Organization default");
		adriver.click(userLnk, 5, "Users");
		adriver.Type(searchUsersText, erName, 5, erName);
		driver.findElement(searchUsersText).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		adriver.click(usersGribKababMenu, 5, "Kabab Menu");
		adriver.click(loginAsEmployeeLnk, 5, "Login As Employee");
		adriver.click(confirmBtn, 5, "Confirm");
		adriver.click(selIndustry, 5, "Industry");
		adriver.click(selTypeIndustry, 5, "0111 - Wheat Farming");
		adriver.click(OfficeCityText, 5, "alaska city");
		adriver.Type(OfficeCityText, "City", 5, "alaska city");
		adriver.click(stateDD, 5, "State");
		adriver.click(By.xpath("//span[normalize-space()='"+stateName+"']"), 5, "stateName");
		adriver.Type(zipCodeText, "Zip Code", 5, zipCode);
		adriver.click(countyDD, 5, "County");
		adriver.click(By.xpath("//span[normalize-space()='"+county+"']"), 5, county);
		adriver.click(saveChangeBtn, 5, "Save Changes");
		
	}
}
