package org.BlueNile.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_BlueNile_GemstoneFiltersAndPriceRange_Page {


//DECLARATION
	@FindBy (xpath = "//a[@data-qa='Gemstones']")
	private WebElement clickOnGemStones;
	
	@FindBy (xpath = "//button[@title='Blue Sapphire']")
	private WebElement clickOnBlueSapphire;
	
	@FindBy (xpath = "//button[@title='Emerald']")
	private WebElement clickOnEmerald;
	
	@FindBy(xpath = "(//div[contains(@class,'rc-slider-handle')])[1]")
	private WebElement firstButton;

	@FindBy(xpath = "(//div[contains(@class,'rc-slider-handle')])[2]")
	private WebElement secondButton;

	
	@FindBy (xpath = "//div[contains(@data-qa,'gallery_resultNumber')]")
	private WebElement fetchResult;
	

//INITIALISATION
	
	public Org_BlueNile_GemstoneFiltersAndPriceRange_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	
//GETTERS
	
	public WebElement getClickOnGemStones() {
		return clickOnGemStones;
	}


	public WebElement getClickOnBlueSapphire() {
		return clickOnBlueSapphire;
	}


	public WebElement getClickOnEmerald() {
		return clickOnEmerald;
	}


	public WebElement getFirstButton() {
		return firstButton;
	}


	public WebElement getSecondButton() {
		return secondButton;
	}


	public WebElement getFetchResult() {
		return fetchResult;
	}

	
	
	
}
