package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrater {
	
	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		
	String Reportpath=System.getProperty("user.dir")+"\\TestReport\\index.html";
	
	ExtentSparkReporter reporter=new ExtentSparkReporter(Reportpath);
	
	reporter.config().setDocumentTitle("Automation Project Batch 25");
	reporter.config().setReportName("Project Automation 25");
	reporter.config().setTheme(Theme.DARK);
	
	extent =new ExtentReports();
	extent.attachReporter(reporter);
	
	extent.setSystemInfo("Project Name ", "ABC Project");
	extent.setSystemInfo("Automation tool", "Selenium WebDriver");
	extent.setSystemInfo("O.S.Name", "Window 10");
	extent.setSystemInfo("QA Team Name", "Automation warrier team");
	return extent;
	
	
	}

}
