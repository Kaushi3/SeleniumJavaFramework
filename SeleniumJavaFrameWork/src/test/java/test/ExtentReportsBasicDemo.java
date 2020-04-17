package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {

	private static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1=extent.createTest("Youtube Search Test 1","this is a test to validate youtube search functionality");
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		
		test1.log(Status.INFO, "starting test case");
		driver.get("https://youtube.com/");
		test1.pass("Navigated to youtube");
		
		driver.findElement(By.id("search")).sendKeys("automation");;
		test1.pass("Entered text in searchbox");
		
		driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.RETURN);
		test1.pass("pressed keyboard enterkey");
		
		
		ExtentTest test2=extent.createTest("Youtube Search Test 2","this is a test to validate youtube search functionality");
		
		System.setProperty("webdriver.chrome.driver",  projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		
		test2.log(Status.INFO, "starting test case");
		driver.get("https://youtube.com/");
		test2.pass("Navigated to youtube");
		
		driver.findElement(By.id("search")).sendKeys("automation");;
		test2.pass("Entered text in searchbox");
		
		driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.RETURN);
		test2.fail("pressed keyboard enterkey");
		
		driver.close();
		driver.quit();
		test1.pass("closed browser");
		
		test2.info("test2 completed");
		extent.flush();
	}

}
