package pakg;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	public static void main(String[] args) {
		
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Extramarks\\Desktop\\ChromeDriver86\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();//for maximize the open browser window//
	//File src = TakeScreenshot,driver
	
	
	}
}
