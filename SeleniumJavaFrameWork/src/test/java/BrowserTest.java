

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	String projectPath=System.getProperty("user.dir");
	System.out.println("Project path: "+projectPath);

	//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	
	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://youtube.com/");
	
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("automation");
	
	List <WebElement> listOfInput= driver.findElements(By.xpath("//input"));
	
	int count = listOfInput.size();
	
	System.out.println("count of input elements = "+count);
	//WebElement textBox=  driver.findElement(By.id("search"));
	//textBox.sendKeys("automation");
	
	Thread.sleep(3000);
	driver.close();
}
}
