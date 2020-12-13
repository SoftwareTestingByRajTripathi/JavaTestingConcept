package testpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AssignHomeworkPage {
	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	WebElement DashBoard;
	@FindBy(xpath = "//a[contains(text(),'Create & Assign Homework')]")
	WebElement Assignhomework;
	public AssignHomeworkPage (WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void clickdashboard()
	{
		DashBoard.click();
	}
	public void clickonAssignhomework()
	{
		Assignhomework.click();
		for (String assignhomework : driver.getWindowHandles())
		{
			driver.switchTo().window(assignhomework);
		}
	}
	public void evulationcat()
	{
		Select evlcat = new Select (driver.findElement(By.xpath("//select[@id='paper_type']")));
		evlcat.selectByVisibleText("Work Sheet");
		
	}
	public void board()
	{
		Select board = new Select (driver.findElement(By.xpath("//select[@id='boardIDTemp']")));
		board.selectByVisibleText("CBSE");
	}
	public void selectclass()
	{
		Select classselect = new Select(driver.findElement(By.xpath("//select[@id='classID']")));
		classselect.selectByValue("38");
	}
	
	public void subject()
	{
		Select subject = new Select (driver.findElement(By.xpath("//select[@id='subjectID']")));
		subject.selectByVisibleText("Physics");
		
	}

	public void section() throws InterruptedException
	{
		WebElement section = driver.findElement(By.xpath("//span[contains(text(),'Select')]"));
		section.click();
		Thread.sleep(3000);
		WebElement selectall = driver.findElement(By.xpath("//span[contains(text(),'All selected (1)')]"));
		selectall.click();
	}
	@FindBy(xpath="//input[@id='paper_name']")WebElement QPaper;
	public void QustionPaperName()
	{
		QPaper.sendKeys("haomeworkformagnetics");
	}
	public void languageofPaper()
	{
		Select languageofQpaper = new Select (driver.findElement(By.xpath("//select[@id='language_id']")));
		languageofQpaper.selectByVisibleText("English");
		
	}
}
