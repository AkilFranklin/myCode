package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class browserinvocation {
	public static void main(String[] args) {
		
		/*//this is how to initialize a chrome browser... IE is similar to this, need to point to the driver
		System.setProperty("webdriver.chrome.driver", "/Users/ajfranklin/Downloads/chromedriver"); // mandatory step needed to open Chrome. IE uses a similar line
		WebDriver gcdriver = new ChromeDriver();
		gcdriver.get("http://pornhub.com");
		gcdriver.close();
		*/
		
		// how to initialize a FF browser
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("\nhttp://facebook.com"); //will open a ff browser for the given url
		
		// customized xpath (this is what should be typically done. get into this habit)
		ffdriver.findElement(By.xpath("//input[@name='email']")).sendKeys("bitchesbetripping");
		ffdriver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		//System.out.print(ffdriver.getTitle());     // will get the title of the page and print in console

		// will display the page source in the console
		//System.out.print(ffdriver.getPageSource());
		
		// will print the 
		//System.out.print(ffdriver.getCurrentUrl());
		
		// will click a button using xpath at the above url
		//ffdriver.findElement(By.xpath(".//*[@id='search']/div[2]/div/div/form/button")).click();
		
		
		//object locator techniques
		// will input text into an edit box, 3 different ways
		//ffdriver.findElement(By.xpath(".//*[@id='email']")).sendKeys("username");
		//ffdriver.findElement(By.name("pass")).sendKeys("password"); // uses name instead of xpath
		//ffdriver.findElement(By.id("u_0_n")).click();
		
		// can also use linktext, can i dentify by spying on the object and looking for an 'a' at the beginning
		//ffdriver.findElement(By.linkText("Forgot your password?")).click();
		//or
		//ffdriver.findElement(By.partialLinkText("Forgot your")).click();
		//to find something where the text may change of the link. can still use the other locators above to find and click a link
		//ffdriver.close();
		
		
		/*//how to intialize a Safari browser
		WebDriver safaridriver = new SafariDriver();
		safaridriver.get("http://facebook.com");
		safaridriver.close();
		*/
		
		
	}

}
