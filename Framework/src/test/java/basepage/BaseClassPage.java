package basepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClassPage {
	public WebDriver driver;
	@BeforeTest
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Extramarks\\Desktop\\ChromeDriver86\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://emstage2.extramarks.com/");
		
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}
