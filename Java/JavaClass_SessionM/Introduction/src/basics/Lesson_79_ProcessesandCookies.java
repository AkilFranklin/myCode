package basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class Lesson_79_ProcessesandCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//WindowsUtils.tryToKillByName("Notes.app");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		Set<Cookie>abc = driver.manage().getCookies();
		System.out.println(abc.size());
		
		driver.manage().deleteAllCookies();
		abc = driver.manage().getCookies();
		
		System.out.println(abc.size());
		driver.close();
		
		
	}

}
