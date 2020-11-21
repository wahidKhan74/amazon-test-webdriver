package com.ecom.amazon.tests.amazon_tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonInputResourcesTest {

	@Before
	public void startBrowser() {
		App.initWebDriver();
	}

	@Test
	public void verifySourceOfTheApp() {
		WebDriver driver = RunEnvironment.getWebDriver();
		final String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		
		// find elements -> find all input elements
		
		List<WebElement> allInputs = driver.findElements(By.tagName("input"));
		for (WebElement oneInput : allInputs) {
			System.out.println(oneInput.getAttribute("value"));
		}
//		assertEquals(siteUrl, driver.getCurrentUrl());
	}
	
	@After
	public void closeBrowser() {
		App.shutDownDriver();
	}
}
