package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	public static void main(String[] args)
	{
		try{ 
		System.out.println("Connecting.....");
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost//sakila","root","");  
		
		System.out.println("Connection to My SQL successful......");
		
		
		
		return;
		  
	}catch(Exception e){ 
		System.out.println(e);
		}  

}  

}
		

