package auto_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage_Ex {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.nopcommerce.com/");
	  
	  driver.manage().window().maximize();
	  
	  
	
	}

}
