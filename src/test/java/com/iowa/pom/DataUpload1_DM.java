package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataUpload1_DM {
	
	public static WebDriver driver;
	
	@FindBy(xpath=("//th[@class='text-center ng-star-inserted']"))
	private WebElement SelectallCheckBox;
	
	@FindBy(xpath=("(//th[@class='text-center'])[6]"))
	private WebElement IISelectAllCheckbox;
	
	@FindBy(xpath=("//button[contains(text(),'Validate Referential Integrity')]"))
	private WebElement ValidateReferentialIntegrity;
	
	
	
	public DataUpload1_DM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectallCheckBox() {
		return SelectallCheckBox;
	}

	public WebElement getIISelectAllCheckbox() {
		return IISelectAllCheckbox;
	}

	public WebElement getValidateReferentialIntegrity() {
		return ValidateReferentialIntegrity;
	}

	


}
