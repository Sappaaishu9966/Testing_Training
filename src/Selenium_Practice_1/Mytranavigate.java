package Selenium_Practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytranavigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.manage().window().minimize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		

	}

}
