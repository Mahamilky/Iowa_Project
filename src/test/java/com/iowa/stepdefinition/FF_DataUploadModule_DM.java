package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class FF_DataUploadModule_DM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(FF_DataUploadModule_DM.class.getName());

	@Given("^User is on DataUpload Page$")
	public void user_is_on_DataUpload_Page() throws Throwable {

		log.info("User is on DataUpload Page");

	}

	@Given("^User click on Choose button for selection files to be upload$")
	public void user_click_on_Choose_button_for_selection_files_to_be_upload() throws Throwable {

		log.debug("User clicking on choose button for selecting files to be upload");
		waitforvisibilityofelement(pom.getDU().getChooseFile());
		clickOnElement(pom.getDU().getChooseFile());
		log.info("User clicked on choose button sucessfully");

	}

	@Given("^User entering \"([^\"]*)\" for uploading file from popup window$")
	public void user_entering_for_uploading_file_from_popup_window(String arg1) throws Throwable {

		log.debug("User choosing file to be uploaded from popup window");
		Thread.sleep(5000);
		Runtime.getRuntime().exec(arg1);
		log.info("User successfully selected file from popupWindow");
		Thread.sleep(3000);

	}

	@Given("^User click on Upload button for uploading choosen file$")
	public void user_click_on_Upload_button_for_uploading_choosen_file() throws Throwable {

		log.debug("User Click on upload button for uploading selected files");
		waitforvisibilityofelement(pom.getDU().getClickUpload());
		Thread.sleep(5000);
		clickOnElement(pom.getDU().getClickUpload());
		log.info("User Clicked on Upload button successfully");
		Thread.sleep(20000);

	}

	@Then("^Validate file upload completed successfully \"([^\"]*)\"$")
	public void validate_file_upload_completed_successfully(String arg1) throws Throwable {
		log.debug("User Validating file upload complete ");
		scroll(pom.getDU().getValidateInternalIntegrity());
		Thread.sleep(20000);
		waitforvisibilityofelement(driver.findElement(By.xpath(arg1)));
        
		WebElement ValidateFileUploadComplete = driver.findElement(By.xpath(arg1));

		if (ValidateFileUploadComplete.getText().equals("Completed")) {

			log.info("File Upload Successfully Completed:" + ValidateFileUploadComplete.getText());
			Thread.sleep(5000);

		}
		scrollUp(pom.getDU().getChooseFile());
		waitforvisibilityofelement(pom.getDU().getChooseFile());
		Thread.sleep(9000);
	}

}
