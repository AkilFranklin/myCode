package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lesson_30_CSS_Selector_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Finding by CSS is 10 times faster than xpath
		// The class under the class can be identified by CSS ONLY
		// Lesson 31
		
			
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id = 'username']")).sendKeys("jijio");
		
		driver.findElement(By.cssSelector("input[id ='password']")).sendKeys("fewwefew");
		driver.findElement(By.xpath("//button[@id = 'Login']")).click();
		// or
		driver.findElement(By.cssSelector("#Login")).click();
		
		/*
		 * 
		 * 
		CSS = [class ='identity first']
		
		xpath = //*[@class = 'identity first']
		 
		 #id also works
		 
		 // if there is a space in the class name, replace with a dot "."
		 .classname = (   )
		 
		 1) Verify in Firebug to make sure the element code is correct
		 2) css customized syntax
		 3) identify css compenents by
		  		#id
		  		.classname
		 4) find the unique attribute
		  		
		 
		 
		 *
		 *
		 */
		
		
	}

}
