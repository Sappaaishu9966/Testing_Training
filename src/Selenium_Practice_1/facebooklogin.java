package Selenium_Practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();//class instantiation/object crreation for the class
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
//		ctrl+s
		// single line comment
		/*hi
		every multi line comm
		one*/
		driver.manage().window().maximize();
	}

	
}
