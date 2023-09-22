package in.debasish.TestNgListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter spaarkReporter;
	
	public ExtentReports extent;
	
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		spaarkReporter =new ExtentSparkReporter("C:\\Users\\Debasish\\eclipse-workspace\\SeleniumTesting\\ListenerReport");
		
		spaarkReporter.config().setReportName("Automation test Reports with Listeners");
		spaarkReporter.config().setDocumentTitle("Automation Reports");
		spaarkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		
		extent.attachReporter(spaarkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","Pavan");
		extent.setSystemInfo("os","Windows10");
		extent.setSystemInfo("Browser name","Chrome,Firefox,Edge");
		extent.setSystemInfo("Application Version", "5.6.3");
		
	}
		
		public void onTestSuccess(ITestResult result) {
			
			test=extent.createTest(result.getName());
			test.log(Status.PASS, "Test case passed" +result.getName());
		}
		
		public void onTestFailure(ITestResult result) {
			
			test = extent.createTest(result.getName());
			test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
			test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); 
						
		}
		public void onTestSkipped(ITestResult result) {

			test = extent.createTest(result.getName());
			test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
			
		}

		
		public void onFinish(ITestContext context) {
			
			extent.flush();
		}
	}
