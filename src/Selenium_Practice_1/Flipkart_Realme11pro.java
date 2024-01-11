package Selenium_Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Realme11pro {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
     	driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("Realme11pro");
		Thread.sleep(3000);
     	
		
		
		
		
		
		
	}

}
