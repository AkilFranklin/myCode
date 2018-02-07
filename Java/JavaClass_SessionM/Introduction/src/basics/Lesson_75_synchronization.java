package basics;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Lesson_75_synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxProfile prof= new FirefoxProfile(); // explanation below
		prof.setAcceptUntrustedCertificates(false);
		//now pass this 'prof' into the firefox driver below
		
		WebDriver driver = new FirefoxDriver(prof);
		
		//Implicit wait will continue if the link is finished displaying
		Timeouts fivesecs=driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		Timeouts tensecs=driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.get("http://ebay.com");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(5000L); // this is an explicit wait, this will continue ONLY after the time is completed
		// rest of code();
		//5sec
		//click();
		// this would cause performance issues
		
		//Other .manage() things
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//HTTP Certification error handling. sometimes you get that untrusted connection error
		// the profile part above initializing the driver
		
		
		//if firefox is not invoking
		
		File ffpath = new File("path/to/firefox.exe"); 
		FirefoxBinary ffbinary = new FirefoxBinary(ffpath);
		FirefoxProfile ffprofile = new FirefoxProfile();
		driver = new FirefoxDriver(ffbinary,ffprofile);
	
	}

}
