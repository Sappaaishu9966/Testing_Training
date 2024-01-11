package Selenium_Practice_1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandSet {
    private String url;
    private String title;

     GetandSet(String url,String title)
     {
        this.url = url;
        this.title = title; // Initial title set to null
    }

    // Getter method for the title
    public String getTitle() 
    {
        return title;
    }

    // Setter method for the title
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    // Method to open th][7;p89\
   // webpage and set the title
    public void openPage() 
    {
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        this.title = driver.getTitle(); // Set the initial title

        driver.quit();
    }

    // Example usage
    public static void main(String[] args)
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	

        String url = "https://example.com";
        GetandSet webPage = new GetandSet(url,"Aishu");
        webPage.getTitle();
  //      System.out.println(webPage.

        webPage.openPage();
        System.out.println("Original Title: " + webPage.getTitle());

        // Set a new title using the setter method
        webPage.setTitle("New Page Title");
        System.out.println("Updated Title: " + webPage.getTitle());
    }
}


