package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataUpload_DM {
	
	public static WebDriver driver;
	
	@FindBy(xpath=("//span[@class='ui-fileupload-choose ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left']"))
	private WebElement ChooseFile;
	
	@FindBy(xpath=("(//span[contains(text(),'Upload')])[2]"))
	private WebElement ClickUpload;
	
	@FindBy(xpath=("//button[contains(text(),'Validate Internal Integrity')]"))
	private WebElement ValidateInternalIntegrity;
	
	@FindBy(xpath=("(//small[contains(text(),'Completed')])[1]"))
	private WebElement ValidateFileComplete1;

	
	public DataUpload_DM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getChooseFile() {
		return ChooseFile;
	}


	public WebElement getClickUpload() {
		return ClickUpload;
	}


	public WebElement getValidateInternalIntegrity() {
		return ValidateInternalIntegrity;
	}

}
