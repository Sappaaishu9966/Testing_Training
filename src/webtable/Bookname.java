		package webtable;

		import org.openqa.selenium.By;
		
		import org.openqa.selenium.WebDriver;
		
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Bookname {

		public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr")).size();
		
		System.out.println("Number of rows:"+ rows);
		
		int cols = driver.findElements(By.xpath("//table[@id=\"productTable\"]//th")).size();
		
		System.out.println("Number of cols:"+ cols);
		
		String value = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr[3]//td[3]")).getText();
		
		System.out.println("Product value :"+ value);


	}

}
