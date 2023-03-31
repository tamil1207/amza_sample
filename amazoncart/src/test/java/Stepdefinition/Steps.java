package Stepdefinition;



import org.openqa.selenium.WebDriver;

import Baseclass.BaseClass;
import Pom.Homepage;
import io.cucumber.java.en.Given;
	
public class Steps extends BaseClass {
public WebDriver driver;
@Given("Open the browser launch url")
public  void open_the_browser_launch_url() {
	browser("https://www.amazon.in/");
}
@Given("click the workspce button")
public  void click_the_workspce_button() {
	Homepage home = new Homepage();
	implicitywait(10);
	input(home.getSearch_Bar(),"iphone 13");
	
}
}
