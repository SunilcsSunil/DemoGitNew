package org.BlueNile.ListenerUtility;
	
	
	import org.testng.ITestResult;

	public class Org_BlueNile_RetryAnalyserImplementationClass {
		int num = 0;
		int UpperLimit = 3;
		
		public boolean retry(ITestResult result) {
			
			if(num<UpperLimit)
			{
				num++;
				return true;
			}
			return false;
		}

		
	}


