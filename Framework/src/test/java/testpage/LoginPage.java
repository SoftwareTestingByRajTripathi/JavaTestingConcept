package testpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;
	@FindBy(xpath="//a[@class='signin'][1]") WebElement Loginbutton;
	@FindBy (xpath="//input[@id='usernameLogin']")WebElement userid;
	@FindBy (xpath="//input[@id='passwdLogin']")WebElement password;
	@FindBy (xpath = "//a[@id='login-account']")WebElement clickonLogin;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	PageFactory.initElements(driver,this);
	}
	public void ClickOnLogin()
	{
		Loginbutton.click();
	}
	public void loginuser(String username,String userPassword)
	{
		userid.sendKeys(username);
		password.sendKeys(userPassword);
		clickonLogin.click();
	}
}
