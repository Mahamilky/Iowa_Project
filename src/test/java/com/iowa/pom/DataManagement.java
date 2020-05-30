package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class DataManagement {
	
public static WebDriver driver;

  @FindBy(xpath=("(//a[@class='ng-star-inserted'])[3]"))
  private WebElement SwitchUser;
  
  @FindBy(xpath=("//button[@class='swal2-confirm swal2-styled']"))
  private WebElement switchUserOk;
  
  @FindBy(xpath=("//h5[contains(text(),'Hello, Maha Lakshmi !')]"))
  private WebElement ValidateSitchuserPage;
  
  @FindBy(xpath=("//a[contains(text(),'Data Management ')]"))
  private WebElement DataManagement;
  
  @FindBy(xpath=("//a[contains(text(),'Upload')]"))
  private WebElement ClickUpload;
  
  @FindBy(xpath=("//h6[contains(text(),'Data Upload ')]"))
  private WebElement ValidateUploadPage;
  
  @FindBy(xpath=("(//select[@class='form-control custom-select ng-untouched ng-pristine ng-valid'])[1]"))
  private WebElement selectPeriod;
  
  public DataManagement(WebDriver ldriver)  {
	  this.driver = ldriver;
	  PageFactory.initElements(driver, this);
  }

public WebElement getSwitchUser() {
	return SwitchUser;
}

public WebElement getSwitchUserOk() {
	return switchUserOk;
}

public WebElement getValidateSitchuserPage() {
	return ValidateSitchuserPage;
}

public WebElement getDataManagement() {
	return DataManagement;
}

public WebElement getClickUpload() {
	return ClickUpload;
}

public WebElement getValidateUploadPage() {
	return ValidateUploadPage;
}

public WebElement getSelectPeriod() {
	return selectPeriod;
}

}
