package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM {

	public static void main(String[] args) throws InterruptedException   {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//select[@id=\"first\"]"));
		
		List<WebElement>  ento =driver.findElements(By.xpath("//select[@id=\"first\"]//option"));
		
		for (WebElement emo : ento) {
			
			if(emo.getText().contains("Iphone")) {
				
				emo.click();
			}
		}
		Thread.sleep(3000);

		for (WebElement emo : ento) {
			
			if(emo.getText().equalsIgnoreCase("Yahoo")) {
				
				emo.click();
			}
			
		}
	}

}
