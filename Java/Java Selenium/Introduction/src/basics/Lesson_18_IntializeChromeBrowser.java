package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Lesson_18_IntializeChromeBrowser {
	public static void main(String[] args) {
		
		//this is how to initialize a chrome browser... IE is similar to this, need to point to the driver
		System.setProperty("webdriver.chrome.driver", "/Users/ajfranklin/Downloads/chromedriver"); // mandatory step needed to open Chrome. IE uses a similar line
		WebDriver driver = new ChromeDriver();
		driver.get("http://pornhub.com");
		driver.close();
		
	}

}
