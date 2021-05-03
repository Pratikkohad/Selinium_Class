package firefox_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Browser_firefox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Testing\\AUTOMATION\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//FirefoxDriver drivre 
		String url = " https://www.google.com/";
	    driver.get(url);
	    
	    driver.findElement(By.name("q"));
	    
	    System.out.println(driver.getCurrentUrl());
	}
}
