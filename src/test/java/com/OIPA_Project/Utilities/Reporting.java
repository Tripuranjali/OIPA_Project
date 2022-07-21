package com.OIPA_Project.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {
	
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	
	public void onStart(ITestContext testContext) {
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "Test-Report-"+timestamp+".html";
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/TestExecutionReports/"+ repName);
		htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Project Name", "ClearView Project");
		extent.setSystemInfo("Environment", "SIT");
		extent.setSystemInfo("Tester", "Tripuranjali");
		extent.setSystemInfo("SIT-URL", "https://illustrate-sit.clearview.nonprod.manage.equisoft.com/");
		extent.setSystemInfo("Username", "SIT_ActiveAdviser1");
		extent.setSystemInfo("Password", "Royu7856");
		
		htmlreporter.config().setDocumentTitle("ClearView Project Test Automation");
		htmlreporter.config().setReportName("SIT Smoke Test Report");
		htmlreporter.config().setTheme(Theme.DARK);	
		
	}
	
	public void onTestSuccess(ITestResult tr) {
		
		logger = extent.createTest(tr.getName());
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));		
	}
	
	public void onTestFailure(ITestResult tr)  {
		
		logger = extent.createTest(tr.getName());
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		logger.log(Status.FAIL,(tr.getThrowable()));
		String screenshotpath=System.getProperty("user.dir")+ "/Screenshots/"+ tr.getName()+ ".png";
		
		File f = new File(screenshotpath);
		
		if(f.exists()) {
		try {
			
			logger.fail("Screenshot for failed testcase is below:"+ logger.addScreenCaptureFromPath(screenshotpath));
			}
		catch (IOException e)
			{
			e.printStackTrace();
			}
		}
	}
	
	public void onTestSkipped(ITestResult tr) {
		
		logger = extent.createTest(tr.getName());
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext testContext) {
		extent.flush();
	}

}

