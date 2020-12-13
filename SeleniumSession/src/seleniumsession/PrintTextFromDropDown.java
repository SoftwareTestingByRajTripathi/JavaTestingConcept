package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintTextFromDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Extramarks\\Desktop\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://emstage2.extramarks.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement login = driver.findElement(By.xpath("//a[@class='signin'][1]"));
				login.click();
				Thread.sleep(3000);
		WebElement userid = driver.findElement(By.xpath("//input[@id='usernameLogin']"));
				userid.sendKeys("teacherxII@gmail.com");
				Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@id='passwdLogin']"));
				pass.sendKeys("123456");
				Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("//a[@id='login-account']"));
		submit.click();
		Thread.sleep(3000);
		WebElement liveclass = driver.findElement(By.xpath("//a[contains(text(),'Live Class')]"));
		liveclass.click();
		Thread.sleep(3000);
		//WebElement seesion = driver.findElement(By.xpath("//select[@id='wiziqsessionType']"));
		WebElement seesion1 = driver.findElement(By.id("wiziqsessionType"));
		Select counttext = new Select(seesion1);
		List<WebElement> list = counttext.getAllSelectedOptions();
		for (int i =0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
				

}
}
