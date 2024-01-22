package com.Ecommerce.JBMarketPlace.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Ecommerce.JBMarketPlace.ObjectRepository.AdminPage;
import com.Ecommerce.JBMarketPlace.ObjectRepository.LoginPage;

public class Baseclass {
	public JavaUtility jutil=new JavaUtility();
	public ExcelFileUtiliity eutil = new ExcelFileUtiliity();
	public propertyfileUtility putil = new propertyfileUtility();
	public WebDriverUtility wutil=new WebDriverUtility();
	public WebDriver driver;

	@BeforeSuite
	public void DB_Conn() {
		System.out.println("data base connection");
	}

	@BeforeClass
	public void LaunchBorwser() throws Throwable {
		String Browser = putil.getDataFromPropertyFile("browser");
		String URL = putil.getDataFromPropertyFile("url");
		if (Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid browser");
		}
		wutil.maximize(driver);
		wutil.wait1(driver);
		driver.get(URL);

	}
	
	@BeforeMethod
	public void login() throws Throwable {
		String UN = eutil.getDataFromExcelSheet("Sheet1", 0, 0);
		String PW = eutil.getDataFromExcelSheet("Sheet1", 1, 0);
		LoginPage lp=new LoginPage(driver);
		lp.loginToOrangeHrm(UN, PW);	
	}
	@AfterMethod
	public void logoutFromApp() {
		AdminPage ap=new AdminPage(driver);
		ap.logoutFromApp();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@AfterSuite
	public void Db_conn_close() {
		System.out.println("database connection close");
	}
}
