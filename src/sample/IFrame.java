package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Calibraint\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
			
		Thread.sleep(1000);
		
		
		
		
	}

}
