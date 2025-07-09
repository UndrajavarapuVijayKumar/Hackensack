package com.hacksack.testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hsmh_testcases extends SetupNteardown{
  @Test (priority=0)
  public void VerifyPageLoads() {	
	  if (driver.getPageSource().length() > 0) {
		    System.out.println("Page loaded successfully");
		} else {
		    System.out.println("Page did not load properly");
		}
	 
  }
  @Test(priority=1)
  public void verifyPageTitle() {
	  String expectedTitle = "New Jersey's Top-Ranked Hospital Network | Hackensack Meridian Health";
	  String actualTitle = driver.getTitle();

	  if (expectedTitle.equals(actualTitle)) {
	      System.out.println("Title matched: true");
	  } else {
	      System.out.println("Title mismatch. Actual title: " + actualTitle);
	  }
	
  }
	/*
	 * // @Test(priority=2) public void verifyFindDoctor() { WebElement findDoctor =
	 * driver.findElement(By.linkText("Find a Doctor"));
	 * 
	 * if (findDoctor.isDisplayed()) {
	 * System.out.println("Find a Doctor link is visible."); } else {
	 * System.out.println("Find a Doctor link not visible."); } findDoctor.click();
	 * 
	 * // Check if navigated to doctor search page String currentUrl =
	 * driver.getCurrentUrl(); System.out.println("Navigated to URL: " +
	 * currentUrl);
	 * 
	 * } // @Test(priority=3) public void HoverClickHospitals() throws
	 * InterruptedException { Actions actions = new Actions(driver);
	 * 
	 * // Find the “Find a Location” element WebElement findLocation =
	 * driver.findElement(By.xpath("//span[contains(text(),'Find a Location')]"));
	 * 
	 * // Hover over “Find a Location”
	 * actions.moveToElement(findLocation).perform();
	 * 
	 * // Wait for dropdown to appear Thread.sleep(2000); // ideally use
	 * WebDriverWait instead
	 * 
	 * // Click on Hospitals link under the dropdown WebElement hospitalsLink =
	 * driver.findElement(By.linkText("Hospitals")); hospitalsLink.click();
	 * 
	 * System.out.println("Navigated to Hospitals page. URL: " +
	 * driver.getCurrentUrl()); } public void SearchWithValidInput() throws
	 * InterruptedException { WebElement searchBox =
	 * driver.findElement(By.id("keyword-search")); // adjust locator
	 * searchBox.sendKeys("Cardiology");
	 * 
	 * WebElement searchButton =
	 * driver.findElement(By.xpath("//button[contains(text(),'Search Doctors')]"));
	 * searchButton.click();
	 * 
	 * // Wait or validate results loaded Thread.sleep(3000);
	 * System.out.println("Search executed.");
	 * 
	 * }
	 */
  
}
