package com.puma.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.puma.generic.BasePage;

public class ProductListPage extends BasePage
{
	@FindBy(xpath="//ul[@class='products-grid products-grid--max-4-col first last odd']/li[2]")
	private WebElement secondProd;
	
	@FindBy(xpath="//div[.='Select Size']")
	private WebElement sizeListbox;
	
	@FindBy(xpath="//button/span[.='Add to Cart']")
	private WebElement addToCartBtn;
	


	public ProductListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		//this.driver=driver;
		
	}
	public void clickOnSecondProd()
	{
		secondProd.click();
		
		ArrayList<String> arr= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(arr.get(0));
		verifyTitle(driver, driver.getTitle());
		
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


