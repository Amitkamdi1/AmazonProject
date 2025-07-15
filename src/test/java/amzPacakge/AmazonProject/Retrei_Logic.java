package amzPacakge.AmazonProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrei_Logic implements IRetryAnalyzer

{
	int intialcount = 0;
	int Retrycount = 2;
	@Override
	public boolean retry(ITestResult result) {
		
 		if(intialcount<Retrycount) {
			
			intialcount++;
			return true;
		}
		
		return false;
	}

}
