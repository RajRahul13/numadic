package com.numadic.base;

import java.io.File;
import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	public static WebDriver driver;
	public ExtentSparkReporter sparkReporter;
	public static ExtentReports extent;
	public ExtentTest logger;
	Logger log = Logger.getLogger("setupBrowserDriver.class");

	@BeforeTest
	public void beforeTestMethod() {
		
		  sparkReporter = new
		  ExtentSparkReporter(System.getProperty("user.dir")+File.separator+"reports"+File.separator+"ExtentReport.html");
		  
		  extent = new ExtentReports(); 
		  extent.attachReporter(sparkReporter);
		  sparkReporter.config().setTheme(Theme.DARK);
		  
		  extent.setSystemInfo("HostName","DESKTOP-57QL2OO");
		  extent.setSystemInfo("UserName",System.getProperty("user.name"));
		  
		  sparkReporter.config().setDocumentTitle("Automation Report");
		  sparkReporter.config().setReportName("Automation test result by Rahul");
		  
		  logger=extent.createTest("TestCase1");
		 
	}

	@BeforeMethod
	@Parameters("browser")
	public void beforeMethodMethod(String browser) {
		setupDriver(browser);

		driver.manage().window().maximize();
		driver.get(com.numadic.utils.Constants.url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

	}

	@AfterMethod
	public void afterMethodMethod(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) 
		{
		logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName() +" - Test Case Failed",ExtentColor.RED)); 
		logger.log(Status.FAIL,MarkupHelper.createLabel(result.getThrowable() +" - Test Case Failed",ExtentColor.RED)); 
			} 
		else if(result.getStatus() ==ITestResult.SKIP) 
		{ 
			logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName() +" - Test Case Skipped",ExtentColor.ORANGE)); 
			} 
		else if(result.getStatus() ==ITestResult.SUCCESS) 
		{ 
			logger.log(Status.PASS,MarkupHelper.createLabel(result.getName() +" - Test Case Passed",ExtentColor.GREEN)); 
			
		}
		 	

		driver.quit();
	}

	@AfterTest
	public void afterTestMethod() {
		extent.flush();
	}

	public void setupDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		//	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);

		}else if(browser.equalsIgnoreCase("firefox")) {
		//	WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}else if(browser.equalsIgnoreCase("edge")) {
		//	WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

	}


}


