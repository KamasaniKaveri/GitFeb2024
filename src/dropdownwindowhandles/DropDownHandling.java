package dropdownwindowhandles;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownHandling {
	WebDriver driver;
  @Test
  public void selectbyindexvaluevisibletext() {
	  driver.get("https://www.facebook.com");
	  driver.get("https://www.facebook.com/r.php");
	 
	 Select dropdown1 = new Select(driver.findElement(By.id("day")));
	 dropdown1.selectByIndex(2);
	 
	 Select dropdown2 = new Select(driver.findElement(By.name("birthday_month")));
	 dropdown2.selectByValue("3");
	 
	 Select dropdown3 = new Select(driver.findElement(By.id("year")));
	 dropdown3.selectByVisibleText("2001");
	 
	 //Select dropdown4 = new Select(driver.findElement(By.name("birthday_month")));
	 //List<WebElement> list1 = dropdown4.getOptions();
	// int size=list1.size();
	// System.out.println(size);
	 
	 Select dropdown5 = new Select(driver.findElement(By.id("year")));
	 List<WebElement> list2 = dropdown5.getOptions();
	 int size=list2.size();
	 for(int i =0; i<size ; i++) {
		 String optValue = list2.get(i).getText();
		 System.out.println(optValue);
	 }
	
	 
	 
	  
	  
	
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }

}
