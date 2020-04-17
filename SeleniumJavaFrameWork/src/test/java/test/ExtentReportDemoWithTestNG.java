package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		
		htmlReporter= new ExtentHtmlReporter("extent.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);	
	}


	@BeforeTest
	public void setUpTest() {

		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();

	}

	@Test
	public void test1() throws Exception {
		ExtentTest test1=extent.createTest("Youtube Search Test 1","this is a test to validate youtube search functionality");

		driver.get("https://youtube.com/");
		test1.pass("navigated");
		//short hand
		// extent.createTest("test1").pass("navigated");
		
		test1.log(Status.INFO, "usage log1");
		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot1.png").build());
		test1.info("usage info1");
		test1.addScreenCaptureFromPath("screenshot1.png");
	//	test1.addScreenCaptureFromBase64String("screenshot1.png");
	}

	@Test
	public void test2() throws Exception {
		ExtentTest test2=extent.createTest("Youtube Search Test 2","this is a test to validate youtube search functionality");
		test2.log(Status.INFO, "usage log2");
		test2.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot1.png").build());
		test2.info("usage info1");
		test2.addScreenCaptureFromPath("screenshot1.png");
	}

	@AfterTest
	public void tearDownTest() {
		//close browser
		driver.close();
		driver.quit();
		System.out.println("test success");
	}

	@AfterSuite
	public void teardDown() {
		extent.flush();
	}
}
