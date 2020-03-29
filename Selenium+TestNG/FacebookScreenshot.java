package itbootcamp.DomaciSelenium.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FacebookScreenshot {

	@Test
	public static void main (String [] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		
		wd.manage().window().maximize();
		
		wd.get("http://www.facebook.com");
		
		TakesScreenshot ts = (TakesScreenshot)wd;//class interfejs u selenijumu
		//ne moze se praviti objekat te klase direktno, radi se preko WebDrivera -wd
		
		File source = ts.getScreenshotAs(OutputType.FILE);// screenshot se cuva u File klasi
		
		FileHandler.copy(source, new File("Screenshots/facebook.png"));
		//kopiraj souce file na drugu lokaciju
		
		System.out.println("Screenshot je odradjen.");
		
		wd.quit();
		
		
	}
}
