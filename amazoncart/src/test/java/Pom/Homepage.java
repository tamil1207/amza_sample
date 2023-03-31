package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

//
public class Homepage  extends BaseClass {
	
	public  Homepage() {
	     PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
		 private WebElement Search_Bar;
	
	public WebElement getSearch_Bar() {
		return Search_Bar;
	}
	
	
	
}