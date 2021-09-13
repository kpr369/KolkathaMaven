package testing.KolkathaMaven;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplemntationClass implements ITestListener {

	public void onTestStart(ITestResult result) {
	   
		System.out.println(result.getMethod().getMethodName() + "Execution started");
	  }
}
