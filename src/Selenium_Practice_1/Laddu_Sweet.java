package Selenium_Practice_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Laddu_Sweet {

	public static void main(String[] args) throws InterruptedException {	
  //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    System.out.println("Drop down");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.findElement(By.id("country-list")).click();
		List<WebElement> ref= driver.findElements(By.xpath("//select[@name=\"country\"]//option"));
		for (WebElement single:ref)
		{
			if(single.getText().equalsIgnoreCase("India"))
			{
				Thread.sleep(2000);
				single.click();
			}
		}
			driver.findElement(By.name("state"));
			List<WebElement> ref_1= driver.findElements(By.xpath("//select[@name=\"state\"]//option"));
			for (WebElement singl:ref_1)
			{				if(singl.getText().equalsIgnoreCase("Tamil Nadu"))
				{
					Thread.sleep(2000);
					singl.click();
				}
		}
	 }
	}
		
	    
	


