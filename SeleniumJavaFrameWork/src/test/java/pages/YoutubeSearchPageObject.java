package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class YoutubeSearchPageObject {
	
	WebDriver driver=null;
	
	By textbox_search =By.id("search");
	By button_search=By.id("search-icon-legacy");
	
	public YoutubeSearchPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
