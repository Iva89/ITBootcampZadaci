package TestOtvaranjaWebStrane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOpenPage {
  @Test
  public void testTitle() {
	  
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver wd = new FirefoxDriver();
	
		wd.get("https://www.facebook.com/");
		Assert.assertEquals(wd.getTitle(), "Facebook - Log In or Sign Up");
		wd.quit();
  }
}
