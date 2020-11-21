package com.ecom.amazon.tests.amazon_tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AmazonSiteTest {

	@Before
	public void startBrowser() {
		App.initWebDriver();
	}

	@Test
	public void verifySourceOfTheApp() {
		WebDriver driver = RunEnvironment.getWebDriver();
		final String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);		
		assertEquals(siteUrl, driver.getCurrentUrl());
	}
	
	@After
	public void closeBrowser() {
		App.shutDownDriver();
	}
}
