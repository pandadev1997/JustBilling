package com.Ecommerce.JBMarketPlace.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class consist help us to login to orange hrm app
 * @author debas
 *
 */
public class LoginPage {
	@FindBy(name = "username")
	private WebElement usernameEdt;
	@FindBy(name = "password")
	private WebElement passwordEdt;
	@FindBy(css = "[class*='oxd-b']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	/**
	 * By using this method we can log in to the orange HRM app
	 * @param UN
	 * @param PW
	 */
	public void loginToOrangeHrm(String UN,String PW) {
		usernameEdt.sendKeys(UN);
		passwordEdt.sendKeys(PW);
		loginBtn.click();
	}

}
