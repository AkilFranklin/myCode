package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GetTitlePrintInConsole {
	public static void main(String[] args) {
		
		// how to initialize a FF browser
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("\nhttp://facebook.com"); //will open a ff browser for the given url
		
		// will get the title of the page and print in console
		System.out.print(ffdriver.getTitle());     
		
		
	}

}
