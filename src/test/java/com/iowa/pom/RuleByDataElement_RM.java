package com.iowa.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RuleByDataElement_RM {
	public static WebDriver driver;

	@FindBy(xpath = ("//a[contains(text(),'Rules by Data Element')]"))
	private WebElement clickRuleByDataElement;

	@FindBy(tagName = ("select"))
	private WebElement selectReport;

	@FindBy(xpath = "//a[contains(text(),'Commcollege')]")
	private WebElement Commcollege;
	
	@FindBy(xpath=("//a[contains(text(),'1')]"))
    private WebElement Paginator1;
	
	@FindBy(xpath=("//a[contains(text(),'2')]"))
	private WebElement Paginator2;
	
	@FindBy(xpath=("//a[contains(text(),'3')]"))
	private WebElement Paginator3;
	
	@FindBy(xpath=("//a[contains(text(),'4')]"))
	private WebElement Paginator4;
	
	@FindBy(xpath=("//span[@class='ui-paginator-icon pi pi-caret-left']"))
	private WebElement BeforePaginator;
	
	@FindBy(xpath=("//span[@class='ui-paginator-icon pi pi-caret-right']"))
	private WebElement NextPaginator;
	
	

	public RuleByDataElement_RM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickRuleByDataElement() {
		return clickRuleByDataElement;
	}

	public WebElement getSelectReport() {
		return selectReport;
	}

	public WebElement getCommcollege() {
		return Commcollege;
	}

	public WebElement getPaginator1() {
		return Paginator1;
	}

	public WebElement getPaginator2() {
		return Paginator2;
	}

	public WebElement getPaginator3() {
		return Paginator3;
	}
	
	public WebElement getPaginator4() {
		return Paginator4;
	}

	public WebElement getBeforePaginator() {
		return BeforePaginator;
	}

	public WebElement getNextPaginator() {
		return NextPaginator;
	} 

	
}
