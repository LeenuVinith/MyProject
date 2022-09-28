package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Calibraint\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
				
		//scrolldown = true & scrollup= false
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
	    WebElement scrldown= driver.findElement(By.xpath("//div[text()='Connect with Us']"));		
		js.executeScript("arguments[0].scrollIntoView(true)", scrldown);
		System.out.println(scrldown.getText());
		
		/*
		//another method
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,9000)", "");
		*/
		
	}

}
