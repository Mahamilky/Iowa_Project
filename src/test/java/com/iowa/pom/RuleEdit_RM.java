package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RuleEdit_RM {
	
 public static WebDriver driver;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[1]"))
 private WebElement RuleEdit1;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[2]"))
 private WebElement RuleEdit2;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[3]"))
 private WebElement RuleEdit3;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[4]"))
 private WebElement RuleEdit4;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[5]"))
 private WebElement RuleEdit5;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[6]"))
 private WebElement RuleEdit6;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[7]"))
 private WebElement RuleEdit7;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[8]"))
 private WebElement RuleEdit8;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[9]"))
 private WebElement RuleEdit9;
 
 @FindBy(xpath=("(//i[@class='fa fa-pencil text-success  mr-3'])[10]"))
 private WebElement RuleEdit10;
 
 public RuleEdit_RM(WebDriver ldriver) {
	  this.driver = ldriver;
	  PageFactory.initElements(driver, this);
 }

public WebElement getRuleEdit1() {
	return RuleEdit1;
}

public WebElement getRuleEdit2() {
	return RuleEdit2;
}

public WebElement getRuleEdit3() {
	return RuleEdit3;
}

public WebElement getRuleEdit4() {
	return RuleEdit4;
}

public WebElement getRuleEdit5() {
	return RuleEdit5;
}

public WebElement getRuleEdit6() {
	return RuleEdit6;
}

public WebElement getRuleEdit7() {
	return RuleEdit7;
}

public WebElement getRuleEdit8() {
	return RuleEdit8;
}

public WebElement getRuleEdit9() {
	return RuleEdit9;
}

public WebElement getRuleEdit10() {
	return RuleEdit10;
}
 
 
}
