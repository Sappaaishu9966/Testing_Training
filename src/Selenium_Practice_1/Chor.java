 package Selenium_Practice_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chor {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Drop down");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
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
	 }
	
		
	}


