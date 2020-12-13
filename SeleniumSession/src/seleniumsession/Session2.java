package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Extramarks\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		WebElement enteremail= driver.findElement(By.xpath("//input[@id='email_create']"));
		enteremail.sendKeys("tripathideva@gmail.com");
		WebElement createaccoutbutton = driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]"));
		createaccoutbutton.click();
	
	
	

		
	}

}
