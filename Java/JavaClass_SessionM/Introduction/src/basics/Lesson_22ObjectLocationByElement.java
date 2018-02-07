package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Lesson_22ObjectLocationByElement {
	public static void main(String[] args) {
		
		// how to initialize a FF browser
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("\nhttp://facebook.com"); //will open a ff browser for the given url
		

		//object locator techniques
		// will input text into an edit box, 3 different ways
		ffdriver.findElement(By.xpath(".//*[@id='email']")).sendKeys("username");
		ffdriver.findElement(By.name("pass")).sendKeys("password"); // uses name instead of xpath
		ffdriver.findElement(By.id("u_0_n")).click();
		
		// can also use linktext, can identify by spying on the object and looking for an 'a' at the beginning
		//ffdriver.findElement(By.linkText("Forgot your password?")).click();
		//or
		//ffdriver.findElement(By.partialLinkText("Forgot your")).click();
		//to find something where the text may change of the link. 
		//can still use the other locators above to find and click a link
		//ffdriver.close();
		
	}

}
