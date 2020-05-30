package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class FF_DataUploadSummary_DM extends BaseClassIowa {
	
	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(FF_DataUploadSummary_DM.class.getName());

	@Given("^User is on Referential Integrity tab in Upload page$")
	public void user_is_on_Referential_Integrity_tab_in_Upload_page() throws Throwable {
	    
	   log.info("User is on Referential Integrity tab under Upload Page");
	   
	}

	@When("^Validate fileUpload progress under Referential Integrity \"([^\"]*)\"$")
	public void validate_fileUpload_progress_under_Referential_Integrity(String arg1) throws Throwable {
		
		log.debug("User validating Referential Integrity Progress status ");
		scroll(pom.getDUS().getViewAndValidateSummary());
		waitforvisibilityofelement(driver.findElement(By.xpath(arg1)));
		Thread.sleep(9000);
		log.info("User successfully validated Progress Status of Referential Integrity:" +driver.findElement(By.xpath(arg1)).getText());
		
	}
	
	@When("^User select particular file to move summary in Referential Integrity tab \"([^\"]*)\"$")
	public void user_select_particular_file_to_move_summary_in_Referential_Integrity_tab(String arg1) throws Throwable {
	    
		log.info("User Clicking on Radio Button for Moving Particular file to Summary");
		Thread.sleep(9000);
		waitforvisibilityofelement(driver.findElement(By.xpath(arg1)));
		clickOnElement(driver.findElement(By.xpath(arg1)));
		log.debug("User successfully clicked on Radio Button for moving file to summary");
	   
	}

	@When("^User click on view and validate summary button$")
	public void user_click_on_view_and_validate_summary_button() throws Throwable {
		
	     log.debug("User Clicking on View And Validate Summary button");
	     Thread.sleep(9000);
	     waitforclicktoelement(pom.getDUS().getViewAndValidateSummary());
	     clickOnElement(pom.getDUS().getViewAndValidateSummary());
	     log.info("User Successfully clicked on View and validate button");
	}

	@When("^User is on Summary Tab Under FileUpload page$")
	public void user_is_on_Summary_Tab_Under_FileUpload_page() throws Throwable {
	    
		log.info("User is on Summary Tab under Upload Page ");
	   
	}

	
	
	@When("^User click on uploaded file report in Reports Summary grid under Summary tab$")
	public void user_click_on_uploaded_file_report_in_Reports_Summary_grid_under_Summary_tab() throws Throwable {
	    
	   log.debug("User clicking on uploaded file report link under Summary tab");
	   waitforvisibilityofelement(pom.getDUS().getSummaryReportClick());
	   clickOnElement(pom.getDUS().getSummaryReportClick());
	   Thread.sleep(5000);
	   log.info("User Successfully clicked on uploaded file report link");
	}

	@When("^User click on Confirm button for report validation$")
	public void user_click_on_Confirm_button_for_report_validation() throws Throwable {
	    
		log.debug("User clicking on Confirm button for file report validation");
		scroll(pom.getDUS().getSummaryReportconfimButton());
		waitforvisibilityofelement(pom.getDUS().getSummaryReportconfimButton());
		clickOnElement(pom.getDUS().getSummaryReportconfimButton());
		Thread.sleep(5000);
		log.debug("User successfully clicked on Confirm button ");
	   
	}

	@When("^User entering Comments in Comment text field \"([^\"]*)\"$")
	public void user_entering_Comments_in_Comment_text_field(String arg1) throws Throwable {
	    
	   log.debug("User entering Comments in text field");
	   inputOnElement(pom.getDUS().getCommentsTextSummary(), arg1);
	   Thread.sleep(5000);
	   log.debug("User Successfully Entered comments in text field");
	}

	@When("^User click on Submit button$")
	public void user_click_on_Submit_button() throws Throwable {
	    
		log.debug("User clicking on submit button under Summary tab");
		clickOnElement(pom.getDUS().getSubmitButtonSummary());
		Thread.sleep(5000);
		waitforvisibilityofelement(pom.getDUS().getOKforQAApproval());
		clickOnElement(pom.getDUS().getOKforQAApproval());
		Thread.sleep(5000);
		log.info("User successfully clicked on Submit button");
	   
	}

	@Then("^User click on Referential Integrity Tab$")
	public void user_click_on_Referential_Integrity_Tab() throws Throwable {
	    
		log.debug("User clicking on Referential Integrity tab under Upload page");
		scrollUp(pom.getDUS().getReferentialIntegrityTab());
		waitforvisibilityofelement(pom.getDUS().getReferentialIntegrityTab());
		clickOnElement(pom.getDUS().getReferentialIntegrityTab());
		Thread.sleep(9000);
	   log.info("User successfully clicked on Referential Integrity tab");
		
	}


}
