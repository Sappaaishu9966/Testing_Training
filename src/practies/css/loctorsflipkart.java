package practies.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loctorsflipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("aishwarya");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Sappa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"sex-0\"]")).click();
		driver.findElement(By.xpath("(//input[@id=\"exp-6\"])")).click();
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("02/11/2023");
		driver.findElement(By.xpath("//input[@id=\"profession-0\"]")).click();//not working in profession
		driver.findElement(By.xpath("//select[@id=\"continents\"]")).click();//not working in continents
		driver.findElement(By.xpath("//a[@href=\"https://github.com/stanfy/behave-rest/blob/master/features/conf.yaml\"]")).click();//not working link dowloadfile
		driver.findElement(By.cssSelector("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[28]/div[2]/div/a")).click();//locators
		driver.findElement(By.xpath("//input[@id=\"tool-0\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"control-group\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		
		
	
		
		

	}

}
