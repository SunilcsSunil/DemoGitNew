package org.BlueNile.Testcases;

import java.io.IOException;

import org.BlueNile.BusinessUtility.Org_BlueNile_BaseClass;
import org.BlueNile.ObjectRepository.Org_BlueNile_RemoveFromWishList_Page;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (org.BlueNile.ListenerUtility.Org_BlueNile_ListenerImplementationClass.class)

public class CG_BN_003_RemoveFromWishList_Test extends Org_BlueNile_BaseClass {

	@Test
	public void REMOVEfromWishList() throws IOException, InterruptedException {
		
		Org_BlueNile_RemoveFromWishList_Page removeFromwishList = new Org_BlueNile_RemoveFromWishList_Page(driver);
		
		String SEARCHCONTENT = fUtil.toReadDataFromPropertiesFile(propertiesFilePath, "searchContent");
			
			WebElement search = removeFromwishList.getSearchFiled();
			webUtil.safeClick(driver, search, 10);
			
			removeFromwishList.getSearchFiled().sendKeys(SEARCHCONTENT);
			
			WebElement clickSearch = removeFromwishList.getClickSearch();
	         webUtil.safeClick(driver, clickSearch, 10);
			
			
			WebElement clickONImg = removeFromwishList.getClickOnImg();
			webUtil.safeClick(driver, clickONImg, 10);
					
			WebElement ClickOnWishList = removeFromwishList.getClickOnWishList();
			webUtil.safeClick(driver, ClickOnWishList, 10);
			
			
			WebElement GoToWishList = removeFromwishList.getGoToWishList();
			webUtil.safeClick(driver, GoToWishList, 10);
			
			Thread.sleep(5000);
		
			WebElement ClearWishList = removeFromwishList.getClearWishList();
		    webUtil.safeClick(driver, ClearWishList, 10);
		    
		    WebElement ClearAll = removeFromwishList.getClearAll();
		    webUtil.safeClick(driver, ClearAll, 10);
				
		String expectedWishListStatus = "Your Wishlist is Empty";
		String actualWishListStatus = removeFromwishList.getWishlistEmpty().getText();
		
		Assert.assertEquals(actualWishListStatus, expectedWishListStatus, "Product not removed");
		
	}
}
			