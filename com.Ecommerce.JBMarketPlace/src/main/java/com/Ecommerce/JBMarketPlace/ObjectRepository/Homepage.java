package com.Ecommerce.JBMarketPlace.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath = "//span[.='Admin']")
	private WebElement adminBtn;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickonAdmin() {
		adminBtn.click();
	}

}
