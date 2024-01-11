package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loop {

	public static void main(String[] args) throws InterruptedException {
		
		 {
			System.out.println("Drop down");
			System.setProperty("webDriver.chrome.driver", "C:\\Users\\chpha\\Downloads\\chromedriver-win64 (1).zip\\chromedriver-win64\\chrome.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
			driver.findElement(By.id("country-list"));
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
			for (WebElement single:ref_1)
			{
				if(single.getText().equalsIgnoreCase("Andhra Pradesh"))
				{
					Thread.sleep(3000);
					single.click();
				}
			}
	
		 }
		 
		}
}


