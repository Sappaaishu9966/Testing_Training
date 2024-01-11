package practies.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thinkingweblink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://thinking-tester-contact-list.herokuapp.com/addContact");
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("input#firstName")).sendKeys("dhama");
		 driver.findElement(By.cssSelector("input#lastName")).sendKeys("sappa");
		 driver.findElement(By.cssSelector("input#birthdate")).sendKeys("02/09/1997");
		 driver.findElement(By.cssSelector("input#email")).sendKeys("aishwarya996363@gmail.com");
		 driver.findElement(By.cssSelector("input#phone")).sendKeys("9963636450");
		 driver.findElement(By.cssSelector("input#street1")).sendKeys("kphp-phase2");
		 driver.findElement(By.cssSelector("input#street2")).sendKeys("vizag");
		 driver.findElement(By.cssSelector("input#city")).sendKeys("Hyd");
		 driver.findElement(By.cssSelector("input#stateProvince")).sendKeys("andhar");
		 driver.findElement(By.cssSelector("input#postalCode")).sendKeys("500072");
		 driver.findElement(By.cssSelector("input#country")).sendKeys("India");
//		 driver.findElement(By.cssSelector("button#submit")).sendKeys("yes");
//		 driver.findElement(By.cssSelector("button#submit")).click();
		 driver.findElement(By.cssSelector("button[onclick=\"location.href='/contactList'\"]")).click();

		 
		
		 
			
			

	}

}
