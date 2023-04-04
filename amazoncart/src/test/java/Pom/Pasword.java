package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Pasword extends BaseClass {
  
	public Pasword() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;
	
	public WebElement getpass() {
		 return pass ;
	}
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement passbtn;
	
	public WebElement getpassbtn() {
		 return passbtn ;
	}
}

