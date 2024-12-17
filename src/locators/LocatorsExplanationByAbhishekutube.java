package locators;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsExplanationByAbhishekutube {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

	@Test
	void testlocatorstest() {
		
		driver.get("https://www.facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("kamasanikaveri@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("kaveri");
		driver.findElement(By.className("inputtext")).sendKeys("kamasanikaveri@gmail.com");
		driver.findElement(By.tagName("input")).sendKeys("9392884409");
		driver.findElement(By.linkText("Forgotten Password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("9392884409");*/
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();		
	}

}
