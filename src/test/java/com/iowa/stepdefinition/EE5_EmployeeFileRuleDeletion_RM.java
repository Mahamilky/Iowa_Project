package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import com.iowa.baseclass.BaseClassIowa;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class EE5_EmployeeFileRuleDeletion_RM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(EE5_EmployeeFileRuleDeletion_RM.class);

	@When("^User Select Employee Report from dropdown$")
	public void user_Select_Employee_Report_from_dropdown() throws Throwable {

		log.debug("User select Employee file from report dropdown");
		waitforvisibilityofelement(pom.getRBD().getPaginator1());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator1());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		scrollUp(pom.getRBD().getSelectReport());

		waitforclicktoelement(pom.getRBD().getSelectReport());
		dropdowntext(pom.getRBD().getSelectReport(), "Employee");
		Thread.sleep(5000);
		log.info("User successfully selected employee file ");
	}

	@When("^User deleting Rule of CommCollege(\\d+) element$")
	public void user_deleting_Rule_of_CommCollege_element(int arg1) throws Throwable {

		log.debug("User deleting rule of CommCollege1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator2());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete10());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted CommCollege1 element");

	}

	@When("^User deleting Rule of SSN(\\d+) element$")
	public void user_deleting_Rule_of_SSN_element(int arg1) throws Throwable {

		log.debug("User deleting rule of SSN1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		scrollUp(pom.getRBD().getSelectReport());
		clickOnElement(pom.getDOR().getRuleDelete1());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted SSN1 element");

	}

	@When("^User deleting Rule of LastName(\\d+) element$")
	public void user_deleting_Rule_of_LastName_element(int arg1) throws Throwable {

		log.debug("User deleting rule of LastName1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		scrollUp(pom.getRBD().getSelectReport());
		clickOnElement(pom.getDOR().getRuleDelete2());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted LastName1 element");

	}

	@When("^User deleting Rule of FirstName(\\d+) element$")
	public void user_deleting_Rule_of_FirstName_element(int arg1) throws Throwable {

		log.debug("User deleting rule of FirstName1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete3());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted FirstName1 element");
	}

	@When("^User deleting Rule of MInit(\\d+) element$")
	public void user_deleting_Rule_of_MInit_element(int arg1) throws Throwable {

		log.debug("User deleting rule of MInit1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete4());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted MInit1 element");

	}

	@When("^User deleting Rule of BirthDate(\\d+) element$")
	public void user_deleting_Rule_of_BirthDate_element(int arg1) throws Throwable {

		log.debug("User deleting rule of BirthDate1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete5());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted BirthDate1 element");

	}

	@When("^User deleting Rule of Ethnicity(\\d+) element$")
	public void user_deleting_Rule_of_Ethnicity_element(int arg1) throws Throwable {

		log.debug("User deleting rule of Ethnicity1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete6());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted Ethnicity1 element");

	}

	@When("^User deleting Rule of AmInd(\\d+) element$")
	public void user_deleting_Rule_of_AmInd_element(int arg1) throws Throwable {

		log.debug("User deleting rule of AmInd1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete7());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted AmInd1 element");

	}

	@When("^User deleting Rule of Asian(\\d+) element$")
	public void user_deleting_Rule_of_Asian_element(int arg1) throws Throwable {

		log.debug("User deleting rule of Asian1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete8());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted Asian1 element");

	}

	@When("^User deleting Rule of Black(\\d+) element$")
	public void user_deleting_Rule_of_Black_element(int arg1) throws Throwable {

		log.debug("User deleting rule of Black1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete9());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted Black1 element");

	}

	@When("^User deleting Rule of PacIsland(\\d+) element$")
	public void user_deleting_Rule_of_PacIsland_element(int arg1) throws Throwable {

		log.debug("User deleting rule of PacIsland1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator3());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete10());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted PacIsland1 element");

	}

	@When("^User deleting Rule of White(\\d+) element$")
	public void user_deleting_Rule_of_White_element(int arg1) throws Throwable {

		log.debug("User deleting rule of White1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		Thread.sleep(5000);
		scrollUp(pom.getRBD().getSelectReport());
		clickOnElement(pom.getDOR().getRuleDelete1());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted White1 element");

	}

	@When("^User deleting Rule of RaceNotRept(\\d+) element$")
	public void user_deleting_Rule_of_RaceNotRept_element(int arg1) throws Throwable {

		log.debug("User deleting rule of RaceNotRept1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		Thread.sleep(5000);
		scrollUp(pom.getRBD().getSelectReport());
		clickOnElement(pom.getDOR().getRuleDelete2());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted RaceNotRept1 element");

	}

	@When("^User deleting Rule of Gender(\\d+) element$")
	public void user_deleting_Rule_of_Gender_element(int arg1) throws Throwable {

		log.debug("User deleting rule of Gender1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete3());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted Gender1 element");
	}

	@When("^User deleting Rule of Degree(\\d+) element$")
	public void user_deleting_Rule_of_Degree_element(int arg1) throws Throwable {

		log.debug("User deleting rule of Degree1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete4());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted Degree1 element");
	}

	@When("^User deleting Rule of Experience(\\d+) element$")
	public void user_deleting_Rule_of_Experience_element(int arg1) throws Throwable {

		log.debug("User deleting rule of Experience1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete5());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted Experience1 element");

	}

	@When("^User deleting Rule of Certified(\\d+) element$")
	public void user_deleting_Rule_of_Certified_element(int arg1) throws Throwable {

		log.debug("User deleting rule of Certified1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete6());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted Certified1 element");

	}

	@When("^User deleting Rule of FTEArtScience(\\d+) element$")
	public void user_deleting_Rule_of_FTEArtScience_element(int arg1) throws Throwable {

		log.debug("User deleting rule of FTEArtScience1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete7());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted FTEArtScience1 element");

	}

	@Then("^User deleting Rule of FTEVoc(\\d+) element$")
	public void user_deleting_Rule_of_FTEVoc_element(int arg1) throws Throwable {

		log.debug("User deleting rule of FTEVoc1 element");
		scroll(pom.getRBD().getNextPaginator());
		waitforvisibilityofelement(pom.getRBD().getNextPaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getRBD().getPaginator4());
		waitforvisibilityofelement(pom.getRBD().getBeforePaginator());
		Thread.sleep(5000);
		clickOnElement(pom.getDOR().getRuleDelete8());
		waitforvisibilityofelement(pom.getDOR().getDeleteConfirm());
		clickOnElement(pom.getDOR().getDeleteConfirm());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		Thread.sleep(5000);
		log.info("User successfully deleted FTEVoc1 element");

	}

}
