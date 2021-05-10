package orangeHRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_validation {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		String appUrl = "https://opensource-demo.orangehrmlive.com/";
		driver.get(appUrl);

		driver.manage().window().maximize();

		String expectedTitle = "OrangeHRM";

		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Successful - The correct title is displayed on the web page.");

			WebElement username = driver.findElement(By.id("txtUsername"));
			if(username.isEnabled()==true)
			{
			username.sendKeys("Admin");
			}
			WebElement password = driver.findElement(By.id("txtPassword"));
			password.sendKeys("admin123");

			WebElement Login = driver.findElement(By.id("btnLogin"));
			Login.click();

			WebElement tab = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]"));
			tab.click();

			WebElement empname = driver.findElement(By.id("empsearch_employee_name_empName"));
			Thread.sleep(2000);
			if (empname.isDisplayed() == true) {
				empname.sendKeys("Prakash");
				System.out.println("inserted" + empname.getText());
			} else {
				System.out.println("Enable the box" + empname.getTagName());
			}

			WebElement supervisorname = driver.findElement(By.xpath("//*[@name='empsearch[supervisor_name]']"));
			Thread.sleep(1000);
			supervisorname.sendKeys("Rohan");

			WebElement ID = driver.findElement(By.xpath("//*[@id='empsearch_id']"));
			ID.sendKeys("HRM_0001");

			WebElement jobtitle = driver.findElement(By.xpath("//*[@id='empsearch_job_title']"));
			Select title = new Select(jobtitle);
			title.selectByVisibleText("Chief Technical Officer");

			WebElement empstatus = driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
			Select status = new Select(empstatus);
			status.selectByValue("1");

			WebElement empsubunit = driver.findElement(By.xpath("//*[@name = 'empsearch[sub_unit]']"));
			Select subunit = new Select(empsubunit);
			subunit.selectByIndex(3);

			WebElement empinclude = driver.findElement(By.xpath("//*[@name = 'empsearch[sub_unit]']"));
			Select include = new Select(empinclude);
			include.selectByIndex(4);
			
			

		} 
		else
		{
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		}
//		Thread.sleep(2000);
//		System.out.println("Closing Browser");
//		driver.close();

	}

}
