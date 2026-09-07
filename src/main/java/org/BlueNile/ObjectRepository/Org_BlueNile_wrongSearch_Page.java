package org.BlueNile.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_BlueNile_wrongSearch_Page {

//DECLARATION
	
	@FindBy (xpath = "//input[@type='search']")
	private WebElement searchFiled;
	
	@FindBy (xpath = "//div[@class='title--ZqXASNpjDyBIC1sOMLlQ']")
	private WebElement result;
	
//INITIALISATION
	
	

	public Org_BlueNile_wrongSearch_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


//GETTERS
	
	public WebElement getResult() {
		return result;
	}


	public WebElement getSearchFiled() {
		return searchFiled;
	}

	

}
