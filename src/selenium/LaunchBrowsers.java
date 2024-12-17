package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowsers {
	 static WebDriver driver;

	public static void main(String[] args) throws Exception {
		//WebDriver = new ChromeDriver();
		//ChromeDriver = new ChromeDriver();
		//driver = new FireFoxDriver();
		//driver = new EdgeDriver();
		driver = new ChromeDriver();
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().window().minimize();
		driver.quit();
		//driver.close();
	
	

	}

}
