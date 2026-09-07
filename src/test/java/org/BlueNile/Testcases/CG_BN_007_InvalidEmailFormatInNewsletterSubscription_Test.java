package org.BlueNile.Testcases;
import java.io.IOException;

import org.BlueNile.BusinessUtility.Org_BlueNile_BaseClass;
import org.BlueNile.ObjectRepository.Org_BlueNile_List;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (org.BlueNile.ListenerUtility.Org_BlueNile_ListenerImplementationClass.class)

public class CG_BN_007_InvalidEmailFormatInNewsletterSubscription_Test extends Org_BlueNile_BaseClass {
@Test
	 private void BlueNile_List() throws IOException {
		
	Org_BlueNile_List list = new Org_BlueNile_List(driver);
	
	String SEARCHCONTENT = fUtil.toReadDataFromPropertiesFile(propertiesFilePath, "searchContent");
	
	String VALUE = fUtil.toReadDataFromPropertiesFile(propertiesFilePath, "value");
			
	list.getSearchFiled().click();
    
    list.getSearchFiled().sendKeys(SEARCHCONTENT);	
    
    list.getClickSearch().click();
    
	list.getFooter().sendKeys(VALUE);
	
	list.getJoin().click();
	
	String expectedValue = "Please include an '@' in the email address. '123456789' is missing an '@'.";
	
    String actualValue = list.getFooter().getDomAttribute("validationMessage");
	
    Assert.assertEquals(actualValue, expectedValue, "Text did NOT match!");
	
}
}