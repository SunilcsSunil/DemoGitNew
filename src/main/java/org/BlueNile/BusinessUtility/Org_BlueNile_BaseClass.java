package org.BlueNile.BusinessUtility;

import org.BlueNile.GenericUtility.Org_BlueNile_FileUtility;
import org.BlueNile.GenericUtility.Org_BlueNile_JavaUtility;
import org.BlueNile.GenericUtility.Org_BlueNile_WebDriverUtility;
import org.BlueNile.ObjectRepository.Bluenile_Login_Logout_Page;
import org.BlueNile.ObjectRepository.Org_BlueNile_GemstoneFiltersAndPriceRange_Page;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

		
	public class Org_BlueNile_BaseClass {
		
	public WebDriver driver=null;
	public static WebDriver sdriver;
	public 	Org_BlueNile_GemstoneFiltersAndPriceRange_Page gemstone;
		
		public Org_BlueNile_FileUtility fUtil = new Org_BlueNile_FileUtility();
		
		public Org_BlueNile_WebDriverUtility webUtil = new Org_BlueNile_WebDriverUtility();
		
		public Org_BlueNile_JavaUtility jUtil= new Org_BlueNile_JavaUtility();
		
		String randomata =  jUtil.toGetRamdomData();
		
		public String propertiesFilePath = "C:\\Users\\harshith\\Project_Blue Nile\\BlueNile\\src\\test\\resources\\CommonData.properties";
	    
		public Bluenile_Login_Logout_Page loginLogout;
		
		
		
		@BeforeSuite
		
		public void beforeSuite() {
	        Reporter.log("Database Connection Done",true);
		}
		
		@BeforeTest
		
		public void beforeTest() {
			Reporter.log("Pre_conditions executed",true);
		}
		
		@BeforeClass
		
		public void beforeClass() {
	        
			driver = new ChromeDriver();
			
		    webUtil.toMaximize(driver);
		    
		    webUtil.implicitlyWait(driver, 3);
		    
		    Reporter.log("Browser launched",true);
		    
		    sdriver = driver;
		    gemstone = new Org_BlueNile_GemstoneFiltersAndPriceRange_Page(driver);
		    loginLogout = new Bluenile_Login_Logout_Page(driver);

		   
		}
		
		@BeforeMethod
		
		public void beforeMethod() throws Throwable {
			
			loginLogout = new Bluenile_Login_Logout_Page(driver);
			
			 String URL = fUtil.toReadDataFromPropertiesFile(propertiesFilePath,"url");
			 
		     String EMAILADDRESS = fUtil.toReadDataFromPropertiesFile(propertiesFilePath,"emailaddress");
		     
		     String PASSWORD = fUtil.toReadDataFromPropertiesFile(propertiesFilePath, "password");
		    	     
		     driver.get(URL);
		     Thread.sleep(500);
		     
		     loginLogout.getCookie().click();
		     
		     loginLogout.getClickOnLogin().click();
		     
		     loginLogout.getYourEmailAddress().sendKeys(EMAILADDRESS);;
		     
		     loginLogout.getYourPassword().sendKeys(PASSWORD);
		     
		     loginLogout.getSubmit().click();
		     
			    
		     Reporter.log("Application login Done",true);
		}
		
		
		
		@AfterMethod
		
		public void afterMethod() throws InterruptedException {

			
			webUtil.toMoveToElement(driver, loginLogout.getLogoutIcon());
			
			loginLogout.getLogoutButton().click();
			
			Reporter.log("Application logout Done",true);
		}
		    
	    @AfterClass
		
		public void afterClass() {
			
			driver.quit();
			Reporter.log("Browser closed",true);
		}
	    
	    @AfterTest
		
		public void afterTest() {
			Reporter.log("Post_conditions executed",true);
		}
		
	    @AfterSuite
		
		public void afterSuite() {
			Reporter.log("Database Connection terminated",true);
		}
	}



