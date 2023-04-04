package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Baseclass.BaseClass;

public class Prodect_page extends BaseClass {

	public Prodect_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//span[@data-csa-c-type='widget'])[1]")
	private WebElement Sort;

	public WebElement getSort() {
		return Sort;
	}
	@FindBy(xpath = "(//a[@aria-hidden='true'])[13]")
	private WebElement price;

	public WebElement getprice() {
		return price;
	}
	@FindBy(xpath = "(//*[contains(text(),'Apple iPhone 14 Pro Max (1 TB) - Gold')])[1]")
	private WebElement phone;
	
	public WebElement getphone() {
		return phone;
	}
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement cart;
	
	public WebElement get_tocart() {
		return cart;
	}
	
	
	
}