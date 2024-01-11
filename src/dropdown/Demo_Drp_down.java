package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Drp_down {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		List<WebElement> assalu = driver.findElements(By.xpath("//select[@id=\"second\"]//option"));
		
		for (WebElement nachaledhu : assalu) {
			
			if(nachaledhu.getText().equalsIgnoreCase("Donut")){
				
				nachaledhu.click();
				
			}
			
		}	
			
		
		for (WebElement nachaledhu : assalu) {
			
			if(nachaledhu.getText().equalsIgnoreCase("Bonda")){
				
				nachaledhu.click();
				
				}
			
			}	
		
		for (WebElement nachaledhu : assalu) {
			
			if(nachaledhu.getText().equalsIgnoreCase("Bond")){
				
				nachaledhu.click();
				
				}
			
			}	
		
		}
	}


