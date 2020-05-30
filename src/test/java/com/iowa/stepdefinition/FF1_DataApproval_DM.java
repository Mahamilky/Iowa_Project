package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class FF1_DataApproval_DM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(FF1_DataApproval_DM.class.getName());

	@Given("^User is on Home page for Data Approval$")
	public void user_is_on_Home_page_for_Data_Approval() throws Throwable {

		log.info("User is on Homepage for data approval");
	}

	@When("^User click on Approval Menu$")
	public void user_click_on_Approval_Menu() throws Throwable {

		log.debug("User clicking on Approval menu ");
		waitforvisibilityofelement(pom.getDA().getApprovalMenu());
		clickOnElement(pom.getDA().getApprovalMenu());
		Thread.sleep(5000);
		log.info("User successfully clicked on Apprval Menu");
	}

	@When("^User click on Data Approval submenu under Approval menu$")
	public void user_click_on_Data_Approval_submenu_under_Approval_menu() throws Throwable {

		log.debug("User clicking on DataApproval Submenu under Approval menu");
		waitforvisibilityofelement(pom.getDA().getDataApproval());
		clickOnElement(pom.getDA().getDataApproval());
		Thread.sleep(5000);
		log.info("User successfully clicked on DataApproval SubMenu");

	}

	@When("^User is on Data Approval page$")
	public void user_is_on_Data_Approval_page() throws Throwable {

		log.info("Now User is on Data Approval page");

	}

	@When("^User select period from dropdown in Data Approval page$")
	public void user_select_period_from_dropdown_in_Data_Approval_page() throws Throwable {

		log.debug("User selecting period from dropdown in Data Approval page");
		dropdowntext(pom.getDA().getPeriodSelectApproval(), "Annual");
		Thread.sleep(5000);
		log.info("User successfully selected period from dropdown in DataUpload page");

	}

	@When("^Use checking Status of file before selecting file to Approve by getting file name and Status$")
	public void use_checking_Status_of_file_before_selecting_file_to_Approve_by_getting_file_name_and_Status()
			throws Throwable {

		log.debug("User checking status of file before 'Approval' by getting FileName And Status");
		log.info("User checked FileName And Status by getting text: "
				+ pom.getDA().getFileNamecheckBeforeApproval().getText() + " : "
				+ pom.getDA().getFileStatusCheckBeforeApproval().getText());
		Thread.sleep(5000);
	}

	@When("^User click checkbox for selecting file to Approve$")
	public void user_click_checkbox_for_selecting_file_to_Approve() throws Throwable {

		log.debug("User clicking on checkbox for selecting to Approval");
		clickOnElement(pom.getDA().getApprovalSelectCheckbox());
		Thread.sleep(5000);
		log.info("User Sucessfully selected file for approval ");
	}

	@When("^User click on Approve button for aprroving Selected file$")
	public void user_click_on_Approve_button() throws Throwable {

		log.debug("User clicking on Approve button");
		scroll(pom.getDA().getClickApproveButton());
		waitforvisibilityofelement(pom.getDA().getClickApproveButton());
		clickOnElement(pom.getDA().getClickApproveButton());
		Thread.sleep(5000);
		log.info("User successfuly clicked on Approve button");
	}

	@When("^User entering comments in textarea \"([^\"]*)\"$")
	public void user_entering_comments_in_textarea(String arg1) throws Throwable {

		log.debug("User Entering Comments for Approving data");
		inputOnElement(pom.getDA().getApprovalComments(), arg1);
		Thread.sleep(5000);
		clickOnElement(pom.getDA().getApprovalCommentsOK());
		waitforvisibilityofelement(pom.getDA().getSearchBox());
		log.info("User successfully entered Comments in textarea");
	}

	@When("^User Entering college name in search text box for knowing status of approved file$")
	public void user_Entering_college_name_in_search_text_box_for_knowing_status_of_approved_file() throws Throwable {

		log.debug("User entering collegename for validating status of approved file");
		inputOnElement(pom.getDA().getSearchBox(), "Indian");
		Thread.sleep(5000);
		log.info("User successfully entered college name in search box for validating status of Approved file");
	}

	@Then("^User validating DataApproval by geting file name and status of that file$")
	public void user_validating_DataApproval_by_geting_file_name_and_status_of_that_file() throws Throwable {

		log.debug("User validating Status of Approved  file by getting filename and status of that file");
		log.info("User sucessfully validated status of approved file:" + pom.getDA().getFileNameValidate().getText()
				+ " : " + pom.getDA().getStatusValidateFinal().getText());
		Thread.sleep(5000);
		clearOnElement(pom.getDA().getSearchBox());
	}

}
