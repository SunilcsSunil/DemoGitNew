package org.BlueNile.Testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.BlueNile.BusinessUtility.Org_BlueNile_BaseClass;
import org.openqa.selenium.WebElement;


@Listeners (org.BlueNile.ListenerUtility.Org_BlueNile_ListenerImplementationClass.class)

public class CG_BN_004_GemstoneFiltersAndPriceRange_Test extends Org_BlueNile_BaseClass{

	@Test
	public void GemstoneFiltersAndPriceRange() {

				
		   
		    WebElement gemClick = gemstone.getClickOnGemStones();
		    webUtil.safeClick(driver, gemClick, 10);
		    
		    webUtil.toMoveByOffSet(driver, 161, 530);
		    
		   WebElement blueSapphire = gemstone.getClickOnBlueSapphire();
		    webUtil.safeClick(driver, blueSapphire, 10);
		    
		   WebElement emerald = gemstone.getClickOnEmerald();
		    webUtil.safeClick(driver, emerald, 10);
		    
		    WebElement first = gemstone.getFirstButton();
		    webUtil.toClickAndHoldOnElement(driver, first);
		    webUtil.waitForElementVisible(driver, first, 10);
		    webUtil.toDragAndDropByElement(driver, first,70, 0);
				
		   WebElement second = gemstone.getSecondButton();
			webUtil.toClickAndHoldOnElement(driver, second);
			webUtil.waitForElementVisible(driver, second, 10);
			webUtil.toDragAndDropByElement(driver, second, 15, 0);
				
			String expectedTotal = "24 of Results";
			String actualTotal = gemstone.getFetchResult().getText();
			Assert.assertEquals(actualTotal, expectedTotal, "Not matching expected result");
	}
}