package org.PageObject.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Remove {
WebDriver driver;
	
	public Remove(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='✕']")
	public WebElement cancel;
	
	public void CancelAction()
	{
		cancel.click();
		
	}

}
