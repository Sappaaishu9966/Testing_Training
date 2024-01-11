package practies.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_method3_Demo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		{
			WebDriver driver = new ChromeDriver();driver.navigate().forward();
			driver.navigate().refresh();
			driver.navigate().back();
			Thread.sleep(3000);
			driver.findElement(By.id("//select[@name=\"demo_basic\"]"));
			WebElement drop=driver.findElement(By.tagName("select"));
		     Select sc = new Select(drop);
			
			

	}

	}
}
