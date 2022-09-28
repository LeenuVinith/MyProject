package sample;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
			
				
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Calibraint\\Downloads\\chromedriver_win32\\chromedriver.exe");
 //driver= new ChromeDriver();
 
 //chrome notification popup handling
 
 ChromeOptions options = new ChromeOptions();
 Map<String, Object> prefs = new HashMap<String, Object>();
//1 for allowing, 2 for disabling popup, 0 for default 
prefs.put("profile.default_content_setting_values.notifications", 2);
options.setExperimentalOption("prefs", prefs);
driver = new ChromeDriver(options);

driver.get("https://testin.preserveapp.com/login");
driver.manage().window().maximize(); 
Thread.sleep(1000);
		 
/*Signup
 
  driver.findElement(By.xpath("//a[text()='Sign up']")).click();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  Actions act1= new Actions(driver);
  WebDriverWait wait1=new WebDriverWait(driver,10);
  WebElement gender=wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Female')]")));
  act1.click(gender).perform();
 driver.findElement(By.name("firstName")).sendKeys("Leee"); 
 driver.findElement(By.name("lastName")).sendKeys("Demo");
 driver.findElement(By.name("email")).sendKeys("leenu+090900010@calibraint.com");
 driver.findElement(By.name("password")).sendKeys("Test@123");
 driver.findElement(By.xpath("//span[text()='Create Account']")).click();
driver.findElement(By.xpath("//a[text()='Back to Sign In']")).click();
*/

//Login

driver.findElement(By.name("email")).sendKeys("leenu+1210@calibraint.com");
driver.findElement(By.name("password")).sendKeys("Test@123");	
driver.findElement(By.className("MuiButton-label")).click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



/*Alert handling

//Alert alert= driver.switchTo().alert();
Thread.sleep(5000);
String alrtmessage= driver.switchTo().alert().getText();
System.out.println(alrtmessage);

*/
		
		

//Add Relative

driver.findElement(By.xpath("//span[contains(text(),'Add Relative')]")).click();
 driver.findElement(By.xpath("//div[contains(text(),'Choose Relationship')]")).click();
driver.findElement(By.xpath("//div[contains(text(),'Father')]")).click();
driver.findElement(By.id("first-name")).sendKeys("Charles");
driver.findElement(By.xpath("//input[@placeholder='ex: Jobs']")).sendKeys("Job");
driver.findElement(By.id("email")).sendKeys("leenu+ac@calibraint.com");



//date picker
driver.findElement(By.id("dob")).click();


String expecteddob= "12-January 2022-2022";
String edate= expecteddob.split("-")[0];
String emonth_year= expecteddob.split("-")[1];
String eyear= expecteddob.split("-")[2];
System.out.println(edate+ "**" +emonth_year+ "**"+eyear);
String cmonth_year=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText().trim();
System.out.println(cmonth_year);

//select month	
while(!cmonth_year.equals(emonth_year)) {
	Thread.sleep(1000);
	Actions act2=new Actions(driver);
	WebDriverWait wait2= new WebDriverWait(driver, 10);
	WebElement previous=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/button[1]")));	
	act2.click(previous).perform();
	cmonth_year=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText().trim();
}
/*
//select year
driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiPickersToolbarButton-toolbarBtn']")).click();
List<WebElement> cyear=driver.findElements(By.xpath("//div[@class='MuiTypography-root MuiPickersYear-root MuiTypography-subtitle1']"));
for (WebElement ey : cyear) {
	
	if(ey.getText().trim().equals(eyear)) {
		System.out.println(ey.getText());
		ey.click();
		break;
	}		
	}
	*/
//select date
List<WebElement> cdate= driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

for (WebElement ed : cdate) {
if(ed.getText().trim().equals(edate)) {
	ed.click();
break;
}
}

driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();   


}
}	
