package org.BlueNile.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_BlueNile_AddToWishList_Page {

//DECLARATION
	
	@FindBy (xpath = "//input[@type='search']")
	private WebElement searchFiled;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement clickSearch;
	
	@FindBy (xpath = "//img[@alt='Mini Half Tennis Bracelet With 2 CTW Marquise Cut Lab-Grown Diamonds In 14K Yellow Gold']")
	private WebElement clickOnImg;
	
	@FindBy  (xpath = "//button[@data-qa='wishList_button_itemPage']")
	private WebElement clickOnWishList;
	
	@FindBy (xpath = "//button[@data-qa='close_button-modal']")
	private WebElement x;
	
	public WebElement getX() {
		return x;
	}


	@FindBy (xpath = "//a[@aria-label='Open wishlist']")
	private WebElement goToWishList;
	
	@FindBy  (xpath = "//div[@class='shoppingCart__sc-7k2tzs-1 ghZSvI']/../../..")
	private WebElement imageNamePresentInWishList;
	
	
	
//INITIALISATION
	
	public Org_BlueNile_AddToWishList_Page(WebDriver driver)
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


	public WebElement getImageNamePresentInWishList() {
		return imageNamePresentInWishList;
	}
	
	
	
	
}
