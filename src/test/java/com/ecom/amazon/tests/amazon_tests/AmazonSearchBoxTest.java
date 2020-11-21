package com.ecom.amazon.tests.amazon_tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Unit test for simple App.
 */

public class AmazonSearchBoxTest {
	
	@Before
	public void startBrowser() {
		App.initWebDriver();
	}

	@Test
	public void openAmazonHomePage() throws InterruptedException {
		WebDriver driver = RunEnvironment.getWebDriver();
		final String siteUrl = "https://www.amazon.in";
		driver.get(siteUrl);
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBox.sendKeys("One Plus Nord");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).submit();
		
		Thread.sleep(2000);
		
		
	}
	
	@After
	public void closeBrowser() {
		App.shutDownDriver();
	}
}
