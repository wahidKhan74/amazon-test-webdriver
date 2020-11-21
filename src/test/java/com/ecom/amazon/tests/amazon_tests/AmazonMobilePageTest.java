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

public class AmazonMobilePageTest {
	
	@Before
	public void startBrowser() {
		App.initWebDriver();
	}

	@Test
	public void gotoMobilesPage() throws InterruptedException {
		WebDriver driver = RunEnvironment.getWebDriver();
		final String siteUrl = "https://www.amazon.in";
		driver.get(siteUrl);
		
		// step 1 . find web element
		
		WebElement mobileLink = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		
		mobileLink.click();
		
		driver.findElement(By.xpath("//*[@id=\"dealTitle\"]")).click();
		
		Thread.sleep(3000);
		
	}
	
	@After
	public void closeBrowser() {
		App.shutDownDriver();
	}
}
