package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Demo1_testing {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://only-testing-blog.blogspot.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://bro.ibomma.day/telugu-movies/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@id=\"gparent_1\"]")).sendKeys("Hema");
		
		driver.findElement(By.xpath("//input[@id=\"parent_1\"]")).sendKeys("Ammi");
		
		driver.findElement(By.xpath("//input[@id=\"child_1\"]")).sendKeys("Deepu");
		
		driver.findElement(By.xpath("//input[@id=\"gparent_2\"]")).sendKeys("Ammu");
		
		driver.findElement(By.xpath("//input[@id=\"parent_2\"]")).sendKeys("Poojie");
		
		driver.findElement(By.xpath("//input[@id=\"child_2\"]")).sendKeys("Aishu");
				
		driver.findElement(By.xpath("//body[@class=\" variant-simplysimple\"]")).click();
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//input[@id=\"tooltip-1\"]")).sendKeys("Dhamaha");
		
		driver.findElement(By.xpath("//input[@class=\"s_name\"]")).sendKeys("Sappa");
		
		driver.findElement(By.xpath("//input[@class=\"y_address\"]")).sendKeys("3-84,middle street,Vizag");
		
		driver.findElement(By.xpath("//input[@name=\"Town\"]")).sendKeys("Vizingaram");
		
		driver.findElement(By.xpath("//input[@name=\"Country\"]")).sendKeys("India");
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//table[@border=\"1\"])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[4]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[5]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> Days =driver.findElements(By.xpath("//ol[@id=\"selectable\"]//li"));
	
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[5]")).click();
		
	    driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("02/09/1997");
	    
	    driver.findElement(By.xpath("//div[@class=\"scroll\"]")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("(//input[@type=\"text\"])[10]")).sendKeys("Testing");
	       
	     driver.findElement(By.xpath("(//input[@type=\"text\"])[11]")).sendKeys("Coading");
	      
	     driver.findElement(By.xpath("(//input[@type=\"text\"])[12]")).sendKeys("Java");
	     
	     Thread.sleep(3000);
	      
	     driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[6]")).click();
	     
	     driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[7]")).click();
	       
	     driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[8]")).click();
	       
	     driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[9]")).click();
	      
	     driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[10]")).click();
	     
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("(//input[@name=\"fname\"])[2]")).sendKeys("Ammi");
	       
	     driver.findElement(By.xpath("(//input[@name=\"lname\"])[2]")).sendKeys("Safi");
	     
	     Thread.sleep(3000);
	      
	     //driver.findElement(By.xpath("(//input[@id=\"submitButton\"])[1]")).click();//direct submitted
	     
	     driver.findElement(By.xpath("//input[@name=\"FirstName\"]")).sendKeys("Aishwaray Kumari");
	      
	     driver.findElement(By.xpath("//input[@name=\"LastName\"]")).sendKeys("Sappa");
	     
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//input[@name=\"EmailID\"]")).sendKeys("Sappaaishu@485gmail.com");
	      
	     driver.findElement(By.xpath("//input[@name=\"MobNo\"]")).sendKeys("9963636450");
	     
	     driver.findElement(By.xpath("//input[@name=\"Company\"]")).sendKeys("Charani");
	      
	     Thread.sleep(3000);
	      
	     driver.findElement(By.xpath("//input[@name=\"userid\"]")).sendKeys("SZ6154");
	     
	     driver.findElement(By.xpath("//input[@name=\"pswrd\"]")).sendKeys("Saishu@9963");
	     
	     driver.findElement(By.xpath("(//input[@name=\"fname\"])[3]")).sendKeys("Kumari");
	     
	     driver.findElement(By.xpath("//input[@name=\"lname\"][3]")).sendKeys("Sappa");
	     
	     
	     
	     

	     
	  
	     
	    
			
	    

	    
       
       
      
		
 
	}

}
