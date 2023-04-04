package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Username extends BaseClass{
	public Username() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[contains(text(),'Hello, sign in')]")
	private WebElement sign;
	
	public WebElement getsign() {
  return sign;
}
	@FindBy(xpath = "//input[@type='email']")
	private WebElement sig;
	
	public WebElement getsig() {
  return sig;
}
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement sigbtn;
	
	public WebElement getsigbtn() {
		return sigbtn;
	}
}