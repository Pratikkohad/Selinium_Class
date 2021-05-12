package windowHandler;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalseForce {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://www.google.com";
		driver.get(url);

		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Successful - The correct title is displayed on the web page.");

		} else {
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		}

		WebElement searchTextBox = driver.findElement(By.xpath("//input[@name = 'q']"));
		searchTextBox.clear();
		searchTextBox.sendKeys("salesforce");

		WebElement searchbutton = driver
				.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		searchbutton.click();

		WebElement salseforce = driver.findElement(By.xpath("//*[text() = 'Salesforce IN']"));
		salseforce.click();

		Thread.sleep(2000);
//		String parent_ID = driver.getWindowHandle();
//		System.out.println("Parent ID is   :- " + parent_ID);

		WebElement new_win = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a"));
		new_win.click();
	
		 Set<String> windowhandlers = driver.getWindowHandles();
		 //System.out.println(windowhandlers);
		 
		Iterator<String> iterator = windowhandlers.iterator();
		String Parent = iterator.next();
		System.out.println("Parent id :- "+Parent);
		String Child = iterator.next();
		System.out.println("Child id  :-"+Child);
		
		driver.switchTo().window(Child);
		
		 WebElement C_firstname = driver .findElement(By.name("UserFirstName"));
	 C_firstname.sendKeys("Pratik");
	 
	 driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Kohad");
	 driver.findElement(By.xpath("//*[@name ='UserEmail']")).sendKeys("thechintu.1pk@gmail.com");
	 
	 
	 //selecting single value using select class
	 WebElement jobtitle =driver.findElement(By.name("UserTitle"));
	 Select title = new Select(jobtitle);
	 Thread.sleep(2000);
	 title.selectByVisibleText("Marketing / PR Manager");
		
	 
	 //Printing all value of job title on concle
	 List<WebElement> jobtitle1 = driver.findElements(By.name("UserTitle"));
	 for (WebElement day : jobtitle1)
			{
				System.out.println("Jobs Ttitle are  :-"+day.getText());
			}
	 
	 WebElement companyname = driver.findElement(By.name("CompanyName"));
	 companyname.sendKeys("Duninya");
	 
	 WebElement companemp = driver.findElement(By.name("CompanyEmployees"));
	 Select emp = new Select(companemp);
	 emp.selectByVisibleText("501 - 1500 employees");
	 
	 
	 List<WebElement> cmp1 = driver.findElements(By.name("CompanyEmployees"));
	 for (WebElement name : cmp1)
			{
				System.out.println(" Employees Size are   :-"+name.getText());
			}
	 
	 //UserPhone
	 
	 WebElement phone = driver.findElement(By.name("UserPhone"));
	 phone.sendKeys("12345677890");
	 
//  CompanyName
//		Set<String> ALL_ID = driver.getWindowHandles();
//		for (String childId : ALL_ID) {
//			if (!(parent_ID.equals(ALL_ID))) {
//				driver.switchTo().window(childId);
//				System.out.println(driver.getTitle());
//				
//				Thread.sleep(2000);
//				 WebElement C_firstname = driver .findElement(By.xpath("//input[@id='UserFirstName-7hAC']"));
//				 C_firstname.sendKeys("Pratik");
//			}
//		}
	}
}
