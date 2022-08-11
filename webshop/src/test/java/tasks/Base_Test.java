package tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class Base_Test {
	public WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void browser_setup() 
	{
//	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver= new ChromeDriver();
	Reporter.log("successfully browser is launched");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}

	@BeforeMethod     //navigate to application
	public void  login() {
	
	}
		
	@AfterMethod   //logout
	public void logout() {

	}
	
	@AfterClass   //close app
	public void browser_tear_down() {
	
	driver.quit();
}
}
