package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
//		WebElement dropdown = driver.findElement(By.xpath("//select[@name=\"country\"]"));
//		Select as = new Select(dropdown);
//		as.selectByIndex(1);
//		Thread.sleep(3000);
//		as.selectByValue("3");
//		Thread.sleep(3000);
//		as.selectByVisibleText("USA");
		
		WebElement dropdown_1 = driver.findElement(By.xpath("//select[@name=\"state\"]"));
		Select sa = new Select(dropdown_1);
		sa.selectByIndex(3);
		Thread.sleep(3000);
		sa.selectByValue("12");
		Thread.sleep(3000);
		sa.selectByVisibleText("Picardie");


	}

}
