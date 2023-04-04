package Stepdefinition;

import org.openqa.selenium.WebDriver;
import Baseclass.BaseClass;
import Pom.Homepage;
import Pom.Pasword;
import Pom.Prodect_page;
import Pom.Username;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {
	public WebDriver driver;

	@Given("Open the browser launch url")
	public void open_the_browser_launch_url() {
		browser("https://www.amazon.in/");
	}
	
	@Then("click sign")
	public void click_sign() {
		Username sig =  new Username();
	 click(sig.getsign());
	
	}

	@Then("navigate to the sign page enter the credenctial")
	public void navigate_to_the_sign_page_enter_the_credenctial() {
		Username sig =  new Username();
		 input(sig.getsig(), "9486672061");
		 click(sig.getsigbtn());
		 

	}

	@Then("navigate to the password page enter the credenctial")
	public void navigate_to_the_password_page_enter_the_credenctial() {
		Pasword pa = new Pasword();
		input(pa.getpass(), "S@ndron1207");
		click(pa.getpassbtn());

	}

	@When("navigate to home page and  Search the prodect")
	public void navigate_to_home_page_and_search_the_prodect() {
		Homepage home = new Homepage();
		implicitywait(10);
		input(home.getSearch_Bar(), "iphone 14 pro");
	}

	@Given("click the workspce button")
	public void click_the_workspcebutton() {
		Homepage clic = new Homepage();
		click(clic.getClick());
	}

	@Then("sort high to low")
	public void sort_high_to_low() {
		Prodect_page sort = new Prodect_page();
		click(sort.getSort());
		click(sort.getprice());
		//driver.quit();
	}
	@Then("Click the second option")
	public void click_the_second_option() {
		Prodect_page ph = new Prodect_page();
		click(ph.getphone());
	
	}
	@Then("Navigate  to the Prodect page")
	public void navigate_to_the_prodect_page() {
		driver.switchTo().window("Apple iPhone 14 Pro Max (1 TB) - Gold");

	}

	@Then("click to Add cart button")
	public void click_to_add_cart_button() {
		Prodect_page pr = new Prodect_page();
		click(pr.get_tocart());

		
	}

	@Then("Verify the prodect")
	public void verify_the_prodect() {

		
	}

}
