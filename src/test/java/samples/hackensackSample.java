package samples;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class hackensackSample {

	public static void main(String[] args) {
		tc001();
		tc002();
	}
	public static void tc001() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hackensackmeridianhealth.org/en/");
		
//		driver.findElement(By.xpath("(//*[text()='Find a Location'])[1]")).click();
		
		WebElement findLocation_hoverOver = driver.findElement(By.xpath("(//*[text()='Find a Location'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(findLocation_hoverOver).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@title='Hospitals'])[1]")));
		driver.findElement(By.xpath("(//*[@title='Hospitals'])[1]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		String Parentwindow = driver.getWindowHandle();
		System.out.println("Parent Window: "+driver.getTitle());
		for(String win : windows) {
			if(!Parentwindow.equals(windows)) {
				driver.switchTo().window(win);
				System.out.println("child window: "+driver.getTitle());
			}
		}
		
		driver.findElement(By.xpath("//*[text()='HMH Well/MyChart']")).click();
		driver.findElement(By.xpath("//*[text()='Privacy Policy']")).click();
		
		Set<String> windows_pp = driver.getWindowHandles();
		String Parentwindow_pp = driver.getWindowHandle();
		System.out.println("Parent Window: "+driver.getTitle());
		for(String win : windows_pp) {
			if(!Parentwindow.equals(windows_pp)) {
				driver.switchTo().window(win);
				System.out.println("child window: "+driver.getTitle());
			}
		}
		driver.manage().window().maximize();
			
	
	}
	public static void tc002() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hackensackmeridianhealth.org/en/");
		
		String actual = "New Jersey's Top-Ranked Hospital Network | Hackensack Meridian Health";
		try {
			Assert.assertEquals(actual,driver.getTitle());
			System.out.println(true);
		}
		catch(AssertionError e) {
			System.out.println("Assertion Failed: "+e.getMessage());
		}
		driver.quit();
	}
	
	public static void tc003() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hackensackmeridianhealth.org/en/");
		
	}
	
	
}
