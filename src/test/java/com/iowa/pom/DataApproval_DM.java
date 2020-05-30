package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataApproval_DM {
	
 public static WebDriver driver;
 
 @FindBy(xpath=("//a[contains(text(),'Approval ')]"))
 private WebElement ApprovalMenu;
 
 @FindBy(xpath=("//a[contains(text(),'Data Approval')]"))
 private WebElement DataApproval;
 
 @FindBy(xpath=("//select[@class='form-control custom-select']"))
 private WebElement PeriodSelectApproval;
 
 @FindBy(xpath=("//table/tbody/tr[1]/td[3]"))
 private WebElement FileNamecheckBeforeApproval;
 
 @FindBy(xpath=("//table/tbody/tr[1]/td[7]"))
 private WebElement FileStatusCheckBeforeApproval;
 
 @FindBy(xpath=("(//div[@class='custom-control custom-checkbox'])[2]"))
 private WebElement ApprovalSelectCheckbox;
 
 @FindBy(xpath=("//button[@class='btn btn-success btn-sm ml-1']"))
 private WebElement ClickApproveButton;
 
 @FindBy(xpath=("//textarea[@id='approvalComments']"))
 private WebElement ApprovalComments;
 
 @FindBy(xpath=("//button[@class='btn btn-blue btn-sm']"))
 private WebElement ApprovalCommentsOK;
 
 @FindBy(xpath=("//input[@placeholder='Search']"))
 private WebElement SearchBox;
 
 @FindBy(xpath=("//table/tbody/tr[4]/td[3]"))
 private WebElement FileNameValidate;
 
 @FindBy(xpath=("//table/tbody/tr[4]/td[7]"))
 private WebElement StatusValidateFinal;

 public DataApproval_DM(WebDriver ldriver) {
	this.driver = ldriver;
	PageFactory.initElements(driver, this);
 }

public WebElement getApprovalMenu() {
	return ApprovalMenu;
}

public WebElement getDataApproval() {
	return DataApproval;
}

public WebElement getPeriodSelectApproval() {
	return PeriodSelectApproval;
}

public WebElement getFileNamecheckBeforeApproval() {
	return FileNamecheckBeforeApproval;
}

public WebElement getFileStatusCheckBeforeApproval() {
	return FileStatusCheckBeforeApproval;
}

public WebElement getApprovalSelectCheckbox() {
	return ApprovalSelectCheckbox;
}

public WebElement getClickApproveButton() {
	return ClickApproveButton;
}

public WebElement getApprovalComments() {
	return ApprovalComments;
}

public WebElement getApprovalCommentsOK() {
	return ApprovalCommentsOK;
}

public WebElement getSearchBox() {
	return SearchBox;
}

public WebElement getFileNameValidate() {
	return FileNameValidate;
}

public WebElement getStatusValidateFinal() {
	return StatusValidateFinal;
}
 
 
}