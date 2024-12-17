package locators;



import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Loacatorsonetoseven {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void testxpathlocator() throws InterruptedException {
	
		driver.get("https:www.facebook.com");
	
		//driver.findElement(By.id("email")).sendKeys("kamasanikaveri@gmail.com");
		
		//driver.findElement(By.name("email")).sendKeys("9392884409");
		
		//driver.findElement(By.className("inputtext")).sendKeys("9392884409");
		
		//driver.findElement(By.tagName("input")).sendKeys("9392884409");
		
		
			List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		
			System.out.println("Total links on facebook:" +totallinks.size());
		
		
		
		//driver.findElement(By.linkText("Forgotten Password?")).click();
		//driver.findElement(By.linkText("Forgotten Password")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("9392884409");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("9392884409");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("9392884409");
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("kaveriK@123");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("king");
		
		
	}

}
