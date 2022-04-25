package AppBaseClass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import App_Views.InitialViews;
import Config.BrowserDriver;
import POM_App_Utilities.AppScreens;
import POM_App_Utilities.Property_Loader;

public class BaseClass  {
	
	static String datename = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
	
	public static WebDriver driver;
	
	public static ExtentHtmlReporter htmlReporter;
	//public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static AppScreens capture;
	
	public static Property_Loader reader;
	

	@BeforeSuite
	public void setup()  {
		
		capture = new AppScreens();
		
		htmlReporter = new ExtentHtmlReporter("Reports//extent-report.html");
		extent = new ExtentReports();
		//htmlReporter = new ExtentSparkReporter("Reports/index.html");
		
		extent.attachReporter(htmlReporter);
		InitialViews.init();
		try {
			reader = new Property_Loader();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@AfterMethod
	public void getResult(ITestResult result) throws IOException  {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			test.fail(MarkupHelper.createLabel(result.getName()+"  Test Case Failed", ExtentColor.RED));
			
			test.fail(result.getThrowable());
			
			String temp = AppScreens.getScreenshot(BrowserDriver.getCurrentDriver());
			test.fail(result.getName(),MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			
			
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			
			//String temp = AppScreens.getScreenshot(BrowserDriver.getCurrentDriver());
			//test.pass(result.getName(),MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			
			test.pass(MarkupHelper.createLabel(result.getName()+"  Test Case Passed", ExtentColor.GREEN));
			test.pass("finished");
			
			
		} else
		{
			test.skip(MarkupHelper.createLabel(result.getName()+"  Test Case Skipped", ExtentColor.YELLOW));
			test.fail(result.getThrowable());
		}
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
	
	
	
	
	
	

}
