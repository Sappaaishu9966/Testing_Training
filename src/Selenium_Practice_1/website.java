package Selenium_Practice_1;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class website {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
	   driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	    driver.manage().window().maximize();
	      driver.findElement(By.id("signup")).click();
	      driver.findElement(By.id("firstName")).sendKeys("aishwarya12345@");
	      driver.findElement(By.id("lastName")).sendKeys("sappa12345@");
	      driver.findElement(By.id("email")).sendKeys("aishwaryasappa111az@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("1122334455@");
	      driver.findElement(By.id("submit")).click();
	      driver.findElement(By.id("add-contact")).click();
	      driver.findElement(By.id("email")).sendKeys("aishwaryasappa111@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("1122334455@");
	      driver.findElement(By.id("add-contact")).click();
	      driver.findElement(By.id("add-contact")).click();
	      
	      ;
			driver .navigate().to("https://thinking-tester-contact-list.herokuapp.com/addContact");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.findElement(By.cssSelector("https://thinking-tester-contact-list.herokuapp.com/addContact")).sendKeys("aishu");
			driver.findElement(By.cssSelector("input#firstName ")).sendKeys("aishu");
			
//			driver.findElement(By.className("logout")).click();
			String title=driver.findElement(By.tagName("h1")).getText();
			System.out.println(title);
			driver.findElement(By.cssSelector("input#firstName")).sendKeys("aishu");

			
			

			
			

			

	      
	      
	     
	      
	   
	    
		    		
		    	}
		    }

	


