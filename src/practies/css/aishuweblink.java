package practies.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aishuweblink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://seleniumbase.io/demo_page");
	 driver.manage().window().maximize();
	 driver.findElement(By.cssSelector("input#myTextInput")).sendKeys("aishhh");
	 driver.findElement(By.cssSelector("input#myTextInput2")).sendKeys("Simha");
	 driver.findElement(By.cssSelector("input#placeholderText")).sendKeys("Dhamaamma");
	 driver.findElement(By.cssSelector("rect#svgRect")).sendKeys("yellow");
	 driver.findElement(By.cssSelector("select.selectClass")).sendKeys("set to 25%");
	 driver.findElement(By.cssSelector("textarea#myTextarea")).sendKeys("jagu");
	 driver.findElement(By.cssSelector("select.product_sort_container")).click();

	}

}
