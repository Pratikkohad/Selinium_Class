package orangeHRM_Project;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScannerClass {
	static WebDriver driver;
	static String user,pass;
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		 driver  =new ChromeDriver(); 
		 
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Scanner sc = new Scanner(System.in);
		
		
		 System.out.print("Enter the UserNnme :-");
		 user = sc.nextLine();
		 driver.findElement(By.id("txtUsername")).sendKeys(user);
		 
	
		 System.out.print("Enter the Password :-");
		 pass= sc.nextLine();
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 
		 driver.findElement(By.id("btnLogin")).click();

	}

}
