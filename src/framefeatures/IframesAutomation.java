package framefeatures;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IframesAutomation {
	WebDriver driver;
  @Test
  public void framesapplication() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(4000);
	  //if we gave below code line it doesnot work because it is inside framework
	 // driver.findElement(By.xpath("/html/body/button")).click();
	  //now code using frame work first and then code for that element
	  WebElement frm = driver.findElement(By.id("iframeResult"));
	  driver.switchTo().frame(frm);
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("/html/body/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();//single line code to accept
	 /* Alert art = driver.switchTo().alert();// by creating alert class to accept
	  art.accept();*/
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();//not executed bcoz we wrote code inside iframe .so we came out and then it will works
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
