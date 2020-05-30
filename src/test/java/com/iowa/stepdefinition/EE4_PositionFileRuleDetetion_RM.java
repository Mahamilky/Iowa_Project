package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class EE4_PositionFileRuleDetetion_RM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(EE4_PositionFileRuleDetetion_RM.class);

	@When("^User select position Report from Select report dropdown$")
	public void user_select_position_Report_from_Select_report_dropdown() throws Throwable {

		log.debug("User select Position file from dropdown");
		clickOnElement(pom.getRBD().getPaginator1());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		scrollUp(pom.getRBD().getSelectReport());
		waitforvisibilityofelement(pom.getRBD().getCommcollege());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		dropdowntext(pom.getRBD().getSelectReport(), "Position");
		Thread.sleep(5000);
		log.info("User successfully selected POsition file from dropdown");
	}

	@When("^User delete Commcollege(\\d+) element Rule$")
	public void user_delete_Commcollege_element_Rule(int arg1) throws Throwable {

		log.debug("User clicking on Commcolege1 rule delete icon");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete8());
		waitforclicktoelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted Commcollege1 rule");

	}

	@When("^User delete SSN(\\d+) element Rule$")
	public void user_delete_SSN_element_Rule(int arg1) throws Throwable {

		log.debug("User clicking on SSN1 rule delete icon");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete9());
		waitforclicktoelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted SSN1 rule");

	}

	@When("^User delete PositionCode(\\d+) element Rule$")
	public void user_delete_PositionCode_element_Rule(int arg1) throws Throwable {

		log.debug("User clicking on PositionCode1 rule delete icon");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete10());
		waitforclicktoelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted PositionCode1 rule");

	}

	@When("^User delete EmployType(\\d+) element Rule$")
	public void user_delete_EmployType_element_Rule(int arg1) throws Throwable {

		log.debug("User clicking on EmployType1 rule delete icon");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		clickOnElement(pom.getRBD().getPaginator2());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete1());
		waitforclicktoelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted EmployType1 rule");

	}

	@When("^User delete PositionTotEarn(\\d+) element Rule$")
	public void user_delete_PositionTotEarn_element_Rule(int arg1) throws Throwable {

		log.debug("User clicking on PositionTotEarn1 rule delete icon");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		clickOnElement(pom.getRBD().getPaginator2());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete2());
		waitforclicktoelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted PositionTotEarn1 rule");

	}

	@When("^User delete BaseSalary(\\d+) element Rule$")
	public void user_delete_BaseSalary_element_Rule(int arg1) throws Throwable {

		log.debug("User clicking on BaseSalary1 rule delete icon");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		clickOnElement(pom.getRBD().getPaginator2());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete3());
		waitforclicktoelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted BaseSalary1 rule");
	}

	@Then("^User delete DaysInContract(\\d+) element Rule$")
	public void user_delete_DaysInContract_element_Rule(int arg1) throws Throwable {

		log.debug("User clicking on DaysInContract1 rule delete icon");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		clickOnElement(pom.getRBD().getPaginator2());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete4());
		waitforclicktoelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted DaysInContract1 rule");

	}

}
