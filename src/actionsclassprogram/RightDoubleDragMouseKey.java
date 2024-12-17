package actionsclassprogram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightDoubleDragMouseKey{
	WebDriver driver;
  @Test
  public void rightclick() throws InterruptedException {
	  driver.get("https://selenium.com/lander");
	  Thread.sleep(5000);
	  
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"getButtonBoxLink\"]"))).build().perform();

  }
  @Test
  public void doubleclick() throws InterruptedException {
	  driver.get("https://selenium.com/landerdouble-click");
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"getButtonBoxLink\"]"))).doubleClick().build().perform();
  }
  @Test
  public void draganddrop() throws InterruptedException {
	  driver.get("https://selenium.com/draganddrop");
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  
	  WebElement source = driver.findElement(By.id("draggable"));
	  WebElement target = driver.findElement(By.id("droppable"));
	  act.dragAndDrop(source, target).build().perform();	
	  
  }
  @Test
  public void mouseover() throws InterruptedException {
	  driver.get("https://selenium.com/mouseover");
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.linkText("selenium-quiz"))).click().build().perform();
  }
  @Test
  public void keyboardkeys() throws InterruptedException {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
	  Thread.sleep(3000);
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.TAB).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
