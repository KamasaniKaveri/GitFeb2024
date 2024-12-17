package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_3_skip_ignore_disable_Testscripts {
	WebDriver driver;
	
	@Test(priority=4,enabled=false)
	  public void twitter() {
		  driver.get("https://www.twitter.com");
	  }
	  @Test(enabled=false,priority=5)
	  public void gmail() {
		  driver.get("https://www.gmail.com");
	  }
	  @Test(priority=0,enabled=false)
	  public void selenium() {
		  driver.get("https://www.selenium.com");
	  }
	  @Test(priority=1,enabled=true)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  @Test(priority=2)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  @Test(priority=3,enabled=false)
	  public void redmine() {
		  driver.get("https://www.redmine.com");
	  }
 
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
