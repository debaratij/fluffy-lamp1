package TEST;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.jodah.failsafe.Timeout;

public class LOGINTEST {

	private static final TimeUnit SECONDS = null;

	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.railyatri.in/time-table");
		java.util.List<WebElement> rows=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div")).findElements(By.tagName("tr"));
		String item_tobe_check="12050";
		boolean is_train_present=false;
		for(int i=1;i<rows.size();i++)
		{
			java.util.List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		if(cols.get(0).getText().contains(item_tobe_check))
		{
			is_train_present=true;
			break;
		}
		}
		if(is_train_present)
		
			{
				System.out.println(item_tobe_check + "is present in list"+"test pass");
			}else
			{
					System.out.println(item_tobe_check + "is  not present in list"+"test fail");
			}	
	}}

		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
	
		
		
		
		
		
		
		

	
	

		
		
	
	
		


		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	




		




