package sample;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	
		
		public static WebDriver driver;
		public static void main (String args[]) throws InterruptedException, IOException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Calibraint\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
         driver.get("https://demo.guru99.com/test/write-xpath-table.html");
         Thread.sleep(1000);
         driver.manage().window().maximize();
         
         //get content of the table
         List<WebElement> tblelist = driver.findElements(By.tagName("table"));
         System.out.println(tblelist.size());         
         System.out.println(tblelist.get(1).getText());
         
         //get content of row wise
         
         List<WebElement> rowlist = driver.findElements(By.tagName("tr"));
         System.out.println(rowlist.size());
        // System.out.println(rowlist.get(1).getText());
         
         for(int i=0;i<=2;i++) {
        	 System.out.println(rowlist.get(i).getText());
         }
         
         
         
       

	}

}
