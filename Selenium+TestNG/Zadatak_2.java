package itbootcamp.DomaciSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://www.youtube.com/");
		
		for (int i = 0; i<5; i++) {
			wd.navigate().refresh();
		}
		
		wd.close();
	}

}
