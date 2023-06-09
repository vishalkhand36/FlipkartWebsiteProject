package org.PageObject.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Phone_Brand {
	WebDriver driver;

  public Phone_Brand(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

   @FindBy(xpath="//div[text()='SAMSUNG']")
   public WebElement samsung;

   @FindBy(xpath="//div[text()='APPLE']")
   public WebElement apple;

   @FindBy(xpath="//div[text()='realme']")
   public WebElement realme;
   
   // Remove added brands
   @FindBy(xpath="//button[text()='✕']")
   public WebElement cancel;

   public void clickBrand() throws InterruptedException
  {
	samsung.click();
	Thread.sleep(3000);
	
	apple.click();
	Thread.sleep(3000);
	
	realme.click();
	Thread.sleep(3000);
	
	cancel.click();
   }


}
