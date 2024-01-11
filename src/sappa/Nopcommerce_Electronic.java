package sappa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerce_Electronic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://demo.nopcommerce.com/electronics");

        //driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
		
		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000035_nikon-d5500-dslr_415.jpeg\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();

		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000007_cell-phones_450.jpeg\"]")).click();
       //Sort by--------------------------------------
		WebElement mob7 = driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));

		Select Sortby8 = new Select(mob7);

		Sortby8.selectByVisibleText("Created on");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000044_nokia-lumia-1020_415.jpeg\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-20\"]")).click();

		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/div/a/img")).click();

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000048_portable-sound-speakers_415.jpeg\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
	}

}
