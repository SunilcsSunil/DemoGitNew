package org.BlueNile.Testcases;
 
	import java.io.IOException;
    import org.BlueNile.BusinessUtility.Org_BlueNile_BaseClass;
    import org.BlueNile.ObjectRepository.Org_BlueNile_UndoFromCart_Page;
	import org.testng.Assert;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Listeners;
    import org.testng.annotations.Test;

	@Listeners (org.BlueNile.ListenerUtility.Org_BlueNile_ListenerImplementationClass.class)
    
	public class CG_BN_008_UndoFromCart_Test extends Org_BlueNile_BaseClass {
	
		@Test
	     public void addToCart() throws IOException, InterruptedException {
			
			Org_BlueNile_UndoFromCart_Page undo = new Org_BlueNile_UndoFromCart_Page(driver);
			
           String SEARCHCONTENT = fUtil.toReadDataFromPropertiesFile(propertiesFilePath, "searchContent");
           
           
           undo.getSearchFiled().click();
           
           undo.getSearchFiled().sendKeys(SEARCHCONTENT);
           
           undo.getClickSearch().click();
           
           undo.getClickOnImg().click();
           
           WebElement addToCartClick = undo.getAddToCart();
           webUtil.scrollToAndClick(driver,addToCartClick );
           
           Thread.sleep(500);
                 
           String expected = "Shopping Cart";
           
           String actual = undo.getDisplayShoppingCart().getText();
                    
           Assert.assertEquals(actual, expected, "Text did NOT match!");
           
           undo.getRemoveFromCart().click();
           
           undo.getUndoFromCart().click();
           
           Thread.sleep(3000);
           
           String expectedString = "Mini Half Tennis Bracelet With 2 CTW Marquise Cut Lab-Grown Diamonds In 14K Yellow Gold";
           
           String actualString = undo.getDisplayProductPresentInCart().getText();
                      
           Assert.assertEquals(actualString, expectedString, "Text did NOT match!");
           
           undo.getRemoveFromCart().click();
	}
}


