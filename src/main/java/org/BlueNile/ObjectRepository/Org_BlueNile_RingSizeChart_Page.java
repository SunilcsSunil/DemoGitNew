package org.BlueNile.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_BlueNile_RingSizeChart_Page {

//DECLARATION
	
	@FindBy (xpath = "//a[@data-qa='Rings']")
	private WebElement clickOnRing;
	
	@FindBy (xpath = "//a[@class='white-to-blue-button']")
	private WebElement learnButton;
	
	@FindBy (xpath = "//a[contains(text(),'PRINT RING SIZE CHART')]")
	private WebElement clickOnChartSize;
	
	
//INITIALISATION
	
	
	public Org_BlueNile_RingSizeChart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


		
//GETTERS
	
	
	
	public WebElement getClickOnRing() {
		return clickOnRing;
	}


	public WebElement getLearnButton() {
		return learnButton;
	}


	public WebElement getClickOnChartSize() {
		return clickOnChartSize;
	}
}
	
