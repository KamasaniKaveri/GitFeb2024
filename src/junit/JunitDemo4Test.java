package junit;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo4Test {
	WebDriver driver;

	

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void selenium() {
		driver.get("https://www.selenium.com");
		

	}
	@Test
	void google() {
		driver.get("https://www.selenium.com");
		

	}

}
