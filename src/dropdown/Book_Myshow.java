package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Book_Myshow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]"));
		
		List<WebElement> list =driver.findElements(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]//li"));
		
		
		for (WebElement cityname : list) {
			
			
			if(cityname.getText().equalsIgnoreCase("Mumbai"))
			
			{
				cityname.click();
				
			}
		}
	}

}
