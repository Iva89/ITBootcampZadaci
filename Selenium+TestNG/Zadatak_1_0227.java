package itbootcamp.DomaciSelenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zadatak_1_0227 {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver wd = new FirefoxDriver();
		
		
		wd.get("https://www.itbootcamp.rs/");
		
		String title = wd.getTitle();
		int duzina = title.length();
		System.out.println(title + " Duzina naslova je " + duzina);
		
		System.out.println(wd.manage().window().getSize());
		
		wd.manage().window().maximize();
		
		wd.navigate().to("https://itbootcamp.rs/course/testiranje-softvera/");
		
		String url = wd.getCurrentUrl();
		System.out.println(url);
		wd.navigate().to("https://itbootcamp.rs/course/osnove-programiranja/");
	
		url = wd.getCurrentUrl();
		System.out.println(url);
	
		
		wd.navigate().back();
		url = wd.getCurrentUrl();
		System.out.println(url);
		
		
		wd.navigate().forward();
		url = wd.getCurrentUrl();
		System.out.println(url);
		
		
		wd.navigate().back();
		url = wd.getCurrentUrl();
		System.out.println(url);
		
		
		wd.navigate().back();
		url = wd.getCurrentUrl();
		System.out.println(url);
	
		wd.navigate().refresh();
		
		wd.manage().window().setSize(new Dimension(1107, 589));
		
		url = wd.getCurrentUrl();
		System.out.println(url);
		
		wd.get("https://www.google.com/");
		
		wd.close();
		
	}

}
