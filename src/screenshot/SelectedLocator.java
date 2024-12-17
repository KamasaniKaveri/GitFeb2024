package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedLocator {
	WebDriver driver;
	
  @Test
  public void Takescreenshot() throws InterruptedException, IOException {
	  driver.get("https://google.com/");
	  Thread.sleep(3000);
	  
	  // we can do like this also as per standards in selenium
	//  WebElement s = driver.findElement(By.name("q"));
	 // s.sendKeys("selenium");
	// driver.findElement(By.name("q")).sendKeys("selenium");
	  
	  WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
	  File f = logo.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("C:\\Lib\\Feb\\Screenshots\\googlelogo.png"));
	   
	   WebElement gm = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
	   File f1 = gm.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(f1,new File("C:\\Lib\\Feb\\Screenshots\\gmail.png"));
	  
  }
 
	

@BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
