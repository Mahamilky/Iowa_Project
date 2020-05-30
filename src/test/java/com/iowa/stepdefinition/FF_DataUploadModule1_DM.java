package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class FF_DataUploadModule1_DM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(FF_DataUploadModule1_DM.class.getName());

	@Given("^User is on Upload page under DataManagement menu$")
	public void user_is_on_Upload_page_under_DataManagement_menu() throws Throwable {

		log.info("User is on Data Upload page");

	}

	@When("^User click on Selectall checkbox in fileStatus grid header under DataSubmission tab$")
	public void user_click_on_Selectall_checkbox_in_fileStatus_grid_header_under_DataSubmission_tab() throws Throwable {

		log.debug("User clicking on select all checkBox in FileStatus grid header");
		scroll(pom.getDU().getValidateInternalIntegrity());
		waitforvisibilityofelement(pom.getDU().getValidateInternalIntegrity());
		Thread.sleep(9000);
		clickOnElement(pom.getDU1().getSelectallCheckBox());
		Thread.sleep(5000);
		log.info("User clicked on SelectAll Checkbox in FileStatus Grid header");

	}

	@When("^User clik on Validate Internal Integrity button$")
	public void user_clik_on_Validate_Internal_Integrity_button() throws Throwable {

		log.debug("User Clicking on Validate InternalIntegrity button");
		Thread.sleep(9000);
		clickOnElement(pom.getDU().getValidateInternalIntegrity());
		Thread.sleep(5000);
		log.info("User Successfully Clicked on Validate Internal Integrity button ");
	}

	@When("^User now on Internal Integrity tab in Upload page$")
	public void user_now_on_Internal_Integrity_tab_in_Upload_page() throws Throwable {

		log.info("User is on Internal Integrity tab under Upload sub-module ");
		
	}

	@When("^User click on Selectall checkbox in filestatus grid header under Internal Integrity tab$")
	public void user_click_on_Selectall_checkbox_in_filestatus_grid_header_under_Internal_Integrity_tab()
			throws Throwable {

		log.debug("User clicking on SelectAll checkbox under Internal Integrity tab");
		scroll(pom.getDU1().getValidateReferentialIntegrity());
		waitforvisibilityofelement(pom.getDU1().getValidateReferentialIntegrity());
		Thread.sleep(5000);
		clickOnElement(pom.getDU1().getIISelectAllCheckbox());
		Thread.sleep(5000);
		log.info("User Successfully clicked on SelectAll Checkbox under Internal Integrity tab");
	}

	@Then("^User click On Validate referential Integrity button$")
	public void user_click_On_Validate_referential_Integrity_button() throws Throwable {

		log.debug("User Clicking on Validate Referential Integrity button");
		clickOnElement(pom.getDU1().getValidateReferentialIntegrity());
		Thread.sleep(5000);
		log.info("User Clicked on Validate Referential Integrity button");
		
	}

}