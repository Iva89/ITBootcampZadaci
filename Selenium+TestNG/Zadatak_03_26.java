package itbootcamp.DomaciSelenium.Zadatak0326;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak_03_26 {

	public static void main(String[] args) {
		
		System.setProperty("driver.gecko.driver", "geckodriver.exe");
		
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://www.techlistic.com/p/selenium-practice-form.html");
		wd.manage().window().maximize();
		
		wd.findElement(By.name("firstname")).sendKeys("Ivana");
		wd.findElement(By.name("lastname")).sendKeys("Djokic");
		wd.findElement(By.id("sex-1")).click();
		wd.findElement(By.id("exp-1")).click();
		wd.findElement(By.id("datepicker")).sendKeys("03/27/2020");
		wd.findElement(By.id("profession-0")).click();
		wd.findElement(By.id("profession-1")).click();
		wd.findElement(By.id("tool-2")).click();
		
		Select continent = new Select(wd.findElement(By.id("continents")));
		continent.selectByVisibleText("Europe");
		
		Select commands = new Select(wd.findElement(By.id("selenium_commands")));
		commands.selectByVisibleText("Switch Commands");
		
		try {
			wd.findElement(By.id("photo")).sendKeys("C:\\Users\\Bosko\\Desktop\\Kosta\\Kostin dino.jpg");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		wd.findElement(By.linkText("Click here to Download File")).click();
		wd.findElement(By.xpath("//span[contains(text(),'behave-rest')]")).click();
		wd.findElement(By.xpath("//summary[@class='btn btn-sm ml-2 btn-primary']")).click();
		wd.findElement(By.xpath("//a[contains(@class,'flex-1 btn btn-outline get-repo-btn')]")).click();
		wd.navigate().back();
		wd.navigate().back();
		
		WebDriverWait wait = new WebDriverWait(wd, 5);
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		
		wd.findElement(By.name("submit")).click();
		
		wd.close();
		
	

	}

}
