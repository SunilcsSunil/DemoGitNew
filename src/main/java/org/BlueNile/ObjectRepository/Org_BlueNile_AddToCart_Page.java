package org.BlueNile.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_BlueNile_AddToCart_Page {

//DECLRATION
	
	@FindBy (xpath = "//input[@type='search']")
	private WebElement searchFiled;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement clickSearch;
	
	@FindBy (xpath = "//img[@alt='Mini Half Tennis Bracelet With 2 CTW Marquise Cut Lab-Grown Diamonds In 14K Yellow Gold']")
	private WebElement clickOnImg;
	
	@FindBy (xpath = "//div[@data-qa='add_to_cart_button']")
	private WebElement addToCart ;
	
	@FindBy (xpath = "//div[text() = 'Shopping Cart']")
	private WebElement displayShoppingCart;
	
	@FindBy (xpath = "//span[text() = 'Remove']")
	private WebElement removeFromCart;
	
	
	
//INITIALISATION
	
	public Org_BlueNile_AddToCart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


//GETTERS
	
	
	public WebElement getSearchFiled() {
		return searchFiled;
	}


	public WebElement getClickSearch() {
		return clickSearch;
	}


	public WebElement getClickOnImg() {
		return clickOnImg;
	}


	public WebElement getAddToCart() {
		return addToCart;
	}


	public WebElement getDisplayShoppingCart() {
		return displayShoppingCart;
	}
	

	public WebElement getRemoveFromCart() {
		return removeFromCart;
	}


	
}
