package org.BlueNile.Testcases;


import java.io.IOException;
import org.BlueNile.BusinessUtility.Org_BlueNile_BaseClass;
import org.BlueNile.ObjectRepository.Org_BlueNile_wrongSearch_Page;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (org.BlueNile.ListenerUtility.Org_BlueNile_ListenerImplementationClass.class)

public class CG_BN_006_wrongSearch_Test extends Org_BlueNile_BaseClass {
	
@Test
	
     public void checkoutfail() throws IOException {
		
	Org_BlueNile_wrongSearch_Page fail = new Org_BlueNile_wrongSearch_Page(driver);
	
	String SPECIALSEARCHCONTENT = fUtil.toReadDataFromPropertiesFile(propertiesFilePath, "specialsearchcontent");
    
	fail.getSearchFiled().click();
    
	fail.getSearchFiled().sendKeys(SPECIALSEARCHCONTENT);
    
	String expectedResult = "No Results Found";
	
	String actualResult = fail.getResult().getText();
    
	Assert.assertEquals(actualResult, expectedResult, "Results found");
    
    
  
}
	
}
						