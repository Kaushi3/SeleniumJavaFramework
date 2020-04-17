package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_youtube {

	public static void main(String[] args) {
		
		
		youtubeSearch();
	}
	
	public static void youtubeSearch() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://youtube.com/");
		
		driver.findElement(By.id("search")).sendKeys("Automation step by step");
		
		//driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.RETURN);
		System.out.println("test1 success");
	}

	
}
