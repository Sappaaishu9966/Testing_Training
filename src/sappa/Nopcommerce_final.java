package sappa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerce_final {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

//		driver.manage().window().maximize();
//
//		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
//
//		driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).click();
//
//		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Aishwarya");
//
//		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("sappa");
//
//		WebElement A1 = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
//
//		Select se = new Select(A1);
//
//		se.selectByVisibleText("2");
//
//		WebElement A2 = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
//
//		Select se1 = new Select(A2);
//
//		se1.selectByVisibleText("September");
//
//		WebElement A3 = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
//
//		Select se2 = new Select(A3);
//
//		se2.selectByVisibleText("1997");
//
//		driver.findElement(By.xpath("(//input[@type=\"email\"])[1]")).sendKeys("Sappaaishu485@gamil.com");
//
//		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Charani Softech Pvt Ltd");
//
//		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
//
//		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("Aishu@1997");
//
//		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Aishu@1997");
//
//		driver.findElement(By.xpath("//button[@name=\"register-button\"]")).click();
//
//		// Login -----------------------------------------------
//
//		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
//
//		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("Sappaaishu485@gamil.com");
//
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Aishu@1997");
//
//		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
//
//		// computer-------------------------------------------------
//		
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
//
//		driver.findElement(By.xpath("(//a[text()=\"Desktops \"])[3]")).click();
//
//		Thread.sleep(4000);
//
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg\"]")).click();
//
//		Thread.sleep(3000);
//
//       //Inspecting the element--------------------------------------------
//		
//		WebElement com = driver.findElement(By.xpath("//select[@id=\"product_attribute_1\"]"));
//
//		Select Processer = new Select(com);
//
//		Processer.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
//
//        //Ram-------------------------------------------------------------
//
//		WebElement com1 = driver.findElement(By.xpath("//select[@id=\"product_attribute_2\"]"));
//
//		Select RAM = new Select(com1);
//
//		RAM.selectByVisibleText("8GB [+$60.00]");
//
//		Thread.sleep(2000);
//
//       //Hdd------------------------------------------------------------------
//		driver.findElement(By.id("product_attribute_3_6")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("product_attribute_3_7")).click();
//
//		Thread.sleep(2000);
//
//         //OS---------------------------------------------
//
//		driver.findElement(By.id("product_attribute_4_9")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("product_attribute_4_8")).click();
//
//		Thread.sleep(2000);
//
//		//Software---------------------------------
//
//		driver.findElement(By.id("product_attribute_5_11")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("product_attribute_5_12")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("product_attribute_5_10")).click();
//
//		Thread.sleep(2000);
//
//		//Add to card-----------------------------------
//
//		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();
//
//		Thread.sleep(2000);
//
//		// THIS ELEMENT IS NOTEBOOK---------------------------------
//
//		//Notebook------------------------------------
//
//	   //	 driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click(); this not working
//		
//		driver.navigate().back();
//		
//		driver.navigate().back();
//		
//		//Thread.sleep(2000);
//		
//	  //	 driver.findElement(By.xpath("(//a[@href=\"/computers\"])[2]")).click();this also not working
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//img[@alt=\"Picture for category Notebooks\"]")).click();
// 		
//		Thread.sleep(2000);
//
//		// CPU type------------------------------------------
//
//		driver.findElement(By.id("attribute-option-6")).click();
//
//		Thread.sleep(1000);
//
//		driver.findElement(By.id("attribute-option-7")).click();
//
//		Thread.sleep(2000);
//
//		//Memory------------------------------------------
//
//		driver.findElement(By.id("attribute-option-8")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("attribute-option-9")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("attribute-option-10")).click();
//
//		Thread.sleep(3000);
//
//        //Sort BYY--------------------------------------------
//		
//		WebElement s2 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
//
//		Select Sortby = new Select(s2);
//
//		Sortby.selectByVisibleText("Created on");
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000030_hp-envy-6-1180ca-156-inch-sleekbook_415.jpeg\"]")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();
//
//		Thread.sleep(3000);
//
//		//Number three element software -------------------------------
//		
//		//driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
//		
//		driver.navigate().back();
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("(//a[text()=\"Software \"])[3]")).click();
//		
//		Thread.sleep(2000);
//
//		// SORT BYE_______________________________
//
//		WebElement A4 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
//
//		Select Sortby2 = new Select(A4);
//
//		Thread.sleep(2000);
//
//		Sortby2.selectByVisibleText("Created on");
//
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-12\"]")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("FriendEmail")).sendKeys("Sappaaishu485@gamil.com");
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("YourEmailAddress"));
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("PersonalMessage")).sendKeys("sigment is done");
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.name("send-email")).click();
//		
//		driver.navigate().to("https://demo.nopcommerce.com/electronics");
//
//        //   	 driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
//		
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000035_nikon-d5500-dslr_415.jpeg\"]")).click();
//		
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();
//
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		
//		driver.navigate().back();
//		
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000007_cell-phones_450.jpeg\"]")).click();
//		
//  	    // Sort by-----------------------------------------------------  
//		
//		WebElement mob2 = driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));
//
//		Select Sortby3 = new Select(mob2);
//
//		Sortby3.selectByVisibleText("Created on");
//
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000044_nokia-lumia-1020_415.jpeg\"]")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-20\"]")).click();
//
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		
//		driver.navigate().back();
//		
//		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/div/a/img")).click();
//
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000048_portable-sound-speakers_415.jpeg\"]")).click();
//		
//		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
//
//		// Software---------------------------------------
//
//		driver.findElement(By.id("product_attribute_5_11")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("product_attribute_5_12")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("product_attribute_5_10")).click();
//
//		Thread.sleep(2000);
//
//		// ADD TO CARD----------------------------------------
//		
//		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();
//
//		Thread.sleep(2000);
//
//		//  the element is notebook
//
//		//_Notebook --------------------------------------------
//
//        // 	driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
//		
//		driver.navigate().back();
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		
//        // 		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[2]")).click();
//		
//        // 		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@alt=\"Picture for category Notebooks\"]")).click();
//
//		Thread.sleep(2000);
//
//       //Copy type-------------------------------------------------------
//		
//		driver.findElement(By.id("attribute-option-6")).click();
//
//		Thread.sleep(1000);
//
//		driver.findElement(By.id("attribute-option-7")).click();
//
//		Thread.sleep(2000);
//
//       //Memory--------------------------------------
//
//		driver.findElement(By.id("attribute-option-8")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("attribute-option-9")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("attribute-option-10")).click();
//
//		Thread.sleep(3000);
//
//        //Sort BYY---------------------------------------------- 
//		
//		WebElement s4 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
//
//		Select Sortby5 = new Select(s4);
//
//		Sortby5.selectByVisibleText("Created on");
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000030_hp-envy-6-1180ca-156-inch-sleekbook_415.jpeg\"]")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();
//
//		Thread.sleep(3000);
//
//        //Number three element software-------------------------------
//		
//		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("(//a[text()=\"Software \"])[3]")).click();
//		
//		Thread.sleep(2000);
//
//		// SORT BYE_______________________________
//
//		WebElement A5 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
//
//		Select Sortby6 = new Select(A5);
//
//		Thread.sleep(2000);
//
//		Sortby6.selectByVisibleText("Created on");
//
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-12\"]")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("FriendEmail")).sendKeys("Sappaaishu485@gamil.com");
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("YourEmailAddress"));
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("PersonalMessage")).sendKeys(" sigment is done");
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.name("send-email")).click();
//		
//		driver.navigate().to("https://demo.nopcommerce.com/electronics");
//
//         //driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
//		
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000035_nikon-d5500-dslr_415.jpeg\"]")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();
//
//		Thread.sleep(4000);

//		Apparel----------------------------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/apparel\"])[1]")).click();
		
//		Shoes----------------------------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/shoes\"])[3]")).click();
		
		
		driver.findElement(By.xpath("//input[@id=\"attribute-option-14\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"attribute-option-15\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"attribute-option-16\"]")).click();
		
		WebElement Ish =driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		
		Select Aish = new Select (Ish);
		
		Aish .selectByValue("0");
		
		Thread.sleep(2000);
		
		Aish .selectByValue("5");
		
		Thread.sleep(2000);

		Aish .selectByValue("6");
		
		Thread.sleep(2000);

		Aish .selectByValue("10");
		
		Thread.sleep(2000);

		Aish .selectByValue("11");
		
		Thread.sleep(2000);

		Aish .selectByValue("15");
		
		WebElement Ishuu =driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		
		Select Vennela = new Select (Ishuu);
		
		Vennela.selectByValue("9");
		
		Thread.sleep(2000);
		
		Vennela.selectByValue("6");
		
		Thread.sleep(2000);
		
		Vennela.selectByValue("3"); 
		
		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();
		
//		Nike-------------------------------------------------
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/nike-sb-zoom-stefan-janoski-medium-mint\"])[2]")).click();

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-26\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-26\"]")).click();
		
		driver.navigate().back();
		
//		Adidas------------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/adidas-consortium-campus-80s-running-shoes\"])[2]")).click();

		WebElement ize =driver.findElement(By.xpath("//select[@id=\"product_attribute_9\"]"));
		
		Select sc_1 = new Select (ize);
		
		sc_1.selectByValue("0");
		
		Thread.sleep(2000);

		sc_1.selectByValue("21");
		
		Thread.sleep(2000);

		sc_1.selectByValue("22");
		
		Thread.sleep(2000);

		sc_1.selectByValue("23");
		
		Thread.sleep(2000);

		sc_1.selectByValue("24");
		
		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[2]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[3]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-25\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-25\"]")).click();
		
		driver.navigate().back();
		
//		Nike Floral----------------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/nike-floral-roshe-customized-running-shoes\"])[2]")).click();
		
		WebElement Size=driver.findElement(By.xpath("//select[@id=\"product_attribute_6\"]"));
		
		Select Sc = new Select (Size);
		
		Sc.selectByValue("0");
		
		Thread.sleep(2000);

		Sc.selectByValue("13");
		
		Thread.sleep(2000);

		Sc.selectByValue("14");
		
		Thread.sleep(2000);

		Sc.selectByValue("15");
		
		Thread.sleep(2000);

		Sc.selectByValue("16");
		
		WebElement colour =driver.findElement(By.xpath("//select[@id=\"product_attribute_7\"]"));
		
		Select col = new Select (colour);
		
		col.selectByValue("0");
		
		Thread.sleep(2000);

		col.selectByValue("17");
		
		Thread.sleep(2000);

		col.selectByValue("18");
		
		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[1]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[2]")).click();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//BUTTON[@id=\"add-to-cart-button-24\"]")).click();
		
		Thread.sleep(2000);
	
	//	driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-24\"]")).click();
		
		driver.navigate().back();
		
//		Clothes
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@href=\"/clothing\"])[3]")).click();
		
		WebElement ID =driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		
		Select SJ = new Select (ID);
		
		SJ.selectByValue("0");
		
		Thread.sleep(2000);
		
		SJ.selectByValue("5");
		
		Thread.sleep(2000);

		SJ.selectByValue("6");
		
		Thread.sleep(2000);

		SJ.selectByValue("10");
		
		Thread.sleep(2000);

		SJ.selectByValue("11");
		
		Thread.sleep(2000);

		SJ.selectByValue("15");
		
		WebElement frnds =driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		
		Select MP = new Select (frnds);
		
		MP.selectByValue("9");
		
		Thread.sleep(2000);
		
		MP.selectByValue("6");
		
		Thread.sleep(2000);
		
		MP.selectByValue("3"); 
		
		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();
		
//		Levi's Jeans
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@href=\"/levis-511-jeans\"])[2]")).click();
		
		Thread.sleep(2000);
		
		String quanti=driver.findElement(By.xpath("//table[@class=\"prices-table\"]//tr[1]//td[4]")).getText();
		
		System.out.println("Quantity :"+quanti);
		
		String Prize= driver.findElement(By.xpath("//table[@class=\"prices-table\"]//tr[2]//td[4]")).getText();
		
		System.out.println("Price :"+Prize);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-30\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-30\"]")).click();
		
		driver.navigate().back();
		
//		Custom T- Shirt
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@href=\"/custom-t-shirt\"])[3]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"product_attribute_12\"]")).sendKeys("James Bond 007");
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-29\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-29\"]")).click();
		
		driver.navigate().back();
		
//		Oversized Women T-shirt
		
		driver.findElement(By.xpath("(//a[@href=\"/oversized-women-t-shirt\"])[2]")).click();

		String Quantity =driver.findElement(By.xpath("//table[@class=\"prices-table\"]//tr[1]//td[4]")).getText();

		System.out.println("Quantity :"+Quantity);
		
		String Prise =driver.findElement(By.xpath("//table[@class=\"prices-table\"]//tr[2]//td[4]")).getText();

		System.out.println("Price :"+Prise);
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-28\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-28\"]")).click();
		
		driver.navigate().back();
		
//		Accessories
		
		driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[3]")).click();
		
		WebElement mn =driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		
		Select op = new Select (mn);
		
		op.selectByValue("0");
		
		Thread.sleep(2000);
		
		op.selectByValue("5");
		
		Thread.sleep(2000);

		op.selectByValue("6");
		
		Thread.sleep(2000);

		op.selectByValue("10");
		
		Thread.sleep(2000);

		op.selectByValue("11");
		
		Thread.sleep(2000);

		op.selectByValue("15");
		
		WebElement qr =driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		
		Select st = new Select (qr);
		
		st.selectByValue("9");
		
		Thread.sleep(2000);
		
		st.selectByValue("6");
		
		Thread.sleep(2000);
		
		st.selectByValue("3"); 
		
		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();
		
//		Ray Ban Sunglasses
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/ray-ban-aviator-sunglasses\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-33\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-33\"]")).click();
		
		driver.navigate().back();
		
//		Reversible-Horseferry-Check-Belt
		
		driver.findElement(By.xpath("(//a[@href=\"/reversible-horseferry-check-belt\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-32\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-32\"]")).click();
		
		driver.navigate().back();
		
//		Obey-Hropaganda-hat
		
		driver.findElement(By.xpath("(//a[@href=\"/obey-propaganda-hat\"])[2]")).click();
		
		WebElement hat =driver.findElement(By.xpath("//select[@id=\"product_attribute_13\"]"));
		
		Select topi = new Select(hat);
		
		topi.selectByValue("0");
		
		Thread.sleep(2000);
		
		topi.selectByValue("34");
		
		Thread.sleep(2000);

		topi.selectByValue("35");
		
		Thread.sleep(2000);

		topi.selectByValue("36");
		
		Thread.sleep(2000);

		topi.selectByValue("37");

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-31\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-31\"]")).click();
		
		driver.navigate().back();
		
//		Digital Downloads
		
		driver.findElement(By.xpath("(//a[@href=\"/digital-downloads\"])[1]")).click();
		
		WebElement sort =driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		
		Select by = new Select (sort);
		
		by.selectByValue("0");
		
		Thread.sleep(2000);
		
		by.selectByValue("5");
		
		Thread.sleep(2000);

		by.selectByValue("6");
		
		Thread.sleep(2000);

		by.selectByValue("10");
		
		Thread.sleep(2000);

		by.selectByValue("11");
		
		Thread.sleep(2000);

		by.selectByValue("15");
		
		WebElement dis =driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		
		Select play = new Select (dis);
		
		play.selectByValue("9");
		
		Thread.sleep(2000);
		
		play.selectByValue("6");
		
		Thread.sleep(2000);
		
		play.selectByValue("3"); 
		
		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();
		
//		Science & Faith-----------------------------------------------------
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/science-faith\"])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"addtocart_36_CustomerEnteredPrice\"]")).sendKeys("$ 50");
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-36\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-36\"]")).click();
		
		driver.navigate().back();
		
//		If You Wait (Donation)-------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/if-you-wait-donation\"])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"addtocart_35_CustomerEnteredPrice\"]")).sendKeys("$ 50");
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-35\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-35\"]")).click();
		
		driver.navigate().back();
		
//		Night Vision
		
		driver.findElement(By.xpath("(//a[@href=\"/night-visions\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-34\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-34\"]")).click();
		
		driver.navigate().back();
		
//		Books----------------------------------------------------------
		
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
		
//		Gift Cards------------------------------------------------
		
		driver.findElement(By.xpath("(//a[@href=\"/gift-cards\"])[1]")).click();
		
		WebElement SAJ =driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		
		Select SDJI = new Select (SAJ);
		
		 SDJI.selectByValue("0");
		
		Thread.sleep(2000);
		
		 SDJI.selectByValue("5");
		
		Thread.sleep(2000);

		 SDJI.selectByValue("6");
		
		Thread.sleep(2000);

		 SDJI.selectByValue("10");
		
		Thread.sleep(2000);

		 SDJI.selectByValue("11");
		
		Thread.sleep(2000);

		 SDJI.selectByValue("15");
		
		WebElement Hcl =driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		
		Select Sappa = new Select (Hcl);
		
		Sappa.selectByValue("9");
		
		Thread.sleep(2000);
		
		Sappa.selectByValue("6");
		
		Thread.sleep(2000);
		
		Sappa.selectByValue("3"); 
		
		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();
		
//		$ 100 Physical Gift Card-------------------------------------
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/100-physical-gift-card\"])[2]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"giftcard_45_RecipientName\"]")).sendKeys("Aishwarya");
		
		driver.findElement(By.xpath("//textarea[@id=\"giftcard_45_Message\"]")).sendKeys("Miss my Home..!");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-45\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-45\"]")).click();
		
		driver.navigate().back();
		
//		$ 50 Physical Gift Card---------------------------------------
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/50-physical-gift-card\"])[2]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"giftcard_44_RecipientName\"]")).sendKeys("Ilove My nana");
		
		driver.findElement(By.xpath("//textarea[@id=\"giftcard_44_Message\"]")).sendKeys("I love my amma ");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-44\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-44\"]")).click();
		
		driver.navigate().back();
		
//		$ 25 virtual Gift Cards--------------------------------------
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/25-virtual-gift-card\"])[2]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"giftcard_43_RecipientName\"]")).sendKeys("I love Songs");
		
		driver.findElement(By.xpath("//input[@id=\"giftcard_43_RecipientEmail\"]")).sendKeys("sappaaishu485@gmail.com");
		
		driver.findElement(By.xpath("//textarea[@id=\"giftcard_43_Message\"]")).sendKeys("Kumari kanna frnds");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-43\"]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-43\"]")).click();
		
		driver.navigate().back();
	}
}