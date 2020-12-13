package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class session1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Extramarks\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		driver.close();
	}

}
