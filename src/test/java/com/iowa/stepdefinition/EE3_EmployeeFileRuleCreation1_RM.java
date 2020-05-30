package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class EE3_EmployeeFileRuleCreation1_RM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(EE3_EmployeeFileRuleCreation1_RM.class);

	@When("^User create rule for PacIsland(\\d+) data element$")
	public void user_create_rule_for_PacIsland_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for PacIsland1 Data Element");
		log.info("user click on PacIsland Data element Rule edit button");
		clickOnElement(pom.getRE().getRuleEdit10());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of PacIsland1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of PacIsland1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of PacIsland1");
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

		log.info("user select Accepted Value condition of PacIsland1");
		dropdowntext(pom.getIIT().getAcceptedValueCondition(), "IN");
		Thread.sleep(5000);

		log.info("user entering value of Accepted Value under II");
		inputOnElement(pom.getIIT().getAcceptedValueVal(), "0,1");
		Thread.sleep(5000);

		log.info("user click on warning button under Accepted Value");
		clickOnElement(pom.getIIT().getAcceptedValueWarning());

		log.info("user click on save button to update Accepted value of PacIsland1");
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

		log.info("user click on Referential Integrity to view rule created for PacIsland1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the PacIsland1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created PacIsland1 DataElement Rule");

	}

	@When("^User create rule for White(\\d+) data element$")
	public void user_create_rule_for_White_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for White1 DAtaElement");
		log.info("user click on edit rule button of White1 for creating rule");
		clickOnElement(pom.getRBD().getPaginator4());
		scrollUp(pom.getRBD().getSelectReport());
		waitforvisibilityofelement(pom.getRBD().getSelectReport());
		clickOnElement(pom.getRE().getRuleEdit1());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of White1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of White1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules of White1");
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

		log.info("user select Accepted Value condition of White1");
		dropdowntext(pom.getIIT().getAcceptedValueCondition(), "IN");
		Thread.sleep(5000);

		log.info("user entering value of Accepted Value under II");
		inputOnElement(pom.getIIT().getAcceptedValueVal(), "0,1");
		Thread.sleep(5000);

		log.info("user click on warning button under Accepted Value");
		clickOnElement(pom.getIIT().getAcceptedValueWarning());

		log.info("user click on save button to update Accepted value of White1");
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

		log.info("user click on Referential Integrity to view rule created for White1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the White1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created White1 DataElement Rule");
	}

	@When("^User create rule for RaceNotRept(\\d+) data element$")
	public void user_create_rule_for_RaceNotRept_data_element(int arg1) throws Throwable {

		log.debug("user creating rule for RaceNotRept1 DAtaElement");
		log.info("user click on edit rule button of RaceNotRept1 for creating rule");
		scrollUp(pom.getRBD().getSelectReport());
		waitforvisibilityofelement(pom.getRBD().getSelectReport());
		clickOnElement(pom.getRE().getRuleEdit2());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on Not Null extension bar of RaceNotRept1");
		clickOnElement(pom.getFST().getNotNullMenu());
		waitforvisibilityofelement(pom.getFST().getNotnullCheckbox());

		log.info("user selecting not null checkBox");
		clickOnElement(pom.getFST().getNotnullCheckbox());
		Thread.sleep(5000);

		log.info("user click on NotBlank extenstion bar of RaceNotRept1");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		clickOnElement(pom.getFST().getNotBlankMenu());
		waitforvisibilityofelement(pom.getFST().getNotBlankCheckBox());

		log.info("user selecting not blank checkbox");
		clickOnElement(pom.getFST().getNotBlankCheckBox());
		waitforvisibilityofelement(pom.getFST().getUpdateFileStatus());

		log.info("user click on update button to update the FileStatus rules RaceNotRept1");
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

		log.info("user select Accepted Value condition of RaceNotRept1");
		dropdowntext(pom.getIIT().getAcceptedValueCondition(), "IN");
		Thread.sleep(5000);

		log.info("user entering value of Accepted Value under II");
		inputOnElement(pom.getIIT().getAcceptedValueVal(), "0,1");
		Thread.sleep(5000);

		log.info("user click on warning button under Accepted Value");
		clickOnElement(pom.getIIT().getAcceptedValueWarning());

		log.info("user click on save button to update Accepted value of RaceNotRept1");
		clickOnElement(pom.getIIT().getAcceptedValueSave());
		waitforvisibilityofelement(pom.getIIT().getAcceptedValueSave());

		log.info("user click on Query Builder extension bar");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());
		clickOnElement(pom.getIIT().getQueryBuilderMenuII());
		Thread.sleep(5000);

		log.info("user entering AND condition in textarea under Query Builder ");
		scroll(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		inputOnElement(pom.getIIT().getANDQBII(),
				"RaceNotRept <> ( CASE WHEN (AmInd = '1' OR Asian = '1' OR Black = '1' OR PacIsland = '1' OR White = '1') THEN   '1' WHEN (AmInd = '0' AND Asian = '0' AND Black = '0' AND PacIsland = '0' AND White = '0') THEN   '0' ELSE NULL END)");
		Thread.sleep(5000);

		log.info("user click on Validate Query of RaceNotRept1 under Internal Integrity(II)");
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		inputOnElement(pom.getIIT().getDescriptionQBII(),
				"No NULLs or blanks; at least one Race (not ethnicity!) category contains “1”, but this field reports “1” (“X”);  All Race (not ethnicity!) categories contain “0”, and this field reports “1” (“W”); acceptable codes “0” or “1”");
		Thread.sleep(5000);

		log.info("user click on save button under Query builder of RaceNotRept1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		Thread.sleep(5000);

		log.info("user scrollUp the page to provide Query for warning in RaceNotRept1 Data Element");
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
		inputOnElement(pom.getIIT().getANDQBII(),
				"AmInd = '0' AND Asian = '0' AND Black = '0' AND PacIsland = '0' AND White = '0' AND RaceNotRept = '1'\r\n"
						+ "");
		Thread.sleep(5000);

		log.info("user click on Validate Query of RaceNotRept1 under Internal Integrity(II)");
		clickOnElement(pom.getIIT().getValidateQueryQBII());
		Thread.sleep(5000);

		log.info("user Entering Description in text area");
		inputOnElement(pom.getIIT().getDescriptionQBII(),
				"All Race (not ethnicity!) category contains “0”, and this field reports “0” ");
		Thread.sleep(5000);

		log.info("user click on save button under Query builder of RaceNotRept1");
		clickOnElement(pom.getIIT().getSaveQBII());
		waitforvisibilityofelement(pom.getIIT().getSaveQBII());
		Thread.sleep(5000);

		log.info("user scroll down the page to view Move to Referential");
		scroll(pom.getIIT().getMoveToReferentialintegrity());
		waitforvisibilityofelement(pom.getIIT().getMoveToReferentialintegrity());

		log.info("user click on Move to Referential Integrity button of RaceNotRept1");
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary");
		waitforvisibilityofelement(pom.getRI().getMovetoSummaryButton());
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential integrity tab to view created rule of RaceNotRept1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user clicking on done button to complete the Rule creation of RaceNotRept1 Data Element");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully completed rule creation of RaceNotRept1 data element");

	}

	@When("^User create rule for Gender(\\d+) data element$")
	public void user_create_rule_for_Gender_data_element(int arg1) throws Throwable {

		log.debug("User creating rule for Gender1 element");
        log.info("User click on Gender1 rule edit icon ");
		clickOnElement(pom.getRE().getRuleEdit3());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on LookUp data extension bar to provide details");
		waitforvisibilityofelement(pom.getFST().getLookUpDataMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getFST().getLookUpDataMenu());

		log.info("user selecting lookup data from dropdown menu");
		dropdownGetoptions(pom.getFST().getSelectLookUpDataLD(), "Gender");
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
		
		log.info("user click on Accepted Value extension bar under Internal Integrity Menu");
		waitforvisibilityofelement(pom.getIIT().getAcceptedValueMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getIIT().getAcceptedValueMenu());
		Thread.sleep(5000);

		log.info("user select Accepted Value condition of Gender1");
		dropdowntext(pom.getIIT().getAcceptedValueCondition(), "IN");
		Thread.sleep(5000);

		log.info("user entering value of Accepted Value under II");
		inputOnElement(pom.getIIT().getAcceptedValueVal(), "0");
		Thread.sleep(5000);

		log.info("user click on warning button under Accepted Value");
		clickOnElement(pom.getIIT().getAcceptedValueWarning());

		log.info("user click on save button to update Accepted value of Gender1");
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

		log.info("user click on Referential Integrity to view rule created for Gender1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the Gender1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created Gender1 DataElement Rule");
	}

	@When("^User create rule for Degree(\\d+) data element$")
	public void user_create_rule_for_Degree_data_element(int arg1) throws Throwable {

		log.debug("User creating rule for Degree1 element");
        log.info("User click on Degree1 rule edit icon ");
		clickOnElement(pom.getRE().getRuleEdit4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on LookUp data extension bar to provide details");
		waitforvisibilityofelement(pom.getFST().getLookUpDataMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getFST().getLookUpDataMenu());

		log.info("user selecting lookup data from dropdown menu");
		dropdownGetoptions(pom.getFST().getSelectLookUpDataLD(), "Highest Educational Achievement/Award");
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
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for Degree1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the Degree1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created Degree1 DataElement Rule");
		
	}

	@When("^User create rule for Experience(\\d+) data element$")
	public void user_create_rule_for_Experience_data_element(int arg1) throws Throwable {

		log.debug("User creating rule for Experience1 element");
        log.info("User click on Experience1 rule edit icon ");
		clickOnElement(pom.getRE().getRuleEdit5());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on LookUp data extension bar to provide details");
		waitforvisibilityofelement(pom.getFST().getLookUpDataMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getFST().getLookUpDataMenu());

		log.info("user selecting lookup data from dropdown menu");
		dropdownGetoptions(pom.getFST().getSelectLookUpDataLD(), "Experience in Technical Field");
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
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for Experience1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the Experience1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created Experience1 DataElement Rule");
	}

	@When("^User create rule for Certified(\\d+) data element$")
	public void user_create_rule_for_Certified_data_element(int arg1) throws Throwable {

		log.debug("User creating rule for Certified1 element");
        log.info("User click on Certified1 rule edit icon ");
		clickOnElement(pom.getRE().getRuleEdit6());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);

		log.info("user click on LookUp data extension bar to provide details");
		waitforvisibilityofelement(pom.getFST().getLookUpDataMenu());
		Thread.sleep(5000);
		clickOnElement(pom.getFST().getLookUpDataMenu());

		log.info("user selecting lookup data from dropdown menu");
		dropdownGetoptions(pom.getFST().getSelectLookUpDataLD(), "Experience in Technical Field");
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
		clickOnElement(pom.getIIT().getMoveToReferentialintegrity());
		Thread.sleep(5000);

		log.info("user click on Move To Summary button");
		clickOnElement(pom.getRI().getMovetoSummaryButton());
		Thread.sleep(5000);

		log.info("user click on Referential Integrity to view rule created for Certified1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the Certified1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created Certified1 DataElement Rule");
	}

	@When("^User create rule for FTEArtScience(\\d+) data element$")
	public void user_create_rule_for_FTEArtScience_data_element(int arg1) throws Throwable {

		log.debug("User creating rule for FTEArtScience1 element");
        log.info("User click on FTEArtScience1 rule edit icon ");
		clickOnElement(pom.getRE().getRuleEdit7());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);
		
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

		log.info("user click on Referential Integrity to view rule created for FTEArtScience1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the FTEArtScience1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created FTEArtScience1 DataElement Rule");
	}

	@Then("^User create rule for FTEVoc(\\d+) data element$")
	public void user_create_rule_for_FTEVoc_data_element(int arg1) throws Throwable {

		log.debug("User creating rule for FTEVoc1 element");
        log.info("User click on FTEVoc1 rule edit icon ");
		clickOnElement(pom.getRE().getRuleEdit8());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());

		log.info("user scroll down the page to view create rule page");
		scroll(pom.getFST().getClickMoveToInternalIntegrity());
		waitforvisibilityofelement(pom.getFST().getClickMoveToInternalIntegrity());
		Thread.sleep(5000);
		
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

		log.info("user click on Referential Integrity to view rule created for FTEVoc1");
		scrollUp(pom.getRI().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getRI().getReferentialIntegrityTab());
		clickOnElement(pom.getRI().getReferentialIntegrityTab());

		log.debug("user click on Done button to complete the FTEVoc1 rule creation");
		scroll(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRI().getDoneButton());
		clickOnElement(pom.getRI().getDoneButton());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(9000);
		log.info("user successfully created FTEVoc1 DataElement Rule");
	}

}
