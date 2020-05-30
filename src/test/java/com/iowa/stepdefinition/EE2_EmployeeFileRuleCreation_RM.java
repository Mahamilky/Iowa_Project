package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class EE2_EmployeeFileRuleCreation_RM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(EE2_EmployeeFileRuleCreation_RM.class);

	@Given("^User is on Rules by Data Element Page$")
	public void user_is_on_Rules_by_Data_Element_Page() throws Throwable {

		log.info("User is on Employee Report Rule Creation Page Under RulesByDataElement");

	}

	@When("^User select Employee File from Select Report dropdown$")
	public void user_select_Employee_File_from_Select_Report_dropdown() throws Throwable {

		log.debug("User selecting Employee file from select report dropdown");
		waitforvisibilityofelement(pom.getRBD().getCommcollege());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		dropdowntext(pom.getRBD().getSelectReport(), "Employee");
		Thread.sleep(5000);
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		log.info("User swuccessfully selected Employee file from dropdown");
	}

	@When("^User create rule for Commcollege(\\d+) data element$")
	public void user_create_rule_for_Commcollege_data_element(int arg1) throws Throwable {

		
		 log.debug("User creating rule for CommCollege1 element");
		 clickOnElement(pom.getRBD().getPaginator2());
		 waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		 
		 log.info("User click on Commcollege1 rule edit icon ");
		 clickOnElement(pom.getRE().getRuleEdit10());
		 waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		  
		 log.info("user scroll down the page to view create rule page");
		  scroll(pom.getFST().getClickMoveToInternalIntegrity());
		  waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		  Thread.sleep(5000);
		  
		  log.info("user click on LookUp data extension bar to provide details");
		  waitforvisibilityofelement(pom.getFST().getLookUpDataMenu());
		  Thread.sleep(5000); clickOnElement(pom.getFST().getLookUpDataMenu());
		  
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
		  inputOnElement(pom.getRI().getRuleNameCC(),
		  "All Employees are listed with Positions"); Thread.sleep(5000);
		  
		  log.info("user selecting Data Element title Under Constraint Check menu");
		  dropdowntext(pom.getRI().getDataElementTitleCC(), "SSN1");
		  Thread.sleep(5000);
		 
		  log.info("user selecting condition under Constraint check menu ");
		  dropdowntext(pom.getRI().getConditionCC(), "IN"); Thread.sleep(5000);
		  
		  log.info("user selecting comparing report from dropDown");
		  dropdowntext(pom.getRI().getSelectCompareReportCC(), "Position");
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
		  clickOnElement(pom.getRI().getMovetoSummaryButton()); Thread.sleep(5000);
		  
		  log.
		  info("user click on Referential Integrity tab to view Summary for CommCollege"
		  ); scrollUp(pom.getRI().getReferentialIntegrityTab());
		  waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		  clickOnElement(pom.getRI().getReferentialIntegrityTab());
		  
		  log.
		  debug("user click on Done button to complete the Commcollege rule creation");
		  scroll(pom.getRI().getDoneButton());
		  waitforvisibilityofelement(pom.getRI().getDoneButton());
		  clickOnElement(pom.getRI().getDoneButton());
		  waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		  Thread.sleep(9000);
		  log.info("user successfully created commCollege1 DataElemnt Rule");
		 

	}

	@When("^User create rule for SSN(\\d+) data element$")
	public void user_create_rule_for_SSN_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for SSN1 DAtaElement");
		log.info("user click on edit rule button of SSN1 for creating rule");
		clickOnElement(pom.getRBD().getPaginator3());
	     scrollUp(pom.getRBD().getSelectReport());
		  waitforvisibilityofelement(pom.getRBD().getSelectReport());
		  clickOnElement(pom.getRE().getRuleEdit1());
		  waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		  
		  log.info("user scroll down the page to view create rule page");
		  scroll(pom.getFST().getClickMoveToInternalIntegrity());
		  waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		  Thread.sleep(5000);
		  
		  log.info("user click on length validation extension bar");
		  clickOnElement(pom.getFST().getLengthValidationMenu()); Thread.sleep(5000);
		  
		  log.info("user selecting Condition for length validation of SSN1");
		  dropdowntext(pom.getFST().getLengthConditionLV(), "Equal to");
		  Thread.sleep(5000);
		  
		  log.info("user entering Length under Length validation menu of SSN1");
		  Thread.sleep(5000); inputOnElement(pom.getFST().getLengthValueLV(), "9");
		  Thread.sleep(5000);
		  
		  log.info("user click on Not Null extension bar of SSN1");
		  clickOnElement(pom.getFST().getNotNullMenu());
		  waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());
		  
		  log.info("user selecting not null checkBox");
		  clickOnElement(pom.getFST().getNotnullCheckbox()); Thread.sleep(5000);
		  
		  log.info("user click on NotBlank extenstion bar of SSN1");
		  scroll(pom.getFST().getClickMoveToInternalIntegrity());
		  waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		  clickOnElement(pom.getFST().getNotBlankMenu());
		  waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());
		  
		  log.info("user selecting not blank checkbox");
		  clickOnElement(pom.getFST().getNotBlankCheckBox());
		  waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());
		  
		  log.info("user click on update button to update the FileStatus rules of SSN1"
		  ); clickOnElement(pom.getFST().getUpdateFileStatus());
		  waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		  
		  log.info("user click on Move to Internal Integrity(II) ");
		  clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		  Thread.sleep(5000);
		  
		  log.
		  info("user click on Accepted Value extension bar under Internal Integrity Menu"
		  ); waitforvisibilityofelement(pom.getIIT().getAcceptedValueMenu());
		  Thread.sleep(5000); clickOnElement(pom.getIIT().getAcceptedValueMenu());
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
		  clickOnElement(pom.getIIT().getPatternMatchingMenu()); Thread.sleep(5000);
		  
		  log.debug("user enter pattern matching values1");
		  inputOnElement(pom.getIIT().getStartPositionPM(), "1");
		  inputOnElement(pom.getIIT().getEndPositionPM(), "3"); Thread.sleep(5000);
		  dropdowntext(pom.getIIT().getConditionPM(), "Does not Contain");
		  Thread.sleep(5000); dropdowntext(pom.getIIT().getInputTypePM(), "Value");
		  Thread.sleep(5000); inputOnElement(pom.getIIT().getPatternMatchingValue(),
		  "000"); clickOnElement(pom.getIIT().getPatternMatchingSave());
		  waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		  Thread.sleep(5000);
		  log.info("user successfully entered pattern matching values1");
		  
		  log.debug("user enter pattern matching values2"); Thread.sleep(5000);
		  waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		  inputOnElement(pom.getIIT().getStartPositionPM(), "6");
		  inputOnElement(pom.getIIT().getEndPositionPM(), "4"); Thread.sleep(5000);
		  dropdowntext(pom.getIIT().getConditionPM(), "Does not Contain");
		  Thread.sleep(5000); dropdowntext(pom.getIIT().getInputTypePM(), "Value");
		  Thread.sleep(5000); inputOnElement(pom.getIIT().getPatternMatchingValue(),
		  "0000"); clickOnElement(pom.getIIT().getPatternMatchingSave());
		  waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		  Thread.sleep(5000);
		  log.info("user successfully entered pattern matching values2");
		  
		  log.debug("user enter pattern matching values3");
		  waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		  Thread.sleep(9000); inputOnElement(pom.getIIT().getStartPositionPM(), "1");
		  inputOnElement(pom.getIIT().getEndPositionPM(), "9"); Thread.sleep(5000);
		  dropdowntext(pom.getIIT().getConditionPM(), "Contain"); Thread.sleep(5000);
		  dropdowntext(pom.getIIT().getInputTypePM(), "Numeric"); Thread.sleep(5000);
		  clickOnElement(pom.getIIT().getPatternMatchingSave());
		  waitforvisibilityofelement(pom.getIIT().getStartPositionPM());
		  Thread.sleep(5000);
		  log.info("user successfully entered pattern matching values3");
		  
		  log.info("user click on Query Builder extension bar");
		  waitforvisibilityofelement(pom.getIIT().getQueryBuilderMenuII());
		  clickOnElement(pom.getIIT().getQueryBuilderMenuII()); Thread.sleep(5000);
		  
		  log.info("user entering AND condition in textarea under Query Builder ");
		  inputOnElement(pom.getIIT().getANDQBII(),
		  "substring([SSN],1,1)<> (case when [SSN]='999999999' then 1 else '9' end) AND [SSN] NOT LIKE CASE WHEN [SSN]='999999999' THEN '1' ELSE SUBSTRING([SSN],1,1)+SUBSTRING([SSN],1,1)+SUBSTRING([SSN],1,1)+'%'+SUBSTRING([SSN],1,1)+SUBSTRING([SSN],1,1)+SUBSTRING([SSN],1,1) END\r\n"
		  +
		  "AND SSN NOT IN (select SSN from [dbo].CreditStudentInfoSTG(NOLOCK)B where collegeid= A.collegeid and reportmappingid = A.reportmappingid and SSN IN (A.SSN) and SSN <> '999999999' GROUP BY b.SSN HAVING COUNT(1) > 1)"
		  ); Thread.sleep(5000);
		  
		  log.info("user click on Validate Query of SSN1 under Internal Integrity(II)"
		  ); clickOnElement(pom.getIIT().getValidateQueryQBII()); Thread.sleep(5000);
		  
		  log.info("user Entering Description in text area");
		  inputOnElement(pom.getIIT().getDescriptionQBII(),
		  "no number starts with \"9\" except for \"999999999\", no first and last group of numbers contains three identical characters like  \"AAA-BC-AAA\"  with repetitive number"
		  ); Thread.sleep(5000);
		  
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
		  clickOnElement(pom.getRI().getMovetoSummaryButton()); Thread.sleep(5000);
		  
		  log.
		  info("user click on Referential integrity tab to view created rule of SSN1");
		  scrollUp(pom.getRI().getReferentialIntegrityTab());
		  waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		  clickOnElement(pom.getRI().getReferentialIntegrityTab());
		  
		  log.
		  debug("user clicking on done button to complete the Rule creation of SSN1 Data Element"
		  ); scroll(pom.getRI().getDoneButton());
		  waitforvisibilityofelement(pom.getRI().getDoneButton());
		  clickOnElement(pom.getRI().getDoneButton());
		  waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		  Thread.sleep(9000);
		  log.info("user successfully completed rule creation of SSN1 data element");
		 

	}

	@When("^User create rule for LastName(\\d+) data element$")
	public void user_create_rule_for_LastName_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for LastName1 Data Element");
		log.info("user click on LastName1 Data element Rule edit button");
		scrollUp(pom.getRBD().getSelectReport());
		waitforvisibilityofelement(pom.getRBD().getSelectReport());
		clickOnElement(pom.getRE().getRuleEdit2());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on length validation extension bar");
		clickOnElement(pom.getFST().getLengthValidationMenu());
		Thread.sleep(5000);

		log.info("user selecting Condition for length validation of LastName1");
		dropdowntext(pom.getFST().getLengthConditionLV(), "Lesser than");
		Thread.sleep(5000);

		log.info("user entering Length under Length validation menu of LastName1");
		Thread.sleep(5000);
		inputOnElement(pom.getFST().getLengthValueLV(), "50");
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of LastName1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of LastName1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of LastName1");
		clickOnElement(pom.getFST().getUpdateFileStatus());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on Move to Internal Integrity(II) ");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Query Builder extension bar");
		waitforvisibilityofelement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);

		log.info("user entering AND condition in textarea under Query Builder ");
		scroll(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		inputOnElement(pom.getIIT().getANDQBII(), "LastName not like '%[0-9]%'");
		Thread.sleep(5000);

		log.info("user click on Validate Query of LastName1 under Internal Integrity(II)");
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		inputOnElement(pom.getIIT().getDescriptionQBII(), "only alpha characters");
		Thread.sleep(5000);

		log.info("user click on save button under Query builder of LastName1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		Thread.sleep(5000);

		log.info("user scrollUp the page to provide Query for warning in LastName1 Data Element");
		scrollUp(pom.getIIT().getQueryBuilderMenuII());
		waitforvisibilityofelement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);

		log.info("user click on warning button under query builder");
		Thread.sleep(5000);
		waitforvisibilityofelement(pom.getIIT().getWarningQBII());
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getWarningQBII());
		Thread.sleep(5000);

		log.info("user entering AND condition in textarea under Query Builder ");
		ScrollDown(pom.getIIT().getValidateQueryQBII());
		waitforvisibilityofelement(pom.getIIT().getValidateQueryQBII());
		inputOnElement(pom.getIIT().getANDQBII(), "LastName like '%[^a-Z]%'");
		Thread.sleep(5000);

		log.info("user click on Validate Query of LastName1 under Internal Integrity(II)");
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		inputOnElement(pom.getIIT().getDescriptionQBII(), "no special characters");
		Thread.sleep(5000);

		log.info("user click on save button under Query builder of LastName1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		Thread.sleep(5000);

		log.info("user scroll down the page to view Move to Referential");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());

		log.info("user click on Move to Referential Integrity button of LastName1");
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary");
		waitforvisibilityofelement(pom.getRI().getMovetoSummaryButton());
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential integrity tab to view created rule of LastName1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user clicking on done button to complete the Rule creation of LastName1 Data Element");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully completed rule creation of LastName1 data element");

	}

	@When("^User create rule for FirstName(\\d+) data element$")
	public void user_create_rule_for_FirstName_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for FirstName1 Data Element");
		log.info("user click on FirstName1 Data element Rule edit button");
		clickOnElement(pom.getRE().getRuleEdit3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on length validation extension bar");
		clickOnElement(pom.getFST().getLengthValidationMenu());
		Thread.sleep(5000);

		log.info("user selecting Condition for length validation of FirstName1");
		dropdowntext(pom.getFST().getLengthConditionLV(), "Lesser than");
		Thread.sleep(5000);

		log.info("user entering Length under Length validation menu of FirstName1");
		Thread.sleep(5000);
		inputOnElement(pom.getFST().getLengthValueLV(), "50");
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of FirstName1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of FirstName1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of FirstName1");
		clickOnElement(pom.getFST().getUpdateFileStatus());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on Move to Internal Integrity(II) ");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Query Builder extension bar");
		clickOnElement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);

		log.info("user entering AND condition in textarea under Query Builder ");
		scroll(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		inputOnElement(pom.getIIT().getANDQBII(), "FirstName not like '%[0-9]%'");
		Thread.sleep(5000);

		log.info("user click on Validate Query of FirstName1 under Internal Integrity(II)");
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		inputOnElement(pom.getIIT().getDescriptionQBII(), "only alpha characters");
		Thread.sleep(5000);

		log.info("user click on save button under Query builder of FirstName1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		Thread.sleep(5000);

		log.info("user scrollUp the page to provide Query for warning in FirstName1 Data Element");
		scrollUp(pom.getIIT().getQueryBuilderMenuII());
		waitforvisibilityofelement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);

		log.info("user click on warning button under query builder");
		waitforvisibilityofelement(pom.getIIT().getWarningQBII());
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getWarningQBII());
		Thread.sleep(5000);

		log.info("user entering AND condition in textarea under Query Builder ");
		ScrollDown(pom.getIIT().getValidateQueryQBII());
		waitforvisibilityofelement(pom.getIIT().getValidateQueryQBII());
		inputOnElement(pom.getIIT().getANDQBII(), "FirstName like '%[^a-Z]%'");
		Thread.sleep(5000);

		log.info("user click on Validate Query of LastName1 under Internal Integrity(II)");
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		inputOnElement(pom.getIIT().getDescriptionQBII(), "no special characters");
		Thread.sleep(5000);

		log.info("user click on save button under Query builder of FirstName1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		Thread.sleep(5000);

		log.info("user scroll down the page to view Move to Referential");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());

		log.info("user click on Move to Referential Integrity button of FirstName1");
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary");
		waitforvisibilityofelement(pom.getRI().getMovetoSummaryButton());
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential integrity tab to view created rule of FirstName1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user clicking on done button to complete the Rule creation of FirstName1 Data Element");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully completed rule creation of FirstName1 data element");

	}

	@When("^User create rule for MInit(\\d+) data element$")
	public void user_create_rule_for_MInit_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for MInit1 Data Element");
		log.info("user click on MInit1 Data element Rule edit button");
		clickOnElement(pom.getRE().getRuleEdit4());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on length validation extension bar");
		clickOnElement(pom.getFST().getLengthValidationMenu());
		Thread.sleep(5000);

		log.info("user selecting Condition for length validation of MInit1");
		dropdowntext(pom.getFST().getLengthConditionLV(), "Lesser than");
		Thread.sleep(5000);

		log.info("user entering Length under Length validation menu of MInit1");
		Thread.sleep(5000);
		inputOnElement(pom.getFST().getLengthValueLV(), "50");
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of MInit1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of MInit1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of MInit1");
		clickOnElement(pom.getFST().getUpdateFileStatus());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on Move to Internal Integrity(II) ");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Query Builder extension bar");
		clickOnElement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);

		log.info("user entering AND condition in textarea under Query Builder ");
		scroll(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		inputOnElement(pom.getIIT().getANDQBII(), "MInit not like '%[0-9]%'");
		Thread.sleep(5000);

		log.info("user click on Validate Query of MInit1 under Internal Integrity(II)");
		waitforvisibilityofelement(pom.getIIT().getValidateQueryQBII());
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		inputOnElement(pom.getIIT().getDescriptionQBII(), "only alpha characters");
		Thread.sleep(5000);

		log.info("user click on save button under Query builder of MInit1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		Thread.sleep(5000);

		log.info("user scrollUp the page to provide Query for warning in MInit1 Data Element");
		scrollUp(pom.getIIT().getQueryBuilderMenuII());
		waitforvisibilityofelement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);

		log.info("user click on warning button under query builder");
		Thread.sleep(5000);
		waitforvisibilityofelement(pom.getIIT().getWarningQBII());
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getWarningQBII());
		Thread.sleep(5000);

		log.info("user entering AND condition in textarea under Query Builder ");
		ScrollDown(pom.getIIT().getValidateQueryQBII());
		waitforvisibilityofelement(pom.getIIT().getValidateQueryQBII());
		inputOnElement(pom.getIIT().getANDQBII(), "MInit like '%[^a-Z]%'");
		Thread.sleep(5000);

		log.info("user click on Validate Query of MInit1 under Internal Integrity(II)");
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		inputOnElement(pom.getIIT().getDescriptionQBII(), "no special characters");
		Thread.sleep(5000);

		log.info("user click on save button under Query builder of MInit1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		Thread.sleep(5000);

		log.info("user scroll down the page to view Move to Referential");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());

		log.info("user click on Move to Referential Integrity button of MInit1");
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary");
		waitforvisibilityofelement(pom.getRI().getMovetoSummaryButton());
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential integrity tab to view created rule of MInit1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user clicking on done button to complete the Rule creation of MInit1 Data Element");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully completed rule creation of MInit1 data element");

	}

	@When("^User create rule for BirthDate(\\d+) data element$")
	public void user_create_rule_for_BirthDate_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for BirthDate1 Data Element");
		log.info("user click on BirthDate1 Data element Rule edit button");
		clickOnElement(pom.getRE().getRuleEdit5());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of BirthDate1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of BirthDate1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of BirthDate1");
		clickOnElement(pom.getFST().getUpdateFileStatus());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());

		log.info("user click on Move to Internal Integrity(II) ");
		clickOnElement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());

		log.info("User click on Accepted Range Extension Bar");
		clickOnElement(pom.getIIT().getAcceptedRangeMenu());
		Thread.sleep(5000);

		log.info("User selecting Year Month and date from Accepted Range From Field of Birth1 element ");
		waitforvisibilityofelement(pom.getIIT().getAcceptedRangeFromBirth1());
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getAcceptedRangeFromBirth1());
		MonthAndYearPicker(pom.getIIT().getMOnthYearBirth1From(), pom.getIIT().getPreviousButtonFromBirth1(),
				"January 1925", pom.getIIT().getDateFromBirth1());
		Thread.sleep(5000);

		log.info("User selecting Year Month from Accepted Range To field of Birth1 element");
		waitforvisibilityofelement(pom.getIIT().getAcceptedRangeToBirth1());
		clickOnElement(pom.getIIT().getAcceptedRangeToBirth1());
		MonthAndYearPicker(pom.getIIT().getAcceptedRangeMOnthYearBirth1To(),
				pom.getIIT().getAcceptedRangePreviousButtonTo(), "September 2005",
				pom.getIIT().getDateAcceptedRangeFromTo());

		Thread.sleep(5000);

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

		log.info("user click on Referential Integrity to view rule created for BirthDate1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the BirthDate1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created BirthDate1 DataElement Rule");
	}

	@When("^User create rule for Ethnicity(\\d+) data element$")
	public void user_create_rule_for_Ethnicity_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for Ethnicity1 Data Element");
		log.info("User click on Ethnicity1 rule edit icon ");
		clickOnElement(pom.getRE().getRuleEdit6());
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
		dropdownGetoptions(pom.getFST().getSelectLookUpDataLD(), "Ethnicity");
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

		log.info("user click on Accepted Value extension bar under Internal Integrity Menu");
		waitforvisibilityofelement(pom.getIIT().getAcceptedValueMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getAcceptedValueMenu());
		Thread.sleep(5000);

		log.info("user select Accepted Value condition of Ethnicity1");
		dropdowntext(pom.getIIT().getAcceptedValueCondition(), "IN");
		Thread.sleep(5000);

		log.info("user entering value of Accepted Value under II");
		inputOnElement(pom.getIIT().getAcceptedValueVal(), "0");
		Thread.sleep(5000);

		log.info("user click on warning button under Accepted Value");
		clickOnElement(pom.getIIT().getAcceptedValueWarning());

		log.info("user click on save button to update Accepted value of Ethnicity1");
		clickOnElement(pom.getIIT().getAcceptedValueSave());
		waitforvisibilityofelement(pom.getIIT().getAcceptedValueSave());

		log.info("user click on Move To Referential Integrity(RI)");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for Ethnicity1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the Ethnicity1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created Ethnicity1 DataElement Rule");

	}

	@When("^User create rule for AmInd(\\d+) data element$")
	public void user_create_rule_for_AmInd_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for AmInd1 Data Element");
		log.info("user click on AmInd1 Data element Rule edit button");
		clickOnElement(pom.getRE().getRuleEdit7());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of AmInd1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of AmInd1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of AmInd1");
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

		log.info("user select Accepted Value condition of AmInd1");
		dropdowntext(pom.getIIT().getAcceptedValueCondition(), "IN");
		Thread.sleep(5000);

		log.info("user entering value of Accepted Value under II");
		inputOnElement(pom.getIIT().getAcceptedValueVal(), "0,1");
		Thread.sleep(5000);

		log.info("user click on warning button under Accepted Value");
		clickOnElement(pom.getIIT().getAcceptedValueWarning());

		log.info("user click on save button to update Accepted value of AmInd1");
		clickOnElement(pom.getIIT().getAcceptedValueSave());
		waitforvisibilityofelement(pom.getIIT().getAcceptedValueSave());

		log.info("user click on Move To Referential Integrity(RI)");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for AmInd1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the AmInd1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created AmInd1 DataElement Rule");

	}

	@When("^User create rule for Asian(\\d+) data element$")
	public void user_create_rule_for_Asian_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for Asian1 Data Element");
		log.info("user click on Asian1 Data element Rule edit button");
		clickOnElement(pom.getRE().getRuleEdit8());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of Asian1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of Asian1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of Asian1");
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

		log.info("user select Accepted Value condition of Asian1");
		dropdowntext(pom.getIIT().getAcceptedValueCondition(), "IN");
		Thread.sleep(5000);

		log.info("user entering value of Accepted Value under II");
		inputOnElement(pom.getIIT().getAcceptedValueVal(), "0,1");
		Thread.sleep(5000);

		log.info("user click on warning button under Accepted Value");
		clickOnElement(pom.getIIT().getAcceptedValueWarning());

		log.info("user click on save button to update Accepted value of Asian1");
		clickOnElement(pom.getIIT().getAcceptedValueSave());
		waitforvisibilityofelement(pom.getIIT().getAcceptedValueSave());

		log.info("user click on Move To Referential Integrity(RI)");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for Asian1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the Asian1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created Asian1 DataElement Rule");

	}

	@Then("^User create rule for Black(\\d+) data element$")
	public void user_create_rule_for_Black_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for Black1 Data Element");
		log.info("user click on Black1 Data element Rule edit button");
		clickOnElement(pom.getRE().getRuleEdit9());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of Black1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of Black1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of Black1");
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

		log.info("user select Accepted Value condition of Black1");
		dropdowntext(pom.getIIT().getAcceptedValueCondition(), "IN");
		Thread.sleep(5000);

		log.info("user entering value of Accepted Value under II");
		inputOnElement(pom.getIIT().getAcceptedValueVal(), "0,1");
		Thread.sleep(5000);

		log.info("user click on warning button under Accepted Value");
		clickOnElement(pom.getIIT().getAcceptedValueWarning());

		log.info("user click on save button to update Accepted value of Black1");
		clickOnElement(pom.getIIT().getAcceptedValueSave());
		waitforvisibilityofelement(pom.getIIT().getAcceptedValueSave());

		log.info("user click on Move To Referential Integrity(RI)");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for Black1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the Black1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created Black1 DataElement Rule");

	}

}
