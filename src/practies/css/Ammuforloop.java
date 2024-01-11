package practies.css;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ammuforloop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	driver.findElement(By.id("first"));
	List<WebElement> aishu=driver.findElements(By.xpath("//select[@id=\"first\"]//option"));
	for (WebElement single : aishu) 
	{
		if(single.getText().equalsIgnoreCase("google"))
		{
			single.click();
		}
	}
	driver.findElement(By.id("animals"));
	 List<WebElement>Ammu=driver.findElements(By.xpath("//select[@id=\"animals\"]//option"));
	 for (WebElement mad : Ammu) 
	 {
		 if(mad.getText().equalsIgnoreCase("Baby cat"))
		 {
			 mad.click();
			Thread.sleep(3000);
		 }
		 if (mad.getText().equalsIgnoreCase("Avatar")) {
			 mad.click();
		 }
		
	}
	 driver.findElement(By.id("second"));
	 List<WebElement> Aravi=driver.findElements(By.xpath("//select[@id=\"second\"]//option "));
	  for (WebElement Vennela : Aravi) 
	  {
		if(Vennela.getText().equalsIgnoreCase("Bonda")) 
		{
			Vennela.click();
		    Thread.sleep(3000);
		}
		if(Vennela.getText().equalsIgnoreCase("Pizza")) 
		{
			Vennela.click();
		}
		
		
			
	}
	}
}
