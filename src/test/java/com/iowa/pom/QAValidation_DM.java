package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAValidation_DM {

	public static WebDriver driver;

	@FindBy(xpath = ("//a[contains(text(),'QA Validation')]"))
	private WebElement QAValidation;

	@FindBy(xpath = ("//h6[contains(text(),'QA Validation ')]"))
	private WebElement ValidateQAValidationPage;

	@FindBy(xpath = ("//select[@class='form-control custom-select']"))
	private WebElement SelectPeriodQAValidation;

	@FindBy(xpath = ("//button[contains(text(),'Validate')]"))
	private WebElement ValidateButton;

	@FindBy(xpath = ("//button[contains(text(),'Approve')]"))
	private WebElement ApproveButton;

	@FindBy(xpath = ("(//div[@class='custom-control custom-radio '])[1]"))
	private WebElement SelectforValidate;

	@FindBy(xpath = ("//button[contains(text(),'Send to IDE')]"))
	private WebElement ClickSendToIDE;

	@FindBy(xpath = ("//button[@class='swal2-confirm swal2-styled']"))
	private WebElement OKButtonSendToIDE;

	public QAValidation_DM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQAValidation() {
		return QAValidation;
	}

	public WebElement getValidateQAValidationPage() {
		return ValidateQAValidationPage;
	}

	public WebElement getSelectPeriodQAValidation() {
		return SelectPeriodQAValidation;
	}

	public WebElement getValidateButton() {
		return ValidateButton;
	}

	public WebElement getApproveButton() {
		return ApproveButton;
	}

	public WebElement getSelectforValidate() {
		return SelectforValidate;
	}

	public WebElement getClickSendToIDE() {
		return ClickSendToIDE;
	}

	public WebElement getOKButtonSendToIDE() {
		return OKButtonSendToIDE;
	}

}
