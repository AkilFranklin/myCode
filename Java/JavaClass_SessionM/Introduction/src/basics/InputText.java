package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class InputText {
	public static void main(String[] args) {

		// how to initialize a FF browser
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("\nhttp://facebook.com"); //will open a ff browser for the given url
		
		// customized xpath (this is what should be typically done. get into this habit)
		ffdriver.findElement(By.xpath("//input[@name='email']")).sendKeys("bitchesbetripping");
		ffdriver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}

}
