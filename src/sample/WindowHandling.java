package sample;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
	public static WebDriver  driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Calibraint\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	 driver= new ChromeDriver();
	 
	 driver.get("https://www.amazon.in");
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("chocolates" + Keys.ENTER);
	 Thread.sleep(1000);
	 
	 
	 List<WebElement> chocolists = driver.findElements(By.className("s-image"));
	 System.out.println(chocolists.size());
		 chocolists.get(0).click();
	 
	 String page1= driver.getWindowHandle();
	
	 
	 Set<String> allpage = driver.getWindowHandles();
	
	
	 for(String x : allpage) {
	 if(!page1.equals(allpage)) {
		 driver.switchTo().window(x);
	 }
	
	}
	 //using index
	/*
	 List<String> l= new LinkedList<>();
	l.addAll(allpage);	
	driver.switchTo().window(l.get(1));
	 
	 */
	 
	 driver.findElement(By.id("add-to-cart-button")).click();
	
	 
	}
}
