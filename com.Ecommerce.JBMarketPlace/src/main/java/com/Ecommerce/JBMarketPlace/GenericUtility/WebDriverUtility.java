package com.Ecommerce.JBMarketPlace.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
	/**
	 * This method help us to maximize the browser window
	 * 
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void wait1(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IpathConstatnt.implicitwaitDuration));
	}

}
