package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class ValidationCheckPageCurv {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public ValidationCheckPageCurv(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// ValidationCheck /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By startq = By.xpath("//input[@value='START QUOTE']");
By saveAndContinue = By.xpath("//input[@value='Save & Continue']");
By eleText = By.xpath("//span[contains(text(),'Please enter Company Name')]");
By eleText2 = By.xpath("//span[contains(text(),'Please select PEO/Assoc./Trust')]");
By eleText3 = By.xpath("//span[contains(text(),'Please enter Number of benefit eligible EEs')]");
By eleText4 = By.xpath("//span[contains(text(),'Please select current health carrier')]");
By eleText5 = By.xpath("//span[contains(text(),'Please enter Effective Date')]");
By eleText6 = By.xpath("//span[contains(text(),'Please select City')]");
By eleText7 = By.xpath("//span[contains(text(),'Please select state.')]");
By eleText8 = By.xpath("//span[contains(text(),'Please enter Zip Code')]");






getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}
public void clickOnentrySQ(String eleName, int timeout) throws Exception {
adriver.click(startq, timeout, eleName);
}
public void clickOnSave(String eleName, int timeout) throws Exception {
	getUtil.ScrolldownTillPageEnd(driver);
adriver.click(saveAndContinue, timeout, eleName);
}
public void valTextMsgeCompName(String expectedOutput,String eleName, int timeOut) throws Exception {
	adriver.textValidation(eleText, expectedOutput, timeOut, eleName);
}
public void valTextMsgePeoName(String expectedOutput,String eleName, int timeOut) throws Exception {
	adriver.textValidation(eleText2, expectedOutput, timeOut, eleName);
}
public void valTextMsgeNumberOfEes(String expectedOutput,String eleName, int timeOut) throws Exception {
	adriver.textValidation(eleText3, expectedOutput, timeOut, eleName);
}
public void valTextMsgeCurrentHealth(String expectedOutput,String eleName, int timeOut) throws Exception {
	adriver.textValidation(eleText4, expectedOutput, timeOut, eleName);
}
public void valTextMsgeEffectiveDate(String expectedOutput,String eleName, int timeOut) throws Exception {
	adriver.textValidation(eleText5, expectedOutput, timeOut, eleName);
}
public void valTextMsgeCity(String expectedOutput,String eleName, int timeOut) throws Exception {
	adriver.textValidation(eleText6, expectedOutput, timeOut, eleName);
}
public void valTextMsgeState(String expectedOutput,String eleName, int timeOut) throws Exception {
	adriver.textValidation(eleText7, expectedOutput, timeOut, eleName);
}
public void valTextMsgeZipCode(String expectedOutput,String eleName, int timeOut) throws Exception {
	adriver.textValidation(eleText8, expectedOutput, timeOut, eleName);
}
}





