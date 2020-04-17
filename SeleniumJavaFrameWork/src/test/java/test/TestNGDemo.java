package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	
	WebDriver driver=null;
	
	
	@BeforeTest
	
	
	public void setUpTest() {
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void youtubeSearch() {
	
		driver.get("https://youtube.com/");
		
		driver.findElement(By.id("search")).sendKeys("Automation step by step");
		
		//driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("test1 success");
	}
	
}
