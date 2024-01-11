package sappa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerece_Computer {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();

		driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).click();

		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Aishwarya");

		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("sappa");

		WebElement A1 = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));

		Select se = new Select(A1);

		se.selectByVisibleText("2");

		WebElement A2 = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));

		Select se1 = new Select(A2);

		se1.selectByVisibleText("September");

		WebElement A3 = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));

		Select se2 = new Select(A3);

		se2.selectByVisibleText("1997");

		driver.findElement(By.xpath("(//input[@type=\"email\"])[1]")).sendKeys("Sappaaishu485@gamil.com");

		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Charani Softech Pvt Ltd");

		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();

		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("Aishu@1997");

		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Aishu@1997");

		driver.findElement(By.xpath("//button[@name=\"register-button\"]")).click();

		// Login -----------------------------------------------

		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();

		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("Sappaaishu485@gamil.com");

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Aishu@1997");

		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();

		// computer-------------------------------------------------
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();

		driver.findElement(By.xpath("(//a[text()=\"Desktops \"])[3]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg\"]")).click();

		Thread.sleep(3000);

       //Inspecting the element--------------------------------------------
		
		WebElement com = driver.findElement(By.xpath("//select[@id=\"product_attribute_1\"]"));

		Select Processer = new Select(com);

		Processer.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");

        //Ram-------------------------------------------------------------

		WebElement com1 = driver.findElement(By.xpath("//select[@id=\"product_attribute_2\"]"));

		Select RAM = new Select(com1);

		RAM.selectByVisibleText("8GB [+$60.00]");

		Thread.sleep(2000);

       //Hdd------------------------------------------------------------------
		driver.findElement(By.id("product_attribute_3_6")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_3_7")).click();

		Thread.sleep(2000);

         //OS---------------------------------------------

		driver.findElement(By.id("product_attribute_4_9")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_4_8")).click();

		Thread.sleep(2000);

		//Software---------------------------------

		driver.findElement(By.id("product_attribute_5_11")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_5_12")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_5_10")).click();

		Thread.sleep(2000);

		//Add to card-----------------------------------

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();

		Thread.sleep(2000);

		// THIS ELEMENT IS NOTEBOOK---------------------------------

		//Notebook------------------------------------

	   //	 driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click(); this not working
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		//Thread.sleep(2000);
		
	  //	 driver.findElement(By.xpath("(//a[@href=\"/computers\"])[2]")).click();this also not working
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Notebooks\"]")).click();
 		
		Thread.sleep(2000);

		// CPU type------------------------------------------

		driver.findElement(By.id("attribute-option-6")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("attribute-option-7")).click();

		Thread.sleep(2000);

		//Memory------------------------------------------

		driver.findElement(By.id("attribute-option-8")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("attribute-option-9")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("attribute-option-10")).click();

		Thread.sleep(3000);

        //Sort BYY--------------------------------------------
		
		WebElement s2 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select Sortby = new Select(s2);

		Sortby.selectByVisibleText("Created on");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000030_hp-envy-6-1180ca-156-inch-sleekbook_415.jpeg\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();

		Thread.sleep(3000);

		//Number three element software -------------------------------
		
		//driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()=\"Software \"])[3]")).click();
		
		Thread.sleep(2000);

		// SORT BYE_______________________________

		WebElement A4 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select Sortby2 = new Select(A4);

		Thread.sleep(2000);

		Sortby2.selectByVisibleText("Created on");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-12\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("FriendEmail")).sendKeys("Sappaaishu485@gamil.com");

		Thread.sleep(2000);

		driver.findElement(By.id("YourEmailAddress"));

		Thread.sleep(2000);

		driver.findElement(By.id("PersonalMessage")).sendKeys("sigment is done");

		Thread.sleep(2000);

		driver.findElement(By.name("send-email")).click();
		
		driver.navigate().to("https://demo.nopcommerce.com/electronics");

        //   	 driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
		
		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000035_nikon-d5500-dslr_415.jpeg\"]")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();

		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000007_cell-phones_450.jpeg\"]")).click();
		
  	    // Sort by-----------------------------------------------------  
		
		WebElement mob2 = driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));

		Select Sortby3 = new Select(mob2);

		Sortby3.selectByVisibleText("Created on");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000044_nokia-lumia-1020_415.jpeg\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-20\"]")).click();

		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/div/a/img")).click();

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000048_portable-sound-speakers_415.jpeg\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();

		// Software---------------------------------------

		driver.findElement(By.id("product_attribute_5_11")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_5_12")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_5_10")).click();

		Thread.sleep(2000);

		// ADD TO CARD----------------------------------------
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();

		Thread.sleep(2000);

		//  the element is notebook

		//_Notebook --------------------------------------------

        // 	driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
        // 		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[2]")).click();
		
        // 		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Notebooks\"]")).click();

		Thread.sleep(2000);

       //Copy type-------------------------------------------------------
		
		driver.findElement(By.id("attribute-option-6")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("attribute-option-7")).click();

		Thread.sleep(2000);

       //Memory--------------------------------------

		driver.findElement(By.id("attribute-option-8")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("attribute-option-9")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("attribute-option-10")).click();

		Thread.sleep(3000);

        //Sort BYY---------------------------------------------- 
		
		WebElement s4 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select Sortby5 = new Select(s4);

		Sortby5.selectByVisibleText("Created on");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000030_hp-envy-6-1180ca-156-inch-sleekbook_415.jpeg\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();

		Thread.sleep(3000);

        //Number three element software-------------------------------
		
		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()=\"Software \"])[3]")).click();
		
		Thread.sleep(2000);

		// SORT BYE_______________________________

		WebElement A5 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select Sortby6 = new Select(A5);

		Thread.sleep(2000);

		Sortby6.selectByVisibleText("Created on");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-12\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("FriendEmail")).sendKeys("Sappaaishu485@gamil.com");

		Thread.sleep(2000);

		driver.findElement(By.id("YourEmailAddress"));

		Thread.sleep(2000);

		driver.findElement(By.id("PersonalMessage")).sendKeys(" sigment is done");

		Thread.sleep(2000);

		driver.findElement(By.name("send-email")).click();
		
		driver.navigate().to("https://demo.nopcommerce.com/electronics");

         //driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
		
		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000035_nikon-d5500-dslr_415.jpeg\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();

		Thread.sleep(2000);
	}
}
