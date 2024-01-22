package com.Ecommerce.JBMarketPlace.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	@FindBy(css = "[src*='/web/in']")
	private WebElement logoutdropdown;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutBtn;
	@FindBy(xpath = "//label[.='User Role']/parent::div/following-sibling::div//i")
	private WebElement dropdownBtn;
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void dropdownclick() {
		dropdownBtn.click();
	}
	public void logoutFromApp() {
		logoutdropdown.click();
		logoutBtn.click();
	}

}
