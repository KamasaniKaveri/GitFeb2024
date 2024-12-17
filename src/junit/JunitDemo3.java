package junit;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo3 {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void google() {
		driver.get("https://www.google.com");
	}
	@Test
	void selenium() {
		driver.get("https://www.facebook.com");
	}
	@Test
	void redmine() {
		driver.get("https://www.selenium.com");
	}
	@Test
	void facebook() {
		driver.get("https://www.redmine.com");
	}
	@Test
	void twitter() {
		driver.get("https://www.twitter.com");
	}

}
