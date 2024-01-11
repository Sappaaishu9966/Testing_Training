package practies.css;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Bookmyslowforloop {

	public static void main(String[] args) 

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]"));
		List<WebElement> frnds=driver.findElements(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]//li"));
		  for (WebElement unic : frnds)
		  {
			if (unic.getText().equalsIgnoreCase("KOCH")) 
			{
				unic.click();
			}
	
		}
	}

}
