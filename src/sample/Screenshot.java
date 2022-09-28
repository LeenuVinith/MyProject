package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static WebDriver driver;
	public static void main (String args[]) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Calibraint\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
		
	Thread.sleep(7000);
		
	TakesScreenshot screen = (TakesScreenshot)driver;
	File src = screen.getScreenshotAs(OutputType.FILE);
	
	File dest= new File("C:\\Users\\Calibraint\\Documents\\Downloaded Apps\\Screenshot selenium\\screenshot.png");
	FileUtils.copyFile(src, dest);
	
		
		
	}

}
