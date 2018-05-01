package com.puma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.puma.generic.BasePage;
import com.puma.generic.BaseTest;
import com.puma.generic.GenericUtils;

public class HomePage extends BasePage
{
	
	@FindBy(xpath="//a[contains(.,' MEN ')]")
	private WebElement menTab;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		
	}
	//Traversing to element

	public void navigateTo(WebDriver driver,String menuTye, String subCat, String options) throws Exception{
		Actions a= new Actions(driver);
		String xp= "//a[.='"+subCat+"' and contains(@href,'"+menuTye+"')]/../../following-sibling::li/a[text()='"+options+"']";
		
		
		a.moveToElement(driver.findElement(By.linkText(menuTye.toUpperCase()))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(xp)).click();
	}
	
	public void clickOnMen(WebDriver driver)
	{
		GenericUtils.mouseOver(driver, menTab);
		
	}
	public void verifyTheTilte(WebDriver driver,String eTitle)
	{
		verifyTitle(driver, eTitle);
	}
}
