package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataSubmissionDeadline_MD {
	public static WebDriver driver;

	@FindBy(xpath = ("//a[contains(text(),'Data Submission Deadline')]"))
	private WebElement DataSubmissionDeadline;

	@FindBy(xpath = ("//a[contains(text(),'+')]"))
	private WebElement AddButton;

	@FindBy(xpath = ("//span[contains(text(),'- -Select- -')]"))
	private WebElement selectcollege;

	@FindBy(xpath = ("(//span[contains(text(),'07-Hawkeye Community College')])[2]"))
	private WebElement scrolldown;

	@FindBy(xpath = ("(//li[@aria-label='15-Indian Hills Community College'])[2]"))
	private WebElement clickcollege;

	@FindBy(xpath = ("//input[@id='period']"))
	private WebElement selectperiod;

	@FindBy(xpath = ("//input[@name='startDateconfig']"))
	private WebElement clickstartdate;

	@FindBy(xpath = ("(//div[@class='dp-nav-header'])[1]"))
	private WebElement MonthFieldCalenderStart;

	@FindBy(xpath = ("(//button[@class='dp-calendar-nav-left'])[1]"))
	private WebElement PreviousbuttonCalenderStart;

	@FindBy(xpath = ("//button[contains(text(),'14')]"))
	private WebElement choosestartdate;

	@FindBy(xpath = ("//input[@name='endDate']"))
	private WebElement clickenddate;

	@FindBy(xpath = ("(//div[@class='dp-nav-header'])[2]"))
	private WebElement MonthFieldCalenderEnd;

	@FindBy(xpath = ("(//button[@class='dp-calendar-nav-right'])[2]"))
	private WebElement NextbuttonCalenderEnd;

	@FindBy(xpath = ("(//button[contains(text(),'15')])[2]"))
	private WebElement chooseenddate;

	@FindBy(xpath = ("(//span[(@class='ui-multiselect-label ui-corner-all')])[2]"))
	private WebElement selectfiles;

	@FindBy(xpath = ("//span[contains(text(),'Awards')]"))
	private WebElement clickawards;

	@FindBy(xpath = ("//span[contains(text(),'NCAwards')]"))
	private WebElement clickNCawards;

	@FindBy(xpath = ("//span[contains(text(),'Employee')]"))
	private WebElement ClickEmployee;

	@FindBy(xpath = ("//span[contains(text(),'Position')]"))
	private WebElement ClickPosition;

	@FindBy(xpath = ("//button[contains(text(),'Add')]"))
	private WebElement clickAdd;

	@FindBy(xpath = ("//td[contains(text(),'15-Indian Hills Community College')]"))
	private WebElement validateAddPeriod;

	@FindBy(xpath = ("//span[contains(text(),'Reporting Year')]"))
	private WebElement reportingperiod;

	@FindBy(xpath = ("(//input[@name='startDate'])"))
	private WebElement periodstartdate;

	@FindBy(xpath = ("(//div[@class='dp-nav-header'])[3]"))
	private WebElement MonthCalenderPeriodStart;

	@FindBy(xpath = ("(//button[@class='dp-calendar-nav-left'])[3]"))
	private WebElement PreviousButtonPeriodCalenderStart;

	@FindBy(xpath = ("(//button[contains(text(),'14')])[3]"))
	private WebElement choosePeriodStartDate;

	@FindBy(xpath = ("(//input[@name='endDate'])[2]"))
	private WebElement periodenddate;

	@FindBy(xpath = ("(//div[@class='dp-nav-header'])[4]"))
	private WebElement MonthCalenderPeriodEnd;

	@FindBy(xpath = ("(//button[@class='dp-calendar-nav-right'])[4]"))
	private WebElement NextButtonPeriodCalenderEnd;

	@FindBy(xpath = ("(//button[contains(text(),'15')])[4]"))
	private WebElement choosePeriodEndDate;

	@FindBy(xpath = ("//button[contains(text(),'Change')]"))
	private WebElement clickchange;

	@FindBy(xpath = ("//button[contains(text(),'Update')]"))
	private WebElement clickupdate;

	@FindBy(xpath = ("//button[contains(text(),'Yes, change it')]"))
	private WebElement clickchangeit;

	@FindBy(xpath = ("//div[contains(text(),'AY 2020 - 2021')]"))
	private WebElement checkreportyear;

	public DataSubmissionDeadline_MD(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getDataSubmissionDeadline() {
		return DataSubmissionDeadline;
	}

	public WebElement getAddButton() {
		return AddButton;
	}

	public WebElement getSelectcollege() {
		return selectcollege;
	}

	public WebElement getscrolldown() {
		return scrolldown;
	}

	public WebElement getClickcollege() {
		return clickcollege;
	}

	public WebElement getSelectperiod() {
		return selectperiod;
	}

	public WebElement getClickstartdate() {
		return clickstartdate;
	}

	public WebElement getMonthFieldCalenderStart() {
		return MonthFieldCalenderStart;
	}

	public WebElement getPreviousbuttonCalenderStart() {
		return PreviousbuttonCalenderStart;
	}

	public WebElement getChoosestartdate() {
		return choosestartdate;
	}

	public WebElement getClickenddate() {
		return clickenddate;
	}

	public WebElement getMonthFieldCalenderEnd() {
		return MonthFieldCalenderEnd;
	}

	public WebElement getNextbuttonCalenderEnd() {
		return NextbuttonCalenderEnd;
	}

	public WebElement getChooseenddate() {
		return chooseenddate;
	}

	public WebElement getSelectfiles() {
		return selectfiles;
	}

	public WebElement getClickawards() {
		return clickawards;
	}

	public WebElement getClickNCawards() {
		return clickNCawards;
	}

	public WebElement getClickEmployee() {
		return ClickEmployee;
	}

	public WebElement getClickPosition() {
		return ClickPosition;
	}

	public WebElement getClickAdd() {
		return clickAdd;
	}

	public WebElement getValidateAddPeriod() {
		return validateAddPeriod;
	}

	public WebElement getReportingperiod() {
		return reportingperiod;
	}

	public WebElement getPeriodstartdate() {
		return periodstartdate;
	}

	public WebElement getMonthCalenderPeriodStart() {
		return MonthCalenderPeriodStart;
	}

	public WebElement getPreviousButtonPeriodCalenderStart() {
		return PreviousButtonPeriodCalenderStart;
	}

	public WebElement getChoosePeriodStartDate() {
		return choosePeriodStartDate;
	}

	public WebElement getPeriodenddate() {
		return periodenddate;
	}

	public WebElement getMonthCalenderPeriodEnd() {
		return MonthCalenderPeriodEnd;
	}

	public WebElement getNextButtonPeriodCalenderEnd() {
		return NextButtonPeriodCalenderEnd;
	}

	public WebElement getChoosePeriodEndDate() {
		return choosePeriodEndDate;
	}

	public WebElement getClickchange() {
		return clickchange;
	}

	public WebElement getClickupdate() {
		return clickupdate;
	}

	public WebElement getClickchangeit() {
		return clickchangeit;
	}

	public WebElement getCheckreportyear() {
		return checkreportyear;
	}

}
