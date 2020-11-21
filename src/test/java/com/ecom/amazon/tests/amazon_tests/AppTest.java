package com.ecom.amazon.tests.amazon_tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */

public class AppTest {
	
	@Before
	public void startBrowser() {
		App.initWebDriver();
	}

	@Test
	public void openAmazonHomePage() {
		WebDriver driver = RunEnvironment.getWebDriver();
		final String siteUrl = "https://www.amazon.in";
		driver.get(siteUrl);
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		assertEquals(expectedTitle, driver.getTitle());
	}
	
	@After
	public void closeBrowser() {
		App.shutDownDriver();
	}
}
