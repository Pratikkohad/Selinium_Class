package chrome_Browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class xugckanc {
	 static String  path = "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe";
	public static void main(String[] args)
	{
		//Inputstream ss =new Inputstream
		
		//InputStream ss = new InputStream("); 
		try 
		{
//			
			FileInputStream  ss = new FileInputStream(path);
			System.out.println("In Try Block");
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("In catch Block"+e);
			path="C:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe";
		}
		System.out.println("OK");
		
		
	}

	

}
