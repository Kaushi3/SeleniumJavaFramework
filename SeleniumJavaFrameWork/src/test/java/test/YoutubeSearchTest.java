package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.YoutubeSearchPage;

public class YoutubeSearchTest {

	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		
		youtubeSearch();
	}
	
	public static void youtubeSearch() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"/drivers/chromedriver/chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://youtube.com/");
		
		//driver.findElement(By.id("search")).sendKeys("Automation step by step");
		
		YoutubeSearchPage.textbox_search(driver).sendKeys("Automation");
		
		//driver.findElement(By.id("search-icon-legacy")).click();
		//driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.RETURN);
		YoutubeSearchPage.button_search(driver).click();
		
		System.out.println("test1 success");
	}
	
}
