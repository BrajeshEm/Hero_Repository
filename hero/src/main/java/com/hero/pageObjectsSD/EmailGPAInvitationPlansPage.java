package com.hero.pageObjectsSD;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hero.config.ActionDriver;
import com.hero.utilities.getUtil;

public class EmailGPAInvitationPlansPage {
/**
* This class will be created for Restistor Page Object Reprository :OR
*
* @throws Exception
*
*/

public WebDriver driver;
ActionDriver adriver ;
public EmailGPAInvitationPlansPage(WebDriver rdriver) {
adriver = new ActionDriver();
driver = rdriver;
PageFactory.initElements(rdriver, this);
}

// Click on Email GPA invitation /
By entryUW = By.xpath("//div[@data-url='tiles/typography.html']//div[@class='widget_content']");
By clickOnEmailGpaInvi = By.xpath("//a[contains(text(),'Email GPA Invitation')]");
By clickOnSearch = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[1]/div[2]/div[1]/div[1]/label[1]/input[1]");
By setGeneral = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[1]/div[2]/div[1]/div[1]/label[1]/input[1]");
By clickOnSearchIcon = By.xpath("//body/div[@id='container']/div[7]/section[1]/div[1]/div[2]/div[1]/div[1]/a[1]");
By clickOnGeneralPHQ =By.xpath("//a[contains(text(),'General PHQ')]");
By clickOnGeneralGHQ = By.xpath("//tbody/tr[4]/td[1]/div[1]/a[1]");
By FromContactText = By.id("FromContact");
By ToContactText = By.id("ToContact");
By CCContactText = By.id("CCContact");
By SubjectText = By.id("Subject");
By fileUplod = By.xpath("//input[@id='filename']");
By emailSentConfirmText = By.xpath("//div[contains(text(),'Email sent successfully.')]");
By sendBtn        = By.xpath("//input[@type='submit']");





// Setup Method for Email GPA invitation : /
getUtil get = new getUtil(driver);

public void clickOnentryUW(String eleName, int timeout) throws Exception {
adriver.click(entryUW, timeout, eleName);
}


public void clickOnEmailGpaInvitation(String eleName, int timeOut) throws Exception {
adriver.click(clickOnEmailGpaInvi,timeOut, eleName);
}
public void clickOnSearch(String eleName, int timeOut) throws Exception {
adriver.click(clickOnSearch, timeOut, eleName);
}
public void setOnSearch(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(setGeneral, eleName, timeOut,typeData);
}
public void clickOnSearchIcon(String eleName, int timeOut) throws Exception {
adriver.click(clickOnSearchIcon, timeOut, eleName);
}
public void clickOnGenPHQ(String eleName, int timeOut) throws Exception {
adriver.click(clickOnGeneralPHQ, timeOut, eleName);
}
public void clickOnGeneralGHQ(String eleName, int timeOut) throws Exception {
adriver.click(clickOnGeneralGHQ, timeOut, eleName );
}

public void setEmailFrom(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(FromContactText, eleName, timeOut,typeData);
}

public void setEmailTo(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(ToContactText, eleName, timeOut,typeData);
}

public void setEmailCC(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(CCContactText, eleName, timeOut,typeData);
}

public void setEmailSubject(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(SubjectText, eleName, timeOut,typeData);
}

public void emailAttachementUpload(String eleName, int timeOut,String typeData) throws Exception {
adriver.Type(fileUplod, eleName, timeOut,typeData);
}

public void emailSentSuccessMsgeVal(String eleName, int timeOut,String expectedOutput) throws Exception {
adriver.textValidation(emailSentConfirmText, expectedOutput, timeOut, eleName);
}

public void sendButtonClick(String eleName, int timeOut) throws Exception {
adriver.clickByJs(sendBtn, timeOut, eleName);
}

}
