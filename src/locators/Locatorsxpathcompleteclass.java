package locators;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locatorsxpathcompleteclass {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@Test
	void absolutexpathorfullxpathandrelativexpathtest() {
		// absolute or full xpath
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("kamasanikaveri@gmail.com");
		// relative xpath
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("King@123");
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		// why absolute not good-if we remove one div also it will breaks
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).click();
		
		
	}
	
	

}
