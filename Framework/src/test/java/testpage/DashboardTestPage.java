package testpage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashboardTestPage {
	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	WebElement DashBoard;
	@FindBy(xpath = "//a[contains(text(),'Live Class')]")
	WebElement ClickOnLiveclass;

	public DashboardTestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickDashboard() {
		DashBoard.click();
	}

	public void clickLiveClass() {
		ClickOnLiveclass.click();
		for (String livepage : driver.getWindowHandles()) {
			driver.switchTo().window(livepage);
		}
	}

	public void CreateSheduleClass() {
		Select SessionType = new Select(driver.findElement(By.xpath("//select[@id='wiziqsessionType']")));
		SessionType.selectByVisibleText("Live Lecture");

	}

	//public void createBoard() {
		//Select createBoard = new Select(driver.findElement(By.xpath("//select[@id='selectedBoard']")));
		//createBoard.selectByVisibleText("CBSE");

	//}

	public void createClass() {
		Select creatclass = new Select(driver.findElement(By.xpath("//select[@id='sel_180']")));
		creatclass.selectByVisibleText("XII");

	}

	public void selectSubject() {
		Select subject = new Select(driver.findElement(By.xpath("//select[@id='sel_38']")));
		subject.selectByVisibleText("Physics");
	}
	public void selectSection() throws InterruptedException {
		WebElement section = driver.findElement(By.xpath("//span[@class='multiselect-selected-text']"));
		section.click();
		Thread.sleep(3000);
		WebElement selectall = driver.findElement(By.xpath("//label[contains(text(),'Select all')]"));
		selectall.click();

	}

	public void selectDate() throws Exception {
		driver.findElement(By.id("date_timepicker")).click();
		Thread.sleep(3000);
		List<WebElement> selectdate = driver.findElements(By.xpath("//td[contains(@class, 'xdsoft_today')]"));
		selectdate.get(1).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='xdsoft_timepicker active']")).click();
		
	}

	public void titleofLecture() {
		WebElement title = driver.findElement(By.xpath("//input[@id='lecture_title']"));
		title.sendKeys("testingByRaj");
	}

	@FindBy(xpath = "//input[@id='recorded_title']")
	WebElement recodedtitle;

	public void recordedTitle() {
		recodedtitle.sendKeys("TestingByRaj1");

	}

	@FindBy(xpath = "//input[@id='duration']")
	WebElement duration;

	public void duration() {
		duration.sendKeys("30 min");
	}
	//public void uploadLectureNote () throws InterruptedException
	//{
		//driver.findElement(By.xpath("//div[@id='pptfileName']")).click();
		
        //String MainWindow=driver.getWindowHandle();	

        // To handle new opened window.				
        //Set<String> s1 = driver.getWindowHandles();
        //Iterator<String>i1 = s1.iterator();
        //while(i1.hasNext())
        //{
        	//String childwindow = i1.next();
        	//if(!MainWindow.equalsIgnoreCase(childwindow))
        	//{
        		//switch to child window
        		//driver.switchTo().window(childwindow);
        		//driver.manage().window().maximize();
        		//Thread.sleep(3000);
        		//driver.findElement(By.xpath("//label[@class='button']")).click();
        //} }
	//@FindBy (xpath="//div[@id='lectureForSelfDiv']")WebElement CheckBox;
	//public void ClickCheckBoxforselfLecture (){
		//CheckBox.click();
		//if(CheckBox.isSelected())
		//{
			//System.out.println("option is selected");
		//}
		//else{
			//System.out.println("Option is not select");
		//}
	//}
	@FindBy(xpath="//input[@name='submit_data']")WebElement clickonSavebutton;
		public void ClickOnSave1()
		{
			clickonSavebutton.click();
		}
		
		
	}     

