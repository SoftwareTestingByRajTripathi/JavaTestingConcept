package pakg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstScript {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Extramarks\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();//for maximize the open browser window//
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
		//for close the current open browser window.//
		driver.close();

		
	}
	

}
