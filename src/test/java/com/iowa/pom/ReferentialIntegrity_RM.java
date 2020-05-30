package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReferentialIntegrity_RM {

	public static WebDriver driver;
	
	@FindBy(xpath=("//p-header[contains(text(),'Constraint Check')]"))
	private WebElement ConstraintCheckMenu;
	
	@FindBy(xpath=("(//input[@id='ruleName'])[1]"))
	private WebElement RuleNameCC;
	
	@FindBy(xpath=("(//select[@id='selectField'])[1]"))
	private WebElement DataElementTitleCC;
	
	@FindBy(xpath=("(//select[@id='condition'])[5]"))
	private WebElement ConditionCC;
	
	@FindBy(xpath=("(//select[@id='selectReport'])[2]"))
	private WebElement SelectCompareReportCC;
	
	@FindBy(xpath=("(//select[@id='selectField'])[2]"))
	private WebElement DataElementCompareCC;
	
	@FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[9]"))
	private WebElement WarningCompareCC;
	
	@FindBy(xpath=("(//button[contains(text(),'Save')])[7]"))
	private WebElement SaveConstraintCheck;
	
	@FindBy(xpath=("//p-header[contains(text(),'Value Check')]"))
	private WebElement ValueCheckMenu;
	
	@FindBy(xpath=("(//input[@id='ruleName'])[2]"))
	private WebElement RuleNameVC;
	
	@FindBy(xpath=("//select[@id='selectMaster']"))
	private WebElement LookUpAttributeVC;
	
	@FindBy(xpath=("(//select[@id='compareReport'])[1]"))
	private WebElement CompareReportVC;
	
	@FindBy(xpath=("//select[@id='selectMaster2']"))
	private WebElement LookUpAttributeVC2;
	
	@FindBy(xpath=("(//select[@id='selectReport'])[4]"))
	private WebElement SelectReportVCIF;
	
	@FindBy(xpath=("(//select[@id='selectField'])[3]"))
	private WebElement DataElementTitleVCIF;
	
	@FindBy(xpath=("(//select[@id='condition'])[6]"))
	private WebElement ConditionVCIF;
	
	@FindBy(xpath=("(//input[@id='value5'])[1]"))
	private WebElement ValueVCIF;
	
	@FindBy(xpath=("(//select[@id='condition'])[7]"))
	private WebElement ConditionVCTHEN;
	
	@FindBy(xpath=("(//input[@id='value5'])[2]"))
	private WebElement ValueVCTHEN;
	
	@FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[10]"))
	private WebElement WarningVCTHEN;
	
	@FindBy(xpath=("(//button[contains(text(),'Save')])[8]"))
	private WebElement SaveValueCheck;
	
	@FindBy(xpath=("(//p-header[contains(text(),'Query Builder')])[2]"))
	private WebElement QueryBuilderMenuRI;
	
	@FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[11]"))
	private WebElement WarningQBRI;
	
	@FindBy(xpath=("(//input[@id='ruleName'])[3]"))
	private WebElement RuleNameQBRI;
	
	@FindBy(xpath=("(//span[@class='ui-multiselect-label ui-corner-all'])[1]"))
	private WebElement LookUpAttributeQBRI;
	
	@FindBy(xpath=("(//select[@id='compareReport'])[2]"))
	private WebElement CompareReportQBRI;
	
	@FindBy(xpath=("(//span[@class='ui-multiselect-label ui-corner-all'])[2]"))
	private WebElement LookUpAttribute2QBRI;
	
	@FindBy(xpath=("(//select[@id='condition'])[8]"))
	private WebElement SQLJoinQBRI;
	
	@FindBy(xpath=("(//textarea[@id='exampleFormControlTextarea1'])[1]"))
	private WebElement TextArea1QBRI;
	
	@FindBy(xpath=("(//textarea[@id='exampleFormControlTextarea1'])[2]"))
	private WebElement Textarea2QBRI;
	
	@FindBy(xpath=("(//button[contains(text(),'Validate Query')])[2]"))
	private WebElement ValidatequeryQBRI;
	
	@FindBy(xpath=("//textarea[@id='exampleFormControlTextarea3']"))
	private WebElement DescriptionQBRI;
	
	@FindBy(xpath=("(//button[contains(text(),'Save')])[9]"))
	private WebElement SaveQBRI;
	
	@FindBy(xpath=("//button[contains(text(),'Move to Summary')]"))
	private WebElement MovetoSummaryButton;
	
	@FindBy(xpath=("(//span[contains(text(),'Referential Integrity')])[2]"))
	private WebElement ReferentialIntegrityTab;
	
	@FindBy(xpath=("//button[contains(text(),'Done')]"))
	private WebElement DoneButton;
	
	public ReferentialIntegrity_RM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConstraintCheckMenu() {
		return ConstraintCheckMenu;
	}

	public WebElement getRuleNameCC() {
		return RuleNameCC;
	}

	public WebElement getDataElementTitleCC() {
		return DataElementTitleCC;
	}

	public WebElement getConditionCC() {
		return ConditionCC;
	}

	public WebElement getSelectCompareReportCC() {
		return SelectCompareReportCC;
	}

	public WebElement getDataElementCompareCC() {
		return DataElementCompareCC;
	}

	public WebElement getWarningCompareCC() {
		return WarningCompareCC;
	}

	public WebElement getSaveConstraintCheck() {
		return SaveConstraintCheck;
	}

	public WebElement getValueCheckMenu() {
		return ValueCheckMenu;
	}

	public WebElement getRuleNameVC() {
		return RuleNameVC;
	}

	public WebElement getLookUpAttributeVC() {
		return LookUpAttributeVC;
	}

	public WebElement getCompareReportVC() {
		return CompareReportVC;
	}

	public WebElement getLookUpAttributeVC2() {
		return LookUpAttributeVC2;
	}

	public WebElement getSelectReportVCIF() {
		return SelectReportVCIF;
	}

	public WebElement getDataElementTitleVCIF() {
		return DataElementTitleVCIF;
	}

	public WebElement getConditionVCIF() {
		return ConditionVCIF;
	}

	public WebElement getValueVCIF() {
		return ValueVCIF;
	}

	public WebElement getConditionVCTHEN() {
		return ConditionVCTHEN;
	}

	public WebElement getValueVCTHEN() {
		return ValueVCTHEN;
	}

	public WebElement getWarningVCTHEN() {
		return WarningVCTHEN;
	}

	public WebElement getSaveValueCheck() {
		return SaveValueCheck;
	}

	public WebElement getQueryBuilderMenuRI() {
		return QueryBuilderMenuRI;
	}

	public WebElement getWarningQBRI() {
		return WarningQBRI;
	}

	public WebElement getRuleNameQBRI() {
		return RuleNameQBRI;
	}

	public WebElement getLookUpAttributeQBRI() {
		return LookUpAttributeQBRI;
	}

	public WebElement getCompareReportQBRI() {
		return CompareReportQBRI;
	}

	public WebElement getLookUpAttribute2QBRI() {
		return LookUpAttribute2QBRI;
	}

	public WebElement getSQLJoinQBRI() {
		return SQLJoinQBRI;
	}

	public WebElement getTextArea1QBRI() {
		return TextArea1QBRI;
	}

	public WebElement getTextarea2QBRI() {
		return Textarea2QBRI;
	}

	public WebElement getValidatequeryQBRI() {
		return ValidatequeryQBRI;
	}

	public WebElement getDescriptionQBRI() {
		return DescriptionQBRI;
	}

	public WebElement getSaveQBRI() {
		return SaveQBRI;
	}

	public WebElement getMovetoSummaryButton() {
		return MovetoSummaryButton;
	}

	public WebElement getReferentialIntegrityTab() {
		return ReferentialIntegrityTab;
	}

	public WebElement getDoneButton() {
		return DoneButton;
	}
	
}
