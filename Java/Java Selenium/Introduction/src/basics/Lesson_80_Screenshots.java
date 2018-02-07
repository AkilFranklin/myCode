package basics;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;

public class Lesson_80_Screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		Set<Cookie>abc = driver.manage().getCookies();
		System.out.println(abc.size());
		
		driver.manage().deleteAllCookies();
		abc = driver.manage().getCookies();
		
		System.out.println(abc.size());
		
		// take the screen shot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		//FileUtils.copyFile(scrFile, new File("/Users/ajfranklin/Documents/Screenshots"));
			
	}

}
