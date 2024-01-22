package com.Ecommerce.JBMarketPlace.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * This class consist of generic method to get data from property file
 * @author debas
 *
 */
public class propertyfileUtility {
	/**
	 * By using method we can get data from property file
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(IpathConstatnt.propertyfilepath);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	
	}
	

}
