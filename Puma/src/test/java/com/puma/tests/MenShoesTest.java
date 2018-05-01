package com.puma.tests;

import org.testng.annotations.Test;

import com.puma.generic.BaseTest;
import com.puma.pages.AddToCartPage;
import com.puma.pages.HomePage;
import com.puma.pages.ProductListPage;

public class MenShoesTest extends BaseTest
{
	/**
	 * 
	 * @author nikita
	 *
	 */
	@Test
	public void testMenShoerunning() throws Exception
	{
	
		HomePage hp =new HomePage(driver);
		String title = driver.getTitle();
		//System.out.println(title);
		hp.verifyTitle(driver, driver.getTitle());
		
		hp.navigateTo(driver, "men", "Shoes", "Running");
		//hp.clickOnMen(driver);
		Thread.sleep(2000);
		
		ProductListPage pl= new ProductListPage(driver);
		pl.clickOnSecondProd();
		Thread.sleep(2000);
		pl.chooseSelectbox();
		Thread.sleep(2000);
		pl.clickAddToCart();

		
		
	}

}
