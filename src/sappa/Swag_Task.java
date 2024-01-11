package sappa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class Swag_Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://practice.automationtesting.in/");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("My Account")).click();

		driver.findElement(By.id("reg_email")).sendKeys("Sappaaishu485@gmail.com");

		driver.findElement(By.id("reg_password")).sendKeys("Aishu@123");

		driver.findElement(By.name("register")).click();

		driver.findElement(By.id("username")).sendKeys("Sappaaishu485@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Aishu@123");

		driver.findElement(By.name("login")).click();

		WebElement Sappa = driver.findElement(By.xpath("//strong[text()=\"Sappaaishu485\"]"));

		if (Sappa.isDisplayed()) 
		{
			System.out.println("Login successfull");
		} else {
			System.out.println("Login failed");
		}
		System.out.println(Sappa.getText());

	}

}
