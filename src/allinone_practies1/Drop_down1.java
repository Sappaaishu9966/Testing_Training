package allinone_practies1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down1 {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		     WebDriver  driver = new ChromeDriver();
		     driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");// https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
		     driver. manage().window().maximize();
		     WebElement drop=driver.findElement(By.tagName("select"));
		     Select sc = new Select(drop);
		     sc.selectByIndex(0);
		     Thread.sleep(3000);
		     sc.selectByValue("2");
		     Thread.sleep(3000);
		     sc.selectByVisibleText("USA");
		    

}
}