package sample;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Calibraint\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
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
		 
		 driver.findElement(By.id("add-to-cart-button")).click();
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();

	}

}
