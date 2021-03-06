package com.puma.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage

{
	public WebDriver driver;
	//verify the title
	public void verifyTitle(WebDriver driver,String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title is matching.");
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching:Actual title is "+driver.getTitle());
		}
	}
	

}
