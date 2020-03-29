package itbootcamp.DomaciSelenium.Zadatak0327;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak_01_0327 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://www.youtube.com/");
		wd.findElement(By.xpath("//input[@id='search']")).sendKeys("Never gonna give you up");
		wd.findElement(By.id("search-icon-legacy")).click();
		WebDriverWait wait = new WebDriverWait (wd, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Rick Astley "
				+ "- Never Gonna Give You Up (Video)")));
		wd.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer'][contains(text(),'Rick Astley - Never Gonna Give You Up (Video)')]")).click();
		
		try{
			wd.findElement(By.className("ytp-ad-text ytp-ad-skip-button-text")).click();
		}catch(NoSuchElementException e1) {
			System.out.println("Nema skip reklame.");
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ytd-compact-video-renderer[@class='style-scope ytd-compact-autoplay-renderer']//span[@id='video-title']")));
		wd.findElement(By.xpath("//ytd-compact-video-renderer[@class='style-scope ytd-compact-autoplay-renderer']//span[@id='video-title']")).click();
		
		wd.quit();
		
	}

}
