package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataUploadSummary_DM {

	public static WebDriver driver;

	@FindBy(xpath = ("(//div[contains(@class,'custom-control custom-radio')])[3]"))
	private WebElement clickRadioButtonRI1;

	@FindBy(xpath = ("(//div[contains(@class,'custom-control custom-radio')])[4]"))
	private WebElement clickRadioButtonRI2;

	@FindBy(xpath = ("(//div[contains(@class,'custom-control custom-radio')])[5]"))
	private WebElement clickRadioButtonRI3;

	@FindBy(xpath = ("(//div[contains(@class,'custom-control custom-radio')])[6]"))
	private WebElement clickRadioButtonRI4;

	@FindBy(xpath = ("//button[contains(text(),'View and Validate Summary')]"))
	private WebElement ViewAndValidateSummary;

	@FindBy(xpath = ("//a[@class='text-decoration-underline report-btn']"))
	private WebElement SummaryReportClick;

	@FindBy(xpath = ("//button[@class='btn btn-blue threshold-btn']"))
	private WebElement SummaryReportconfimButton;

	@FindBy(xpath = ("//textarea[@id='exampleFormControlTextarea1']"))
	private WebElement CommentsTextSummary;

	@FindBy(xpath = ("//button[contains(text(),'Submit')]"))
	private WebElement SubmitButtonSummary;

	@FindBy(xpath = ("//button[@class='swal2-confirm swal2-styled']"))
	private WebElement OKforQAApproval;

	@FindBy(xpath = ("(//span[contains(text(),'Referential Integrity')])[1]"))
	private WebElement ReferentialIntegrityTab;

	public DataUploadSummary_DM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickRadioButtonRI1() {
		return clickRadioButtonRI1;
	}

	public WebElement getClickRadioButtonRI2() {
		return clickRadioButtonRI2;
	}

	public WebElement getClickRadioButtonRI3() {
		return clickRadioButtonRI3;
	}

	public WebElement getClickRadioButtonRI4() {
		return clickRadioButtonRI4;
	}

	public WebElement getViewAndValidateSummary() {
		return ViewAndValidateSummary;
	}

	public WebElement getSummaryReportClick() {
		return SummaryReportClick;
	}

	public WebElement getSummaryReportconfimButton() {
		return SummaryReportconfimButton;
	}

	public WebElement getCommentsTextSummary() {
		return CommentsTextSummary;
	}

	public WebElement getSubmitButtonSummary() {
		return SubmitButtonSummary;
	}

	public WebElement getOKforQAApproval() {
		return OKforQAApproval;
	}

	public WebElement getReferentialIntegrityTab() {
		return ReferentialIntegrityTab;
	}

}
