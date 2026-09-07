package org.BlueNile.ListenerUtility;
	import java.io.File;
	import java.io.IOException;
	import java.time.LocalDateTime;
    import org.BlueNile.BusinessUtility.Org_BlueNile_BaseClass;
    import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	import org.openqa.selenium.io.FileHandler;
	import org.testng.ISuite;
	import org.testng.ISuiteListener;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;
	
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	
	public class Org_BlueNile_ListenerImplementationClass extends Org_BlueNile_BaseClass implements ITestListener, ISuiteListener {
	  
		  ExtentTest test;
		  ExtentReports extentReport;
		  String time = LocalDateTime.now().toString().replace(":","_");
		@Override
		public void onStart(ISuite suite) {
			
			//Step 1: Create object for ExtentSparkReporter
	        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\harshith\\Project_Blue Nile\\BlueNile\\report\\report"+time+".html");
	        
	        spark.config().setDocumentTitle("Blue Nile");
	        spark.config().setTheme(Theme.DARK);
	        spark.config().setReportName("CG");
	        
	       //Step 2:  Create object for Extent Report
	       extentReport = new ExtentReports();
	        
	       //Step 3: Attach spark reference to extentReport reference
	        extentReport.attachReporter(spark);
	       
	       //Step 4: Create object for ExtentTest using create()
	        test = extentReport.createTest("report");
	        
	       		
		}

		@Override
		public void onFinish(ISuite suite) {
			
			//Step 6: call flush() to write data into the report
	        extentReport.flush();
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			test.log(Status.PASS, "Testcase Pass");
			Reporter.log(">>>>>>>Test execution Successful<<<<<<<<",true);
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String ScreenshotPath = "C:\\Users\\harshith\\Project_Blue Nile\\BlueNile\\screenshot\\img"+time+".png";
			TakesScreenshot ts = (TakesScreenshot)Org_BlueNile_BaseClass.sdriver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(ScreenshotPath);
			try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test.log(Status.FAIL, "Testcase Fail");
			
			Reporter.log(">>>>>>>Test execution Failure<<<<<<<<",true);
			
			test.addScreenCaptureFromPath(ScreenshotPath);
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			test.log(Status.SKIP, "Testcase Skip");
			Reporter.log(">>>>>>>Test execution skipped<<<<<<<<",true);
		}
		
	   
		
	}


