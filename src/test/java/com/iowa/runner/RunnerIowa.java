package com.iowa.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\iowa\\feature", glue = "com\\iowa\\stepdefinition",

		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:Report/reports.html",
				"pretty:target/cucumber.pretty.txt", "html:target/cucumber.html.Report", "junit:target/cucumber.xml",
				"json:target/Cucumber_report/cucumber.json" },

		monochrome = true, dryRun = false, strict = true, tags = {
				"@Login,@RuleByDataElement_RM,@EmployeeFileRuleCreation_RM,@EmployeeFileRuleCreation1_RM,@EmployeeFileRuleDeletion_RM" })
//@EmployeeFileRuleCreation_RM,@EmployeeFileRuleCreation1_RM,@EmployeeFileRuleDeletion_RM
public class RunnerIowa {
	public static WebDriver driver;

	@BeforeClass
	public static void browserSetup() throws IOException {
		String browserName = FileReaderManager.getInstance().getcrInstance().BrowserName();
		driver = BaseClassIowa.browserLaunch(browserName);

	}

	@AfterClass
	public static void browserquit() {
		driver.quit();

	}
}
