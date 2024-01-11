package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Smpl {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
	    driver.manage().window().maximize();
	   
	   WebElement  dropdown = driver.findElement(By.xpath("//select[@id=\"first\"]"));
	    
	    Select sc=new Select(dropdown);
	    
	    sc.selectByIndex(3);
	    
        Thread.sleep(3000);
	    
	    sc.selectByValue("Microsoft");
	    
        Thread.sleep(3000);
	    
	    sc.selectByVisibleText("Iphone");
	    
		WebElement  dropdown_1 = driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		
		Select sa = new Select(dropdown_1);
		
		sa.selectByIndex(3);
		
        Thread.sleep(3000);

		sa.selectByValue("big baby cat");
		
        Thread.sleep(3000);

		sa.selectByVisibleText("Avatar");

	    
		WebElement  dropdown_2 = driver.findElement(By.xpath("//select[@id=\"second\"]"));

		Select sm = new Select(dropdown_2);
		
		sm.selectByIndex(0);
		
        Thread.sleep(3000);

		sm.selectByValue("donut");
		
        Thread.sleep(3000);

		sm.selectByVisibleText("Bonda");
		
        Thread.sleep(3000);

		sm.deselectByValue("donut");

	}

}
