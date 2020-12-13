package pakg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLink {
    public static void main(String[] args) 
    {         
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Extramarks\\Desktop\\Driver\\chromedriver.exe");     
  WebDriver driver=new ChromeDriver();     
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);          
  driver.manage().window().maximize();          
  //Opening the air bnb Goa homestays page     
  driver.get("https://www.airbnb.co.in/s/Goa/all");         
  //locating an element via link text now and clicking on that stay     
  List<WebElement> poolNumber=driver.findElements(By.partialLinkText("Pool"));          
  //find the number of links with the text as pool    
  int numberOfStaysWithPool= poolNumber.size();          
  System.out.println(numberOfStaysWithPool);          
  for(int k=0; k>=numberOfStaysWithPool; k++)   
  {       
	  //printing all those links       
  System.out.println(poolNumber.get(k).getText());        
  }  
  //select the luxury three bedroom apartment link     
poolNumber.get(2).click();                
driver.quit();  
}   }



