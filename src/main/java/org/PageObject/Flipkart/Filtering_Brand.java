package org.PageObject.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filtering_Brand {
	WebDriver driver;

	  public Filtering_Brand(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	   @FindBy(xpath="(//div[text()='APPLE'])[1]")
	   public WebElement cancelApple;

	   @FindBy(xpath="(//div[text()='realme'])[1]")
	   public WebElement cancelRealme;

	   @FindBy(xpath="(//div[text()='SAMSUNG'])[1]")
	   public WebElement cancelSamsung;

	   public void cancelBrand() throws InterruptedException
	  {
		   cancelApple.click();
		   Thread.sleep(3000);
		   cancelRealme.click();
		   Thread.sleep(3000);
		   cancelSamsung.click();
	   }


}
