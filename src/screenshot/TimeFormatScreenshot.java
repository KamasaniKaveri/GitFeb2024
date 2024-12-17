package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormatScreenshot {
	WebDriver driver;
	
	public void TakeScreenshot() throws IOException {
		  SimpleDateFormat dateformat = new SimpleDateFormat("yyyy_MMM_dd_HH_SS");
		  Date date = new Date();
		  String time = dateformat.format(date);
		  
		  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("c:\\Lib\\Feb\\Screenshots\\Image_"+time+".png"));
	  }
	
  @Test
  public void google() throws InterruptedException, IOException {
	  driver.get("https://google.com");
	  Thread.sleep(2000);
	  TakeScreenshot();
	  
	  driver.findElement(By.name("q")).sendKeys("Tirupati");
	  Thread.sleep(1000);
	  TakeScreenshot();
	  
	 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(1000);
	  TakeScreenshot();
	  
	 driver.findElement(By.xpath("//*[@id=\"hdtb-sc\"]/div/div/div[1]/div/div[3]/a/div")).click();
	  Thread.sleep(1000);
	  TakeScreenshot();
	  
	
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
