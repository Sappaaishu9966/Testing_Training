package browser;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class Launching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
		
		ChromeOptions options=new ChromeOptions();//class instantiation/object creation for the class
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		System.out.println("Mahi");
	
		
//		System.setProperty("webdriver.driver.chrome", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.facebook.com/");
//		
//		driver.manage().window().maximize();
	}

}
