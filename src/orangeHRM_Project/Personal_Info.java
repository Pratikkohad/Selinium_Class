package orangeHRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Personal_Info
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		 driver  =new ChromeDriver(); 
		  driver.manage().window().fullscreen();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  
		 WebElement username = driver.findElement(By.id("txtUsername"));
		 username.sendKeys("Admin");
		 
		 WebElement password = driver.findElement(By.id("txtPassword"));
		 password.sendKeys("admin123");
		 
		 WebElement Login = driver.findElement(By.id("btnLogin"));
		 Login.click();
		 
		 WebElement Myinfo = driver.findElement(By.id("menu_pim_viewMyDetails"));
		 Myinfo.click();
		 
		 WebElement Edit = driver.findElement(By.id("btnSave"));
		 Edit.click();
		 
		 WebElement fullname = driver.findElement(By.id("personal_txtEmpFirstName"));
		 fullname.clear();
		 fullname.sendKeys("Pratik");
		 
		 WebElement MiddleName = driver.findElement(By.id("personal_txtEmpMiddleName"));
		 MiddleName.clear();
		 MiddleName.sendKeys("R");
		 
		 WebElement LastName = driver.findElement(By.id("personal_txtEmpLastName"));
		 LastName.clear();
		 LastName.sendKeys("Koahd");
		 
		 WebElement empID = driver.findElement(By.id("personal_txtEmployeeId"));
		 empID.clear();
		 empID.sendKeys("12309748");
		 
		 WebElement Lic = driver.findElement(By.id("personal_txtLicenNo"));
		 Lic.clear();
		 Lic.sendKeys("MH32648u3497508");
		 
		 WebElement SSN = driver.findElement(By.id("personal_txtNICNo"));
		 SSN.clear();
		 SSN.sendKeys("Pratik Kohad");
		 
		 Select national = new Select(driver.findElement(By.id("personal_cmbNation")));
		 //national.selectByVisibleText("Indian");
		 national.selectByIndex(82);
		 
		 WebElement save = driver.findElement(By.id("btnSave"));
		 Thread.sleep(1000);
		 save.click();
		 //btnSave
		 
		 //taking link text for next path
		 WebElement nxt = driver.findElement(By.linkText("Contact Details"));
		 //SSN.clear();
		 nxt.click();
		 
		 WebElement nxt1 = driver.findElement(By.id("welcome"));
		 nxt1.click();
		 //welcome
		 
	}

}
