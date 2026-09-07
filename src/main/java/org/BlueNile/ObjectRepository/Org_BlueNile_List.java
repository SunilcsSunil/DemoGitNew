package org.BlueNile.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_BlueNile_List {

	@FindBy (xpath = "//input[@type='search']")
	private WebElement searchFiled;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement clickSearch;
	
	@FindBy (xpath = "//input[@placeholder='Email Address']")
	private WebElement footer;
	
	@FindBy (xpath = "//button[text() = 'JOIN']")
	private WebElement join;
	
	
	public Org_BlueNile_List(WebDriver driver)
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


	
	public WebElement getFooter() {
		return footer;
	}


	public WebElement getJoin() {
		return join;
	}


}
