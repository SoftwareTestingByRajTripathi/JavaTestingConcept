package testcase;

import org.testng.annotations.Test;

import basepage.BaseClassPage;
import testpage.DashboardTestPage;
import testpage.LoginPage;

public class DashBoardTestCase extends BaseClassPage{
	LoginPage loginpage;
	DashboardTestPage dashboardtestpage;
	@Test
	public void clickOnLiveClass() throws Exception
	{
		loginpage = new LoginPage(driver);
		loginpage.ClickOnLogin();
		Thread.sleep(3000);
		loginpage.loginuser("teacherxII@gmail.com", "123456");
		dashboardtestpage= new DashboardTestPage(driver);
		dashboardtestpage.clickDashboard();
		Thread.sleep(3000);
		dashboardtestpage.clickLiveClass();
		Thread.sleep(3000);
		dashboardtestpage.CreateSheduleClass();
		Thread.sleep(3000);
		//dashboardtestpage.createBoard();
		Thread.sleep(3000);
		dashboardtestpage.createClass();
		Thread.sleep(3000);
		dashboardtestpage.selectSubject();
		Thread.sleep(3000);
		dashboardtestpage.selectSection();
		Thread.sleep(3000);
		dashboardtestpage.selectDate();
		Thread.sleep(3000);
		dashboardtestpage.titleofLecture();
		Thread.sleep(3000);
		dashboardtestpage.recordedTitle();
		Thread.sleep(3000);
		dashboardtestpage.duration();
		Thread.sleep(3000);
		//dashboardtestpage.ClickCheckBoxforselfLecture();
		Thread.sleep(3000);
		dashboardtestpage.ClickOnSave1();
		
		
		
		
		
		
		
		
		
		
		
			
		}
	}
	


