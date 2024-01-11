
package practies.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagLabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("problem_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input#login-button")).click();
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.cssSelector("select.product_sort_container")).click();
		driver.findElement(By.cssSelector("/*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.cssSelector("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bolt-t-shirt")).click();
	

		
		
	
		
		
		
		

	}

}
