package org.BlueNile.Testcases;


	import java.io.IOException;
    import org.BlueNile.BusinessUtility.Org_BlueNile_BaseClass;
    import org.BlueNile.ObjectRepository.Org_BlueNile_AddToCart_Page;
    	import org.testng.Assert;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Listeners;
    import org.testng.annotations.Test;

	@Listeners (org.BlueNile.ListenerUtility.Org_BlueNile_ListenerImplementationClass.class)
    
	public class CG_BN_001_AddToCart_Test extends Org_BlueNile_BaseClass {
	
		@Test
	     public void addToCart() throws IOException, InterruptedException {
			
           Org_BlueNile_AddToCart_Page addToCart = new Org_BlueNile_AddToCart_Page(driver);
			
           String SEARCHCONTENT = fUtil.toReadDataFromPropertiesFile(propertiesFilePath, "searchContent");
           
           
           addToCart.getSearchFiled().click();
           
           addToCart.getSearchFiled().sendKeys(SEARCHCONTENT);
           
           addToCart.getClickSearch().click();
           
           addToCart.getClickOnImg().click();
           
           WebElement addToCartClick = addToCart.getAddToCart();
           webUtil.scrollToAndClick(driver,addToCartClick );
           
           Thread.sleep(500);
                 
           String expected = "Shopping Cart";
           
           String actual = addToCart.getDisplayShoppingCart().getText();
                    
           Assert.assertEquals(actual, expected, "Text did NOT match!");
           
           addToCart.getRemoveFromCart().click();
	}
}
