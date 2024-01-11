package practies.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ASCsample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	

		WebDriver driver =  new ChromeDriver();
//		driver.get("https://www.ascdegreecollege.ac.in/degree-application-form/");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//div[@data-id=\"1\"])")).click();
//		driver.findElement(By.xpath("//input[@id =\"wpforms-11388-field_0\"]")).sendKeys("aishwarya");
//		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_0-middle\"]")).sendKeys("Sappa");
//		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_0-last\"]")).sendKeys("Dhamaamma");
//		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_6\"]")).sendKeys("Hyd");	
//		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_6\"]")).click();
//		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_5\"]")).sendKeys("02-09-1997");
//		driver.findElement(By.xpath("/input[@id=\"wpforms-11388-field_6\"]")).sendKeys("hyd");//
//		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_7\"]")).sendKeys("Indian");
//		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_8\"]")).sendKeys("Bcd");
//		driver.findElement(By.xpath("//div[@class=\"choices__list choices__list--single\"])")).click();

driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
driver.manage().window().maximize();
String name="charani";
WebElement dropdown_P=driver.findElement(By.tagName("select"));
Select sc=new Select(dropdown_P);
sc.selectByIndex(2);
Thread.sleep(2000);
sc.selectByValue("IND");
Thread.sleep(2000);
sc.selectByVisibleText("Japan");
Thread.sleep(3000);
	}

}