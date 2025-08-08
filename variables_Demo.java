package demos;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class variables_Demo 
{

	public static void main(String[] args) 
	{
	      System.setProperty("webdriver.chrome.driver","chrome.driver.exe");
	      WebDriver.driver= new ChromeDriver();
	      driver.get("http://google.com/");
	      
	}
	


	         
		

}
}
