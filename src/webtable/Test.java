package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("Number of rows:" + rows);

		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();

		System.out.println("Number of columns:" + cols); // 4

		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		
		System.out.println(value); // Master In JS

		System.out.println("Book Name" + "     " + "Author" + "    " + "Subject" + "       " + "Price");

		for (int r = 2; r <= rows; r++) {
			
		for (int c = 1; c <= cols; c++) {
				
		String value1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
				
		System.out.print(value1 + "\t");
				
		}
			
		System.out.println();
			
		}

		for (int r = 2; r <= rows; r++) {
			
		String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[2]")).getText();

		if (author.equals("Amit")) {
				
		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[1]")).getText();
				
		System.out.println(author + "    " + bookname);
				
			}

		}
		
		for (int r = 2; r <= rows; r++) {
			
		String author_1 =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+ r +"]//td[2]")).getText();
		
		if (author_1.equals("Mukesh")) {
			
		String bookname_1 = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+ r +"]//td[1]")).getText();
		
		System.out.println(author_1 +"-"+bookname_1);
			
			}	
			
		}
		
		for (int r = 2; r<= rows; r++) {
		
		String subject	=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+ r +"]//td[3]")).getText();
		
		if (subject.equalsIgnoreCase("JAVASCRIPT")){
			
		String bookname_2 = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[" + r +"]//td[1]")).getText();
		
		System.out.println(subject + "-" + bookname_2);
			
			}
		
		}

		int sum = 0;
		
		for (int r = 2; r <= rows; r++) {
			
		String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[4]")).getText();
			
		sum = sum + Integer.parseInt(price);

		}

		System.out.println("Total price of books:" + sum);
	}

}
