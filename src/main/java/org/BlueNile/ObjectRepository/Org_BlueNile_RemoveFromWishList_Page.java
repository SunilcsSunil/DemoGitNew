package org.BlueNile.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_BlueNile_RemoveFromWishList_Page {

	//DECLARATION
	
		@FindBy (xpath = "//input[@type='search']")
		private WebElement searchFiled;
		
		@FindBy (xpath = "//button[@type='submit']")
		private WebElement clickSearch;
		
		@FindBy (xpath = "//img[@alt='Mini Half Tennis Bracelet With 2 CTW Marquise Cut Lab-Grown Diamonds In 14K Yellow Gold']")
		private WebElement clickOnImg;
		
		@FindBy  (xpath = "//button[@title='Add to Wishlist']")
		private WebElement clickOnWishList;
		
		@FindBy (xpath = "//img[@alt='wish list']")
		private WebElement goToWishList;
		
		@FindBy (xpath = "//button[text() = 'Clear Wishlist']")
		private WebElement clearWishList;
		
		@FindBy (xpath = "//button[text() = 'CLEAR ALL']")
		private WebElement clearAll;
		
		@FindBy (xpath = "//p[text() = 'Your Wishlist is Empty']")
		private WebElement wishlistEmpty;
		
	
		
//INITIALISATION
		
	public	Org_BlueNile_RemoveFromWishList_Page(WebDriver driver)
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



	public WebElement getClickOnWishList() {
		return clickOnWishList;
	}



	public WebElement getGoToWishList() {
		return goToWishList;
	}



	public WebElement getClearWishList() {
		return clearWishList;
	}



	public WebElement getClearAll() {
		return clearAll;
	}



	public WebElement getWishlistEmpty() {
		return wishlistEmpty;
	}
		
}
