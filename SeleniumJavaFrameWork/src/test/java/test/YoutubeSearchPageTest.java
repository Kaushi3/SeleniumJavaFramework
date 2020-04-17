package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.YoutubeSearchPageObject;

public class YoutubeSearchPageTest {
 
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
	
		youtubeSearchTest();
}
	
	public static void youtubeSearchTest() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		
		YoutubeSearchPageObject searchPageObj= new YoutubeSearchPageObject(driver);
		
		driver.get("https://youtube.com/");
		
		searchPageObj.setTextInSearchBox("a b c d");
		
		searchPageObj.clickSearchButton();
		
		driver.close();
	}
	
}
