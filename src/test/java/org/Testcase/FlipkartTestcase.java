package org.Testcase;

import java.net.MalformedURLException;

import org.Flipkart.base.BaseConfigurationFlipkart;
import org.PageObject.Flipkart.Filtering_Brand;
import org.PageObject.Flipkart.Mobile_Phone;
import org.PageObject.Flipkart.Phone_Brand;
import org.PageObject.Flipkart.Remove;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipkartTestcase extends BaseConfigurationFlipkart {
	public Phone_Brand branbobj;
	public Mobile_Phone mobileobj;
	public Filtering_Brand fillterobj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		mobileobj = new Mobile_Phone(driver);
		branbobj= new  Phone_Brand(driver);
		fillterobj = new Filtering_Brand(driver);
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		mobileobj.MobileNavigation();
		branbobj.clickBrand();
		fillterobj.cancelBrand();
		
	}



}
