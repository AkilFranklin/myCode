package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lesson_55_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Frames
		// Frames are a kind of HTML Document embedded on another HTML doc
		// this is needed because a frame on a page has its own set of elements
		//    that need to be identified. 
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		// this code fails 
		System.out.print(driver.getPageSource());
		driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("1000");
			
		// how to identify frames
		// take the page source of the site
		// in order for a dev to write code for frames on a page you look for either
		// Iframe
		// - If it is an iframe
		// - info will be iframe id = *random alphanum*
		
		// Frameset
		// - If it is a frameset you will see a *framename*.html file in the source code
		// - No ids given
		// - Either way a manual check is needed
		
		/*driver.switchTo().frame(1); // frame # is chosen by order on the page
		driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("1000");
		*/
		System.out.print(driver.getPageSource());
		//System.out.print(driver.getPageSource());
		
		
		
		
		
		
		
		
		
	}

}
