package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromedriver {
	public static void main(String[] args) {
		
		/*//this is how to initialize a chrome browser... IE is similar to this, need to point to the driver
		System.setProperty("webdriver.chrome.driver", "/Users/ajfranklin/Downloads/chromedriver"); // mandatory step needed to open Chrome. IE uses a similar line
		WebDriver gcdriver = new ChromeDriver();
		gcdriver.get("http://pornhub.com");
		gcdriver.close();
		*/
		
		/*// how to initialize a FF browser
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("\nhttp://qaclickacademy.com"); //will open a ff browser for the given url
		System.out.print(ffdriver.getTitle());     // will get the title of the page and print in console
		System.out.print(ffdriver.getPageSource());// will display the page source in the console
		System.out.print(ffdriver.getCurrentUrl());
		ffdriver.close();
		*/
		
		//how to intialize a Safari browser
		
	}

}
