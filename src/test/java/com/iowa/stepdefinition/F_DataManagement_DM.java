package com.iowa.stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class F_DataManagement_DM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(F_DataManagement_DM.class.getName());

	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {

		log.info("user is on home page");

	}

	@When("^User click on MasterData$")
	public void user_click_on_MasterData() throws Throwable {

		log.debug("user clicking on master data ");
		Thread.sleep(9000);
		clickOnElement(pom.getUM().getMasterData());
		log.info("user successfully clicked on master data ");
	}

	@When("^User click on UserManagement under Master Data$")
	public void user_click_on_UserManagement_under_Master_Data() throws Throwable {

		log.debug("user clicking on user managenent under master data menu");
		clickOnElement(pom.getUM().getUserManagement());
		log.info("user successfully clicked on user management menu");
		waitforclicktoelement(pom.getUM().getAddButton());
	}

	@When("^User switching to acoount by clicking on swith user$")
	public void user_switching_to_acoount_by_clicking_on_swith_user() throws Throwable {

		log.debug("user clicking on Switch User Account");
		waitforclicktoelement(pom.getDM().getSwitchUser());
		Thread.sleep(6000);
		clickOnElement(pom.getDM().getSwitchUser());
		log.info("user successfully clicked on Switch user ");

		log.debug("user click on 'OK' to confirm go to Switch user Account ");
		waitforclicktoelement(pom.getDM().getSwitchUserOk());
		clickOnElement(pom.getDM().getSwitchUserOk());
		log.info("user successfully clicked on 'OK' to confirm go to SwitchUser Accont");
	}

	@When("^validate whether user redirected to the SwitchUser Account$")
	public void validate_whether_user_redirected_to_the_SwitchUser_Account() throws Throwable {

		waitforclicktoelement(pom.getDM().getValidateSitchuserPage());
		log.debug("validating user sucessfull entry into account");
		log.info("User validating by getting hello message:" + pom.getDM().getValidateSitchuserPage().getText());

	}

	@When("^User click on DataManagement Menu$")
	public void user_click_on_DataManagement_Menu() throws Throwable {

		log.debug("User clickig on DataManagement Menu");
		// waitforclicktoelement(pom.getDM().getDataManagement());
		Thread.sleep(9000);
		clickOnElement(pom.getDM().getDataManagement());
		log.info("User clicked on DataManagement menu");
	}

	@When("^User choose Upload submenu from Datamanagement menu$")
	public void user_choose_Upload_submenu_from_Datamanagement_menu() throws Throwable {

		/*
		 * log.debug("User choose 'Upload' submenu from DataManagement ");
		 * waitforclicktoelement(pom.getDM().getClickUpload());
		 * clickOnElement(pom.getDM().getClickUpload());
		 * log.info("User successfully selected 'upload' submenu"); Thread.sleep(9000);
		 */

		log.debug("User choose 'QA Validation' SubMenu from DataManagement menu");
		waitforclicktoelement(pom.getQAV().getQAValidation());
		clickOnElement(pom.getQAV().getQAValidation());
		Thread.sleep(9000);
		log.info("User successfully selected 'QA Validation' submenu");
	}

	@When("^Validate whether user redirected to Upload page$")
	public void validate_whether_user_redirected_to_Upload_page() throws Throwable {

		/*
		 * log.debug(" validating user redirected to data upload page");
		 * waitforclicktoelement(pom.getDM().getValidateUploadPage());
		 * log.info("Validated data upload page by getting text:"
		 * +pom.getDM().getValidateUploadPage().getText());
		 */

		log.debug("Validating user redirected to QA Validation Page");
		waitforvisibilityofelement(pom.getQAV().getValidateQAValidationPage());
		log.info(
				"validated QA Validation page by getting text:" + pom.getQAV().getValidateQAValidationPage().getText());

	}

	@Then("^User selecting Period for file upload$")
	public void user_selecting_Period_for_file_upload() throws Throwable {

		/*
		 * log.debug("user selecting period of file upload from dropdown");
		 * dropdowntext(pom.getDM().getSelectPeriod(), "Annual");
		 * log.info("User successully selected period of file upload from dropdown");
		 * Thread.sleep(9000);
		 */

		log.debug("User selecting period for QA Validation");
		dropdowntext(pom.getQAV().getSelectPeriodQAValidation(), "Annual");
		Thread.sleep(5000);
		log.info("User successfully selected period for QA Validation");
	}

}
