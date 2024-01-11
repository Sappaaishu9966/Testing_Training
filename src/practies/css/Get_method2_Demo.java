package practies.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method2_Demo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://webflow.com/made-in-webflow/navbar-dropdown");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
    driver.navigate().back();
	driver.findElement(By.xpath("//input[@class=\"_18u87m _3WuvDp\"]")).sendKeys("9963636450");
	driver.findElement(By.xpath("//button[@type=\"button\"][1]")).click();
	
	
			

	}

}
