package windowHandler;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandler {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// This code is about to search the user using given Credential which is already
		// in the list

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// It return Id of parent class
		String parentId = driver.getWindowHandle();
		System.out.println("Parent id id  :- " + parentId);

		WebElement handle = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		handle.click();

		Set<String> all = driver.getWindowHandles();
		
		Iterator<String> id = all.iterator();
		
		String parent = id.next();
		System.out.println("Parent ID is :-     "+parent);
		
		String child = id.next();
		System.out.println("Child ID is :-     "+child);
		
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//a[@class = 'btn-orange trial-btn pulse ']")).click();
		
		driver.findElement(By.xpath("//input[@name = 'FirstName']")).sendKeys("Wating");
		
		
		
	}
}
