package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletionOfRule_RM {

	public static WebDriver driver;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[1]"))
	private WebElement RuleDelete1;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[2]"))
	private WebElement RuleDelete2;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[3]"))
	private WebElement RuleDelete3;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[4]"))
	private WebElement RuleDelete4;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[5]"))
	private WebElement RuleDelete5;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[6]"))
	private WebElement RuleDelete6;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[7]"))
	private WebElement RuleDelete7;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[8]"))
	private WebElement RuleDelete8;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[9]"))
	private WebElement RuleDelete9;
	
	@FindBy(xpath=("(//i[@class='fa fa-trash text-red'])[10]"))
	private WebElement RuleDelete10;
	
	@FindBy(xpath=("//button[@class='swal2-confirm swal2-styled']"))
	private WebElement DeleteConfirm;
	
	public DeletionOfRule_RM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRuleDelete1() {
		return RuleDelete1;
	}

	public WebElement getRuleDelete2() {
		return RuleDelete2;
	}

	public WebElement getRuleDelete3() {
		return RuleDelete3;
	}

	public WebElement getRuleDelete4() {
		return RuleDelete4;
	}

	public WebElement getRuleDelete5() {
		return RuleDelete5;
	}

	public WebElement getRuleDelete6() {
		return RuleDelete6;
	}

	public WebElement getRuleDelete7() {
		return RuleDelete7;
	}

	public WebElement getRuleDelete8() {
		return RuleDelete8;
	}

	public WebElement getRuleDelete9() {
		return RuleDelete9;
	}

	public WebElement getRuleDelete10() {
		return RuleDelete10;
	}

	public WebElement getDeleteConfirm() {
		return DeleteConfirm;
	}
	
	
}
