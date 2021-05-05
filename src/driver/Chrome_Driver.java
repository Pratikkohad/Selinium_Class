package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Driver 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\prati\\OneDrive\\Desktop\\Test1.html");
		
//		WebElement radio = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[1]/div[1]/div/div[2]/label"));
//		radio.click();
//		
//		if (radio.isSelected()) 
//		{
//			System.out.println("Check Box is Working");
//		}
//		else
//		{
//			System.out.println("Check Box is Not  Working");
//		}
	}
}
