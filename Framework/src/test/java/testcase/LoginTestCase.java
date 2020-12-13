package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepage.BaseClassPage;
import testpage.LoginPage;

public class LoginTestCase extends BaseClassPage{
	LoginPage loginpage;
	@Test
	public void userlogin() throws InterruptedException
	{
		loginpage = new LoginPage(driver);
		loginpage.ClickOnLogin();
		Thread.sleep(3000);
		loginpage.loginuser("teacherxII@gmail.com","123456");
		String ActualUrl = driver.getCurrentUrl();
		String exceptedUrl = "https://gotoschool.extramarks.com/";
		Assert.assertEquals(exceptedUrl, ActualUrl);
		System.out.println("Login Sucessfully");
		
		
	}
	

}
