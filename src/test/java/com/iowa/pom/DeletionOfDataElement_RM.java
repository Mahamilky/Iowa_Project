package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletionOfDataElement_RM {
	
 public static WebDriver driver;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[1]"))
 private WebElement DeleteDataElement1;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[2]"))
 private WebElement DeleteDataElement2;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[3]"))
 private WebElement DeleteDataElement3;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[4]"))
 private WebElement DeleteDataElement4;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[5]"))
 private WebElement DeleteDataElement5;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[6]"))
 private WebElement DeleteDataElement6;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[7]"))
 private WebElement DeleteDataElement7;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[8]"))
 private WebElement DeleteDataElement8;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[9]"))
 private WebElement DeleteDataElement9;
 
 @FindBy(xpath=("(//a[@class='text-decoration-underline'])[10]"))
 private WebElement DeleteDataElement10;
 
 @FindBy(xpath=("//button[contains(@class,'btn btn-info btn-sm ng-star-inserted')]"))
 private WebElement DeleteButton;
 
 @FindBy(xpath=("//button[contains(@class,'swal2-confirm swal2-styled')]"))
 private WebElement ConfirmDeleteButton;
 
 @FindBy(xpath=("//button[contains(@class,'swal2-confirm swal2-styled')]"))
 private WebElement OKButtonClick;
 
 public DeletionOfDataElement_RM(WebDriver ldriver) {
	 this.driver = ldriver;
	 PageFactory.initElements(driver, this);
 }

public WebElement getDeleteDataElement1() {
	return DeleteDataElement1;
}

public WebElement getDeleteDataElement2() {
	return DeleteDataElement2;
}

public WebElement getDeleteDataElement3() {
	return DeleteDataElement3;
}

public WebElement getDeleteDataElement4() {
	return DeleteDataElement4;
}

public WebElement getDeleteDataElement5() {
	return DeleteDataElement5;
}

public WebElement getDeleteDataElement6() {
	return DeleteDataElement6;
}

public WebElement getDeleteDataElement7() {
	return DeleteDataElement7;
}

public WebElement getDeleteDataElement8() {
	return DeleteDataElement8;
}

public WebElement getDeleteDataElement9() {
	return DeleteDataElement9;
}

public WebElement getDeleteDataElement10() {
	return DeleteDataElement10;
}

public WebElement getDeleteButton() {
	return DeleteButton;
}

public WebElement getConfirmDeleteButton() {
	return ConfirmDeleteButton;
}

public WebElement getOKButtonClick() {
	return OKButtonClick;
}
 
 
}
