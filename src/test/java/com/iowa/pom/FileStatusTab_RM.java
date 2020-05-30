package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileStatusTab_RM {
	
 public static WebDriver driver;
 
 @FindBy(tagName = ("select"))
 private WebElement SelectReportDropDown;
 
 @FindBy(xpath=("//p-header[contains(text(),'Lookup Data')]"))
 private WebElement LookUpDataMenu;
 
 @FindBy(xpath=("//select[@id='lookupDataId']"))
 private WebElement SelectLookUpDataLD;
 
 @FindBy(xpath=("//select[@id='lookupFieldId']"))
 private WebElement SelectDataElementTitleLD;
 
 @FindBy(xpath=("//p-header[contains(text(),'Length Validation')]"))
 private WebElement LengthValidationMenu;
 
 @FindBy(xpath=("//select[@id='lengthCondition']"))
 private WebElement LengthConditionLV;
 
 @FindBy(xpath=("//input[@id='lengthValue']"))
 private WebElement LengthValueLV;
 
 @FindBy(xpath=("//p-header[contains(text(),'Not Null')]"))
 private WebElement NotNullMenu;
 
 @FindBy(xpath=("//label[contains(text(),'Not Null')]"))
 private WebElement NotnullCheckbox;
 
 @FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[1]"))
 private WebElement NotNullWarning;
 
 @FindBy(xpath=("//p-header[contains(text(),'Not Blank')]"))
 private WebElement NotBlankMenu;
 
 @FindBy(xpath=("//label[contains(text(),'Not Blank')]"))
 private WebElement NotBlankCheckBox;
 
 @FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[2]"))
 private WebElement NotblankWarning;
 
 @FindBy(xpath=("//button[@class='btn btn-success btn-sm ng-star-inserted']"))
 private WebElement UpdateFileStatus;
 
 @FindBy(xpath=("//button[contains(text(),'Move to Internal Integrity')]"))
 private WebElement clickMoveToInternalIntegrity;
 
 public FileStatusTab_RM(WebDriver ldriver) {
	 this.driver= ldriver;
	 PageFactory.initElements(driver, this);
 }

public WebElement getSelectReportDropDown() {
	return SelectReportDropDown;
}

public WebElement getLookUpDataMenu() {
	return LookUpDataMenu;
}

public WebElement getSelectLookUpDataLD() {
	return SelectLookUpDataLD;
}

public WebElement getSelectDataElementTitleLD() {
	return SelectDataElementTitleLD;
}

public WebElement getLengthValidationMenu() {
	return LengthValidationMenu;
}

public WebElement getLengthConditionLV() {
	return LengthConditionLV;
}

public WebElement getLengthValueLV() {
	return LengthValueLV;
}

public WebElement getNotNullMenu() {
	return NotNullMenu;
}

public WebElement getNotnullCheckbox() {
	return NotnullCheckbox;
}

public WebElement getNotNullWarning() {
	return NotNullWarning;
}

public WebElement getNotBlankMenu() {
	return NotBlankMenu;
}

public WebElement getNotBlankCheckBox() {
	return NotBlankCheckBox;
}

public WebElement getNotblankWarning() {
	return NotblankWarning;
}

public WebElement getUpdateFileStatus() {
	return UpdateFileStatus;
}

public WebElement getClickMoveToInternalIntegrity() {
	return clickMoveToInternalIntegrity;
}
 
 
 
}
