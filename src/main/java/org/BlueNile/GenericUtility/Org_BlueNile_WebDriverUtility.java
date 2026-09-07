package org.BlueNile.GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Org_BlueNile_WebDriverUtility {

//MAXIMIZE
	
	public void toMaximize(WebDriver driver) {
		   
		 driver.manage().window().maximize();
		
	}
	
	
//IMPLICIT WAIT
	
	public void implicitlyWait(WebDriver driver , int n) {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(n));
	}
	

//EXPLICIT WAIT
	

    public void explicitlyWait(WebDriver driver, WebElement element, int n) {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(n));
        wait.until(ExpectedConditions.elementToBeClickable(element));
}


//GET CURRENT URL

    public String getCurrentPageUrl(WebDriver driver) {
      return driver.getCurrentUrl();
}	


//MOVE BY OFFSET

    public void toMoveByOffSet(WebDriver driver, int x, int y) {
      Actions a = new Actions(driver);
        a.moveByOffset(x, y).perform();
}


//MOVE TO ELEMENT


    public void toMoveToElement(WebDriver driver, WebElement element) {
      Actions a = new Actions(driver);
        a.moveToElement(element).perform();
}


//SCROLL TO AND CLICK

    public void scrollToAndClick(WebDriver driver, WebElement description) {
     JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView(true);", description);
       js.executeScript("arguments[0].click();", description);
}


//CLICK AND HOLD ON ELEMENT

    public void toClickAndHoldOnElement(WebDriver driver, WebElement element ) {
     Actions a = new Actions(driver);
      a.clickAndHold(element).perform();
}


//DRAP AND DROP BY ELEMENT

    public void toDragAndDropByElement(WebDriver driver, WebElement element, int x, int y) {
     Actions a = new Actions(driver);
      a.dragAndDropBy(element, x, y).perform();
}


//TAKES SCREENSHOT

public void toTakeScreenshot(WebDriver driver, String filepath) throws IOException {
    String timestamp = LocalDateTime.now().toString().replace(":", "_");
    TakesScreenshot ts = (TakesScreenshot)driver; 
	File temp = ts.getScreenshotAs(OutputType.FILE);
    File dest = new File("Screenshots/img_" + timestamp + ".png");
    //FileHandler.copy(temp,dest);
}



//WINDOW HANDLE

public void switchToChildWindow(WebDriver driver) {
    String mainWindow = driver.getWindowHandle();

    for (String win : driver.getWindowHandles()) {
        if (!win.equals(mainWindow)) {
            driver.switchTo().window(win);
        }
    }
}

public void safeClick(WebDriver driver, WebElement element, int sec) {
	try {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		
	} catch (Exception e) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguements[0].click()", element);
	}
}
public WebElement waitForElementVisible(WebDriver driver, WebElement element, int timeOut) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
    return wait.until(ExpectedConditions.visibilityOf(element));
}

public String switchToNewWindow(WebDriver driver) {
    String mainID = driver.getWindowHandle();
    for (String id : driver.getWindowHandles()) {
        if (!id.equals(mainID)) {
            driver.switchTo().window(id);
        
            return mainID;
        }
    }

return mainID;
}

public void closeChildWindowAndSwitchBack(WebDriver driver, String parentID) {

    for (String win : driver.getWindowHandles()) {
        if (!win.equals(parentID)) {
            driver.switchTo().window(win);
            driver.close();    // Close child window
        }
    }

    driver.switchTo().window(parentID);    // Go back to parent
}

public void toRefresh(WebDriver driver) {
	driver.navigate().refresh();

}

}

