package Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void browser(String url) {

				driver = new EdgeDriver();
 				driver.manage().window().maximize();
 				driver.get(url);
	}
	
	public static void input(WebElement web, String value) {

		web.sendKeys(value);
	}
	public static WebDriver implicitywait(int num) {
		driver.manage().timeouts().implicitlyWait(num,TimeUnit.SECONDS);
		return driver;
	}
}