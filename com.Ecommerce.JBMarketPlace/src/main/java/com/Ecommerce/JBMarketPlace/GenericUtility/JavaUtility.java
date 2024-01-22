package com.Ecommerce.JBMarketPlace.GenericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class JavaUtility {
	public void robot(int n1,int n2) throws Throwable {
		Robot r=new Robot();
		for(int i=0;i<=n1;i++) {
			r.keyPress(n2);
			r.keyRelease(n2);
		}
	}

}
