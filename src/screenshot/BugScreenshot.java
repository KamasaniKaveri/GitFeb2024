package screenshot;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;
	
	public void Bug() throws Exception {
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\\\Lib\\\\Feb\\\\Screenshots\\\\Failed Screenshot1.png"));
		
		
		
		
	}
  @Test
  public void redmine() throws Exception {
	  driver.get("https://www.redmine.org/");
	  try
	  {
		  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Raju");
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123");
		  driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("//input[@id='user_loginxyz']")).sendKeys("demouser");
	  }
	  catch (Exception e)
	  {
		  System.out.println("Failed Screenshot due to...+e");
		  Bug();
	  }
		  
}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
