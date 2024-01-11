package sappa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerce_Book {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();
        

		driver.findElement(By.xpath("(//a[@href=\"/books\"])[1]")).click();
		
		WebElement Chinuu =driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		
		Select Jagubro = new Select (Chinuu);
		
		Jagubro.selectByValue("0");
		
		Thread.sleep(2000);
		
		Jagubro.selectByValue("5");
		
		Thread.sleep(2000);

		Jagubro.selectByValue("6");
		
		Thread.sleep(2000);

		Jagubro.selectByValue("10");
		
		Thread.sleep(2000);

		Jagubro.selectByValue("11");
		
		Thread.sleep(2000);

		Jagubro.selectByValue("15");
		
		WebElement Myhero =driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		
		Select SimhachalamNaidugaru = new Select (Myhero);
		
		SimhachalamNaidugaru .selectByValue("9");
		
		Thread.sleep(2000);
		
		SimhachalamNaidugaru .selectByValue("6");
		
		Thread.sleep(2000);
		
		SimhachalamNaidugaru .selectByValue("3"); 
		
		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();
		
//		Pride and Prejudice-------------------------------------------
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/pride-and-prejudice\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-39\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-39\"]")).click();
		
		driver.navigate().back();
		
//		First Prize Pies-----------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/first-prize-pies\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-38\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-38\"]")).click();
		
		driver.navigate().back();
		
//		Fahrenheit 451 ------------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/fahrenheit-451-by-ray-bradbury\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-37\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-37\"]")).click();
		
		driver.navigate().back();
		
//		jowelry------------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/jewelry\"])[1]")).click();
		
		WebElement Simha =driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		
		Select Dhamayanthi = new Select (Simha);
		
		Dhamayanthi.selectByValue("0");
		
		Thread.sleep(2000);
		
		Dhamayanthi.selectByValue("5");
		
		Thread.sleep(2000);

		Dhamayanthi.selectByValue("6");
		
		Thread.sleep(2000);

		Dhamayanthi.selectByValue("10");
		
		Thread.sleep(2000);

		Dhamayanthi.selectByValue("11");
		
		Thread.sleep(2000);

		Dhamayanthi.selectByValue("15");
		
		WebElement KA =driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		
		Select Aishu = new Select (KA);
		
		Aishu.selectByValue("9");
		
		Thread.sleep(2000);
		
		Aishu.selectByValue("6");
		
		Thread.sleep(2000);
		
		Aishu.selectByValue("3"); 
		
		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();
		
//		Vintage Style Engagement Ring-------------------------------------------
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/vintage-style-engagement-ring\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-42\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-42\"]")).click();
		
		driver.navigate().back();
		
//		Flower Girl Bracelet-------------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/flower-girl-bracelet\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-41\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-41\"]")).click();
		
		driver.navigate().back();
		
//		Elegant Gamestone-Necklace (Rental)---------------------------------------
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/elegant-gemstone-necklace-rental\"])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"rental_start_date_40\"]")).sendKeys("04/06/1996");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"rental_end_date_40\"]")).sendKeys("04/06/1997");
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-40\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-40\"]")).click();
		
		driver.navigate().back();
		
	}

}
