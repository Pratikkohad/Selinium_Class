package spicejeet;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.spicejet.com/";
		driver.get(url);
		
		String parent_id = driver.getWindowHandle();
		System.out.println("Parent Id  : - "+ parent_id);
		
		
		driver.findElement(By.xpath("//*[@class ='group-heading'][1]")).click();

		driver.findElement(By.xpath("//*[@id=\"traveller-home\"]/div[2]/div/div/a[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"traveller-home\"]/div[3]/div/div/a[2]/span[1]")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"GST\"]/div/div/a[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"traveller-home\"]/div[5]/div/div/a[2]/span[1]")).click();
		
		Set<String> all_id = driver.getWindowHandles();
		int count = all_id.size();
		
		String[] win_id = new String[count];
		int i =0;
		for(String id:all_id)
		{
			win_id[i]=id;
			i++;
		}
		
		driver.switchTo().window(win_id[2]);
		
		driver.findElement(By.xpath("//input[@name ='UserName']")).sendKeys("Abhi Trupti wating");
		driver.findElement(By.xpath("//input[@name ='LoginPassword']")).sendKeys("123455678");
		Thread.sleep(2000);
		
		
//		driver.switchTo().window(win_id[1]);
//		Thread.sleep(2000);
//		
//		driver.switchTo().window(win_id[3]);
//		Thread.sleep(2000);
//		
//		driver.switchTo().window(win_id[4]);
//		Thread.sleep(2000);
		
	
		
		
		
}
}
