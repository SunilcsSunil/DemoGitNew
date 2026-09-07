package org.BlueNile.Testcases;

import java.io.IOException;
import org.BlueNile.BusinessUtility.Org_BlueNile_BaseClass;
import org.BlueNile.ObjectRepository.Org_BlueNile_AddToWishList_Page;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (org.BlueNile.ListenerUtility.Org_BlueNile_ListenerImplementationClass.class)



public class CG_BN_002_AddToWishList_Test extends Org_BlueNile_BaseClass {
@Test
	public void ADDToWishList() throws IOException, InterruptedException {
		
	Org_BlueNile_AddToWishList_Page addToWishList = new Org_BlueNile_AddToWishList_Page(driver);
	
	String SEARCHCONTENT = fUtil.toReadDataFromPropertiesFile(propertiesFilePath, "searchContent");
		
		WebElement search = addToWishList.getSearchFiled();
		webUtil.safeClick(driver, search, 5);
		
		addToWishList.getSearchFiled().sendKeys(SEARCHCONTENT);
		
		WebElement clickSearch = addToWishList.getClickSearch();
         webUtil.safeClick(driver, clickSearch, 5);
		
		
		WebElement clickONImg = addToWishList.getClickOnImg();
		webUtil.safeClick(driver, clickONImg, 5);
		
		//webUtil.toRefresh(driver);
		
		//addToWishList.getClickOnWishList().clear();
				
		WebElement ClickOnWishList = addToWishList.getClickOnWishList();
		webUtil.safeClick(driver, ClickOnWishList, 5);
		
		Thread.sleep(2000);
		
		WebElement GoToWishList = addToWishList.getGoToWishList();
		webUtil.safeClick(driver, GoToWishList, 5);
		
		Thread.sleep(2000);
			
		String expectedProductName = "Mini Half Tennis Bracelet With 2 CTW Marquise Cut Lab-Grown Diamonds In 14K Yellow Gold";
	
		String actualProductName = addToWishList.getImageNamePresentInWishList().getText();
		
		
		Assert.assertEquals(actualProductName, expectedProductName, "WishList is empty");
		
}
}
			