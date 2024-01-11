package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ayipoy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.xpath("//table[@id=\"countries\"]//tr")).size();
		
		System.out.println("Number of Rows:"+rows);
		
		int cols = driver.findElements(By.xpath("//table[@id=\"countries\"]//td")).size();
		
		System.out.println("Number of Cols:"+cols);
		
		System.out.println("Country Details:"+"Country"+"	"+"Capitals"+"	"+"Currency"+"	"+"Primary"+"	"+"Language");
			
		String country =driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[78]")).getText();
		
		System.out.println("Country Details:"+country);
		
		for (int r = 1; r<= rows; r++) {
			
		String country_1= driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+ r +"]//td[2]")).getText();
			
		if (country_1.equalsIgnoreCase("India")) {
			
		driver.findElement(By.xpath("table[@id=\"countries\"]//tr["+ r +"]//td[1]//input")).click();
				
		String capital = driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+ r +"]//td[3]")).getText();
				
		System.out.println(country_1+" - "+capital);
		
			}
		}
		
		for(int r = 1; r<= rows; r++) {
			
		String pl=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+ r +"]//td[5]")).getText();
			
		if(pl.equals("English")) {
			
    	driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[1]//input")).click();

		String cou=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+ r +"]//td[2]")).getText();
		
		System.out.println(pl+" - "+cou);
	
			}
		}

	}

}
