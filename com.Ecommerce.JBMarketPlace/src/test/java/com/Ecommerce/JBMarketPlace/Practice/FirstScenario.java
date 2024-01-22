package com.Ecommerce.JBMarketPlace.Practice;

import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import com.Ecommerce.JBMarketPlace.GenericUtility.Baseclass;
import com.Ecommerce.JBMarketPlace.ObjectRepository.AdminPage;
import com.Ecommerce.JBMarketPlace.ObjectRepository.Homepage;

public class FirstScenario extends Baseclass {
	@Test
	public void verifyUserSelectDropdownOptionorNot() throws Throwable {
		Homepage hp=new Homepage(driver);
		hp.clickonAdmin();
		AdminPage ap=new AdminPage(driver);
		ap.dropdownclick();
		jutil.robot(0,KeyEvent.VK_DOWN);
		jutil.robot(0, KeyEvent.VK_ENTER);
	}

}
