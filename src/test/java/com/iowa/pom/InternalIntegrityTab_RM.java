package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternalIntegrityTab_RM {

	public static WebDriver driver;
	
	@FindBy(xpath=("//p-header[contains(text(),'Accepted Range')]"))
	private WebElement AcceptedRangeMenu;
	
	@FindBy(xpath=("//input[@id='from']"))
	private WebElement AcceptedRangeFrom;
	
	@FindBy(xpath=("(//input[@name='from'])[1]"))
	private WebElement AcceptedRangeFromBirth1;
	
	@FindBy(xpath=("(//input[@class='form-control d-inline date-calendar ng-untouched ng-pristine ng-invalid ng-star-inserted'])[1]"))
	private WebElement AcceptedRangeToBirth1;
	
	@FindBy(xpath=("(//button[@class='dp-nav-header-btn'])[1]"))
	private WebElement MOnthYearBirth1From;
	
	@FindBy(xpath=("(//button[@class='dp-nav-header-btn'])[2]"))
	private WebElement AcceptedRangeMOnthYearBirth1To;
	
	@FindBy(xpath=("(//button[@class='dp-calendar-nav-left'])[1]"))
	private WebElement PreviousButtonFromBirth1;
	
	@FindBy(xpath=("(//button[@class='dp-calendar-nav-left'])[2]"))
	private WebElement AcceptedRangePreviousButtonTo;
	
	@FindBy(xpath=("(//button[contains(text(),'01')])[1]"))
	private WebElement DateFromBirth1;
	
	@FindBy(xpath=("(//button[contains(text(),'01')])[3]"))
	private WebElement DateAcceptedRangeFromTo;
	
	@FindBy(xpath=("//input[@id='to']"))
	private WebElement AcceptedRangeTo;
	
	@FindBy(xpath=("//label[contains(text(),'Include')]"))
	private WebElement AcceptedRangeInclude;
	
	@FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[3]"))
	private WebElement AcceptedRangeWarning;
	
	@FindBy(xpath=("(//button[contains(text(),'Save')])[1]"))
	private WebElement AcceptedRangeSave;
	
	@FindBy(xpath=("//p-header[contains(text(),'Accepted Value')]"))
	private WebElement AcceptedValueMenu;
	
	@FindBy(xpath=("//select[@id='acceptvaluehCondition']"))
	private WebElement AcceptedValueCondition;
	
	@FindBy(xpath=("(//input[@id='value'])[1]"))
	private WebElement AcceptedValueVal;
	
	@FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[4]"))
	private WebElement AcceptedValueWarning;
	
	@FindBy(xpath=("(//button[contains(text(),'Save')])[2]"))
	private WebElement AcceptedValueSave;
	
	@FindBy(xpath=("//p-header[contains(text(),'Conditional Value')]"))
	private WebElement ConditionalValueMenu;
	
	@FindBy(xpath=("//select[@id='fieldName']"))
	private WebElement DataElementIFCV;
	
	@FindBy(xpath=("(//select[@id='condition'])[1]"))
	private WebElement ConditionIFCV;
	
	@FindBy(xpath=("//input[@id='integrityValue']"))
	private WebElement ValueIFCV;
	
	@FindBy(xpath=("(//select[@id='condition'])[2]"))
	private WebElement ConditionTHENCV;
	
	@FindBy(xpath=("(//input[@name='value'])[2]"))
	private WebElement ValueTHENCV;
	
	@FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[5]"))
	private WebElement ConditionalValueTHENWarning;
	
	@FindBy(xpath=("(//button[contains(text(),'Save')])[3]"))
	private WebElement ConditionalValueSave;
	
	@FindBy(xpath=("(//select[@id='condition'])[3]"))
	private WebElement ConditionCompareCV;
	
	@FindBy(xpath=("//select[@id='compareFieldId']"))
	private WebElement DataElementSelectCompareCV;
	
	@FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[6]"))
	private WebElement CompareWarningCV;
	
	@FindBy(xpath=("(//button[contains(text(),'Save')])[4]"))
	private WebElement CompareSaveCV;
	
	@FindBy(xpath=("//p-header[contains(text(),'Pattern Matching')]"))
	private WebElement PatternMatchingMenu;
	
	@FindBy(xpath=("//input[@id='start']"))
	private WebElement StartPositionPM;
	
	@FindBy(xpath=("//input[@id='end']"))
	private WebElement EndPositionPM;
	
	@FindBy(xpath=("(//select[@id='condition'])[4]"))
	private WebElement ConditionPM;
	
	@FindBy(xpath=("//select[@id='inputType']"))
	private WebElement InputTypePM;
	
	@FindBy(xpath=("(//input[@id='value'])[2]"))
	private WebElement PatternMatchingValue;
	
	@FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[7]"))
	private WebElement PatternMatchingWarning;
	
	@FindBy(xpath=("(//button[contains(text(),'Save')])[5]"))
	private WebElement PatternMatchingSave;
	
	@FindBy(xpath=("(//p-header[contains(text(),'Query Builder')])[1]"))
	private WebElement QueryBuilderMenuII;
	
	@FindBy(xpath=("(//label[contains(text(),'Warning(W)')])[8]"))
	private WebElement WarningQBII;
	
	@FindBy(xpath=("(//textarea[@id='customQuery'])[1]"))
	private WebElement ANDQBII;
	
	@FindBy(xpath=("(//button[contains(text(),'Validate Query')])[1]"))
	private WebElement ValidateQueryQBII;
	
	@FindBy(xpath=("(//textarea[@id='customRuleDescription'])[1]"))
	private WebElement DescriptionQBII;
	
	@FindBy(xpath=("(//button[contains(text(),'Save')])[6]"))
	private WebElement SaveQBII;
	
	@FindBy(xpath=("//button[contains(text(),'Move to Referential Integrity')]"))
	private WebElement MoveToReferentialintegrity;
	
	public InternalIntegrityTab_RM(WebDriver ldriver) {
		
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAcceptedRangeMenu() {
		return AcceptedRangeMenu;
	}

	public WebElement getAcceptedRangeFrom() {
		return AcceptedRangeFrom;
	}
	
	public WebElement getAcceptedRangeFromBirth1() {
		return AcceptedRangeFromBirth1;
	}

	public WebElement getAcceptedRangeToBirth1() {
		return AcceptedRangeToBirth1;
	}

	public WebElement getMOnthYearBirth1From() {
		return MOnthYearBirth1From;
	}

	public WebElement getAcceptedRangeMOnthYearBirth1To() {
		return AcceptedRangeMOnthYearBirth1To;
	}

	public WebElement getPreviousButtonFromBirth1() {
		return PreviousButtonFromBirth1;
	}

	public WebElement getAcceptedRangePreviousButtonTo() {
		return AcceptedRangePreviousButtonTo;
	}

	public WebElement getDateFromBirth1() {
		return DateFromBirth1;
	}

	public WebElement getDateAcceptedRangeFromTo() {
		return DateAcceptedRangeFromTo;
	}

	public WebElement getAcceptedRangeTo() {
		return AcceptedRangeTo;
	}

	public WebElement getAcceptedRangeInclude() {
		return AcceptedRangeInclude;
	}

	public WebElement getAcceptedRangeWarning() {
		return AcceptedRangeWarning;
	}

	public WebElement getAcceptedRangeSave() {
		return AcceptedRangeSave;
	}

	public WebElement getAcceptedValueMenu() {
		return AcceptedValueMenu;
	}

	public WebElement getAcceptedValueCondition() {
		return AcceptedValueCondition;
	}

	public WebElement getAcceptedValueVal() {
		return AcceptedValueVal;
	}

	public WebElement getAcceptedValueWarning() {
		return AcceptedValueWarning;
	}

	public WebElement getAcceptedValueSave() {
		return AcceptedValueSave;
	}

	public WebElement getConditionalValueMenu() {
		return ConditionalValueMenu;
	}

	public WebElement getDataElementIFCV() {
		return DataElementIFCV;
	}

	public WebElement getConditionIFCV() {
		return ConditionIFCV;
	}

	public WebElement getValueIFCV() {
		return ValueIFCV;
	}

	public WebElement getConditionTHENCV() {
		return ConditionTHENCV;
	}

	public WebElement getValueTHENCV() {
		return ValueTHENCV;
	}

	public WebElement getConditionalValueTHENWarning() {
		return ConditionalValueTHENWarning;
	}

	public WebElement getConditionalValueSave() {
		return ConditionalValueSave;
	}

	public WebElement getConditionCompareCV() {
		return ConditionCompareCV;
	}

	public WebElement getDataElementSelectCompareCV() {
		return DataElementSelectCompareCV;
	}

	public WebElement getCompareWarningCV() {
		return CompareWarningCV;
	}

	public WebElement getCompareSaveCV() {
		return CompareSaveCV;
	}

	public WebElement getPatternMatchingMenu() {
		return PatternMatchingMenu;
	}

	public WebElement getStartPositionPM() {
		return StartPositionPM;
	}

	public WebElement getEndPositionPM() {
		return EndPositionPM;
	}

	public WebElement getConditionPM() {
		return ConditionPM;
	}

	public WebElement getInputTypePM() {
		return InputTypePM;
	}

	public WebElement getPatternMatchingValue() {
		return PatternMatchingValue;
	}

	public WebElement getPatternMatchingWarning() {
		return PatternMatchingWarning;
	}

	public WebElement getPatternMatchingSave() {
		return PatternMatchingSave;
	}

	public WebElement getQueryBuilderMenuII() {
		return QueryBuilderMenuII;
	}

	public WebElement getWarningQBII() {
		return WarningQBII;
	}

	public WebElement getANDQBII() {
		return ANDQBII;
	}

	public WebElement getValidateQueryQBII() {
		return ValidateQueryQBII;
	}

	public WebElement getDescriptionQBII() {
		return DescriptionQBII;
	}

	public WebElement getSaveQBII() {
		return SaveQBII;
	}

	public WebElement getMoveToReferentialintegrity() {
		return MoveToReferentialintegrity;
	}
	
	
}
