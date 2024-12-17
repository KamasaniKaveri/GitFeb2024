package screenshot;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FullPageScreenshot {
	WebDriver driver;
	
  @Test
  public void CompletePageScreenshot() throws InterruptedException, IOException {
	  driver.get("https://www.selenium.dev/downloads/");
	  Thread.sleep(3000);
	  Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	  ImageIO.write(s.getImage(),"PNG",new File("c:\\Lib\\Feb\\Screenshots\\pagescreenshot.png"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
