package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.xpath("//select[@name=\\\"country\\\"]"));
		Select dc = new Select(drop);
		dc.selectByIndex(0);
		Thread.sleep(3000);
		dc.selectByValue("2");
		Thread.sleep(3000);
		dc.selectByVisibleText("France");
		
		WebElement drop_1 = driver.findElement(By.xpath("//select[@name=\\\"state\\\"]"));
		Select ds = new Select(drop_1);
		ds.selectByIndex(3);
		Thread.sleep(3000);
		ds.selectByValue("7");
		Thread.sleep(3000);
		ds.selectByVisibleText("New York");

	}

}
