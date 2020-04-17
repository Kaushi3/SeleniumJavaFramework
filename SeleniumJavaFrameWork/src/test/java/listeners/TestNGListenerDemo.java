package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




public class TestNGListenerDemo {

	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() throws Exception {
		System.out.println("Test 2");
	
		
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("automation");
		driver.findElement(By.xpath("//input[@id='searchqwe']")).sendKeys("automation");
		
		Thread.sleep(2000);
		driver.close();
		
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
		throw new SkipException("The test is skipped");
	}
	
}
