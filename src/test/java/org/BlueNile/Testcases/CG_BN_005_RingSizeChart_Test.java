package org.BlueNile.Testcases;
import java.io.IOException;

import org.BlueNile.BusinessUtility.Org_BlueNile_BaseClass;
import org.BlueNile.ObjectRepository.Org_BlueNile_RingSizeChart_Page;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (org.BlueNile.ListenerUtility.Org_BlueNile_ListenerImplementationClass.class)

public class CG_BN_005_RingSizeChart_Test extends Org_BlueNile_BaseClass {

	@Test
		public void ringSizeChart() throws IOException, InterruptedException {
			
		Org_BlueNile_RingSizeChart_Page ringchart = new Org_BlueNile_RingSizeChart_Page(driver);


		WebElement ring = ringchart.getClickOnRing();
		webUtil.safeClick(driver, ring, 10);
		
		//=====================CLICK TO OPEN NEW TAB===============================
		WebElement learn = ringchart.getLearnButton();
		Thread.sleep(800);
		webUtil.scrollToAndClick(driver, learn);
		
		String parentId = webUtil.switchToNewWindow(driver);
		
		WebElement chart = ringchart.getClickOnChartSize();
		webUtil.safeClick(driver, chart, 10);
		
		String expectedUrl = "https://www.bluenile.com/education/rings/find-your-ring-size";
	
		String actualUrl = webUtil.getCurrentPageUrl(driver);
	
		Assert.assertEquals(actualUrl, expectedUrl, "Not matching with expectedUrl");
		
		Thread.sleep(4000);
		webUtil.closeChildWindowAndSwitchBack(driver, parentId);
	}
}
	
