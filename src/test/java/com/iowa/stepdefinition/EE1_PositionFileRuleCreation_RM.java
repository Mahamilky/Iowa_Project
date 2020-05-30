package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class EE1_PositionFileRuleCreation_RM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(EE1_PositionFileRuleCreation_RM.class);

	@Given("^User is on RulesByDataElement Page$")
	public void user_is_on_RulesByDataElement_Page() throws Throwable {

		log.info("User is on RulesByDataElement Page for Position FILE Rule Creation");
		Thread.sleep(9000);
	}

	@When("^User select Position File from Select Report DropDown$")
	public void user_select_Position_File_from_Select_Report_DropDown() throws Throwable {

		log.debug("User selecting Position File from Select Report DropDown");
		waitforvisibilityofelement(pom.getRBD().getCommcollege());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		dropdowntext(pom.getRBD().getSelectReport(), "Position");
		Thread.sleep(5000);
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		log.info("User successfully selected POsition File from dropDown");
	}

	@When("^User create rule for Commcollege(\\d+) element$")
	public void user_create_rule_for_Commcollege_elemnent(int arg1) throws Throwable {

		log.debug("User creating rule for Commcollege1 data element ");
		log.info("User click on Commcollege1 rule edit icon ");
		clickOnElement(pom.getRE().getRuleEdit8());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on LookUp data extension bar to provide details");
		waitforvisibilityofelement(pom.getFST().getLookUpDataMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getFST().getLookUpDataMenu());

		log.info("user selecting lookup data from dropdown menu");
		dropdownGetoptions(pom.getFST().getSelectLookUpDataLD(), "College master");
		Thread.sleep(5000);

		log.info("User selecting Data elemnt title under LookUp Data menu");
		dropdowntext(pom.getFST().getSelectDataElementTitleLD(), "Code");
		Thread.sleep(5000);

		log.info("user click on update button to finish LookUpData Menu");
		clickOnElement(pom.getFST().getUpdateFileStatus());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on MoveToInternalIntegrity button");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());

		log.info("user click on Move To Referential Integrity(RI)");
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info(" user click on Constraint Check extension bar in RI");
		clickOnElement(pom.getRI().getConstraintCheckMenu());
		waitforvisibilityofelement(pom.getRI().getRuleNameCC());

		log.info("user entering Rule name in text field");
		inputOnElement(pom.getRI().getRuleNameCC(), "All positions have reported Employees");
		Thread.sleep(5000);

		log.info("user selecting Data Element title Under Constraint Check menu");
		dropdowntext(pom.getRI().getDataElementTitleCC(), "SSN1");
		Thread.sleep(5000);

		log.info("user selecting condition under Constraint check menu ");
		dropdowntext(pom.getRI().getConditionCC(), "IN");
		Thread.sleep(5000);

		log.info("user selecting comparing report from dropDown");
		dropdowntext(pom.getRI().getSelectCompareReportCC(), "Employee");
		Thread.sleep(7000);

		log.info("user selecting comparing data element title from drop down");
		dropdowntext(pom.getRI().getDataElementCompareCC(), "SSN1");
		Thread.sleep(5000);

		log.info("user scroll down the page to view  Move to summary");
		scroll(pom.getRI().getMovetoSummaryButton());
		waitforvisibilityofelement(pom.getRI().getMovetoSummaryButton());

		log.info("user click on save button to save Constraint check rules");
		clickOnElement(pom.getRI().getSaveConstraintCheck());
		waitforvisibilityofelement(pom.getRI().getMovetoSummaryButton());

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity tab to view Summary for CommCollege");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the Commcollege rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created commCollege1 DataElemnt Rule");

	}

	@When("^User create rule for SSN(\\d+) element$")
	public void user_create_rule_for_SSN_elemnent(int arg1) throws Throwable {

		log.debug("user creating rule for SSN1 DAtaElement");
		log.info("user click on edit rule button of SSN1 for creating rule");
		clickOnElement(pom.getRE().getRuleEdit9());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on length validation extension bar");
		clickOnElement(pom.getFST().getLengthValidationMenu());
		Thread.sleep(5000);

		log.info("user selecting Condition for length validation of SSN1");
		dropdowntext(pom.getFST().getLengthConditionLV(), "Equal to");
		Thread.sleep(5000);

		log.info("user entering Length under Length validation menu of SSN1");
		Thread.sleep(5000);
		inputOnElement(pom.getFST().getLengthValueLV(), "9");
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of SSN1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of SSN1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of SSN1");
		clickOnElement(pom.getFST().getUpdateFileStatus());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on Move to Internal Integrity(II) ");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Accepted Value extension bar under Internal Integrity Menu");
		waitforvisibilityofelement(pom.getIIT().getAcceptedValueMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getAcceptedValueMenu());
		Thread.sleep(5000);

		log.info("user select Accepted Value condition of SSN1");
		dropdowntext(pom.getIIT().getAcceptedValueCondition(), "IN");
		Thread.sleep(5000);

		log.info("user entering value of Accepted Value under II");
		inputOnElement(pom.getIIT().getAcceptedValueVal(), "999999999");
		Thread.sleep(5000);

		log.info("user click on warning button under Accepted Value");
		clickOnElement(pom.getIIT().getAcceptedValueWarning());

		log.info("user click on save button to update Accepted value of SSN1");
		clickOnElement(pom.getIIT().getAcceptedValueSave());
		waitforvisibilityofelement(pom.getIIT().getAcceptedValueSave());

		log.info("user scroll down the page to view Pattern Matching option");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Pattern Matching Extension Bar under II");
		clickOnElement(pom.getIIT().getPatternMatchingMenu());
		Thread.sleep(5000);

		log.debug("user enter pattern matching values1");
		inputOnElement(pom.getIIT().getStartPositionPM(), "1");
		inputOnElement(pom.getIIT().getEndPositionPM(), "3");
		Thread.sleep(5000);
		dropdowntext(pom.getIIT().getConditionPM(), "Does not Contain");
		Thread.sleep(5000);
		dropdowntext(pom.getIIT().getInputTypePM(), "Value");
		Thread.sleep(5000);
		inputOnElement(pom.getIIT().getPatternMatchingValue(), "000");
		clickOnElement(pom.getIIT().getPatternMatchingSave());
		waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		Thread.sleep(5000);
		log.info("user successfully entered pattern matching values1");

		log.debug("user enter pattern matching values2");
		Thread.sleep(5000);
		waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		inputOnElement(pom.getIIT().getStartPositionPM(), "6");
		inputOnElement(pom.getIIT().getEndPositionPM(), "4");
		Thread.sleep(5000);
		dropdowntext(pom.getIIT().getConditionPM(), "Does not Contain");
		Thread.sleep(5000);
		dropdowntext(pom.getIIT().getInputTypePM(), "Value");
		Thread.sleep(5000);
		inputOnElement(pom.getIIT().getPatternMatchingValue(), "0000");
		clickOnElement(pom.getIIT().getPatternMatchingSave());
		waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		Thread.sleep(5000);
		log.info("user successfully entered pattern matching values2");

		log.debug("user enter pattern matching values3");
		waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		inputOnElement(pom.getIIT().getStartPositionPM(), "1");
		inputOnElement(pom.getIIT().getEndPositionPM(), "9");
		Thread.sleep(5000);
		dropdowntext(pom.getIIT().getConditionPM(), "Contain");
		Thread.sleep(5000);
		dropdowntext(pom.getIIT().getInputTypePM(), "Numeric");
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getPatternMatchingSave());
		waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		Thread.sleep(5000);
		log.info("user successfully entered pattern matching values3");

		log.info("user click on Query Builder extension bar");
		clickOnElement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);

		log.info("user entering AND condition in textarea under Query Builder ");
		inputOnElement(pom.getIIT().getANDQBII(),
				"substring([SSN],1,1)<> (case when [SSN]='999999999' then 1 else '9' end) AND [SSN] NOT LIKE CASE WHEN [SSN]='999999999' THEN '1' ELSE SUBSTRING([SSN],1,1)+SUBSTRING([SSN],1,1)+SUBSTRING([SSN],1,1)+'%'+SUBSTRING([SSN],1,1)+SUBSTRING([SSN],1,1)+SUBSTRING([SSN],1,1) END\r\n"
						+ "AND SSN NOT IN (select SSN from [dbo].CreditStudentInfoSTG(NOLOCK)B where collegeid= A.collegeid and reportmappingid = A.reportmappingid and SSN IN (A.SSN) and SSN <> '999999999' GROUP BY b.SSN HAVING COUNT(1) > 1)\r\n"
						+ "\r\n" + "");
		Thread.sleep(5000);

		log.info("user click on Validate Query of SSN1 under Internal Integrity(II)");
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		inputOnElement(pom.getIIT().getDescriptionQBII(),
				"no number starts with \"9\" except for \"999999999\", no first and last group of numbers contains three identical characters like  \"AAA-BC-AAA\"  with repetitive number\r\n"
						+ "");
		Thread.sleep(5000);

		log.info("user scroll down the page to view Move to Referential");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());

		log.info("user click on save button under Query builder of SSN1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());

		log.info("user click on Move to Referential Integrity button of SSN1");
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary");
		waitforvisibilityofelement(pom.getRI().getMovetoSummaryButton());
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential integrity tab to view created rule of SSN1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user clicking on done button to complete the Rule creation of SSN1 Data Element");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully completed rule creation of SSN1 data element");

	}

	@When("^User create rule for PositionCode(\\d+) element$")
	public void user_create_rule_for_PositionCode_elemnent(int arg1) throws Throwable {

		log.debug("user creating rule for Positioncode1 Data element in Position file");
		log.info("user click on edit rule button of positionCode1 to create rule");
		clickOnElement(pom.getRE().getRuleEdit10());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view PositionCode1 rule creation page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on LookUp data extension bar to provide details");
		waitforvisibilityofelement(pom.getFST().getLookUpDataMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getFST().getLookUpDataMenu());

		log.info("user selecting lookup data from dropdown menu");
		dropdownGetoptions(pom.getFST().getSelectLookUpDataLD(), "Position Code");
		Thread.sleep(5000);

		log.info("User selecting Data element title under LookUp Data menu");
		dropdowntext(pom.getFST().getSelectDataElementTitleLD(), "Code");
		Thread.sleep(5000);

		log.info("user click on update button to finish LookUpData Menu");
		clickOnElement(pom.getFST().getUpdateFileStatus());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on MoveToInternalIntegrity button");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());

		log.info("user click on Move To Referential Integrity(RI)");
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for PositionCode1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the PositionCode1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created PositionCode1 DataElemnt Rule");

	}

	@When("^User create rule for EmployType(\\d+) element$")
	public void user_create_rule_for_EmployType_elemnent(int arg1) throws Throwable {

		log.debug("user creating rule for EmployType1 Data element in Position file");
		log.info("user click on paginator2 to view DataElements which is available in second page");
		clickOnElement(pom.getRBD().getPaginator2());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user click on edit rule button of EmployType1 to create rule");
		clickOnElement(pom.getRE().getRuleEdit1());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view EmployType1 rule creation page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on LookUp data extension bar to provide details");
		waitforvisibilityofelement(pom.getFST().getLookUpDataMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getFST().getLookUpDataMenu());
		Thread.sleep(5000);
		
		log.info("user selecting lookup data from dropdown menu");
		dropdownGetoptions(pom.getFST().getSelectLookUpDataLD(), "Employment Type");
		Thread.sleep(5000);

		log.info("User selecting Data element title under LookUp Data menu");
		dropdowntext(pom.getFST().getSelectDataElementTitleLD(), "Code");
		Thread.sleep(5000);

		log.info("user click on update button to finish LookUpData Menu");
		clickOnElement(pom.getFST().getUpdateFileStatus());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on MoveToInternalIntegrity button");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());

		log.info("user click on Move To Referential Integrity(RI)");
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for EmployType1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the EmployType1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created EmployType1 DataElement Rule");

	}

	@When("^User create rule for PositionTotEarn(\\d+) element$")
	public void user_create_rule_for_PositionTotEarn_elemnent(int arg1) throws Throwable {

		log.debug("user creating rule for PositionTotEarn1 Data element in Position file");
		log.info("user click on edit rule button of PositionTotEarn1 to create rule");
		clickOnElement(pom.getRE().getRuleEdit2());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view PositionTotEarn1 rule creation page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of PositionTotEarn1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of PositionTotEarn1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());
		Thread.sleep(5000);

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of PositionTotEarn1");
		clickOnElement(pom.getFST().getUpdateFileStatus());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on Move to Internal Integrity(II) ");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getIIT().getAcceptedRangeMenu());
		Thread.sleep(5000);

		log.info("user click on Accepted Range down arrow");
		clickOnElement(pom.getIIT().getAcceptedRangeMenu());
		Thread.sleep(5000);

		log.info("user enter from value under Accepted Range");
		inputOnElement(pom.getIIT().getAcceptedRangeFrom(), "0");

		log.info(" user enter to value under Accepted Range");
		inputOnElement(pom.getIIT().getAcceptedRangeTo(), "9");

		log.info("user click on save button to save details of Accepted range");
		clickOnElement(pom.getIIT().getAcceptedRangeSave());
		waitforvisibilityofelement(pom.getIIT().getAcceptedRangeSave());

		log.info("user click on Move To Referential Integrity(RI)");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for PositionTotEarn1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the PositionTotEarn1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created PositionTotEarn1 DataElement Rule");

	}

	@When("^User create rule for BaseSalary(\\d+) element$")
	public void user_create_rule_for_BaseSalary_elemnent(int arg1) throws Throwable {

		log.debug("user creating rule for BaseSalary1 Data element in Position file");
		log.info("user click on edit rule button of BaseSalary1 to create rule");
		clickOnElement(pom.getRE().getRuleEdit3());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view BaseSalary1 rule creation page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Move to Internal Integrity(II) ");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Accepted Range down arrow");
		clickOnElement(pom.getIIT().getAcceptedRangeMenu());
		Thread.sleep(5000);

		log.info("user enter from value under Accepted Range");
		inputOnElement(pom.getIIT().getAcceptedRangeFrom(), "0");

		log.info(" user enter to value under Accepted Range");
		inputOnElement(pom.getIIT().getAcceptedRangeTo(), "9");

		log.info("user click on save button to save details of Accepted range");
		clickOnElement(pom.getIIT().getAcceptedRangeSave());
		waitforvisibilityofelement(pom.getIIT().getAcceptedRangeSave());

		log.info("user click on Move To Referential Integrity(RI)");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for BaseSalary1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the BaseSalary1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created BaseSalary1 DataElement Rule");

	}

	@Then("^User create rule for DaysInContract(\\d+) element$")
	public void user_create_rule_for_DaysInContract_elemnent(int arg1) throws Throwable {

		log.debug("user creating rule for DaysInContract1 Data element in Position file");
		log.info("user click on edit rule button of DaysInContract1 to create rule");
		clickOnElement(pom.getRE().getRuleEdit4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view DaysInContract1 rule creation page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Move to Internal Integrity(II) ");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Query Builder extension bar");
		clickOnElement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);

		log.info("user entering AND condition in textarea under Query Builder ");
		inputOnElement(pom.getIIT().getANDQBII(), "[DaysInContract] ='' or DaysInContract BETWEEN 1 AND 365");
		Thread.sleep(5000);

		log.info("user click on Validate Query of DaysInContract1 under Internal Integrity(II)");
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());
		inputOnElement(pom.getIIT().getDescriptionQBII(), "NULL or range 1-365");
		Thread.sleep(5000);		

		log.info("user click on save button under Query builder of DaysInContract1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());

		log.info("user click on Move to Referential Integrity button of DaysInContract1");
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential integrity tab to view created rule of DaysInContract1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user clicking on done button to complete the Rule creation of DaysInContract1 Data Element");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully completed rule creation of DaysInContract1 data element");
	
	}

}
