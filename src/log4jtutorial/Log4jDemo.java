package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	WebDriver driver;
	
  @Test
  public void googlesearch() {
	  Logger log= Logger.getLogger("Search");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver = new ChromeDriver(); 
	  log.info("chrome browser launched");
	 
	  driver.manage().window().maximize();
	  log.info("browser window maximized");
	  driver.get("https://www.google.com");
	  log.info("Navigate to the google applications");
	  driver.findElement(By.name("q")).sendKeys("Tirupati");
	  log.info("in google search field Tirupati text enter");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  log.info("enter button pressed in keyboard");
  }
}
