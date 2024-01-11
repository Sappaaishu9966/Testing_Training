package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().window().maximize();
		
		int rows= driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		
		System.out.println("Number of rows:"+rows);
		
		int cols= driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
		
		System.out.println("Number of cols:"+cols);

		System.out.println("Company"+"		"+"Contact"+"		"+"Country");
		
		for (int r=2;r<= rows;r++) {
		
		for (int c=1;c<= cols;c++)	{
		
		String value = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+r+"]//td["+c+"]")).getText();
		System.out.print(value	+"\t");
		
			}
		System.out.println();
		}	
		
		
	
	}

}


