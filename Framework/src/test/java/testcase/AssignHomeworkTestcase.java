package testcase;

import org.testng.annotations.Test;

import basepage.BaseClassPage;
import testpage.AssignHomeworkPage;
import testpage.LoginPage;

public class AssignHomeworkTestcase extends BaseClassPage {
	LoginPage loginpage;
	AssignHomeworkPage assignworkpage;
	@Test
	public void clickonassignhomework () throws InterruptedException
	{
		loginpage = new LoginPage(driver);
		loginpage.ClickOnLogin();
		Thread.sleep(3000);
		loginpage.loginuser("teacherXII@gmail.com","123456");
		assignworkpage = new AssignHomeworkPage(driver);
		assignworkpage.clickdashboard();
		assignworkpage.clickonAssignhomework();
		assignworkpage.evulationcat();
		assignworkpage.board();
		
	}
	
	
	

}
