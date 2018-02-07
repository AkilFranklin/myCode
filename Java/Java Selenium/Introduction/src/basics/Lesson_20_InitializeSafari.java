package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Lesson_20_InitializeSafari {
	public static void main(String[] args) {
		
		//how to intialize a Safari browser
		
		WebDriver safaridriver = new SafariDriver();
		safaridriver.get("http://facebook.com");
		safaridriver.close();	
		
	}

}
