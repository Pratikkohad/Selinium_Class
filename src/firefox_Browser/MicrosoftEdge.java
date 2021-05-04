package firefox_Browser;

import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "E:\\Testing\\AUTOMATION\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
		

	}

}
