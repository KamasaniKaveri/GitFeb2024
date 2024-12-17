package alertwindowhandles;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertBoxOkTextSendOk {
	WebDriver driver;
  @Test
  public void alertokbutton() throws InterruptedException {
	  driver.get("https://selenium.dev/confirmation-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();  
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
  }
  @Test
  public void alertcancelbutton() throws InterruptedException {
	  driver.get("https://selenium.dev/confirmation-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();  
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
  }
  @Test
  public void noalertbutton() throws InterruptedException {
	  driver.get("https://selenium.com");
	  Thread.sleep(5000);
	  driver.switchTo().alert().dismiss();
  }
  @Test
  public void alertsendtextokbutton() throws InterruptedException {
	  driver.get("https://selenium.dev/confirmation-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click(); 
	  Thread.sleep(3000);
	 
	 /* driver.switchTo().alert().sendKeys("usha");
	  driver.switchTo().alert().accept();*/
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	 driver.manage().window().maximize();
  }

}
