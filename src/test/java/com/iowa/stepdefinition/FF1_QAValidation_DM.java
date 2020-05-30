package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class FF1_QAValidation_DM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(FF1_QAValidation_DM.class.getName());

	@Given("^User is on QAValidation Page in DataManagement Module$")
	public void user_is_on_QAValidation_Page_in_DataManagement_Module() throws Throwable {

		log.info("User is on QA Validation Page Under DataManagement Module");
	}

	@When("^User Click on Radio button for selecting file to validate$")
	public void user_Click_on_Radio_button_for_selecting_file_to_validate() throws Throwable {

		log.debug("User clicking on Radio button for selecting particular file for Validation");
		waitforclicktoelement(pom.getQAV().getSelectforValidate());
		clickOnElement(pom.getQAV().getSelectforValidate());
		Thread.sleep(5000);
		log.info("User successfully clicked on Radio Button for file Validation");

	}

	@When("^User click on Validate button$")
	public void user_click_on_Validate_button() throws Throwable {

		log.debug("User click on validate button under validation tab");
		waitforclicktoelement(pom.getQAV().getValidateButton());
		clickOnElement(pom.getQAV().getValidateButton());
		Thread.sleep(6000);
		log.info("User successfully clicked on validate button ");

	}

	@When("^User click on Summary report link in Summary tab under QaValidation page$")
	public void user_click_on_Summary_report_link_in_Summary_tab_under_QaValidation_page() throws Throwable {

		log.debug("User clicking on Summary report link Under SummaryTab");
		waitforvisibilityofelement(pom.getDUS().getSummaryReportClick());
		clickOnElement(pom.getDUS().getSummaryReportClick());
		Thread.sleep(5000);
		log.info("User successfully clicked on Summary report link");

	}

	@When("^User click on confirm summary report$")
	public void user_click_on_confirm_summary_report() throws Throwable {

		log.debug("User clicking on confirm button");
		scroll(pom.getDUS().getSummaryReportconfimButton());
		waitforvisibilityofelement(pom.getDUS().getSummaryReportconfimButton());
		clickOnElement(pom.getDUS().getSummaryReportconfimButton());
		Thread.sleep(5000);
		log.info("User successfully clicked on 'confirm' button");

	}

	@When("^User enter Comments in textarea under summary tab \"([^\"]*)\"$")
	public void user_enter_Comments_in_textarea_under_summary_tab(String arg1) throws Throwable {

		log.debug("User entering comments in text field");
		waitforvisibilityofelement(pom.getDUS().getCommentsTextSummary());
		inputOnElement(pom.getDUS().getCommentsTextSummary(), arg1);
		Thread.sleep(5000);
		log.info("User successfully entered comments in text field");

	}

	@When("^User click on Approve button$")
	public void user_click_on_Approve_button() throws Throwable {

		log.debug("User clicking on Approve button");
		clickOnElement(pom.getQAV().getApproveButton());
		Thread.sleep(5000);
		log.info("User successfully clicked on Approve button");
	}

	@When("^User click on checkbox of file under Approved data grid \"([^\"]*)\"$")
	public void user_click_on_checkbox_of_file_under_Approved_data_grid(String arg1) throws Throwable {

		log.debug("User clicked on checkbox for selecting file to send to IDE");
		scroll(pom.getQAV().getClickSendToIDE());
		waitforvisibilityofelement(driver.findElement(By.xpath(arg1)));
		clickOnElement(driver.findElement(By.xpath(arg1)));
		Thread.sleep(5000);
		log.info("User successfully clicked on CheckBox");

	}

	@When("^user click on Send To IDE button$")
	public void user_click_on_Send_To_IDE_button() throws Throwable {

		log.debug("User clicking on Send To IDE button");
		waitforclicktoelement(pom.getQAV().getClickSendToIDE());
		clickOnElement(pom.getQAV().getClickSendToIDE());
		Thread.sleep(5000);
		log.info("User successfully clicked on Send to IDE button");

	}

	@Then("^User click on OK button for send to Ide confirmation$")
	public void user_click_on_OK_button_for_send_to_Ide_confirmation() throws Throwable {

		log.debug("User clicking on 'OK' button for confirming file to send Ide approval");
		waitforvisibilityofelement(pom.getQAV().getOKButtonSendToIDE());
		clickOnElement(pom.getQAV().getOKButtonSendToIDE());
		Thread.sleep(5000);
		scrollUp(pom.getQAV().getValidateQAValidationPage());
		Thread.sleep(5000);
		log.info("User successfully clicked on 'OK' button");
	}

}
