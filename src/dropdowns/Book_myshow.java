package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_myshow {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class=\"bwc__sc-1nbn7v6-10 cntvL ellipsis\"]")).click();
		driver.findElement(By.xpath(""));
		
	}
}
