package org.BlueNile.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_BlueNile_UndoFromCart_Page {

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
	
	@FindBy (xpath = "//button[@class='shoppingCart__sc-jt3801-0 jgWqkU']")
	private WebElement UndoFromCart;
	
	@FindBy (xpath = "//p[text() = 'Your Shopping Cart is Empty']")
	private WebElement printEmptyCart;

	@FindBy (xpath = "//a[@data-qa='title-item_0-product-0']")
	private WebElement displayProductPresentInCart;
	
	public Org_BlueNile_UndoFromCart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
//GETTERS
	
	public WebElement getDisplayProductPresentInCart() {
		return displayProductPresentInCart;
	}


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

	public WebElement getUndoFromCart() {
		return UndoFromCart;
	}
	
	public WebElement getPrintEmptyCart() {
		return printEmptyCart;
	}


	
}
