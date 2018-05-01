package com.puma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPage 
{
	@FindBy(xpath="//div[.='Select Size']")
	private WebElement sizeListbox;
	
	@FindBy(xpath="//button/span[.='Add to Cart']")
	private WebElement addToCartBtn;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void chooseSelectbox()
	{
		
		Select sel = new Select(sizeListbox);
		sel.selectByValue("4");
	}

	public void clickAddToCart()
	{
		
		addToCartBtn.click();
	}


}
